.class final Lbo/app/f0$h;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbo/app/f0;->a(J)Lzh2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LZC0;",
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
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LZC0;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.braze.dispatch.DataSyncPolicyProvider$kickoffSyncJob$2"
    f = "DataSyncPolicyProvider.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1
    }
    l = {
        0xad,
        0xb1
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "loopDelayMs",
        "$this$launch",
        "loopDelayMs"
    }
    s = {
        "L$0",
        "J$0",
        "L$0",
        "J$0"
    }
.end annotation


# instance fields
.field b:J

.field c:I

.field private synthetic d:Ljava/lang/Object;

.field final synthetic e:Lbo/app/f0;

.field final synthetic f:J


# direct methods
.method public constructor <init>(Lbo/app/f0;JLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbo/app/f0;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lbo/app/f0$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbo/app/f0$h;->e:Lbo/app/f0;

    iput-wide p2, p0, Lbo/app/f0$h;->f:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lbo/app/f0$h;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lbo/app/f0$h;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lbo/app/f0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lbo/app/f0$h;

    iget-object v1, p0, Lbo/app/f0$h;->e:Lbo/app/f0;

    iget-wide v2, p0, Lbo/app/f0$h;->f:J

    invoke-direct {v0, v1, v2, v3, p2}, Lbo/app/f0$h;-><init>(Lbo/app/f0;JLkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lbo/app/f0$h;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lbo/app/f0$h;->a(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lbo/app/f0$h;->c:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v3, p0, Lbo/app/f0$h;->b:J

    iget-object v1, p0, Lbo/app/f0$h;->d:Ljava/lang/Object;

    check-cast v1, LZC0;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p1, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v3, p0, Lbo/app/f0$h;->b:J

    iget-object v1, p0, Lbo/app/f0$h;->d:Ljava/lang/Object;

    check-cast v1, LZC0;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lbo/app/f0$h;->d:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LZC0;

    iget-object p1, p0, Lbo/app/f0$h;->e:Lbo/app/f0;

    invoke-virtual {p1}, Lbo/app/f0;->b()J

    move-result-wide v4

    iget-wide v6, p0, Lbo/app/f0$h;->f:J

    iput-object v1, p0, Lbo/app/f0$h;->d:Ljava/lang/Object;

    iput-wide v4, p0, Lbo/app/f0$h;->b:J

    iput v3, p0, Lbo/app/f0$h;->c:I

    invoke-static {v6, v7, p0}, LrZ0;->a(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-wide v3, v4

    :goto_0
    iget-object p1, p0, Lbo/app/f0$h;->e:Lbo/app/f0;

    invoke-static {p1}, Lbo/app/f0;->b(Lbo/app/f0;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object p1

    invoke-virtual {p1}, Lcom/appboy/Appboy;->requestImmediateDataFlush()V

    move-object p1, p0

    :goto_1
    invoke-static {v1}, LaD0;->f(LZC0;)Z

    move-result v5

    if-eqz v5, :cond_5

    iput-object v1, p1, Lbo/app/f0$h;->d:Ljava/lang/Object;

    iput-wide v3, p1, Lbo/app/f0$h;->b:J

    iput v2, p1, Lbo/app/f0$h;->c:I

    invoke-static {v3, v4, p1}, LrZ0;->a(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_4

    return-object v0

    :cond_4
    :goto_2
    iget-object v5, p1, Lbo/app/f0$h;->e:Lbo/app/f0;

    invoke-static {v5}, Lbo/app/f0;->b(Lbo/app/f0;)Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v5

    invoke-virtual {v5}, Lcom/appboy/Appboy;->requestImmediateDataFlush()V

    goto :goto_1

    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
