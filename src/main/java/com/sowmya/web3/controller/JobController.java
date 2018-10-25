package com.sowmya.web3.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sowmya.web3.dao.JobDao;

import com.sowmya.web3.model.Job;

@RestController

public class JobController 
{
@Autowired
JobDao jobdao;
@PostMapping("/applyjob")
public ResponseEntity<Job> applyJob(@RequestBody Job job)
{
    System.out.println("Control at job Controller ");
    String random_id = UUID.randomUUID().toString();
    job.setJobId(random_id);
    jobdao.apply_job(job);
    
    return new ResponseEntity<Job>(job,HttpStatus.OK);
}

}
