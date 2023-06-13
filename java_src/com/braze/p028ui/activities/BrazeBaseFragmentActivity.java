package com.braze.p028ui.activities;

import androidx.fragment.app.FragmentActivity;
/* renamed from: com.braze.ui.activities.BrazeBaseFragmentActivity */
/* loaded from: classes2.dex */
public class BrazeBaseFragmentActivity extends FragmentActivity {
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C42478i20.m35358s().m35367A(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C42478i20.m35358s().m35353x(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        P10.getInstance(this).openSession(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        P10.getInstance(this).closeSession(this);
    }
}
