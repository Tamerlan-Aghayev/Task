package com.example.demo.service;

import com.example.demo.client.AsanClient;
import com.example.demo.entity.*;
import com.example.demo.repository.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FullResponseService {
    private ContractStatusRepository contractStatusRepository;
    private AsanClient asanClient;
    private FullResponseRepository fullResponseRepository;
    private ActiveRepository activeRepository;
    private ActiveEmployeeRepository activeEmployeeRepository;
    private ContractRepository contractRepository;
    private DeactiveRepository deactiveRepository;
    private DeactiveEmployeeRepository deactiveEmployeeRepository;
    private EmployerRepository employerRepository;
    private InvalidationRepository invalidationRepository;
    private PeriodTypeRepository periodTypeRepository;
    private PropertyTypeRepository propertyTypeRepository;
    private ResponseRepository responseRepository;
    private StatusRepository statusRepository;
    private WorkCasualTypeRepository workCasualTypeRepository;
    private WorkPlaceTypeRepository workPlaceTypeRepository;
    @Value("${asan.api-key}")
    private String apiKey;
    public Response.Body addResponseToDB(String pin) throws Exception{
        String jsonData = asanClient.getData(pin, apiKey).body().toString();
        ObjectMapper objectMapper=new ObjectMapper();
        FullResponse fullResponse=objectMapper.readValue(jsonData, FullResponse.class);
        List<Active> actives=fullResponse.getResponse().getActive();
        List<Deactive> deactives=fullResponse.getResponse().getDeactive();
        if (!actives.isEmpty()){
            for(Active active: actives){
                ActiveEmployer employer=active.getEmployer();
                PropertyType propertyType=active.getEmployer().getPropertyType();
                ActiveEmployee employee=active.getEmployee();
                WorkPlaceType workPlaceType=active.getEmployee().getWorkPlaceType();
                WorkCasualType workCasualType=active.getEmployee().getWorkCasualType();
                ActiveContract contract=active.getContract();
                ContractStatus status=active.getContract().getStatus();
                PeriodType periodType=active.getContract().getPeriodType();
                Invalidation invalidation=active.getContract().getInvalidation();
                invalidationRepository.saveAndFlush(invalidation);
                periodTypeRepository.saveAndFlush(periodType);
                contractStatusRepository.saveAndFlush(status);
                propertyTypeRepository.saveAndFlush(propertyType);
                workCasualTypeRepository.saveAndFlush(workCasualType);
                workPlaceTypeRepository.saveAndFlush(workPlaceType);
                activeEmployeeRepository.saveAndFlush(employee);
                employerRepository.saveAndFlush(employer);
                contractRepository.saveAndFlush(contract);
            }
            activeRepository.saveAllAndFlush(actives);
        }
        if (!deactives.isEmpty()){
            for(Deactive deactive: deactives){
                DeactiveEmployer employer=deactive.getEmployer();
                DeactiveEmployee employee=deactive.getEmployee();

                DeactiveContract contract=deactive.getContract();


                deactiveEmployeeRepository.saveAndFlush(employee);
                employerRepository.saveAndFlush(employer);
                contractRepository.saveAndFlush(contract);
            }
            deactiveRepository.saveAllAndFlush(deactives);
        }
        return asanClient.getData(pin, apiKey).body();
    }
}
