.class public final Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001aE\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0008\u0003\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a9\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0013"
    }
    d2 = {
        "",
        "PhoneNumberCollectionPreview",
        "(LEt0;I)V",
        "",
        "enabled",
        "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "phoneNumberController",
        "",
        "sectionTitle",
        "requestFocusWhenShown",
        "LFY1;",
        "imeAction",
        "PhoneNumberCollectionSection-a7tNSiQ",
        "(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;ZILEt0;II)V",
        "PhoneNumberCollectionSection",
        "controller",
        "PhoneNumberElementUI-rvJmuoc",
        "(ZLcom/stripe/android/uicore/elements/PhoneNumberController;ZILEt0;II)V",
        "PhoneNumberElementUI",
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
        "SMAP\nPhoneNumberElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberElementUI.kt\ncom/stripe/android/uicore/elements/PhoneNumberElementUIKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,146:1\n76#2:147\n25#3:148\n1057#4,6:149\n76#5:155\n76#5:156\n76#5:157\n76#5:158\n76#5:159\n76#5:160\n76#5:161\n76#5:162\n102#5,2:163\n*S KotlinDebug\n*F\n+ 1 PhoneNumberElementUI.kt\ncom/stripe/android/uicore/elements/PhoneNumberElementUIKt\n*L\n76#1:147\n85#1:148\n85#1:149,6\n52#1:155\n77#1:156\n79#1:157\n80#1:158\n81#1:159\n82#1:160\n83#1:161\n86#1:162\n86#1:163,2\n*E\n"
    }
.end annotation


# direct methods
.method private static final PhoneNumberCollectionPreview(LEt0;I)V
    .locals 9

    const v0, 0x7b454513

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

    const-string v2, "com.stripe.android.uicore.elements.PhoneNumberCollectionPreview (PhoneNumberElementUI.kt:35)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 v1, 0x1

    sget-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    const-string v2, "6508989787"

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v2, v4, v3, v4}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController$default(Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v7, 0x46

    const/16 v8, 0x1c

    move-object v6, p0

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberCollectionSection-a7tNSiQ(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;ZILEt0;II)V

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
    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final PhoneNumberCollectionSection-a7tNSiQ(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;ZILEt0;II)V
    .locals 19

    const-string v0, "phoneNumberController"

    move-object/from16 v7, p1

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x2712840b

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v1, p7, 0x4

    const/4 v8, 0x0

    if-eqz v1, :cond_0

    move-object/from16 v16, v8

    goto :goto_0

    :cond_0
    move-object/from16 v16, p2

    :goto_0
    and-int/lit8 v1, p7, 0x8

    const/4 v9, 0x0

    if-eqz v1, :cond_1

    move/from16 v17, v9

    goto :goto_1

    :cond_1
    move/from16 v17, p3

    :goto_1
    and-int/lit8 v1, p7, 0x10

    if-eqz v1, :cond_2

    sget-object v1, LFY1;->b:LFY1$a;

    invoke-virtual {v1}, LFY1$a;->b()I

    move-result v1

    const v2, -0xe001

    and-int v2, p6, v2

    move/from16 v18, v1

    move v10, v2

    goto :goto_2

    :cond_2
    move/from16 v18, p4

    move/from16 v10, p6

    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.uicore.elements.PhoneNumberCollectionSection (PhoneNumberElementUI.kt:44)"

    invoke-static {v0, v10, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getError()LEu1;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v5, 0x38

    const/4 v6, 0x2

    move-object v4, v15

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberCollectionSection_a7tNSiQ$lambda$0(LsP5;)Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object v0

    const v1, -0x14e94a78

    invoke-interface {v15, v1}, LEt0;->F(I)V

    if-nez v0, :cond_5

    :cond_4
    :goto_3
    move-object v9, v8

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/FieldError;->getFormatArgs()[Ljava/lang/Object;

    move-result-object v1

    const v2, -0x14e94a5b

    invoke-interface {v15, v2}, LEt0;->F(I)V

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/FieldError;->getErrorMessage()I

    move-result v2

    array-length v3, v1

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const/16 v3, 0x40

    invoke-static {v2, v1, v15, v3}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v8

    :goto_4
    invoke-interface {v15}, LEt0;->Q()V

    if-nez v8, :cond_4

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/FieldError;->getErrorMessage()I

    move-result v0

    invoke-static {v0, v15, v9}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v8

    goto :goto_3

    :goto_5
    invoke-interface {v15}, LEt0;->Q()V

    const/4 v0, 0x0

    new-instance v8, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$1;

    move-object v1, v8

    move/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, v17

    move/from16 v5, v18

    move v6, v10

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$1;-><init>(ZLcom/stripe/android/uicore/elements/PhoneNumberController;ZII)V

    const v1, 0x151c6a62

    const/4 v2, 0x1

    invoke-static {v15, v1, v2, v8}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v11

    shr-int/lit8 v1, v10, 0x6

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v13, v1, 0xc00

    const/4 v14, 0x4

    move-object/from16 v8, v16

    move-object v10, v0

    move-object v12, v15

    invoke-static/range {v8 .. v14}, Lcom/stripe/android/uicore/elements/SectionUIKt;->Section(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    invoke-interface {v15}, LEt0;->w()LWm5;

    move-result-object v8

    if-nez v8, :cond_8

    goto :goto_6

    :cond_8
    new-instance v9, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;

    move-object v0, v9

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, v16

    move/from16 v4, v17

    move/from16 v5, v18

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberCollectionSection$2;-><init>(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;ZIII)V

    invoke-interface {v8, v9}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void
.end method

.method private static final PhoneNumberCollectionSection_a7tNSiQ$lambda$0(LsP5;)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/FieldError;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/elements/FieldError;

    return-object p0
.end method

.method public static final PhoneNumberElementUI-rvJmuoc(ZLcom/stripe/android/uicore/elements/PhoneNumberController;ZILEt0;II)V
    .locals 40

    move-object/from16 v2, p1

    const-string v0, "controller"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x48f46b7b

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v3, p6, 0x4

    const/4 v9, 0x0

    if-eqz v3, :cond_0

    move/from16 v26, v9

    goto :goto_0

    :cond_0
    move/from16 v26, p2

    :goto_0
    and-int/lit8 v3, p6, 0x8

    if-eqz v3, :cond_1

    sget-object v3, LFY1;->b:LFY1$a;

    invoke-virtual {v3}, LFY1$a;->b()I

    move-result v3

    move/from16 v15, p5

    and-int/lit16 v4, v15, -0x1c01

    move/from16 v27, v3

    move v14, v4

    goto :goto_1

    :cond_1
    move/from16 v15, p5

    move/from16 v27, p3

    move v14, v15

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.uicore.elements.PhoneNumberElementUI (PhoneNumberElementUI.kt:69)"

    invoke-static {v0, v14, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Lhu0;->h()LU94;

    move-result-object v0

    invoke-interface {v1, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBv1;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryDropdownController()Lcom/stripe/android/uicore/elements/DropdownFieldController;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getSelectedIndex()LtP5;

    move-result-object v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v7, 0x38

    const/4 v8, 0x2

    move-object v6, v1

    invoke-static/range {v3 .. v8}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v3

    invoke-static {v3}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI_rvJmuoc$lambda$3(LsP5;)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->onSelectedCountryIndex(I)Lkotlin/Unit;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getFieldValue()LEu1;

    move-result-object v3

    const-string v4, ""

    invoke-static/range {v3 .. v8}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getError()LEu1;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static/range {v3 .. v8}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getLabel()LEu1;

    move-result-object v3

    sget v4, Lcom/stripe/android/uicore/R$string;->address_label_phone_number:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v7, 0x8

    invoke-static/range {v3 .. v8}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getPlaceholder()LEu1;

    move-result-object v3

    const-string v4, ""

    const/16 v7, 0x38

    invoke-static/range {v3 .. v8}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getVisualTransformation()LEu1;

    move-result-object v3

    sget-object v4, LEu6;->a:LEu6$a;

    invoke-virtual {v4}, LEu6$a;->a()LEu6;

    move-result-object v4

    invoke-static/range {v3 .. v8}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v16

    invoke-static {v11}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI_rvJmuoc$lambda$5(LsP5;)Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object v3

    const/4 v11, 0x1

    if-eqz v3, :cond_3

    move v3, v11

    goto :goto_2

    :cond_3
    move v3, v9

    :goto_2
    invoke-static {v3, v1, v9, v9}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextFieldColors(ZLEt0;II)Ld16;

    move-result-object v28

    const v3, -0x1d58f75c

    invoke-interface {v1, v3}, LEt0;->F(I)V

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_4

    new-instance v3, Landroidx/compose/ui/focus/h;

    invoke-direct {v3}, Landroidx/compose/ui/focus/h;-><init>()V

    invoke-interface {v1, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {v1}, LEt0;->Q()V

    move-object v8, v3

    check-cast v8, Landroidx/compose/ui/focus/h;

    new-array v3, v9, [Ljava/lang/Object;

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$hasFocus$2;->INSTANCE:Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$hasFocus$2;

    const/16 v9, 0xc08

    const/16 v17, 0x6

    move-object v7, v1

    move-object/from16 v29, v8

    move v8, v9

    move/from16 v9, v17

    invoke-static/range {v3 .. v9}, LQv4;->b([Ljava/lang/Object;LRi5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;II)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, LEX2;

    invoke-static {v10}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI_rvJmuoc$lambda$4(LsP5;)Ljava/lang/String;

    move-result-object v3

    new-instance v6, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$1;

    move-object v4, v6

    invoke-direct {v6, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$1;-><init>(Ljava/lang/Object;)V

    sget-object v6, LgV2;->b0:LgV2$a;

    const/4 v7, 0x0

    const/4 v10, 0x0

    invoke-static {v6, v7, v11, v10}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v6

    move-object/from16 v9, v29

    invoke-static {v6, v9}, Landroidx/compose/ui/focus/i;->a(LgV2;Landroidx/compose/ui/focus/h;)LgV2;

    move-result-object v6

    new-instance v7, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$2;

    invoke-direct {v7, v2, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$2;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberController;LEX2;)V

    invoke-static {v6, v7}, Landroidx/compose/ui/focus/b;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    new-instance v6, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$3;

    invoke-direct {v6, v2, v12}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$3;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberController;LsP5;)V

    const v12, -0x4334a39f

    invoke-static {v1, v12, v11, v6}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v6

    move-object v12, v9

    move-object v9, v6

    new-instance v6, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$4;

    invoke-direct {v6, v13}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$4;-><init>(LsP5;)V

    const v13, -0x3235cf80

    invoke-static {v1, v13, v11, v6}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v6

    move-object v13, v10

    move-object v10, v6

    new-instance v6, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$5;

    move/from16 v7, p0

    invoke-direct {v6, v2, v7, v14}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$5;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberController;ZI)V

    const v13, -0x2136fb61

    invoke-static {v1, v13, v11, v6}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v11

    const/4 v6, 0x0

    move-object v13, v12

    move-object v12, v6

    const/4 v6, 0x0

    move-object/from16 v30, v13

    move v13, v6

    invoke-static/range {v16 .. v16}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI_rvJmuoc$lambda$8(LsP5;)LEu6;

    move-result-object v6

    move/from16 v23, v14

    move-object v14, v6

    new-instance v16, Lbl2;

    move-object/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    sget-object v6, Lcl2;->b:Lcl2$a;

    invoke-virtual {v6}, Lcl2$a;->g()I

    move-result v19

    const/16 v21, 0x3

    const/16 v22, 0x0

    move/from16 v20, v27

    invoke-direct/range {v16 .. v22}, Lbl2;-><init>(IZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v31, LZk2;

    move-object/from16 v16, v31

    new-instance v6, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$6;

    invoke-direct {v6, v0}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$6;-><init>(LBv1;)V

    const/16 v33, 0x0

    new-instance v8, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$7;

    invoke-direct {v8, v0}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$7;-><init>(LBv1;)V

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x3a

    const/16 v39, 0x0

    move-object/from16 v32, v6

    move-object/from16 v34, v8

    invoke-direct/range {v31 .. v39}, LZk2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    shl-int/lit8 v0, v23, 0x9

    and-int/lit16 v0, v0, 0x1c00

    const/high16 v6, 0x6d80000

    or-int v23, v0, v6

    sget v0, LZk2;->h:I

    shl-int/lit8 v0, v0, 0x9

    or-int/lit16 v0, v0, 0x6000

    move/from16 v24, v0

    const v25, 0x38630

    move/from16 v6, p0

    move-object/from16 v21, v28

    move-object/from16 v22, v1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v25}, Lq16;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;LgV2;ZZLG26;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLEu6;Lbl2;LZk2;ZILrX2;Lhy5;Ld16;LEt0;III)V

    if-eqz v26, :cond_5

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$8;

    move-object/from16 v4, v30

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$8;-><init>(Landroidx/compose/ui/focus/h;Lkotlin/coroutines/Continuation;)V

    const/16 v4, 0x46

    invoke-static {v0, v3, v1, v4}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    :cond_5
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v7

    if-nez v7, :cond_7

    goto :goto_3

    :cond_7
    new-instance v8, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$9;

    move-object v0, v8

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, v26

    move/from16 v4, v27

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt$PhoneNumberElementUI$9;-><init>(ZLcom/stripe/android/uicore/elements/PhoneNumberController;ZIII)V

    invoke-interface {v7, v8}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_3
    return-void
.end method

.method private static final PhoneNumberElementUI_rvJmuoc$lambda$10(LEX2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final PhoneNumberElementUI_rvJmuoc$lambda$11(LEX2;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final PhoneNumberElementUI_rvJmuoc$lambda$3(LsP5;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
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

.method private static final PhoneNumberElementUI_rvJmuoc$lambda$4(LsP5;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final PhoneNumberElementUI_rvJmuoc$lambda$5(LsP5;)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/FieldError;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/elements/FieldError;

    return-object p0
.end method

.method private static final PhoneNumberElementUI_rvJmuoc$lambda$6(LsP5;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
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

.method private static final PhoneNumberElementUI_rvJmuoc$lambda$7(LsP5;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final PhoneNumberElementUI_rvJmuoc$lambda$8(LsP5;)LEu6;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "LEu6;",
            ">;)",
            "LEu6;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LEu6;

    return-object p0
.end method

.method public static final synthetic access$PhoneNumberCollectionPreview(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberCollectionPreview(LEt0;I)V

    return-void
.end method

.method public static final synthetic access$PhoneNumberElementUI_rvJmuoc$lambda$10(LEX2;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI_rvJmuoc$lambda$10(LEX2;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$PhoneNumberElementUI_rvJmuoc$lambda$11(LEX2;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI_rvJmuoc$lambda$11(LEX2;Z)V

    return-void
.end method

.method public static final synthetic access$PhoneNumberElementUI_rvJmuoc$lambda$6(LsP5;)I
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI_rvJmuoc$lambda$6(LsP5;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$PhoneNumberElementUI_rvJmuoc$lambda$7(LsP5;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI_rvJmuoc$lambda$7(LsP5;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
