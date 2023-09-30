package com.example.SmartCity;


import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity, Long> {
    // Custom query methods can be added here
}
