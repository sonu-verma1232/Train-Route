package com.jyoti.Train.repo;

import com.jyoti.Train.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepositoty extends JpaRepository<Station, Long> {



}
