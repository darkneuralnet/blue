.class final Lbo/app/f0$b$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbo/app/f0$b;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
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
    c = "com.braze.dispatch.DataSyncPolicyProvider$2$onReceive$1"
    f = "DataSyncPolicyProvider.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:Lbo/app/f0;

.field final synthetic e:Landroid/content/Intent;

.field final synthetic f:Lbo/app/g2;

.field final synthetic g:Landroid/content/BroadcastReceiver$PendingResult;


# direct methods
.method public constructor <init>(Lbo/app/f0;Landroid/content/Intent;Lbo/app/g2;Landroid/content/BroadcastReceiver$PendingResult;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbo/app/f0;",
            "Landroid/content/Intent;",
            "Lbo/app/g2;",
            "Landroid/content/BroadcastReceiver$PendingResult;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lbo/app/f0$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbo/app/f0$b$a;->d:Lbo/app/f0;

    iput-object p2, p0, Lbo/app/f0$b$a;->e:Landroid/content/Intent;

    iput-object p3, p0, Lbo/app/f0$b$a;->f:Lbo/app/g2;

    iput-object p4, p0, Lbo/app/f0$b$a;->g:Landroid/content/BroadcastReceiver$PendingResult;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, Lbo/app/f0$b$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lbo/app/f0$b$a;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lbo/app/f0$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v6, Lbo/app/f0$b$a;

    iget-object v1, p0, Lbo/app/f0$b$a;->d:Lbo/app/f0;

    iget-object v2, p0, Lbo/app/f0$b$a;->e:Landroid/content/Intent;

    iget-object v3, p0, Lbo/app/f0$b$a;->f:Lbo/app/g2;

    iget-object v4, p0, Lbo/app/f0$b$a;->g:Landroid/content/BroadcastReceiver$PendingResult;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lbo/app/f0$b$a;-><init>(Lbo/app/f0;Landroid/content/Intent;Lbo/app/g2;Landroid/content/BroadcastReceiver$PendingResult;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v6, Lbo/app/f0$b$a;->c:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lbo/app/f0$b$a;->a(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lbo/app/f0$b$a;->b:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lbo/app/f0$b$a;->c:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, LZC0;

    :try_start_0
    iget-object p1, p0, Lbo/app/f0$b$a;->d:Lbo/app/f0;

    iget-object v0, p0, Lbo/app/f0$b$a;->e:Landroid/content/Intent;

    invoke-static {p1}, Lbo/app/f0;->a(Lbo/app/f0;)Landroid/net/ConnectivityManager;

    move-result-object v2

    invoke-static {v0, v2}, Lbo/app/v;->a(Landroid/content/Intent;Landroid/net/ConnectivityManager;)Lbo/app/o3;

    move-result-object v0

    invoke-static {p1, v0}, Lbo/app/f0;->a(Lbo/app/f0;Lbo/app/o3;)V

    iget-object p1, p0, Lbo/app/f0$b$a;->d:Lbo/app/f0;

    invoke-virtual {p1}, Lbo/app/f0;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->e:Lk20$a;

    sget-object v5, Lbo/app/f0$b$a$a;->b:Lbo/app/f0$b$a$a;

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v3, p1

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-object v0, p0, Lbo/app/f0$b$a;->d:Lbo/app/f0;

    iget-object v1, p0, Lbo/app/f0$b$a;->f:Lbo/app/g2;

    invoke-static {v0, v1, p1}, Lbo/app/f0;->a(Lbo/app/f0;Lbo/app/g2;Ljava/lang/Throwable;)V

    :goto_0
    iget-object p1, p0, Lbo/app/f0$b$a;->g:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
