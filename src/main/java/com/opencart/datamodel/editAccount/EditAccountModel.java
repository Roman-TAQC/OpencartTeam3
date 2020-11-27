package com.opencart.datamodel.editAccount;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class EditAccountModel {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
}
