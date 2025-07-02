package com.jyoti.Train.service;

import com.jyoti.Train.entity.Train;
import com.jyoti.Train.repo.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    private TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository){
        this.trainRepository = trainRepository;
    }

    public List<Train> getAllTrains() {

        return  trainRepository.findAll();

    }

    public Train addTrain(Train train) {

        return trainRepository.save(train);

    }
}
