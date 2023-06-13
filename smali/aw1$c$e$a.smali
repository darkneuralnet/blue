.class public final Law1$c$e$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Law1$c$e;->invoke(LWv1;)V
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
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.FocusableKt$focusable$2$5$1"
    f = "Focusable.kt"
    i = {
        0x1
    }
    l = {
        0x93,
        0x97,
        0x9a
    }
    m = "invokeSuspend"
    n = {
        "interaction"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:I

.field public final synthetic j:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Lxv1;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:LrX2;

.field public final synthetic l:LE20;


# direct methods
.method public constructor <init>(LEX2;LrX2;LE20;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Lxv1;",
            ">;",
            "LrX2;",
            "LE20;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Law1$c$e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Law1$c$e$a;->j:LEX2;

    iput-object p2, p0, Law1$c$e$a;->k:LrX2;

    iput-object p3, p0, Law1$c$e$a;->l:LE20;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Law1$c$e$a;

    iget-object v0, p0, Law1$c$e$a;->j:LEX2;

    iget-object v1, p0, Law1$c$e$a;->k:LrX2;

    iget-object v2, p0, Law1$c$e$a;->l:LE20;

    invoke-direct {p1, v0, v1, v2, p2}, Law1$c$e$a;-><init>(LEX2;LrX2;LE20;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

    invoke-virtual {p0, p1, p2}, Law1$c$e$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Law1$c$e$a;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Law1$c$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Law1$c$e$a;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Law1$c$e$a;->i:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Law1$c$e$a;->h:Ljava/lang/Object;

    check-cast v1, Lxv1;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Law1$c$e$a;->h:Ljava/lang/Object;

    check-cast v1, LEX2;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Law1$c$e$a;->j:LEX2;

    invoke-interface {p1}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxv1;

    if-eqz p1, :cond_6

    iget-object v1, p0, Law1$c$e$a;->k:LrX2;

    iget-object v6, p0, Law1$c$e$a;->j:LEX2;

    new-instance v7, Lyv1;

    invoke-direct {v7, p1}, Lyv1;-><init>(Lxv1;)V

    if-eqz v1, :cond_5

    iput-object v6, p0, Law1$c$e$a;->h:Ljava/lang/Object;

    iput v4, p0, Law1$c$e$a;->i:I

    invoke-interface {v1, v7, p0}, LrX2;->c(Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v1, v6

    :goto_0
    move-object v6, v1

    :cond_5
    invoke-interface {v6, v5}, LEX2;->setValue(Ljava/lang/Object;)V

    :cond_6
    new-instance v1, Lxv1;

    invoke-direct {v1}, Lxv1;-><init>()V

    iget-object p1, p0, Law1$c$e$a;->k:LrX2;

    if-eqz p1, :cond_7

    iput-object v1, p0, Law1$c$e$a;->h:Ljava/lang/Object;

    iput v3, p0, Law1$c$e$a;->i:I

    invoke-interface {p1, v1, p0}, LrX2;->c(Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_1
    iget-object p1, p0, Law1$c$e$a;->j:LEX2;

    invoke-interface {p1, v1}, LEX2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Law1$c$e$a;->l:LE20;

    iput-object v5, p0, Law1$c$e$a;->h:Ljava/lang/Object;

    iput v2, p0, Law1$c$e$a;->i:I

    invoke-static {p1, v5, p0, v4, v5}, LE20;->a(LE20;LOs4;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
