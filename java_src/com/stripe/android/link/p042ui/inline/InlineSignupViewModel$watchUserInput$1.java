package com.stripe.android.link.p042ui.inline;

import com.stripe.android.link.p042ui.signup.SignUpState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "signUpState", "Lcom/stripe/android/link/ui/signup/SignUpState;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nInlineSignupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineSignupViewModel.kt\ncom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,245:1\n230#2,5:246\n*S KotlinDebug\n*F\n+ 1 InlineSignupViewModel.kt\ncom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$1\n*L\n130#1:246,5\n*E\n"})
/* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$1 */
/* loaded from: classes7.dex */
public final class InlineSignupViewModel$watchUserInput$1 extends Lambda implements Function1<SignUpState, Unit> {
    final /* synthetic */ InlineSignupViewModel this$0;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$1$WhenMappings */
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SignUpState.values().length];
            try {
                iArr[SignUpState.InputtingEmail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignUpState.VerifyingEmail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SignUpState.InputtingPhoneOrName.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineSignupViewModel$watchUserInput$1(InlineSignupViewModel inlineSignupViewModel) {
        super(1);
        this.this$0 = inlineSignupViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SignUpState signUpState) {
        invoke2(signUpState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SignUpState signUpState) {
        GX2 gx2;
        Object value;
        InlineSignupViewState inlineSignupViewState;
        UserInput userInput;
        InterfaceC49220tP5 interfaceC49220tP5;
        InterfaceC49220tP5 interfaceC49220tP52;
        InterfaceC49220tP5 interfaceC49220tP53;
        Intrinsics.checkNotNullParameter(signUpState, "signUpState");
        this.this$0.clearError();
        gx2 = this.this$0._viewState;
        InlineSignupViewModel inlineSignupViewModel = this.this$0;
        do {
            value = gx2.getValue();
            inlineSignupViewState = (InlineSignupViewState) value;
            int i = WhenMappings.$EnumSwitchMapping$0[signUpState.ordinal()];
            if (i == 1 || i == 2) {
                userInput = null;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                interfaceC49220tP5 = inlineSignupViewModel.consumerEmail;
                interfaceC49220tP52 = inlineSignupViewModel.consumerPhoneNumber;
                interfaceC49220tP53 = inlineSignupViewModel.consumerName;
                userInput = inlineSignupViewModel.mapToUserInput((String) interfaceC49220tP5.getValue(), (String) interfaceC49220tP52.getValue(), (String) interfaceC49220tP53.getValue());
            }
        } while (!gx2.compareAndSet(value, InlineSignupViewState.copy$default(inlineSignupViewState, userInput, null, false, false, signUpState, 14, null)));
    }
}
