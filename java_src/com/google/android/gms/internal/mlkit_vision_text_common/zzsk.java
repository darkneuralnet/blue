package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "TextSymbolParcelCreator")
/* loaded from: classes5.dex */
public final class zzsk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsk> CREATOR = new Hp9();
    @SafeParcelable.Field(getter = "getText", m51606id = 1)

    /* renamed from: b */
    public final String f71032b;
    @SafeParcelable.Field(getter = "getBoundingBox", m51606id = 2)

    /* renamed from: c */
    public final Rect f71033c;
    @SafeParcelable.Field(getter = "getCornerPointList", m51606id = 3)

    /* renamed from: d */
    public final List f71034d;
    @SafeParcelable.Field(getter = "getConfidence", m51606id = 4)

    /* renamed from: e */
    public final float f71035e;
    @SafeParcelable.Field(getter = "getAngle", m51606id = 5)

    /* renamed from: f */
    public final float f71036f;

    @SafeParcelable.Constructor
    public zzsk(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) Rect rect, @SafeParcelable.Param(m51605id = 3) List list, @SafeParcelable.Param(m51605id = 4) float f, @SafeParcelable.Param(m51605id = 5) float f2) {
        this.f71032b = str;
        this.f71033c = rect;
        this.f71034d = list;
        this.f71035e = f;
        this.f71036f = f2;
    }

    /* renamed from: E */
    public final List m51240E() {
        return this.f71034d;
    }

    /* renamed from: s */
    public final float m51239s() {
        return this.f71036f;
    }

    /* renamed from: u */
    public final float m51238u() {
        return this.f71035e;
    }

    /* renamed from: v */
    public final Rect m51237v() {
        return this.f71033c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71032b, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71033c, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f71034d, false);
        SafeParcelWriter.writeFloat(parcel, 4, this.f71035e);
        SafeParcelWriter.writeFloat(parcel, 5, this.f71036f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzd() {
        return this.f71032b;
    }
}
