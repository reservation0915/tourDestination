package com.example.tourdestination.controller;

import com.example.tourdestination.domain.request.TourDestinationReviewsRequest;
import com.example.tourdestination.service.TourDestinationReviewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tourdestinaionreviews")
@RequiredArgsConstructor
public class TourDestinationReviewsController {
    private final TourDestinationReviewsService tourDestinationReviewsService;
    @PostMapping
    public void save(@RequestBody TourDestinationReviewsRequest tourDestinationReviewsRequest)
    {
        tourDestinationReviewsService.save(tourDestinationReviewsRequest);
    }
}
