package com.stripe.android.link.p042ui.signup;

import com.stripe.android.link.p042ui.signup.SignUpViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.ui.signup.SignUpViewModel$Debouncer$startWatching$1", m28418f = "SignUpViewModel.kt", m28417i = {}, m28416l = {224}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$Debouncer$startWatching$1 */
/* loaded from: classes7.dex */
public final class SignUpViewModel$Debouncer$startWatching$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC49220tP5<String> $emailFlow;
    final /* synthetic */ Function1<SignUpState, Unit> $onStateChanged;
    final /* synthetic */ Function1<String, Unit> $onValidEmailEntered;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SignUpViewModel.Debouncer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SignUpViewModel$Debouncer$startWatching$1(InterfaceC49220tP5<String> interfaceC49220tP5, SignUpViewModel.Debouncer debouncer, Function1<? super SignUpState, Unit> function1, Function1<? super String, Unit> function12, Continuation<? super SignUpViewModel$Debouncer$startWatching$1> continuation) {
        super(2, continuation);
        this.$emailFlow = interfaceC49220tP5;
        this.this$0 = debouncer;
        this.$onStateChanged = function1;
        this.$onValidEmailEntered = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SignUpViewModel$Debouncer$startWatching$1 signUpViewModel$Debouncer$startWatching$1 = new SignUpViewModel$Debouncer$startWatching$1(this.$emailFlow, this.this$0, this.$onStateChanged, this.$onValidEmailEntered, continuation);
        signUpViewModel$Debouncer$startWatching$1.L$0 = obj;
        return signUpViewModel$Debouncer$startWatching$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((SignUpViewModel$Debouncer$startWatching$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            final ZC0 zc0 = (ZC0) this.L$0;
            InterfaceC49220tP5<String> interfaceC49220tP5 = this.$emailFlow;
            final SignUpViewModel.Debouncer debouncer = this.this$0;
            final Function1<SignUpState, Unit> function1 = this.$onStateChanged;
            final Function1<String, Unit> function12 = this.$onValidEmailEntered;
            InterfaceC33198Gu1<String> interfaceC33198Gu1 = new InterfaceC33198Gu1<String>() { // from class: com.stripe.android.link.ui.signup.SignUpViewModel$Debouncer$startWatching$1.1
                @Override // p000.InterfaceC33198Gu1
                public /* bridge */ /* synthetic */ Object emit(String str, Continuation continuation) {
                    return emit2(str, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(String str, Continuation<? super Unit> continuation) {
                    String str2;
                    InterfaceC52943zh2 interfaceC52943zh2;
                    InterfaceC52943zh2 m73800d;
                    InterfaceC52943zh2 interfaceC52943zh22;
                    str2 = SignUpViewModel.Debouncer.this.initialEmail;
                    if (Intrinsics.areEqual(str, str2)) {
                        interfaceC52943zh22 = SignUpViewModel.Debouncer.this.lookupJob;
                        if (interfaceC52943zh22 == null) {
                            if (str != null) {
                                function1.invoke(SignUpState.InputtingPhoneOrName);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    interfaceC52943zh2 = SignUpViewModel.Debouncer.this.lookupJob;
                    if (interfaceC52943zh2 != null) {
                        InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
                    }
                    if (str != null) {
                        SignUpViewModel.Debouncer debouncer2 = SignUpViewModel.Debouncer.this;
                        m73800d = Z30.m73800d(zc0, null, null, new SignUpViewModel$Debouncer$startWatching$1$1$emit$2(function1, function12, str, null), 3, null);
                        debouncer2.lookupJob = m73800d;
                    } else {
                        function1.invoke(SignUpState.InputtingEmail);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (interfaceC49220tP5.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
