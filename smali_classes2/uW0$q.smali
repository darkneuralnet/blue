.class public final LuW0$q;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LuW0;->u(Landroid/content/Context;Landroid/widget/ImageView;Lw20;Ljava/lang/String;)V
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
    c = "com.braze.images.DefaultBrazeImageLoader$renderUrlIntoViewTask$1"
    f = "DefaultBrazeImageLoader.kt"
    i = {}
    l = {
        0xf9
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:I

.field public final synthetic i:LuW0;

.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lw20;

.field public final synthetic m:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(LuW0;Landroid/content/Context;Ljava/lang/String;Lw20;Landroid/widget/ImageView;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LuW0;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lw20;",
            "Landroid/widget/ImageView;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LuW0$q;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LuW0$q;->i:LuW0;

    iput-object p2, p0, LuW0$q;->j:Landroid/content/Context;

    iput-object p3, p0, LuW0$q;->k:Ljava/lang/String;

    iput-object p4, p0, LuW0$q;->l:Lw20;

    iput-object p5, p0, LuW0$q;->m:Landroid/widget/ImageView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, LuW0$q;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, LuW0$q;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LuW0$q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    new-instance p1, LuW0$q;

    iget-object v1, p0, LuW0$q;->i:LuW0;

    iget-object v2, p0, LuW0$q;->j:Landroid/content/Context;

    iget-object v3, p0, LuW0$q;->k:Ljava/lang/String;

    iget-object v4, p0, LuW0$q;->l:Lw20;

    iget-object v5, p0, LuW0$q;->m:Landroid/widget/ImageView;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LuW0$q;-><init>(LuW0;Landroid/content/Context;Ljava/lang/String;Lw20;Landroid/widget/ImageView;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, LuW0$q;->a(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LuW0$q;->h:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const/16 v2, 0x539

    invoke-static {v2}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    iget-object v2, v0, LuW0$q;->i:LuW0;

    iget-object v4, v0, LuW0$q;->j:Landroid/content/Context;

    iget-object v5, v0, LuW0$q;->k:Ljava/lang/String;

    iget-object v6, v0, LuW0$q;->l:Lw20;

    invoke-virtual {v2, v4, v5, v6}, LuW0;->n(Landroid/content/Context;Ljava/lang/String;Lw20;)Landroid/graphics/Bitmap;

    move-result-object v10

    if-nez v10, :cond_2

    sget-object v11, Lk20;->a:Lk20;

    invoke-static {}, LuW0;->g()Ljava/lang/String;

    move-result-object v12

    new-instance v1, LuW0$q$a;

    iget-object v2, v0, LuW0$q;->k:Ljava/lang/String;

    invoke-direct {v1, v2}, LuW0$q$a;-><init>(Ljava/lang/String;)V

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0xe

    const/16 v18, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v11 .. v18}, Lk20;->f(Lk20;Ljava/lang/String;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {}, LT41;->c()LpG2;

    move-result-object v2

    new-instance v4, LuW0$q$b;

    iget-object v8, v0, LuW0$q;->k:Ljava/lang/String;

    iget-object v9, v0, LuW0$q;->m:Landroid/widget/ImageView;

    iget-object v11, v0, LuW0$q;->l:Lw20;

    const/4 v12, 0x0

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, LuW0$q$b;-><init>(Ljava/lang/String;Landroid/widget/ImageView;Landroid/graphics/Bitmap;Lw20;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, LuW0$q;->h:I

    invoke-static {v2, v4, v0}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method
