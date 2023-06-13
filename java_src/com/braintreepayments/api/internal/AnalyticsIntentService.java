package com.braintreepayments.api.internal;

import android.app.IntentService;
import android.content.Intent;
import com.braintreepayments.api.exceptions.InvalidArgumentException;
import com.braintreepayments.api.models.Authorization;
import org.json.JSONException;
/* loaded from: classes2.dex */
public class AnalyticsIntentService extends IntentService {
    public AnalyticsIntentService() {
        super(AnalyticsIntentService.class.getSimpleName());
        setIntentRedelivery(true);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            Authorization m53398a = Authorization.m53398a(intent.getStringExtra("com.braintreepayments.api.internal.AnalyticsIntentService.EXTRA_AUTHORIZATION"));
            C8678Va.m79739d(this, m53398a, new K10(m53398a), C40650ex0.m42371a(intent.getStringExtra("com.braintreepayments.api.internal.AnalyticsIntentService.EXTRA_CONFIGURATION")).m42370b().m71212b(), true);
        } catch (InvalidArgumentException | JSONException unused) {
        }
    }
}
