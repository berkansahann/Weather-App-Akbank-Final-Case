package com.berkansahan.weather.authentication.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author berkansahan
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class RegisterResponse {

    private int userId;
    private String token;
}