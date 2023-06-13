package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
@SafeParcelable.Class(creator = "CardRequirementsCreator")
/* loaded from: classes6.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRequirements> CREATOR = new C47071pm8();
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: b */
    public ArrayList f71903b;
    @SafeParcelable.Field(defaultValue = "true", m51606id = 2)

    /* renamed from: c */
    public boolean f71904c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public boolean f71905d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public int f71906e;

    private CardRequirements() {
        this.f71904c = true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, this.f71903b, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f71904c);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f71905d);
        SafeParcelWriter.writeInt(parcel, 4, this.f71906e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CardRequirements(@SafeParcelable.Param(m51605id = 1) ArrayList arrayList, @SafeParcelable.Param(m51605id = 2) boolean z, @SafeParcelable.Param(m51605id = 3) boolean z2, @SafeParcelable.Param(m51605id = 4) int i) {
        this.f71903b = arrayList;
        this.f71904c = z;
        this.f71905d = z2;
        this.f71906e = i;
    }
}
