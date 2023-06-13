package com.stripe.android.link;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.NonFallbackInjectable;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.injection.WeakMapInjectorRegistry;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.injection.DaggerLinkPaymentLauncherComponent;
import com.stripe.android.link.injection.LinkComponent;
import com.stripe.android.link.injection.LinkPaymentLauncherComponent;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.p042ui.cardedit.CardEditViewModel;
import com.stripe.android.link.p042ui.inline.UserInput;
import com.stripe.android.link.p042ui.paymentmethod.PaymentMethodViewModel;
import com.stripe.android.link.p042ui.paymentmethod.SupportedPaymentMethod;
import com.stripe.android.link.p042ui.signup.SignUpViewModel;
import com.stripe.android.link.p042ui.verification.VerificationViewModel;
import com.stripe.android.link.p042ui.wallet.WalletViewModel;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.uicore.address.AddressRepository;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0002QRB\u0081\u0001\b\u0001\u0012\u0006\u0010C\u001a\u00020B\u0012\u000e\b\u0001\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$\u0012\u000e\b\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00020%0(\u0012\u0010\b\u0001\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0(\u0012\b\b\u0001\u0010,\u001a\u00020\u001b\u0012\b\b\u0001\u0010E\u001a\u00020D\u0012\b\b\u0001\u0010F\u001a\u00020D\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010L\u001a\u00020K\u0012\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010J\u0006\u0010\u0014\u001a\u00020\tJ\u001a\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015J2\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0015H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020%0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00101\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u00104R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R(\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u00104\u001a\u0004\b:\u0010;R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006S"}, m28432d2 = {"Lcom/stripe/android/link/LinkPaymentLauncher;", "Lcom/stripe/android/core/injection/NonFallbackInjectable;", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "configuration", "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;", "getLinkPaymentLauncherComponent", "component", "Lcom/stripe/android/link/LinkActivityContract$Args;", "args", "", "buildLinkComponent", "LEu1;", "Lcom/stripe/android/link/model/AccountStatus;", "getAccountStatusFlow", "Lu5;", "activityResultCaller", "Lkotlin/Function1;", "Lcom/stripe/android/link/LinkActivityResult;", "callback", "register", "unregister", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "prefilledNewCardParams", "present", "Lcom/stripe/android/link/ui/inline/UserInput;", "userInput", "Lkotlin/Result;", "", "signInWithUserInput-0E7RQCE", "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInWithUserInput", "paymentMethodCreateParams", "Lcom/stripe/android/link/LinkPaymentDetails$New;", "attachNewCardToAccount-0E7RQCE", "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "attachNewCardToAccount", "", "", NamedConstantsKt.PRODUCT_USAGE, "Ljava/util/Set;", "Lkotlin/Function0;", "publishableKeyProvider", "Lkotlin/jvm/functions/Function0;", "stripeAccountIdProvider", com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING, "Z", "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;", "launcherComponentBuilder", "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;", "injectorKey", "Ljava/lang/String;", "getInjectorKey$annotations", "()V", "LGX2;", "componentFlow", "LGX2;", "emailFlow", "LEu1;", "getEmailFlow", "()LEu1;", "getEmailFlow$annotations", "LB5;", "linkActivityResultLauncher", "LB5;", "getComponent$link_release", "()Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/coroutines/CoroutineContext;", "ioContext", "uiContext", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/uicore/address/AddressRepository;", "addressRepository", "<init>", "(Landroid/content/Context;Ljava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/uicore/address/AddressRepository;)V", "Companion", "Configuration", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLinkPaymentLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkPaymentLauncher.kt\ncom/stripe/android/link/LinkPaymentLauncher\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,244:1\n47#2:245\n49#2:249\n50#3:246\n55#3:248\n106#4:247\n1#5:250\n*S KotlinDebug\n*F\n+ 1 LinkPaymentLauncher.kt\ncom/stripe/android/link/LinkPaymentLauncher\n*L\n91#1:245\n91#1:249\n91#1:246\n91#1:248\n91#1:247\n*E\n"})
/* loaded from: classes7.dex */
public final class LinkPaymentLauncher implements NonFallbackInjectable {
    public static final boolean LINK_ENABLED = true;
    private final GX2<LinkPaymentLauncherComponent> componentFlow;
    private final InterfaceC32730Eu1<String> emailFlow;
    private final boolean enableLogging;
    private final String injectorKey;
    private final LinkPaymentLauncherComponent.Builder launcherComponentBuilder;
    private AbstractC0407B5<LinkActivityContract.Args> linkActivityResultLauncher;
    private final Set<String> productUsage;
    private final Function0<String> publishableKeyProvider;
    private final Function0<String> stripeAccountIdProvider;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Set<String> supportedFundingSources = SupportedPaymentMethod.Companion.getAllTypes();

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/link/LinkPaymentLauncher$Companion;", "", "()V", "LINK_ENABLED", "", "supportedFundingSources", "", "", "getSupportedFundingSources", "()Ljava/util/Set;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<String> getSupportedFundingSources() {
            return LinkPaymentLauncher.supportedFundingSources;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0019\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000bHÆ\u0003Jg\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000bHÆ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, m28432d2 = {"Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "Landroid/os/Parcelable;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "merchantName", "", "customerName", "customerEmail", "customerPhone", "customerBillingCountryCode", com.stripe.android.core.injection.NamedConstantsKt.SHIPPING_VALUES, "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCustomerBillingCountryCode", "()Ljava/lang/String;", "getCustomerEmail", "getCustomerName", "getCustomerPhone", "getMerchantName", "getShippingValues", "()Ljava/util/Map;", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Configuration implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Configuration> CREATOR = new Creator();
        private final String customerBillingCountryCode;
        private final String customerEmail;
        private final String customerName;
        private final String customerPhone;
        private final String merchantName;
        private final Map<IdentifierSpec, String> shippingValues;
        private final StripeIntent stripeIntent;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Configuration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(Configuration.class.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashMap2.put(parcel.readParcelable(Configuration.class.getClassLoader()), parcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Configuration(stripeIntent, readString, readString2, readString3, readString4, readString5, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration[] newArray(int i) {
                return new Configuration[i];
            }
        }

        public Configuration(StripeIntent stripeIntent, String merchantName, String str, String str2, String str3, String str4, Map<IdentifierSpec, String> map) {
            Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            this.stripeIntent = stripeIntent;
            this.merchantName = merchantName;
            this.customerName = str;
            this.customerEmail = str2;
            this.customerPhone = str3;
            this.customerBillingCountryCode = str4;
            this.shippingValues = map;
        }

        public static /* synthetic */ Configuration copy$default(Configuration configuration, StripeIntent stripeIntent, String str, String str2, String str3, String str4, String str5, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                stripeIntent = configuration.stripeIntent;
            }
            if ((i & 2) != 0) {
                str = configuration.merchantName;
            }
            String str6 = str;
            if ((i & 4) != 0) {
                str2 = configuration.customerName;
            }
            String str7 = str2;
            if ((i & 8) != 0) {
                str3 = configuration.customerEmail;
            }
            String str8 = str3;
            if ((i & 16) != 0) {
                str4 = configuration.customerPhone;
            }
            String str9 = str4;
            if ((i & 32) != 0) {
                str5 = configuration.customerBillingCountryCode;
            }
            String str10 = str5;
            Map<IdentifierSpec, String> map2 = map;
            if ((i & 64) != 0) {
                map2 = configuration.shippingValues;
            }
            return configuration.copy(stripeIntent, str6, str7, str8, str9, str10, map2);
        }

        public final StripeIntent component1() {
            return this.stripeIntent;
        }

        public final String component2() {
            return this.merchantName;
        }

        public final String component3() {
            return this.customerName;
        }

        public final String component4() {
            return this.customerEmail;
        }

        public final String component5() {
            return this.customerPhone;
        }

        public final String component6() {
            return this.customerBillingCountryCode;
        }

        public final Map<IdentifierSpec, String> component7() {
            return this.shippingValues;
        }

        public final Configuration copy(StripeIntent stripeIntent, String merchantName, String str, String str2, String str3, String str4, Map<IdentifierSpec, String> map) {
            Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            return new Configuration(stripeIntent, merchantName, str, str2, str3, str4, map);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Configuration) {
                Configuration configuration = (Configuration) obj;
                return Intrinsics.areEqual(this.stripeIntent, configuration.stripeIntent) && Intrinsics.areEqual(this.merchantName, configuration.merchantName) && Intrinsics.areEqual(this.customerName, configuration.customerName) && Intrinsics.areEqual(this.customerEmail, configuration.customerEmail) && Intrinsics.areEqual(this.customerPhone, configuration.customerPhone) && Intrinsics.areEqual(this.customerBillingCountryCode, configuration.customerBillingCountryCode) && Intrinsics.areEqual(this.shippingValues, configuration.shippingValues);
            }
            return false;
        }

        public final String getCustomerBillingCountryCode() {
            return this.customerBillingCountryCode;
        }

        public final String getCustomerEmail() {
            return this.customerEmail;
        }

        public final String getCustomerName() {
            return this.customerName;
        }

        public final String getCustomerPhone() {
            return this.customerPhone;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public final Map<IdentifierSpec, String> getShippingValues() {
            return this.shippingValues;
        }

        public final StripeIntent getStripeIntent() {
            return this.stripeIntent;
        }

        public int hashCode() {
            int hashCode = ((this.stripeIntent.hashCode() * 31) + this.merchantName.hashCode()) * 31;
            String str = this.customerName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.customerEmail;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.customerPhone;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.customerBillingCountryCode;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Map<IdentifierSpec, String> map = this.shippingValues;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            StripeIntent stripeIntent = this.stripeIntent;
            String str = this.merchantName;
            String str2 = this.customerName;
            String str3 = this.customerEmail;
            String str4 = this.customerPhone;
            String str5 = this.customerBillingCountryCode;
            Map<IdentifierSpec, String> map = this.shippingValues;
            return "Configuration(stripeIntent=" + stripeIntent + ", merchantName=" + str + ", customerName=" + str2 + ", customerEmail=" + str3 + ", customerPhone=" + str4 + ", customerBillingCountryCode=" + str5 + ", shippingValues=" + map + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.stripeIntent, i);
            out.writeString(this.merchantName);
            out.writeString(this.customerName);
            out.writeString(this.customerEmail);
            out.writeString(this.customerPhone);
            out.writeString(this.customerBillingCountryCode);
            Map<IdentifierSpec, String> map = this.shippingValues;
            if (map == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<IdentifierSpec, String> entry : map.entrySet()) {
                out.writeParcelable(entry.getKey(), i);
                out.writeString(entry.getValue());
            }
        }
    }

    public LinkPaymentLauncher(Context context, Set<String> productUsage, Function0<String> publishableKeyProvider, Function0<String> stripeAccountIdProvider, boolean z, @IOContext CoroutineContext ioContext, @UIContext CoroutineContext uiContext, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor, StripeRepository stripeRepository, AddressRepository addressRepository) {
        final InterfaceC32730Eu1 m42390b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeAccountIdProvider, "stripeAccountIdProvider");
        Intrinsics.checkNotNullParameter(ioContext, "ioContext");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(addressRepository, "addressRepository");
        this.productUsage = productUsage;
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
        this.enableLogging = z;
        this.launcherComponentBuilder = DaggerLinkPaymentLauncherComponent.builder().context(context).ioContext(ioContext).uiContext(uiContext).analyticsRequestFactory(paymentAnalyticsRequestFactory).analyticsRequestExecutor(analyticsRequestExecutor).stripeRepository(stripeRepository).addressRepository(addressRepository).enableLogging(z).publishableKeyProvider(publishableKeyProvider).stripeAccountIdProvider(stripeAccountIdProvider).productUsage(productUsage);
        WeakMapInjectorRegistry weakMapInjectorRegistry = WeakMapInjectorRegistry.INSTANCE;
        String simpleName = Reflection.getOrCreateKotlinClass(LinkPaymentLauncher.class).getSimpleName();
        if (simpleName != null) {
            this.injectorKey = weakMapInjectorRegistry.nextKey(simpleName);
            GX2<LinkPaymentLauncherComponent> m8742a = C50405vP5.m8742a(null);
            this.componentFlow = m8742a;
            m42390b = C40631ev1.m42390b(C36708Vu1.m79249v(m8742a), 0, new LinkPaymentLauncher$emailFlow$1(null), 1, null);
            this.emailFlow = new InterfaceC32730Eu1<String>() { // from class: com.stripe.android.link.LinkPaymentLauncher$special$$inlined$map$1

                @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 LinkPaymentLauncher.kt\ncom/stripe/android/link/LinkPaymentLauncher\n*L\n1#1,222:1\n48#2:223\n91#3:224\n*E\n"})
                /* renamed from: com.stripe.android.link.LinkPaymentLauncher$special$$inlined$map$1$2 */
                /* loaded from: classes7.dex */
                public static final class C189732<T> implements InterfaceC33198Gu1 {
                    final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                    @DebugMetadata(m28419c = "com.stripe.android.link.LinkPaymentLauncher$special$$inlined$map$1$2", m28418f = "LinkPaymentLauncher.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    /* renamed from: com.stripe.android.link.LinkPaymentLauncher$special$$inlined$map$1$2$1 */
                    /* loaded from: classes7.dex */
                    public static final class C189741 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public C189741(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C189732.this.emit(null, this);
                        }
                    }

                    public C189732(InterfaceC33198Gu1 interfaceC33198Gu1) {
                        this.$this_unsafeFlow = interfaceC33198Gu1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // p000.InterfaceC33198Gu1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        C189741 c189741;
                        Object coroutine_suspended;
                        int i;
                        String str;
                        if (continuation instanceof C189741) {
                            c189741 = (C189741) continuation;
                            int i2 = c189741.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                c189741.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = c189741.result;
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = c189741.label;
                                if (i == 0) {
                                    if (i == 1) {
                                        ResultKt.throwOnFailure(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    ResultKt.throwOnFailure(obj2);
                                    InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                    LinkAccount linkAccount = (LinkAccount) obj;
                                    if (linkAccount != null) {
                                        str = linkAccount.getEmail();
                                    } else {
                                        str = null;
                                    }
                                    c189741.label = 1;
                                    if (interfaceC33198Gu1.emit(str, c189741) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        c189741 = new C189741(continuation);
                        Object obj22 = c189741.result;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c189741.label;
                        if (i == 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // p000.InterfaceC32730Eu1
                public Object collect(InterfaceC33198Gu1<? super String> interfaceC33198Gu1, Continuation continuation) {
                    Object coroutine_suspended;
                    Object collect = InterfaceC32730Eu1.this.collect(new C189732(interfaceC33198Gu1), continuation);
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (collect == coroutine_suspended) {
                        return collect;
                    }
                    return Unit.INSTANCE;
                }
            };
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void buildLinkComponent(LinkPaymentLauncherComponent linkPaymentLauncherComponent, LinkActivityContract.Args args) {
        final LinkComponent build = linkPaymentLauncherComponent.getLinkComponentBuilder().starterArgs(args).build();
        WeakMapInjectorRegistry.INSTANCE.register(new NonFallbackInjector() { // from class: com.stripe.android.link.LinkPaymentLauncher$buildLinkComponent$injector$1
            @Override // com.stripe.android.core.injection.Injector
            public void inject(Injectable<?> injectable) {
                Intrinsics.checkNotNullParameter(injectable, "injectable");
                if (injectable instanceof LinkActivityViewModel.Factory) {
                    LinkComponent.this.inject((LinkActivityViewModel.Factory) injectable);
                } else if (injectable instanceof SignUpViewModel.Factory) {
                    LinkComponent.this.inject((SignUpViewModel.Factory) injectable);
                } else if (injectable instanceof VerificationViewModel.Factory) {
                    LinkComponent.this.inject((VerificationViewModel.Factory) injectable);
                } else if (injectable instanceof WalletViewModel.Factory) {
                    LinkComponent.this.inject((WalletViewModel.Factory) injectable);
                } else if (injectable instanceof PaymentMethodViewModel.Factory) {
                    LinkComponent.this.inject((PaymentMethodViewModel.Factory) injectable);
                } else if (injectable instanceof CardEditViewModel.Factory) {
                    LinkComponent.this.inject((CardEditViewModel.Factory) injectable);
                } else {
                    throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
                }
            }
        }, this.injectorKey);
    }

    public static /* synthetic */ void getEmailFlow$annotations() {
    }

    @InjectorKey
    private static /* synthetic */ void getInjectorKey$annotations() {
    }

    private final LinkPaymentLauncherComponent getLinkPaymentLauncherComponent(Configuration configuration) {
        LinkPaymentLauncherComponent component$link_release = getComponent$link_release();
        if (component$link_release != null) {
            if (!Intrinsics.areEqual(component$link_release.getConfiguration(), configuration)) {
                component$link_release = null;
            }
            if (component$link_release != null) {
                return component$link_release;
            }
        }
        LinkPaymentLauncherComponent build = this.launcherComponentBuilder.configuration(configuration).build();
        this.componentFlow.setValue(build);
        return build;
    }

    public static /* synthetic */ void present$default(LinkPaymentLauncher linkPaymentLauncher, Configuration configuration, PaymentMethodCreateParams paymentMethodCreateParams, int i, Object obj) {
        if ((i & 2) != 0) {
            paymentMethodCreateParams = null;
        }
        linkPaymentLauncher.present(configuration, paymentMethodCreateParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$1(Function1 tmp0, LinkActivityResult linkActivityResult) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(linkActivityResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: attachNewCardToAccount-0E7RQCE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116483attachNewCardToAccount0E7RQCE(Configuration configuration, PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super Result<LinkPaymentDetails.New>> continuation) {
        LinkPaymentLauncher$attachNewCardToAccount$1 linkPaymentLauncher$attachNewCardToAccount$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof LinkPaymentLauncher$attachNewCardToAccount$1) {
            linkPaymentLauncher$attachNewCardToAccount$1 = (LinkPaymentLauncher$attachNewCardToAccount$1) continuation;
            int i2 = linkPaymentLauncher$attachNewCardToAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkPaymentLauncher$attachNewCardToAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkPaymentLauncher$attachNewCardToAccount$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkPaymentLauncher$attachNewCardToAccount$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).m116792unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LinkAccountManager linkAccountManager = getLinkPaymentLauncherComponent(configuration).getLinkAccountManager();
                linkPaymentLauncher$attachNewCardToAccount$1.label = 1;
                Object m116491createCardPaymentDetailsgIAlus = linkAccountManager.m116491createCardPaymentDetailsgIAlus(paymentMethodCreateParams, linkPaymentLauncher$attachNewCardToAccount$1);
                if (m116491createCardPaymentDetailsgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return m116491createCardPaymentDetailsgIAlus;
            }
        }
        linkPaymentLauncher$attachNewCardToAccount$1 = new LinkPaymentLauncher$attachNewCardToAccount$1(this, continuation);
        Object obj2 = linkPaymentLauncher$attachNewCardToAccount$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkPaymentLauncher$attachNewCardToAccount$1.label;
        if (i == 0) {
        }
    }

    @Override // com.stripe.android.core.injection.Injectable
    public /* bridge */ /* synthetic */ Injector fallbackInitialize(Unit unit) {
        return (Injector) fallbackInitialize2(unit);
    }

    public final InterfaceC32730Eu1<AccountStatus> getAccountStatusFlow(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return getLinkPaymentLauncherComponent(configuration).getLinkAccountManager().getAccountStatus();
    }

    public final LinkPaymentLauncherComponent getComponent$link_release() {
        return this.componentFlow.getValue();
    }

    public final InterfaceC32730Eu1<String> getEmailFlow() {
        return this.emailFlow;
    }

    public final void present(Configuration configuration, PaymentMethodCreateParams paymentMethodCreateParams) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        LinkActivityContract.Args args = new LinkActivityContract.Args(configuration, paymentMethodCreateParams, new LinkActivityContract.Args.InjectionParams(this.injectorKey, this.productUsage, this.enableLogging, this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke()));
        buildLinkComponent(getLinkPaymentLauncherComponent(configuration), args);
        AbstractC0407B5<LinkActivityContract.Args> abstractC0407B5 = this.linkActivityResultLauncher;
        if (abstractC0407B5 != null) {
            abstractC0407B5.m114705a(args);
        }
    }

    public final void register(InterfaceC29050u5 activityResultCaller, final Function1<? super LinkActivityResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.linkActivityResultLauncher = activityResultCaller.registerForActivityResult(new LinkActivityContract(), new InterfaceC28515t5() { // from class: Or2
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                LinkPaymentLauncher.register$lambda$1(Function1.this, (LinkActivityResult) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* renamed from: signInWithUserInput-0E7RQCE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m116484signInWithUserInput0E7RQCE(Configuration configuration, UserInput userInput, Continuation<? super Result<Boolean>> continuation) {
        LinkPaymentLauncher$signInWithUserInput$1 linkPaymentLauncher$signInWithUserInput$1;
        Object coroutine_suspended;
        int i;
        Object m116496signInWithUserInputgIAlus;
        if (continuation instanceof LinkPaymentLauncher$signInWithUserInput$1) {
            linkPaymentLauncher$signInWithUserInput$1 = (LinkPaymentLauncher$signInWithUserInput$1) continuation;
            int i2 = linkPaymentLauncher$signInWithUserInput$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkPaymentLauncher$signInWithUserInput$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkPaymentLauncher$signInWithUserInput$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkPaymentLauncher$signInWithUserInput$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        m116496signInWithUserInputgIAlus = ((Result) obj).m116792unboximpl();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    LinkAccountManager linkAccountManager = getLinkPaymentLauncherComponent(configuration).getLinkAccountManager();
                    linkPaymentLauncher$signInWithUserInput$1.label = 1;
                    m116496signInWithUserInputgIAlus = linkAccountManager.m116496signInWithUserInputgIAlus(userInput, linkPaymentLauncher$signInWithUserInput$1);
                    if (m116496signInWithUserInputgIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (Result.m116790isSuccessimpl(m116496signInWithUserInputgIAlus)) {
                    LinkAccount linkAccount = (LinkAccount) m116496signInWithUserInputgIAlus;
                    m116496signInWithUserInputgIAlus = Boxing.boxBoolean(true);
                }
                return Result.m116783constructorimpl(m116496signInWithUserInputgIAlus);
            }
        }
        linkPaymentLauncher$signInWithUserInput$1 = new LinkPaymentLauncher$signInWithUserInput$1(this, continuation);
        Object obj2 = linkPaymentLauncher$signInWithUserInput$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkPaymentLauncher$signInWithUserInput$1.label;
        if (i == 0) {
        }
        if (Result.m116790isSuccessimpl(m116496signInWithUserInputgIAlus)) {
        }
        return Result.m116783constructorimpl(m116496signInWithUserInputgIAlus);
    }

    public final void unregister() {
        AbstractC0407B5<LinkActivityContract.Args> abstractC0407B5 = this.linkActivityResultLauncher;
        if (abstractC0407B5 != null) {
            abstractC0407B5.mo67435c();
        }
        this.linkActivityResultLauncher = null;
    }

    @Override // com.stripe.android.core.injection.NonFallbackInjectable
    /* renamed from: fallbackInitialize  reason: avoid collision after fix types in other method */
    public Void fallbackInitialize2(Unit unit) {
        return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, unit);
    }
}
