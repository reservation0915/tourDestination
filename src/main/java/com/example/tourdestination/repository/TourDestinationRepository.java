package com.example.tourdestination.repository;

import com.example.tourdestination.domain.entity.TourDestination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TourDestinationRepository extends JpaRepository<TourDestination, Long> {


    @Query("select h from TourDestination as h where h.tourDestinationName=:name")
    List<TourDestination>findByName(String name);

    @Query("select l from TourDestination as l where l.tourDestinationLocation=:location")
    List<TourDestination> findByLocation(String location);

    @Query("select t from TourDestination as t where t.id=:id")
    Optional<TourDestination> findById(Long id);

    List<TourDestination> findByTourDestinationNameContaining(String name);

    @Query("select t from TourDestination as t where t.tourDestinationType=:type")
    List<TourDestination> findByType(String type);

    List<TourDestination> findByTourDestinationPayGreaterThan(Integer pay);
    List<TourDestination> findByTourDestinationPayLessThanEqual(Integer pay);
}
