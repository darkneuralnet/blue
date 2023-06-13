package com.stripe.android.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\"\u0010#B\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\"\u0010$B/\b\u0017\u0012\u0006\u0010%\u001a\u00020\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b\"\u0010(J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\b\u0010\n\u001a\u00020\tH\u0016J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\tHÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!¨\u0006+"}, m28432d2 = {"Lcom/stripe/android/core/model/Country;", "Landroid/os/Parcelable;", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "toString", "Lcom/stripe/android/core/model/CountryCode;", "component1", "component2", PaymentMethodOptionsParams.Blik.PARAM_CODE, "name", "copy", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "Lcom/stripe/android/core/model/CountryCode;", "getCode", "()Lcom/stripe/android/core/model/CountryCode;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "<init>", "(Lcom/stripe/android/core/model/CountryCode;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/core/model/CountryCode;Ljava/lang/String;Lbt5;)V", "Companion", "$serializer", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class Country implements Parcelable {
    private final CountryCode code;
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Country> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/core/model/Country$Companion;", "", "LKj2;", "Lcom/stripe/android/core/model/Country;", "serializer", "<init>", "()V", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<Country> serializer() {
            return Country$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Country> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Country createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Country(CountryCode.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Country[] newArray(int i) {
            return new Country[i];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Country(int i, CountryCode countryCode, String str, C38819bt5 c38819bt5) {
        if (3 != (i & 3)) {
            C52838zW3.m1275b(i, 3, Country$$serializer.INSTANCE.getDescriptor());
        }
        this.code = countryCode;
        this.name = str;
    }

    public static /* synthetic */ Country copy$default(Country country, CountryCode countryCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            countryCode = country.code;
        }
        if ((i & 2) != 0) {
            str = country.name;
        }
        return country.copy(countryCode, str);
    }

    @JvmStatic
    public static final void write$Self(Country self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.mo1126y(serialDesc, 0, CountryCode$$serializer.INSTANCE, self.code);
        output.mo1128w(serialDesc, 1, self.name);
    }

    public final CountryCode component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final Country copy(CountryCode code, String name) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        return new Country(code, name);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Country) {
            Country country = (Country) obj;
            return Intrinsics.areEqual(this.code, country.code) && Intrinsics.areEqual(this.name, country.name);
        }
        return false;
    }

    public final CountryCode getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.code.writeToParcel(out, i);
        out.writeString(this.name);
    }

    public Country(CountryCode code, String name) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        this.code = code;
        this.name = name;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Country(String code, String name) {
        this(CountryCode.Companion.create(code), name);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
