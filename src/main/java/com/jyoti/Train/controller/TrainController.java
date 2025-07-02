package com.jyoti.Train.controller;

import com.jyoti.Train.entity.Train;
import com.jyoti.Train.repo.StationRepositoty;
import com.jyoti.Train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/train")
public class TrainController {

    private TrainService trainService; // when we have only one variable, there is no need to write @Autowired

    TrainController(TrainService trainService){

        this.trainService = trainService;

    }

    @GetMapping
    public List<Train> getAllTrains(){
        return trainService.getAllTrains();
    }

    @PostMapping
    public Train addTrain(@RequestBody Train train){

        return trainService.addTrain(train);

    }


}
