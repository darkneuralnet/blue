package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "TextElementParcelCreator")
/* loaded from: classes5.dex */
public final class zboi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zboi> CREATOR = new U77();
    @SafeParcelable.Field(getter = "getText", m51606id = 1)

    /* renamed from: b */
    public final String f70943b;
    @SafeParcelable.Field(getter = "getBoundingBox", m51606id = 2)

    /* renamed from: c */
    public final Rect f70944c;
    @SafeParcelable.Field(getter = "getCornerPointList", m51606id = 3)

    /* renamed from: d */
    public final List f70945d;
    @SafeParcelable.Field(getter = "getRecognizedLanguage", m51606id = 4)

    /* renamed from: e */
    public final String f70946e;
    @SafeParcelable.Field(getter = "getConfidence", m51606id = 5)

    /* renamed from: f */
    public final float f70947f;
    @SafeParcelable.Field(getter = "getAngle", m51606id = 6)

    /* renamed from: g */
    public final float f70948g;
    @SafeParcelable.Field(getter = "getTextSymbolList", m51606id = 7)

    /* renamed from: h */
    public final List f70949h;

    @SafeParcelable.Constructor
    public zboi(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) Rect rect, @SafeParcelable.Param(m51605id = 3) List list, @SafeParcelable.Param(m51605id = 4) String str2, @SafeParcelable.Param(m51605id = 5) float f, @SafeParcelable.Param(m51605id = 6) float f2, @SafeParcelable.Param(m51605id = 7) List list2) {
        this.f70943b = str;
        this.f70944c = rect;
        this.f70945d = list;
        this.f70946e = str2;
        this.f70947f = f;
        this.f70948g = f2;
        this.f70949h = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70943b, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f70944c, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f70945d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70946e, false);
        SafeParcelWriter.writeFloat(parcel, 5, this.f70947f);
        SafeParcelWriter.writeFloat(parcel, 6, this.f70948g);
        SafeParcelWriter.writeTypedList(parcel, 7, this.f70949h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
