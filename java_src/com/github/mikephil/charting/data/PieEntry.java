package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.util.Log;
@SuppressLint({"ParcelCreator"})
/* loaded from: classes5.dex */
public class PieEntry extends Entry {

    /* renamed from: f */
    public String f70118f;

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    /* renamed from: g */
    public float mo51930g() {
        Log.i("DEPRECATED", "Pie entries do not have x values");
        return super.mo51930g();
    }

    /* renamed from: h */
    public String m51931h() {
        return this.f70118f;
    }
}
