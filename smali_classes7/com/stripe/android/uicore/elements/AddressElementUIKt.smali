.class public final Lcom/stripe/android/uicore/elements/AddressElementUIKt;
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
        "Lcom/stripe/android/uicore/elements/AddressController;",
        "controller",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "hiddenIdentifiers",
        "lastTextFieldIdentifier",
        "",
        "AddressElementUI",
        "(ZLcom/stripe/android/uicore/elements/AddressController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V",
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
        "SMAP\nAddressElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElementUI.kt\ncom/stripe/android/uicore/elements/AddressElementUIKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,50:1\n819#2:51\n847#2,2:52\n1864#2,2:88\n1866#2:92\n73#3,7:54\n80#3:87\n84#3:97\n75#4:61\n76#4,11:63\n89#4:96\n76#5:62\n460#6,13:74\n473#6,3:93\n174#7:90\n174#7:91\n76#8:98\n*S KotlinDebug\n*F\n+ 1 AddressElementUI.kt\ncom/stripe/android/uicore/elements/AddressElementUIKt\n*L\n28#1:51\n28#1:52,2\n30#1:88,2\n30#1:92\n29#1:54,7\n29#1:87\n29#1:97\n29#1:61\n29#1:63,11\n29#1:96\n29#1:62\n29#1:74,13\n29#1:93,3\n40#1:90\n42#1:91\n24#1:98\n*E\n"
    }
.end annotation


# direct methods
.method public static final AddressElementUI(ZLcom/stripe/android/uicore/elements/AddressController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/uicore/elements/AddressController;",
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

    const v0, 0x52773a6b

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v13

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.uicore.elements.AddressElementUI (AddressElementUI.kt:17)"

    invoke-static {v0, v11, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/AddressController;->getFieldsFlowable()LEu1;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v5, 0x38

    const/4 v6, 0x2

    move-object v4, v13

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/AddressElementUIKt;->AddressElementUI$lambda$0(LsP5;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    invoke-interface {v3}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-interface {v10, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object v15, v1

    goto :goto_1

    :cond_3
    const/4 v15, 0x0

    :goto_1
    if-nez v15, :cond_4

    goto/16 :goto_5

    :cond_4
    const v0, -0x1cd0f17e

    invoke-interface {v13, v0}, LEt0;->F(I)V

    sget-object v0, LgV2;->b0:LgV2$a;

    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->g()Llo$l;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->j()LK9$b;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v13, v3}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {v13, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {v13, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {v13, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

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

    if-nez v8, :cond_5

    invoke-static {}, Lyt0;->c()V

    :cond_5
    invoke-interface {v13}, LEt0;->h()V

    invoke-interface {v13}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v13, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_6
    invoke-interface {v13}, LEt0;->e()V

    :goto_2
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

    invoke-static {v7, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v13}, LEt0;->q()V

    invoke-static {v13}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v13, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v13, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v13, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, -0x590ecf0e    # -1.6736001E-15f

    invoke-interface {v13, v0}, LEt0;->F(I)V

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    move v9, v3

    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v17, v9, 0x1

    if-gez v9, :cond_7

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_7
    move-object v1, v0

    check-cast v1, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    and-int/lit8 v0, v11, 0xe

    or-int/lit16 v0, v0, 0x1000

    shl-int/lit8 v3, v11, 0x3

    const v4, 0xe000

    and-int/2addr v3, v4

    or-int v8, v0, v3

    const/16 v18, 0x64

    move/from16 v0, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object v7, v13

    move v14, v9

    move/from16 v9, v18

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/uicore/elements/SectionFieldElementUIKt;->SectionFieldElementUI-0uKR9Ig(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v0

    if-eq v14, v0, :cond_8

    sget-object v0, LTM2;->a:LTM2;

    sget v1, LTM2;->b:I

    invoke-static {v0, v13, v1}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeColors;->getComponentDivider-0d7_KjU()J

    move-result-wide v2

    invoke-static {v0, v13, v1}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeShapes(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidth()F

    move-result v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    sget-object v5, LgV2;->b0:LgV2$a;

    invoke-static {v0, v13, v1}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeShapes(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidth()F

    move-result v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    const/4 v1, 0x0

    const/4 v6, 0x2

    const/4 v9, 0x0

    invoke-static {v5, v0, v1, v6, v9}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x8

    move-object v6, v13

    invoke-static/range {v1 .. v8}, LL51;->a(LgV2;JFFLEt0;II)V

    goto :goto_4

    :cond_8
    const/4 v9, 0x0

    :goto_4
    move/from16 v9, v17

    goto :goto_3

    :cond_9
    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->f()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    :goto_5
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LQt0;->Y()V

    :cond_a
    invoke-interface {v13}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_b

    goto :goto_6

    :cond_b
    new-instance v7, Lcom/stripe/android/uicore/elements/AddressElementUIKt$AddressElementUI$3;

    move-object v0, v7

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/elements/AddressElementUIKt$AddressElementUI$3;-><init>(ZLcom/stripe/android/uicore/elements/AddressController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void
.end method

.method private static final AddressElementUI$lambda$0(LsP5;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method
