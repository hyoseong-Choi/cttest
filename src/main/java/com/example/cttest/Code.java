package com.example.cttest;


import lombok.Data;

import java.util.List;

@Data
public class Code {
    private Integer id;
    private List<Testcase> testcases;

}