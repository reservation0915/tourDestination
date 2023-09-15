package com.example.tourdestination.controller;

import com.example.tourdestination.domain.entity.TourDestination;
import com.example.tourdestination.domain.request.TourDestinationRequest;
import com.example.tourdestination.service.TourDestinationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(methods = {RequestMethod.GET},allowCredentials = "true",originPatterns = "*")
@RestController
@RequestMapping("/api/v1/tourdestination")
@RequiredArgsConstructor
public class TourDestinationController {
    private final TourDestinationService tourDestinationService;
    @PostMapping
    public void save(@RequestBody TourDestinationRequest tourDestinationRequest)
    {
        tourDestinationService.save(tourDestinationRequest);
    }
    @GetMapping
    public List<TourDestination> getAll()
    {
        return tourDestinationService.getAll();
    }
    @GetMapping("/{id}")
    public TourDestination getById(@PathVariable("id")Long id)
    {
        return tourDestinationService.getById(id);
    }
    @GetMapping("/search/{name}")
    public List<TourDestination> getBySearch(@PathVariable("name")String name)
    {
        return tourDestinationService.getBySearch(name);
    }
    @GetMapping("/searchby/{type}")
    public List<TourDestination> getByType(@PathVariable("type") String type)
    {
        return tourDestinationService.getByType(type);
    }
    @GetMapping("/searchbypay/{pay}")
    public List<TourDestination> getByPay(@PathVariable("pay")Integer pay)
    {
        return tourDestinationService.getByPay(pay);
    }


}
