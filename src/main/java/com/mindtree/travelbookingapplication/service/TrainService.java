package com.mindtree.travelbookingapplication.service;

import java.util.List;
import java.util.Map;

import com.mindtree.travelbookingapplication.dto.SearchTrainDTO;
import com.mindtree.travelbookingapplication.entity.Train;

public interface TrainService {

	List<Train> getAllTrains();

	Map<String, List<Train>> getTrains(SearchTrainDTO searchTrainDTO);

	Map<String, List<Train>> getTrains();

	Train getTrains(Long trainId);

}
