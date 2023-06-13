package com.braintreepayments.api;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.braintreepayments.api.models.ThreeDSecureLookup;
import com.cardinalcommerce.cardinalmobilesdk.Cardinal;
import com.cardinalcommerce.cardinalmobilesdk.services.CardinalValidateReceiver;
/* loaded from: classes2.dex */
public class ThreeDSecureActivity extends AppCompatActivity implements CardinalValidateReceiver {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        ThreeDSecureLookup threeDSecureLookup = (ThreeDSecureLookup) extras.getParcelable("com.braintreepayments.api.ThreeDSecureActivity.EXTRA_THREE_D_SECURE_LOOKUP");
        Cardinal.getInstance().cca_continue(threeDSecureLookup.m53288c(), threeDSecureLookup.m53289b(), this, this);
    }
}
