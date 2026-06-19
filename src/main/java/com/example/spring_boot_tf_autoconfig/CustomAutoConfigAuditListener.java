package com.example.spring_boot_tf_autoconfig;

import org.springframework.boot.autoconfigure.AutoConfigurationImportEvent;
import org.springframework.boot.autoconfigure.AutoConfigurationImportListener;

import java.util.List;

public class CustomAutoConfigAuditListener implements AutoConfigurationImportListener {

    @Override
    public void onAutoConfigurationImportEvent(AutoConfigurationImportEvent event) {
        List<String> importConfigs = event.getCandidateConfigurations();
        // Use importConfigs or event as required!
    }

}
