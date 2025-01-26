package com.accomodation.Ashram.service;

import com.accomodation.Ashram.model.FormData;
import com.accomodation.Ashram.repository.FormDataRepository;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {

    @Autowired
    private FormDataRepository formRepository;

    public void saveFormData(FormData formData) {
        formRepository.save(formData); 
    }

    @Autowired
    private FormDataRepository accommodationRepository;

    public List<FormData> getAllAccommodations() {
        return accommodationRepository.findAll();
    }

    public Optional<FormData> getAccommodationById(Long id) {
        return accommodationRepository.findById(id);
    }

    public FormData saveAccommodation(FormData accommodation) {
        return accommodationRepository.save(accommodation);
    }

    public void deleteAccommodation(Long id) {
        accommodationRepository.deleteById(id);
    }
}
