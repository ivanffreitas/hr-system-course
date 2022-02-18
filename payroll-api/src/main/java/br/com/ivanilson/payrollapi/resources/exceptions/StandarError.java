package br.com.ivanilson.payrollapi.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class StandarError {

    private LocalDateTime timastamp;
    private String error;
    private Integer status;
    private String path;
}
