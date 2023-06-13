.class public final LyW0$c;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyW0;->a(ZLe62;LEt0;I)LsP5;
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
    c = "androidx.compose.material.DefaultButtonElevation$elevation$3"
    f = "Button.kt"
    i = {}
    l = {
        0x234
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public h:I

.field public final synthetic i:Lne;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lne<",
            "Lk61;",
            "Lsf;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:LyW0;

.field public final synthetic k:F

.field public final synthetic l:Ld62;


# direct methods
.method public constructor <init>(Lne;LyW0;FLd62;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne<",
            "Lk61;",
            "Lsf;",
            ">;",
            "LyW0;",
            "F",
            "Ld62;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LyW0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LyW0$c;->i:Lne;

    iput-object p2, p0, LyW0$c;->j:LyW0;

    iput p3, p0, LyW0$c;->k:F

    iput-object p4, p0, LyW0$c;->l:Ld62;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance p1, LyW0$c;

    iget-object v1, p0, LyW0$c;->i:Lne;

    iget-object v2, p0, LyW0$c;->j:LyW0;

    iget v3, p0, LyW0$c;->k:F

    iget-object v4, p0, LyW0$c;->l:Ld62;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LyW0$c;-><init>(Lne;LyW0;FLd62;Lkotlin/coroutines/Continuation;)V

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

    invoke-virtual {p0, p1, p2}, LyW0$c;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, LyW0$c;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, LyW0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, LyW0$c;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LyW0$c;->h:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, LyW0$c;->i:Lne;

    invoke-virtual {p1}, Lne;->l()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk61;

    invoke-virtual {p1}, Lk61;->l()F

    move-result p1

    iget-object v1, p0, LyW0$c;->j:LyW0;

    invoke-static {v1}, LyW0;->d(LyW0;)F

    move-result v1

    invoke-static {p1, v1}, Lk61;->i(FF)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    new-instance p1, LQ14;

    sget-object v1, LCe3;->b:LCe3$a;

    invoke-virtual {v1}, LCe3$a;->c()J

    move-result-wide v4

    invoke-direct {p1, v4, v5, v3}, LQ14;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, p1

    goto :goto_0

    :cond_2
    iget-object v1, p0, LyW0$c;->j:LyW0;

    invoke-static {v1}, LyW0;->c(LyW0;)F

    move-result v1

    invoke-static {p1, v1}, Lk61;->i(FF)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v3, LjN1;

    invoke-direct {v3}, LjN1;-><init>()V

    goto :goto_0

    :cond_3
    iget-object v1, p0, LyW0$c;->j:LyW0;

    invoke-static {v1}, LyW0;->b(LyW0;)F

    move-result v1

    invoke-static {p1, v1}, Lk61;->i(FF)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance v3, Lxv1;

    invoke-direct {v3}, Lxv1;-><init>()V

    :cond_4
    :goto_0
    iget-object p1, p0, LyW0$c;->i:Lne;

    iget v1, p0, LyW0$c;->k:F

    iget-object v4, p0, LyW0$c;->l:Ld62;

    iput v2, p0, LyW0$c;->h:I

    invoke-static {p1, v1, v3, v4, p0}, Lka1;->d(Lne;FLd62;Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
