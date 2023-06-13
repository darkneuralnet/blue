.class public final Lcom/stripe/android/uicore/elements/RowElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a7\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "enabled",
        "Lcom/stripe/android/uicore/elements/RowController;",
        "controller",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "hiddenIdentifiers",
        "lastTextFieldIdentifier",
        "",
        "RowElementUI",
        "(ZLcom/stripe/android/uicore/elements/RowController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V",
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
        "SMAP\nRowElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowElementUI.kt\ncom/stripe/android/uicore/elements/RowElementUIKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,75:1\n766#2:76\n857#2,2:77\n1864#2,2:119\n1866#2:129\n1057#3,3:79\n1060#3,3:83\n1057#3,6:122\n154#4:82\n174#4:128\n75#5,6:86\n81#5:118\n85#5:134\n75#6:92\n76#6,11:94\n89#6:133\n76#7:93\n460#8,13:105\n36#8:121\n473#8,3:130\n*S KotlinDebug\n*F\n+ 1 RowElementUI.kt\ncom/stripe/android/uicore/elements/RowElementUIKt\n*L\n29#1:76\n29#1:77,2\n35#1:119,2\n35#1:129\n30#1:79,3\n30#1:83,3\n55#1:122,6\n30#1:82\n67#1:128\n34#1:86,6\n34#1:118\n34#1:134\n34#1:92\n34#1:94,11\n34#1:133\n34#1:93\n34#1:105,13\n55#1:121\n34#1:130,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final RowElementUI(ZLcom/stripe/android/uicore/elements/RowController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/uicore/elements/RowController;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v10, p2

    move/from16 v11, p5

    const-string v0, "controller"

    move-object/from16 v12, p1

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenIdentifiers"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x26ebe911

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v13

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.uicore.elements.RowElementUI (RowElementUI.kt:22)"

    invoke-static {v0, v11, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/RowController;->getFields()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-interface {v10, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    xor-int/2addr v2, v3

    if-eqz v2, :cond_1

    invoke-interface {v14, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-ne v0, v1, :cond_3

    int-to-float v0, v4

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v0}, Lk61;->d(F)Lk61;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v3, v1, v3}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    invoke-interface {v13, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    move-object v15, v0

    check-cast v15, LEX2;

    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    if-eqz v0, :cond_d

    sget-object v0, LgV2;->b0:LgV2$a;

    const/4 v1, 0x0

    invoke-static {v0, v1, v2, v3}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    const v1, 0x2952b718

    invoke-interface {v13, v1}, LEt0;->F(I)V

    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->f()Llo$d;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->k()LK9$c;

    move-result-object v2

    invoke-static {v1, v2, v13, v4}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {v13, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {v13, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v3

    invoke-interface {v13, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {v13, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {v13}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_4

    invoke-static {}, Lyt0;->c()V

    :cond_4
    invoke-interface {v13}, LEt0;->h()V

    invoke-interface {v13}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v13, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_5
    invoke-interface {v13}, LEt0;->e()V

    :goto_1
    invoke-interface {v13}, LEt0;->L()V

    invoke-static {v13}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual {v6}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v1, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v3, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v13}, LEt0;->q()V

    invoke-static {v13}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v13, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v13, v0}, LEt0;->F(I)V

    const v0, -0x286e2e7f

    invoke-interface {v13, v0}, LEt0;->F(I)V

    sget-object v22, Lad5;->a:Lad5;

    const v0, 0x60266ab2

    invoke-interface {v13, v0}, LEt0;->F(I)V

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v23

    move v9, v4

    :goto_2
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v24, v9, 0x1

    if-gez v9, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_6
    move-object v1, v0

    check-cast v1, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v0

    if-ne v9, v0, :cond_7

    sget-object v0, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->a()I

    move-result v0

    goto :goto_3

    :cond_7
    sget-object v0, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->g()I

    move-result v0

    :goto_3
    move v5, v0

    if-nez v9, :cond_8

    sget-object v0, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->h()I

    move-result v0

    goto :goto_4

    :cond_8
    sget-object v0, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/c$a;->d()I

    move-result v0

    :goto_4
    move v6, v0

    sget-object v8, LgV2;->b0:LgV2$a;

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    int-to-float v0, v0

    const/high16 v2, 0x3f800000    # 1.0f

    div-float v18, v2, v0

    const/16 v19, 0x0

    const/16 v20, 0x2

    const/16 v21, 0x0

    move-object/from16 v16, v22

    move-object/from16 v17, v8

    invoke-static/range {v16 .. v21}, LZc5;->b(LZc5;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v0

    const v2, 0x44faf204

    invoke-interface {v13, v2}, LEt0;->F(I)V

    invoke-interface {v13, v15}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_9

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_a

    :cond_9
    new-instance v3, Lcom/stripe/android/uicore/elements/RowElementUIKt$RowElementUI$1$1$1$1;

    invoke-direct {v3, v15}, Lcom/stripe/android/uicore/elements/RowElementUIKt$RowElementUI$1$1$1$1;-><init>(LEX2;)V

    invoke-interface {v13, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_a
    invoke-interface {v13}, LEt0;->Q()V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v3}, Lhh3;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v2

    and-int/lit8 v0, v11, 0xe

    or-int/lit16 v0, v0, 0x1000

    shl-int/lit8 v3, v11, 0x3

    const v4, 0xe000

    and-int/2addr v3, v4

    or-int v16, v0, v3

    const/16 v17, 0x0

    move/from16 v0, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object v7, v13

    move-object v10, v8

    move/from16 v8, v16

    move v11, v9

    move/from16 v9, v17

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/uicore/elements/SectionFieldElementUIKt;->SectionFieldElementUI-0uKR9Ig(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V

    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v0

    if-eq v11, v0, :cond_b

    invoke-interface {v15}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk61;

    invoke-virtual {v0}, Lk61;->l()F

    move-result v0

    invoke-static {v10, v0}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v0

    sget-object v1, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-static {v1, v13, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeShapes(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidth()F

    move-result v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v0, v3}, LBB5;->A(LgV2;F)LgV2;

    move-result-object v0

    invoke-static {v1, v13, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getComponentDivider-0d7_KjU()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    move-object v1, v0

    move-object v6, v13

    invoke-static/range {v1 .. v8}, LL51;->a(LgV2;JFFLEt0;II)V

    :cond_b
    move-object/from16 v10, p2

    move/from16 v11, p5

    move/from16 v9, v24

    goto/16 :goto_2

    :cond_c
    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->f()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    :cond_d
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LQt0;->Y()V

    :cond_e
    invoke-interface {v13}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_f

    goto :goto_5

    :cond_f
    new-instance v7, Lcom/stripe/android/uicore/elements/RowElementUIKt$RowElementUI$2;

    move-object v0, v7

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/elements/RowElementUIKt$RowElementUI$2;-><init>(ZLcom/stripe/android/uicore/elements/RowController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method
