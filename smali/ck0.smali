.class public final Lck0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u001ay\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0014\u0008\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000c2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\u000cH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0013"
    }
    d2 = {
        "LDf;",
        "text",
        "LgV2;",
        "modifier",
        "LG26;",
        "style",
        "",
        "softWrap",
        "Ln26;",
        "overflow",
        "",
        "maxLines",
        "Lkotlin/Function1;",
        "Li26;",
        "",
        "onTextLayout",
        "onClick",
        "a",
        "(LDf;LgV2;LG26;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V",
        "foundation_release"
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
        "SMAP\nClickableText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n25#2:193\n50#2:200\n49#2:201\n50#2:208\n49#2:209\n25#2:216\n25#2:227\n50#2:238\n49#2:239\n1114#3,6:194\n1114#3,6:202\n1114#3,6:210\n1114#3,6:217\n1114#3,3:228\n1117#3,3:234\n1114#3,6:240\n474#4,4:223\n478#4,2:231\n482#4:237\n474#5:233\n1#6:246\n*S KotlinDebug\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n*L\n80#1:193\n81#1:200\n81#1:201\n96#1:208\n96#1:209\n154#1:216\n155#1:227\n184#1:238\n184#1:239\n80#1:194,6\n81#1:202,6\n96#1:210,6\n154#1:217,6\n155#1:228,3\n155#1:234,3\n184#1:240,6\n155#1:223,4\n155#1:231,2\n155#1:237\n155#1:233\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LDf;LgV2;LG26;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDf;",
            "LgV2;",
            "LG26;",
            "ZII",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Li26;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v12, p0

    move-object/from16 v13, p7

    move/from16 v14, p9

    move/from16 v15, p10

    const-string v0, "text"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0xeb2f629

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v11

    and-int/lit8 v1, v15, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v14, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v14, 0xe

    if-nez v1, :cond_2

    invoke-interface {v11, v12}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v14

    goto :goto_1

    :cond_2
    move v1, v14

    :goto_1
    and-int/lit8 v3, v15, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v14, 0x70

    if-nez v4, :cond_5

    move-object/from16 v4, p1

    invoke-interface {v11, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v4, p1

    :goto_4
    and-int/lit8 v5, v15, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v6, v14, 0x380

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v11, v6}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_5

    :cond_7
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v1, v7

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v6, p2

    :goto_7
    and-int/lit8 v7, v15, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v8, v14, 0x1c00

    if-nez v8, :cond_b

    move/from16 v8, p3

    invoke-interface {v11, v8}, LEt0;->o(Z)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_8

    :cond_a
    const/16 v9, 0x400

    :goto_8
    or-int/2addr v1, v9

    goto :goto_a

    :cond_b
    :goto_9
    move/from16 v8, p3

    :goto_a
    and-int/lit8 v9, v15, 0x10

    const v10, 0xe000

    if-eqz v9, :cond_c

    or-int/lit16 v1, v1, 0x6000

    move/from16 v10, p4

    goto :goto_c

    :cond_c
    and-int v16, v14, v10

    move/from16 v10, p4

    if-nez v16, :cond_e

    invoke-interface {v11, v10}, LEt0;->r(I)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_b

    :cond_d
    const/16 v16, 0x2000

    :goto_b
    or-int v1, v1, v16

    :cond_e
    :goto_c
    and-int/lit8 v16, v15, 0x20

    const/high16 v17, 0x70000

    if-eqz v16, :cond_f

    const/high16 v18, 0x30000

    or-int v1, v1, v18

    move/from16 v2, p5

    goto :goto_e

    :cond_f
    and-int v18, v14, v17

    move/from16 v2, p5

    if-nez v18, :cond_11

    invoke-interface {v11, v2}, LEt0;->r(I)Z

    move-result v19

    if-eqz v19, :cond_10

    const/high16 v19, 0x20000

    goto :goto_d

    :cond_10
    const/high16 v19, 0x10000

    :goto_d
    or-int v1, v1, v19

    :cond_11
    :goto_e
    and-int/lit8 v19, v15, 0x40

    const/high16 v20, 0x380000

    if-eqz v19, :cond_12

    const/high16 v21, 0x180000

    or-int v1, v1, v21

    move-object/from16 v0, p6

    goto :goto_10

    :cond_12
    and-int v21, v14, v20

    move-object/from16 v0, p6

    if-nez v21, :cond_14

    invoke-interface {v11, v0}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_13

    const/high16 v22, 0x100000

    goto :goto_f

    :cond_13
    const/high16 v22, 0x80000

    :goto_f
    or-int v1, v1, v22

    :cond_14
    :goto_10
    and-int/lit16 v0, v15, 0x80

    if-eqz v0, :cond_15

    const/high16 v0, 0xc00000

    :goto_11
    or-int/2addr v1, v0

    goto :goto_12

    :cond_15
    const/high16 v0, 0x1c00000

    and-int/2addr v0, v14

    if-nez v0, :cond_17

    invoke-interface {v11, v13}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    const/high16 v0, 0x800000

    goto :goto_11

    :cond_16
    const/high16 v0, 0x400000

    goto :goto_11

    :cond_17
    :goto_12
    const v0, 0x16db6db

    and-int/2addr v0, v1

    const v2, 0x492492

    if-ne v0, v2, :cond_19

    invoke-interface {v11}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_13

    :cond_18
    invoke-interface {v11}, LEt0;->k()V

    move-object/from16 v7, p6

    move-object v2, v4

    move-object v3, v6

    move v4, v8

    move v5, v10

    move-object/from16 v17, v11

    move/from16 v6, p5

    goto/16 :goto_19

    :cond_19
    :goto_13
    if-eqz v3, :cond_1a

    sget-object v0, LgV2;->b0:LgV2$a;

    move-object v4, v0

    :cond_1a
    if-eqz v5, :cond_1b

    sget-object v0, LG26;->d:LG26$a;

    invoke-virtual {v0}, LG26$a;->a()LG26;

    move-result-object v0

    move-object/from16 v22, v0

    goto :goto_14

    :cond_1b
    move-object/from16 v22, v6

    :goto_14
    if-eqz v7, :cond_1c

    const/4 v0, 0x1

    move/from16 v23, v0

    goto :goto_15

    :cond_1c
    move/from16 v23, v8

    :goto_15
    if-eqz v9, :cond_1d

    sget-object v0, Ln26;->a:Ln26$a;

    invoke-virtual {v0}, Ln26$a;->a()I

    move-result v0

    move/from16 v24, v0

    goto :goto_16

    :cond_1d
    move/from16 v24, v10

    :goto_16
    if-eqz v16, :cond_1e

    const v0, 0x7fffffff

    move/from16 v16, v0

    goto :goto_17

    :cond_1e
    move/from16 v16, p5

    :goto_17
    if-eqz v19, :cond_1f

    sget-object v0, Lck0$a;->g:Lck0$a;

    move-object v10, v0

    goto :goto_18

    :cond_1f
    move-object/from16 v10, p6

    :goto_18
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_20

    const/4 v0, -0x1

    const-string v2, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)"

    const v3, -0xeb2f629

    invoke-static {v3, v1, v0, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_20
    const v0, -0x1d58f75c

    invoke-interface {v11, v0}, LEt0;->F(I)V

    invoke-interface {v11}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    const/4 v5, 0x0

    if-ne v0, v3, :cond_21

    const/4 v3, 0x2

    invoke-static {v5, v5, v3, v5}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    invoke-interface {v11, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_21
    invoke-interface {v11}, LEt0;->Q()V

    check-cast v0, LEX2;

    sget-object v3, LgV2;->b0:LgV2$a;

    const v6, 0x1e7b2b64

    invoke-interface {v11, v6}, LEt0;->F(I)V

    invoke-interface {v11, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {v11, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-interface {v11}, LEt0;->G()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_22

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_23

    :cond_22
    new-instance v8, Lck0$d;

    invoke-direct {v8, v0, v13, v5}, Lck0$d;-><init>(LEX2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    invoke-interface {v11, v8}, LEt0;->z(Ljava/lang/Object;)V

    :cond_23
    invoke-interface {v11}, LEt0;->Q()V

    check-cast v8, Lkotlin/jvm/functions/Function2;

    invoke-static {v3, v13, v8}, LzW5;->c(LgV2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)LgV2;

    move-result-object v3

    invoke-interface {v4, v3}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v3

    invoke-interface {v11, v6}, LEt0;->F(I)V

    invoke-interface {v11, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v11, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {v11}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_24

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_25

    :cond_24
    new-instance v6, Lck0$b;

    invoke-direct {v6, v0, v10}, Lck0$b;-><init>(LEX2;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v11, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_25
    invoke-interface {v11}, LEt0;->Q()V

    move-object v5, v6

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    and-int/lit8 v0, v1, 0xe

    and-int/lit16 v2, v1, 0x380

    or-int/2addr v0, v2

    const v2, 0xe000

    and-int/2addr v2, v1

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x6

    and-int v2, v2, v17

    or-int/2addr v0, v2

    shl-int/lit8 v1, v1, 0x3

    and-int v1, v1, v20

    or-int v17, v0, v1

    const/16 v18, 0x180

    move-object/from16 v0, p0

    move-object v1, v3

    move-object/from16 v2, v22

    move-object v3, v5

    move-object/from16 v19, v4

    move/from16 v4, v24

    move/from16 v5, v23

    move/from16 v6, v16

    move-object v9, v11

    move-object/from16 v20, v10

    move/from16 v10, v17

    move-object/from16 v17, v11

    move/from16 v11, v18

    invoke-static/range {v0 .. v11}, LUE;->c(LDf;LgV2;LG26;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-static {}, LQt0;->Y()V

    :cond_26
    move/from16 v6, v16

    move-object/from16 v2, v19

    move-object/from16 v7, v20

    move-object/from16 v3, v22

    move/from16 v4, v23

    move/from16 v5, v24

    :goto_19
    invoke-interface/range {v17 .. v17}, LEt0;->w()LWm5;

    move-result-object v11

    if-nez v11, :cond_27

    goto :goto_1a

    :cond_27
    new-instance v10, Lck0$c;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v8, p7

    move/from16 v9, p9

    move-object v12, v10

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lck0$c;-><init>(LDf;LgV2;LG26;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    invoke-interface {v11, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1a
    return-void
.end method
