package com.stripe.android.payments;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.C11747p;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11759u;
import com.stripe.android.C18606R;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.browser.BrowserCapabilities;
import com.stripe.android.core.browser.BrowserCapabilitiesSupplier;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.utils.CreationExtrasKtxKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p000.C47940rF0;
import p000.C50903wF0;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 $2\u00020\u0001:\u0002$%B/\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R+\u0010!\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006&"}, m28432d2 = {"Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;", "LOr6;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "args", "Landroid/content/Intent;", "createLaunchIntent", "getResultIntent", "", "shouldUseCustomTabs", "", "logCapabilities", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lcom/stripe/android/core/browser/BrowserCapabilities;", "browserCapabilities", "Lcom/stripe/android/core/browser/BrowserCapabilities;", "", "intentChooserTitle", "Ljava/lang/String;", "Landroidx/lifecycle/p;", "savedStateHandle", "Landroidx/lifecycle/p;", "<set-?>", "hasLaunched$delegate", "Lkotlin/properties/ReadWriteProperty;", "getHasLaunched", "()Z", "setHasLaunched", "(Z)V", "hasLaunched", "<init>", "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/browser/BrowserCapabilities;Ljava/lang/String;Landroidx/lifecycle/p;)V", "Companion", "Factory", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStripeBrowserLauncherViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeBrowserLauncherViewModel.kt\ncom/stripe/android/payments/StripeBrowserLauncherViewModel\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,128:1\n33#2,3:129\n*S KotlinDebug\n*F\n+ 1 StripeBrowserLauncherViewModel.kt\ncom/stripe/android/payments/StripeBrowserLauncherViewModel\n*L\n32#1:129,3\n*E\n"})
/* loaded from: classes7.dex */
public final class StripeBrowserLauncherViewModel extends AbstractC35048Or6 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(StripeBrowserLauncherViewModel.class, "hasLaunched", "getHasLaunched()Z", 0))};
    public static final Companion Companion = new Companion(null);
    public static final String KEY_HAS_LAUNCHED = "has_launched";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final BrowserCapabilities browserCapabilities;
    private final ReadWriteProperty hasLaunched$delegate;
    private final String intentChooserTitle;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final C11747p savedStateHandle;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/payments/StripeBrowserLauncherViewModel$Companion;", "", "()V", "KEY_HAS_LAUNCHED", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/payments/StripeBrowserLauncherViewModel$Factory;", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "<init>", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b {
        public static final int $stable = 0;

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls) {
            return super.create(cls);
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Application requireApplication = CreationExtrasKtxKt.requireApplication(extras);
            C11747p m66936a = C11750q.m66936a(extras);
            PaymentConfiguration companion = PaymentConfiguration.Companion.getInstance(requireApplication);
            BrowserCapabilitiesSupplier browserCapabilitiesSupplier = new BrowserCapabilitiesSupplier(requireApplication);
            DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = new DefaultAnalyticsRequestExecutor();
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = new PaymentAnalyticsRequestFactory(requireApplication, companion.getPublishableKey(), (Set) null, 4, (DefaultConstructorMarker) null);
            BrowserCapabilities browserCapabilities = browserCapabilitiesSupplier.get();
            String string = requireApplication.getString(C18606R.string.stripe_verify_your_payment);
            Intrinsics.checkNotNullExpressionValue(string, "application.getString(R.…ripe_verify_your_payment)");
            return new StripeBrowserLauncherViewModel(defaultAnalyticsRequestExecutor, paymentAnalyticsRequestFactory, browserCapabilities, string, m66936a);
        }
    }

    public StripeBrowserLauncherViewModel(AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, BrowserCapabilities browserCapabilities, String intentChooserTitle, C11747p savedStateHandle) {
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(browserCapabilities, "browserCapabilities");
        Intrinsics.checkNotNullParameter(intentChooserTitle, "intentChooserTitle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.browserCapabilities = browserCapabilities;
        this.intentChooserTitle = intentChooserTitle;
        this.savedStateHandle = savedStateHandle;
        Delegates delegates = Delegates.INSTANCE;
        final Boolean valueOf = Boolean.valueOf(savedStateHandle.m66948e("has_launched"));
        this.hasLaunched$delegate = new ObservableProperty<Boolean>(valueOf) { // from class: com.stripe.android.payments.StripeBrowserLauncherViewModel$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, Boolean bool, Boolean bool2) {
                C11747p c11747p;
                Intrinsics.checkNotNullParameter(property, "property");
                bool2.booleanValue();
                bool.booleanValue();
                c11747p = this.savedStateHandle;
                c11747p.m66940m("has_launched", Boolean.TRUE);
            }
        };
    }

    public final Intent createLaunchIntent(PaymentBrowserAuthContract.Args args) {
        boolean z;
        C47940rF0 c47940rF0;
        Intrinsics.checkNotNullParameter(args, "args");
        if (this.browserCapabilities == BrowserCapabilities.CustomTabs) {
            z = true;
        } else {
            z = false;
        }
        logCapabilities(z);
        Uri parse = Uri.parse(args.getUrl());
        if (z) {
            Integer statusBarColor = args.getStatusBarColor();
            if (statusBarColor != null) {
                c47940rF0 = new C47940rF0.C27890a().m16156b(statusBarColor.intValue()).m16157a();
            } else {
                c47940rF0 = null;
            }
            C50903wF0.C29819b m7158f = new C50903wF0.C29819b().m7158f(2);
            if (c47940rF0 != null) {
                m7158f.m7161c(c47940rF0);
            }
            C50903wF0 m7163a = m7158f.m7163a();
            Intrinsics.checkNotNullExpressionValue(m7163a, "Builder()\n              …\n                .build()");
            m7163a.f115676a.setData(parse);
            Intent createChooser = Intent.createChooser(m7163a.f115676a, this.intentChooserTitle);
            Intrinsics.checkNotNullExpressionValue(createChooser, "{\n            val custom…e\n            )\n        }");
            return createChooser;
        }
        Intent createChooser2 = Intent.createChooser(new Intent("android.intent.action.VIEW", parse), this.intentChooserTitle);
        Intrinsics.checkNotNullExpressionValue(createChooser2, "{\n            // use def…e\n            )\n        }");
        return createChooser2;
    }

    public final boolean getHasLaunched() {
        return ((Boolean) this.hasLaunched$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final Intent getResultIntent(PaymentBrowserAuthContract.Args args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Uri parse = Uri.parse(args.getUrl());
        Intent intent = new Intent();
        String clientSecret = args.getClientSecret();
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String stripeAccountId = args.getStripeAccountId();
        Intent putExtras = intent.putExtras(new PaymentFlowResult.Unvalidated(clientSecret, 0, null, args.getShouldCancelSource(), lastPathSegment, null, stripeAccountId, 38, null).toBundle());
        Intrinsics.checkNotNullExpressionValue(putExtras, "Intent().putExtras(\n    …   ).toBundle()\n        )");
        return putExtras;
    }

    public final void logCapabilities(boolean z) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        AnalyticsRequestExecutor analyticsRequestExecutor = this.analyticsRequestExecutor;
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = this.paymentAnalyticsRequestFactory;
        if (z) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.AuthWithCustomTabs;
        } else if (!z) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.AuthWithDefaultBrowser;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, 30, null));
    }

    public final void setHasLaunched(boolean z) {
        this.hasLaunched$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
