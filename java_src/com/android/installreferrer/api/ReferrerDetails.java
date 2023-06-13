package com.android.installreferrer.api;

import android.os.Bundle;
/* loaded from: classes4.dex */
public class ReferrerDetails {

    /* renamed from: a */
    public final Bundle f68610a;

    public ReferrerDetails(Bundle bundle) {
        this.f68610a = bundle;
    }

    /* renamed from: a */
    public String m53507a() {
        return this.f68610a.getString("install_referrer");
    }
}
