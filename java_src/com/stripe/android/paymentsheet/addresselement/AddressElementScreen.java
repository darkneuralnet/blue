package com.stripe.android.paymentsheet.addresselement;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "Autocomplete", "InputAddress", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen$Autocomplete;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen$InputAddress;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class AddressElementScreen {
    private final String route;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen$Autocomplete;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;", "country", "", "(Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Autocomplete extends AddressElementScreen {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public static final String countryArg = "country";
        public static final String route = "Autocomplete?country={country}";
        private final String country;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen$Autocomplete$Companion;", "", "()V", "countryArg", "", "route", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Autocomplete(String country) {
            super("Autocomplete?country=" + country, null);
            Intrinsics.checkNotNullParameter(country, "country");
            this.country = country;
        }

        public final String getCountry() {
            return this.country;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen$InputAddress;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class InputAddress extends AddressElementScreen {
        public static final int $stable = 0;
        public static final InputAddress INSTANCE = new InputAddress();

        private InputAddress() {
            super("InputAddress", null);
        }
    }

    public /* synthetic */ AddressElementScreen(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String getRoute() {
        return this.route;
    }

    private AddressElementScreen(String str) {
        this.route = str;
    }
}
