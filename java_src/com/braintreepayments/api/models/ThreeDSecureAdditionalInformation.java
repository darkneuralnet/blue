package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class ThreeDSecureAdditionalInformation implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecureAdditionalInformation> CREATOR = new C16991a();

    /* renamed from: A */
    public String f68821A;

    /* renamed from: B */
    public String f68822B;

    /* renamed from: C */
    public String f68823C;

    /* renamed from: D */
    public String f68824D;

    /* renamed from: E */
    public String f68825E;

    /* renamed from: F */
    public String f68826F;

    /* renamed from: G */
    public String f68827G;

    /* renamed from: H */
    public String f68828H;

    /* renamed from: I */
    public String f68829I;

    /* renamed from: J */
    public String f68830J;

    /* renamed from: K */
    public String f68831K;

    /* renamed from: P */
    public String f68832P;

    /* renamed from: Q */
    public String f68833Q;

    /* renamed from: R */
    public String f68834R;

    /* renamed from: S */
    public String f68835S;

    /* renamed from: b */
    public ThreeDSecurePostalAddress f68836b;

    /* renamed from: c */
    public String f68837c;

    /* renamed from: d */
    public String f68838d;

    /* renamed from: e */
    public String f68839e;

    /* renamed from: f */
    public String f68840f;

    /* renamed from: g */
    public String f68841g;

    /* renamed from: h */
    public String f68842h;

    /* renamed from: i */
    public String f68843i;

    /* renamed from: j */
    public String f68844j;

    /* renamed from: k */
    public String f68845k;

    /* renamed from: l */
    public String f68846l;

    /* renamed from: m */
    public String f68847m;

    /* renamed from: n */
    public String f68848n;

    /* renamed from: o */
    public String f68849o;

    /* renamed from: p */
    public String f68850p;

    /* renamed from: q */
    public String f68851q;

    /* renamed from: r */
    public String f68852r;

    /* renamed from: s */
    public String f68853s;

    /* renamed from: t */
    public String f68854t;

    /* renamed from: u */
    public String f68855u;

    /* renamed from: v */
    public String f68856v;

    /* renamed from: w */
    public String f68857w;

    /* renamed from: x */
    public String f68858x;

    /* renamed from: y */
    public String f68859y;

    /* renamed from: z */
    public String f68860z;

    /* renamed from: com.braintreepayments.api.models.ThreeDSecureAdditionalInformation$a */
    /* loaded from: classes2.dex */
    public static class C16991a implements Parcelable.Creator<ThreeDSecureAdditionalInformation> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ThreeDSecureAdditionalInformation createFromParcel(Parcel parcel) {
            return new ThreeDSecureAdditionalInformation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ThreeDSecureAdditionalInformation[] newArray(int i) {
            return new ThreeDSecureAdditionalInformation[i];
        }
    }

    public ThreeDSecureAdditionalInformation() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f68836b, i);
        parcel.writeString(this.f68837c);
        parcel.writeString(this.f68838d);
        parcel.writeString(this.f68839e);
        parcel.writeString(this.f68840f);
        parcel.writeString(this.f68841g);
        parcel.writeString(this.f68842h);
        parcel.writeString(this.f68843i);
        parcel.writeString(this.f68844j);
        parcel.writeString(this.f68845k);
        parcel.writeString(this.f68846l);
        parcel.writeString(this.f68847m);
        parcel.writeString(this.f68848n);
        parcel.writeString(this.f68849o);
        parcel.writeString(this.f68850p);
        parcel.writeString(this.f68851q);
        parcel.writeString(this.f68852r);
        parcel.writeString(this.f68853s);
        parcel.writeString(this.f68854t);
        parcel.writeString(this.f68855u);
        parcel.writeString(this.f68856v);
        parcel.writeString(this.f68857w);
        parcel.writeString(this.f68858x);
        parcel.writeString(this.f68859y);
        parcel.writeString(this.f68860z);
        parcel.writeString(this.f68821A);
        parcel.writeString(this.f68822B);
        parcel.writeString(this.f68823C);
        parcel.writeString(this.f68824D);
        parcel.writeString(this.f68825E);
        parcel.writeString(this.f68826F);
        parcel.writeString(this.f68827G);
        parcel.writeString(this.f68828H);
        parcel.writeString(this.f68829I);
        parcel.writeString(this.f68830J);
        parcel.writeString(this.f68831K);
        parcel.writeString(this.f68832P);
        parcel.writeString(this.f68833Q);
        parcel.writeString(this.f68834R);
        parcel.writeString(this.f68835S);
    }

    public ThreeDSecureAdditionalInformation(Parcel parcel) {
        this.f68836b = (ThreeDSecurePostalAddress) parcel.readParcelable(ThreeDSecurePostalAddress.class.getClassLoader());
        this.f68837c = parcel.readString();
        this.f68838d = parcel.readString();
        this.f68839e = parcel.readString();
        this.f68840f = parcel.readString();
        this.f68841g = parcel.readString();
        this.f68842h = parcel.readString();
        this.f68843i = parcel.readString();
        this.f68844j = parcel.readString();
        this.f68845k = parcel.readString();
        this.f68846l = parcel.readString();
        this.f68847m = parcel.readString();
        this.f68848n = parcel.readString();
        this.f68849o = parcel.readString();
        this.f68850p = parcel.readString();
        this.f68851q = parcel.readString();
        this.f68852r = parcel.readString();
        this.f68853s = parcel.readString();
        this.f68854t = parcel.readString();
        this.f68855u = parcel.readString();
        this.f68856v = parcel.readString();
        this.f68857w = parcel.readString();
        this.f68858x = parcel.readString();
        this.f68859y = parcel.readString();
        this.f68860z = parcel.readString();
        this.f68821A = parcel.readString();
        this.f68822B = parcel.readString();
        this.f68823C = parcel.readString();
        this.f68824D = parcel.readString();
        this.f68825E = parcel.readString();
        this.f68826F = parcel.readString();
        this.f68827G = parcel.readString();
        this.f68828H = parcel.readString();
        this.f68829I = parcel.readString();
        this.f68830J = parcel.readString();
        this.f68831K = parcel.readString();
        this.f68832P = parcel.readString();
        this.f68833Q = parcel.readString();
        this.f68834R = parcel.readString();
        this.f68835S = parcel.readString();
    }
}
