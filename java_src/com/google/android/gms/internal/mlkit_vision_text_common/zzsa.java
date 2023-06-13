package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "TextBlockParcelCreator")
/* loaded from: classes5.dex */
public final class zzsa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsa> CREATOR = new C40579ep9();
    @SafeParcelable.Field(getter = "getText", m51606id = 1)

    /* renamed from: b */
    public final String f71005b;
    @SafeParcelable.Field(getter = "getBoundingBox", m51606id = 2)

    /* renamed from: c */
    public final Rect f71006c;
    @SafeParcelable.Field(getter = "getCornerPointList", m51606id = 3)

    /* renamed from: d */
    public final List f71007d;
    @SafeParcelable.Field(getter = "getRecognizedLanguage", m51606id = 4)

    /* renamed from: e */
    public final String f71008e;
    @SafeParcelable.Field(getter = "getTextLineList", m51606id = 5)

    /* renamed from: f */
    public final List f71009f;

    @SafeParcelable.Constructor
    public zzsa(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) Rect rect, @SafeParcelable.Param(m51605id = 3) List list, @SafeParcelable.Param(m51605id = 4) String str2, @SafeParcelable.Param(m51605id = 5) List list2) {
        this.f71005b = str;
        this.f71006c = rect;
        this.f71007d = list;
        this.f71008e = str2;
        this.f71009f = list2;
    }

    /* renamed from: s */
    public final Rect m51254s() {
        return this.f71006c;
    }

    /* renamed from: u */
    public final String m51253u() {
        return this.f71005b;
    }

    /* renamed from: v */
    public final List m51252v() {
        return this.f71009f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71005b, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71006c, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f71007d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f71008e, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f71009f, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzb() {
        return this.f71008e;
    }

    public final List zzd() {
        return this.f71007d;
    }
}
