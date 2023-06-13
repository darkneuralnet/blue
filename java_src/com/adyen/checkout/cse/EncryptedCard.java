package com.adyen.checkout.cse;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class EncryptedCard implements Parcelable {
    public static final Parcelable.Creator<EncryptedCard> CREATOR = new C16845a();

    /* renamed from: b */
    public final String f68435b;

    /* renamed from: c */
    public final String f68436c;

    /* renamed from: d */
    public final String f68437d;

    /* renamed from: e */
    public final String f68438e;

    /* renamed from: com.adyen.checkout.cse.EncryptedCard$a */
    /* loaded from: classes.dex */
    public static class C16845a implements Parcelable.Creator<EncryptedCard> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public EncryptedCard createFromParcel(Parcel parcel) {
            return new EncryptedCard(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public EncryptedCard[] newArray(int i) {
            return new EncryptedCard[i];
        }
    }

    public /* synthetic */ EncryptedCard(Parcel parcel, C16845a c16845a) {
        this(parcel);
    }

    /* renamed from: a */
    public String m53572a() {
        return this.f68435b;
    }

    /* renamed from: b */
    public String m53571b() {
        return this.f68436c;
    }

    /* renamed from: c */
    public String m53570c() {
        return this.f68437d;
    }

    /* renamed from: d */
    public String m53569d() {
        return this.f68438e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68435b);
        parcel.writeString(this.f68436c);
        parcel.writeString(this.f68437d);
        parcel.writeString(this.f68438e);
    }

    public EncryptedCard(String str, String str2, String str3, String str4) {
        this.f68435b = str;
        this.f68436c = str2;
        this.f68437d = str3;
        this.f68438e = str4;
    }

    public EncryptedCard(Parcel parcel) {
        this.f68435b = parcel.readString();
        this.f68436c = parcel.readString();
        this.f68437d = parcel.readString();
        this.f68438e = parcel.readString();
    }
}
