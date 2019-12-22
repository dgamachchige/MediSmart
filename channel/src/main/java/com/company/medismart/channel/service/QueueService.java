package com.company.medismart.channel.service;

import com.company.medismart.channel.dto.Queue;

public interface QueueService {
    Queue createQue(String doctorUserId);
    void inActiveQueue(Long queId);
    Integer addPatientToQueue(Long queId, String patientId);
}
