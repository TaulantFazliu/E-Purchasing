package com.epurchasing.marketManagement.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feedback {
    private int feedbackId;
    private String feedbackName;
    private String feedbackForm;
    private String description;
}
