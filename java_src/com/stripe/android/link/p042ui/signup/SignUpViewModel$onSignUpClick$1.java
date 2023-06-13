package com.stripe.android.link.p042ui.signup;

import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.model.ConsumerSignUpConsentAction;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.ui.signup.SignUpViewModel$onSignUpClick$1", m28418f = "SignUpViewModel.kt", m28417i = {}, m28416l = {151}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$onSignUpClick$1 */
/* loaded from: classes7.dex */
public final class SignUpViewModel$onSignUpClick$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $country;
    final /* synthetic */ String $email;
    final /* synthetic */ String $name;
    final /* synthetic */ String $phone;
    int label;
    final /* synthetic */ SignUpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpViewModel$onSignUpClick$1(SignUpViewModel signUpViewModel, String str, String str2, String str3, String str4, Continuation<? super SignUpViewModel$onSignUpClick$1> continuation) {
        super(2, continuation);
        this.this$0 = signUpViewModel;
        this.$email = str;
        this.$phone = str2;
        this.$country = str3;
        this.$name = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignUpViewModel$onSignUpClick$1(this.this$0, this.$email, this.$phone, this.$country, this.$name, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((SignUpViewModel$onSignUpClick$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        LinkAccountManager linkAccountManager;
        Object m116497signUphUnOzRk;
        LinkEventsReporter linkEventsReporter;
        LinkEventsReporter linkEventsReporter2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                m116497signUphUnOzRk = ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            linkAccountManager = this.this$0.linkAccountManager;
            String str = this.$email;
            String str2 = this.$phone;
            String str3 = this.$country;
            String str4 = this.$name;
            ConsumerSignUpConsentAction consumerSignUpConsentAction = ConsumerSignUpConsentAction.Button;
            this.label = 1;
            m116497signUphUnOzRk = linkAccountManager.m116497signUphUnOzRk(str, str2, str3, str4, consumerSignUpConsentAction, this);
            if (m116497signUphUnOzRk == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        SignUpViewModel signUpViewModel = this.this$0;
        Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116497signUphUnOzRk);
        if (m116786exceptionOrNullimpl == null) {
            signUpViewModel.onAccountFetched((LinkAccount) m116497signUphUnOzRk);
            linkEventsReporter2 = signUpViewModel.linkEventsReporter;
            LinkEventsReporter.DefaultImpls.onSignupCompleted$default(linkEventsReporter2, false, 1, null);
        } else {
            signUpViewModel.onError(m116786exceptionOrNullimpl);
            linkEventsReporter = signUpViewModel.linkEventsReporter;
            LinkEventsReporter.DefaultImpls.onSignupFailure$default(linkEventsReporter, false, 1, null);
        }
        return Unit.INSTANCE;
    }
}
