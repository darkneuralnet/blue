.class public final LUp5$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUp5;->b(LgV2;LXp5;ZLcu1;ZZ)LgV2;
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
        "SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt$scroll$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,410:1\n474#2,4:411\n478#2,2:419\n482#2:425\n25#3:415\n1114#4,3:416\n1117#4,3:422\n474#5:421\n76#6:426\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollKt$scroll$2\n*L\n267#1:411,4\n267#1:419,2\n267#1:425\n267#1:415\n267#1:416,3\n267#1:422,3\n267#1:421\n299#1:426\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Z

.field public final synthetic i:LXp5;

.field public final synthetic j:Z

.field public final synthetic k:Lcu1;


# direct methods
.method public constructor <init>(ZZLXp5;ZLcu1;)V
    .locals 0

    iput-boolean p1, p0, LUp5$c;->g:Z

    iput-boolean p2, p0, LUp5$c;->h:Z

    iput-object p3, p0, LUp5$c;->i:LXp5;

    iput-boolean p4, p0, LUp5$c;->j:Z

    iput-object p5, p0, LUp5$c;->k:Lcu1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LgV2;LEt0;I)LgV2;
    .locals 10

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x581dd9c4

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:264)"

    invoke-static {p1, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, LYp5;->a:LYp5;

    const/4 p3, 0x6

    invoke-virtual {p1, p2, p3}, LYp5;->b(LEt0;I)LDA3;

    move-result-object p3

    const v0, 0x2e20b340

    invoke-interface {p2, v0}, LEt0;->F(I)V

    const v0, -0x1d58f75c

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {v0, p2}, LY91;->j(Lkotlin/coroutines/CoroutineContext;LEt0;)LZC0;

    move-result-object v0

    new-instance v1, Liu0;

    invoke-direct {v1, v0}, Liu0;-><init>(LZC0;)V

    invoke-interface {p2, v1}, LEt0;->z(Ljava/lang/Object;)V

    move-object v0, v1

    :cond_1
    invoke-interface {p2}, LEt0;->Q()V

    check-cast v0, Liu0;

    invoke-virtual {v0}, Liu0;->a()LZC0;

    move-result-object v6

    invoke-interface {p2}, LEt0;->Q()V

    sget-object v0, LgV2;->b0:LgV2$a;

    new-instance v7, LUp5$c$a;

    iget-boolean v2, p0, LUp5$c;->h:Z

    iget-boolean v3, p0, LUp5$c;->g:Z

    iget-boolean v4, p0, LUp5$c;->j:Z

    iget-object v5, p0, LUp5$c;->i:LXp5;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LUp5$c$a;-><init>(ZZZLXp5;LZC0;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v7, v1, v2}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v8

    iget-boolean v1, p0, LUp5$c;->g:Z

    if-eqz v1, :cond_2

    sget-object v1, LEy3;->b:LEy3;

    goto :goto_0

    :cond_2
    sget-object v1, LEy3;->c:LEy3;

    :goto_0
    move-object v9, v1

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v1

    invoke-interface {p2, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpm2;

    iget-boolean v2, p0, LUp5$c;->h:Z

    invoke-virtual {p1, v1, v9, v2}, LYp5;->c(Lpm2;LEy3;Z)Z

    move-result v5

    iget-object p1, p0, LUp5$c;->i:LXp5;

    invoke-virtual {p1}, LXp5;->k()LrX2;

    move-result-object v7

    iget-object v1, p0, LUp5$c;->i:LXp5;

    iget-boolean v4, p0, LUp5$c;->j:Z

    iget-object v6, p0, LUp5$c;->k:Lcu1;

    move-object v2, v9

    move-object v3, p3

    invoke-static/range {v0 .. v7}, LZp5;->j(LgV2;Laq5;LEy3;LDA3;ZZLcu1;LrX2;)LgV2;

    move-result-object p1

    new-instance v0, Lcq5;

    iget-object v1, p0, LUp5$c;->i:LXp5;

    iget-boolean v2, p0, LUp5$c;->h:Z

    iget-boolean v3, p0, LUp5$c;->g:Z

    invoke-direct {v0, v1, v2, v3}, Lcq5;-><init>(LXp5;ZZ)V

    invoke-static {v8, v9}, LSk0;->a(LgV2;LEy3;)LgV2;

    move-result-object v1

    invoke-static {v1, p3}, LEA3;->a(LgV2;LDA3;)LgV2;

    move-result-object p3

    invoke-interface {p3, p1}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p1

    invoke-interface {p1, v0}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
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

    invoke-virtual {p0, p1, p2, p3}, LUp5$c;->a(LgV2;LEt0;I)LgV2;

    move-result-object p1

    return-object p1
.end method
