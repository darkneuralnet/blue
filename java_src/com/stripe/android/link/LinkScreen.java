package com.stripe.android.link;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/link/LinkScreen;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "CardEdit", "Loading", "PaymentMethod", "SignUp", "Verification", "VerificationDialog", "Wallet", "Lcom/stripe/android/link/LinkScreen$CardEdit;", "Lcom/stripe/android/link/LinkScreen$Loading;", "Lcom/stripe/android/link/LinkScreen$PaymentMethod;", "Lcom/stripe/android/link/LinkScreen$SignUp;", "Lcom/stripe/android/link/LinkScreen$Verification;", "Lcom/stripe/android/link/LinkScreen$VerificationDialog;", "Lcom/stripe/android/link/LinkScreen$Wallet;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class LinkScreen {
    private final String route;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\b\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/link/LinkScreen$CardEdit;", "Lcom/stripe/android/link/LinkScreen;", "paymentDetailsId", "", "(Ljava/lang/String;)V", "route", "getRoute", "()Ljava/lang/String;", "route$1", "Companion", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class CardEdit extends LinkScreen {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public static final String idArg = "id";
        public static final String route = "CardEdit?id={id}";
        private final String route$1;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/link/LinkScreen$CardEdit$Companion;", "", "()V", "idArg", "", "route", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public CardEdit(String paymentDetailsId) {
            super("CardEdit?id=" + r3, null);
            String urlEncode;
            Intrinsics.checkNotNullParameter(paymentDetailsId, "paymentDetailsId");
            urlEncode = LinkScreenKt.urlEncode(paymentDetailsId);
            this.route$1 = super.getRoute();
        }

        @Override // com.stripe.android.link.LinkScreen
        public String getRoute() {
            return this.route$1;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/link/LinkScreen$Loading;", "Lcom/stripe/android/link/LinkScreen;", "()V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Loading extends LinkScreen {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super("Loading", null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\n\n\u0002\b\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/link/LinkScreen$PaymentMethod;", "Lcom/stripe/android/link/LinkScreen;", PaymentMethod.loadArg, "", "(Z)V", "route", "", "getRoute", "()Ljava/lang/String;", "route$1", "Companion", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class PaymentMethod extends LinkScreen {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public static final String loadArg = "loadFromArgs";
        public static final String route = "PaymentMethod?loadFromArgs={loadFromArgs}";
        private final String route$1;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/link/LinkScreen$PaymentMethod$Companion;", "", "()V", "loadArg", "", "route", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public PaymentMethod() {
            this(false, 1, null);
        }

        @Override // com.stripe.android.link.LinkScreen
        public String getRoute() {
            return this.route$1;
        }

        public /* synthetic */ PaymentMethod(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public PaymentMethod(boolean z) {
            super("PaymentMethod?loadFromArgs=" + z, null);
            this.route$1 = super.getRoute();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/link/LinkScreen$SignUp;", "Lcom/stripe/android/link/LinkScreen;", "()V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class SignUp extends LinkScreen {
        public static final int $stable = 0;
        public static final SignUp INSTANCE = new SignUp();

        private SignUp() {
            super("SignUp", null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/link/LinkScreen$Verification;", "Lcom/stripe/android/link/LinkScreen;", "()V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Verification extends LinkScreen {
        public static final int $stable = 0;
        public static final Verification INSTANCE = new Verification();

        private Verification() {
            super("Verification", null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/link/LinkScreen$VerificationDialog;", "Lcom/stripe/android/link/LinkScreen;", "()V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class VerificationDialog extends LinkScreen {
        public static final int $stable = 0;
        public static final VerificationDialog INSTANCE = new VerificationDialog();

        private VerificationDialog() {
            super("VerificationDialog", null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/link/LinkScreen$Wallet;", "Lcom/stripe/android/link/LinkScreen;", "()V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Wallet extends LinkScreen {
        public static final int $stable = 0;
        public static final Wallet INSTANCE = new Wallet();

        private Wallet() {
            super("Wallet", null);
        }
    }

    public /* synthetic */ LinkScreen(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String getRoute() {
        return this.route;
    }

    private LinkScreen(String str) {
        this.route = str;
    }
}
