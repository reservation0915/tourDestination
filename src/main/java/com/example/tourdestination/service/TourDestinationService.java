package com.example.tourdestination.service;

import com.example.tourdestination.domain.entity.TourDestination;
import com.example.tourdestination.domain.request.TourDestinationRequest;
import com.example.tourdestination.repository.TourDestinationRepository;
import com.example.tourdestination.repository.TourDestinationReviewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TourDestinationService {
    private final TourDestinationRepository tourDestinationRepository;
    private final TourDestinationReviewsRepository tourDestinationReviewsRepository;
    public void save(TourDestinationRequest tourDestinationRequest)
    {
        tourDestinationRepository.save(tourDestinationRequest.toEntity());
    }
    public List<TourDestination> getAll()
    {
        List<TourDestination> tourDestinations = tourDestinationRepository.findAll();
        return tourDestinations;
    }
    public TourDestination getById(Long id)
    {
        Optional<TourDestination> optionalTourDestination = tourDestinationRepository.findById(id);
        TourDestination tourDestination=optionalTourDestination.orElseThrow(()->new RuntimeException("없어요"));
//        List<TourDestinationReviews> tourDestinationReviewsList = tourDestinationReviewsRepository.findBytdId(id);
//        TourDestinationResponse tourDestinationResponse = new TourDestinationResponse(tourDestination,tourDestinationReviewsList);
        return tourDestination;
    }
    public List<TourDestination> getBySearch(String name)
    {
        List<TourDestination> tourDestinationList=tourDestinationRepository.findByTourDestinationNameContaining(name);
        return tourDestinationList;
    }
    public List<TourDestination> getByType(String type)
    {
        List<TourDestination> tourDestinationList  = tourDestinationRepository.findByType(type);
        return tourDestinationList;
    }
    public List<TourDestination> getByPay(Integer pay)
    {
        if(pay>0)
        {
            List<TourDestination> tourDestinations = tourDestinationRepository.findByTourDestinationPayGreaterThan(0);
            return tourDestinations;
        }
        else {
            List<TourDestination> tourDestinations = tourDestinationRepository.findByTourDestinationPayLessThanEqual(0);
            return tourDestinations;
        }

    }

}
