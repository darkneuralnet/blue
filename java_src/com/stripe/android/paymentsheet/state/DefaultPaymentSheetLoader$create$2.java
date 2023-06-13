package com.stripe.android.paymentsheet.state;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.state.PaymentSheetLoader;
import com.stripe.android.paymentsheet.state.PaymentSheetState;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result$Success;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader$create$2", m28418f = "PaymentSheetLoader.kt", m28417i = {0, 0, 1}, m28416l = {154, 155, 157}, m28415m = "invokeSuspend", m28414n = {"savedSelection", "linkState", "linkState"}, m28413s = {"L$0", "L$1", "L$0"})
/* loaded from: classes7.dex */
public final class DefaultPaymentSheetLoader$create$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super PaymentSheetLoader.Result.Success>, Object> {
    final /* synthetic */ PaymentSheet.Configuration $config;
    final /* synthetic */ PaymentSheet.CustomerConfiguration $customerConfig;
    final /* synthetic */ boolean $isGooglePayReady;
    final /* synthetic */ StripeIntent $stripeIntent;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ DefaultPaymentSheetLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaymentSheetLoader$create$2(DefaultPaymentSheetLoader defaultPaymentSheetLoader, PaymentSheet.CustomerConfiguration customerConfiguration, StripeIntent stripeIntent, PaymentSheet.Configuration configuration, boolean z, Continuation<? super DefaultPaymentSheetLoader$create$2> continuation) {
        super(2, continuation);
        this.this$0 = defaultPaymentSheetLoader;
        this.$customerConfig = customerConfiguration;
        this.$stripeIntent = stripeIntent;
        this.$config = configuration;
        this.$isGooglePayReady = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultPaymentSheetLoader$create$2 defaultPaymentSheetLoader$create$2 = new DefaultPaymentSheetLoader$create$2(this.this$0, this.$customerConfig, this.$stripeIntent, this.$config, this.$isGooglePayReady, continuation);
        defaultPaymentSheetLoader$create$2.L$0 = obj;
        return defaultPaymentSheetLoader$create$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super PaymentSheetLoader.Result.Success> continuation) {
        return ((DefaultPaymentSheetLoader$create$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Function1 function1;
        boolean z;
        InterfaceC42190hZ0 m73802b;
        InterfaceC42190hZ0 m73802b2;
        InterfaceC42190hZ0 m73802b3;
        Object mo29821k;
        PaymentSheet.Configuration configuration;
        InterfaceC42190hZ0 interfaceC42190hZ0;
        StripeIntent stripeIntent;
        InterfaceC42190hZ0 interfaceC42190hZ02;
        Set intersect;
        List list;
        Object mo29821k2;
        Object mo29821k3;
        StripeIntent stripeIntent2;
        List list2;
        SavedSelection savedSelection;
        PaymentSheet.Configuration configuration2;
        boolean z2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        boolean z3 = this.Z$0;
                        ResultKt.throwOnFailure(obj);
                        mo29821k3 = obj;
                        z2 = z3;
                        savedSelection = (SavedSelection) this.L$3;
                        list2 = (List) this.L$2;
                        stripeIntent2 = (StripeIntent) this.L$1;
                        configuration2 = (PaymentSheet.Configuration) this.L$0;
                        return new PaymentSheetLoader.Result.Success(new PaymentSheetState.Full(configuration2, stripeIntent2, list2, savedSelection, z2, (LinkState) mo29821k3, null));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                configuration = (PaymentSheet.Configuration) this.L$1;
                interfaceC42190hZ0 = (InterfaceC42190hZ0) this.L$0;
                ResultKt.throwOnFailure(obj);
                list = (List) this.L$3;
                stripeIntent = (StripeIntent) this.L$2;
                mo29821k2 = obj;
                SavedSelection savedSelection2 = (SavedSelection) mo29821k2;
                boolean z4 = this.$isGooglePayReady;
                this.L$0 = configuration;
                this.L$1 = stripeIntent;
                this.L$2 = list;
                this.L$3 = savedSelection2;
                this.Z$0 = z4;
                this.label = 3;
                mo29821k3 = interfaceC42190hZ0.mo29821k(this);
                if (mo29821k3 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                stripeIntent2 = stripeIntent;
                list2 = list;
                savedSelection = savedSelection2;
                configuration2 = configuration;
                z2 = z4;
                return new PaymentSheetLoader.Result.Success(new PaymentSheetState.Full(configuration2, stripeIntent2, list2, savedSelection, z2, (LinkState) mo29821k3, null));
            }
            stripeIntent = (StripeIntent) this.L$3;
            configuration = (PaymentSheet.Configuration) this.L$2;
            interfaceC42190hZ0 = (InterfaceC42190hZ0) this.L$1;
            interfaceC42190hZ02 = (InterfaceC42190hZ0) this.L$0;
            ResultKt.throwOnFailure(obj);
            mo29821k = obj;
        } else {
            ResultKt.throwOnFailure(obj);
            ZC0 zc0 = (ZC0) this.L$0;
            function1 = this.this$0.prefsRepositoryFactory;
            PrefsRepository prefsRepository = (PrefsRepository) function1.invoke(this.$customerConfig);
            if (this.$stripeIntent.getPaymentMethodTypes().contains(PaymentMethod.Type.Link.code)) {
                intersect = CollectionsKt___CollectionsKt.intersect(this.$stripeIntent.getLinkFundingSources(), LinkPaymentLauncher.Companion.getSupportedFundingSources());
                if (!intersect.isEmpty()) {
                    z = true;
                    m73802b = Z30.m73802b(zc0, null, null, new DefaultPaymentSheetLoader$create$2$paymentMethods$1(this.$customerConfig, this.this$0, this.$stripeIntent, this.$config, null), 3, null);
                    m73802b2 = Z30.m73802b(zc0, null, null, new DefaultPaymentSheetLoader$create$2$savedSelection$1(this.this$0, prefsRepository, this.$isGooglePayReady, z, m73802b, null), 3, null);
                    m73802b3 = Z30.m73802b(zc0, null, null, new DefaultPaymentSheetLoader$create$2$linkState$1(z, this.this$0, this.$config, this.$stripeIntent, null), 3, null);
                    PaymentSheet.Configuration configuration3 = this.$config;
                    StripeIntent stripeIntent3 = this.$stripeIntent;
                    this.L$0 = m73802b2;
                    this.L$1 = m73802b3;
                    this.L$2 = configuration3;
                    this.L$3 = stripeIntent3;
                    this.label = 1;
                    mo29821k = m73802b.mo29821k(this);
                    if (mo29821k != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    configuration = configuration3;
                    interfaceC42190hZ0 = m73802b3;
                    stripeIntent = stripeIntent3;
                    interfaceC42190hZ02 = m73802b2;
                }
            }
            z = false;
            m73802b = Z30.m73802b(zc0, null, null, new DefaultPaymentSheetLoader$create$2$paymentMethods$1(this.$customerConfig, this.this$0, this.$stripeIntent, this.$config, null), 3, null);
            m73802b2 = Z30.m73802b(zc0, null, null, new DefaultPaymentSheetLoader$create$2$savedSelection$1(this.this$0, prefsRepository, this.$isGooglePayReady, z, m73802b, null), 3, null);
            m73802b3 = Z30.m73802b(zc0, null, null, new DefaultPaymentSheetLoader$create$2$linkState$1(z, this.this$0, this.$config, this.$stripeIntent, null), 3, null);
            PaymentSheet.Configuration configuration32 = this.$config;
            StripeIntent stripeIntent32 = this.$stripeIntent;
            this.L$0 = m73802b2;
            this.L$1 = m73802b3;
            this.L$2 = configuration32;
            this.L$3 = stripeIntent32;
            this.label = 1;
            mo29821k = m73802b.mo29821k(this);
            if (mo29821k != coroutine_suspended) {
            }
        }
        list = (List) mo29821k;
        this.L$0 = interfaceC42190hZ0;
        this.L$1 = configuration;
        this.L$2 = stripeIntent;
        this.L$3 = list;
        this.label = 2;
        mo29821k2 = interfaceC42190hZ02.mo29821k(this);
        if (mo29821k2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        SavedSelection savedSelection22 = (SavedSelection) mo29821k2;
        boolean z42 = this.$isGooglePayReady;
        this.L$0 = configuration;
        this.L$1 = stripeIntent;
        this.L$2 = list;
        this.L$3 = savedSelection22;
        this.Z$0 = z42;
        this.label = 3;
        mo29821k3 = interfaceC42190hZ0.mo29821k(this);
        if (mo29821k3 != coroutine_suspended) {
        }
    }
}
