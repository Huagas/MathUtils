package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "calculation_history")
public class MathRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "operation_name", nullable = false)
    private String operationName;

    @Column(name = "input_value")
    private int inputValue;

    @Column(name = "result_value")
    private long resultValue;

    public MathRecord() {
    }

    public MathRecord(String operationName, int inputValue, long resultValue) {
        this.operationName = operationName;
        this.inputValue = inputValue;
        this.resultValue = resultValue;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getOperationName() { return operationName; }
    public void setOperationName(String operationName) { this.operationName = operationName; }

    public int getInputValue() { return inputValue; }
    public void setInputValue(int inputValue) { this.inputValue = inputValue; }

    public long getResultValue() { return resultValue; }
    public void setResultValue(long resultValue) { this.resultValue = resultValue; }
}
