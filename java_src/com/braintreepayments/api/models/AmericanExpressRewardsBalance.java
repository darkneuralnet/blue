package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class AmericanExpressRewardsBalance implements Parcelable {
    public static final Parcelable.Creator<AmericanExpressRewardsBalance> CREATOR = new C16973a();

    /* renamed from: b */
    public String f68683b;

    /* renamed from: c */
    public String f68684c;

    /* renamed from: d */
    public String f68685d;

    /* renamed from: e */
    public String f68686e;

    /* renamed from: f */
    public String f68687f;

    /* renamed from: g */
    public String f68688g;

    /* renamed from: h */
    public String f68689h;

    /* renamed from: i */
    public String f68690i;

    /* renamed from: com.braintreepayments.api.models.AmericanExpressRewardsBalance$a */
    /* loaded from: classes2.dex */
    public static class C16973a implements Parcelable.Creator<AmericanExpressRewardsBalance> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AmericanExpressRewardsBalance createFromParcel(Parcel parcel) {
            return new AmericanExpressRewardsBalance(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AmericanExpressRewardsBalance[] newArray(int i) {
            return new AmericanExpressRewardsBalance[i];
        }
    }

    public /* synthetic */ AmericanExpressRewardsBalance(Parcel parcel, C16973a c16973a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68683b);
        parcel.writeString(this.f68684c);
        parcel.writeString(this.f68685d);
        parcel.writeString(this.f68686e);
        parcel.writeString(this.f68687f);
        parcel.writeString(this.f68688g);
        parcel.writeString(this.f68689h);
        parcel.writeString(this.f68690i);
    }

    public AmericanExpressRewardsBalance() {
    }

    public AmericanExpressRewardsBalance(Parcel parcel) {
        this.f68683b = parcel.readString();
        this.f68684c = parcel.readString();
        this.f68685d = parcel.readString();
        this.f68686e = parcel.readString();
        this.f68687f = parcel.readString();
        this.f68688g = parcel.readString();
        this.f68689h = parcel.readString();
        this.f68690i = parcel.readString();
    }
}
