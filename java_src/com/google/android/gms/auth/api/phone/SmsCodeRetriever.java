package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
/* loaded from: classes5.dex */
public final class SmsCodeRetriever {
    public static final String EXTRA_SMS_CODE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE";
    public static final String EXTRA_SMS_CODE_LINE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE_LINE";
    public static final String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    public static final String SMS_CODE_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED";

    private SmsCodeRetriever() {
    }

    public static SmsCodeAutofillClient getAutofillClient(Activity activity) {
        return new Kl9(activity);
    }

    public static SmsCodeBrowserClient getBrowserClient(Activity activity) {
        return new Zt9(activity);
    }

    public static SmsCodeAutofillClient getAutofillClient(Context context) {
        return new Kl9(context);
    }

    public static SmsCodeBrowserClient getBrowserClient(Context context) {
        return new Zt9(context);
    }
}
