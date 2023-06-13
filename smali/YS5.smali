.class public final LYS5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a;\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u00a2\u0006\u0002\u0008\u0006H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001aC\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u00a2\u0006\u0002\u0008\u0006H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000f"
    }
    d2 = {
        "LgV2;",
        "modifier",
        "Lkotlin/Function2;",
        "LaT5;",
        "Lkz0;",
        "LyO2;",
        "Lkotlin/ExtensionFunctionType;",
        "measurePolicy",
        "",
        "a",
        "(LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V",
        "LZS5;",
        "state",
        "b",
        "(LZS5;LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,774:1\n25#2:775\n251#2,10:785\n36#2:795\n1114#3,6:776\n1114#3,6:796\n76#4:782\n76#4:783\n76#4:784\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n*L\n76#1:775\n114#1:785,10\n132#1:795\n76#1:776,6\n132#1:796,6\n111#1:782\n112#1:783\n113#1:784\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LaT5;",
            "-",
            "Lkz0;",
            "+",
            "LyO2;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    const-string v0, "measurePolicy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x4d634bd0    # -1.824273E-8f

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0xe

    if-nez v2, :cond_2

    invoke-interface {p2, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x70

    if-nez v3, :cond_5

    invoke-interface {p2, p1}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v2, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_7

    invoke-interface {p2}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p2}, LEt0;->k()V

    goto :goto_5

    :cond_7
    :goto_4
    if-eqz v1, :cond_8

    sget-object p0, LgV2;->b0:LgV2$a;

    :cond_8
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, -0x1

    const-string v3, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:70)"

    invoke-static {v0, v2, v1, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_9
    const v0, -0x1d58f75c

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_a

    new-instance v0, LZS5;

    invoke-direct {v0}, LZS5;-><init>()V

    invoke-interface {p2, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_a
    invoke-interface {p2}, LEt0;->Q()V

    move-object v1, v0

    check-cast v1, LZS5;

    shl-int/lit8 v0, v2, 0x3

    and-int/lit8 v2, v0, 0x70

    or-int/lit8 v2, v2, 0x8

    and-int/lit16 v0, v0, 0x380

    or-int v5, v2, v0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v6}, LYS5;->b(LZS5;LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    :goto_5
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_c

    goto :goto_6

    :cond_c
    new-instance v0, LYS5$b;

    invoke-direct {v0, p0, p1, p3, p4}, LYS5$b;-><init>(LgV2;Lkotlin/jvm/functions/Function2;II)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void
.end method

.method public static final b(LZS5;LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZS5;",
            "LgV2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LaT5;",
            "-",
            "Lkz0;",
            "+",
            "LyO2;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurePolicy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1e845847

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_0

    sget-object p1, LgV2;->b0:LgV2$a;

    :cond_0
    move-object v3, p1

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    const-string v1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:103)"

    invoke-static {v0, p4, p1, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    const/4 p1, 0x0

    invoke-static {p3, p1}, Lyt0;->d(LEt0;I)LYt0;

    move-result-object v0

    invoke-static {p3, v3}, LDt0;->c(LEt0;LgV2;)LgV2;

    move-result-object v1

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {p3, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {p3, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {p3, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LJm2;->U:LJm2$d;

    invoke-virtual {v6}, LJm2$d;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    const v7, 0x7076b8d0

    invoke-interface {p3, v7}, LEt0;->F(I)V

    invoke-interface {p3}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_2

    invoke-static {}, Lyt0;->c()V

    :cond_2
    invoke-interface {p3}, LEt0;->x()V

    invoke-interface {p3}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_3

    new-instance v7, LYS5$a;

    invoke-direct {v7, v6}, LYS5$a;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-interface {p3, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_3
    invoke-interface {p3}, LEt0;->e()V

    :goto_0
    invoke-static {p3}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual {p0}, LZS5;->h()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, p0, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {p0}, LZS5;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v0, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {p0}, LZS5;->g()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v6, p2, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    sget-object v0, LBt0;->M:LBt0$a;

    invoke-virtual {v0}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v2, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v6, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0}, LBt0$a;->e()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v6, v1, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p3}, LEt0;->f()V

    invoke-interface {p3}, LEt0;->Q()V

    const v0, -0x243b094a

    invoke-interface {p3, v0}, LEt0;->F(I)V

    invoke-interface {p3}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, LYS5$c;

    invoke-direct {v0, p0}, LYS5$c;-><init>(LZS5;)V

    invoke-static {v0, p3, p1}, LY91;->h(Lkotlin/jvm/functions/Function0;LEt0;I)V

    :cond_4
    invoke-interface {p3}, LEt0;->Q()V

    const/16 p1, 0x8

    invoke-static {p0, p3, p1}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object p1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const v1, 0x44faf204

    invoke-interface {p3, v1}, LEt0;->F(I)V

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_5

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_6

    :cond_5
    new-instance v2, LYS5$d;

    invoke-direct {v2, p1}, LYS5$d;-><init>(LsP5;)V

    invoke-interface {p3, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {p3}, LEt0;->Q()V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x6

    invoke-static {v0, v2, p3, p1}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_1

    :cond_8
    new-instance p3, LYS5$e;

    move-object v1, p3

    move-object v2, p0

    move-object v4, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, LYS5$e;-><init>(LZS5;LgV2;Lkotlin/jvm/functions/Function2;II)V

    invoke-interface {p1, p3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method
