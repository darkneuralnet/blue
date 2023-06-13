package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "TextLineParcelCreator")
/* loaded from: classes5.dex */
public final class zbok extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbok> CREATOR = new V77();
    @SafeParcelable.Field(getter = "getText", m51606id = 1)

    /* renamed from: b */
    public final String f70950b;
    @SafeParcelable.Field(getter = "getBoundingBox", m51606id = 2)

    /* renamed from: c */
    public final Rect f70951c;
    @SafeParcelable.Field(getter = "getCornerPointList", m51606id = 3)

    /* renamed from: d */
    public final List f70952d;
    @SafeParcelable.Field(getter = "getRecognizedLanguage", m51606id = 4)

    /* renamed from: e */
    public final String f70953e;
    @SafeParcelable.Field(getter = "getTextElementList", m51606id = 5)

    /* renamed from: f */
    public final List f70954f;
    @SafeParcelable.Field(getter = "getConfidence", m51606id = 6)

    /* renamed from: g */
    public final float f70955g;
    @SafeParcelable.Field(getter = "getAngle", m51606id = 7)

    /* renamed from: h */
    public final float f70956h;

    @SafeParcelable.Constructor
    public zbok(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) Rect rect, @SafeParcelable.Param(m51605id = 3) List list, @SafeParcelable.Param(m51605id = 4) String str2, @SafeParcelable.Param(m51605id = 5) List list2, @SafeParcelable.Param(m51605id = 6) float f, @SafeParcelable.Param(m51605id = 7) float f2) {
        this.f70950b = str;
        this.f70951c = rect;
        this.f70952d = list;
        this.f70953e = str2;
        this.f70954f = list2;
        this.f70955g = f;
        this.f70956h = f2;
    }

    /* renamed from: E */
    public final List m51269E() {
        return this.f70952d;
    }

    /* renamed from: s */
    public final Rect m51268s() {
        return this.f70951c;
    }

    /* renamed from: u */
    public final String m51267u() {
        return this.f70953e;
    }

    /* renamed from: v */
    public final String m51266v() {
        return this.f70950b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70950b, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f70951c, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f70952d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70953e, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f70954f, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.f70955g);
        SafeParcelWriter.writeFloat(parcel, 7, this.f70956h);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
