package com.example.tourdestination.domain.request;

import com.example.tourdestination.domain.entity.TourDestination;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TourDestinationRequest {
    private String tourDestinationName; //관광지이름
    private String tourDestinationLocation; //관광지위치
    private String tourDestinationContent; //관광지정보 키워드 주제 등
    private String tourDestinationContentDetail; //관광지정보 키워드 주제 등
    private String tourDestinationNumber; //관광지 번호
    private String tourDestinationTime; //관광지 이용시간
    private String tourDestinationPicture; //관광지 사진
    private String tourDestinationType; //관광지 사진
    private Integer tourDestinationPay; //관광지 가격
    public TourDestination toEntity()
    {
        return TourDestination
                .builder()
                .tourDestinationPicture(tourDestinationPicture)
                .tourDestinationContent(tourDestinationContent)
                .tourDestinationNumber(tourDestinationNumber)
                .tourDestinationLocation(tourDestinationLocation)
                .tourDestinationTime(tourDestinationTime)
                .tourDestinationName(tourDestinationName)
                .tourDestinationType(tourDestinationType)
                .tourDestinationContentDetail(tourDestinationContentDetail)
                .tourDestinationPay(tourDestinationPay)
                .build();
    }

}
