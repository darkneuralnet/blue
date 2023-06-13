package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;
@SafeParcelable.Class(creator = "LabelValueRowCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new C32125Ce8();
    @SafeParcelable.Field(m51606id = 2)
    @Deprecated

    /* renamed from: b */
    public String f72042b;
    @SafeParcelable.Field(m51606id = 3)
    @Deprecated

    /* renamed from: c */
    public String f72043c;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.common.util.ArrayUtils.newArrayList()", m51606id = 4)

    /* renamed from: d */
    public final ArrayList f72044d;

    public LabelValueRow() {
        this.f72044d = ArrayUtils.newArrayList();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f72042b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f72043c, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.f72044d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LabelValueRow(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) ArrayList arrayList) {
        this.f72042b = str;
        this.f72043c = str2;
        this.f72044d = arrayList;
    }
}
