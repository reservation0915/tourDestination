package com.example.tourdestination.domain.request;

import com.example.tourdestination.domain.entity.TourDestination;
import com.example.tourdestination.domain.entity.TourDestinationReviews;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TourDestinationReviewsRequest {
    private Long tdId;
    private String reviewTitle;
    private String reviewContent;
    private String name;
    private String password;
    public TourDestinationReviews toEntity(TourDestination tourDestination)
    {
        return TourDestinationReviews
                .builder()
                .reviewTitle(reviewTitle)
                .reviewContent(reviewContent)
                .name(name)
                .password(password)
                .reviewContent(reviewContent)
                .tourDestination(tourDestination)
                .build();
    }
}
