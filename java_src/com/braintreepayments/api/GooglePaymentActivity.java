package com.braintreepayments.api;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.wallet.PaymentDataRequest;
import p000.C35336Px6;
/* loaded from: classes2.dex */
public class GooglePaymentActivity extends AppCompatActivity {
    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(17432576, 17432577);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && bundle.getBoolean("com.braintreepayments.api.EXTRA_RECREATING")) {
            return;
        }
        C12186at.m65335c(C35336Px6.m89237a(this, new C35336Px6.C6596a.C6597a().m89234b(getIntent().getIntExtra("com.braintreepayments.api.EXTRA_ENVIRONMENT", 3)).m89235a()).m109034j((PaymentDataRequest) getIntent().getParcelableExtra("com.braintreepayments.api.EXTRA_PAYMENT_DATA_REQUEST")), this, 1);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.braintreepayments.api.EXTRA_RECREATING", true);
    }
}
