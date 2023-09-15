package com.example.tourdestination.domain.response;

import com.example.tourdestination.domain.entity.TourDestination;
import com.example.tourdestination.domain.entity.TourDestinationReviews;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TourDestinationResponse {
    private String tourDestinationName; //관광지이름
    private String tourDestinationLocation; //관광지위치
    private String tourDestinationContent; //관광지정보 키워드 주제 등
    private String tourDestinationContentDetail; //관광지정보 키워드 주제 등
    private String tourDestinationNumber; //관광지 번호
    private String tourDestinationTime; //관광지 이용시간
    private String tourDestinationPicture; //관광지 사진
    private String tourDestinationType; //관광지 사진
    private Integer tourDestinationPay;
    private List<TourDestinationReviews> reviews;
    public TourDestinationResponse (TourDestination tourDestination, List<TourDestinationReviews> tourDestinationReviewsList)
    {
        this.tourDestinationContent=tourDestination.getTourDestinationContent();
        this.tourDestinationLocation=tourDestination.getTourDestinationLocation();
        this.tourDestinationPicture=tourDestination.getTourDestinationPicture();
        this.tourDestinationName=tourDestination.getTourDestinationName();
        this.tourDestinationTime=tourDestination.getTourDestinationTime();
        this.tourDestinationNumber=tourDestination.getTourDestinationNumber();
        this.tourDestinationContentDetail=tourDestination.getTourDestinationContentDetail();
        this.tourDestinationType=tourDestination.getTourDestinationType();
        this.tourDestinationPay=tourDestination.getTourDestinationPay();
        this.reviews = tourDestinationReviewsList;
    }
    public TourDestinationResponse (TourDestination tourDestination)
    {
        this.tourDestinationContent=tourDestination.getTourDestinationContent();
        this.tourDestinationLocation=tourDestination.getTourDestinationLocation();
        this.tourDestinationPicture=tourDestination.getTourDestinationPicture();
        this.tourDestinationName=tourDestination.getTourDestinationName();
        this.tourDestinationTime=tourDestination.getTourDestinationTime();
        this.tourDestinationNumber=tourDestination.getTourDestinationNumber();
        this.tourDestinationContentDetail=tourDestination.getTourDestinationContentDetail();
        this.tourDestinationType=tourDestination.getTourDestinationType();
        this.tourDestinationPay=tourDestination.getTourDestinationPay();
    }
}
