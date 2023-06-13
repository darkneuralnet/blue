.class public final Lw61$l$b$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw61$l$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lv61;",
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
    c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2"
    f = "Draggable.kt"
    i = {
        0x0
    }
    l = {
        0xf6
    }
    m = "invokeSuspend"
    n = {
        "$this$drag"
    }
    s = {
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt$draggable$9$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,461:1\n1#2:462\n*E\n"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lp61;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic l:LFh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LFh0<",
            "Lp61;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic m:LEy3;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;LFh0;LEy3;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lp61;",
            ">;",
            "LFh0<",
            "Lp61;",
            ">;",
            "LEy3;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lw61$l$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw61$l$b$a;->k:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lw61$l$b$a;->l:LFh0;

    iput-object p3, p0, Lw61$l$b$a;->m:LEy3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
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

    new-instance v0, Lw61$l$b$a;

    iget-object v1, p0, Lw61$l$b$a;->k:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, p0, Lw61$l$b$a;->l:LFh0;

    iget-object v3, p0, Lw61$l$b$a;->m:LEy3;

    invoke-direct {v0, v1, v2, v3, p2}, Lw61$l$b$a;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;LFh0;LEy3;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lw61$l$b$a;->j:Ljava/lang/Object;

    return-object v0
.end method

.method public final e(Lv61;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv61;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lw61$l$b$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lw61$l$b$a;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lw61$l$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv61;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lw61$l$b$a;->e(Lv61;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw61$l$b$a;->i:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lw61$l$b$a;->h:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, p0, Lw61$l$b$a;->j:Ljava/lang/Object;

    check-cast v3, Lv61;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, v3

    move-object v3, v1

    move-object v1, v0

    move-object v0, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lw61$l$b$a;->j:Ljava/lang/Object;

    check-cast p1, Lv61;

    move-object v3, p1

    move-object p1, p0

    :goto_0
    iget-object v1, p1, Lw61$l$b$a;->k:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    instance-of v4, v1, Lp61$d;

    if-nez v4, :cond_5

    instance-of v4, v1, Lp61$a;

    if-nez v4, :cond_5

    instance-of v4, v1, Lp61$b;

    if-eqz v4, :cond_2

    check-cast v1, Lp61$b;

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_3

    iget-object v4, p1, Lw61$l$b$a;->m:LEy3;

    invoke-virtual {v1}, Lp61$b;->a()J

    move-result-wide v5

    invoke-static {v5, v6, v4}, Lw61;->e(JLEy3;)F

    move-result v1

    invoke-interface {v3, v1}, Lv61;->a(F)V

    :cond_3
    iget-object v1, p1, Lw61$l$b$a;->k:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v4, p1, Lw61$l$b$a;->l:LFh0;

    iput-object v3, p1, Lw61$l$b$a;->j:Ljava/lang/Object;

    iput-object v1, p1, Lw61$l$b$a;->h:Ljava/lang/Object;

    iput v2, p1, Lw61$l$b$a;->i:I

    invoke-interface {v4, p1}, Lks4;->G(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_4

    return-object v0

    :cond_4
    move-object v7, v0

    move-object v0, p1

    move-object p1, v4

    move-object v4, v3

    move-object v3, v1

    move-object v1, v7

    :goto_2
    iput-object p1, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object p1, v0

    move-object v0, v1

    move-object v3, v4

    goto :goto_0

    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
