.class public final Lcom/stripe/android/ui/core/elements/CardDetailsElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a7\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "enabled",
        "Lcom/stripe/android/ui/core/elements/CardDetailsController;",
        "controller",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "hiddenIdentifiers",
        "lastTextFieldIdentifier",
        "",
        "CardDetailsElementUI",
        "(ZLcom/stripe/android/ui/core/elements/CardDetailsController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V",
        "payments-ui-core_release"
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
        "SMAP\nCardDetailsElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardDetailsElementUI.kt\ncom/stripe/android/ui/core/elements/CardDetailsElementUIKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,51:1\n1864#2,2:52\n1866#2:56\n174#3:54\n174#3:55\n*S KotlinDebug\n*F\n+ 1 CardDetailsElementUI.kt\ncom/stripe/android/ui/core/elements/CardDetailsElementUIKt\n*L\n22#1:52,2\n22#1:56\n43#1:54\n45#1:55\n*E\n"
    }
.end annotation


# direct methods
.method public static final CardDetailsElementUI(ZLcom/stripe/android/ui/core/elements/CardDetailsController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/ui/core/elements/CardDetailsController;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v5, p5

    const-string v0, "controller"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hiddenIdentifiers"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5a8aa4f9

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v6, "com.stripe.android.ui.core.elements.CardDetailsElementUI (CardDetailsElementUI.kt:15)"

    invoke-static {v0, v5, v4, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getFields()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v16, v4, 0x1

    if-gez v4, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1
    move-object v7, v6

    check-cast v7, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    invoke-interface {v7}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    sget-object v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v8}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardNumber()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    sget-object v6, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v6}, Landroidx/compose/ui/focus/c$a;->e()I

    move-result v6

    goto :goto_1

    :cond_2
    sget-object v6, Landroidx/compose/ui/focus/c;->b:Landroidx/compose/ui/focus/c$a;

    invoke-virtual {v6}, Landroidx/compose/ui/focus/c$a;->a()I

    move-result v6

    :goto_1
    move v11, v6

    const/4 v8, 0x0

    const/4 v12, 0x0

    and-int/lit8 v6, v5, 0xe

    or-int/lit16 v6, v6, 0x1040

    sget v9, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v9, v9, 0xc

    or-int/2addr v6, v9

    shl-int/lit8 v9, v5, 0x3

    const v10, 0xe000

    and-int/2addr v9, v10

    or-int v14, v6, v9

    const/16 v15, 0x44

    move/from16 v6, p0

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move-object v13, v1

    invoke-static/range {v6 .. v15}, Lcom/stripe/android/uicore/elements/SectionFieldElementUIKt;->SectionFieldElementUI-0uKR9Ig(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;II)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getFields()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v6

    if-eq v4, v6, :cond_3

    sget-object v4, LTM2;->a:LTM2;

    sget v6, LTM2;->b:I

    invoke-static {v4, v1, v6}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/uicore/StripeColors;->getComponentDivider-0d7_KjU()J

    move-result-wide v7

    invoke-static {v4, v1, v6}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeShapes(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidth()F

    move-result v9

    invoke-static {v9}, Lk61;->g(F)F

    move-result v9

    sget-object v10, LgV2;->b0:LgV2$a;

    invoke-static {v4, v1, v6}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeShapes(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeShapes;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/uicore/StripeShapes;->getBorderStrokeWidth()F

    move-result v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    const/4 v6, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static {v10, v4, v12, v6, v11}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v6

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x8

    move-object v11, v1

    invoke-static/range {v6 .. v13}, LL51;->a(LgV2;JFFLEt0;II)V

    :cond_3
    move/from16 v4, v16

    goto/16 :goto_0

    :cond_4
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_6

    goto :goto_2

    :cond_6
    new-instance v7, Lcom/stripe/android/ui/core/elements/CardDetailsElementUIKt$CardDetailsElementUI$2;

    move-object v0, v7

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/ui/core/elements/CardDetailsElementUIKt$CardDetailsElementUI$2;-><init>(ZLcom/stripe/android/ui/core/elements/CardDetailsController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method
