.class public final Lcom/stripe/android/cards/CardAccountRangeService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;,
        Lcom/stripe/android/cards/CardAccountRangeService$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001:\u00010B\'\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000c\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010 R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\"\u001a\u0004\u0008#\u0010$R*\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008&\u0010\'\u0012\u0004\u0008,\u0010-\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+\u00a8\u00061"
    }
    d2 = {
        "Lcom/stripe/android/cards/CardAccountRangeService;",
        "",
        "Lcom/stripe/android/model/AccountRange;",
        "accountRange",
        "",
        "shouldQueryRepository",
        "Lcom/stripe/android/cards/CardNumber$Unvalidated;",
        "cardNumber",
        "shouldQueryAccountRange",
        "",
        "onCardNumberChanged",
        "queryAccountRangeRepository",
        "cancelAccountRangeRepositoryJob",
        "newAccountRange",
        "updateAccountRangeResult",
        "Lcom/stripe/android/cards/CardAccountRangeRepository;",
        "cardAccountRangeRepository",
        "Lcom/stripe/android/cards/CardAccountRangeRepository;",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "Lcom/stripe/android/cards/StaticCardAccountRanges;",
        "staticCardAccountRanges",
        "Lcom/stripe/android/cards/StaticCardAccountRanges;",
        "getStaticCardAccountRanges",
        "()Lcom/stripe/android/cards/StaticCardAccountRanges;",
        "Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;",
        "accountRangeResultListener",
        "Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;",
        "LEu1;",
        "isLoading",
        "LEu1;",
        "()LEu1;",
        "<set-?>",
        "Lcom/stripe/android/model/AccountRange;",
        "getAccountRange",
        "()Lcom/stripe/android/model/AccountRange;",
        "Lzh2;",
        "accountRangeRepositoryJob",
        "Lzh2;",
        "getAccountRangeRepositoryJob",
        "()Lzh2;",
        "setAccountRangeRepositoryJob",
        "(Lzh2;)V",
        "getAccountRangeRepositoryJob$annotations",
        "()V",
        "<init>",
        "(Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;)V",
        "AccountRangeResultListener",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private accountRange:Lcom/stripe/android/model/AccountRange;

.field private accountRangeRepositoryJob:Lzh2;

.field private final accountRangeResultListener:Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;

.field private final cardAccountRangeRepository:Lcom/stripe/android/cards/CardAccountRangeRepository;

.field private final isLoading:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final staticCardAccountRanges:Lcom/stripe/android/cards/StaticCardAccountRanges;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;)V
    .locals 1

    const-string v0, "cardAccountRangeRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "staticCardAccountRanges"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accountRangeResultListener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->cardAccountRangeRepository:Lcom/stripe/android/cards/CardAccountRangeRepository;

    iput-object p2, p0, Lcom/stripe/android/cards/CardAccountRangeService;->workContext:Lkotlin/coroutines/CoroutineContext;

    iput-object p3, p0, Lcom/stripe/android/cards/CardAccountRangeService;->staticCardAccountRanges:Lcom/stripe/android/cards/StaticCardAccountRanges;

    iput-object p4, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRangeResultListener:Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;

    invoke-interface {p1}, Lcom/stripe/android/cards/CardAccountRangeRepository;->getLoading()LEu1;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->isLoading:LEu1;

    return-void
.end method

.method public static final synthetic access$getCardAccountRangeRepository$p(Lcom/stripe/android/cards/CardAccountRangeService;)Lcom/stripe/android/cards/CardAccountRangeRepository;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->cardAccountRangeRepository:Lcom/stripe/android/cards/CardAccountRangeRepository;

    return-object p0
.end method

.method public static synthetic getAccountRangeRepositoryJob$annotations()V
    .locals 0

    return-void
.end method

.method private final shouldQueryAccountRange(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Z
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRange:Lcom/stripe/android/model/AccountRange;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getBin()Lcom/stripe/android/cards/Bin;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRange:Lcom/stripe/android/model/AccountRange;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/model/AccountRange;->getBinRange()Lcom/stripe/android/model/BinRange;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/stripe/android/model/BinRange;->matches(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Z

    move-result p1

    if-nez p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :cond_2
    :goto_1
    return v1
.end method

.method private final shouldQueryRepository(Lcom/stripe/android/model/AccountRange;)Z
    .locals 2

    invoke-virtual {p1}, Lcom/stripe/android/model/AccountRange;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object p1

    sget-object v0, Lcom/stripe/android/cards/CardAccountRangeService$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method


# virtual methods
.method public final cancelAccountRangeRepositoryJob()V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRangeRepositoryJob:Lzh2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iput-object v1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRangeRepositoryJob:Lzh2;

    return-void
.end method

.method public final getAccountRange()Lcom/stripe/android/model/AccountRange;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRange:Lcom/stripe/android/model/AccountRange;

    return-object v0
.end method

.method public final getAccountRangeRepositoryJob()Lzh2;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRangeRepositoryJob:Lzh2;

    return-object v0
.end method

.method public final getStaticCardAccountRanges()Lcom/stripe/android/cards/StaticCardAccountRanges;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->staticCardAccountRanges:Lcom/stripe/android/cards/StaticCardAccountRanges;

    return-object v0
.end method

.method public final isLoading()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->isLoading:LEu1;

    return-object v0
.end method

.method public final onCardNumberChanged(Lcom/stripe/android/cards/CardNumber$Unvalidated;)V
    .locals 3

    const-string v0, "cardNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->staticCardAccountRanges:Lcom/stripe/android/cards/StaticCardAccountRanges;

    invoke-interface {v0, p1}, Lcom/stripe/android/cards/StaticCardAccountRanges;->filter(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/AccountRange;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-direct {p0, v0}, Lcom/stripe/android/cards/CardAccountRangeService;->shouldQueryRepository(Lcom/stripe/android/model/AccountRange;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v0}, Lcom/stripe/android/cards/CardAccountRangeService;->updateAccountRangeResult(Lcom/stripe/android/model/AccountRange;)V

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Lcom/stripe/android/cards/CardAccountRangeService;->queryAccountRangeRepository(Lcom/stripe/android/cards/CardNumber$Unvalidated;)V

    :goto_2
    return-void
.end method

.method public final synthetic queryAccountRangeRepository(Lcom/stripe/android/cards/CardNumber$Unvalidated;)V
    .locals 8

    const-string v0, "cardNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/cards/CardAccountRangeService;->shouldQueryAccountRange(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/cards/CardAccountRangeService;->cancelAccountRangeRepositoryJob()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRange:Lcom/stripe/android/model/AccountRange;

    iget-object v1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v1}, LaD0;->a(Lkotlin/coroutines/CoroutineContext;)LZC0;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;

    invoke-direct {v5, p1, p0, v0}, Lcom/stripe/android/cards/CardAccountRangeService$queryAccountRangeRepository$1;-><init>(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lcom/stripe/android/cards/CardAccountRangeService;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRangeRepositoryJob:Lzh2;

    :cond_0
    return-void
.end method

.method public final setAccountRangeRepositoryJob(Lzh2;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRangeRepositoryJob:Lzh2;

    return-void
.end method

.method public final synthetic updateAccountRangeResult(Lcom/stripe/android/model/AccountRange;)V
    .locals 1

    iput-object p1, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRange:Lcom/stripe/android/model/AccountRange;

    iget-object v0, p0, Lcom/stripe/android/cards/CardAccountRangeService;->accountRangeResultListener:Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;

    invoke-interface {v0, p1}, Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;->onAccountRangeResult(Lcom/stripe/android/model/AccountRange;)V

    return-void
.end method
