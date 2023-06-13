.class public final LUM2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a;\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "LMm0;",
        "colors",
        "LGc6;",
        "typography",
        "LDy5;",
        "shapes",
        "Lkotlin/Function0;",
        "",
        "content",
        "a",
        "(LMm0;LGc6;LDy5;Lkotlin/jvm/functions/Function2;LEt0;II)V",
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
        "SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n25#2:140\n1114#3,6:141\n1#4:147\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialThemeKt\n*L\n65#1:140\n65#1:141,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LMm0;LGc6;LDy5;Lkotlin/jvm/functions/Function2;LEt0;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMm0;",
            "LGc6;",
            "LDy5;",
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

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "content"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x3521f1f7    # -7276292.5f

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v2, v5, 0xe

    const/4 v13, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, p6, 0x1

    if-nez v2, :cond_0

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v2, p0

    :cond_1
    move v6, v13

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x70

    if-nez v7, :cond_5

    and-int/lit8 v7, p6, 0x2

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-interface {v1, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v7, p1

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v6, v8

    goto :goto_3

    :cond_5
    move-object/from16 v7, p1

    :goto_3
    and-int/lit16 v8, v5, 0x380

    if-nez v8, :cond_8

    and-int/lit8 v8, p6, 0x4

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-interface {v1, v8}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v8, p2

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v6, v9

    goto :goto_5

    :cond_8
    move-object/from16 v8, p2

    :goto_5
    and-int/lit8 v9, p6, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v6, v6, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v5, 0x1c00

    if-nez v9, :cond_b

    invoke-interface {v1, v4}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v6, v9

    :cond_b
    :goto_7
    and-int/lit16 v9, v6, 0x16db

    const/16 v10, 0x492

    if-ne v9, v10, :cond_d

    invoke-interface {v1}, LEt0;->b()Z

    move-result v9

    if-nez v9, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v1}, LEt0;->k()V

    move-object v15, v7

    move-object v3, v8

    goto/16 :goto_b

    :cond_d
    :goto_8
    invoke-interface {v1}, LEt0;->J()V

    and-int/lit8 v9, v5, 0x1

    const/4 v14, 0x6

    if-eqz v9, :cond_11

    invoke-interface {v1}, LEt0;->l()Z

    move-result v9

    if-eqz v9, :cond_e

    goto :goto_9

    :cond_e
    invoke-interface {v1}, LEt0;->k()V

    and-int/lit8 v9, p6, 0x1

    if-eqz v9, :cond_f

    and-int/lit8 v6, v6, -0xf

    :cond_f
    and-int/lit8 v9, p6, 0x2

    if-eqz v9, :cond_10

    and-int/lit8 v6, v6, -0x71

    :cond_10
    and-int/lit8 v9, p6, 0x4

    if-eqz v9, :cond_14

    goto :goto_a

    :cond_11
    :goto_9
    and-int/lit8 v9, p6, 0x1

    if-eqz v9, :cond_12

    sget-object v2, LTM2;->a:LTM2;

    invoke-virtual {v2, v1, v14}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    and-int/lit8 v6, v6, -0xf

    :cond_12
    and-int/lit8 v9, p6, 0x2

    if-eqz v9, :cond_13

    sget-object v7, LTM2;->a:LTM2;

    invoke-virtual {v7, v1, v14}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v7

    and-int/lit8 v6, v6, -0x71

    :cond_13
    and-int/lit8 v9, p6, 0x4

    if-eqz v9, :cond_14

    sget-object v8, LTM2;->a:LTM2;

    invoke-virtual {v8, v1, v14}, LTM2;->b(LEt0;I)LDy5;

    move-result-object v8

    :goto_a
    and-int/lit16 v6, v6, -0x381

    :cond_14
    move v10, v6

    move-object v12, v7

    move-object v11, v8

    invoke-interface {v1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v6

    if-eqz v6, :cond_15

    const/4 v6, -0x1

    const-string v7, "androidx.compose.material.MaterialTheme (MaterialTheme.kt:58)"

    invoke-static {v0, v10, v6, v7}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_15
    const v0, -0x1d58f75c

    invoke-interface {v1, v0}, LEt0;->F(I)V

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v6, LEt0;->a:LEt0$a;

    invoke-virtual {v6}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v0, v6, :cond_16

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v30, 0x0

    const-wide/16 v32, 0x0

    const-wide/16 v34, 0x0

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x1fff

    const/16 v42, 0x0

    move-object v15, v2

    invoke-static/range {v15 .. v42}, LMm0;->b(LMm0;JJJJJJJJJJJJZILjava/lang/Object;)LMm0;

    move-result-object v0

    invoke-interface {v1, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_16
    invoke-interface {v1}, LEt0;->Q()V

    check-cast v0, LMm0;

    invoke-static {v0, v2}, LNm0;->i(LMm0;LMm0;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x7

    move/from16 v43, v10

    move-object v10, v1

    move-object v3, v11

    move v11, v15

    move-object v15, v12

    move/from16 v12, v16

    invoke-static/range {v6 .. v12}, Lwb5;->e(ZFJLEt0;II)Ly12;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v0, v1, v7}, LSM2;->e(LMm0;LEt0;I)LB26;

    move-result-object v8

    const/4 v9, 0x7

    new-array v9, v9, [LW94;

    invoke-static {}, LNm0;->e()LU94;

    move-result-object v10

    invoke-virtual {v10, v0}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    aput-object v0, v9, v7

    invoke-static {}, LXz0;->a()LU94;

    move-result-object v0

    sget-object v7, LWz0;->a:LWz0;

    invoke-virtual {v7, v1, v14}, LWz0;->c(LEt0;I)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v0, v7}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    const/4 v7, 0x1

    aput-object v0, v9, v7

    invoke-static {}, LA12;->a()LU94;

    move-result-object v0

    invoke-virtual {v0, v6}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    aput-object v0, v9, v13

    invoke-static {}, Lyb5;->d()LU94;

    move-result-object v0

    sget-object v6, LOM2;->b:LOM2;

    invoke-virtual {v0, v6}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    const/4 v6, 0x3

    aput-object v0, v9, v6

    invoke-static {}, LEy5;->a()LU94;

    move-result-object v0

    invoke-virtual {v0, v3}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    const/4 v6, 0x4

    aput-object v0, v9, v6

    invoke-static {}, LC26;->b()LU94;

    move-result-object v0

    invoke-virtual {v0, v8}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    const/4 v6, 0x5

    aput-object v0, v9, v6

    invoke-static {}, LHc6;->b()LU94;

    move-result-object v0

    invoke-virtual {v0, v15}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v0

    aput-object v0, v9, v14

    new-instance v0, LUM2$a;

    move/from16 v6, v43

    invoke-direct {v0, v15, v4, v6}, LUM2$a;-><init>(LGc6;Lkotlin/jvm/functions/Function2;I)V

    const v6, -0x67b7dd37

    invoke-static {v1, v6, v7, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v6, 0x38

    invoke-static {v9, v0, v1, v6}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {}, LQt0;->Y()V

    :cond_17
    :goto_b
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v7

    if-nez v7, :cond_18

    goto :goto_c

    :cond_18
    new-instance v8, LUM2$b;

    move-object v0, v8

    move-object v1, v2

    move-object v2, v15

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LUM2$b;-><init>(LMm0;LGc6;LDy5;Lkotlin/jvm/functions/Function2;II)V

    invoke-interface {v7, v8}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_c
    return-void
.end method
