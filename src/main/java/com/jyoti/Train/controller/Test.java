package com.jyoti.Train.controller;

import com.jyoti.Train.entity.Station;
import com.jyoti.Train.entity.Train;
import com.jyoti.Train.entity.TrainSchedule;
import com.jyoti.Train.repo.StationRepositoty;
import com.jyoti.Train.repo.TrainRepository;
import com.jyoti.Train.repo.TrainScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class Test {

    @Autowired
    private StationRepositoty stationRepositoty;

    @Autowired
    TrainRepository trainRepository;

    @Autowired
    TrainScheduleRepository trainScheduleRepository;


    @GetMapping
    public void test(){

        Station delhi = new Station(null,"New Delhi", "NDLS");
        Station mumbai = new Station(null,"Mumbai Central", "CST");
        Station kolkata = new Station(null,"Kolkata", "KOAA");
        Station chennai = new Station(null,"Chennai Central", "MAS");

        stationRepositoty.saveAll(List.of(delhi,mumbai,kolkata,chennai));

        Train rajdhani = new Train(null,"Rajdhani Express",null,"12306");
        Train durunto = new Train(null,"Durunto Express",null,"12260");
        Train shatabdi = new Train(null,"Shatabdi Express",null,"12456");

        trainRepository.saveAll(List.of(rajdhani,durunto,shatabdi));

        TrainSchedule sc1 = new TrainSchedule(null,rajdhani,delhi,mumbai,"06:00","14:00");
        TrainSchedule sc2 = new TrainSchedule(null,durunto,mumbai,kolkata,"08:00","21:00");
        TrainSchedule sc3 = new TrainSchedule(null,shatabdi,kolkata,chennai,"11:00","19:00");

        trainScheduleRepository.saveAll(List.of(sc1,sc2,sc3));

        System.out.println("Data inserte in database successfully !! ");

    }

}
