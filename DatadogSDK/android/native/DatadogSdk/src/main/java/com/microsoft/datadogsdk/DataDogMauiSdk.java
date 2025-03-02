package com.microsoft.datadogsdk;

import android.content.Context;

import com.datadog.android.Datadog;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.ndk.NdkCrashReports;
import com.datadog.android.privacy.TrackingConsent;
import com.datadog.android.rum.Rum;
import com.datadog.android.rum.RumConfiguration;

public class DataDogMauiSdk {
    public static void init(Context context, String clientToken, String envName, String appVariantName) {
        Configuration configuration = new Configuration.Builder(clientToken, envName, appVariantName).build();
        Datadog.initialize(context, configuration, TrackingConsent.GRANTED);
    }

    public static void initRum(String applicationId) {
        RumConfiguration rumConfig = new RumConfiguration.Builder(applicationId)
                .trackUserInteractions()
                .trackLongTasks()
                .build();
        Rum.enable(rumConfig);
    }

    public static void initNdkCrashReports() {
        NdkCrashReports.enable();
    }
}
