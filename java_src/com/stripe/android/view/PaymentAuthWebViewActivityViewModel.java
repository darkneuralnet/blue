package com.stripe.android.view;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.C11759u;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.init.p048ui.StripeToolbarCustomization;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002./B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R'\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u0014\u0010'\u001a\u00020$8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00060"}, m28432d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "LOr6;", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "request", "", "fireAnalytics", "logStart", "logError", "logComplete", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "", "", "extraHeaders$delegate", "Lkotlin/Lazy;", "getExtraHeaders", "()Ljava/util/Map;", "extraHeaders", "buttonText", "Ljava/lang/String;", "getButtonText$payments_core_release", "()Ljava/lang/String;", "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "toolbarTitle", "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "getToolbarTitle$payments_core_release", "()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "toolbarBackgroundColor", "getToolbarBackgroundColor$payments_core_release", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "getPaymentResult$payments_core_release", "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "paymentResult", "Landroid/content/Intent;", "getCancellationResult$payments_core_release", "()Landroid/content/Intent;", "cancellationResult", "<init>", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V", "Factory", "ToolbarTitleData", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentAuthWebViewActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentAuthWebViewActivityViewModel.kt\ncom/stripe/android/view/PaymentAuthWebViewActivityViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentAuthWebViewActivityViewModel extends AbstractC35048Or6 {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final PaymentBrowserAuthContract.Args args;
    private final /* synthetic */ String buttonText;
    private final Lazy extraHeaders$delegate;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final /* synthetic */ String toolbarBackgroundColor;
    private final /* synthetic */ ToolbarTitleData toolbarTitle;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "Landroid/app/Application;", "application", "Landroid/app/Application;", "Lcom/stripe/android/core/Logger;", "logger", "Lcom/stripe/android/core/Logger;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "<init>", "(Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b {
        private final Application application;
        private final PaymentBrowserAuthContract.Args args;
        private final Logger logger;

        public Factory(Application application, Logger logger, PaymentBrowserAuthContract.Args args) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(args, "args");
            this.application = application;
            this.logger = logger;
            this.args = args;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls, FE0 fe0) {
            return super.create(cls, fe0);
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Set of;
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            PaymentBrowserAuthContract.Args args = this.args;
            DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor(this.logger, T41.m84377b());
            Application application = this.application;
            String publishableKey = this.args.getPublishableKey();
            of = SetsKt__SetsJVMKt.setOf("PaymentAuthWebViewActivity");
            return new PaymentAuthWebViewActivityViewModel(args, defaultAnalyticsRequestExecutor, new PaymentAnalyticsRequestFactory(application, publishableKey, of));
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\fJ\u000e\u0010\r\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u000eJ\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "", Entry.TYPE_TEXT, "", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;)V", "getText$payments_core_release", "()Ljava/lang/String;", "getToolbarCustomization$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ToolbarTitleData {
        private final String text;
        private final StripeToolbarCustomization toolbarCustomization;

        public ToolbarTitleData(String text, StripeToolbarCustomization toolbarCustomization) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
            this.text = text;
            this.toolbarCustomization = toolbarCustomization;
        }

        public static /* synthetic */ ToolbarTitleData copy$default(ToolbarTitleData toolbarTitleData, String str, StripeToolbarCustomization stripeToolbarCustomization, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolbarTitleData.text;
            }
            if ((i & 2) != 0) {
                stripeToolbarCustomization = toolbarTitleData.toolbarCustomization;
            }
            return toolbarTitleData.copy(str, stripeToolbarCustomization);
        }

        public final String component1$payments_core_release() {
            return this.text;
        }

        public final StripeToolbarCustomization component2$payments_core_release() {
            return this.toolbarCustomization;
        }

        public final ToolbarTitleData copy(String text, StripeToolbarCustomization toolbarCustomization) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
            return new ToolbarTitleData(text, toolbarCustomization);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ToolbarTitleData) {
                ToolbarTitleData toolbarTitleData = (ToolbarTitleData) obj;
                return Intrinsics.areEqual(this.text, toolbarTitleData.text) && Intrinsics.areEqual(this.toolbarCustomization, toolbarTitleData.toolbarCustomization);
            }
            return false;
        }

        public final String getText$payments_core_release() {
            return this.text;
        }

        public final StripeToolbarCustomization getToolbarCustomization$payments_core_release() {
            return this.toolbarCustomization;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.toolbarCustomization.hashCode();
        }

        public String toString() {
            String str = this.text;
            StripeToolbarCustomization stripeToolbarCustomization = this.toolbarCustomization;
            return "ToolbarTitleData(text=" + str + ", toolbarCustomization=" + stripeToolbarCustomization + ")";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r2 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r3 != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentAuthWebViewActivityViewModel(PaymentBrowserAuthContract.Args args, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        Lazy lazy;
        String str;
        ToolbarTitleData toolbarTitleData;
        boolean isBlank;
        boolean z;
        boolean isBlank2;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.args = args;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        lazy = LazyKt__LazyJVMKt.lazy(PaymentAuthWebViewActivityViewModel$extraHeaders$2.INSTANCE);
        this.extraHeaders$delegate = lazy;
        StripeToolbarCustomization toolbarCustomization = args.getToolbarCustomization();
        boolean z2 = false;
        if (toolbarCustomization != null) {
            str = toolbarCustomization.getButtonText();
            if (str != null) {
                isBlank2 = StringsKt__StringsJVMKt.isBlank(str);
                z = isBlank2 ? z : false;
            }
            z = true;
        }
        str = null;
        this.buttonText = str;
        StripeToolbarCustomization toolbarCustomization2 = args.getToolbarCustomization();
        if (toolbarCustomization2 != null) {
            String it = toolbarCustomization2.getHeaderText();
            if (it != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(it);
            }
            z2 = true;
            it = z2 ? null : it;
            if (it != null) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                toolbarTitleData = new ToolbarTitleData(it, toolbarCustomization2);
                this.toolbarTitle = toolbarTitleData;
                StripeToolbarCustomization toolbarCustomization3 = args.getToolbarCustomization();
                this.toolbarBackgroundColor = toolbarCustomization3 != null ? toolbarCustomization3.getBackgroundColor() : null;
            }
        }
        toolbarTitleData = null;
        this.toolbarTitle = toolbarTitleData;
        StripeToolbarCustomization toolbarCustomization32 = args.getToolbarCustomization();
        this.toolbarBackgroundColor = toolbarCustomization32 != null ? toolbarCustomization32.getBackgroundColor() : null;
    }

    private final void fireAnalytics(AnalyticsRequest analyticsRequest) {
        this.analyticsRequestExecutor.executeAsync(analyticsRequest);
    }

    public final String getButtonText$payments_core_release() {
        return this.buttonText;
    }

    public final /* synthetic */ Intent getCancellationResult$payments_core_release() {
        int i;
        Intent intent = new Intent();
        PaymentFlowResult.Unvalidated paymentResult$payments_core_release = getPaymentResult$payments_core_release();
        if (this.args.getShouldCancelIntentOnUserNavigation()) {
            i = 3;
        } else {
            i = 1;
        }
        Intent putExtras = intent.putExtras(PaymentFlowResult.Unvalidated.copy$default(paymentResult$payments_core_release, null, i, null, this.args.getShouldCancelSource(), null, null, null, 117, null).toBundle());
        Intrinsics.checkNotNullExpressionValue(putExtras, "Intent().putExtras(\n    ….toBundle()\n            )");
        return putExtras;
    }

    public final Map<String, String> getExtraHeaders() {
        return (Map) this.extraHeaders$delegate.getValue();
    }

    public final /* synthetic */ PaymentFlowResult.Unvalidated getPaymentResult$payments_core_release() {
        String clientSecret = this.args.getClientSecret();
        String lastPathSegment = Uri.parse(this.args.getUrl()).getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return new PaymentFlowResult.Unvalidated(clientSecret, 0, null, false, lastPathSegment, null, this.args.getStripeAccountId(), 46, null);
    }

    public final String getToolbarBackgroundColor$payments_core_release() {
        return this.toolbarBackgroundColor;
    }

    public final ToolbarTitleData getToolbarTitle$payments_core_release() {
        return this.toolbarTitle;
    }

    public final void logComplete() {
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeComplete, null, null, null, null, 30, null));
    }

    public final void logError() {
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeError, null, null, null, null, 30, null));
    }

    public final void logStart() {
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeStart, null, null, null, null, 30, null));
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthWithWebView, null, null, null, null, 30, null));
    }
}
