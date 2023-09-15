package com.example.tourdestination.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity

@Table(name = "tourdestinations")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class TourDestination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tourDestinationName; //관광지이름
    private String tourDestinationType; //관광지타입
    private String tourDestinationLocation; //관광지위치
    private String tourDestinationContent; //관광지정보 키워드 주제 등
    private String tourDestinationContentDetail; //관광지 세부 내용
    private String tourDestinationNumber; //관광지 번호
    private String tourDestinationTime; //관광지 이용시간
    @Column (length = 10000)
    private String tourDestinationPicture; //관광지 사진
    private Integer tourDestinationPay; //관광지 가격 (무료 or 유료)
}
