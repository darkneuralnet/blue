.class public final LxX1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001ae\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001aU\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0017"
    }
    d2 = {
        "LMW1;",
        "bitmap",
        "",
        "contentDescription",
        "LgV2;",
        "modifier",
        "LK9;",
        "alignment",
        "LBA0;",
        "contentScale",
        "",
        "alpha",
        "Lsm0;",
        "colorFilter",
        "LRl1;",
        "filterQuality",
        "",
        "b",
        "(LMW1;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;ILEt0;II)V",
        "LnE3;",
        "painter",
        "a",
        "(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V",
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
        "SMAP\nImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,269:1\n36#2:270\n36#2:277\n456#2,14:297\n1114#3,6:271\n1114#3,6:278\n74#4:284\n75#4,11:286\n88#4:311\n76#5:285\n*S KotlinDebug\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n*L\n154#1:270\n246#1:277\n256#1:297,14\n154#1:271,6\n246#1:278,6\n256#1:284\n256#1:286,11\n256#1:311\n256#1:285\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V
    .locals 19

    move-object/from16 v2, p1

    const-string v0, "painter"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x441d0e20

    move-object/from16 v3, p7

    invoke-interface {v3, v0}, LEt0;->u(I)LEt0;

    move-result-object v12

    and-int/lit8 v3, p9, 0x4

    if-eqz v3, :cond_0

    sget-object v3, LgV2;->b0:LgV2$a;

    move-object v13, v3

    goto :goto_0

    :cond_0
    move-object/from16 v13, p2

    :goto_0
    and-int/lit8 v3, p9, 0x8

    if-eqz v3, :cond_1

    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->e()LK9;

    move-result-object v3

    move-object v14, v3

    goto :goto_1

    :cond_1
    move-object/from16 v14, p3

    :goto_1
    and-int/lit8 v3, p9, 0x10

    if-eqz v3, :cond_2

    sget-object v3, LBA0;->a:LBA0$a;

    invoke-virtual {v3}, LBA0$a;->b()LBA0;

    move-result-object v3

    move-object v15, v3

    goto :goto_2

    :cond_2
    move-object/from16 v15, p4

    :goto_2
    and-int/lit8 v3, p9, 0x20

    if-eqz v3, :cond_3

    const/high16 v3, 0x3f800000    # 1.0f

    move/from16 v16, v3

    goto :goto_3

    :cond_3
    move/from16 v16, p5

    :goto_3
    and-int/lit8 v3, p9, 0x40

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    move-object/from16 v17, v4

    goto :goto_4

    :cond_4
    move-object/from16 v17, p6

    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_5

    const/4 v3, -0x1

    const-string v5, "androidx.compose.foundation.Image (Image.kt:235)"

    move/from16 v11, p8

    invoke-static {v0, v11, v3, v5}, LQt0;->Z(IIILjava/lang/String;)V

    goto :goto_5

    :cond_5
    move/from16 v11, p8

    :goto_5
    const v0, -0x30af4a0b

    invoke-interface {v12, v0}, LEt0;->F(I)V

    const/4 v0, 0x0

    if-eqz v2, :cond_8

    sget-object v3, LgV2;->b0:LgV2$a;

    const v5, 0x44faf204

    invoke-interface {v12, v5}, LEt0;->F(I)V

    invoke-interface {v12, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v12}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_6

    sget-object v5, LEt0;->a:LEt0$a;

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_7

    :cond_6
    new-instance v6, LxX1$c;

    invoke-direct {v6, v2}, LxX1$c;-><init>(Ljava/lang/String;)V

    invoke-interface {v12, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_7
    invoke-interface {v12}, LEt0;->Q()V

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x1

    invoke-static {v3, v0, v6, v5, v4}, Lfs5;->b(LgV2;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)LgV2;

    move-result-object v3

    goto :goto_6

    :cond_8
    sget-object v3, LgV2;->b0:LgV2$a;

    :goto_6
    invoke-interface {v12}, LEt0;->Q()V

    invoke-interface {v13, v3}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v3

    invoke-static {v3}, LQk0;->b(LgV2;)LgV2;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v10, 0x2

    const/16 v18, 0x0

    move-object/from16 v4, p0

    move-object v6, v14

    move-object v7, v15

    move/from16 v8, v16

    move-object/from16 v9, v17

    move-object/from16 v11, v18

    invoke-static/range {v3 .. v11}, Landroidx/compose/ui/draw/b;->b(LgV2;LnE3;ZLK9;LBA0;FLsm0;ILjava/lang/Object;)LgV2;

    move-result-object v3

    sget-object v4, LxX1$a;->a:LxX1$a;

    const v5, -0x4ee9b9da

    invoke-interface {v12, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v12, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {v12, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v7

    invoke-interface {v12, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJq6;

    sget-object v8, LBt0;->M:LBt0$a;

    invoke-virtual {v8}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v3}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v3

    invoke-interface {v12}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_9

    invoke-static {}, Lyt0;->c()V

    :cond_9
    invoke-interface {v12}, LEt0;->h()V

    invoke-interface {v12}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-interface {v12, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_7

    :cond_a
    invoke-interface {v12}, LEt0;->e()V

    :goto_7
    invoke-static {v12}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual {v8}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v4, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v5, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v6, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v8}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v9, v7, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-static {v12}, LMB5;->b(LEt0;)LEt0;

    move-result-object v4

    invoke-static {v4}, LMB5;->a(LEt0;)LMB5;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v4, v12, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v12, v0}, LEt0;->F(I)V

    invoke-interface {v12}, LEt0;->Q()V

    invoke-interface {v12}, LEt0;->f()V

    invoke-interface {v12}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    invoke-interface {v12}, LEt0;->w()LWm5;

    move-result-object v10

    if-nez v10, :cond_c

    goto :goto_8

    :cond_c
    new-instance v11, LxX1$b;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v13

    move-object v4, v14

    move-object v5, v15

    move/from16 v6, v16

    move-object/from16 v7, v17

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, LxX1$b;-><init>(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;II)V

    invoke-interface {v10, v11}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_8
    return-void
.end method

.method public static final b(LMW1;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;ILEt0;II)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v10, p8

    move/from16 v8, p9

    move/from16 v1, p10

    const-string v2, "bitmap"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0x53393f7c

    invoke-interface {v10, v2}, LEt0;->F(I)V

    and-int/lit8 v3, v1, 0x4

    if-eqz v3, :cond_0

    sget-object v3, LgV2;->b0:LgV2$a;

    move-object v9, v3

    goto :goto_0

    :cond_0
    move-object/from16 v9, p2

    :goto_0
    and-int/lit8 v3, v1, 0x8

    if-eqz v3, :cond_1

    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->e()LK9;

    move-result-object v3

    move-object v11, v3

    goto :goto_1

    :cond_1
    move-object/from16 v11, p3

    :goto_1
    and-int/lit8 v3, v1, 0x10

    if-eqz v3, :cond_2

    sget-object v3, LBA0;->a:LBA0$a;

    invoke-virtual {v3}, LBA0$a;->b()LBA0;

    move-result-object v3

    move-object v12, v3

    goto :goto_2

    :cond_2
    move-object/from16 v12, p4

    :goto_2
    and-int/lit8 v3, v1, 0x20

    if-eqz v3, :cond_3

    const/high16 v3, 0x3f800000    # 1.0f

    move v13, v3

    goto :goto_3

    :cond_3
    move/from16 v13, p5

    :goto_3
    and-int/lit8 v3, v1, 0x40

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    move-object v14, v3

    goto :goto_4

    :cond_4
    move-object/from16 v14, p6

    :goto_4
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_5

    sget-object v1, LI61;->O:LI61$a;

    invoke-virtual {v1}, LI61$a;->b()I

    move-result v1

    move v5, v1

    goto :goto_5

    :cond_5
    move/from16 v5, p7

    :goto_5
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v3, "androidx.compose.foundation.Image (Image.kt:143)"

    invoke-static {v2, v8, v1, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    const v1, 0x44faf204

    invoke-interface {v10, v1}, LEt0;->F(I)V

    invoke-interface {v10, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface/range {p8 .. p8}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_7

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_8

    :cond_7
    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v7}, LdU;->b(LMW1;JJIILjava/lang/Object;)LcU;

    move-result-object v2

    invoke-interface {v10, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_8
    invoke-interface/range {p8 .. p8}, LEt0;->Q()V

    move-object v0, v2

    check-cast v0, LcU;

    and-int/lit8 v1, v8, 0x70

    or-int/lit8 v1, v1, 0x8

    and-int/lit16 v2, v8, 0x380

    or-int/2addr v1, v2

    and-int/lit16 v2, v8, 0x1c00

    or-int/2addr v1, v2

    const v2, 0xe000

    and-int/2addr v2, v8

    or-int/2addr v1, v2

    const/high16 v2, 0x70000

    and-int/2addr v2, v8

    or-int/2addr v1, v2

    const/high16 v2, 0x380000

    and-int/2addr v2, v8

    or-int v8, v1, v2

    const/4 v15, 0x0

    move-object/from16 v1, p1

    move-object v2, v9

    move-object v3, v11

    move-object v4, v12

    move v5, v13

    move-object v6, v14

    move-object/from16 v7, p8

    move v9, v15

    invoke-static/range {v0 .. v9}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    invoke-interface/range {p8 .. p8}, LEt0;->Q()V

    return-void
.end method
