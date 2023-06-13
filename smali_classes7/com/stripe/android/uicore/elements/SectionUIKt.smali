.class public final Lcom/stripe/android/uicore/elements/SectionUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001aC\u0010\u0008\u001a\u00020\u00052\n\u0008\u0001\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u00052\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\u0000H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001aK\u0010\u0018\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "",
        "title",
        "",
        "error",
        "Lkotlin/Function0;",
        "",
        "contentOutsideCard",
        "contentInCard",
        "Section",
        "(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LEt0;II)V",
        "titleText",
        "SectionTitle",
        "(Ljava/lang/Integer;LEt0;I)V",
        "LgV2;",
        "modifier",
        "",
        "isSelected",
        "Lpm0;",
        "backgroundColor",
        "LeZ;",
        "border",
        "content",
        "SectionCard-T042LqI",
        "(LgV2;ZJLeZ;Lkotlin/jvm/functions/Function2;LEt0;II)V",
        "SectionCard",
        "SectionError",
        "(Ljava/lang/String;LEt0;I)V",
        "stripe-ui-core_release"
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
        "SMAP\nSectionUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SectionUI.kt\ncom/stripe/android/uicore/elements/SectionUIKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,101:1\n154#2:102\n154#2:136\n154#2:142\n164#2:143\n154#2:144\n74#3,6:103\n80#3:135\n84#3:141\n75#4:109\n76#4,11:111\n89#4:140\n76#5:110\n460#6,13:122\n473#6,3:137\n*S KotlinDebug\n*F\n+ 1 SectionUI.kt\ncom/stripe/android/uicore/elements/SectionUIKt\n*L\n33#1:102\n37#1:136\n55#1:142\n78#1:143\n78#1:144\n33#1:103,6\n33#1:135\n33#1:141\n33#1:109\n33#1:111,11\n33#1:140\n33#1:110\n33#1:122,13\n33#1:137,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final Section(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LEt0;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
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

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v12, p3

    move/from16 v13, p5

    const-string v0, "contentInCard"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x41ae3787

    move-object/from16 v3, p4

    invoke-interface {v3, v0}, LEt0;->u(I)LEt0;

    move-result-object v14

    and-int/lit8 v3, p6, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v13, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v13, 0xe

    if-nez v3, :cond_2

    invoke-interface {v14, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v13

    goto :goto_1

    :cond_2
    move v3, v13

    :goto_1
    and-int/lit8 v4, p6, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v13, 0x70

    if-nez v4, :cond_5

    invoke-interface {v14, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, p6, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v13, 0x380

    if-nez v5, :cond_8

    move-object/from16 v5, p2

    invoke-interface {v14, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v3, v6

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v5, p2

    :goto_6
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v6, v13, 0x1c00

    if-nez v6, :cond_b

    invoke-interface {v14, v12}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x800

    goto :goto_7

    :cond_a
    const/16 v6, 0x400

    :goto_7
    or-int/2addr v3, v6

    :cond_b
    :goto_8
    move v15, v3

    and-int/lit16 v3, v15, 0x16db

    const/16 v6, 0x492

    if-ne v3, v6, :cond_d

    invoke-interface {v14}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_9

    :cond_c
    invoke-interface {v14}, LEt0;->k()V

    move-object v3, v5

    goto/16 :goto_c

    :cond_d
    :goto_9
    if-eqz v4, :cond_e

    sget-object v3, Lcom/stripe/android/uicore/elements/ComposableSingletons$SectionUIKt;->INSTANCE:Lcom/stripe/android/uicore/elements/ComposableSingletons$SectionUIKt;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/ComposableSingletons$SectionUIKt;->getLambda-1$stripe_ui_core_release()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    move-object v11, v3

    goto :goto_a

    :cond_e
    move-object v11, v5

    :goto_a
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_f

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.uicore.elements.Section (SectionUI.kt:26)"

    invoke-static {v0, v15, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_f
    sget-object v0, LgV2;->b0:LgV2$a;

    const/16 v17, 0x0

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v22, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v4

    const v5, -0x1cd0f17e

    invoke-interface {v14, v5}, LEt0;->F(I)V

    sget-object v5, Llo;->a:Llo;

    invoke-virtual {v5}, Llo;->g()Llo$l;

    move-result-object v5

    sget-object v6, LK9;->a:LK9$a;

    invoke-virtual {v6}, LK9$a;->j()LK9$b;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v5, v6, v14, v7}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v5

    const v6, -0x4ee9b9da

    invoke-interface {v14, v6}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v14, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v8

    invoke-interface {v14, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v9

    invoke-interface {v14, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJq6;

    sget-object v10, LBt0;->M:LBt0$a;

    invoke-virtual {v10}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    move-object/from16 p4, v11

    invoke-interface {v14}, LEt0;->v()Llm;

    move-result-object v11

    instance-of v11, v11, Llm;

    if-nez v11, :cond_10

    invoke-static {}, Lyt0;->c()V

    :cond_10
    invoke-interface {v14}, LEt0;->h()V

    invoke-interface {v14}, LEt0;->t()Z

    move-result v11

    if-eqz v11, :cond_11

    invoke-interface {v14, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_b

    :cond_11
    invoke-interface {v14}, LEt0;->e()V

    :goto_b
    invoke-interface {v14}, LEt0;->L()V

    invoke-static {v14}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual {v10}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v7, v5, v11}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v7, v6, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v7, v8, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v7, v9, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v14}, LEt0;->q()V

    invoke-static {v14}, LMB5;->b(LEt0;)LEt0;

    move-result-object v5

    invoke-static {v5}, LMB5;->a(LEt0;)LMB5;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v5, v14, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x7ab4aae9

    invoke-interface {v14, v4}, LEt0;->F(I)V

    const v4, -0x455f09d5

    invoke-interface {v14, v4}, LEt0;->F(I)V

    sget-object v4, LQm0;->a:LQm0;

    const v4, 0x28bd6443

    invoke-interface {v14, v4}, LEt0;->F(I)V

    and-int/lit8 v4, v15, 0xe

    invoke-static {v1, v14, v4}, Lcom/stripe/android/uicore/elements/SectionUIKt;->SectionTitle(Ljava/lang/Integer;LEt0;I)V

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static {v3}, Lk61;->g(F)F

    move-result v20

    const/16 v21, 0x7

    const/16 v22, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v3

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    shl-int/lit8 v0, v15, 0x3

    const v8, 0xe000

    and-int/2addr v0, v8

    or-int/lit8 v10, v0, 0x6

    const/16 v11, 0xe

    move-object/from16 v8, p3

    move-object v9, v14

    move-object/from16 v0, p4

    invoke-static/range {v3 .. v11}, Lcom/stripe/android/uicore/elements/SectionUIKt;->SectionCard-T042LqI(LgV2;ZJLeZ;Lkotlin/jvm/functions/Function2;LEt0;II)V

    const v3, -0x59b0daec

    invoke-interface {v14, v3}, LEt0;->F(I)V

    if-eqz v2, :cond_12

    shr-int/lit8 v3, v15, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v2, v14, v3}, Lcom/stripe/android/uicore/elements/SectionUIKt;->SectionError(Ljava/lang/String;LEt0;I)V

    :cond_12
    invoke-interface {v14}, LEt0;->Q()V

    shr-int/lit8 v3, v15, 0x6

    and-int/lit8 v3, v3, 0xe

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v14, v3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v14}, LEt0;->Q()V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-interface {v14}, LEt0;->f()V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-interface {v14}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-static {}, LQt0;->Y()V

    :cond_13
    move-object v3, v0

    :goto_c
    invoke-interface {v14}, LEt0;->w()LWm5;

    move-result-object v7

    if-nez v7, :cond_14

    goto :goto_d

    :cond_14
    new-instance v8, Lcom/stripe/android/uicore/elements/SectionUIKt$Section$2;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/uicore/elements/SectionUIKt$Section$2;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;II)V

    invoke-interface {v7, v8}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_d
    return-void
.end method

.method public static final SectionCard-T042LqI(LgV2;ZJLeZ;Lkotlin/jvm/functions/Function2;LEt0;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "ZJ",
            "LeZ;",
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

    move-object/from16 v6, p5

    move/from16 v7, p7

    const-string v0, "content"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x792d746d

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v2, p8, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v7, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v7, 0xe

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v7

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v7

    :goto_1
    and-int/lit8 v5, p8, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v7, 0x70

    if-nez v8, :cond_5

    move/from16 v8, p1

    invoke-interface {v1, v8}, LEt0;->o(Z)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v4, v9

    goto :goto_4

    :cond_5
    :goto_3
    move/from16 v8, p1

    :goto_4
    and-int/lit16 v9, v7, 0x380

    if-nez v9, :cond_8

    and-int/lit8 v9, p8, 0x4

    if-nez v9, :cond_6

    move-wide/from16 v9, p2

    invoke-interface {v1, v9, v10}, LEt0;->s(J)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_5

    :cond_6
    move-wide/from16 v9, p2

    :cond_7
    const/16 v11, 0x80

    :goto_5
    or-int/2addr v4, v11

    goto :goto_6

    :cond_8
    move-wide/from16 v9, p2

    :goto_6
    and-int/lit16 v11, v7, 0x1c00

    if-nez v11, :cond_b

    and-int/lit8 v11, p8, 0x8

    if-nez v11, :cond_9

    move-object/from16 v11, p4

    invoke-interface {v1, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_7

    :cond_9
    move-object/from16 v11, p4

    :cond_a
    const/16 v12, 0x400

    :goto_7
    or-int/2addr v4, v12

    goto :goto_8

    :cond_b
    move-object/from16 v11, p4

    :goto_8
    and-int/lit8 v12, p8, 0x10

    const v13, 0xe000

    if-eqz v12, :cond_c

    or-int/lit16 v4, v4, 0x6000

    goto :goto_a

    :cond_c
    and-int v12, v7, v13

    if-nez v12, :cond_e

    invoke-interface {v1, v6}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    const/16 v12, 0x4000

    goto :goto_9

    :cond_d
    const/16 v12, 0x2000

    :goto_9
    or-int/2addr v4, v12

    :cond_e
    :goto_a
    const v12, 0xb6db

    and-int/2addr v12, v4

    const/16 v14, 0x2492

    if-ne v12, v14, :cond_10

    invoke-interface {v1}, LEt0;->b()Z

    move-result v12

    if-nez v12, :cond_f

    goto :goto_b

    :cond_f
    invoke-interface {v1}, LEt0;->k()V

    move-object v2, v3

    move-wide v3, v9

    move-object v5, v11

    goto/16 :goto_11

    :cond_10
    :goto_b
    invoke-interface {v1}, LEt0;->J()V

    and-int/lit8 v12, v7, 0x1

    const/4 v14, 0x0

    if-eqz v12, :cond_15

    invoke-interface {v1}, LEt0;->l()Z

    move-result v12

    if-eqz v12, :cond_11

    goto :goto_d

    :cond_11
    invoke-interface {v1}, LEt0;->k()V

    and-int/lit8 v2, p8, 0x4

    if-eqz v2, :cond_12

    and-int/lit16 v4, v4, -0x381

    :cond_12
    and-int/lit8 v2, p8, 0x8

    if-eqz v2, :cond_13

    and-int/lit16 v4, v4, -0x1c01

    :cond_13
    move-object v2, v3

    :cond_14
    move v3, v8

    move-object/from16 v20, v11

    :goto_c
    move v8, v4

    move-wide v4, v9

    goto :goto_f

    :cond_15
    :goto_d
    if-eqz v2, :cond_16

    sget-object v2, LgV2;->b0:LgV2$a;

    goto :goto_e

    :cond_16
    move-object v2, v3

    :goto_e
    if-eqz v5, :cond_17

    move v8, v14

    :cond_17
    and-int/lit8 v3, p8, 0x4

    if-eqz v3, :cond_18

    sget-object v3, LTM2;->a:LTM2;

    sget v5, LTM2;->b:I

    invoke-static {v3, v1, v5}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/StripeColors;->getComponent-0d7_KjU()J

    move-result-wide v9

    and-int/lit16 v4, v4, -0x381

    :cond_18
    and-int/lit8 v3, p8, 0x8

    if-eqz v3, :cond_14

    sget-object v3, LTM2;->a:LTM2;

    sget v5, LTM2;->b:I

    and-int/lit8 v11, v4, 0x70

    or-int/2addr v5, v11

    invoke-static {v3, v8, v1, v5}, Lcom/stripe/android/uicore/StripeThemeKt;->getBorderStroke(LTM2;ZLEt0;I)LeZ;

    move-result-object v3

    and-int/lit16 v4, v4, -0x1c01

    move-object/from16 v20, v3

    move v3, v8

    goto :goto_c

    :goto_f
    invoke-interface {v1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v9

    if-eqz v9, :cond_19

    const/4 v9, -0x1

    const-string v10, "com.stripe.android.uicore.elements.SectionCard (SectionUI.kt:67)"

    invoke-static {v0, v8, v9, v10}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_19
    if-eqz v3, :cond_1a

    const-wide/high16 v9, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v9

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    goto :goto_10

    :cond_1a
    int-to-float v0, v14

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    :goto_10
    move v15, v0

    sget-object v0, LTM2;->a:LTM2;

    sget v9, LTM2;->b:I

    invoke-virtual {v0, v1, v9}, LTM2;->b(LEt0;I)LDy5;

    move-result-object v0

    invoke-virtual {v0}, LDy5;->d()LKC0;

    move-result-object v9

    const-wide/16 v16, 0x0

    new-instance v0, Lcom/stripe/android/uicore/elements/SectionUIKt$SectionCard$1;

    invoke-direct {v0, v6, v8}, Lcom/stripe/android/uicore/elements/SectionUIKt$SectionCard$1;-><init>(Lkotlin/jvm/functions/Function2;I)V

    const v10, 0x8f3a36

    const/4 v11, 0x1

    invoke-static {v1, v10, v11, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/high16 v10, 0x180000

    and-int/lit8 v11, v8, 0xe

    or-int/2addr v10, v11

    and-int/lit16 v11, v8, 0x380

    or-int/2addr v10, v11

    shl-int/lit8 v8, v8, 0x3

    and-int/2addr v8, v13

    or-int v18, v10, v8

    const/16 v19, 0x8

    move-object v8, v2

    move-wide v10, v4

    move-wide/from16 v12, v16

    move-object/from16 v14, v20

    move-object/from16 v16, v0

    move-object/from16 v17, v1

    invoke-static/range {v8 .. v19}, LPf0;->a(LgV2;Lhy5;JJLeZ;FLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-static {}, LQt0;->Y()V

    :cond_1b
    move v8, v3

    move-wide v3, v4

    move-object/from16 v5, v20

    :goto_11
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v9

    if-nez v9, :cond_1c

    goto :goto_12

    :cond_1c
    new-instance v10, Lcom/stripe/android/uicore/elements/SectionUIKt$SectionCard$2;

    move-object v0, v10

    move-object v1, v2

    move v2, v8

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/uicore/elements/SectionUIKt$SectionCard$2;-><init>(LgV2;ZJLeZ;Lkotlin/jvm/functions/Function2;II)V

    invoke-interface {v9, v10}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_12
    return-void
.end method

.method public static final SectionError(Ljava/lang/String;LEt0;I)V
    .locals 25

    move-object/from16 v0, p0

    move/from16 v15, p2

    const-string v1, "error"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, -0x3abce076

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, LEt0;->u(I)LEt0;

    move-result-object v13

    and-int/lit8 v2, v15, 0xe

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-interface {v13, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v15

    move v14, v2

    goto :goto_1

    :cond_1
    move v14, v15

    :goto_1
    and-int/lit8 v2, v14, 0xb

    if-ne v2, v3, :cond_3

    invoke-interface {v13}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v13}, LEt0;->k()V

    move-object/from16 v24, v13

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.elements.SectionError (SectionUI.kt:92)"

    invoke-static {v1, v14, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget-object v1, LTM2;->a:LTM2;

    sget v4, LTM2;->b:I

    invoke-virtual {v1, v13, v4}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->d()J

    move-result-wide v2

    invoke-virtual {v1, v13, v4}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v1

    invoke-virtual {v1}, LGc6;->j()LG26;

    move-result-object v19

    sget-object v1, LgV2;->b0:LgV2$a;

    const/4 v4, 0x1

    sget-object v5, Lcom/stripe/android/uicore/elements/SectionUIKt$SectionError$1;->INSTANCE:Lcom/stripe/android/uicore/elements/SectionUIKt$SectionError$1;

    invoke-static {v1, v4, v5}, Lfs5;->a(LgV2;ZLkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v1

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 v24, v13

    move/from16 v20, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    and-int/lit8 v21, v20, 0xe

    const/16 v22, 0x0

    const/16 v23, 0x7ff8

    move-object/from16 v0, p0

    move-object/from16 v20, v24

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    invoke-interface/range {v24 .. v24}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    new-instance v1, Lcom/stripe/android/uicore/elements/SectionUIKt$SectionError$2;

    move-object/from16 v2, p0

    move/from16 v3, p2

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/uicore/elements/SectionUIKt$SectionError$2;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method

.method public static final SectionTitle(Ljava/lang/Integer;LEt0;I)V
    .locals 10

    const v0, 0x6298a46a

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p2, 0xe

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v4, v1, 0xb

    if-ne v4, v3, :cond_3

    invoke-interface {p1}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_4

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.uicore.elements.SectionTitle (SectionUI.kt:49)"

    invoke-static {v0, v1, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    if-nez p0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    and-int/lit8 v1, v1, 0xe

    invoke-static {v0, p1, v1}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v0

    sget-object v3, LgV2;->b0:LgV2$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    int-to-float v1, v2

    invoke-static {v1}, Lk61;->g(F)F

    move-result v7

    const/4 v8, 0x7

    const/4 v9, 0x0

    invoke-static/range {v3 .. v9}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v1

    const/4 v2, 0x1

    sget-object v3, Lcom/stripe/android/uicore/elements/SectionUIKt$SectionTitle$1$1;->INSTANCE:Lcom/stripe/android/uicore/elements/SectionUIKt$SectionTitle$1$1;

    invoke-static {v1, v2, v3}, Lfs5;->a(LgV2;ZLkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2, v2}, Lcom/stripe/android/uicore/elements/H6TextKt;->H6Text(Ljava/lang/String;LgV2;LEt0;II)V

    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    :goto_4
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_7

    goto :goto_5

    :cond_7
    new-instance v0, Lcom/stripe/android/uicore/elements/SectionUIKt$SectionTitle$2;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/uicore/elements/SectionUIKt$SectionTitle$2;-><init>(Ljava/lang/Integer;I)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method
