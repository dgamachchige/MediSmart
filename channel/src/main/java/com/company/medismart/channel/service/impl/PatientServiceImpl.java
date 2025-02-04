package com.company.medismart.channel.service.impl;

import com.company.medismart.channel.adaptor.PatientAdaptor;
import com.company.medismart.channel.dao.PatientDao;
import com.company.medismart.channel.dto.Patient;
import com.company.medismart.channel.model.PatientModel;
import com.company.medismart.channel.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientDao patientDao;

    @Autowired
    private PatientAdaptor patientAdaptor;

    @Transactional
    @Override
    public void addPatient(Patient patient) {
        PatientModel patientModel = patientAdaptor.fromDto(patient);
        patientDao.save(patientModel);
    }

    @Override
    public boolean removePatient(String nic) {
        PatientModel patientModel = patientDao.getOne(nic);
        patientDao.delete(patientModel);
        return Boolean.TRUE;
    }

    @Override
    public Patient updatePatient(Patient patient, String currentNic) {
        PatientModel patientModel = patientDao.getOne(currentNic);
        PatientModel updatedPatient = patientAdaptor.fromDto(patient);
        updateModel(updatedPatient, patientModel);
        patientDao.save(patientModel);
        return patient;
    }

    @Override
    public Patient loadPatientByNic(String nic) {
        PatientModel patientModel = patientDao.getOne(nic);
        return patientAdaptor.fromModel(patientModel);
    }

    @Transactional
    @Override
    public Patient loadPatientByMobileNumber(String mobileNumber) {
        return null;
    }

    @Transactional
    @Override
    public List<Patient> loadAll() {
        List<PatientModel> patientModels = patientDao.findAll();
        return patientAdaptor.fromModelList(patientModels);
    }

    private void updateModel(PatientModel updatedPatient, PatientModel patientModel) {
        //update model
    }
}
