package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "InstrumentInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new C46708p99();
    @SafeParcelable.Field(getter = "getInstrumentType", m51606id = 2)

    /* renamed from: b */
    public String f71932b;
    @SafeParcelable.Field(getter = "getInstrumentDetails", m51606id = 3)

    /* renamed from: c */
    public String f71933c;
    @SafeParcelable.Field(getter = "getCardClass", m51606id = 4)

    /* renamed from: d */
    public int f71934d;

    private InstrumentInfo() {
    }

    /* renamed from: s */
    public int m50534s() {
        int i = this.f71934d;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 0;
    }

    /* renamed from: u */
    public String m50533u() {
        return this.f71933c;
    }

    /* renamed from: v */
    public String m50532v() {
        return this.f71932b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, m50532v(), false);
        SafeParcelWriter.writeString(parcel, 3, m50533u(), false);
        SafeParcelWriter.writeInt(parcel, 4, m50534s());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public InstrumentInfo(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) int i) {
        this.f71932b = str;
        this.f71933c = str2;
        this.f71934d = i;
    }
}
