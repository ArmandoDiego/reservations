package com.diego.reservations.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.diego.reservations.data.entity.Guest;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

	Guest findAllById(long guestId);
//	Guest findOne(long id);
//	T findOne(long primaryKey);

}