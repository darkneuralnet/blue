.class public final LmN1$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmN1;->a(LgV2;LrX2;Z)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LgV2;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "LgV2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LgV2;",
        "d",
        "(LgV2;LEt0;I)LgV2;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,116:1\n474#2,4:117\n478#2,2:125\n482#2:131\n25#3:121\n25#3:132\n50#3:139\n49#3:140\n67#3,3:147\n66#3:150\n1114#4,3:122\n1117#4,3:128\n1114#4,6:133\n1114#4,6:141\n1114#4,6:151\n474#5:127\n76#6:157\n102#6,2:158\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2\n*L\n56#1:117,4\n56#1:125,2\n56#1:131\n56#1:121\n57#1:132\n83#1:139\n83#1:140\n86#1:147,3\n86#1:150\n56#1:122,3\n56#1:128,3\n57#1:133,6\n83#1:141,6\n86#1:151,6\n56#1:127\n57#1:157\n57#1:158,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LrX2;

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(LrX2;Z)V
    .locals 0

    iput-object p1, p0, LmN1$b;->g:LrX2;

    iput-boolean p2, p0, LmN1$b;->h:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static final synthetic a(LrX2;LEX2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LmN1$b;->e(LrX2;LEX2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LEX2;LrX2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LmN1$b;->f(LEX2;LrX2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LEX2;LrX2;)V
    .locals 0

    invoke-static {p0, p1}, LmN1$b;->i(LEX2;LrX2;)V

    return-void
.end method

.method public static final e(LrX2;LEX2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LrX2;",
            "LEX2<",
            "LjN1;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LmN1$b$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LmN1$b$d;

    iget v1, v0, LmN1$b$d;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LmN1$b$d;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, LmN1$b$d;

    invoke-direct {v0, p2}, LmN1$b$d;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, LmN1$b$d;->j:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LmN1$b$d;->k:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LmN1$b$d;->i:Ljava/lang/Object;

    check-cast p0, LjN1;

    iget-object p1, v0, LmN1$b$d;->h:Ljava/lang/Object;

    check-cast p1, LEX2;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-static {p1}, LmN1$b;->g(LEX2;)LjN1;

    move-result-object p2

    if-nez p2, :cond_4

    new-instance p2, LjN1;

    invoke-direct {p2}, LjN1;-><init>()V

    iput-object p1, v0, LmN1$b$d;->h:Ljava/lang/Object;

    iput-object p2, v0, LmN1$b$d;->i:Ljava/lang/Object;

    iput v3, v0, LmN1$b$d;->k:I

    invoke-interface {p0, p2, v0}, LrX2;->c(Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p2

    :goto_1
    invoke-static {p1, p0}, LmN1$b;->h(LEX2;LjN1;)V

    :cond_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final f(LEX2;LrX2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LjN1;",
            ">;",
            "LrX2;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LmN1$b$e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LmN1$b$e;

    iget v1, v0, LmN1$b$e;->j:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LmN1$b$e;->j:I

    goto :goto_0

    :cond_0
    new-instance v0, LmN1$b$e;

    invoke-direct {v0, p2}, LmN1$b$e;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, LmN1$b$e;->i:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LmN1$b$e;->j:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LmN1$b$e;->h:Ljava/lang/Object;

    check-cast p0, LEX2;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-static {p0}, LmN1$b;->g(LEX2;)LjN1;

    move-result-object p2

    if-eqz p2, :cond_4

    new-instance v2, LkN1;

    invoke-direct {v2, p2}, LkN1;-><init>(LjN1;)V

    iput-object p0, v0, LmN1$b$e;->h:Ljava/lang/Object;

    iput v3, v0, LmN1$b$e;->j:I

    invoke-interface {p1, v2, v0}, LrX2;->c(Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 p1, 0x0

    invoke-static {p0, p1}, LmN1$b;->h(LEX2;LjN1;)V

    :cond_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final g(LEX2;)LjN1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LjN1;",
            ">;)",
            "LjN1;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LjN1;

    return-object p0
.end method

.method public static final h(LEX2;LjN1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LjN1;",
            ">;",
            "LjN1;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final i(LEX2;LrX2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LjN1;",
            ">;",
            "LrX2;",
            ")V"
        }
    .end annotation

    invoke-static {p0}, LmN1$b;->g(LEX2;)LjN1;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, LkN1;

    invoke-direct {v1, v0}, LkN1;-><init>(LjN1;)V

    invoke-interface {p1, v1}, LrX2;->a(Ld62;)Z

    const/4 p1, 0x0

    invoke-static {p0, p1}, LmN1$b;->h(LEX2;LjN1;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final d(LgV2;LEt0;I)LgV2;
    .locals 7

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x4d211471    # 1.68904464E8f

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.hoverable.<anonymous> (Hoverable.kt:54)"

    invoke-static {p1, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const p1, 0x2e20b340

    invoke-interface {p2, p1}, LEt0;->F(I)V

    const p1, -0x1d58f75c

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p3, v1, :cond_1

    sget-object p3, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {p3, p2}, LY91;->j(Lkotlin/coroutines/CoroutineContext;LEt0;)LZC0;

    move-result-object p3

    new-instance v1, Liu0;

    invoke-direct {v1, p3}, Liu0;-><init>(LZC0;)V

    invoke-interface {p2, v1}, LEt0;->z(Ljava/lang/Object;)V

    move-object p3, v1

    :cond_1
    invoke-interface {p2}, LEt0;->Q()V

    check-cast p3, Liu0;

    invoke-virtual {p3}, Liu0;->a()LZC0;

    move-result-object p3

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-ne p1, v1, :cond_2

    const/4 p1, 0x2

    invoke-static {v2, v2, p1, v2}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object p1

    invoke-interface {p2, p1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    check-cast p1, LEX2;

    iget-object v1, p0, LmN1$b;->g:LrX2;

    const v3, 0x1e7b2b64

    invoke-interface {p2, v3}, LEt0;->F(I)V

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p2, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_3

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_4

    :cond_3
    new-instance v4, LmN1$b$a;

    invoke-direct {v4, p1, v1}, LmN1$b$a;-><init>(LEX2;LrX2;)V

    invoke-interface {p2, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x0

    invoke-static {v1, v4, p2, v3}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    iget-boolean v1, p0, LmN1$b;->h:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v3, p0, LmN1$b;->h:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-object v4, p0, LmN1$b;->g:LrX2;

    iget-boolean v5, p0, LmN1$b;->h:Z

    const v6, 0x607fb4c4

    invoke-interface {p2, v6}, LEt0;->F(I)V

    invoke-interface {p2, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    invoke-interface {p2, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_5

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v6, v0, :cond_6

    :cond_5
    new-instance v6, LmN1$b$b;

    invoke-direct {v6, v5, p1, v4, v2}, LmN1$b$b;-><init>(ZLEX2;LrX2;Lkotlin/coroutines/Continuation;)V

    invoke-interface {p2, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/16 v0, 0x40

    invoke-static {v1, v6, p2, v0}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    iget-boolean v0, p0, LmN1$b;->h:Z

    if-eqz v0, :cond_7

    sget-object v0, LgV2;->b0:LgV2$a;

    iget-object v1, p0, LmN1$b;->g:LrX2;

    new-instance v3, LmN1$b$c;

    invoke-direct {v3, p3, v1, p1, v2}, LmN1$b$c;-><init>(LZC0;LrX2;LEX2;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, v3}, LzW5;->c(LgV2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)LgV2;

    move-result-object p1

    goto :goto_0

    :cond_7
    sget-object p1, LgV2;->b0:LgV2$a;

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    invoke-interface {p2}, LEt0;->Q()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LgV2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LmN1$b;->d(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
