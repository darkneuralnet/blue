package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "TextElementParcelCreator")
/* loaded from: classes5.dex */
public final class zzsc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsc> CREATOR = new C44730lp9();
    @SafeParcelable.Field(getter = "getText", m51606id = 1)

    /* renamed from: b */
    public final String f71010b;
    @SafeParcelable.Field(getter = "getBoundingBox", m51606id = 2)

    /* renamed from: c */
    public final Rect f71011c;
    @SafeParcelable.Field(getter = "getCornerPointList", m51606id = 3)

    /* renamed from: d */
    public final List f71012d;
    @SafeParcelable.Field(getter = "getRecognizedLanguage", m51606id = 4)

    /* renamed from: e */
    public final String f71013e;
    @SafeParcelable.Field(getter = "getConfidence", m51606id = 5)

    /* renamed from: f */
    public final float f71014f;
    @SafeParcelable.Field(getter = "getAngle", m51606id = 6)

    /* renamed from: g */
    public final float f71015g;
    @SafeParcelable.Field(getter = "getTextSymbolList", m51606id = 7)

    /* renamed from: h */
    public final List f71016h;

    @SafeParcelable.Constructor
    public zzsc(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) Rect rect, @SafeParcelable.Param(m51605id = 3) List list, @SafeParcelable.Param(m51605id = 4) String str2, @SafeParcelable.Param(m51605id = 5) float f, @SafeParcelable.Param(m51605id = 6) float f2, @SafeParcelable.Param(m51605id = 7) List list2) {
        this.f71010b = str;
        this.f71011c = rect;
        this.f71012d = list;
        this.f71013e = str2;
        this.f71014f = f;
        this.f71015g = f2;
        this.f71016h = list2;
    }

    /* renamed from: E */
    public final String m51251E() {
        return this.f71010b;
    }

    /* renamed from: F */
    public final List m51250F() {
        return this.f71012d;
    }

    /* renamed from: s */
    public final float m51249s() {
        return this.f71015g;
    }

    /* renamed from: u */
    public final float m51248u() {
        return this.f71014f;
    }

    /* renamed from: v */
    public final Rect m51247v() {
        return this.f71011c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71010b, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71011c, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f71012d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f71013e, false);
        SafeParcelWriter.writeFloat(parcel, 5, this.f71014f);
        SafeParcelWriter.writeFloat(parcel, 6, this.f71015g);
        SafeParcelWriter.writeTypedList(parcel, 7, this.f71016h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzd() {
        return this.f71013e;
    }

    public final List zzg() {
        return this.f71016h;
    }
}
