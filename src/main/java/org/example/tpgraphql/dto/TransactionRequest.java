package org.example.tpgraphql.dto;

import lombok.Data;
import org.example.tpgraphql.entity.TypeTransaction;

import java.util.Date;

@Data
public class TransactionRequest {
    private Long compteId;
    private double montant;
    private Date date;
    private TypeTransaction type;
}
