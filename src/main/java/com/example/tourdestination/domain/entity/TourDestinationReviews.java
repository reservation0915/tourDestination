package com.example.tourdestination.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tourdestinationreviews")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TourDestinationReviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private TourDestination tourDestination;
    private String reviewContent;
    private String reviewTitle;
    private String name;
    private String password;

}
