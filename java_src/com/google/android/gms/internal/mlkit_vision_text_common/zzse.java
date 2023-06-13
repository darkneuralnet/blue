package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "TextLineParcelCreator")
/* loaded from: classes5.dex */
public final class zzse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzse> CREATOR = new C48880sp9();
    @SafeParcelable.Field(getter = "getText", m51606id = 1)

    /* renamed from: b */
    public final String f71017b;
    @SafeParcelable.Field(getter = "getBoundingBox", m51606id = 2)

    /* renamed from: c */
    public final Rect f71018c;
    @SafeParcelable.Field(getter = "getCornerPointList", m51606id = 3)

    /* renamed from: d */
    public final List f71019d;
    @SafeParcelable.Field(getter = "getRecognizedLanguage", m51606id = 4)

    /* renamed from: e */
    public final String f71020e;
    @SafeParcelable.Field(getter = "getTextElementList", m51606id = 5)

    /* renamed from: f */
    public final List f71021f;
    @SafeParcelable.Field(getter = "getConfidence", m51606id = 6)

    /* renamed from: g */
    public final float f71022g;
    @SafeParcelable.Field(getter = "getAngle", m51606id = 7)

    /* renamed from: h */
    public final float f71023h;

    @SafeParcelable.Constructor
    public zzse(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) Rect rect, @SafeParcelable.Param(m51605id = 3) List list, @SafeParcelable.Param(m51605id = 4) String str2, @SafeParcelable.Param(m51605id = 5) List list2, @SafeParcelable.Param(m51605id = 6) float f, @SafeParcelable.Param(m51605id = 7) float f2) {
        this.f71017b = str;
        this.f71018c = rect;
        this.f71019d = list;
        this.f71020e = str2;
        this.f71021f = list2;
        this.f71022g = f;
        this.f71023h = f2;
    }

    /* renamed from: E */
    public final String m51246E() {
        return this.f71017b;
    }

    /* renamed from: F */
    public final List m51245F() {
        return this.f71019d;
    }

    /* renamed from: s */
    public final float m51244s() {
        return this.f71023h;
    }

    /* renamed from: u */
    public final float m51243u() {
        return this.f71022g;
    }

    /* renamed from: v */
    public final Rect m51242v() {
        return this.f71018c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71017b, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71018c, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f71019d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f71020e, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f71021f, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.f71022g);
        SafeParcelWriter.writeFloat(parcel, 7, this.f71023h);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzd() {
        return this.f71020e;
    }

    public final List zzg() {
        return this.f71021f;
    }
}
