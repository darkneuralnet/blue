.class public final LuF5$c$f;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LuF5$c;->o2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LGu1<",
        "-",
        "Lco/bird/api/response/NokelockResponse;",
        ">;",
        "Ljava/lang/Throwable;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"
    }
    d2 = {
        "LGu1;",
        "Lco/bird/api/response/NokelockResponse;",
        "kotlin.jvm.PlatformType",
        "",
        "exception",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "co.bird.android.smartlock.impl.SmartLockNokeDeviceManager$SmartlockNokeGattCallback$initialize$5"
    f = "SmartlockNokeDeviceManager.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LuF5;


# direct methods
.method public constructor <init>(LuF5;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LuF5;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LuF5$c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LuF5$c$f;->j:LuF5;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final e(LGu1;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGu1<",
            "-",
            "Lco/bird/api/response/NokelockResponse;",
            ">;",
            "Ljava/lang/Throwable;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, LuF5$c$f;

    iget-object v0, p0, LuF5$c$f;->j:LuF5;

    invoke-direct {p1, v0, p3}, LuF5$c$f;-><init>(LuF5;Lkotlin/coroutines/Continuation;)V

    iput-object p2, p1, LuF5$c$f;->i:Ljava/lang/Object;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LuF5$c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LGu1;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, LuF5$c$f;->e(LGu1;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, LuF5$c$f;->h:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, LuF5$c$f;->i:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Ljava/lang/Throwable;

    iget-object p1, p0, LuF5$c$f;->j:LuF5;

    invoke-virtual {p1}, LVy;->R()LGX2;

    move-result-object p1

    iget-object v0, p0, LuF5$c$f;->j:LuF5;

    invoke-virtual {v0}, LVy;->R()LGX2;

    move-result-object v0

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCJ5;

    iget-object v1, p0, LuF5$c$f;->j:LuF5;

    invoke-virtual {v1}, LVy;->R()LGX2;

    move-result-object v1

    invoke-interface {v1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LCJ5;

    invoke-virtual {v1}, LCJ5;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    sget-object v2, LFJ5;->q:LFJ5;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x3e

    const/4 v9, 0x0

    invoke-static/range {v0 .. v9}, LCJ5;->copy$default(LCJ5;Ljava/util/List;LHJ5;LGJ5;LIJ5;LEJ5;LDJ5;Ljava/lang/Throwable;ILjava/lang/Object;)LCJ5;

    move-result-object v0

    invoke-interface {p1, v0}, LBX2;->b(Ljava/lang/Object;)Z

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
