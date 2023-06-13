.class public final Lcom/stripe/android/uicore/elements/OTPElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u001a=\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001aO\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "",
        "OTPElementUIPreview",
        "(LEt0;I)V",
        "OTPElementUIDisabledPreview",
        "",
        "enabled",
        "Lcom/stripe/android/uicore/elements/OTPElement;",
        "element",
        "LgV2;",
        "modifier",
        "Lcom/stripe/android/uicore/elements/OTPElementColors;",
        "colors",
        "Landroidx/compose/ui/focus/h;",
        "focusRequester",
        "OTPElementUI",
        "(ZLcom/stripe/android/uicore/elements/OTPElement;LgV2;Lcom/stripe/android/uicore/elements/OTPElementColors;Landroidx/compose/ui/focus/h;LEt0;II)V",
        "",
        "value",
        "isSelected",
        "",
        "index",
        "LBv1;",
        "focusManager",
        "OTPInputBox",
        "(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElement;ILBv1;LgV2;ZLcom/stripe/android/uicore/elements/OTPElementColors;LEt0;I)V",
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
        "SMAP\nOTPElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,257:1\n25#2:258\n460#2,13:284\n25#2:298\n473#2,3:311\n1057#3,6:259\n1057#3,6:299\n76#4:265\n76#4:272\n76#5,5:266\n81#5:297\n85#5:315\n75#6:271\n76#6,11:273\n89#6:314\n1549#7:305\n1620#7,2:306\n1622#7:310\n154#8:308\n154#8:309\n76#9:316\n102#9,2:317\n*S KotlinDebug\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt\n*L\n97#1:258\n101#1:284,13\n105#1:298\n101#1:311,3\n97#1:259,6\n105#1:299,6\n99#1:265\n101#1:272\n101#1:266,5\n101#1:297\n101#1:315\n101#1:271\n101#1:273,11\n101#1:314\n107#1:305\n107#1:306,2\n107#1:310\n112#1:308\n118#1:309\n105#1:316\n105#1:317,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final OTPElementUI(ZLcom/stripe/android/uicore/elements/OTPElement;LgV2;Lcom/stripe/android/uicore/elements/OTPElementColors;Landroidx/compose/ui/focus/h;LEt0;II)V
    .locals 35

    const-string v0, "element"

    move-object/from16 v11, p1

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0xcf4d92e

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v12

    and-int/lit8 v1, p7, 0x4

    if-eqz v1, :cond_0

    sget-object v1, LgV2;->b0:LgV2$a;

    move-object v13, v1

    goto :goto_0

    :cond_0
    move-object/from16 v13, p2

    :goto_0
    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_1

    new-instance v1, Lcom/stripe/android/uicore/elements/OTPElementColors;

    sget-object v2, LTM2;->a:LTM2;

    sget v3, LTM2;->b:I

    invoke-virtual {v2, v12, v3}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v4

    invoke-virtual {v4}, LMm0;->j()J

    move-result-wide v4

    invoke-static {v2, v12, v3}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeColors;->getPlaceholderText-0d7_KjU()J

    move-result-wide v6

    const/4 v8, 0x0

    move-object v2, v1

    move-wide v3, v4

    move-wide v5, v6

    move-object v7, v8

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/uicore/elements/OTPElementColors;-><init>(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v14, p6

    and-int/lit16 v2, v14, -0x1c01

    move-object v15, v1

    goto :goto_1

    :cond_1
    move/from16 v14, p6

    move-object/from16 v15, p3

    move v2, v14

    :goto_1
    and-int/lit8 v1, p7, 0x10

    const v3, -0x1d58f75c

    if-eqz v1, :cond_3

    invoke-interface {v12, v3}, LEt0;->F(I)V

    invoke-interface {v12}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v1, v4, :cond_2

    new-instance v1, Landroidx/compose/ui/focus/h;

    invoke-direct {v1}, Landroidx/compose/ui/focus/h;-><init>()V

    invoke-interface {v12, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {v12}, LEt0;->Q()V

    check-cast v1, Landroidx/compose/ui/focus/h;

    const v4, -0xe001

    and-int/2addr v2, v4

    move-object/from16 v16, v1

    goto :goto_2

    :cond_3
    move-object/from16 v16, p4

    :goto_2
    move v10, v2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_4

    const-string v1, "com.stripe.android.uicore.elements.OTPElementUI (OTPElementUI.kt:88)"

    invoke-static {v0, v10, v2, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    invoke-static {}, Lhu0;->h()LU94;

    move-result-object v0

    invoke-interface {v12, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBv1;

    const/4 v9, 0x0

    const/4 v8, 0x1

    const/4 v7, 0x0

    invoke-static {v13, v9, v8, v7}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v1

    sget-object v4, Llo;->a:Llo;

    invoke-virtual {v4}, Llo;->e()Llo$e;

    move-result-object v4

    const v5, 0x2952b718

    invoke-interface {v12, v5}, LEt0;->F(I)V

    sget-object v5, LK9;->a:LK9$a;

    invoke-virtual {v5}, LK9$a;->k()LK9$c;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v4, v5, v12, v6}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v4

    const v5, -0x4ee9b9da

    invoke-interface {v12, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v12, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v8

    invoke-interface {v12, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v9

    invoke-interface {v12, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJq6;

    sget-object v17, LBt0;->M:LBt0$a;

    invoke-virtual/range {v17 .. v17}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v1}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-interface {v12}, LEt0;->v()Llm;

    move-result-object v7

    instance-of v7, v7, Llm;

    if-nez v7, :cond_5

    invoke-static {}, Lyt0;->c()V

    :cond_5
    invoke-interface {v12}, LEt0;->h()V

    invoke-interface {v12}, LEt0;->t()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v12, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_6
    invoke-interface {v12}, LEt0;->e()V

    :goto_3
    invoke-interface {v12}, LEt0;->L()V

    invoke-static {v12}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual/range {v17 .. v17}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v4, v7}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v6, v5, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v6, v8, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v6, v9, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v12}, LEt0;->q()V

    invoke-static {v12}, LMB5;->b(LEt0;)LEt0;

    move-result-object v4

    invoke-static {v4}, LMB5;->a(LEt0;)LMB5;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v4, v12, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x7ab4aae9

    invoke-interface {v12, v1}, LEt0;->F(I)V

    const v1, -0x286e2e7f

    invoke-interface {v12, v1}, LEt0;->F(I)V

    sget-object v23, Lad5;->a:Lad5;

    const v1, 0x59de8536

    invoke-interface {v12, v1}, LEt0;->F(I)V

    invoke-interface {v12, v3}, LEt0;->F(I)V

    invoke-interface {v12}, LEt0;->G()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    const/4 v8, 0x2

    if-ne v1, v3, :cond_7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2, v8, v2}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v1

    invoke-interface {v12, v1}, LEt0;->z(Ljava/lang/Object;)V

    :cond_7
    invoke-interface {v12}, LEt0;->Q()V

    move-object/from16 v24, v1

    check-cast v24, LEX2;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/OTPController;->getOtpLength()I

    move-result v1

    invoke-static {v9, v1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v1

    new-instance v7, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v25

    :goto_4
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    move-object/from16 v1, v25

    check-cast v1, Lkotlin/collections/IntIterator;

    invoke-virtual {v1}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v3

    invoke-static/range {v24 .. v24}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUI$lambda$5$lambda$2(LEX2;)I

    move-result v1

    if-ne v1, v3, :cond_8

    const/4 v5, 0x1

    goto :goto_5

    :cond_8
    move v5, v9

    :goto_5
    const v1, -0x94b5c57

    invoke-interface {v12, v1}, LEt0;->F(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/OTPController;->getOtpLength()I

    move-result v1

    div-int/2addr v1, v8

    if-ne v3, v1, :cond_9

    sget-object v1, LgV2;->b0:LgV2$a;

    const/16 v2, 0xc

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1, v2}, LBB5;->A(LgV2;F)LgV2;

    move-result-object v1

    const/4 v6, 0x6

    invoke-static {v1, v12, v6}, LDN5;->a(LgV2;LEt0;I)V

    goto :goto_6

    :cond_9
    const/4 v6, 0x6

    :goto_6
    invoke-interface {v12}, LEt0;->Q()V

    sget-object v18, LgV2;->b0:LgV2$a;

    const/high16 v19, 0x3f800000    # 1.0f

    const/16 v20, 0x0

    const/16 v21, 0x2

    const/16 v22, 0x0

    move-object/from16 v17, v23

    invoke-static/range {v17 .. v22}, LZc5;->b(LZc5;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v1

    const/4 v2, 0x4

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    const/4 v4, 0x0

    const/4 v9, 0x0

    invoke-static {v1, v2, v4, v8, v9}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v17

    const/16 v18, 0x0

    if-eqz p0, :cond_a

    sget-object v1, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-static {v1, v12, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getComponent-0d7_KjU()J

    move-result-wide v1

    goto :goto_7

    :cond_a
    sget-object v1, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-static {v1, v12, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getPlaceholderText-0d7_KjU()J

    move-result-wide v26

    const v28, 0x3dcccccd    # 0.1f

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0xe

    const/16 v33, 0x0

    invoke-static/range {v26 .. v33}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    :goto_7
    move-wide/from16 v19, v1

    sget-object v1, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-static {v1, v5, v12, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getBorderStrokeWidth(LTM2;ZLEt0;I)F

    move-result v4

    if-eqz v5, :cond_b

    invoke-virtual {v15}, Lcom/stripe/android/uicore/elements/OTPElementColors;->getSelectedBorder-0d7_KjU()J

    move-result-wide v1

    goto :goto_8

    :cond_b
    invoke-static {v1, v12, v2}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/StripeColors;->getComponentBorder-0d7_KjU()J

    move-result-wide v1

    :goto_8
    invoke-static {v4, v1, v2}, LfZ;->a(FJ)LeZ;

    move-result-object v22

    new-instance v4, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;

    move-object v1, v4

    move-object/from16 v2, p1

    move-object v11, v4

    const/16 v21, 0x0

    move-object/from16 v4, v24

    move/from16 v26, v6

    move-object/from16 v6, v16

    move-object/from16 v27, v9

    move-object v9, v7

    move-object v7, v0

    move-object/from16 p2, v0

    move/from16 v28, v8

    const/4 v0, 0x1

    move/from16 v8, p0

    move-object/from16 v34, v9

    const/16 v29, 0x0

    move-object v9, v15

    move/from16 v30, v10

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$2$1$1;-><init>(Lcom/stripe/android/uicore/elements/OTPElement;ILEX2;ZLandroidx/compose/ui/focus/h;LBv1;ZLcom/stripe/android/uicore/elements/OTPElementColors;I)V

    const v1, -0x1886f5a

    invoke-static {v12, v1, v0, v11}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v6

    const/16 v8, 0x6000

    const/4 v9, 0x2

    move-object/from16 v1, v17

    move/from16 v2, v18

    move-wide/from16 v3, v19

    move-object/from16 v5, v22

    move-object v7, v12

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/uicore/elements/SectionUIKt;->SectionCard-T042LqI(LgV2;ZJLeZ;Lkotlin/jvm/functions/Function2;LEt0;II)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v2, v34

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v11, p1

    move-object/from16 v0, p2

    move-object v7, v2

    move/from16 v8, v28

    move/from16 v9, v29

    goto/16 :goto_4

    :cond_c
    invoke-interface {v12}, LEt0;->Q()V

    invoke-interface {v12}, LEt0;->Q()V

    invoke-interface {v12}, LEt0;->Q()V

    invoke-interface {v12}, LEt0;->f()V

    invoke-interface {v12}, LEt0;->Q()V

    invoke-interface {v12}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LQt0;->Y()V

    :cond_d
    invoke-interface {v12}, LEt0;->w()LWm5;

    move-result-object v8

    if-nez v8, :cond_e

    goto :goto_9

    :cond_e
    new-instance v9, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$3;

    move-object v0, v9

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v13

    move-object v4, v15

    move-object/from16 v5, v16

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUI$3;-><init>(ZLcom/stripe/android/uicore/elements/OTPElement;LgV2;Lcom/stripe/android/uicore/elements/OTPElementColors;Landroidx/compose/ui/focus/h;II)V

    invoke-interface {v8, v9}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_9
    return-void
.end method

.method private static final OTPElementUI$lambda$5$lambda$2(LEX2;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final OTPElementUI$lambda$5$lambda$3(LEX2;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Integer;",
            ">;I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final OTPElementUIDisabledPreview(LEt0;I)V
    .locals 8

    const v0, 0x156af5f

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.uicore.elements.OTPElementUIDisabledPreview (OTPElementUI.kt:73)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v0, Lcom/stripe/android/uicore/elements/ComposableSingletons$OTPElementUIKt;->INSTANCE:Lcom/stripe/android/uicore/elements/ComposableSingletons$OTPElementUIKt;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/ComposableSingletons$OTPElementUIKt;->getLambda-2$stripe_ui_core_release()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    const/16 v6, 0xc00

    const/4 v7, 0x7

    move-object v5, p0

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUIDisabledPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUIDisabledPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final OTPElementUIPreview(LEt0;I)V
    .locals 8

    const v0, 0x7d281b7b

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.uicore.elements.OTPElementUIPreview (OTPElementUI.kt:59)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v0, Lcom/stripe/android/uicore/elements/ComposableSingletons$OTPElementUIKt;->INSTANCE:Lcom/stripe/android/uicore/elements/ComposableSingletons$OTPElementUIKt;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/ComposableSingletons$OTPElementUIKt;->getLambda-1$stripe_ui_core_release()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    const/16 v6, 0xc00

    const/4 v7, 0x7

    move-object v5, p0

    invoke-static/range {v1 .. v7}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUIPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPElementUIPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final OTPInputBox(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElement;ILBv1;LgV2;ZLcom/stripe/android/uicore/elements/OTPElementColors;LEt0;I)V
    .locals 45

    move-object/from16 v5, p4

    move/from16 v12, p9

    const v0, 0x73782f28

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.elements.OTPInputBox (OTPElementUI.kt:180)"

    invoke-static {v0, v12, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance v0, LF16;

    if-eqz p1, :cond_1

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Lt26;->a(I)J

    move-result-wide v2

    goto :goto_0

    :cond_1
    sget-object v2, Ls26;->b:Ls26$a;

    invoke-virtual {v2}, Ls26$a;->a()J

    move-result-wide v2

    :goto_0
    move-wide v15, v2

    const/16 v17, 0x0

    const/16 v18, 0x4

    const/16 v19, 0x0

    move-object v13, v0

    move-object/from16 v14, p0

    invoke-direct/range {v13 .. v19}, LF16;-><init>(Ljava/lang/String;JLs26;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v2, Lkw1;->c:Lkw1$a;

    invoke-virtual {v2}, Lkw1$a;->a()LUX5;

    move-result-object v27

    sget-object v2, LJw1;->c:LJw1$a;

    invoke-virtual {v2}, LJw1$a;->e()LJw1;

    move-result-object v24

    const/16 v2, 0x18

    invoke-static {v2}, LN26;->f(I)J

    move-result-wide v22

    sget-object v2, LTM2;->a:LTM2;

    sget v3, LTM2;->b:I

    invoke-static {v2, v1, v3}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/uicore/StripeColors;->getOnComponent-0d7_KjU()J

    move-result-wide v20

    sget-object v4, Lr06;->b:Lr06$a;

    invoke-virtual {v4}, Lr06$a;->a()I

    move-result v4

    new-instance v19, LG26;

    move-object/from16 v18, v19

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const-wide/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-static {v4}, Lr06;->g(I)Lr06;

    move-result-object v38

    const/16 v39, 0x0

    const-wide/16 v40, 0x0

    const/16 v42, 0x0

    const v43, 0x3bfd8

    const/16 v44, 0x0

    invoke-direct/range {v19 .. v44}, LG26;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, LpN5;

    move-object/from16 v26, v4

    invoke-static {v2, v1, v3}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeColors;->getTextCursor-0d7_KjU()J

    move-result-wide v2

    const/4 v6, 0x0

    invoke-direct {v4, v2, v3, v6}, LpN5;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v27, Lbl2;

    move-object/from16 v19, v27

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/uicore/elements/OTPElement;->getController()Lcom/stripe/android/uicore/elements/OTPController;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/OTPController;->getKeyboardType-PjHm6EE$stripe_ui_core_release()I

    move-result v30

    const/16 v31, 0x0

    const/16 v32, 0xb

    invoke-direct/range {v27 .. v33}, Lbl2;-><init>(IZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v34, LZk2;

    move-object/from16 v20, v34

    new-instance v2, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$1;

    invoke-direct {v2, v5}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$1;-><init>(LBv1;)V

    new-instance v3, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$2;

    invoke-direct {v3, v5}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$2;-><init>(LBv1;)V

    const/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x3a

    move-object/from16 v35, v2

    move-object/from16 v37, v3

    invoke-direct/range {v34 .. v42}, LZk2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$3;

    move-object v14, v2

    move-object/from16 v3, p2

    move/from16 v4, p3

    invoke-direct {v2, v3, v4, v5}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$3;-><init>(Lcom/stripe/android/uicore/elements/OTPElement;ILBv1;)V

    const/16 v17, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    new-instance v2, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;

    move-object v6, v2

    move-object/from16 v7, p7

    move-object/from16 v8, p0

    move/from16 v9, p6

    move/from16 v10, p9

    move/from16 v11, p1

    invoke-direct/range {v6 .. v11}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;-><init>(Lcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;ZIZ)V

    const v6, -0x528ebf8f

    const/4 v7, 0x1

    invoke-static {v1, v6, v7, v2}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v27

    shr-int/lit8 v2, v12, 0x9

    and-int/lit16 v6, v2, 0x380

    const/high16 v7, 0x6000000

    or-int/2addr v6, v7

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v2, v6

    sget v6, LZk2;->h:I

    shl-int/lit8 v6, v6, 0x15

    or-int v29, v2, v6

    const/16 v30, 0x6000

    const/16 v31, 0x1e10

    move-object/from16 v15, p5

    move/from16 v16, p6

    move-object/from16 v28, v1

    invoke-static/range {v13 .. v31}, LTE;->b(LF16;Lkotlin/jvm/functions/Function1;LgV2;ZZLG26;Lbl2;LZk2;ZILEu6;Lkotlin/jvm/functions/Function1;LrX2;La30;Lkotlin/jvm/functions/Function3;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v10

    if-nez v10, :cond_3

    goto :goto_1

    :cond_3
    new-instance v11, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;

    move-object v0, v11

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$5;-><init>(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElement;ILBv1;LgV2;ZLcom/stripe/android/uicore/elements/OTPElementColors;I)V

    invoke-interface {v10, v11}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method public static final synthetic access$OTPElementUI$lambda$5$lambda$3(LEX2;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPElementUI$lambda$5$lambda$3(LEX2;I)V

    return-void
.end method

.method public static final synthetic access$OTPInputBox(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElement;ILBv1;LgV2;ZLcom/stripe/android/uicore/elements/OTPElementColors;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPInputBox(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElement;ILBv1;LgV2;ZLcom/stripe/android/uicore/elements/OTPElementColors;LEt0;I)V

    return-void
.end method
