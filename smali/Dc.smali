.class public final LDc;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0006\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\'\u0010\n\u001a\u00020\u00012\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lkotlin/Function0;",
        "",
        "onDismissRequest",
        "LD31;",
        "properties",
        "content",
        "a",
        "(Lkotlin/jvm/functions/Function0;LD31;Lkotlin/jvm/functions/Function2;LEt0;II)V",
        "LgV2;",
        "modifier",
        "c",
        "(LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V",
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
        "SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,456:1\n76#2:457\n76#2:458\n76#2:459\n76#2:469\n50#3:460\n49#3:461\n456#3,14:481\n1114#4,6:462\n74#5:468\n75#5,11:470\n88#5:495\n76#6:496\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n*L\n156#1:457\n157#1:458\n158#1:459\n444#1:469\n162#1:460\n162#1:461\n444#1:481,14\n162#1:462,6\n444#1:468\n444#1:470,11\n444#1:495\n160#1:496\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lkotlin/jvm/functions/Function0;LD31;Lkotlin/jvm/functions/Function2;LEt0;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LD31;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v8, p2

    move/from16 v9, p4

    const-string v0, "onDismissRequest"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x792b3ec6

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v6

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v9, 0xe

    if-nez v1, :cond_2

    invoke-interface {v6, v7}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_2
    move v1, v9

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v9, 0x70

    if-nez v3, :cond_5

    move-object/from16 v3, p1

    invoke-interface {v6, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v3, p1

    :goto_4
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v4, v9, 0x380

    if-nez v4, :cond_8

    invoke-interface {v6, v8}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_5

    :cond_7
    const/16 v4, 0x80

    :goto_5
    or-int/2addr v1, v4

    :cond_8
    :goto_6
    and-int/lit16 v4, v1, 0x2db

    const/16 v5, 0x92

    if-ne v4, v5, :cond_a

    invoke-interface {v6}, LEt0;->b()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {v6}, LEt0;->k()V

    move-object v2, v3

    move-object v15, v6

    goto/16 :goto_b

    :cond_a
    :goto_7
    if-eqz v2, :cond_b

    new-instance v2, LD31;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x7

    const/4 v15, 0x0

    move-object v10, v2

    invoke-direct/range {v10 .. v15}, LD31;-><init>(ZZLOq5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v2

    goto :goto_8

    :cond_b
    move-object v5, v3

    :goto_8
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v2, -0x1

    const-string v3, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:150)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_c
    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object v0

    invoke-interface {v6, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/View;

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v0

    invoke-interface {v6, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v0

    invoke-interface {v6, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lpm2;

    const/4 v0, 0x0

    invoke-static {v6, v0}, Lyt0;->d(LEt0;I)LYt0;

    move-result-object v15

    shr-int/lit8 v1, v1, 0x6

    and-int/lit8 v1, v1, 0xe

    invoke-static {v8, v6, v1}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object v1

    new-array v10, v0, [Ljava/lang/Object;

    const/4 v11, 0x0

    const/4 v12, 0x0

    sget-object v13, LDc$e;->g:LDc$e;

    const/16 v16, 0xc08

    const/16 v17, 0x6

    move-object v14, v6

    move-object/from16 v18, v15

    move/from16 v15, v16

    move/from16 v16, v17

    invoke-static/range {v10 .. v16}, LQv4;->b([Ljava/lang/Object;LRi5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;II)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/UUID;

    const v11, 0x1e7b2b64

    invoke-interface {v6, v11}, LEt0;->F(I)V

    invoke-interface {v6, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v11

    invoke-interface {v6, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-interface {v6}, LEt0;->G()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_e

    sget-object v11, LEt0;->a:LEt0$a;

    invoke-virtual {v11}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v12, v11, :cond_d

    goto :goto_9

    :cond_d
    move-object v14, v2

    move-object v11, v5

    move-object v15, v6

    goto :goto_a

    :cond_e
    :goto_9
    new-instance v12, LJ31;

    const-string v11, "dialogId"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move v11, v0

    move-object v0, v12

    move-object v13, v1

    move-object/from16 v1, p0

    move-object v14, v2

    move-object v2, v5

    move-object v15, v4

    move-object v4, v14

    move-object v11, v5

    move-object v5, v15

    move-object v15, v6

    move-object v6, v10

    invoke-direct/range {v0 .. v6}, LJ31;-><init>(Lkotlin/jvm/functions/Function0;LD31;Landroid/view/View;Lpm2;Lg01;Ljava/util/UUID;)V

    new-instance v0, LDc$d;

    invoke-direct {v0, v13}, LDc$d;-><init>(LsP5;)V

    const v1, 0x1d1a4619

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v12, v1, v0}, LJ31;->f(LYt0;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15, v12}, LEt0;->z(Ljava/lang/Object;)V

    :goto_a
    invoke-interface {v15}, LEt0;->Q()V

    check-cast v12, LJ31;

    new-instance v0, LDc$a;

    invoke-direct {v0, v12}, LDc$a;-><init>(LJ31;)V

    const/16 v1, 0x8

    invoke-static {v12, v0, v15, v1}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    new-instance v0, LDc$b;

    invoke-direct {v0, v12, v7, v11, v14}, LDc$b;-><init>(LJ31;Lkotlin/jvm/functions/Function0;LD31;Lpm2;)V

    const/4 v1, 0x0

    invoke-static {v0, v15, v1}, LY91;->h(Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LQt0;->Y()V

    :cond_f
    move-object v2, v11

    :goto_b
    invoke-interface {v15}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_10

    goto :goto_c

    :cond_10
    new-instance v10, LDc$c;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LDc$c;-><init>(Lkotlin/jvm/functions/Function0;LD31;Lkotlin/jvm/functions/Function2;II)V

    invoke-interface {v6, v10}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_c
    return-void
.end method

.method public static final b(LsP5;)Lkotlin/jvm/functions/Function2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;>;)",
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function2;

    return-object p0
.end method

.method public static final c(LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    const v0, -0x4634f888

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

    goto/16 :goto_6

    :cond_7
    :goto_4
    if-eqz v1, :cond_8

    sget-object p0, LgV2;->b0:LgV2$a;

    :cond_8
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, -0x1

    const-string v3, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:439)"

    invoke-static {v0, v2, v1, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_9
    sget-object v0, LDc$f;->a:LDc$f;

    shr-int/lit8 v1, v2, 0x3

    and-int/lit8 v1, v1, 0xe

    shl-int/lit8 v2, v2, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    const v2, -0x4ee9b9da

    invoke-interface {p2, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {p2, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v3

    invoke-interface {p2, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v4

    invoke-interface {p2, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJq6;

    sget-object v5, LBt0;->M:LBt0$a;

    invoke-virtual {v5}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {p0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v7

    shl-int/lit8 v1, v1, 0x9

    and-int/lit16 v1, v1, 0x1c00

    or-int/lit8 v1, v1, 0x6

    invoke-interface {p2}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_a

    invoke-static {}, Lyt0;->c()V

    :cond_a
    invoke-interface {p2}, LEt0;->h()V

    invoke-interface {p2}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {p2, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    :cond_b
    invoke-interface {p2}, LEt0;->e()V

    :goto_5
    invoke-static {p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual {v5}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v6, v0, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v6, v2, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v6, v3, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v5}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v6, v4, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-static {p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    shr-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0x70

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v7, v0, p2, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {p2, v0}, LEt0;->F(I)V

    shr-int/lit8 v0, v1, 0x9

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->f()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LQt0;->Y()V

    :cond_c
    :goto_6
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_d

    goto :goto_7

    :cond_d
    new-instance v0, LDc$g;

    invoke-direct {v0, p0, p1, p3, p4}, LDc$g;-><init>(LgV2;Lkotlin/jvm/functions/Function2;II)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method public static final synthetic d(LsP5;)Lkotlin/jvm/functions/Function2;
    .locals 0

    invoke-static {p0}, LDc;->b(LsP5;)Lkotlin/jvm/functions/Function2;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LDc;->c(LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    return-void
.end method
