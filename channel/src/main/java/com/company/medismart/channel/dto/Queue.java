package com.company.medismart.channel.dto;

import java.util.Date;
import java.util.List;

public class Queue {

    private Long queueId;
    private String doctorUserId;
    private Date currentDate;
    private List<QueuePatient> patients;
    private QueueStatus status;

    public Long getQueueId() {
        return queueId;
    }

    public void setQueueId(Long queueId) {
        this.queueId = queueId;
    }

    public String getDoctorUserId() {
        return doctorUserId;
    }

    public void setDoctorUserId(String doctorUserId) {
        this.doctorUserId = doctorUserId;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public List<QueuePatient> getPatients() {
        return patients;
    }

    public void setPatients(List<QueuePatient> patients) {
        this.patients = patients;
    }

    public QueueStatus getStatus() {
        return status;
    }

    public void setStatus(QueueStatus status) {
        this.status = status;
    }
}
