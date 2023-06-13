package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "TextBlockParcelCreator")
/* loaded from: classes5.dex */
public final class zbog extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbog> CREATOR = new T77();
    @SafeParcelable.Field(getter = "getText", m51606id = 1)

    /* renamed from: b */
    public final String f70938b;
    @SafeParcelable.Field(getter = "getBoundingBox", m51606id = 2)

    /* renamed from: c */
    public final Rect f70939c;
    @SafeParcelable.Field(getter = "getCornerPointList", m51606id = 3)

    /* renamed from: d */
    public final List f70940d;
    @SafeParcelable.Field(getter = "getRecognizedLanguage", m51606id = 4)

    /* renamed from: e */
    public final String f70941e;
    @SafeParcelable.Field(getter = "getTextLineList", m51606id = 5)

    /* renamed from: f */
    public final List f70942f;

    @SafeParcelable.Constructor
    public zbog(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) Rect rect, @SafeParcelable.Param(m51605id = 3) List list, @SafeParcelable.Param(m51605id = 4) String str2, @SafeParcelable.Param(m51605id = 5) List list2) {
        this.f70938b = str;
        this.f70939c = rect;
        this.f70940d = list;
        this.f70941e = str2;
        this.f70942f = list2;
    }

    /* renamed from: s */
    public final String m51270s() {
        return this.f70938b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70938b, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f70939c, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f70940d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70941e, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f70942f, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
