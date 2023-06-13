package com.stripe.android;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u0000 \t2\u00020\u0001:\u0003\t\n\u000bJ\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003H&¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionPrefs;", "", "getPaymentMethod", "Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;", "customerId", "", "savePaymentMethod", "", "paymentMethod", "Companion", "Default", "SelectedPaymentMethod", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public interface PaymentSessionPrefs {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String GOOGLE_PAY = "GooglePay";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionPrefs$Companion;", "", "()V", "GOOGLE_PAY", "", "PREF_FILE", "getPaymentMethodKey", "customerId", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String GOOGLE_PAY = "GooglePay";
        private static final String PREF_FILE = "PaymentSessionPrefs";

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getPaymentMethodKey(String str) {
            return "customer[" + str + "].payment_method";
        }
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionPrefs$Default;", "Lcom/stripe/android/PaymentSessionPrefs;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "getPaymentMethod", "Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;", "customerId", "", "savePaymentMethod", "", "paymentMethod", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Default implements PaymentSessionPrefs {
        public static final int $stable = 8;
        private final Lazy prefs$delegate;

        public Default(Context context) {
            Lazy lazy;
            Intrinsics.checkNotNullParameter(context, "context");
            lazy = LazyKt__LazyJVMKt.lazy(new PaymentSessionPrefs$Default$prefs$2(context));
            this.prefs$delegate = lazy;
        }

        @Override // com.stripe.android.PaymentSessionPrefs
        public SelectedPaymentMethod getPaymentMethod(String str) {
            SelectedPaymentMethod.Companion companion = SelectedPaymentMethod.Companion;
            String str2 = null;
            if (str != null) {
                str2 = getPrefs().getString(PaymentSessionPrefs.Companion.getPaymentMethodKey(str), null);
            }
            return companion.fromString(str2);
        }

        public final SharedPreferences getPrefs() {
            Object value = this.prefs$delegate.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-prefs>(...)");
            return (SharedPreferences) value;
        }

        @Override // com.stripe.android.PaymentSessionPrefs
        public void savePaymentMethod(String customerId, SelectedPaymentMethod selectedPaymentMethod) {
            String str;
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            SharedPreferences.Editor edit = getPrefs().edit();
            String paymentMethodKey = PaymentSessionPrefs.Companion.getPaymentMethodKey(customerId);
            if (selectedPaymentMethod != null) {
                str = selectedPaymentMethod.getStringValue();
            } else {
                str = null;
            }
            edit.putString(paymentMethodKey, str).apply();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;", "", "stringValue", "", "(Ljava/lang/String;)V", "getStringValue", "()Ljava/lang/String;", "Companion", "GooglePay", "Saved", "Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$GooglePay;", "Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$Saved;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class SelectedPaymentMethod {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String stringValue;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$Companion;", "", "()V", "fromString", "Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;", "value", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SelectedPaymentMethod fromString(String str) {
                if (Intrinsics.areEqual(str, "GooglePay")) {
                    return GooglePay.INSTANCE;
                }
                if (str != null) {
                    return new Saved(str);
                }
                return null;
            }

            private Companion() {
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$GooglePay;", "Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class GooglePay extends SelectedPaymentMethod {
            public static final int $stable = 0;
            public static final GooglePay INSTANCE = new GooglePay();

            private GooglePay() {
                super("GooglePay", null);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$Saved;", "Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;", "paymentMethodId", "", "(Ljava/lang/String;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Saved extends SelectedPaymentMethod {
            public static final int $stable = 0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Saved(String paymentMethodId) {
                super(paymentMethodId, null);
                Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            }
        }

        public /* synthetic */ SelectedPaymentMethod(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getStringValue() {
            return this.stringValue;
        }

        private SelectedPaymentMethod(String str) {
            this.stringValue = str;
        }
    }

    SelectedPaymentMethod getPaymentMethod(String str);

    void savePaymentMethod(String str, SelectedPaymentMethod selectedPaymentMethod);
}
