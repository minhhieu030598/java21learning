package org.minhhieu.service.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Transaction {
    private Long id;
    private String status;
}
