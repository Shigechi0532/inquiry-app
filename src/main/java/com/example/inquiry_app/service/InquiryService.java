package com.example.inquiry_app.service;

import com.example.inquiry_app.entity.Inquiry;
import com.example.inquiry_app.form.InquiryForm;
import com.example.inquiry_app.repository.InquiryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class InquiryService {

    private final InquiryRepository inquiryRepository;

    public InquiryService(InquiryRepository inquiryRepository) {
        this.inquiryRepository = inquiryRepository;
    }

    public void save(InquiryForm inquiryForm) {
        Inquiry inquiry = new Inquiry();
        inquiry.setName(inquiryForm.getName());
        inquiry.setEmail(inquiryForm.getEmail());
        inquiry.setContent(inquiryForm.getContent());
        inquiry.setCreated(LocalDateTime.now());

        // データベースへ保存
        inquiryRepository.save(inquiry);
    }
}
