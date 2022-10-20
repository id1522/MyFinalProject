package com.example.myfinalproject.service;

import com.example.myfinalproject.entity.Country;
import java.util.List;

public interface CountryService {
    Country getCountryById(Long id);
    Country getCountryByName(String name);
    List<Country> getCountryList();
}
