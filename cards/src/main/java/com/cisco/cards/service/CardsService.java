package com.cisco.cards.service;

import com.cisco.cards.dto.CardsDto;

public interface CardsService {
    void createCard(String mobileNumber);
    CardsDto fetchCard(String mobileNumber);
    boolean updateCard(CardsDto cardsDto);
    boolean deleteCard(String mobileNumber);
}
