.class public final Lak0$d$c;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lak0$d;->a(LgV2;LEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LtX3;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1"
    f = "Clickable.kt"
    i = {}
    l = {
        0x9c
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4$gesture$1$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,565:1\n157#2:566\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4$gesture$1$1\n*L\n155#1:566\n*E\n"
    }
.end annotation


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LCe3;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:Z

.field public final synthetic l:LrX2;

.field public final synthetic m:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LQ14;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic n:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic o:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEX2;ZLrX2;LEX2;LsP5;LsP5;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LCe3;",
            ">;Z",
            "LrX2;",
            "LEX2<",
            "LQ14;",
            ">;",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;>;",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lak0$d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lak0$d$c;->j:LEX2;

    iput-boolean p2, p0, Lak0$d$c;->k:Z

    iput-object p3, p0, Lak0$d$c;->l:LrX2;

    iput-object p4, p0, Lak0$d$c;->m:LEX2;

    iput-object p5, p0, Lak0$d$c;->n:LsP5;

    iput-object p6, p0, Lak0$d$c;->o:LsP5;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v8, Lak0$d$c;

    iget-object v1, p0, Lak0$d$c;->j:LEX2;

    iget-boolean v2, p0, Lak0$d$c;->k:Z

    iget-object v3, p0, Lak0$d$c;->l:LrX2;

    iget-object v4, p0, Lak0$d$c;->m:LEX2;

    iget-object v5, p0, Lak0$d$c;->n:LsP5;

    iget-object v6, p0, Lak0$d$c;->o:LsP5;

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lak0$d$c;-><init>(LEX2;ZLrX2;LEX2;LsP5;LsP5;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v8, Lak0$d$c;->i:Ljava/lang/Object;

    return-object v8
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LtX3;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lak0$d$c;->invoke(LtX3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(LtX3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LtX3;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lak0$d$c;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lak0$d$c;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lak0$d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lak0$d$c;->h:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lak0$d$c;->i:Ljava/lang/Object;

    check-cast p1, LtX3;

    iget-object v1, p0, Lak0$d$c;->j:LEX2;

    invoke-interface {p1}, LtX3;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, LH52;->b(J)J

    move-result-wide v3

    invoke-static {v3, v4}, LA52;->j(J)I

    move-result v5

    int-to-float v5, v5

    invoke-static {v3, v4}, LA52;->k(J)I

    move-result v3

    int-to-float v3, v3

    invoke-static {v5, v3}, LGe3;->a(FF)J

    move-result-wide v3

    invoke-static {v3, v4}, LCe3;->d(J)LCe3;

    move-result-object v3

    invoke-interface {v1, v3}, LEX2;->setValue(Ljava/lang/Object;)V

    new-instance v1, Lak0$d$c$a;

    iget-boolean v5, p0, Lak0$d$c;->k:Z

    iget-object v6, p0, Lak0$d$c;->l:LrX2;

    iget-object v7, p0, Lak0$d$c;->m:LEX2;

    iget-object v8, p0, Lak0$d$c;->n:LsP5;

    const/4 v9, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v9}, Lak0$d$c$a;-><init>(ZLrX2;LEX2;LsP5;Lkotlin/coroutines/Continuation;)V

    new-instance v3, Lak0$d$c$b;

    iget-boolean v4, p0, Lak0$d$c;->k:Z

    iget-object v5, p0, Lak0$d$c;->o:LsP5;

    invoke-direct {v3, v4, v5}, Lak0$d$c$b;-><init>(ZLsP5;)V

    iput v2, p0, Lak0$d$c;->h:I

    invoke-static {p1, v1, v3, p0}, LKY5;->h(LtX3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
