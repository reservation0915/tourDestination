package com.example.tourdestination.service;

import com.example.tourdestination.domain.entity.TourDestination;
import com.example.tourdestination.domain.request.TourDestinationReviewsRequest;
import com.example.tourdestination.repository.TourDestinationRepository;
import com.example.tourdestination.repository.TourDestinationReviewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TourDestinationReviewsService {
    private final TourDestinationRepository tourDestinationRepository;
    private final TourDestinationReviewsRepository tourDestinationReviewsRepository;
    public void save(TourDestinationReviewsRequest tourDestinationRequest)
    {

        Optional<TourDestination> isTour = tourDestinationRepository.findById(tourDestinationRequest.getTdId());
        TourDestination tourDestination = isTour.orElseThrow(()->new RuntimeException("찾는 tour가 없슴"));
        tourDestinationReviewsRepository.save(tourDestinationRequest.toEntity(tourDestination));
    }

}
