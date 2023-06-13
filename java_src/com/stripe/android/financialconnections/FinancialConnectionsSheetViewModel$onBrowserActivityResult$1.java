package com.stripe.android.financialconnections;

import com.stripe.android.financialconnections.FinancialConnectionsSheetState;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel$onBrowserActivityResult$1", m28418f = "FinancialConnectionsSheetViewModel.kt", m28417i = {0, 1}, m28416l = {454, 194}, m28415m = "invokeSuspend", m28414n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m28413s = {"L$0", "L$0"})
@SourceDebugExtension({"SMAP\nFinancialConnectionsSheetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsSheetViewModel.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onBrowserActivityResult$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,448:1\n107#2,10:449\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsSheetViewModel.kt\ncom/stripe/android/financialconnections/FinancialConnectionsSheetViewModel$onBrowserActivityResult$1\n*L\n193#1:449,10\n*E\n"})
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetViewModel$onBrowserActivityResult$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FinancialConnectionsSheetViewModel this$0;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsSheetState.AuthFlowStatus.values().length];
            try {
                iArr[FinancialConnectionsSheetState.AuthFlowStatus.ON_EXTERNAL_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSheetState.AuthFlowStatus.INTERMEDIATE_DEEPLINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsSheetState.AuthFlowStatus.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetViewModel$onBrowserActivityResult$1(FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel, Continuation<? super FinancialConnectionsSheetViewModel$onBrowserActivityResult$1> continuation) {
        super(2, continuation);
        this.this$0 = financialConnectionsSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FinancialConnectionsSheetViewModel$onBrowserActivityResult$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((FinancialConnectionsSheetViewModel$onBrowserActivityResult$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[Catch: all -> 0x001b, TryCatch #1 {all -> 0x001b, blocks: (B:7:0x0017, B:21:0x005b, B:23:0x0063, B:27:0x0074, B:28:0x007a, B:29:0x007f), top: B:38:0x0017 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        SX2 sx2;
        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel;
        SX2 sx22;
        Throwable th;
        FinancialConnectionsSheetViewModel financialConnectionsSheetViewModel2;
        FinancialConnectionsSheetState financialConnectionsSheetState;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        financialConnectionsSheetViewModel2 = (FinancialConnectionsSheetViewModel) this.L$1;
                        sx22 = (SX2) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            financialConnectionsSheetState = (FinancialConnectionsSheetState) obj;
                            if (financialConnectionsSheetState.getActivityRecreated()) {
                                int i2 = WhenMappings.$EnumSwitchMapping$0[financialConnectionsSheetState.getWebAuthFlowStatus().ordinal()];
                                if (i2 != 1) {
                                    if (i2 == 2) {
                                        financialConnectionsSheetViewModel2.setState(FinancialConnectionsSheetViewModel$onBrowserActivityResult$1$1$1.INSTANCE);
                                    }
                                } else {
                                    financialConnectionsSheetViewModel2.finishWithResult(financialConnectionsSheetState, FinancialConnectionsSheetActivityResult.Canceled.INSTANCE);
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            sx22.mo83451b(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                            sx22.mo83451b(null);
                            throw th;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                financialConnectionsSheetViewModel = (FinancialConnectionsSheetViewModel) this.L$1;
                ResultKt.throwOnFailure(obj);
                sx2 = (SX2) this.L$0;
            } else {
                ResultKt.throwOnFailure(obj);
                sx2 = this.this$0.mutex;
                financialConnectionsSheetViewModel = this.this$0;
                this.L$0 = sx2;
                this.L$1 = financialConnectionsSheetViewModel;
                this.label = 1;
                if (sx2.mo83452a(null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.L$0 = sx2;
            this.L$1 = financialConnectionsSheetViewModel;
            this.label = 2;
            Object awaitState = financialConnectionsSheetViewModel.awaitState(this);
            if (awaitState == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsSheetViewModel2 = financialConnectionsSheetViewModel;
            sx22 = sx2;
            obj = awaitState;
            financialConnectionsSheetState = (FinancialConnectionsSheetState) obj;
            if (financialConnectionsSheetState.getActivityRecreated()) {
            }
            Unit unit2 = Unit.INSTANCE;
            sx22.mo83451b(null);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            sx22 = sx2;
            th = th3;
            sx22.mo83451b(null);
            throw th;
        }
    }
}
