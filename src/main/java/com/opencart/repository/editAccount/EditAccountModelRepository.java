package com.opencart.repository.editAccount;

import com.opencart.datamodel.editAccount.EditAccountModel;
import org.apache.commons.lang3.RandomStringUtils;

public class EditAccountModelRepository {

    private EditAccountModelRepository() {}

    public static EditAccountModel getEditAccountModel() {
        return EditAccountModel.builder()
                .firstName(RandomStringUtils.randomAlphabetic(10))
                .lastName(RandomStringUtils.randomAlphabetic(15))
                .email(RandomStringUtils.randomAlphabetic(10)+ "@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(10))
                .build();
    }
}
