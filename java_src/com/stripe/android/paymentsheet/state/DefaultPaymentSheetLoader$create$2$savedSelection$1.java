package com.stripe.android.paymentsheet.state;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.model.SavedSelection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.paymentsheet.state.DefaultPaymentSheetLoader$create$2$savedSelection$1", m28418f = "PaymentSheetLoader.kt", m28417i = {}, m28416l = {138, 134}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class DefaultPaymentSheetLoader$create$2$savedSelection$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super SavedSelection>, Object> {
    final /* synthetic */ boolean $isGooglePayReady;
    final /* synthetic */ boolean $isLinkAvailable;
    final /* synthetic */ InterfaceC42190hZ0<List<PaymentMethod>> $paymentMethods;
    final /* synthetic */ PrefsRepository $prefsRepository;
    Object L$0;
    Object L$1;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ DefaultPaymentSheetLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultPaymentSheetLoader$create$2$savedSelection$1(DefaultPaymentSheetLoader defaultPaymentSheetLoader, PrefsRepository prefsRepository, boolean z, boolean z2, InterfaceC42190hZ0<? extends List<PaymentMethod>> interfaceC42190hZ0, Continuation<? super DefaultPaymentSheetLoader$create$2$savedSelection$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultPaymentSheetLoader;
        this.$prefsRepository = prefsRepository;
        this.$isGooglePayReady = z;
        this.$isLinkAvailable = z2;
        this.$paymentMethods = interfaceC42190hZ0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultPaymentSheetLoader$create$2$savedSelection$1(this.this$0, this.$prefsRepository, this.$isGooglePayReady, this.$isLinkAvailable, this.$paymentMethods, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super SavedSelection> continuation) {
        return ((DefaultPaymentSheetLoader$create$2$savedSelection$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        PrefsRepository prefsRepository;
        boolean z;
        DefaultPaymentSheetLoader defaultPaymentSheetLoader;
        boolean z2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = this.Z$1;
            boolean z4 = this.Z$0;
            prefsRepository = (PrefsRepository) this.L$1;
            ResultKt.throwOnFailure(obj);
            z = z3;
            defaultPaymentSheetLoader = (DefaultPaymentSheetLoader) this.L$0;
            z2 = z4;
        } else {
            ResultKt.throwOnFailure(obj);
            DefaultPaymentSheetLoader defaultPaymentSheetLoader2 = this.this$0;
            prefsRepository = this.$prefsRepository;
            boolean z5 = this.$isGooglePayReady;
            boolean z6 = this.$isLinkAvailable;
            InterfaceC42190hZ0<List<PaymentMethod>> interfaceC42190hZ0 = this.$paymentMethods;
            this.L$0 = defaultPaymentSheetLoader2;
            this.L$1 = prefsRepository;
            this.Z$0 = z5;
            this.Z$1 = z6;
            this.label = 1;
            Object mo29821k = interfaceC42190hZ0.mo29821k(this);
            if (mo29821k == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = z6;
            defaultPaymentSheetLoader = defaultPaymentSheetLoader2;
            z2 = z5;
            obj = mo29821k;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = defaultPaymentSheetLoader.retrieveSavedPaymentSelection(prefsRepository, z2, z, (List) obj, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        return obj;
    }
}
