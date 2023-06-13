package com.stripe.android;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.stripe3ds2.init.p048ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.p048ui.LabelCustomization;
import com.stripe.android.stripe3ds2.init.p048ui.StripeButtonCustomization;
import com.stripe.android.stripe3ds2.init.p048ui.StripeLabelCustomization;
import com.stripe.android.stripe3ds2.init.p048ui.StripeTextBoxCustomization;
import com.stripe.android.stripe3ds2.init.p048ui.StripeToolbarCustomization;
import com.stripe.android.stripe3ds2.init.p048ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.init.p048ui.TextBoxCustomization;
import com.stripe.android.stripe3ds2.init.p048ui.ToolbarCustomization;
import com.stripe.android.stripe3ds2.init.p048ui.UiCustomization;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \b2\u00020\u0001:\b\u0007\b\t\n\u000b\f\r\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig;", "", "stripe3ds2Config", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;)V", "getStripe3ds2Config$payments_core_release", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "Builder", "Companion", "Stripe3ds2ButtonCustomization", "Stripe3ds2Config", "Stripe3ds2LabelCustomization", "Stripe3ds2TextBoxCustomization", "Stripe3ds2ToolbarCustomization", "Stripe3ds2UiCustomization", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class PaymentAuthConfig {
    private static PaymentAuthConfig instance;
    private final Stripe3ds2Config stripe3ds2Config;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final PaymentAuthConfig DEFAULT = new Builder().set3ds2Config(new Stripe3ds2Config.Builder().build()).build();

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig;", "()V", "stripe3ds2Config", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "set3ds2Config", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder implements ObjectBuilder<PaymentAuthConfig> {
        public static final int $stable = 8;
        private Stripe3ds2Config stripe3ds2Config;

        public final Builder set3ds2Config(Stripe3ds2Config stripe3ds2Config) {
            Intrinsics.checkNotNullParameter(stripe3ds2Config, "stripe3ds2Config");
            this.stripe3ds2Config = stripe3ds2Config;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.stripe.android.ObjectBuilder
        public PaymentAuthConfig build() {
            Stripe3ds2Config stripe3ds2Config = this.stripe3ds2Config;
            if (stripe3ds2Config != null) {
                return new PaymentAuthConfig(stripe3ds2Config, null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\r\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Companion;", "", "()V", "DEFAULT", "Lcom/stripe/android/PaymentAuthConfig;", "instance", "get", "init", "", "config", "reset", "reset$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final PaymentAuthConfig get() {
            PaymentAuthConfig paymentAuthConfig = PaymentAuthConfig.instance;
            return paymentAuthConfig == null ? PaymentAuthConfig.DEFAULT : paymentAuthConfig;
        }

        @JvmStatic
        public final void init(PaymentAuthConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            PaymentAuthConfig.instance = config;
        }

        public final /* synthetic */ void reset$payments_core_release() {
            PaymentAuthConfig.instance = null;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;", "", "buttonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V", "getButtonCustomization$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "component1", "component1$payments_core_release", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "Builder", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Stripe3ds2ButtonCustomization {
        public static final int $stable = 8;
        private final ButtonCustomization buttonCustomization;

        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;", "()V", "buttonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setBackgroundColor", "hexColor", "", "setCornerRadius", "cornerRadius", "", "setTextColor", "setTextFontName", "fontName", "setTextFontSize", "fontSize", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Builder implements ObjectBuilder<Stripe3ds2ButtonCustomization> {
            public static final int $stable = 8;
            private final ButtonCustomization buttonCustomization = new StripeButtonCustomization();

            public final Builder setBackgroundColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.buttonCustomization.setBackgroundColor(hexColor);
                return this;
            }

            public final Builder setCornerRadius(int i) throws RuntimeException {
                this.buttonCustomization.setCornerRadius(i);
                return this;
            }

            public final Builder setTextColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.buttonCustomization.setTextColor(hexColor);
                return this;
            }

            public final Builder setTextFontName(String fontName) throws RuntimeException {
                Intrinsics.checkNotNullParameter(fontName, "fontName");
                this.buttonCustomization.setTextFontName(fontName);
                return this;
            }

            public final Builder setTextFontSize(int i) throws RuntimeException {
                this.buttonCustomization.setTextFontSize(i);
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Stripe3ds2ButtonCustomization build() {
                return new Stripe3ds2ButtonCustomization(this.buttonCustomization);
            }
        }

        public Stripe3ds2ButtonCustomization(ButtonCustomization buttonCustomization) {
            Intrinsics.checkNotNullParameter(buttonCustomization, "buttonCustomization");
            this.buttonCustomization = buttonCustomization;
        }

        public static /* synthetic */ Stripe3ds2ButtonCustomization copy$default(Stripe3ds2ButtonCustomization stripe3ds2ButtonCustomization, ButtonCustomization buttonCustomization, int i, Object obj) {
            if ((i & 1) != 0) {
                buttonCustomization = stripe3ds2ButtonCustomization.buttonCustomization;
            }
            return stripe3ds2ButtonCustomization.copy(buttonCustomization);
        }

        public final ButtonCustomization component1$payments_core_release() {
            return this.buttonCustomization;
        }

        public final Stripe3ds2ButtonCustomization copy(ButtonCustomization buttonCustomization) {
            Intrinsics.checkNotNullParameter(buttonCustomization, "buttonCustomization");
            return new Stripe3ds2ButtonCustomization(buttonCustomization);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stripe3ds2ButtonCustomization) && Intrinsics.areEqual(this.buttonCustomization, ((Stripe3ds2ButtonCustomization) obj).buttonCustomization);
        }

        public final ButtonCustomization getButtonCustomization$payments_core_release() {
            return this.buttonCustomization;
        }

        public int hashCode() {
            return this.buttonCustomization.hashCode();
        }

        public String toString() {
            ButtonCustomization buttonCustomization = this.buttonCustomization;
            return "Stripe3ds2ButtonCustomization(buttonCustomization=" + buttonCustomization + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0019\b\u0000\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\r\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u000eJ\u000e\u0010\u000f\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0010J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "Landroid/os/Parcelable;", "timeout", "", "uiCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "(ILcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;)V", "getTimeout$payments_core_release", "()I", "getUiCustomization$payments_core_release", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "checkValidTimeout", "", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Stripe3ds2Config implements Parcelable {
        public static final int DEFAULT_TIMEOUT = 5;
        private final int timeout;
        private final Stripe3ds2UiCustomization uiCustomization;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Stripe3ds2Config> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "()V", "timeout", "", "uiCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setTimeout", "setUiCustomization", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Builder implements ObjectBuilder<Stripe3ds2Config> {
            public static final int $stable = 8;
            private int timeout = 5;
            private Stripe3ds2UiCustomization uiCustomization = new Stripe3ds2UiCustomization.Builder().build();

            public final Builder setTimeout(int i) {
                this.timeout = i;
                return this;
            }

            public final Builder setUiCustomization(Stripe3ds2UiCustomization uiCustomization) {
                Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
                this.uiCustomization = uiCustomization;
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Stripe3ds2Config build() {
                return new Stripe3ds2Config(this.timeout, this.uiCustomization);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Companion;", "", "()V", "DEFAULT_TIMEOUT", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Stripe3ds2Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2Config createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stripe3ds2Config(parcel.readInt(), Stripe3ds2UiCustomization.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2Config[] newArray(int i) {
                return new Stripe3ds2Config[i];
            }
        }

        public Stripe3ds2Config(int i, Stripe3ds2UiCustomization uiCustomization) {
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            this.timeout = i;
            this.uiCustomization = uiCustomization;
            checkValidTimeout(i);
        }

        private final void checkValidTimeout(int i) {
            if (!(i >= 5 && i <= 99)) {
                throw new IllegalArgumentException("Timeout value must be between 5 and 99, inclusive".toString());
            }
        }

        public static /* synthetic */ Stripe3ds2Config copy$default(Stripe3ds2Config stripe3ds2Config, int i, Stripe3ds2UiCustomization stripe3ds2UiCustomization, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stripe3ds2Config.timeout;
            }
            if ((i2 & 2) != 0) {
                stripe3ds2UiCustomization = stripe3ds2Config.uiCustomization;
            }
            return stripe3ds2Config.copy(i, stripe3ds2UiCustomization);
        }

        public final int component1$payments_core_release() {
            return this.timeout;
        }

        public final Stripe3ds2UiCustomization component2$payments_core_release() {
            return this.uiCustomization;
        }

        public final Stripe3ds2Config copy(int i, Stripe3ds2UiCustomization uiCustomization) {
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            return new Stripe3ds2Config(i, uiCustomization);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Stripe3ds2Config) {
                Stripe3ds2Config stripe3ds2Config = (Stripe3ds2Config) obj;
                return this.timeout == stripe3ds2Config.timeout && Intrinsics.areEqual(this.uiCustomization, stripe3ds2Config.uiCustomization);
            }
            return false;
        }

        public final int getTimeout$payments_core_release() {
            return this.timeout;
        }

        public final Stripe3ds2UiCustomization getUiCustomization$payments_core_release() {
            return this.uiCustomization;
        }

        public int hashCode() {
            return (Integer.hashCode(this.timeout) * 31) + this.uiCustomization.hashCode();
        }

        public String toString() {
            int i = this.timeout;
            Stripe3ds2UiCustomization stripe3ds2UiCustomization = this.uiCustomization;
            return "Stripe3ds2Config(timeout=" + i + ", uiCustomization=" + stripe3ds2UiCustomization + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(this.timeout);
            this.uiCustomization.writeToParcel(out, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;", "", "labelCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "(Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V", "getLabelCustomization$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "component1", "component1$payments_core_release", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "Builder", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Stripe3ds2LabelCustomization {
        public static final int $stable = 8;
        private final LabelCustomization labelCustomization;

        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;", "()V", "labelCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setHeadingTextColor", "hexColor", "", "setHeadingTextFontName", "fontName", "setHeadingTextFontSize", "fontSize", "", "setTextColor", "setTextFontName", "setTextFontSize", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Builder implements ObjectBuilder<Stripe3ds2LabelCustomization> {
            public static final int $stable = 8;
            private final LabelCustomization labelCustomization = new StripeLabelCustomization();

            public final Builder setHeadingTextColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.labelCustomization.setHeadingTextColor(hexColor);
                return this;
            }

            public final Builder setHeadingTextFontName(String fontName) throws RuntimeException {
                Intrinsics.checkNotNullParameter(fontName, "fontName");
                this.labelCustomization.setHeadingTextFontName(fontName);
                return this;
            }

            public final Builder setHeadingTextFontSize(int i) throws RuntimeException {
                this.labelCustomization.setHeadingTextFontSize(i);
                return this;
            }

            public final Builder setTextColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.labelCustomization.setTextColor(hexColor);
                return this;
            }

            public final Builder setTextFontName(String fontName) throws RuntimeException {
                Intrinsics.checkNotNullParameter(fontName, "fontName");
                this.labelCustomization.setTextFontName(fontName);
                return this;
            }

            public final Builder setTextFontSize(int i) throws RuntimeException {
                this.labelCustomization.setTextFontSize(i);
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Stripe3ds2LabelCustomization build() {
                return new Stripe3ds2LabelCustomization(this.labelCustomization);
            }
        }

        public Stripe3ds2LabelCustomization(LabelCustomization labelCustomization) {
            Intrinsics.checkNotNullParameter(labelCustomization, "labelCustomization");
            this.labelCustomization = labelCustomization;
        }

        public static /* synthetic */ Stripe3ds2LabelCustomization copy$default(Stripe3ds2LabelCustomization stripe3ds2LabelCustomization, LabelCustomization labelCustomization, int i, Object obj) {
            if ((i & 1) != 0) {
                labelCustomization = stripe3ds2LabelCustomization.labelCustomization;
            }
            return stripe3ds2LabelCustomization.copy(labelCustomization);
        }

        public final LabelCustomization component1$payments_core_release() {
            return this.labelCustomization;
        }

        public final Stripe3ds2LabelCustomization copy(LabelCustomization labelCustomization) {
            Intrinsics.checkNotNullParameter(labelCustomization, "labelCustomization");
            return new Stripe3ds2LabelCustomization(labelCustomization);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stripe3ds2LabelCustomization) && Intrinsics.areEqual(this.labelCustomization, ((Stripe3ds2LabelCustomization) obj).labelCustomization);
        }

        public final LabelCustomization getLabelCustomization$payments_core_release() {
            return this.labelCustomization;
        }

        public int hashCode() {
            return this.labelCustomization.hashCode();
        }

        public String toString() {
            LabelCustomization labelCustomization = this.labelCustomization;
            return "Stripe3ds2LabelCustomization(labelCustomization=" + labelCustomization + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;", "", "textBoxCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "(Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;)V", "getTextBoxCustomization$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "component1", "component1$payments_core_release", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "Builder", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Stripe3ds2TextBoxCustomization {
        public static final int $stable = 8;
        private final TextBoxCustomization textBoxCustomization;

        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;", "()V", "textBoxCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setBorderColor", "hexColor", "", "setBorderWidth", "borderWidth", "", "setCornerRadius", "cornerRadius", "setTextColor", "setTextFontName", "fontName", "setTextFontSize", "fontSize", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Builder implements ObjectBuilder<Stripe3ds2TextBoxCustomization> {
            public static final int $stable = 8;
            private final TextBoxCustomization textBoxCustomization = new StripeTextBoxCustomization();

            public final Builder setBorderColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.textBoxCustomization.setBorderColor(hexColor);
                return this;
            }

            public final Builder setBorderWidth(int i) throws RuntimeException {
                this.textBoxCustomization.setBorderWidth(i);
                return this;
            }

            public final Builder setCornerRadius(int i) throws RuntimeException {
                this.textBoxCustomization.setCornerRadius(i);
                return this;
            }

            public final Builder setTextColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.textBoxCustomization.setTextColor(hexColor);
                return this;
            }

            public final Builder setTextFontName(String fontName) throws RuntimeException {
                Intrinsics.checkNotNullParameter(fontName, "fontName");
                this.textBoxCustomization.setTextFontName(fontName);
                return this;
            }

            public final Builder setTextFontSize(int i) throws RuntimeException {
                this.textBoxCustomization.setTextFontSize(i);
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Stripe3ds2TextBoxCustomization build() {
                return new Stripe3ds2TextBoxCustomization(this.textBoxCustomization);
            }
        }

        public Stripe3ds2TextBoxCustomization(TextBoxCustomization textBoxCustomization) {
            Intrinsics.checkNotNullParameter(textBoxCustomization, "textBoxCustomization");
            this.textBoxCustomization = textBoxCustomization;
        }

        public static /* synthetic */ Stripe3ds2TextBoxCustomization copy$default(Stripe3ds2TextBoxCustomization stripe3ds2TextBoxCustomization, TextBoxCustomization textBoxCustomization, int i, Object obj) {
            if ((i & 1) != 0) {
                textBoxCustomization = stripe3ds2TextBoxCustomization.textBoxCustomization;
            }
            return stripe3ds2TextBoxCustomization.copy(textBoxCustomization);
        }

        public final TextBoxCustomization component1$payments_core_release() {
            return this.textBoxCustomization;
        }

        public final Stripe3ds2TextBoxCustomization copy(TextBoxCustomization textBoxCustomization) {
            Intrinsics.checkNotNullParameter(textBoxCustomization, "textBoxCustomization");
            return new Stripe3ds2TextBoxCustomization(textBoxCustomization);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stripe3ds2TextBoxCustomization) && Intrinsics.areEqual(this.textBoxCustomization, ((Stripe3ds2TextBoxCustomization) obj).textBoxCustomization);
        }

        public final TextBoxCustomization getTextBoxCustomization$payments_core_release() {
            return this.textBoxCustomization;
        }

        public int hashCode() {
            return this.textBoxCustomization.hashCode();
        }

        public String toString() {
            TextBoxCustomization textBoxCustomization = this.textBoxCustomization;
            return "Stripe3ds2TextBoxCustomization(textBoxCustomization=" + textBoxCustomization + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;", "", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)V", "getToolbarCustomization$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "component1", "component1$payments_core_release", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "Builder", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Stripe3ds2ToolbarCustomization {
        public static final int $stable = 8;
        private final ToolbarCustomization toolbarCustomization;

        @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;", "()V", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "setBackgroundColor", "hexColor", "", "setButtonText", "buttonText", "setHeaderText", "headerText", "setStatusBarColor", "setTextColor", "setTextFontName", "fontName", "setTextFontSize", "fontSize", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Builder implements ObjectBuilder<Stripe3ds2ToolbarCustomization> {
            public static final int $stable = 8;
            private final ToolbarCustomization toolbarCustomization = new StripeToolbarCustomization();

            public final Builder setBackgroundColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.toolbarCustomization.setBackgroundColor(hexColor);
                return this;
            }

            public final Builder setButtonText(String buttonText) throws RuntimeException {
                Intrinsics.checkNotNullParameter(buttonText, "buttonText");
                this.toolbarCustomization.setButtonText(buttonText);
                return this;
            }

            public final Builder setHeaderText(String headerText) throws RuntimeException {
                Intrinsics.checkNotNullParameter(headerText, "headerText");
                this.toolbarCustomization.setHeaderText(headerText);
                return this;
            }

            public final Builder setStatusBarColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.toolbarCustomization.setStatusBarColor(hexColor);
                return this;
            }

            public final Builder setTextColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.toolbarCustomization.setTextColor(hexColor);
                return this;
            }

            public final Builder setTextFontName(String fontName) throws RuntimeException {
                Intrinsics.checkNotNullParameter(fontName, "fontName");
                this.toolbarCustomization.setTextFontName(fontName);
                return this;
            }

            public final Builder setTextFontSize(int i) throws RuntimeException {
                this.toolbarCustomization.setTextFontSize(i);
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Stripe3ds2ToolbarCustomization build() {
                return new Stripe3ds2ToolbarCustomization(this.toolbarCustomization);
            }
        }

        public Stripe3ds2ToolbarCustomization(ToolbarCustomization toolbarCustomization) {
            Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
            this.toolbarCustomization = toolbarCustomization;
        }

        public static /* synthetic */ Stripe3ds2ToolbarCustomization copy$default(Stripe3ds2ToolbarCustomization stripe3ds2ToolbarCustomization, ToolbarCustomization toolbarCustomization, int i, Object obj) {
            if ((i & 1) != 0) {
                toolbarCustomization = stripe3ds2ToolbarCustomization.toolbarCustomization;
            }
            return stripe3ds2ToolbarCustomization.copy(toolbarCustomization);
        }

        public final ToolbarCustomization component1$payments_core_release() {
            return this.toolbarCustomization;
        }

        public final Stripe3ds2ToolbarCustomization copy(ToolbarCustomization toolbarCustomization) {
            Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
            return new Stripe3ds2ToolbarCustomization(toolbarCustomization);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stripe3ds2ToolbarCustomization) && Intrinsics.areEqual(this.toolbarCustomization, ((Stripe3ds2ToolbarCustomization) obj).toolbarCustomization);
        }

        public final ToolbarCustomization getToolbarCustomization$payments_core_release() {
            return this.toolbarCustomization;
        }

        public int hashCode() {
            return this.toolbarCustomization.hashCode();
        }

        public String toString() {
            ToolbarCustomization toolbarCustomization = this.toolbarCustomization;
            return "Stripe3ds2ToolbarCustomization(toolbarCustomization=" + toolbarCustomization + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "Landroid/os/Parcelable;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V", "getUiCustomization", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "ButtonType", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Stripe3ds2UiCustomization implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Stripe3ds2UiCustomization> CREATOR = new Creator();
        private final StripeUiCustomization uiCustomization;

        @Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "()V", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "getUiButtonType", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;", "buttonType", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$ButtonType;", "setAccentColor", "hexColor", "", "setButtonCustomization", "buttonCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;", "setLabelCustomization", "labelCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;", "setTextBoxCustomization", "textBoxCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;", "setToolbarCustomization", "toolbarCustomization", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Builder implements ObjectBuilder<Stripe3ds2UiCustomization> {
            private final StripeUiCustomization uiCustomization;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;

            @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder$Companion;", "", "()V", "createWithAppTheme", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "activity", "Landroid/app/Activity;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @JvmStatic
                public final Builder createWithAppTheme(Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    return new Builder(activity, null);
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes6.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ButtonType.values().length];
                    try {
                        iArr[ButtonType.SUBMIT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ButtonType.CONTINUE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ButtonType.NEXT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ButtonType.CANCEL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ButtonType.RESEND.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ButtonType.SELECT.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Builder(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
                this(activity);
            }

            @JvmStatic
            public static final Builder createWithAppTheme(Activity activity) {
                return Companion.createWithAppTheme(activity);
            }

            private final UiCustomization.ButtonType getUiButtonType(ButtonType buttonType) throws RuntimeException {
                switch (WhenMappings.$EnumSwitchMapping$0[buttonType.ordinal()]) {
                    case 1:
                        return UiCustomization.ButtonType.SUBMIT;
                    case 2:
                        return UiCustomization.ButtonType.CONTINUE;
                    case 3:
                        return UiCustomization.ButtonType.NEXT;
                    case 4:
                        return UiCustomization.ButtonType.CANCEL;
                    case 5:
                        return UiCustomization.ButtonType.RESEND;
                    case 6:
                        return UiCustomization.ButtonType.SELECT;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }

            public final Builder setAccentColor(String hexColor) throws RuntimeException {
                Intrinsics.checkNotNullParameter(hexColor, "hexColor");
                this.uiCustomization.setAccentColor(hexColor);
                return this;
            }

            public final Builder setButtonCustomization(Stripe3ds2ButtonCustomization buttonCustomization, ButtonType buttonType) throws RuntimeException {
                Intrinsics.checkNotNullParameter(buttonCustomization, "buttonCustomization");
                Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                this.uiCustomization.setButtonCustomization(buttonCustomization.getButtonCustomization$payments_core_release(), getUiButtonType(buttonType));
                return this;
            }

            public final Builder setLabelCustomization(Stripe3ds2LabelCustomization labelCustomization) throws RuntimeException {
                Intrinsics.checkNotNullParameter(labelCustomization, "labelCustomization");
                this.uiCustomization.setLabelCustomization(labelCustomization.getLabelCustomization$payments_core_release());
                return this;
            }

            public final Builder setTextBoxCustomization(Stripe3ds2TextBoxCustomization textBoxCustomization) throws RuntimeException {
                Intrinsics.checkNotNullParameter(textBoxCustomization, "textBoxCustomization");
                this.uiCustomization.setTextBoxCustomization(textBoxCustomization.getTextBoxCustomization$payments_core_release());
                return this;
            }

            public final Builder setToolbarCustomization(Stripe3ds2ToolbarCustomization toolbarCustomization) throws RuntimeException {
                Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
                this.uiCustomization.setToolbarCustomization(toolbarCustomization.getToolbarCustomization$payments_core_release());
                return this;
            }

            private Builder(StripeUiCustomization stripeUiCustomization) {
                this.uiCustomization = stripeUiCustomization;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Stripe3ds2UiCustomization build() {
                return new Stripe3ds2UiCustomization(this.uiCustomization);
            }

            public Builder() {
                this(new StripeUiCustomization());
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private Builder(Activity activity) {
                this(r2);
                StripeUiCustomization createWithAppTheme = StripeUiCustomization.createWithAppTheme(activity);
                Intrinsics.checkNotNullExpressionValue(createWithAppTheme, "createWithAppTheme(activity)");
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$ButtonType;", "", "(Ljava/lang/String;I)V", "SUBMIT", "CONTINUE", "NEXT", "CANCEL", "RESEND", "SELECT", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public enum ButtonType {
            SUBMIT,
            CONTINUE,
            NEXT,
            CANCEL,
            RESEND,
            SELECT
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Stripe3ds2UiCustomization> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2UiCustomization createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stripe3ds2UiCustomization((StripeUiCustomization) parcel.readParcelable(Stripe3ds2UiCustomization.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2UiCustomization[] newArray(int i) {
                return new Stripe3ds2UiCustomization[i];
            }
        }

        public Stripe3ds2UiCustomization(StripeUiCustomization uiCustomization) {
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            this.uiCustomization = uiCustomization;
        }

        public static /* synthetic */ Stripe3ds2UiCustomization copy$default(Stripe3ds2UiCustomization stripe3ds2UiCustomization, StripeUiCustomization stripeUiCustomization, int i, Object obj) {
            if ((i & 1) != 0) {
                stripeUiCustomization = stripe3ds2UiCustomization.uiCustomization;
            }
            return stripe3ds2UiCustomization.copy(stripeUiCustomization);
        }

        public final StripeUiCustomization component1() {
            return this.uiCustomization;
        }

        public final Stripe3ds2UiCustomization copy(StripeUiCustomization uiCustomization) {
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            return new Stripe3ds2UiCustomization(uiCustomization);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stripe3ds2UiCustomization) && Intrinsics.areEqual(this.uiCustomization, ((Stripe3ds2UiCustomization) obj).uiCustomization);
        }

        public final StripeUiCustomization getUiCustomization() {
            return this.uiCustomization;
        }

        public int hashCode() {
            return this.uiCustomization.hashCode();
        }

        public String toString() {
            StripeUiCustomization stripeUiCustomization = this.uiCustomization;
            return "Stripe3ds2UiCustomization(uiCustomization=" + stripeUiCustomization + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.uiCustomization, i);
        }
    }

    public /* synthetic */ PaymentAuthConfig(Stripe3ds2Config stripe3ds2Config, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripe3ds2Config);
    }

    @JvmStatic
    public static final PaymentAuthConfig get() {
        return Companion.get();
    }

    @JvmStatic
    public static final void init(PaymentAuthConfig paymentAuthConfig) {
        Companion.init(paymentAuthConfig);
    }

    public final Stripe3ds2Config getStripe3ds2Config$payments_core_release() {
        return this.stripe3ds2Config;
    }

    private PaymentAuthConfig(Stripe3ds2Config stripe3ds2Config) {
        this.stripe3ds2Config = stripe3ds2Config;
    }
}
