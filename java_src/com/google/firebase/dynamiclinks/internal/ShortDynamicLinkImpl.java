package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
@SafeParcelable.Class(creator = "ShortDynamicLinkImplCreator")
/* loaded from: classes6.dex */
public final class ShortDynamicLinkImpl extends AbstractSafeParcelable implements InterfaceC36523Uz5 {
    public static final Parcelable.Creator<ShortDynamicLinkImpl> CREATOR = new C18340a();
    @SafeParcelable.Field(getter = "getShortLink", m51606id = 1)

    /* renamed from: b */
    public final Uri f74262b;
    @SafeParcelable.Field(getter = "getPreviewLink", m51606id = 2)

    /* renamed from: c */
    public final Uri f74263c;
    @SafeParcelable.Field(getter = "getWarnings", m51606id = 3)

    /* renamed from: d */
    public final List<WarningImpl> f74264d;

    @SafeParcelable.Class(creator = "WarningImplCreator")
    /* loaded from: classes6.dex */
    public static class WarningImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator<WarningImpl> CREATOR = new C18341b();
        @SafeParcelable.Field(getter = "getMessage", m51606id = 2)
        @SafeParcelable.Reserved({1})

        /* renamed from: b */
        public final String f74265b;

        @SafeParcelable.Constructor
        public WarningImpl(@SafeParcelable.Param(m51605id = 2) String str) {
            this.f74265b = str;
        }

        /* renamed from: s */
        public String m47295s() {
            return this.f74265b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            C18341b.m47289c(this, parcel, i);
        }
    }

    @SafeParcelable.Constructor
    public ShortDynamicLinkImpl(@SafeParcelable.Param(m51605id = 1) Uri uri, @SafeParcelable.Param(m51605id = 2) Uri uri2, @SafeParcelable.Param(m51605id = 3) List<WarningImpl> list) {
        this.f74262b = uri;
        this.f74263c = uri2;
        this.f74264d = list == null ? new ArrayList<>() : list;
    }

    @Override // p000.InterfaceC36523Uz5
    /* renamed from: b */
    public Uri mo47298b() {
        return this.f74262b;
    }

    /* renamed from: s */
    public Uri m47297s() {
        return this.f74263c;
    }

    /* renamed from: u */
    public List<WarningImpl> m47296u() {
        return this.f74264d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C18340a.m47292c(this, parcel, i);
    }
}
