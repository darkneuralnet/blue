package com.stripe.android.link.p042ui.signup;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.ui.signup.SignUpViewModel$Debouncer$startWatching$1$1$emit$2", m28418f = "SignUpViewModel.kt", m28417i = {0}, m28416l = {239}, m28415m = "invokeSuspend", m28414n = {"$this$launch"}, m28413s = {"L$0"})
/* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$Debouncer$startWatching$1$1$emit$2 */
/* loaded from: classes7.dex */
public final class SignUpViewModel$Debouncer$startWatching$1$1$emit$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $email;
    final /* synthetic */ Function1<SignUpState, Unit> $onStateChanged;
    final /* synthetic */ Function1<String, Unit> $onValidEmailEntered;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SignUpViewModel$Debouncer$startWatching$1$1$emit$2(Function1<? super SignUpState, Unit> function1, Function1<? super String, Unit> function12, String str, Continuation<? super SignUpViewModel$Debouncer$startWatching$1$1$emit$2> continuation) {
        super(2, continuation);
        this.$onStateChanged = function1;
        this.$onValidEmailEntered = function12;
        this.$email = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SignUpViewModel$Debouncer$startWatching$1$1$emit$2 signUpViewModel$Debouncer$startWatching$1$1$emit$2 = new SignUpViewModel$Debouncer$startWatching$1$1$emit$2(this.$onStateChanged, this.$onValidEmailEntered, this.$email, continuation);
        signUpViewModel$Debouncer$startWatching$1$1$emit$2.L$0 = obj;
        return signUpViewModel$Debouncer$startWatching$1$1$emit$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((SignUpViewModel$Debouncer$startWatching$1$1$emit$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        ZC0 zc0;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                zc0 = (ZC0) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            ZC0 zc02 = (ZC0) this.L$0;
            this.L$0 = zc02;
            this.label = 1;
            if (C48120rZ0.m15768a(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            zc0 = zc02;
        }
        if (C37824aD0.m71785f(zc0)) {
            this.$onStateChanged.invoke(SignUpState.VerifyingEmail);
            this.$onValidEmailEntered.invoke(this.$email);
        }
        return Unit.INSTANCE;
    }
}
