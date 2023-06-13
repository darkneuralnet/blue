.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;,
        Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001:\u0002/0B1\u0008\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008-\u0010.J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J\u0018\u0010\t\u001a\u00020\u0006H\u0002\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0082@\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0013\u0010\u000e\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0002R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u001a\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u001d\u0010)\u001a\u0008\u0012\u0004\u0012\u00020%0(8\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u00061"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;",
        "LOr6;",
        "",
        "handleTimeLimitReached",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "performOneOffPoll",
        "Lkotlin/time/Duration;",
        "computeTimeRemaining-UwyO8pc",
        "()J",
        "computeTimeRemaining",
        "timeLimit",
        "observeCountdown-VtjQ1oo",
        "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "observeCountdown",
        "observePollingResults",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;",
        "pollingState",
        "updatePollingState",
        "pausePolling",
        "resumePolling",
        "handleCancel",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;",
        "args",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;",
        "Lcom/stripe/android/polling/IntentStatusPoller;",
        "poller",
        "Lcom/stripe/android/polling/IntentStatusPoller;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;",
        "timeProvider",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;",
        "LSC0;",
        "dispatcher",
        "LSC0;",
        "Landroidx/lifecycle/p;",
        "savedStateHandle",
        "Landroidx/lifecycle/p;",
        "LGX2;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;",
        "_uiState",
        "LGX2;",
        "LtP5;",
        "uiState",
        "LtP5;",
        "getUiState",
        "()LtP5;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;Lcom/stripe/android/polling/IntentStatusPoller;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;LSC0;Landroidx/lifecycle/p;)V",
        "Args",
        "Factory",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPollingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollingViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,255:1\n230#2,5:256\n230#2,5:261\n230#2,5:266\n230#2,5:276\n47#3:271\n49#3:275\n50#4:272\n55#4:274\n106#5:273\n*S KotlinDebug\n*F\n+ 1 PollingViewModel.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel\n*L\n104#1:256,5\n108#1:261,5\n145#1:266,5\n173#1:276,5\n161#1:271\n161#1:275\n161#1:272\n161#1:274\n161#1:273\n*E\n"
    }
.end annotation


# instance fields
.field private final _uiState:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;",
            ">;"
        }
    .end annotation
.end field

.field private final args:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;

.field private final dispatcher:LSC0;

.field private final poller:Lcom/stripe/android/polling/IntentStatusPoller;

.field private final savedStateHandle:Landroidx/lifecycle/p;

.field private final timeProvider:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;

.field private final uiState:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;Lcom/stripe/android/polling/IntentStatusPoller;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;LSC0;Landroidx/lifecycle/p;)V
    .locals 14

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v7, p4

    move-object/from16 v4, p5

    const-string v5, "args"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "poller"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "timeProvider"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "dispatcher"

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "savedStateHandle"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->poller:Lcom/stripe/android/polling/IntentStatusPoller;

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->timeProvider:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;

    iput-object v7, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->dispatcher:LSC0;

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    new-instance v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;->getTimeLimit-UwyO8pc()J

    move-result-wide v9

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v13, 0x0

    move-object v8, v2

    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;-><init>(JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->_uiState:LGX2;

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->uiState:LtP5;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->computeTimeRemaining-UwyO8pc()J

    move-result-wide v8

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$1;

    const/4 v10, 0x0

    invoke-direct {v4, p0, v8, v9, v10}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$1;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;JLkotlin/coroutines/Continuation;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object/from16 v2, p4

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    new-instance v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$2;

    invoke-direct {v4, p0, v10}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    new-instance v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$3;

    invoke-direct {v4, v8, v9, p0, v10}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$3;-><init>(JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    new-instance v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$4;

    invoke-direct {v4, p0, v10}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$4;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static final synthetic access$getArgs$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;

    return-object p0
.end method

.method public static final synthetic access$getPoller$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;)Lcom/stripe/android/polling/IntentStatusPoller;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->poller:Lcom/stripe/android/polling/IntentStatusPoller;

    return-object p0
.end method

.method public static final synthetic access$get_uiState$p(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;)LGX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->_uiState:LGX2;

    return-object p0
.end method

.method public static final synthetic access$handleTimeLimitReached(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->handleTimeLimitReached(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$observeCountdown-VtjQ1oo(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->observeCountdown-VtjQ1oo(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$observePollingResults(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->observePollingResults(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$observePollingResults$updatePollingState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->observePollingResults$updatePollingState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$performOneOffPoll(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->performOneOffPoll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final computeTimeRemaining-UwyO8pc()J
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    const-string v1, "KEY_CURRENT_POLLING_START_TIME"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->f(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-nez v0, :cond_0

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->savedStateHandle:Landroidx/lifecycle/p;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->timeProvider:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;

    invoke-interface {v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;->currentTimeInMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;->getTimeLimit-UwyO8pc()J

    move-result-wide v2

    invoke-static {v2, v3}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->timeProvider:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;

    invoke-interface {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/TimeProvider;->currentTimeInMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    sget-object v2, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object v0

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-virtual {v1}, Lkotlin/time/Duration$Companion;->getZERO-UwyO8pc()J

    move-result-wide v1

    invoke-static {v1, v2}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/comparisons/ComparisonsKt;->maxOf(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Lkotlin/time/Duration;

    invoke-virtual {v0}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->args:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$Args;->getTimeLimit-UwyO8pc()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method private final handleTimeLimitReached(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$handleTimeLimitReached$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$handleTimeLimitReached$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$handleTimeLimitReached$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$handleTimeLimitReached$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$handleTimeLimitReached$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$handleTimeLimitReached$1;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$handleTimeLimitReached$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$handleTimeLimitReached$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$handleTimeLimitReached$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->poller:Lcom/stripe/android/polling/IntentStatusPoller;

    invoke-interface {p1}, Lcom/stripe/android/polling/IntentStatusPoller;->stopPolling()V

    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 p1, 0x3

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v5

    iput-object p0, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$handleTimeLimitReached$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$handleTimeLimitReached$1;->label:I

    invoke-static {v5, v6, v0}, LrZ0;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    const/4 p1, 0x0

    iput-object p1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$handleTimeLimitReached$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$handleTimeLimitReached$1;->label:I

    invoke-direct {v2, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->performOneOffPoll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final observeCountdown-VtjQ1oo(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModelKt;->access$countdownFlow-LRDsOJo(J)LEu1;

    move-result-object p1

    new-instance p2, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$observeCountdown$2;

    invoke-direct {p2, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$observeCountdown$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;)V

    invoke-interface {p1, p2, p3}, LEu1;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final observePollingResults(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->poller:Lcom/stripe/android/polling/IntentStatusPoller;

    invoke-interface {v0}, Lcom/stripe/android/polling/IntentStatusPoller;->getState()LtP5;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$observePollingResults$$inlined$map$1;

    invoke-direct {v1, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$observePollingResults$$inlined$map$1;-><init>(LEu1;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$observePollingResults$3;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$observePollingResults$3;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-static {v1, v0}, LVu1;->L(LEu1;Lkotlin/jvm/functions/Function2;)LEu1;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$observePollingResults$4;

    invoke-direct {v1, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$observePollingResults$4;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;)V

    invoke-interface {v0, v1, p1}, LEu1;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private static final synthetic observePollingResults$updatePollingState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->updatePollingState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private final performOneOffPoll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$performOneOffPoll$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$performOneOffPoll$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$performOneOffPoll$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$performOneOffPoll$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$performOneOffPoll$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$performOneOffPoll$1;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$performOneOffPoll$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$performOneOffPoll$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$performOneOffPoll$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->poller:Lcom/stripe/android/polling/IntentStatusPoller;

    iput-object p0, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$performOneOffPoll$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$performOneOffPoll$1;->label:I

    invoke-interface {p1, v0}, Lcom/stripe/android/polling/IntentStatusPoller;->forcePoll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    check-cast p1, Lcom/stripe/android/model/StripeIntent$Status;

    sget-object v1, Lcom/stripe/android/model/StripeIntent$Status;->Succeeded:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne p1, v1, :cond_5

    iget-object p1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->_uiState:LGX2;

    :cond_4
    invoke-interface {p1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    const-wide/16 v2, 0x0

    sget-object v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;->Success:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->copy-VtjQ1oo$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_5
    iget-object p1, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->_uiState:LGX2;

    :cond_6
    invoke-interface {p1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    const-wide/16 v2, 0x0

    sget-object v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;->Failed:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->copy-VtjQ1oo$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method private final updatePollingState(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)V
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->_uiState:LGX2;

    :cond_0
    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    const-wide/16 v3, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v5, p1

    invoke-static/range {v2 .. v7}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->copy-VtjQ1oo$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method


# virtual methods
.method public final getUiState()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->uiState:LtP5;

    return-object v0
.end method

.method public final handleCancel()V
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->_uiState:LGX2;

    :cond_0
    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    const-wide/16 v3, 0x0

    sget-object v5, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;->Canceled:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;->copy-VtjQ1oo$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;

    move-result-object v2

    invoke-interface {v0, v1, v2}, LGX2;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->poller:Lcom/stripe/android/polling/IntentStatusPoller;

    invoke-interface {v0}, Lcom/stripe/android/polling/IntentStatusPoller;->stopPolling()V

    return-void
.end method

.method public final pausePolling()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->poller:Lcom/stripe/android/polling/IntentStatusPoller;

    invoke-interface {v0}, Lcom/stripe/android/polling/IntentStatusPoller;->stopPolling()V

    return-void
.end method

.method public final resumePolling()V
    .locals 6

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;->dispatcher:LSC0;

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$resumePolling$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel$resumePolling$1;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
