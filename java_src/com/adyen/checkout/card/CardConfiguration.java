package com.adyen.checkout.card;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.base.Configuration;
import com.adyen.checkout.core.api.Environment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class CardConfiguration extends Configuration {
    public static final Parcelable.Creator<CardConfiguration> CREATOR;

    /* renamed from: n */
    public static final EnumC37040Xf0[] f68335n;

    /* renamed from: o */
    public static final EnumC37040Xf0[] f68336o;

    /* renamed from: p */
    public static final List<EnumC37040Xf0> f68337p;

    /* renamed from: e */
    public final String f68338e;

    /* renamed from: f */
    public final boolean f68339f;

    /* renamed from: g */
    public final List<EnumC37040Xf0> f68340g;

    /* renamed from: h */
    public final boolean f68341h;

    /* renamed from: i */
    public final boolean f68342i;

    /* renamed from: j */
    public final boolean f68343j;

    /* renamed from: k */
    public final EnumC43866kN5 f68344k;

    /* renamed from: l */
    public final EnumC33568Ij2 f68345l;

    /* renamed from: m */
    public final EnumC24723j8 f68346m;

    /* renamed from: com.adyen.checkout.card.CardConfiguration$a */
    /* loaded from: classes.dex */
    public static class C16793a implements Parcelable.Creator<CardConfiguration> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CardConfiguration createFromParcel(Parcel parcel) {
            return new CardConfiguration(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CardConfiguration[] newArray(int i) {
            return new CardConfiguration[i];
        }
    }

    static {
        EnumC37040Xf0[] enumC37040Xf0Arr = {EnumC37040Xf0.VISA, EnumC37040Xf0.AMERICAN_EXPRESS, EnumC37040Xf0.MASTERCARD};
        f68335n = enumC37040Xf0Arr;
        f68336o = new EnumC37040Xf0[]{EnumC37040Xf0.BCMC};
        f68337p = Collections.unmodifiableList(Arrays.asList(enumC37040Xf0Arr));
        CREATOR = new C16793a();
    }

    public CardConfiguration(C16794b c16794b) {
        super(c16794b.m10722e(), c16794b.m10723d(), c16794b.m10724c());
        this.f68339f = c16794b.f68348e;
        this.f68340g = c16794b.f68347d;
        this.f68338e = c16794b.f68350g;
        this.f68341h = c16794b.f68349f;
        this.f68342i = c16794b.f68351h;
        this.f68343j = c16794b.f68352i;
        this.f68344k = c16794b.f68353j;
        this.f68345l = c16794b.f68354k;
        this.f68346m = c16794b.f68355l;
    }

    /* renamed from: e */
    public EnumC24723j8 m53715e() {
        return this.f68346m;
    }

    /* renamed from: g */
    public EnumC33568Ij2 m53714g() {
        return this.f68345l;
    }

    /* renamed from: h */
    public String m53713h() {
        return this.f68338e;
    }

    /* renamed from: i */
    public EnumC43866kN5 m53712i() {
        return this.f68344k;
    }

    /* renamed from: j */
    public List<EnumC37040Xf0> m53711j() {
        return this.f68340g;
    }

    /* renamed from: k */
    public boolean m53710k() {
        return this.f68342i;
    }

    /* renamed from: l */
    public boolean m53709l() {
        return this.f68343j;
    }

    /* renamed from: m */
    public boolean m53708m() {
        return this.f68339f;
    }

    /* renamed from: n */
    public boolean m53707n() {
        return this.f68341h;
    }

    /* renamed from: o */
    public C16794b m53706o() {
        return new C16794b(this);
    }

    @Override // com.adyen.checkout.components.base.Configuration, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f68338e);
        PE3.m90551b(parcel, this.f68339f);
        parcel.writeList(this.f68340g);
        PE3.m90551b(parcel, this.f68341h);
        PE3.m90551b(parcel, this.f68342i);
        PE3.m90551b(parcel, this.f68343j);
        parcel.writeString(this.f68344k.name());
        parcel.writeString(this.f68345l.name());
        parcel.writeSerializable(this.f68346m);
    }

    public CardConfiguration(Parcel parcel) {
        super(parcel);
        this.f68338e = parcel.readString();
        this.f68339f = PE3.m90552a(parcel);
        this.f68340g = parcel.readArrayList(EnumC37040Xf0.class.getClassLoader());
        this.f68341h = PE3.m90552a(parcel);
        this.f68342i = PE3.m90552a(parcel);
        this.f68343j = PE3.m90552a(parcel);
        this.f68344k = EnumC43866kN5.valueOf(parcel.readString());
        this.f68345l = EnumC33568Ij2.valueOf(parcel.readString());
        this.f68346m = (EnumC24723j8) parcel.readSerializable();
    }

    /* renamed from: com.adyen.checkout.card.CardConfiguration$b */
    /* loaded from: classes.dex */
    public static final class C16794b extends AbstractC29103uA<CardConfiguration> {

        /* renamed from: d */
        public List<EnumC37040Xf0> f68347d;

        /* renamed from: e */
        public boolean f68348e;

        /* renamed from: f */
        public boolean f68349f;

        /* renamed from: g */
        public String f68350g;

        /* renamed from: h */
        public boolean f68351h;

        /* renamed from: i */
        public boolean f68352i;

        /* renamed from: j */
        public EnumC43866kN5 f68353j;

        /* renamed from: k */
        public EnumC33568Ij2 f68354k;

        /* renamed from: l */
        public EnumC24723j8 f68355l;

        public C16794b(CardConfiguration cardConfiguration) {
            super(cardConfiguration.m53594c(), cardConfiguration.m53595b(), cardConfiguration.m53596a());
            this.f68347d = Collections.emptyList();
            this.f68349f = true;
            this.f68353j = EnumC43866kN5.HIDE;
            this.f68354k = EnumC33568Ij2.HIDE;
            this.f68355l = EnumC24723j8.NONE;
            this.f68347d = cardConfiguration.m53711j();
            this.f68348e = cardConfiguration.m53708m();
            this.f68349f = cardConfiguration.m53707n();
            this.f68350g = cardConfiguration.m53713h();
            this.f68351h = cardConfiguration.m53710k();
            this.f68352i = cardConfiguration.m53709l();
            this.f68353j = cardConfiguration.m53712i();
            this.f68354k = cardConfiguration.m53714g();
            this.f68355l = cardConfiguration.m53715e();
        }

        @Override // p000.AbstractC29103uA
        /* renamed from: p */
        public CardConfiguration mo10725b() {
            return new CardConfiguration(this);
        }

        /* renamed from: q */
        public C16794b m53693q(Environment environment) {
            return (C16794b) super.m10721f(environment);
        }

        /* renamed from: r */
        public C16794b m53692r(boolean z) {
            this.f68349f = z;
            return this;
        }

        /* renamed from: s */
        public C16794b m53691s(EnumC37040Xf0... enumC37040Xf0Arr) {
            ArrayList arrayList = new ArrayList(Arrays.asList(enumC37040Xf0Arr));
            arrayList.removeAll(Arrays.asList(CardConfiguration.f68336o));
            this.f68347d = arrayList;
            return this;
        }

        public C16794b(Context context, String str) {
            super(context, str);
            this.f68347d = Collections.emptyList();
            this.f68349f = true;
            this.f68353j = EnumC43866kN5.HIDE;
            this.f68354k = EnumC33568Ij2.HIDE;
            this.f68355l = EnumC24723j8.NONE;
        }
    }
}
