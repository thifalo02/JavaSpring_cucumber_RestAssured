package br.thiago.support.domain;
/**
 * This class is responsible to provide the object to deserialize or serialize body to requests
 *
 * @author Thiago Maciel
 * Date: 16/12/2022 13:21
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String name;
    private String email;
    private String gender;
    private String status;
}
