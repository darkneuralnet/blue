package com.stripe.android.link.p042ui.inline;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$3", m28418f = "InlineSignupViewModel.kt", m28417i = {}, m28416l = {158}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$3 */
/* loaded from: classes7.dex */
public final class InlineSignupViewModel$watchUserInput$3 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InlineSignupViewModel this$0;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$3$1 */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C190241 extends AdaptedFunctionReference implements Function4<String, String, String, Continuation<? super UserInput>, Object>, SuspendFunction {
        public C190241(Object obj) {
            super(4, obj, InlineSignupViewModel.class, "mapToUserInput", "mapToUserInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/link/ui/inline/UserInput;", 4);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(String str, String str2, String str3, Continuation<? super UserInput> continuation) {
            return InlineSignupViewModel$watchUserInput$3.invokeSuspend$mapToUserInput((InlineSignupViewModel) this.receiver, str, str2, str3, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineSignupViewModel$watchUserInput$3(InlineSignupViewModel inlineSignupViewModel, Continuation<? super InlineSignupViewModel$watchUserInput$3> continuation) {
        super(2, continuation);
        this.this$0 = inlineSignupViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$mapToUserInput(InlineSignupViewModel inlineSignupViewModel, String str, String str2, String str3, Continuation continuation) {
        UserInput mapToUserInput;
        mapToUserInput = inlineSignupViewModel.mapToUserInput(str, str2, str3);
        return mapToUserInput;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InlineSignupViewModel$watchUserInput$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((InlineSignupViewModel$watchUserInput$3) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        InterfaceC49220tP5 interfaceC49220tP5;
        InterfaceC49220tP5 interfaceC49220tP52;
        InterfaceC49220tP5 interfaceC49220tP53;
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
            interfaceC49220tP5 = this.this$0.consumerEmail;
            interfaceC49220tP52 = this.this$0.consumerPhoneNumber;
            interfaceC49220tP53 = this.this$0.consumerName;
            InterfaceC32730Eu1 m79258m = C36708Vu1.m79258m(interfaceC49220tP5, interfaceC49220tP52, interfaceC49220tP53, new C190241(this.this$0));
            final InlineSignupViewModel inlineSignupViewModel = this.this$0;
            InterfaceC33198Gu1<UserInput> interfaceC33198Gu1 = new InterfaceC33198Gu1<UserInput>() { // from class: com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$3.2
                @Override // p000.InterfaceC33198Gu1
                public /* bridge */ /* synthetic */ Object emit(UserInput userInput, Continuation continuation) {
                    return emit2(userInput, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(UserInput userInput, Continuation<? super Unit> continuation) {
                    GX2 gx2;
                    Object value;
                    gx2 = InlineSignupViewModel.this._viewState;
                    do {
                        value = gx2.getValue();
                    } while (!gx2.compareAndSet(value, InlineSignupViewState.copy$default((InlineSignupViewState) value, userInput, null, false, false, null, 30, null)));
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (m79258m.collect(interfaceC33198Gu1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
