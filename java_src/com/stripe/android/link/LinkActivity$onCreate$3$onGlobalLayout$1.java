package com.stripe.android.link;

import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.Navigator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.link.LinkActivity$onCreate$3$onGlobalLayout$1", m28418f = "LinkActivity.kt", m28417i = {}, m28416l = {236}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkActivity$onCreate$3$onGlobalLayout$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ LinkActivity this$0;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountStatus.values().length];
            try {
                iArr[AccountStatus.Verified.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountStatus.NeedsVerification.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountStatus.VerificationStarted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountStatus.SignedOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountStatus.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkActivity$onCreate$3$onGlobalLayout$1(LinkActivity linkActivity, Continuation<? super LinkActivity$onCreate$3$onGlobalLayout$1> continuation) {
        super(2, continuation);
        this.this$0 = linkActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkActivity$onCreate$3$onGlobalLayout$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((LinkActivity$onCreate$3$onGlobalLayout$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        LinkActivityViewModel viewModel;
        LinkActivityViewModel viewModel2;
        Navigator navigator;
        LinkScreen linkScreen;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                navigator = (Navigator) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            viewModel = this.this$0.getViewModel();
            Navigator navigator2 = viewModel.getNavigator();
            viewModel2 = this.this$0.getViewModel();
            InterfaceC32730Eu1<AccountStatus> accountStatus = viewModel2.getLinkAccountManager().getAccountStatus();
            this.L$0 = navigator2;
            this.label = 1;
            Object m79248w = C36708Vu1.m79248w(accountStatus, this);
            if (m79248w == coroutine_suspended) {
                return coroutine_suspended;
            }
            navigator = navigator2;
            obj = m79248w;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[((AccountStatus) obj).ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 != 4 && i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                linkScreen = LinkScreen.SignUp.INSTANCE;
            } else {
                linkScreen = LinkScreen.Verification.INSTANCE;
            }
        } else {
            linkScreen = LinkScreen.Wallet.INSTANCE;
        }
        navigator.navigateTo(linkScreen, true);
        return Unit.INSTANCE;
    }
}
