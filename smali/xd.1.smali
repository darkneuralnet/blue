.class public final Lxd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u001aA\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000c\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0000\u001a\u000c\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002\" \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00108\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "LzY3;",
        "popupPositionProvider",
        "Lkotlin/Function0;",
        "",
        "onDismissRequest",
        "LAY3;",
        "properties",
        "content",
        "a",
        "(LzY3;Lkotlin/jvm/functions/Function0;LAY3;Lkotlin/jvm/functions/Function2;LEt0;II)V",
        "Landroid/view/View;",
        "",
        "e",
        "Landroid/graphics/Rect;",
        "LD52;",
        "f",
        "LU94;",
        "",
        "LU94;",
        "getLocalPopupTestTag",
        "()LU94;",
        "LocalPopupTestTag",
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
        "SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,824:1\n50#2:825\n49#2:826\n25#2:837\n456#2,14:857\n456#2,14:885\n1114#3,6:827\n1114#3,6:838\n76#4:833\n76#4:834\n76#4:835\n76#4:836\n76#4:845\n76#4:873\n74#5:844\n75#5,11:846\n88#5:871\n74#5:872\n75#5,11:874\n88#5:899\n76#6:900\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n*L\n194#1:825\n194#1:826\n235#1:837\n309#1:857,14\n341#1:885,14\n194#1:827,6\n235#1:838,6\n228#1:833\n229#1:834\n230#1:835\n231#1:836\n309#1:845\n341#1:873\n309#1:844\n309#1:846,11\n309#1:871\n341#1:872\n341#1:874,11\n341#1:899\n233#1:900\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Lxd$a;->g:Lxd$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lgu0;->c(LEM5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LU94;

    move-result-object v0

    sput-object v0, Lxd;->a:LU94;

    return-void
.end method

.method public static final a(LzY3;Lkotlin/jvm/functions/Function0;LAY3;Lkotlin/jvm/functions/Function2;LEt0;II)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LzY3;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LAY3;",
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

    move-object/from16 v11, p0

    move-object/from16 v12, p3

    move/from16 v13, p5

    const-string v0, "popupPositionProvider"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x317c909c

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v14

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v13, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v13, 0xe

    if-nez v1, :cond_2

    invoke-interface {v14, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v13

    goto :goto_1

    :cond_2
    move v1, v13

    :goto_1
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v13, 0x70

    if-nez v3, :cond_5

    move-object/from16 v3, p1

    invoke-interface {v14, v3}, LEt0;->I(Ljava/lang/Object;)Z

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
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v5, v13, 0x380

    if-nez v5, :cond_8

    move-object/from16 v5, p2

    invoke-interface {v14, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_5

    :cond_7
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v1, v6

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v5, p2

    :goto_7
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v6, v13, 0x1c00

    if-nez v6, :cond_b

    invoke-interface {v14, v12}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x800

    goto :goto_8

    :cond_a
    const/16 v6, 0x400

    :goto_8
    or-int/2addr v1, v6

    :cond_b
    :goto_9
    move v15, v1

    and-int/lit16 v1, v15, 0x16db

    const/16 v6, 0x492

    if-ne v1, v6, :cond_d

    invoke-interface {v14}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_a

    :cond_c
    invoke-interface {v14}, LEt0;->k()V

    move-object v2, v3

    move-object v3, v5

    goto/16 :goto_f

    :cond_d
    :goto_a
    const/4 v10, 0x0

    if-eqz v2, :cond_e

    move-object/from16 v22, v10

    goto :goto_b

    :cond_e
    move-object/from16 v22, v3

    :goto_b
    if-eqz v4, :cond_f

    new-instance v1, LAY3;

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x3f

    const/16 v31, 0x0

    move-object/from16 v23, v1

    invoke-direct/range {v23 .. v31}, LAY3;-><init>(ZZZLOq5;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_c

    :cond_f
    move-object/from16 v23, v5

    :goto_c
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_10

    const/4 v1, -0x1

    const-string v2, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:221)"

    invoke-static {v0, v15, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_10
    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object v0

    invoke-interface {v14, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/view/View;

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v0

    invoke-interface {v14, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lg01;

    sget-object v0, Lxd;->a:LU94;

    invoke-interface {v14, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Ljava/lang/String;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v0

    invoke-interface {v14, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpm2;

    const/4 v7, 0x0

    invoke-static {v14, v7}, Lyt0;->d(LEt0;I)LYt0;

    move-result-object v6

    shr-int/lit8 v1, v15, 0x9

    and-int/lit8 v1, v1, 0xe

    invoke-static {v12, v14, v1}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object v5

    new-array v1, v7, [Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Lxd$i;->g:Lxd$i;

    const/16 v16, 0xc08

    const/16 v17, 0x6

    move-object/from16 v32, v5

    move-object v5, v14

    move-object/from16 v33, v6

    move/from16 v6, v16

    move/from16 v7, v17

    invoke-static/range {v1 .. v7}, LQv4;->b([Ljava/lang/Object;LRi5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;II)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/util/UUID;

    const v1, -0x1d58f75c

    invoke-interface {v14, v1}, LEt0;->F(I)V

    invoke-interface {v14}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_11

    new-instance v6, Landroidx/compose/ui/window/PopupLayout;

    const-string v1, "popupId"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v16, 0x0

    const/16 v17, 0x80

    const/16 v18, 0x0

    move-object v5, v0

    move-object v0, v6

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    move-object/from16 v3, v24

    move-object v4, v8

    move-object v8, v5

    move-object v5, v9

    move-object v9, v6

    move-object/from16 v6, p0

    move-object/from16 p1, v8

    move-object/from16 v8, v16

    move-object/from16 v34, v9

    move/from16 v9, v17

    move-object v12, v10

    move-object/from16 v10, v18

    invoke-direct/range {v0 .. v10}, Landroidx/compose/ui/window/PopupLayout;-><init>(Lkotlin/jvm/functions/Function0;LAY3;Ljava/lang/String;Landroid/view/View;Lg01;LzY3;Ljava/util/UUID;LtY3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lxd$j;

    move-object/from16 v1, v32

    move-object/from16 v2, v34

    invoke-direct {v0, v2, v1}, Lxd$j;-><init>(Landroidx/compose/ui/window/PopupLayout;LsP5;)V

    const v1, 0x4da88f2f    # 3.53494496E8f

    const/4 v3, 0x1

    invoke-static {v1, v3, v0}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v0

    move-object/from16 v1, v33

    invoke-virtual {v2, v1, v0}, Landroidx/compose/ui/window/PopupLayout;->setContent(LYt0;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v14, v2}, LEt0;->z(Ljava/lang/Object;)V

    move-object v1, v2

    goto :goto_d

    :cond_11
    move-object/from16 p1, v0

    move-object v12, v10

    :goto_d
    invoke-interface {v14}, LEt0;->Q()V

    check-cast v1, Landroidx/compose/ui/window/PopupLayout;

    new-instance v0, Lxd$b;

    move-object/from16 v16, v0

    move-object/from16 v17, v1

    move-object/from16 v18, v22

    move-object/from16 v19, v23

    move-object/from16 v20, v24

    move-object/from16 v21, p1

    invoke-direct/range {v16 .. v21}, Lxd$b;-><init>(Landroidx/compose/ui/window/PopupLayout;Lkotlin/jvm/functions/Function0;LAY3;Ljava/lang/String;Lpm2;)V

    const/16 v2, 0x8

    invoke-static {v1, v0, v14, v2}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    new-instance v0, Lxd$c;

    move-object/from16 v16, v0

    invoke-direct/range {v16 .. v21}, Lxd$c;-><init>(Landroidx/compose/ui/window/PopupLayout;Lkotlin/jvm/functions/Function0;LAY3;Ljava/lang/String;Lpm2;)V

    const/4 v2, 0x0

    invoke-static {v0, v14, v2}, LY91;->h(Lkotlin/jvm/functions/Function0;LEt0;I)V

    new-instance v0, Lxd$d;

    invoke-direct {v0, v1, v11}, Lxd$d;-><init>(Landroidx/compose/ui/window/PopupLayout;LzY3;)V

    and-int/lit8 v3, v15, 0xe

    invoke-static {v11, v0, v14, v3}, LY91;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;I)V

    new-instance v0, Lxd$e;

    invoke-direct {v0, v1, v12}, Lxd$e;-><init>(Landroidx/compose/ui/window/PopupLayout;Lkotlin/coroutines/Continuation;)V

    const/16 v3, 0x48

    invoke-static {v1, v0, v14, v3}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    sget-object v0, LgV2;->b0:LgV2$a;

    new-instance v3, Lxd$f;

    invoke-direct {v3, v1}, Lxd$f;-><init>(Landroidx/compose/ui/window/PopupLayout;)V

    invoke-static {v0, v3}, LTg3;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v0

    new-instance v3, Lxd$g;

    move-object/from16 v4, p1

    invoke-direct {v3, v1, v4}, Lxd$g;-><init>(Landroidx/compose/ui/window/PopupLayout;Lpm2;)V

    const v1, -0x4ee9b9da

    invoke-interface {v14, v1}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v1

    invoke-interface {v14, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {v14, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v14, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {v14}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_12

    invoke-static {}, Lyt0;->c()V

    :cond_12
    invoke-interface {v14}, LEt0;->h()V

    invoke-interface {v14}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-interface {v14, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_e

    :cond_13
    invoke-interface {v14}, LEt0;->e()V

    :goto_e
    invoke-static {v14}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual {v6}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v3, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v7, v1, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-static {v14}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v14, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v14, v0}, LEt0;->F(I)V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-interface {v14}, LEt0;->f()V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {}, LQt0;->Y()V

    :cond_14
    move-object/from16 v2, v22

    move-object/from16 v3, v23

    :goto_f
    invoke-interface {v14}, LEt0;->w()LWm5;

    move-result-object v7

    if-nez v7, :cond_15

    goto :goto_10

    :cond_15
    new-instance v8, Lxd$h;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lxd$h;-><init>(LzY3;Lkotlin/jvm/functions/Function0;LAY3;Lkotlin/jvm/functions/Function2;II)V

    invoke-interface {v7, v8}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_10
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

.method public static final synthetic c(LsP5;)Lkotlin/jvm/functions/Function2;
    .locals 0

    invoke-static {p0}, Lxd;->b(LsP5;)Lkotlin/jvm/functions/Function2;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Landroid/graphics/Rect;)LD52;
    .locals 0

    invoke-static {p0}, Lxd;->f(Landroid/graphics/Rect;)LD52;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroid/view/View;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    instance-of v0, p0, Landroid/view/WindowManager$LayoutParams;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/view/WindowManager$LayoutParams;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_1

    iget p0, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 p0, p0, 0x2000

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public static final f(Landroid/graphics/Rect;)LD52;
    .locals 4

    new-instance v0, LD52;

    iget v1, p0, Landroid/graphics/Rect;->left:I

    iget v2, p0, Landroid/graphics/Rect;->top:I

    iget v3, p0, Landroid/graphics/Rect;->right:I

    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    invoke-direct {v0, v1, v2, v3, p0}, LD52;-><init>(IIII)V

    return-object v0
.end method
