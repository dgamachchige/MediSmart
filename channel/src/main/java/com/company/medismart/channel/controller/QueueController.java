package com.company.medismart.channel.controller;

import com.company.medismart.channel.dto.Queue;
import com.company.medismart.channel.param.QueCreateParam;
import com.company.medismart.channel.service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/queue")
public class QueueController {

    @Autowired
    private QueueService queueService;

    private Queue createQue(QueCreateParam queCreateParam) {
        return queueService.createQue(queCreateParam.getDoctorUserId());
    }

}
