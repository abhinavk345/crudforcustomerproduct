package com.abhi.crud.dto;

import lombok.*;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Setter
@Getter
public class ResponseDto {

    private String cname;
    private String pname;
}
