.class public final Ldd;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001ab\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0002\u0008\rH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0011"
    }
    d2 = {
        "",
        "expanded",
        "Lkotlin/Function0;",
        "",
        "onDismissRequest",
        "LgV2;",
        "modifier",
        "Ln61;",
        "offset",
        "LAY3;",
        "properties",
        "Lkotlin/Function1;",
        "LPm0;",
        "Lkotlin/ExtensionFunctionType;",
        "content",
        "a",
        "(ZLkotlin/jvm/functions/Function0;LgV2;JLAY3;Lkotlin/jvm/functions/Function3;LEt0;II)V",
        "material_release"
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
        "SMAP\nAndroidMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,145:1\n154#2:146\n25#3:147\n25#3:154\n36#3:162\n25#3:169\n1114#4,6:148\n1114#4,6:155\n1114#4,6:163\n1114#4,6:170\n76#5:161\n*S KotlinDebug\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n*L\n78#1:146\n82#1:147\n86#1:154\n91#1:162\n133#1:169\n82#1:148,6\n86#1:155,6\n91#1:163,6\n133#1:170,6\n87#1:161\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(ZLkotlin/jvm/functions/Function0;LgV2;JLAY3;Lkotlin/jvm/functions/Function3;LEt0;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "J",
            "LAY3;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
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

    move-object/from16 v7, p1

    move-object/from16 v8, p6

    move/from16 v9, p8

    const-string v0, "onDismissRequest"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3215b403

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v10

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v9, 0x6

    move/from16 v11, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v9, 0xe

    move/from16 v11, p0

    if-nez v1, :cond_2

    invoke-interface {v10, v11}, LEt0;->o(Z)Z

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
    and-int/lit8 v3, p9, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v9, 0x70

    if-nez v3, :cond_5

    invoke-interface {v10, v7}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p9, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v9, 0x380

    if-nez v4, :cond_8

    move-object/from16 v4, p2

    invoke-interface {v10, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_4

    :cond_7
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v1, v5

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v4, p2

    :goto_6
    and-int/lit8 v5, p9, 0x8

    if-eqz v5, :cond_9

    or-int/lit16 v1, v1, 0xc00

    move-wide/from16 v12, p3

    goto :goto_8

    :cond_9
    and-int/lit16 v6, v9, 0x1c00

    move-wide/from16 v12, p3

    if-nez v6, :cond_b

    invoke-interface {v10, v12, v13}, LEt0;->s(J)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x800

    goto :goto_7

    :cond_a
    const/16 v6, 0x400

    :goto_7
    or-int/2addr v1, v6

    :cond_b
    :goto_8
    and-int/lit8 v6, p9, 0x10

    if-eqz v6, :cond_c

    or-int/lit16 v1, v1, 0x6000

    goto :goto_a

    :cond_c
    const v14, 0xe000

    and-int/2addr v14, v9

    if-nez v14, :cond_e

    move-object/from16 v14, p5

    invoke-interface {v10, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_d

    const/16 v15, 0x4000

    goto :goto_9

    :cond_d
    const/16 v15, 0x2000

    :goto_9
    or-int/2addr v1, v15

    goto :goto_b

    :cond_e
    :goto_a
    move-object/from16 v14, p5

    :goto_b
    and-int/lit8 v15, p9, 0x20

    if-eqz v15, :cond_f

    const/high16 v15, 0x30000

    :goto_c
    or-int/2addr v1, v15

    goto :goto_d

    :cond_f
    const/high16 v15, 0x70000

    and-int/2addr v15, v9

    if-nez v15, :cond_11

    invoke-interface {v10, v8}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x20000

    goto :goto_c

    :cond_10
    const/high16 v15, 0x10000

    goto :goto_c

    :cond_11
    :goto_d
    move v15, v1

    const v1, 0x5b6db

    and-int/2addr v1, v15

    const v2, 0x12492

    if-ne v1, v2, :cond_13

    invoke-interface {v10}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_12

    goto :goto_e

    :cond_12
    invoke-interface {v10}, LEt0;->k()V

    move-object v3, v4

    move-wide v4, v12

    move-object v6, v14

    goto/16 :goto_10

    :cond_13
    :goto_e
    if-eqz v3, :cond_14

    sget-object v1, LgV2;->b0:LgV2$a;

    move-object/from16 v16, v1

    goto :goto_f

    :cond_14
    move-object/from16 v16, v4

    :goto_f
    if-eqz v5, :cond_15

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    invoke-static {v2, v1}, Lm61;->a(FF)J

    move-result-wide v1

    move-wide v12, v1

    :cond_15
    if-eqz v6, :cond_16

    new-instance v1, LAY3;

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x3e

    const/16 v25, 0x0

    move-object/from16 v17, v1

    invoke-direct/range {v17 .. v25}, LAY3;-><init>(ZZZLOq5;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v1

    :cond_16
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_17

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:73)"

    invoke-static {v0, v15, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_17
    const v0, -0x1d58f75c

    invoke-interface {v10, v0}, LEt0;->F(I)V

    invoke-interface {v10}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_18

    new-instance v1, LKX2;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v3}, LKX2;-><init>(Ljava/lang/Object;)V

    invoke-interface {v10, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_18
    invoke-interface {v10}, LEt0;->Q()V

    check-cast v1, LKX2;

    invoke-static/range {p0 .. p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, LKX2;->e(Ljava/lang/Object;)V

    invoke-virtual {v1}, LKX2;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_19

    invoke-virtual {v1}, LKX2;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1d

    :cond_19
    invoke-interface {v10, v0}, LEt0;->F(I)V

    invoke-interface {v10}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_1a

    sget-object v0, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v3, v4, v3}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    invoke-interface {v10, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1a
    invoke-interface {v10}, LEt0;->Q()V

    move-object v3, v0

    check-cast v3, LEX2;

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v0

    invoke-interface {v10, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lg01;

    const v0, 0x44faf204

    invoke-interface {v10, v0}, LEt0;->F(I)V

    invoke-interface {v10, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v10}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_1b

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_1c

    :cond_1b
    new-instance v4, Ldd$c;

    invoke-direct {v4, v3}, Ldd$c;-><init>(LEX2;)V

    invoke-interface {v10, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1c
    invoke-interface {v10}, LEt0;->Q()V

    move-object/from16 v21, v4

    check-cast v21, Lkotlin/jvm/functions/Function2;

    const/16 v22, 0x0

    new-instance v6, Lf81;

    move-object/from16 v17, v6

    move-wide/from16 v18, v12

    invoke-direct/range {v17 .. v22}, Lf81;-><init>(JLg01;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Ldd$a;

    move-object v0, v5

    move-object v2, v3

    move-object/from16 v3, v16

    move-object/from16 v4, p6

    move-object v7, v5

    move v5, v15

    invoke-direct/range {v0 .. v5}, Ldd$a;-><init>(LKX2;LEX2;LgV2;Lkotlin/jvm/functions/Function3;I)V

    const v0, 0x4bf17f6

    const/4 v1, 0x1

    invoke-static {v10, v0, v1, v7}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v3

    and-int/lit8 v0, v15, 0x70

    or-int/lit16 v0, v0, 0xc00

    shr-int/lit8 v1, v15, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int v5, v0, v1

    const/4 v7, 0x0

    move-object v0, v6

    move-object/from16 v1, p1

    move-object v2, v14

    move-object v4, v10

    move v6, v7

    invoke-static/range {v0 .. v6}, Lxd;->a(LzY3;Lkotlin/jvm/functions/Function0;LAY3;Lkotlin/jvm/functions/Function2;LEt0;II)V

    :cond_1d
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-static {}, LQt0;->Y()V

    :cond_1e
    move-wide v4, v12

    move-object v6, v14

    move-object/from16 v3, v16

    :goto_10
    invoke-interface {v10}, LEt0;->w()LWm5;

    move-result-object v10

    if-nez v10, :cond_1f

    goto :goto_11

    :cond_1f
    new-instance v12, Ldd$b;

    move-object v0, v12

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Ldd$b;-><init>(ZLkotlin/jvm/functions/Function0;LgV2;JLAY3;Lkotlin/jvm/functions/Function3;II)V

    invoke-interface {v10, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_11
    return-void
.end method
