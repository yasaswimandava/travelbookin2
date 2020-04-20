package com.mindtree.travelbookingapplication.service.serviceimplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.travelbookingapplication.dto.SearchTrainDTO;
import com.mindtree.travelbookingapplication.entity.Days;
import com.mindtree.travelbookingapplication.entity.Train;
import com.mindtree.travelbookingapplication.repository.TrainRepository;
import com.mindtree.travelbookingapplication.service.TrainService;

@Service
public class TrainServiceImplementation implements TrainService {

	@Autowired
	TrainRepository trainRepository;
	
	@Override
	public List<Train> getAllTrains() {
		return trainRepository.findAll();
	}

	@Override
	public Map<String, List<Train>> getTrains(SearchTrainDTO searchTrainDTO) {
		List<Train> trains=trainRepository.findAll().stream().filter(e -> e.getSource().equalsIgnoreCase(searchTrainDTO.getSource())
				&& e.getDestination().equalsIgnoreCase(searchTrainDTO.getDestination())).collect(Collectors.toList());
			
		Map<String,List<Train>> trainlist=new HashMap<String,List<Train>>();
		for (Train t : trains) {
			for (Days d : t.getDays()) {
				if(trainlist.containsKey(d.getDayName()))
				{
					List<Train> train1=trainlist.get(d.getDayName());
					train1.add(t);
					trainlist.replace(d.getDayName(), train1);
				}
				else
				{
					List<Train> train1=new ArrayList<Train>();
					train1.add(t);
					trainlist.put(d.getDayName(), train1);
				}
			}
			
		}
		
		return trainlist;
	}


	@Override
	public Map<String, List<Train>> getTrains() {
		
		Map<String,List<Train>> trainlist=new HashMap<String,List<Train>>();
		for (Train t : trainRepository.findAll()) {
			String str=t.getSource()+"    "+t.getDestination();
			if(trainlist.containsKey(str))
			{
				List<Train> train1=trainlist.get(str);
				train1.add(t);
				trainlist.replace(str, train1);
			}
			else
			{
				List<Train> train1=new ArrayList<Train>();
				train1.add(t);
				trainlist.put(str, train1);
			}
		}
		return trainlist;
	}


	@Override
	public Train getTrains(Long trainId) {
		
		return trainRepository.findById(trainId).get();
	}

}
