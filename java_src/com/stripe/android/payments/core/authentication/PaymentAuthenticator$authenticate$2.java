package com.stripe.android.payments.core.authentication;

import androidx.lifecycle.C11734m;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: Authenticatable
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"Authenticatable", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.payments.core.authentication.PaymentAuthenticator$authenticate$2", m28418f = "PaymentAuthenticator.kt", m28417i = {}, m28416l = {35}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PaymentAuthenticator$authenticate$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Authenticatable $authenticatable;
    final /* synthetic */ AuthActivityStarterHost $host;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ ApiRequest.Options $requestOptions;
    int label;
    final /* synthetic */ PaymentAuthenticator<Authenticatable> this$0;

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"Authenticatable", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.payments.core.authentication.PaymentAuthenticator$authenticate$2$1", m28418f = "PaymentAuthenticator.kt", m28417i = {}, m28416l = {36}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.payments.core.authentication.PaymentAuthenticator$authenticate$2$1 */
    /* loaded from: classes7.dex */
    public static final class C191121 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Authenticatable $authenticatable;
        final /* synthetic */ AuthActivityStarterHost $host;
        final /* synthetic */ ApiRequest.Options $requestOptions;
        int label;
        final /* synthetic */ PaymentAuthenticator<Authenticatable> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C191121(PaymentAuthenticator<Authenticatable> paymentAuthenticator, AuthActivityStarterHost authActivityStarterHost, Authenticatable authenticatable, ApiRequest.Options options, Continuation<? super C191121> continuation) {
            super(2, continuation);
            this.this$0 = paymentAuthenticator;
            this.$host = authActivityStarterHost;
            this.$authenticatable = authenticatable;
            this.$requestOptions = options;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C191121(this.this$0, this.$host, this.$authenticatable, this.$requestOptions, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C191121) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                PaymentAuthenticator<Authenticatable> paymentAuthenticator = this.this$0;
                AuthActivityStarterHost authActivityStarterHost = this.$host;
                Authenticatable authenticatable = this.$authenticatable;
                ApiRequest.Options options = this.$requestOptions;
                this.label = 1;
                if (paymentAuthenticator.performAuthentication(authActivityStarterHost, authenticatable, options, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return invoke2(zc0, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAuthenticator$authenticate$2(LifecycleOwner lifecycleOwner, PaymentAuthenticator<Authenticatable> paymentAuthenticator, AuthActivityStarterHost authActivityStarterHost, Authenticatable authenticatable, ApiRequest.Options options, Continuation<? super PaymentAuthenticator$authenticate$2> continuation) {
        super(2, continuation);
        this.$lifecycleOwner = lifecycleOwner;
        this.this$0 = paymentAuthenticator;
        this.$host = authActivityStarterHost;
        this.$authenticatable = authenticatable;
        this.$requestOptions = options;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentAuthenticator$authenticate$2(this.$lifecycleOwner, this.this$0, this.$host, this.$authenticatable, this.$requestOptions, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((PaymentAuthenticator$authenticate$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            C191121 c191121 = new C191121(this.this$0, this.$host, this.$authenticatable, this.$requestOptions, null);
            this.label = 1;
            if (C11734m.m66982b(lifecycleOwner, c191121, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return invoke2(zc0, continuation);
    }
}
