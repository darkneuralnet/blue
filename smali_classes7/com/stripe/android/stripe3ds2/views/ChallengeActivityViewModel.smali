.class public final Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;,
        Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001:\u0002STB1\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010N\u001a\u00020M\u0012\u0008\u0008\u0002\u0010$\u001a\u00020#\u0012\u0006\u0010P\u001a\u00020O\u00a2\u0006\u0004\u0008Q\u0010RJ\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J \u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0008\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\r0)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u001d\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/R\u001a\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u000b0)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010+R\u001d\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00081\u0010-\u001a\u0004\u00082\u0010/R\u001a\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00140)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u0010+R\u001d\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00084\u0010-\u001a\u0004\u00085\u0010/R\u001a\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00170)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u0010+R\u001d\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00028\u0006\u00a2\u0006\u000c\n\u0004\u00087\u0010-\u001a\u0004\u00088\u0010/R\u001a\u0010;\u001a\u0008\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u001d\u0010=\u001a\u0008\u0012\u0004\u0012\u00020:0\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008=\u0010-\u001a\u0004\u0008>\u0010/R\u001a\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u001a098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008?\u0010<R\u001d\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008@\u0010-\u001a\u0004\u0008A\u0010/R\"\u0010B\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008B\u0010C\u001a\u0004\u0008D\u0010E\"\u0004\u0008F\u0010GR\u001a\u0010I\u001a\u00020H8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008I\u0010J\u001a\u0004\u0008K\u0010L\u00a8\u0006U"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;",
        "LOr6;",
        "Landroidx/lifecycle/LiveData;",
        "",
        "getTimeout",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;",
        "imageData",
        "",
        "densityDpi",
        "Landroid/graphics/Bitmap;",
        "getImage",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;",
        "action",
        "",
        "submit",
        "stopTimer",
        "onMemoryEvent",
        "onRefreshUi",
        "challengeAction",
        "onSubmitClicked",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;",
        "challengeResult",
        "onFinish",
        "",
        "text",
        "updateChallengeText",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;",
        "cres",
        "onNextScreen",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;",
        "challengeActionHandler",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;",
        "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;",
        "transactionTimer",
        "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;",
        "Lcom/stripe/android/stripe3ds2/utils/ImageCache;",
        "imageCache",
        "Lcom/stripe/android/stripe3ds2/utils/ImageCache;",
        "Lcom/stripe/android/stripe3ds2/views/ImageRepository;",
        "imageRepository",
        "Lcom/stripe/android/stripe3ds2/views/ImageRepository;",
        "LuX2;",
        "_refreshUi",
        "LuX2;",
        "refreshUi",
        "Landroidx/lifecycle/LiveData;",
        "getRefreshUi",
        "()Landroidx/lifecycle/LiveData;",
        "_submitClicked",
        "submitClicked",
        "getSubmitClicked",
        "_shouldFinish",
        "shouldFinish",
        "getShouldFinish",
        "_challengeText",
        "challengeText",
        "getChallengeText",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;",
        "_challengeRequestResult",
        "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;",
        "challengeRequestResult",
        "getChallengeRequestResult",
        "_nextScreen",
        "nextScreen",
        "getNextScreen",
        "shouldRefreshUi",
        "Z",
        "getShouldRefreshUi",
        "()Z",
        "setShouldRefreshUi",
        "(Z)V",
        "Lzh2;",
        "transactionTimerJob",
        "Lzh2;",
        "getTransactionTimerJob$3ds2sdk_release",
        "()Lzh2;",
        "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "errorReporter",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "<init>",
        "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lkotlin/coroutines/CoroutineContext;)V",
        "Factory",
        "OnInactiveAwareMutableLiveData",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field private final _challengeRequestResult:Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData<",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;",
            ">;"
        }
    .end annotation
.end field

.field private final _challengeText:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final _nextScreen:Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData<",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;",
            ">;"
        }
    .end annotation
.end field

.field private final _refreshUi:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final _shouldFinish:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;",
            ">;"
        }
    .end annotation
.end field

.field private final _submitClicked:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;",
            ">;"
        }
    .end annotation
.end field

.field private final challengeActionHandler:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;

.field private final challengeRequestResult:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;",
            ">;"
        }
    .end annotation
.end field

.field private final challengeText:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final imageCache:Lcom/stripe/android/stripe3ds2/utils/ImageCache;

.field private final imageRepository:Lcom/stripe/android/stripe3ds2/views/ImageRepository;

.field private final nextScreen:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;",
            ">;"
        }
    .end annotation
.end field

.field private final refreshUi:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final shouldFinish:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;",
            ">;"
        }
    .end annotation
.end field

.field private shouldRefreshUi:Z

.field private final submitClicked:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;",
            ">;"
        }
    .end annotation
.end field

.field private final transactionTimer:Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;

.field private final transactionTimerJob:Lzh2;


# direct methods
.method public constructor <init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lkotlin/coroutines/CoroutineContext;)V
    .locals 6

    const-string v0, "challengeActionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionTimer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageCache"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->challengeActionHandler:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->transactionTimer:Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;

    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->imageCache:Lcom/stripe/android/stripe3ds2/utils/ImageCache;

    new-instance p1, Lcom/stripe/android/stripe3ds2/views/ImageRepository;

    invoke-direct {p1, p3, p5}, Lcom/stripe/android/stripe3ds2/views/ImageRepository;-><init>(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->imageRepository:Lcom/stripe/android/stripe3ds2/views/ImageRepository;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->_refreshUi:LuX2;

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->refreshUi:Landroidx/lifecycle/LiveData;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->_submitClicked:LuX2;

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->submitClicked:Landroidx/lifecycle/LiveData;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->_shouldFinish:LuX2;

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->shouldFinish:Landroidx/lifecycle/LiveData;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->_challengeText:LuX2;

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->challengeText:Landroidx/lifecycle/LiveData;

    new-instance p1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;

    invoke-direct {p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->_challengeRequestResult:Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->challengeRequestResult:Landroidx/lifecycle/LiveData;

    new-instance p1, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;

    invoke-direct {p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->_nextScreen:Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->nextScreen:Landroidx/lifecycle/LiveData;

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$1;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$1;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->transactionTimerJob:Lzh2;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    sget-object p4, Lcom/stripe/android/stripe3ds2/utils/ImageCache$Default;->INSTANCE:Lcom/stripe/android/stripe3ds2/utils/ImageCache$Default;

    :cond_0
    move-object v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method public static final synthetic access$getChallengeActionHandler$p(Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->challengeActionHandler:Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;

    return-object p0
.end method

.method public static final synthetic access$getImageRepository$p(Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;)Lcom/stripe/android/stripe3ds2/views/ImageRepository;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->imageRepository:Lcom/stripe/android/stripe3ds2/views/ImageRepository;

    return-object p0
.end method

.method public static final synthetic access$getTransactionTimer$p(Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;)Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->transactionTimer:Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;

    return-object p0
.end method

.method public static final synthetic access$get_challengeRequestResult$p(Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;)Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->_challengeRequestResult:Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;

    return-object p0
.end method


# virtual methods
.method public final getChallengeRequestResult()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->challengeRequestResult:Landroidx/lifecycle/LiveData;

    return-object v0
.end method

.method public final getChallengeText()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->challengeText:Landroidx/lifecycle/LiveData;

    return-object v0
.end method

.method public final getImage(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;I)Landroidx/lifecycle/LiveData;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;",
            "I)",
            "Landroidx/lifecycle/LiveData<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    new-instance v3, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$getImage$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, p2, v4}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$getImage$1;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;ILkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LWC0;->b(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    move-result-object p1

    return-object p1
.end method

.method public final getNextScreen()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->nextScreen:Landroidx/lifecycle/LiveData;

    return-object v0
.end method

.method public final getRefreshUi()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->refreshUi:Landroidx/lifecycle/LiveData;

    return-object v0
.end method

.method public final getShouldFinish()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->shouldFinish:Landroidx/lifecycle/LiveData;

    return-object v0
.end method

.method public final getShouldRefreshUi()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->shouldRefreshUi:Z

    return v0
.end method

.method public final getSubmitClicked()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->submitClicked:Landroidx/lifecycle/LiveData;

    return-object v0
.end method

.method public final getTimeout()Landroidx/lifecycle/LiveData;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    new-instance v3, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$getTimeout$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$getTimeout$1;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LWC0;->b(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    move-result-object v0

    return-object v0
.end method

.method public final getTransactionTimerJob$3ds2sdk_release()Lzh2;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->transactionTimerJob:Lzh2;

    return-object v0
.end method

.method public final onFinish(Lcom/stripe/android/stripe3ds2/transaction/ChallengeResult;)V
    .locals 1

    const-string v0, "challengeResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->_shouldFinish:LuX2;

    invoke-virtual {v0, p1}, LuX2;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final onMemoryEvent()V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->imageCache:Lcom/stripe/android/stripe3ds2/utils/ImageCache;

    invoke-interface {v0}, Lcom/stripe/android/stripe3ds2/utils/ImageCache;->clear()V

    return-void
.end method

.method public final onNextScreen(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V
    .locals 1

    const-string v0, "cres"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->_nextScreen:Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;

    invoke-virtual {v0, p1}, LuX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final onRefreshUi()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->_refreshUi:LuX2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, LuX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final onSubmitClicked(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;)V
    .locals 1

    const-string v0, "challengeAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->_submitClicked:LuX2;

    invoke-virtual {v0, p1}, LuX2;->postValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setShouldRefreshUi(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->shouldRefreshUi:Z

    return-void
.end method

.method public final stopTimer()V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->transactionTimerJob:Lzh2;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public final submit(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;)V
    .locals 7

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$submit$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$submit$1;-><init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final updateChallengeText(Ljava/lang/String;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;->_challengeText:LuX2;

    invoke-virtual {v0, p1}, LuX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method
