package com.hakancevik.travelbook.roomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.hakancevik.travelbook.model.Place;

import java.util.List;

@Dao
public interface PlaceDao {

    @Query("SELECT * FROM Place")
    List<Place> getAll();

    @Insert
    void insert(Place place);

    @Delete
    void delete(Place place);
}
