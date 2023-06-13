package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/Country;", "Landroid/os/Parcelable;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "name", "flagEmoji", "", "locale", "Ljava/util/Locale;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/Locale;)V", "getCode", "()Ljava/lang/String;", "getFlagEmoji", "()Ljava/lang/CharSequence;", "getLocale", "()Ljava/util/Locale;", "getName", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "getPhonePrefix", "Lco/bird/android/model/Country$PhonePrefix;", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Factory", "PhonePrefix", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Country implements Parcelable {
    private final String code;
    private final CharSequence flagEmoji;
    private final Locale locale;
    private final String name;
    public static final Factory Factory = new Factory(null);
    public static final Parcelable.Creator<Country> CREATOR = new Creator();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Country> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Country createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Country(parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (Locale) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Country[] newArray(int i) {
            return new Country[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/Country$Factory;", "", "()V", "create", "Lco/bird/android/model/Country;", "locale", "Ljava/util/Locale;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Country create(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            String displayCountry = new Locale("", code).getDisplayCountry();
            Intrinsics.checkNotNullExpressionValue(displayCountry, "Locale(\"\", code).displayCountry");
            return new Country(code, displayCountry, CountryKt.getFlagEmoji(code), null, 8, null);
        }

        private Factory() {
        }

        public final Country create(Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            String country = locale.getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "locale.country");
            String displayCountry = locale.getDisplayCountry();
            Intrinsics.checkNotNullExpressionValue(displayCountry, "locale.displayCountry");
            String country2 = locale.getCountry();
            Intrinsics.checkNotNullExpressionValue(country2, "locale.country");
            return new Country(country, displayCountry, CountryKt.getFlagEmoji(country2), locale);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/Country$PhonePrefix;", "", "resourceId", "", "(Ljava/lang/String;II)V", "getResourceId", "()I", "FRANCE", "ISRAEL", "US", "MEXICO", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public enum PhonePrefix {
        FRANCE(C16253R.string.france_phone_prefix),
        ISRAEL(C16253R.string.israel_phone_prefix),
        US(C16253R.string.us_phone_prefix),
        MEXICO(C16253R.string.mexico_phone_prefix);
        
        private final int resourceId;

        PhonePrefix(int i) {
            this.resourceId = i;
        }

        public final int getResourceId() {
            return this.resourceId;
        }
    }

    public Country(String code, String name, CharSequence flagEmoji, Locale locale) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(flagEmoji, "flagEmoji");
        this.code = code;
        this.name = name;
        this.flagEmoji = flagEmoji;
        this.locale = locale;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Country) && Intrinsics.areEqual(this.code, ((Country) obj).code)) {
            return true;
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final CharSequence getFlagEmoji() {
        return this.flagEmoji;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final String getName() {
        return this.name;
    }

    public final PhonePrefix getPhonePrefix() {
        String str = this.code;
        int hashCode = str.hashCode();
        if (hashCode != 2252) {
            if (hashCode != 2339) {
                if (hashCode == 2475 && str.equals("MX")) {
                    return PhonePrefix.MEXICO;
                }
            } else if (str.equals("IL")) {
                return PhonePrefix.ISRAEL;
            }
        } else if (str.equals("FR")) {
            return PhonePrefix.FRANCE;
        }
        return PhonePrefix.US;
    }

    public int hashCode() {
        return this.code.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.code);
        out.writeString(this.name);
        TextUtils.writeToParcel(this.flagEmoji, out, i);
        out.writeSerializable(this.locale);
    }

    public /* synthetic */ Country(String str, String str2, CharSequence charSequence, Locale locale, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, charSequence, (i & 8) != 0 ? null : locale);
    }
}
