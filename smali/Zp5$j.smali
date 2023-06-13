.class public final LZp5$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZp5;->j(LgV2;Laq5;LEy3;LDA3;ZZLcu1;LrX2;)LgV2;
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
        "a",
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
        "SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$scrollable$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,579:1\n474#2,4:580\n478#2,2:588\n482#2:594\n25#3:584\n83#3,3:595\n1114#4,3:585\n1117#4,3:591\n1114#4,6:598\n474#5:590\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt$scrollable$2\n*L\n157#1:580,4\n157#1:588,2\n157#1:594\n157#1:584\n159#1:595,3\n157#1:585,3\n157#1:591,3\n159#1:598,6\n157#1:590\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LEy3;

.field public final synthetic h:Laq5;

.field public final synthetic i:Z

.field public final synthetic j:LrX2;

.field public final synthetic k:Lcu1;

.field public final synthetic l:LDA3;

.field public final synthetic m:Z


# direct methods
.method public constructor <init>(LEy3;Laq5;ZLrX2;Lcu1;LDA3;Z)V
    .locals 0

    iput-object p1, p0, LZp5$j;->g:LEy3;

    iput-object p2, p0, LZp5$j;->h:Laq5;

    iput-boolean p3, p0, LZp5$j;->i:Z

    iput-object p4, p0, LZp5$j;->j:LrX2;

    iput-object p5, p0, LZp5$j;->k:Lcu1;

    iput-object p6, p0, LZp5$j;->l:LDA3;

    iput-boolean p7, p0, LZp5$j;->m:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 11

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x258a750f

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.gestures.scrollable.<anonymous> (Scrollable.kt:155)"

    invoke-static {p1, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const p1, 0x2e20b340

    invoke-interface {p2, p1}, LEt0;->F(I)V

    const p1, -0x1d58f75c

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p1, p3, :cond_1

    sget-object p1, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {p1, p2}, LY91;->j(Lkotlin/coroutines/CoroutineContext;LEt0;)LZC0;

    move-result-object p1

    new-instance p3, Liu0;

    invoke-direct {p3, p1}, Liu0;-><init>(LZC0;)V

    invoke-interface {p2, p3}, LEt0;->z(Ljava/lang/Object;)V

    move-object p1, p3

    :cond_1
    invoke-interface {p2}, LEt0;->Q()V

    check-cast p1, Liu0;

    invoke-virtual {p1}, Liu0;->a()LZC0;

    move-result-object p1

    invoke-interface {p2}, LEt0;->Q()V

    const/4 p3, 0x4

    new-array v0, p3, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iget-object v2, p0, LZp5$j;->g:LEy3;

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const/4 v2, 0x2

    iget-object v3, p0, LZp5$j;->h:Laq5;

    aput-object v3, v0, v2

    iget-boolean v2, p0, LZp5$j;->i:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v0, v3

    iget-object v2, p0, LZp5$j;->g:LEy3;

    iget-object v3, p0, LZp5$j;->h:Laq5;

    iget-boolean v4, p0, LZp5$j;->i:Z

    const v5, -0x21de6e89

    invoke-interface {p2, v5}, LEt0;->F(I)V

    move v5, v1

    :goto_0
    if-ge v1, p3, :cond_2

    aget-object v6, v0, v1

    invoke-interface {p2, v6}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object p3

    if-nez v5, :cond_3

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p3, v0, :cond_4

    :cond_3
    new-instance p3, LkA0;

    invoke-direct {p3, p1, v2, v3, v4}, LkA0;-><init>(LZC0;LEy3;Laq5;Z)V

    invoke-interface {p2, p3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p2}, LEt0;->Q()V

    check-cast p3, LkA0;

    sget-object p1, LgV2;->b0:LgV2$a;

    invoke-static {p1}, Law1;->a(LgV2;)LgV2;

    move-result-object v0

    invoke-virtual {p3}, LkA0;->J()LgV2;

    move-result-object p3

    invoke-interface {v0, p3}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v1

    iget-object v2, p0, LZp5$j;->j:LrX2;

    iget-object v3, p0, LZp5$j;->g:LEy3;

    iget-boolean v4, p0, LZp5$j;->i:Z

    iget-object v5, p0, LZp5$j;->h:Laq5;

    iget-object v6, p0, LZp5$j;->k:Lcu1;

    iget-object v7, p0, LZp5$j;->l:LDA3;

    iget-boolean v8, p0, LZp5$j;->m:Z

    const/4 v10, 0x0

    move-object v9, p2

    invoke-static/range {v1 .. v10}, LZp5;->c(LgV2;LrX2;LEy3;ZLaq5;Lcu1;LDA3;ZLEt0;I)LgV2;

    move-result-object p3

    iget-boolean v0, p0, LZp5$j;->m:Z

    if-eqz v0, :cond_5

    sget-object p1, LqV2;->b:LqV2;

    :cond_5
    invoke-interface {p3, p1}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
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

    invoke-virtual {p0, p1, p2, p3}, LZp5$j;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
