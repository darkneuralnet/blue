package com.appboy.p027ui.activities;

import android.app.Activity;
@Deprecated
/* renamed from: com.appboy.ui.activities.AppboyBaseActivity */
/* loaded from: classes.dex */
public class AppboyBaseActivity extends Activity {
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        C42478i20.m35358s().m35367A(this);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        C42478i20.m35358s().m35353x(this);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        P10.getInstance(this).openSession(this);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        P10.getInstance(this).closeSession(this);
    }
}
