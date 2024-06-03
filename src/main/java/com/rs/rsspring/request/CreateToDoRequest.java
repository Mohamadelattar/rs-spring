package com.rs.rsspring.request;

import com.rs.rsspring.entity.Severity;
import lombok.Data;

@Data
public class CreateToDoRequest {
    private String title;
    private String description;
    private Severity severity;
}
