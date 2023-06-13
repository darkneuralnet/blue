package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import android.app.Application;
import androidx.lifecycle.C11747p;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11759u;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.InjectWithFallbackKt;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.InjectorKt;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.DaggerPollingComponent;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.p046di.PollingViewModelSubcomponent;
import com.stripe.android.polling.IntentStatusPoller;
import com.stripe.android.utils.CreationExtrasKtxKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0002/0B1\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b-\u0010.J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0018\u0010\t\u001a\u00020\u0006H\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0082@ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0002R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020%0(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;", "LOr6;", "", "handleTimeLimitReached", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performOneOffPoll", "Lkotlin/time/Duration;", "computeTimeRemaining-UwyO8pc", "()J", "computeTimeRemaining", "timeLimit", "observeCountdown-VtjQ1oo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeCountdown", "observePollingResults", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;", "pollingState", "updatePollingState", "pausePolling", "resumePolling", "handleCancel", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;", "args", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;", "Lcom/stripe/android/polling/IntentStatusPoller;", "poller", "Lcom/stripe/android/polling/IntentStatusPoller;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;", "timeProvider", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;", "LSC0;", "dispatcher", "LSC0;", "Landroidx/lifecycle/p;", "savedStateHandle", "Landroidx/lifecycle/p;", "LGX2;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;", "_uiState", "LGX2;", "LtP5;", "uiState", "LtP5;", "getUiState", "()LtP5;", "<init>", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;Lcom/stripe/android/polling/IntentStatusPoller;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;LSC0;Landroidx/lifecycle/p;)V", "Args", "Factory", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPollingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollingViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,255:1\n230#2,5:256\n230#2,5:261\n230#2,5:266\n230#2,5:276\n47#3:271\n49#3:275\n50#4:272\n55#4:274\n106#5:273\n*S KotlinDebug\n*F\n+ 1 PollingViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel\n*L\n104#1:256,5\n108#1:261,5\n145#1:266,5\n173#1:276,5\n161#1:271\n161#1:275\n161#1:272\n161#1:274\n161#1:273\n*E\n"})
/* loaded from: classes7.dex */
public final class PollingViewModel extends AbstractC35048Or6 {
    private final GX2<PollingUiState> _uiState;
    private final Args args;
    private final SC0 dispatcher;
    private final IntentStatusPoller poller;
    private final C11747p savedStateHandle;
    private final TimeProvider timeProvider;
    private final InterfaceC49220tP5<PollingUiState> uiState;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$1", m28418f = "PollingViewModel.kt", m28417i = {}, m28416l = {77}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$1 */
    /* loaded from: classes7.dex */
    public static final class C192831 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $timeRemaining;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192831(long j, Continuation<? super C192831> continuation) {
            super(2, continuation);
            this.$timeRemaining = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C192831(this.$timeRemaining, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C192831) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                PollingViewModel pollingViewModel = PollingViewModel.this;
                long j = this.$timeRemaining;
                this.label = 1;
                if (pollingViewModel.m116625observeCountdownVtjQ1oo(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$2", m28418f = "PollingViewModel.kt", m28417i = {}, m28416l = {81}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$2 */
    /* loaded from: classes7.dex */
    public static final class C192842 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        int label;

        public C192842(Continuation<? super C192842> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C192842(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C192842) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                PollingViewModel pollingViewModel = PollingViewModel.this;
                this.label = 1;
                if (pollingViewModel.observePollingResults(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$3", m28418f = "PollingViewModel.kt", m28417i = {}, m28416l = {85, 86}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$3 */
    /* loaded from: classes7.dex */
    public static final class C192853 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $timeRemaining;
        int label;
        final /* synthetic */ PollingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192853(long j, PollingViewModel pollingViewModel, Continuation<? super C192853> continuation) {
            super(2, continuation);
            this.$timeRemaining = j;
            this.this$0 = pollingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C192853(this.$timeRemaining, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C192853) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                long j = this.$timeRemaining;
                this.label = 1;
                if (C48120rZ0.m15767b(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            PollingViewModel pollingViewModel = this.this$0;
            this.label = 2;
            if (pollingViewModel.handleTimeLimitReached(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$4", m28418f = "PollingViewModel.kt", m28417i = {0}, m28416l = {90}, m28415m = "invokeSuspend", m28414n = {"$this$launch"}, m28413s = {"L$0"})
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$4 */
    /* loaded from: classes7.dex */
    public static final class C192864 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C192864(Continuation<? super C192864> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C192864 c192864 = new C192864(continuation);
            c192864.L$0 = obj;
            return c192864;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C192864) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                long m116630getInitialDelayUwyO8pc = PollingViewModel.this.args.m116630getInitialDelayUwyO8pc();
                this.L$0 = zc02;
                this.label = 1;
                if (C48120rZ0.m15767b(m116630getInitialDelayUwyO8pc, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zc0 = zc02;
            }
            PollingViewModel.this.poller.startPolling(zc0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0015\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u000eJ\u0019\u0010\u0017\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000eJ\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000e\u0010\u001a\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u001bJH\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\bHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\t\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;", "", "clientSecret", "", "timeLimit", "Lkotlin/time/Duration;", "initialDelay", "maxAttempts", "", "injectorKey", "(Ljava/lang/String;JJILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getClientSecret", "()Ljava/lang/String;", "getInitialDelay-UwyO8pc", "()J", "J", "getInjectorKey$paymentsheet_release", "getMaxAttempts", "()I", "getTimeLimit-UwyO8pc", "component1", "component2", "component2-UwyO8pc", "component3", "component3-UwyO8pc", "component4", "component5", "component5$paymentsheet_release", "copy", "copy-jKevqZI", "(Ljava/lang/String;JJILjava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Args {
        public static final int $stable = 0;
        private final String clientSecret;
        private final long initialDelay;
        private final String injectorKey;
        private final int maxAttempts;
        private final long timeLimit;

        public /* synthetic */ Args(String str, long j, long j2, int i, @InjectorKey String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, j2, i, str2);
        }

        /* renamed from: copy-jKevqZI$default  reason: not valid java name */
        public static /* synthetic */ Args m116626copyjKevqZI$default(Args args, String str, long j, long j2, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = args.clientSecret;
            }
            if ((i2 & 2) != 0) {
                j = args.timeLimit;
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = args.initialDelay;
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = args.maxAttempts;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                str2 = args.injectorKey;
            }
            return args.m116629copyjKevqZI(str, j3, j4, i3, str2);
        }

        public final String component1() {
            return this.clientSecret;
        }

        /* renamed from: component2-UwyO8pc  reason: not valid java name */
        public final long m116627component2UwyO8pc() {
            return this.timeLimit;
        }

        /* renamed from: component3-UwyO8pc  reason: not valid java name */
        public final long m116628component3UwyO8pc() {
            return this.initialDelay;
        }

        public final int component4() {
            return this.maxAttempts;
        }

        public final String component5$paymentsheet_release() {
            return this.injectorKey;
        }

        /* renamed from: copy-jKevqZI  reason: not valid java name */
        public final Args m116629copyjKevqZI(String clientSecret, long j, long j2, int i, @InjectorKey String injectorKey) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
            return new Args(clientSecret, j, j2, i, injectorKey, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Args) {
                Args args = (Args) obj;
                return Intrinsics.areEqual(this.clientSecret, args.clientSecret) && Duration.m118145equalsimpl0(this.timeLimit, args.timeLimit) && Duration.m118145equalsimpl0(this.initialDelay, args.initialDelay) && this.maxAttempts == args.maxAttempts && Intrinsics.areEqual(this.injectorKey, args.injectorKey);
            }
            return false;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: getInitialDelay-UwyO8pc  reason: not valid java name */
        public final long m116630getInitialDelayUwyO8pc() {
            return this.initialDelay;
        }

        public final String getInjectorKey$paymentsheet_release() {
            return this.injectorKey;
        }

        public final int getMaxAttempts() {
            return this.maxAttempts;
        }

        /* renamed from: getTimeLimit-UwyO8pc  reason: not valid java name */
        public final long m116631getTimeLimitUwyO8pc() {
            return this.timeLimit;
        }

        public int hashCode() {
            return (((((((this.clientSecret.hashCode() * 31) + Duration.m118168hashCodeimpl(this.timeLimit)) * 31) + Duration.m118168hashCodeimpl(this.initialDelay)) * 31) + Integer.hashCode(this.maxAttempts)) * 31) + this.injectorKey.hashCode();
        }

        public String toString() {
            String str = this.clientSecret;
            String m118189toStringimpl = Duration.m118189toStringimpl(this.timeLimit);
            String m118189toStringimpl2 = Duration.m118189toStringimpl(this.initialDelay);
            int i = this.maxAttempts;
            String str2 = this.injectorKey;
            return "Args(clientSecret=" + str + ", timeLimit=" + m118189toStringimpl + ", initialDelay=" + m118189toStringimpl2 + ", maxAttempts=" + i + ", injectorKey=" + str2 + ")";
        }

        private Args(String str, long j, long j2, int i, String str2) {
            this.clientSecret = str;
            this.timeLimit = j;
            this.initialDelay = j2;
            this.maxAttempts = i;
            this.injectorKey = str2;
        }

        public /* synthetic */ Args(String str, long j, long j2, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, j2, i, (i2 & 16) != 0 ? InjectorKt.DUMMY_INJECTOR_KEY : str2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001dB\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/Injectable;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory$FallbackInitializeParam;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "arg", "Lcom/stripe/android/core/injection/Injector;", "fallbackInitialize", "Lkotlin/Function0;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;", "argsSupplier", "Lkotlin/jvm/functions/Function0;", "LY94;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/di/PollingViewModelSubcomponent$Builder;", "subcomponentBuilderProvider", "LY94;", "getSubcomponentBuilderProvider", "()LY94;", "setSubcomponentBuilderProvider", "(LY94;)V", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "FallbackInitializeParam", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, Injectable<FallbackInitializeParam> {
        private final Function0<Args> argsSupplier;
        public Y94<PollingViewModelSubcomponent.Builder> subcomponentBuilderProvider;

        @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory$FallbackInitializeParam;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class FallbackInitializeParam {
            private final Application application;

            public FallbackInitializeParam(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                this.application = application;
            }

            public static /* synthetic */ FallbackInitializeParam copy$default(FallbackInitializeParam fallbackInitializeParam, Application application, int i, Object obj) {
                if ((i & 1) != 0) {
                    application = fallbackInitializeParam.application;
                }
                return fallbackInitializeParam.copy(application);
            }

            public final Application component1() {
                return this.application;
            }

            public final FallbackInitializeParam copy(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                return new FallbackInitializeParam(application);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FallbackInitializeParam) && Intrinsics.areEqual(this.application, ((FallbackInitializeParam) obj).application);
            }

            public final Application getApplication() {
                return this.application;
            }

            public int hashCode() {
                return this.application.hashCode();
            }

            public String toString() {
                Application application = this.application;
                return "FallbackInitializeParam(application=" + application + ")";
            }
        }

        public Factory(Function0<Args> argsSupplier) {
            Intrinsics.checkNotNullParameter(argsSupplier, "argsSupplier");
            this.argsSupplier = argsSupplier;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls) {
            return super.create(cls);
        }

        public final Y94<PollingViewModelSubcomponent.Builder> getSubcomponentBuilderProvider() {
            Y94<PollingViewModelSubcomponent.Builder> y94 = this.subcomponentBuilderProvider;
            if (y94 != null) {
                return y94;
            }
            Intrinsics.throwUninitializedPropertyAccessException("subcomponentBuilderProvider");
            return null;
        }

        public final void setSubcomponentBuilderProvider(Y94<PollingViewModelSubcomponent.Builder> y94) {
            Intrinsics.checkNotNullParameter(y94, "<set-?>");
            this.subcomponentBuilderProvider = y94;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Args invoke = this.argsSupplier.invoke();
            Application requireApplication = CreationExtrasKtxKt.requireApplication(extras);
            C11747p m66936a = C11750q.m66936a(extras);
            InjectWithFallbackKt.injectWithFallback(this, invoke.getInjectorKey$paymentsheet_release(), new FallbackInitializeParam(requireApplication));
            PollingViewModel viewModel = getSubcomponentBuilderProvider().get().args(invoke).savedStateHandle(m66936a).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel.Factory.create");
            return viewModel;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public Injector fallbackInitialize(FallbackInitializeParam arg) {
            Intrinsics.checkNotNullParameter(arg, "arg");
            Args invoke = this.argsSupplier.invoke();
            DaggerPollingComponent.builder().application(arg.getApplication()).injectorKey(InjectorKt.DUMMY_INJECTOR_KEY).config(new IntentStatusPoller.Config(invoke.getClientSecret(), invoke.getMaxAttempts())).ioDispatcher(T41.m84377b()).build().inject(this);
            return null;
        }
    }

    public PollingViewModel(Args args, IntentStatusPoller poller, TimeProvider timeProvider, SC0 dispatcher, C11747p savedStateHandle) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(poller, "poller");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.args = args;
        this.poller = poller;
        this.timeProvider = timeProvider;
        this.dispatcher = dispatcher;
        this.savedStateHandle = savedStateHandle;
        GX2<PollingUiState> m8742a = C50405vP5.m8742a(new PollingUiState(args.m116631getTimeLimitUwyO8pc(), null, 2, null));
        this._uiState = m8742a;
        this.uiState = m8742a;
        long m116624computeTimeRemainingUwyO8pc = m116624computeTimeRemainingUwyO8pc();
        Z30.m73800d(C36218Tr6.m82333a(this), dispatcher, null, new C192831(m116624computeTimeRemainingUwyO8pc, null), 2, null);
        Z30.m73800d(C36218Tr6.m82333a(this), dispatcher, null, new C192842(null), 2, null);
        Z30.m73800d(C36218Tr6.m82333a(this), dispatcher, null, new C192853(m116624computeTimeRemainingUwyO8pc, this, null), 2, null);
        Z30.m73800d(C36218Tr6.m82333a(this), dispatcher, null, new C192864(null), 2, null);
    }

    /* renamed from: computeTimeRemaining-UwyO8pc  reason: not valid java name */
    private final long m116624computeTimeRemainingUwyO8pc() {
        Comparable maxOf;
        Long l = (Long) this.savedStateHandle.m66947f("KEY_CURRENT_POLLING_START_TIME");
        if (l == null) {
            this.savedStateHandle.m66940m("KEY_CURRENT_POLLING_START_TIME", Long.valueOf(this.timeProvider.currentTimeInMillis()));
        }
        if (l != null) {
            maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(Duration.m118138boximpl(DurationKt.toDuration((l.longValue() + Duration.m118158getInWholeMillisecondsimpl(this.args.m116631getTimeLimitUwyO8pc())) - this.timeProvider.currentTimeInMillis(), DurationUnit.MILLISECONDS)), Duration.m118138boximpl(Duration.Companion.m118242getZEROUwyO8pc()));
            return ((Duration) maxOf).m118194unboximpl();
        }
        return this.args.m116631getTimeLimitUwyO8pc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleTimeLimitReached(Continuation<? super Unit> continuation) {
        PollingViewModel$handleTimeLimitReached$1 pollingViewModel$handleTimeLimitReached$1;
        Object coroutine_suspended;
        int i;
        PollingViewModel pollingViewModel;
        if (continuation instanceof PollingViewModel$handleTimeLimitReached$1) {
            pollingViewModel$handleTimeLimitReached$1 = (PollingViewModel$handleTimeLimitReached$1) continuation;
            int i2 = pollingViewModel$handleTimeLimitReached$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pollingViewModel$handleTimeLimitReached$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pollingViewModel$handleTimeLimitReached$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pollingViewModel$handleTimeLimitReached$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pollingViewModel = (PollingViewModel) pollingViewModel$handleTimeLimitReached$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.poller.stopPolling();
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(3, DurationUnit.SECONDS);
                    pollingViewModel$handleTimeLimitReached$1.L$0 = this;
                    pollingViewModel$handleTimeLimitReached$1.label = 1;
                    if (C48120rZ0.m15767b(duration, pollingViewModel$handleTimeLimitReached$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pollingViewModel = this;
                }
                pollingViewModel$handleTimeLimitReached$1.L$0 = null;
                pollingViewModel$handleTimeLimitReached$1.label = 2;
                if (pollingViewModel.performOneOffPoll(pollingViewModel$handleTimeLimitReached$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        pollingViewModel$handleTimeLimitReached$1 = new PollingViewModel$handleTimeLimitReached$1(this, continuation);
        Object obj2 = pollingViewModel$handleTimeLimitReached$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pollingViewModel$handleTimeLimitReached$1.label;
        if (i == 0) {
        }
        pollingViewModel$handleTimeLimitReached$1.L$0 = null;
        pollingViewModel$handleTimeLimitReached$1.label = 2;
        if (pollingViewModel.performOneOffPoll(pollingViewModel$handleTimeLimitReached$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeCountdown-VtjQ1oo  reason: not valid java name */
    public final Object m116625observeCountdownVtjQ1oo(long j, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object collect = PollingViewModelKt.m116633access$countdownFlowLRDsOJo(j).collect(new InterfaceC33198Gu1<Duration>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observeCountdown$2
            @Override // p000.InterfaceC33198Gu1
            public /* bridge */ /* synthetic */ Object emit(Duration duration, Continuation continuation2) {
                return m116632emitVtjQ1oo(duration.m118194unboximpl(), continuation2);
            }

            /* renamed from: emit-VtjQ1oo  reason: not valid java name */
            public final Object m116632emitVtjQ1oo(long j2, Continuation<? super Unit> continuation2) {
                GX2 gx2;
                Object value;
                gx2 = PollingViewModel.this._uiState;
                do {
                    value = gx2.getValue();
                } while (!gx2.compareAndSet(value, PollingUiState.m116619copyVtjQ1oo$default((PollingUiState) value, j2, null, 2, null)));
                return Unit.INSTANCE;
            }
        }, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observePollingResults(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        final InterfaceC49220tP5<StripeIntent.Status> state = this.poller.getState();
        Object collect = C36708Vu1.m79276L(new InterfaceC32730Eu1<PollingState>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observePollingResults$$inlined$map$1

            @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PollingViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel\n*L\n1#1,222:1\n48#2:223\n162#3:224\n*E\n"})
            /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observePollingResults$$inlined$map$1$2 */
            /* loaded from: classes7.dex */
            public static final class C192872<T> implements InterfaceC33198Gu1 {
                final /* synthetic */ InterfaceC33198Gu1 $this_unsafeFlow;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observePollingResults$$inlined$map$1$2", m28418f = "PollingViewModel.kt", m28417i = {}, m28416l = {223}, m28415m = "emit", m28414n = {}, m28413s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModel$observePollingResults$$inlined$map$1$2$1 */
                /* loaded from: classes7.dex */
                public static final class C192881 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public C192881(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C192872.this.emit(null, this);
                    }
                }

                public C192872(InterfaceC33198Gu1 interfaceC33198Gu1) {
                    this.$this_unsafeFlow = interfaceC33198Gu1;
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
                    r5 = com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingViewModelKt.toPollingState(r5);
                 */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // p000.InterfaceC33198Gu1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C192881 c192881;
                    Object coroutine_suspended;
                    int i;
                    PollingState pollingState;
                    if (continuation instanceof C192881) {
                        c192881 = (C192881) continuation;
                        int i2 = c192881.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c192881.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = c192881.result;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c192881.label;
                            if (i == 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC33198Gu1 interfaceC33198Gu1 = this.$this_unsafeFlow;
                                StripeIntent.Status status = (StripeIntent.Status) obj;
                                if (status == null || pollingState == null) {
                                    pollingState = PollingState.Active;
                                }
                                c192881.label = 1;
                                if (interfaceC33198Gu1.emit(pollingState, c192881) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c192881 = new C192881(continuation);
                    Object obj22 = c192881.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c192881.label;
                    if (i == 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // p000.InterfaceC32730Eu1
            public Object collect(InterfaceC33198Gu1<? super PollingState> interfaceC33198Gu1, Continuation continuation2) {
                Object coroutine_suspended2;
                Object collect2 = InterfaceC32730Eu1.this.collect(new C192872(interfaceC33198Gu1), continuation2);
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (collect2 == coroutine_suspended2) {
                    return collect2;
                }
                return Unit.INSTANCE;
            }
        }, new PollingViewModel$observePollingResults$3(this, null)).collect(new PollingViewModel$observePollingResults$4(this), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (collect == coroutine_suspended) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object observePollingResults$updatePollingState(PollingViewModel pollingViewModel, PollingState pollingState, Continuation continuation) {
        pollingViewModel.updatePollingState(pollingState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performOneOffPoll(Continuation<? super Unit> continuation) {
        PollingViewModel$performOneOffPoll$1 pollingViewModel$performOneOffPoll$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        PollingViewModel pollingViewModel;
        PollingUiState value;
        PollingUiState value2;
        if (continuation instanceof PollingViewModel$performOneOffPoll$1) {
            pollingViewModel$performOneOffPoll$1 = (PollingViewModel$performOneOffPoll$1) continuation;
            int i2 = pollingViewModel$performOneOffPoll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pollingViewModel$performOneOffPoll$1.label = i2 - Integer.MIN_VALUE;
                obj = pollingViewModel$performOneOffPoll$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pollingViewModel$performOneOffPoll$1.label;
                if (i == 0) {
                    if (i == 1) {
                        pollingViewModel = (PollingViewModel) pollingViewModel$performOneOffPoll$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    IntentStatusPoller intentStatusPoller = this.poller;
                    pollingViewModel$performOneOffPoll$1.L$0 = this;
                    pollingViewModel$performOneOffPoll$1.label = 1;
                    obj = intentStatusPoller.forcePoll(pollingViewModel$performOneOffPoll$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pollingViewModel = this;
                }
                if (((StripeIntent.Status) obj) != StripeIntent.Status.Succeeded) {
                    GX2<PollingUiState> gx2 = pollingViewModel._uiState;
                    do {
                        value2 = gx2.getValue();
                    } while (!gx2.compareAndSet(value2, PollingUiState.m116619copyVtjQ1oo$default(value2, 0L, PollingState.Success, 1, null)));
                } else {
                    GX2<PollingUiState> gx22 = pollingViewModel._uiState;
                    do {
                        value = gx22.getValue();
                    } while (!gx22.compareAndSet(value, PollingUiState.m116619copyVtjQ1oo$default(value, 0L, PollingState.Failed, 1, null)));
                }
                return Unit.INSTANCE;
            }
        }
        pollingViewModel$performOneOffPoll$1 = new PollingViewModel$performOneOffPoll$1(this, continuation);
        obj = pollingViewModel$performOneOffPoll$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pollingViewModel$performOneOffPoll$1.label;
        if (i == 0) {
        }
        if (((StripeIntent.Status) obj) != StripeIntent.Status.Succeeded) {
        }
        return Unit.INSTANCE;
    }

    private final void updatePollingState(PollingState pollingState) {
        PollingUiState value;
        GX2<PollingUiState> gx2 = this._uiState;
        do {
            value = gx2.getValue();
        } while (!gx2.compareAndSet(value, PollingUiState.m116619copyVtjQ1oo$default(value, 0L, pollingState, 1, null)));
    }

    public final InterfaceC49220tP5<PollingUiState> getUiState() {
        return this.uiState;
    }

    public final void handleCancel() {
        PollingUiState value;
        GX2<PollingUiState> gx2 = this._uiState;
        do {
            value = gx2.getValue();
        } while (!gx2.compareAndSet(value, PollingUiState.m116619copyVtjQ1oo$default(value, 0L, PollingState.Canceled, 1, null)));
        this.poller.stopPolling();
    }

    public final void pausePolling() {
        this.poller.stopPolling();
    }

    public final void resumePolling() {
        Z30.m73800d(C36218Tr6.m82333a(this), this.dispatcher, null, new PollingViewModel$resumePolling$1(this, null), 2, null);
    }
}
