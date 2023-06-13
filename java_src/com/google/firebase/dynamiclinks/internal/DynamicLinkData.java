package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "DynamicLinkDataCreator")
/* loaded from: classes6.dex */
public class DynamicLinkData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DynamicLinkData> CREATOR = new C51432x81();
    @SafeParcelable.Field(getter = "getDynamicLink", m51606id = 1)

    /* renamed from: b */
    public String f74256b;
    @SafeParcelable.Field(getter = "getDeepLink", m51606id = 2)

    /* renamed from: c */
    public String f74257c;
    @SafeParcelable.Field(getter = "getMinVersion", m51606id = 3)

    /* renamed from: d */
    public int f74258d;
    @SafeParcelable.Field(getter = "getClickTimestamp", m51606id = 4)

    /* renamed from: e */
    public long f74259e;
    @SafeParcelable.Field(getter = "getExtensionBundle", m51606id = 5)

    /* renamed from: f */
    public Bundle f74260f;
    @SafeParcelable.Field(getter = "getRedirectUrl", m51606id = 6)

    /* renamed from: g */
    public Uri f74261g;

    @SafeParcelable.Constructor
    public DynamicLinkData(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) int i, @SafeParcelable.Param(m51605id = 4) long j, @SafeParcelable.Param(m51605id = 5) Bundle bundle, @SafeParcelable.Param(m51605id = 6) Uri uri) {
        this.f74256b = str;
        this.f74257c = str2;
        this.f74258d = i;
        this.f74259e = j;
        this.f74260f = bundle;
        this.f74261g = uri;
    }

    /* renamed from: E */
    public Bundle m47306E() {
        Bundle bundle = this.f74260f;
        return bundle == null ? new Bundle() : bundle;
    }

    /* renamed from: F */
    public int m47305F() {
        return this.f74258d;
    }

    /* renamed from: K */
    public Uri m47304K() {
        return this.f74261g;
    }

    /* renamed from: L */
    public void m47303L(long j) {
        this.f74259e = j;
    }

    /* renamed from: s */
    public long m47302s() {
        return this.f74259e;
    }

    /* renamed from: u */
    public String m47301u() {
        return this.f74257c;
    }

    /* renamed from: v */
    public String m47300v() {
        return this.f74256b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C51432x81.m5820c(this, parcel, i);
    }
}
