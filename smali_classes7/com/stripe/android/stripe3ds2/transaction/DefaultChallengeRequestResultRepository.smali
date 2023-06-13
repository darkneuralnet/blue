.class public final Lcom/stripe/android/stripe3ds2/transaction/DefaultChallengeRequestResultRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/DefaultChallengeRequestResultRepository;",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;",
        "errorReporter",
        "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V",
        "get",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;",
        "creqExecutorConfig",
        "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;",
        "challengeRequestData",
        "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;",
        "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public constructor <init>(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "errorReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultChallengeRequestResultRepository;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultChallengeRequestResultRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method


# virtual methods
.method public get(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;",
            "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;

    invoke-direct {v0, p1}, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;-><init>(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;)V

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultChallengeRequestResultRepository;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultChallengeRequestResultRepository;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-virtual {v0, p1, v1}, Lcom/stripe/android/stripe3ds2/transaction/StripeChallengeRequestExecutor$Factory;->create(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;

    move-result-object p1

    invoke-interface {p1, p2, p3}, Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;->execute(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
