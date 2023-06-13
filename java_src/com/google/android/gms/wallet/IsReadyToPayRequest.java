package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
@SafeParcelable.Class(creator = "IsReadyToPayRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new Gh9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public ArrayList f71935b;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: c */
    public String f71936c;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: d */
    public String f71937d;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: e */
    public ArrayList f71938e;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: f */
    public boolean f71939f;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: g */
    public String f71940g;

    @Deprecated
    /* renamed from: com.google.android.gms.wallet.IsReadyToPayRequest$a */
    /* loaded from: classes6.dex */
    public final class C17643a {
        public /* synthetic */ C17643a(C47575qd9 c47575qd9) {
        }

        /* renamed from: a */
        public C17643a m50529a(int i) {
            IsReadyToPayRequest isReadyToPayRequest = IsReadyToPayRequest.this;
            if (isReadyToPayRequest.f71938e == null) {
                isReadyToPayRequest.f71938e = new ArrayList();
            }
            IsReadyToPayRequest.this.f71938e.add(Integer.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public IsReadyToPayRequest m50528b() {
            return IsReadyToPayRequest.this;
        }
    }

    public IsReadyToPayRequest() {
    }

    /* renamed from: s */
    public static IsReadyToPayRequest m50531s(String str) {
        C17643a m50530u = m50530u();
        IsReadyToPayRequest.this.f71940g = (String) Preconditions.checkNotNull(str, "isReadyToPayRequestJson cannot be null!");
        return m50530u.m50528b();
    }

    @Deprecated
    /* renamed from: u */
    public static C17643a m50530u() {
        return new C17643a(null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 2, this.f71935b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f71936c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f71937d, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.f71938e, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f71939f);
        SafeParcelWriter.writeString(parcel, 8, this.f71940g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public IsReadyToPayRequest(@SafeParcelable.Param(m51605id = 2) ArrayList arrayList, @SafeParcelable.Param(m51605id = 4) String str, @SafeParcelable.Param(m51605id = 5) String str2, @SafeParcelable.Param(m51605id = 6) ArrayList arrayList2, @SafeParcelable.Param(m51605id = 7) boolean z, @SafeParcelable.Param(m51605id = 8) String str3) {
        this.f71935b = arrayList;
        this.f71936c = str;
        this.f71937d = str2;
        this.f71938e = arrayList2;
        this.f71939f = z;
        this.f71940g = str3;
    }
}
