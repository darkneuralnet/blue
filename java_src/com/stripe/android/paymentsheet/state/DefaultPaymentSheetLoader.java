package com.stripe.android.paymentsheet.state;

import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.googlepaylauncher.GooglePayEnvironment;
import com.stripe.android.googlepaylauncher.GooglePayRepository;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ElementsSession;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.p049ui.core.forms.resources.LpmRepository;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.addresselement.AddressDetailsKt;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.model.SupportedPaymentMethodKtxKt;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.paymentsheet.state.PaymentSheetLoader;
import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0087\u0001\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0019\u0010\u0004\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\b\b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ5\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010&J#\u0010'\u001a\u00020(2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001f\u001a\u00020 H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)J(\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010$\u001a\u00020%2\u0006\u0010,\u001a\u00020%2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\u001b\u0010$\u001a\u00020%2\b\u00100\u001a\u0004\u0018\u00010#H\u0082@ø\u0001\u0000¢\u0006\u0002\u00101J#\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u0002042\b\u00100\u001a\u0004\u0018\u00010#H\u0096@ø\u0001\u0000¢\u0006\u0002\u00105J#\u00106\u001a\u0002072\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u001f\u001a\u00020 H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)J1\u00108\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010!\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u00109J#\u0010:\u001a\u00020 2\u0006\u00103\u001a\u0002042\b\u0010;\u001a\u0004\u0018\u00010#H\u0082@ø\u0001\u0000¢\u0006\u0002\u00105J7\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%2\u0006\u0010,\u001a\u00020%2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010?R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\b\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0004\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;", NamedConstantsKt.APP_NAME, "", "prefsRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "Lkotlin/jvm/JvmSuppressWildcards;", "googlePayRepositoryFactory", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "elementsSessionRepository", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;", "stripeIntentValidator", "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;", "customerRepository", "Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;", "lpmRepository", "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;", "logger", "Lcom/stripe/android/core/Logger;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "accountStatusProvider", "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;)V", "create", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "customerConfig", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "isGooglePayReady", "", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLinkConfiguration", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "determineDefaultPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "isLinkReady", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentSheetConfiguration", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "initializationMode", "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLinkState", "Lcom/stripe/android/paymentsheet/state/LinkState;", "retrieveCustomerPaymentMethods", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveElementsSession", "configuration", "retrieveSavedPaymentSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "prefsRepository", "(Lcom/stripe/android/paymentsheet/PrefsRepository;ZZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentSheetLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetLoader.kt\ncom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n1603#2,9:305\n1855#2:314\n1856#2:316\n1612#2:317\n766#2:318\n857#2,2:319\n1#3:315\n*S KotlinDebug\n*F\n+ 1 PaymentSheetLoader.kt\ncom/stripe/android/paymentsheet/state/DefaultPaymentSheetLoader\n*L\n172#1:305,9\n172#1:314\n172#1:316\n172#1:317\n181#1:318\n181#1:319,2\n172#1:315\n*E\n"})
/* loaded from: classes7.dex */
public final class DefaultPaymentSheetLoader implements PaymentSheetLoader {
    private final LinkAccountStatusProvider accountStatusProvider;
    private final String appName;
    private final CustomerRepository customerRepository;
    private final ElementsSessionRepository elementsSessionRepository;
    private final EventReporter eventReporter;
    private final Function1<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory;
    private final Logger logger;
    private final LpmRepository lpmRepository;
    private final Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> prefsRepositoryFactory;
    private final StripeIntentValidator stripeIntentValidator;
    private final CoroutineContext workContext;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentSheet.GooglePayConfiguration.Environment.values().length];
            try {
                iArr[PaymentSheet.GooglePayConfiguration.Environment.Production.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentSheet.GooglePayConfiguration.Environment.Test.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AccountStatus.values().length];
            try {
                iArr2[AccountStatus.Verified.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AccountStatus.NeedsVerification.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AccountStatus.VerificationStarted.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AccountStatus.SignedOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AccountStatus.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DefaultPaymentSheetLoader(String appName, Function1<PaymentSheet.CustomerConfiguration, PrefsRepository> prefsRepositoryFactory, Function1<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory, ElementsSessionRepository elementsSessionRepository, StripeIntentValidator stripeIntentValidator, CustomerRepository customerRepository, LpmRepository lpmRepository, Logger logger, EventReporter eventReporter, @IOContext CoroutineContext workContext, LinkAccountStatusProvider accountStatusProvider) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(prefsRepositoryFactory, "prefsRepositoryFactory");
        Intrinsics.checkNotNullParameter(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        Intrinsics.checkNotNullParameter(elementsSessionRepository, "elementsSessionRepository");
        Intrinsics.checkNotNullParameter(stripeIntentValidator, "stripeIntentValidator");
        Intrinsics.checkNotNullParameter(customerRepository, "customerRepository");
        Intrinsics.checkNotNullParameter(lpmRepository, "lpmRepository");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(accountStatusProvider, "accountStatusProvider");
        this.appName = appName;
        this.prefsRepositoryFactory = prefsRepositoryFactory;
        this.googlePayRepositoryFactory = googlePayRepositoryFactory;
        this.elementsSessionRepository = elementsSessionRepository;
        this.stripeIntentValidator = stripeIntentValidator;
        this.customerRepository = customerRepository;
        this.lpmRepository = lpmRepository;
        this.logger = logger;
        this.eventReporter = eventReporter;
        this.workContext = workContext;
        this.accountStatusProvider = accountStatusProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object create(StripeIntent stripeIntent, PaymentSheet.CustomerConfiguration customerConfiguration, PaymentSheet.Configuration configuration, boolean z, Continuation<? super PaymentSheetLoader.Result> continuation) {
        return C37824aD0.m71786e(new DefaultPaymentSheetLoader$create$2(this, customerConfiguration, stripeIntent, configuration, z, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createLinkConfiguration(PaymentSheet.Configuration configuration, StripeIntent stripeIntent, Continuation<? super LinkPaymentLauncher.Configuration> continuation) {
        DefaultPaymentSheetLoader$createLinkConfiguration$1 defaultPaymentSheetLoader$createLinkConfiguration$1;
        Object coroutine_suspended;
        int i;
        AddressDetails addressDetails;
        boolean z;
        String str;
        PaymentSheet.BillingDetails defaultBillingDetails;
        Map<IdentifierSpec, String> map;
        DefaultPaymentSheetLoader defaultPaymentSheetLoader;
        StripeIntent stripeIntent2;
        PaymentSheet.CustomerConfiguration customer;
        Object retrieveCustomer;
        PaymentSheet.BillingDetails defaultBillingDetails2;
        String email;
        StripeIntent stripeIntent3;
        Map<IdentifierSpec, String> map2;
        String str2;
        String str3;
        PaymentSheet.BillingDetails defaultBillingDetails3;
        PaymentSheet.Address address;
        PaymentSheet.BillingDetails defaultBillingDetails4;
        Customer customer2;
        PaymentSheet.Configuration configuration2 = configuration;
        if (continuation instanceof DefaultPaymentSheetLoader$createLinkConfiguration$1) {
            defaultPaymentSheetLoader$createLinkConfiguration$1 = (DefaultPaymentSheetLoader$createLinkConfiguration$1) continuation;
            int i2 = defaultPaymentSheetLoader$createLinkConfiguration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultPaymentSheetLoader$createLinkConfiguration$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultPaymentSheetLoader$createLinkConfiguration$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultPaymentSheetLoader$createLinkConfiguration$1.label;
                String str4 = null;
                if (i == 0) {
                    if (i == 1) {
                        stripeIntent2 = (StripeIntent) defaultPaymentSheetLoader$createLinkConfiguration$1.L$2;
                        ResultKt.throwOnFailure(obj);
                        str = (String) defaultPaymentSheetLoader$createLinkConfiguration$1.L$3;
                        defaultPaymentSheetLoader = (DefaultPaymentSheetLoader) defaultPaymentSheetLoader$createLinkConfiguration$1.L$0;
                        retrieveCustomer = obj;
                        map = (Map) defaultPaymentSheetLoader$createLinkConfiguration$1.L$4;
                        configuration2 = (PaymentSheet.Configuration) defaultPaymentSheetLoader$createLinkConfiguration$1.L$1;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (configuration2 != null) {
                        addressDetails = configuration.getShippingDetails();
                    } else {
                        addressDetails = null;
                    }
                    boolean z2 = false;
                    if (addressDetails != null) {
                        z = Intrinsics.areEqual(addressDetails.isCheckboxSelected(), Boxing.boxBoolean(true));
                    } else {
                        z = false;
                    }
                    if (z) {
                        str = addressDetails.getPhoneNumber();
                    } else if (configuration2 != null && (defaultBillingDetails = configuration.getDefaultBillingDetails()) != null) {
                        str = defaultBillingDetails.getPhone();
                    } else {
                        str = null;
                    }
                    if (addressDetails != null) {
                        z2 = Intrinsics.areEqual(addressDetails.isCheckboxSelected(), Boxing.boxBoolean(true));
                    }
                    if (z2) {
                        map = AddressDetailsKt.toIdentifierMap(addressDetails, configuration.getDefaultBillingDetails());
                    } else {
                        map = null;
                    }
                    if (configuration2 != null && (defaultBillingDetails2 = configuration.getDefaultBillingDetails()) != null && (email = defaultBillingDetails2.getEmail()) != null) {
                        stripeIntent3 = stripeIntent;
                        defaultPaymentSheetLoader = this;
                        map2 = map;
                        str2 = email;
                        String str5 = str;
                        if (configuration2 != null) {
                        }
                        String str6 = defaultPaymentSheetLoader.appName;
                        String str7 = str6;
                        if (configuration2 == null) {
                        }
                        str3 = null;
                        if (configuration2 != null) {
                            str4 = address.getCountry();
                        }
                        return new LinkPaymentLauncher.Configuration(stripeIntent3, str7, str3, str2, str5, str4, map2);
                    } else if (configuration2 != null && (customer = configuration.getCustomer()) != null) {
                        CustomerRepository customerRepository = this.customerRepository;
                        String id = customer.getId();
                        String ephemeralKeySecret = customer.getEphemeralKeySecret();
                        defaultPaymentSheetLoader$createLinkConfiguration$1.L$0 = this;
                        defaultPaymentSheetLoader$createLinkConfiguration$1.L$1 = configuration2;
                        defaultPaymentSheetLoader$createLinkConfiguration$1.L$2 = stripeIntent;
                        defaultPaymentSheetLoader$createLinkConfiguration$1.L$3 = str;
                        defaultPaymentSheetLoader$createLinkConfiguration$1.L$4 = map;
                        defaultPaymentSheetLoader$createLinkConfiguration$1.label = 1;
                        retrieveCustomer = customerRepository.retrieveCustomer(id, ephemeralKeySecret, defaultPaymentSheetLoader$createLinkConfiguration$1);
                        if (retrieveCustomer == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultPaymentSheetLoader = this;
                        stripeIntent2 = stripeIntent;
                    } else {
                        defaultPaymentSheetLoader = this;
                        stripeIntent2 = stripeIntent;
                        map2 = map;
                        stripeIntent3 = stripeIntent2;
                        str2 = null;
                        String str52 = str;
                        if (configuration2 != null || (str6 = configuration2.getMerchantDisplayName()) == null) {
                            String str62 = defaultPaymentSheetLoader.appName;
                        }
                        String str72 = str62;
                        if (configuration2 == null && (defaultBillingDetails4 = configuration2.getDefaultBillingDetails()) != null) {
                            str3 = defaultBillingDetails4.getName();
                        } else {
                            str3 = null;
                        }
                        if (configuration2 != null && (defaultBillingDetails3 = configuration2.getDefaultBillingDetails()) != null && (address = defaultBillingDetails3.getAddress()) != null) {
                            str4 = address.getCountry();
                        }
                        return new LinkPaymentLauncher.Configuration(stripeIntent3, str72, str3, str2, str52, str4, map2);
                    }
                }
                customer2 = (Customer) retrieveCustomer;
                if (customer2 != null) {
                    map2 = map;
                    str2 = customer2.getEmail();
                    stripeIntent3 = stripeIntent2;
                    String str522 = str;
                    if (configuration2 != null) {
                    }
                    String str622 = defaultPaymentSheetLoader.appName;
                    String str722 = str622;
                    if (configuration2 == null) {
                    }
                    str3 = null;
                    if (configuration2 != null) {
                    }
                    return new LinkPaymentLauncher.Configuration(stripeIntent3, str722, str3, str2, str522, str4, map2);
                }
                map2 = map;
                stripeIntent3 = stripeIntent2;
                str2 = null;
                String str5222 = str;
                if (configuration2 != null) {
                }
                String str6222 = defaultPaymentSheetLoader.appName;
                String str7222 = str6222;
                if (configuration2 == null) {
                }
                str3 = null;
                if (configuration2 != null) {
                }
                return new LinkPaymentLauncher.Configuration(stripeIntent3, str7222, str3, str2, str5222, str4, map2);
            }
        }
        defaultPaymentSheetLoader$createLinkConfiguration$1 = new DefaultPaymentSheetLoader$createLinkConfiguration$1(this, continuation);
        Object obj2 = defaultPaymentSheetLoader$createLinkConfiguration$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultPaymentSheetLoader$createLinkConfiguration$1.label;
        String str42 = null;
        if (i == 0) {
        }
        customer2 = (Customer) retrieveCustomer;
        if (customer2 != null) {
        }
        map2 = map;
        stripeIntent3 = stripeIntent2;
        str2 = null;
        String str52222 = str;
        if (configuration2 != null) {
        }
        String str62222 = defaultPaymentSheetLoader.appName;
        String str72222 = str62222;
        if (configuration2 == null) {
        }
        str3 = null;
        if (configuration2 != null) {
        }
        return new LinkPaymentLauncher.Configuration(stripeIntent3, str72222, str3, str2, str52222, str42, map2);
    }

    private final PaymentSelection determineDefaultPaymentSelection(boolean z, boolean z2, List<PaymentMethod> list) {
        Object first;
        if (!list.isEmpty()) {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
            return new PaymentSelection.Saved((PaymentMethod) first, false, 2, null);
        } else if (z2) {
            return PaymentSelection.Link.INSTANCE;
        } else {
            if (!z) {
                return null;
            }
            return PaymentSelection.GooglePay.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isGooglePayReady(PaymentSheet.Configuration configuration, Continuation<? super Boolean> continuation) {
        DefaultPaymentSheetLoader$isGooglePayReady$1 defaultPaymentSheetLoader$isGooglePayReady$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        PaymentSheet.GooglePayConfiguration googlePay;
        PaymentSheet.GooglePayConfiguration.Environment environment;
        GooglePayEnvironment googlePayEnvironment;
        InterfaceC32730Eu1<Boolean> isReady;
        if (continuation instanceof DefaultPaymentSheetLoader$isGooglePayReady$1) {
            defaultPaymentSheetLoader$isGooglePayReady$1 = (DefaultPaymentSheetLoader$isGooglePayReady$1) continuation;
            int i2 = defaultPaymentSheetLoader$isGooglePayReady$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultPaymentSheetLoader$isGooglePayReady$1.label = i2 - Integer.MIN_VALUE;
                obj = defaultPaymentSheetLoader$isGooglePayReady$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultPaymentSheetLoader$isGooglePayReady$1.label;
                boolean z = false;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (configuration != null && (googlePay = configuration.getGooglePay()) != null && (environment = googlePay.getEnvironment()) != null) {
                        Function1<GooglePayEnvironment, GooglePayRepository> function1 = this.googlePayRepositoryFactory;
                        int i3 = WhenMappings.$EnumSwitchMapping$0[environment.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                googlePayEnvironment = GooglePayEnvironment.Test;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            googlePayEnvironment = GooglePayEnvironment.Production;
                        }
                        GooglePayRepository invoke = function1.invoke(googlePayEnvironment);
                        if (invoke != null && (isReady = invoke.isReady()) != null) {
                            defaultPaymentSheetLoader$isGooglePayReady$1.label = 1;
                            obj = C36708Vu1.m79248w(isReady, defaultPaymentSheetLoader$isGooglePayReady$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Boxing.boxBoolean(z);
                }
                if (((Boolean) obj).booleanValue()) {
                    z = true;
                }
                return Boxing.boxBoolean(z);
            }
        }
        defaultPaymentSheetLoader$isGooglePayReady$1 = new DefaultPaymentSheetLoader$isGooglePayReady$1(this, continuation);
        obj = defaultPaymentSheetLoader$isGooglePayReady$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultPaymentSheetLoader$isGooglePayReady$1.label;
        boolean z2 = false;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return Boxing.boxBoolean(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadLinkState(PaymentSheet.Configuration configuration, StripeIntent stripeIntent, Continuation<? super LinkState> continuation) {
        DefaultPaymentSheetLoader$loadLinkState$1 defaultPaymentSheetLoader$loadLinkState$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        DefaultPaymentSheetLoader defaultPaymentSheetLoader;
        LinkPaymentLauncher.Configuration configuration2;
        int i2;
        LinkState.LoginState loginState;
        if (continuation instanceof DefaultPaymentSheetLoader$loadLinkState$1) {
            defaultPaymentSheetLoader$loadLinkState$1 = (DefaultPaymentSheetLoader$loadLinkState$1) continuation;
            int i3 = defaultPaymentSheetLoader$loadLinkState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                defaultPaymentSheetLoader$loadLinkState$1.label = i3 - Integer.MIN_VALUE;
                obj = defaultPaymentSheetLoader$loadLinkState$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultPaymentSheetLoader$loadLinkState$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            configuration2 = (LinkPaymentLauncher.Configuration) defaultPaymentSheetLoader$loadLinkState$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            i2 = WhenMappings.$EnumSwitchMapping$1[((AccountStatus) obj).ordinal()];
                            if (i2 == 1) {
                                if (i2 != 2 && i2 != 3) {
                                    if (i2 != 4 && i2 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    loginState = LinkState.LoginState.LoggedOut;
                                } else {
                                    loginState = LinkState.LoginState.NeedsVerification;
                                }
                            } else {
                                loginState = LinkState.LoginState.LoggedIn;
                            }
                            return new LinkState(configuration2, loginState);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    defaultPaymentSheetLoader = (DefaultPaymentSheetLoader) defaultPaymentSheetLoader$loadLinkState$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    defaultPaymentSheetLoader$loadLinkState$1.L$0 = this;
                    defaultPaymentSheetLoader$loadLinkState$1.label = 1;
                    obj = createLinkConfiguration(configuration, stripeIntent, defaultPaymentSheetLoader$loadLinkState$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    defaultPaymentSheetLoader = this;
                }
                LinkPaymentLauncher.Configuration configuration3 = (LinkPaymentLauncher.Configuration) obj;
                LinkAccountStatusProvider linkAccountStatusProvider = defaultPaymentSheetLoader.accountStatusProvider;
                defaultPaymentSheetLoader$loadLinkState$1.L$0 = configuration3;
                defaultPaymentSheetLoader$loadLinkState$1.label = 2;
                obj = linkAccountStatusProvider.invoke(configuration3, defaultPaymentSheetLoader$loadLinkState$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                configuration2 = configuration3;
                i2 = WhenMappings.$EnumSwitchMapping$1[((AccountStatus) obj).ordinal()];
                if (i2 == 1) {
                }
                return new LinkState(configuration2, loginState);
            }
        }
        defaultPaymentSheetLoader$loadLinkState$1 = new DefaultPaymentSheetLoader$loadLinkState$1(this, continuation);
        obj = defaultPaymentSheetLoader$loadLinkState$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultPaymentSheetLoader$loadLinkState$1.label;
        if (i == 0) {
        }
        LinkPaymentLauncher.Configuration configuration32 = (LinkPaymentLauncher.Configuration) obj;
        LinkAccountStatusProvider linkAccountStatusProvider2 = defaultPaymentSheetLoader.accountStatusProvider;
        defaultPaymentSheetLoader$loadLinkState$1.L$0 = configuration32;
        defaultPaymentSheetLoader$loadLinkState$1.label = 2;
        obj = linkAccountStatusProvider2.invoke(configuration32, defaultPaymentSheetLoader$loadLinkState$1);
        if (obj != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object retrieveCustomerPaymentMethods(StripeIntent stripeIntent, PaymentSheet.Configuration configuration, PaymentSheet.CustomerConfiguration customerConfiguration, Continuation<? super List<PaymentMethod>> continuation) {
        DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1 defaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1;
        Object coroutine_suspended;
        int i;
        boolean z;
        if (continuation instanceof DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1) {
            defaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1 = (DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1) continuation;
            int i2 = defaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList();
                    for (LpmRepository.SupportedPaymentMethod supportedPaymentMethod : SupportedPaymentMethodKtxKt.getSupportedSavedCustomerPMs(stripeIntent, configuration, this.lpmRepository)) {
                        PaymentMethod.Type fromCode = PaymentMethod.Type.Companion.fromCode(supportedPaymentMethod.getCode());
                        if (fromCode != null) {
                            arrayList.add(fromCode);
                        }
                    }
                    CustomerRepository customerRepository = this.customerRepository;
                    defaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1.label = 1;
                    obj = customerRepository.getPaymentMethods(customerConfiguration, arrayList, defaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    PaymentMethod paymentMethod = (PaymentMethod) obj2;
                    if (paymentMethod.hasExpectedDetails() && paymentMethod.type != PaymentMethod.Type.PayPal) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            }
        }
        defaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1 = new DefaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1(this, continuation);
        Object obj3 = defaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultPaymentSheetLoader$retrieveCustomerPaymentMethods$1.label;
        if (i == 0) {
        }
        ArrayList arrayList22 = new ArrayList();
        while (r6.hasNext()) {
        }
        return arrayList22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object retrieveElementsSession(PaymentSheet.InitializationMode initializationMode, PaymentSheet.Configuration configuration, Continuation<? super StripeIntent> continuation) {
        DefaultPaymentSheetLoader$retrieveElementsSession$1 defaultPaymentSheetLoader$retrieveElementsSession$1;
        Object coroutine_suspended;
        int i;
        DefaultPaymentSheetLoader defaultPaymentSheetLoader;
        if (continuation instanceof DefaultPaymentSheetLoader$retrieveElementsSession$1) {
            defaultPaymentSheetLoader$retrieveElementsSession$1 = (DefaultPaymentSheetLoader$retrieveElementsSession$1) continuation;
            int i2 = defaultPaymentSheetLoader$retrieveElementsSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultPaymentSheetLoader$retrieveElementsSession$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultPaymentSheetLoader$retrieveElementsSession$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultPaymentSheetLoader$retrieveElementsSession$1.label;
                if (i == 0) {
                    if (i == 1) {
                        defaultPaymentSheetLoader = (DefaultPaymentSheetLoader) defaultPaymentSheetLoader$retrieveElementsSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ElementsSessionRepository elementsSessionRepository = this.elementsSessionRepository;
                    defaultPaymentSheetLoader$retrieveElementsSession$1.L$0 = this;
                    defaultPaymentSheetLoader$retrieveElementsSession$1.label = 1;
                    obj = elementsSessionRepository.get(initializationMode, configuration, defaultPaymentSheetLoader$retrieveElementsSession$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    defaultPaymentSheetLoader = this;
                }
                ElementsSession elementsSession = (ElementsSession) obj;
                defaultPaymentSheetLoader.lpmRepository.update(elementsSession.getStripeIntent(), elementsSession.getPaymentMethodSpecs());
                if (defaultPaymentSheetLoader.lpmRepository.getServerSpecLoadingState() instanceof LpmRepository.ServerSpecState.ServerNotParsed) {
                    defaultPaymentSheetLoader.eventReporter.onLpmSpecFailure();
                }
                return defaultPaymentSheetLoader.stripeIntentValidator.requireValid(elementsSession.getStripeIntent());
            }
        }
        defaultPaymentSheetLoader$retrieveElementsSession$1 = new DefaultPaymentSheetLoader$retrieveElementsSession$1(this, continuation);
        Object obj2 = defaultPaymentSheetLoader$retrieveElementsSession$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultPaymentSheetLoader$retrieveElementsSession$1.label;
        if (i == 0) {
        }
        ElementsSession elementsSession2 = (ElementsSession) obj2;
        defaultPaymentSheetLoader.lpmRepository.update(elementsSession2.getStripeIntent(), elementsSession2.getPaymentMethodSpecs());
        if (defaultPaymentSheetLoader.lpmRepository.getServerSpecLoadingState() instanceof LpmRepository.ServerSpecState.ServerNotParsed) {
        }
        return defaultPaymentSheetLoader.stripeIntentValidator.requireValid(elementsSession2.getStripeIntent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object retrieveSavedPaymentSelection(PrefsRepository prefsRepository, boolean z, boolean z2, List<PaymentMethod> list, Continuation<? super SavedSelection> continuation) {
        DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1 defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1;
        Object coroutine_suspended;
        int i;
        DefaultPaymentSheetLoader defaultPaymentSheetLoader;
        SavedSelection savedSelection;
        if (continuation instanceof DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1) {
            defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1 = (DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1) continuation;
            int i2 = defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.Z$1;
                    z = defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.Z$0;
                    list = (List) defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.L$2;
                    prefsRepository = (PrefsRepository) defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.L$1;
                    defaultPaymentSheetLoader = (DefaultPaymentSheetLoader) defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.L$0 = this;
                    defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.L$1 = prefsRepository;
                    defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.L$2 = list;
                    defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.Z$0 = z;
                    defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.Z$1 = z2;
                    defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.label = 1;
                    obj = prefsRepository.getSavedSelection(z, z2, defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    defaultPaymentSheetLoader = this;
                }
                savedSelection = (SavedSelection) obj;
                if (Intrinsics.areEqual(savedSelection, SavedSelection.None.INSTANCE)) {
                    return savedSelection;
                }
                prefsRepository.savePaymentSelection(defaultPaymentSheetLoader.determineDefaultPaymentSelection(z, z2, list));
                defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.L$0 = null;
                defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.L$1 = null;
                defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.L$2 = null;
                defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.label = 2;
                obj = prefsRepository.getSavedSelection(z, z2, defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return obj;
            }
        }
        defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1 = new DefaultPaymentSheetLoader$retrieveSavedPaymentSelection$1(this, continuation);
        Object obj2 = defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultPaymentSheetLoader$retrieveSavedPaymentSelection$1.label;
        if (i == 0) {
        }
        savedSelection = (SavedSelection) obj2;
        if (Intrinsics.areEqual(savedSelection, SavedSelection.None.INSTANCE)) {
        }
    }

    @Override // com.stripe.android.paymentsheet.state.PaymentSheetLoader
    public Object load(PaymentSheet.InitializationMode initializationMode, PaymentSheet.Configuration configuration, Continuation<? super PaymentSheetLoader.Result> continuation) {
        return X30.m77504g(this.workContext, new DefaultPaymentSheetLoader$load$2(this, configuration, initializationMode, null), continuation);
    }
}
