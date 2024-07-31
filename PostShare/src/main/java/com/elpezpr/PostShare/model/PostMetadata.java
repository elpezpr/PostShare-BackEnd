package com.elpezpr.PostShare.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Embeddable
@Data
@NoArgsConstructor
public class PostMetadata {
    private LocalDateTime createdDate;
    private String summary;
}