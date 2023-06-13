.class public final Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a]\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00000\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0007H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0002\u001aU\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00132\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00000\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0007H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\'\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00172\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0019H\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001au\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00132\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00000\t2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 \u001aG\u0010#\u001a\u00020\u00002\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00132\u0006\u0010\"\u001a\u00020!2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00000\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0007H\u0003\u00a2\u0006\u0004\u0008#\u0010$\u001a\u0019\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008%\u0010&\u001a\u0019\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008\'\u0010&\u001a\u0019\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008(\u0010&\u001a\u0019\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008)\u0010&\u001a\u000f\u0010*\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008*\u0010\u0002\u001a\u000f\u0010+\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008+\u0010\u0002\u001a\u0019\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008,\u0010&\u00a8\u0006-"
    }
    d2 = {
        "",
        "ConsentScreen",
        "(LEt0;I)V",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState;",
        "state",
        "LGU2;",
        "bottomSheetState",
        "Lkotlin/Function0;",
        "onContinueClick",
        "Lkotlin/Function1;",
        "",
        "onClickableTextClick",
        "onConfirmModalClick",
        "onCloseClick",
        "ConsentContent",
        "(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "ConsentLoadingContent",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
        "payload",
        "Ldp;",
        "acceptConsent",
        "ConsentMainContent",
        "(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "LgV2;",
        "modifier",
        "",
        "logos",
        "ConsentLogoHeader",
        "(LgV2;Ljava/util/List;LEt0;II)V",
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;",
        "bottomSheetMode",
        "LoadedContent",
        "(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;LGU2;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;LEt0;I)V",
        "Lcom/stripe/android/financialconnections/model/ConsentPane;",
        "consent",
        "ConsentFooter",
        "(Ldp;Lcom/stripe/android/financialconnections/model/ConsentPane;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "ContentPreview",
        "(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LEt0;II)V",
        "ContentWithNoLogosPreview",
        "ContentWithPlatformLogosPreview",
        "ContentWithConnectedAccountLogosPreview",
        "ContentRequestedDataPreview",
        "ContentLegalDetailsPreview",
        "ContentManualEntryPlusMicrodeposits",
        "financial-connections_release"
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
        "SMAP\nConsentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ConsentScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,558:1\n53#2:559\n54#2,15:561\n69#2,8:582\n79#2:593\n80#2,5:596\n76#3:560\n76#3:601\n76#3:623\n76#3:676\n76#3:706\n76#3:739\n83#4,3:576\n50#4:594\n49#4:595\n25#4:606\n460#4,13:635\n473#4,3:649\n36#4:654\n36#4:661\n460#4,13:688\n473#4,3:709\n460#4,13:751\n473#4,3:768\n1057#5,3:579\n1060#5,3:590\n1057#5,3:607\n1060#5,3:613\n1057#5,6:655\n1057#5,3:662\n1060#5,3:669\n1057#5,6:715\n1057#5,3:721\n1060#5,3:725\n474#6,4:602\n478#6,2:610\n482#6:616\n474#7:612\n68#8,5:617\n73#8:648\n77#8:653\n75#9:622\n76#9,11:624\n89#9:652\n75#9:675\n76#9,11:677\n89#9:712\n75#9:738\n76#9,11:740\n89#9:771\n1549#10:665\n1620#10,3:666\n1864#10,2:704\n1866#10:708\n154#11:672\n154#11:702\n154#11:703\n154#11:707\n154#11:714\n154#11:728\n154#11:729\n154#11:730\n154#11:731\n154#11:765\n154#11:766\n154#11:767\n79#12,2:673\n81#12:701\n85#12:713\n1#13:724\n74#14,6:732\n80#14:764\n84#14:772\n*S KotlinDebug\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ConsentScreenKt\n*L\n82#1:559\n82#1:561,15\n82#1:582,8\n82#1:593\n82#1:596,5\n82#1:560\n86#1:601\n148#1:623\n256#1:676\n294#1:706\n371#1:739\n82#1:576,3\n82#1:594\n82#1:595\n87#1:606\n148#1:635,13\n148#1:649,3\n165#1:654\n168#1:661\n256#1:688,13\n256#1:709,3\n371#1:751,13\n371#1:768,3\n82#1:579,3\n82#1:590,3\n87#1:607,3\n87#1:613,3\n165#1:655,6\n168#1:662,3\n168#1:669,3\n365#1:715,6\n368#1:721,3\n368#1:725,3\n87#1:602,4\n87#1:610,2\n87#1:616\n87#1:612\n148#1:617,5\n148#1:648\n148#1:653\n148#1:622\n148#1:624,11\n148#1:652\n256#1:675\n256#1:677,11\n256#1:712\n371#1:738\n371#1:740,11\n371#1:771\n169#1:665\n169#1:666,3\n276#1:704,2\n276#1:708\n259#1:672\n271#1:702\n272#1:703\n298#1:707\n327#1:714\n373#1:728\n374#1:729\n375#1:730\n376#1:731\n395#1:765\n405#1:766\n423#1:767\n256#1:673,2\n256#1:701\n256#1:713\n371#1:732,6\n371#1:764\n371#1:772\n*E\n"
    }
.end annotation


# direct methods
.method private static final ConsentContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState;",
            "LGU2;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v7, p7

    const v0, 0x148305ef

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.consent.ConsentContent (ConsentScreen.kt:116)"

    invoke-static {v0, v7, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->getConsent()Ldp;

    move-result-object v0

    sget-object v2, LMd6;->e:LMd6;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    instance-of v2, v0, LAt2;

    :goto_0
    if-eqz v2, :cond_2

    const v0, 0x499e000d

    invoke-interface {v1, v0}, LEt0;->F(I)V

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->ConsentLoadingContent(LEt0;I)V

    invoke-interface {v1}, LEt0;->Q()V

    goto :goto_1

    :cond_2
    instance-of v2, v0, LwT5;

    if-eqz v2, :cond_3

    const v2, 0x499e003b

    invoke-interface {v1, v2}, LEt0;->F(I)V

    check-cast v0, LwT5;

    invoke-virtual {v0}, LwT5;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->getCurrentBottomSheet()Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->getAcceptConsent()Ldp;

    move-result-object v10

    and-int/lit8 v0, v7, 0x70

    or-int/lit16 v0, v0, 0x208

    shl-int/lit8 v2, v7, 0x3

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v0, v2

    const v2, 0xe000

    shr-int/lit8 v3, v7, 0x3

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    shl-int/lit8 v2, v7, 0x6

    const/high16 v3, 0x70000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x380000

    and-int/2addr v2, v3

    or-int v17, v0, v2

    move-object/from16 v9, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p5

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    move-object/from16 v16, v1

    invoke-static/range {v8 .. v17}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->LoadedContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;LGU2;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;LEt0;I)V

    invoke-interface {v1}, LEt0;->Q()V

    goto :goto_1

    :cond_3
    instance-of v2, v0, LCj1;

    if-eqz v2, :cond_4

    const v2, 0x499e01ea    # 1294397.2f

    invoke-interface {v1, v2}, LEt0;->F(I)V

    check-cast v0, LCj1;

    invoke-virtual {v0}, LCj1;->b()Ljava/lang/Throwable;

    move-result-object v0

    sget-object v2, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentContent$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentContent$1;

    const/16 v3, 0x38

    invoke-static {v0, v2, v1, v3}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->UnclassifiedErrorContent(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-interface {v1}, LEt0;->Q()V

    goto :goto_1

    :cond_4
    const v0, 0x499e023b

    invoke-interface {v1, v0}, LEt0;->F(I)V

    invoke-interface {v1}, LEt0;->Q()V

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v8

    if-nez v8, :cond_6

    goto :goto_2

    :cond_6
    new-instance v9, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentContent$2;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentContent$2;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v8, v9}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final ConsentFooter(Ldp;Lcom/stripe/android/financialconnections/model/ConsentPane;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 72
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/ConsentPane;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v5, p5

    const v0, -0x88ea808

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.consent.ConsentFooter (ConsentScreen.kt:358)"

    invoke-static {v0, v5, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getAboveCta()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_2

    :cond_1
    new-instance v2, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getAboveCta()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/financialconnections/ui/sdui/ServerDrivenUiKt;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    invoke-interface {v1, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    move-object v6, v2

    check-cast v6, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getBelowCta()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_3

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_5

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getBelowCta()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v0, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getBelowCta()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/stripe/android/financialconnections/ui/sdui/ServerDrivenUiKt;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    move-object v2, v0

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    move-object v0, v2

    check-cast v0, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    sget-object v2, LgV2;->b0:LgV2$a;

    const/16 v4, 0x18

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v7

    invoke-static {v4}, Lk61;->g(F)F

    move-result v8

    const/16 v9, 0x10

    int-to-float v15, v9

    invoke-static {v15}, Lk61;->g(F)F

    move-result v9

    invoke-static {v4}, Lk61;->g(F)F

    move-result v10

    invoke-static {v2, v7, v9, v8, v10}, LND3;->l(LgV2;FFFF)LgV2;

    move-result-object v7

    const v8, -0x1cd0f17e

    invoke-interface {v1, v8}, LEt0;->F(I)V

    sget-object v8, Llo;->a:Llo;

    invoke-virtual {v8}, Llo;->g()Llo$l;

    move-result-object v8

    sget-object v9, LK9;->a:LK9$a;

    invoke-virtual {v9}, LK9$a;->j()LK9$b;

    move-result-object v9

    const/4 v14, 0x0

    invoke-static {v8, v9, v1, v14}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v8

    const v9, -0x4ee9b9da

    invoke-interface {v1, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v9

    invoke-interface {v1, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v10

    invoke-interface {v1, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v11

    invoke-interface {v1, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LJq6;

    sget-object v12, LBt0;->M:LBt0$a;

    invoke-virtual {v12}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    invoke-static {v7}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v7

    invoke-interface {v1}, LEt0;->v()Llm;

    move-result-object v3

    instance-of v3, v3, Llm;

    if-nez v3, :cond_6

    invoke-static {}, Lyt0;->c()V

    :cond_6
    invoke-interface {v1}, LEt0;->h()V

    invoke-interface {v1}, LEt0;->t()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1, v13}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_7
    invoke-interface {v1}, LEt0;->e()V

    :goto_1
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v3

    invoke-virtual {v12}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    invoke-static {v3, v8, v13}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v3, v9, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v3, v10, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v3, v11, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v3, v1, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v3, 0x7ab4aae9

    invoke-interface {v1, v3}, LEt0;->F(I)V

    const v3, -0x455f09d5

    invoke-interface {v1, v3}, LEt0;->F(I)V

    sget-object v3, LQm0;->a:LQm0;

    const v3, -0x26e29312

    invoke-interface {v1, v3}, LEt0;->F(I)V

    sget-object v3, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v13, 0x6

    invoke-virtual {v3, v1, v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getDetail()LG26;

    move-result-object v16

    sget-object v42, Lr06;->b:Lr06$a;

    invoke-virtual/range {v42 .. v42}, Lr06$a;->a()I

    move-result v7

    invoke-virtual {v3, v1, v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v17

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-static {v7}, Lr06;->g(I)Lr06;

    move-result-object v35

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const v40, 0x3bffe

    const/16 v41, 0x0

    invoke-static/range {v16 .. v41}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v12, 0x2

    new-array v7, v12, [Lkotlin/Pair;

    sget-object v11, Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;->CLICKABLE:Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;

    invoke-virtual {v3, v1, v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getDetailEmphasized()LG26;

    move-result-object v10

    invoke-virtual {v10}, LG26;->L()LGN5;

    move-result-object v16

    invoke-virtual {v3, v1, v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextBrand-0d7_KjU()J

    move-result-wide v17

    const/16 v35, 0x3ffe

    invoke-static/range {v16 .. v36}, LGN5;->b(LGN5;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILjava/lang/Object;)LGN5;

    move-result-object v10

    invoke-static {v11, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v7, v14

    sget-object v10, Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;->BOLD:Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;

    invoke-virtual {v3, v1, v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getDetailEmphasized()LG26;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, LG26;->L()LGN5;

    move-result-object v17

    invoke-virtual {v3, v1, v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v18

    const-wide/16 v20, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x3ffe

    const/16 v37, 0x0

    invoke-static/range {v17 .. v37}, LGN5;->b(LGN5;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILjava/lang/Object;)LGN5;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/4 v13, 0x1

    aput-object v12, v7, v13

    invoke-static {v7}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v12

    shr-int/lit8 v7, v5, 0x3

    and-int/lit8 v7, v7, 0x70

    or-int/lit8 v18, v7, 0x8

    const/16 v19, 0x8

    move/from16 v43, v7

    move-object/from16 v7, p2

    move-object/from16 v44, v10

    move-object v10, v12

    move-object v12, v11

    move-object v11, v1

    move-object/from16 v45, v12

    move/from16 v12, v18

    move-object/from16 v16, v3

    const/4 v3, 0x6

    move/from16 v13, v19

    invoke-static/range {v6 .. v13}, Lcom/stripe/android/financialconnections/ui/components/TextKt;->AnnotatedText(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;LG26;LgV2;Ljava/util/Map;LEt0;II)V

    invoke-static {v15}, Lk61;->g(F)F

    move-result v6

    invoke-static {v2, v6}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v6

    invoke-static {v6, v1, v3}, LDN5;->a(LgV2;LEt0;I)V

    move-object/from16 v13, p0

    instance-of v11, v13, LAt2;

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v2, v12, v7, v6}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v8

    const/4 v10, 0x0

    const/16 v18, 0x0

    new-instance v6, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentFooter$1$1;

    move-object/from16 v3, p1

    invoke-direct {v6, v3}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentFooter$1$1;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;)V

    const v12, 0x69f2b407

    invoke-static {v1, v12, v7, v6}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v12

    shr-int/lit8 v6, v5, 0x9

    and-int/lit8 v6, v6, 0xe

    const v7, 0x180030

    or-int v21, v6, v7

    const/16 v22, 0x1c

    move-object/from16 v6, p3

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move/from16 v10, v18

    move-object v13, v1

    move/from16 v18, v14

    move/from16 v14, v21

    move/from16 v20, v15

    move/from16 v15, v22

    invoke-static/range {v6 .. v15}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V

    if-eqz v0, :cond_8

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    invoke-static {v2, v4}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v4

    const/4 v6, 0x6

    invoke-static {v4, v1, v6}, LDN5;->a(LgV2;LEt0;I)V

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v2, v4, v8, v7}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v9

    move-object/from16 v4, v16

    invoke-virtual {v4, v1, v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getDetail()LG26;

    move-result-object v46

    invoke-virtual/range {v42 .. v42}, Lr06$a;->a()I

    move-result v7

    invoke-virtual {v4, v1, v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v8

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v47

    const-wide/16 v49, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const-wide/16 v56, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const-wide/16 v61, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    invoke-static {v7}, Lr06;->g(I)Lr06;

    move-result-object v65

    const/16 v66, 0x0

    const-wide/16 v67, 0x0

    const/16 v69, 0x0

    const v70, 0x3bffe

    const/16 v71, 0x0

    invoke-static/range {v46 .. v71}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v8

    const/4 v6, 0x2

    new-array v6, v6, [Lkotlin/Pair;

    const/4 v7, 0x6

    invoke-virtual {v4, v1, v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getDetailEmphasized()LG26;

    move-result-object v10

    invoke-virtual {v10}, LG26;->L()LGN5;

    move-result-object v21

    invoke-virtual {v4, v1, v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextBrand-0d7_KjU()J

    move-result-wide v22

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const-wide/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x3ffe

    const/16 v41, 0x0

    invoke-static/range {v21 .. v41}, LGN5;->b(LGN5;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILjava/lang/Object;)LGN5;

    move-result-object v7

    move-object/from16 v10, v45

    invoke-static {v10, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v6, v18

    const/4 v7, 0x6

    invoke-virtual {v4, v1, v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getDetailEmphasized()LG26;

    move-result-object v10

    invoke-virtual {v10}, LG26;->L()LGN5;

    move-result-object v21

    invoke-virtual {v4, v1, v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v22

    invoke-static/range {v21 .. v41}, LGN5;->b(LGN5;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILjava/lang/Object;)LGN5;

    move-result-object v4

    move-object/from16 v7, v44

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v7, 0x1

    aput-object v4, v6, v7

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    move/from16 v4, v43

    or-int/lit16 v12, v4, 0xc08

    const/4 v13, 0x0

    move-object v6, v0

    move-object/from16 v7, p2

    move-object v11, v1

    invoke-static/range {v6 .. v13}, Lcom/stripe/android/financialconnections/ui/components/TextKt;->AnnotatedText(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;LG26;LgV2;Ljava/util/Map;LEt0;II)V

    invoke-static/range {v20 .. v20}, Lk61;->g(F)F

    move-result v0

    invoke-static {v2, v0}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v0

    const/4 v2, 0x6

    invoke-static {v0, v1, v2}, LDN5;->a(LgV2;LEt0;I)V

    :cond_8
    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_a

    goto :goto_2

    :cond_a
    new-instance v7, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentFooter$2;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentFooter$2;-><init>(Ldp;Lcom/stripe/android/financialconnections/model/ConsentPane;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final ConsentLoadingContent(LEt0;I)V
    .locals 9

    const v0, 0x14c228cd

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.consent.ConsentLoadingContent (ConsentScreen.kt:146)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, LgV2;->b0:LgV2$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    sget-object v1, LK9;->a:LK9$a;

    invoke-virtual {v1}, LK9$a;->e()LK9;

    move-result-object v1

    const v2, 0x2bb5b5d7

    invoke-interface {p0, v2}, LEt0;->F(I)V

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-static {v1, v3, p0, v2}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {p0, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {p0, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {p0, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {p0, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {p0}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {p0}, LEt0;->h()V

    invoke-interface {p0}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {p0, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface {p0}, LEt0;->e()V

    :goto_1
    invoke-interface {p0}, LEt0;->L()V

    invoke-static {p0}, Lbf6;->a(LEt0;)LEt0;

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

    invoke-interface {p0}, LEt0;->q()V

    invoke-static {p0}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, p0, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {p0, v0}, LEt0;->F(I)V

    const v0, -0x7f65a980

    invoke-interface {p0, v0}, LEt0;->F(I)V

    sget-object v0, Lf10;->a:Lf10;

    const v0, 0x30d23e87

    invoke-interface {p0, v0}, LEt0;->F(I)V

    invoke-interface {p0}, LEt0;->Q()V

    invoke-interface {p0}, LEt0;->Q()V

    invoke-interface {p0}, LEt0;->Q()V

    invoke-interface {p0}, LEt0;->f()V

    invoke-interface {p0}, LEt0;->Q()V

    invoke-interface {p0}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_2
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_6

    goto :goto_3

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentLoadingContent$2;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentLoadingContent$2;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_3
    return-void
.end method

.method private static final ConsentLogoHeader(LgV2;Ljava/util/List;LEt0;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    const v3, -0x421a3903

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v4, v2, 0x1

    if-eqz v4, :cond_0

    sget-object v4, LgV2;->b0:LgV2$a;

    move-object v14, v4

    goto :goto_0

    :cond_0
    move-object/from16 v14, p0

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.financialconnections.features.consent.ConsentLogoHeader (ConsentScreen.kt:251)"

    invoke-static {v3, v1, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1
    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->h()LK9$c;

    move-result-object v3

    sget-object v4, Llo;->a:Llo;

    const/16 v5, 0x10

    int-to-float v6, v5

    invoke-static {v6}, Lk61;->g(F)F

    move-result v6

    invoke-virtual {v4, v6}, Llo;->n(F)Llo$e;

    move-result-object v4

    and-int/lit8 v6, v1, 0xe

    or-int/lit16 v6, v6, 0x1b0

    const v7, 0x2952b718

    invoke-interface {v15, v7}, LEt0;->F(I)V

    shr-int/lit8 v7, v6, 0x3

    and-int/lit8 v8, v7, 0xe

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v7, v8

    invoke-static {v4, v3, v15, v7}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v3

    shl-int/lit8 v4, v6, 0x3

    and-int/lit8 v4, v4, 0x70

    const v7, -0x4ee9b9da

    invoke-interface {v15, v7}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v7

    invoke-interface {v15, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v8

    invoke-interface {v15, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v9

    invoke-interface {v15, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJq6;

    sget-object v10, LBt0;->M:LBt0$a;

    invoke-virtual {v10}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    invoke-static {v14}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v12

    shl-int/lit8 v4, v4, 0x9

    and-int/lit16 v4, v4, 0x1c00

    or-int/lit8 v4, v4, 0x6

    invoke-interface {v15}, LEt0;->v()Llm;

    move-result-object v13

    instance-of v13, v13, Llm;

    if-nez v13, :cond_2

    invoke-static {}, Lyt0;->c()V

    :cond_2
    invoke-interface {v15}, LEt0;->h()V

    invoke-interface {v15}, LEt0;->t()Z

    move-result v13

    if-eqz v13, :cond_3

    invoke-interface {v15, v11}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_3
    invoke-interface {v15}, LEt0;->e()V

    :goto_1
    invoke-interface {v15}, LEt0;->L()V

    invoke-static {v15}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v11

    invoke-virtual {v10}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    invoke-static {v11, v3, v13}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v11, v7, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v11, v8, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v10}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v11, v9, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15}, LEt0;->q()V

    invoke-static {v15}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    shr-int/lit8 v7, v4, 0x3

    and-int/lit8 v7, v7, 0x70

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v12, v3, v15, v7}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v3, 0x7ab4aae9

    invoke-interface {v15, v3}, LEt0;->F(I)V

    shr-int/lit8 v3, v4, 0x9

    and-int/lit8 v3, v3, 0xe

    const v4, -0x286e2e7f

    invoke-interface {v15, v4}, LEt0;->F(I)V

    and-int/lit8 v3, v3, 0xb

    const/4 v4, 0x2

    if-ne v3, v4, :cond_5

    invoke-interface {v15}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v15}, LEt0;->k()V

    move-object/from16 v22, v14

    move-object v3, v15

    goto/16 :goto_8

    :cond_5
    :goto_2
    sget-object v3, Lad5;->a:Lad5;

    shr-int/lit8 v3, v6, 0x6

    and-int/lit8 v3, v3, 0x70

    or-int/lit8 v3, v3, 0x6

    const v6, -0x2697499f

    invoke-interface {v15, v6}, LEt0;->F(I)V

    and-int/lit8 v3, v3, 0x51

    if-ne v3, v5, :cond_7

    invoke-interface {v15}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {v15}, LEt0;->k()V

    :goto_3
    move-object/from16 v22, v14

    move-object v3, v15

    goto/16 :goto_7

    :cond_7
    :goto_4
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v13, 0x0

    const/4 v12, 0x3

    if-eq v3, v4, :cond_8

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    if-eq v3, v12, :cond_8

    const v3, 0x545f4cef

    invoke-interface {v15, v3}, LEt0;->F(I)V

    sget v3, Lcom/stripe/android/financialconnections/R$drawable;->stripe_logo:I

    invoke-static {v3, v15, v13}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v4

    const/4 v5, 0x0

    sget-object v3, LgV2;->b0:LgV2$a;

    const/16 v6, 0x3c

    int-to-float v6, v6

    invoke-static {v6}, Lk61;->g(F)F

    move-result v6

    invoke-static {v3, v6}, LBB5;->A(LgV2;F)LgV2;

    move-result-object v3

    const/16 v6, 0x19

    int-to-float v6, v6

    invoke-static {v6}, Lk61;->g(F)F

    move-result v6

    invoke-static {v3, v6}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v3

    invoke-static {}, Lcc5;->e()Lbc5;

    move-result-object v6

    invoke-static {v3, v6}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v12, 0x38

    const/16 v13, 0x78

    move-object v11, v15

    invoke-static/range {v4 .. v13}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    invoke-interface {v15}, LEt0;->Q()V

    goto :goto_3

    :cond_8
    const v3, 0x545f4e1b

    invoke-interface {v15, v3}, LEt0;->F(I)V

    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v11, v13

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v16, v11, 0x1

    if-gez v11, :cond_9

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_9
    check-cast v4, Ljava/lang/String;

    sget v5, Lcom/stripe/android/financialconnections/R$drawable;->stripe_ic_brandicon_institution_circle:I

    invoke-static {v5, v15, v13}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v10

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalImageLoader()LU94;

    move-result-object v5

    invoke-interface {v15, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/uicore/image/StripeImageLoader;

    sget-object v6, LBA0;->a:LBA0$a;

    invoke-virtual {v6}, LBA0$a;->a()LBA0;

    move-result-object v8

    sget-object v6, LgV2;->b0:LgV2$a;

    const/16 v7, 0x28

    int-to-float v7, v7

    invoke-static {v7}, Lk61;->g(F)F

    move-result v7

    invoke-static {v6, v7}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v6

    invoke-static {}, Lcc5;->e()Lbc5;

    move-result-object v7

    invoke-static {v6, v7}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v7

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/16 v17, 0x0

    sget-object v18, Lcom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt;

    invoke-virtual/range {v18 .. v18}, Lcom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt;->getLambda-1$financial_connections_release()Lkotlin/jvm/functions/Function3;

    move-result-object v18

    sget v19, Lcom/stripe/android/uicore/image/StripeImageLoader;->$stable:I

    shl-int/lit8 v19, v19, 0x3

    const v20, 0x6206180

    or-int v19, v19, v20

    const/16 v20, 0xa0

    move/from16 v21, v11

    move-object/from16 v11, v17

    move/from16 v17, v12

    move-object/from16 v12, v18

    move-object v13, v15

    move-object/from16 v22, v14

    move/from16 v14, v19

    move-object/from16 p0, v3

    move-object v3, v15

    move/from16 v15, v20

    invoke-static/range {v4 .. v15}, Lcom/stripe/android/uicore/image/StripeImageKt;->StripeImage(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static/range {p1 .. p1}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v4

    move/from16 v13, v21

    if-eq v13, v4, :cond_a

    sget v4, Lcom/stripe/android/financialconnections/R$drawable;->stripe_consent_logo_ellipsis:I

    const/4 v14, 0x0

    invoke-static {v4, v3, v14}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v12, 0x38

    const/16 v13, 0x7c

    move-object v11, v3

    invoke-static/range {v4 .. v13}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    goto :goto_6

    :cond_a
    const/4 v14, 0x0

    :goto_6
    move-object v15, v3

    move v13, v14

    move/from16 v11, v16

    move/from16 v12, v17

    move-object/from16 v14, v22

    move-object/from16 v3, p0

    goto/16 :goto_5

    :cond_b
    move-object/from16 v22, v14

    move-object v3, v15

    invoke-interface {v3}, LEt0;->Q()V

    :goto_7
    invoke-interface {v3}, LEt0;->Q()V

    :goto_8
    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->f()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-interface {v3}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-static {}, LQt0;->Y()V

    :cond_c
    invoke-interface {v3}, LEt0;->w()LWm5;

    move-result-object v3

    if-nez v3, :cond_d

    goto :goto_9

    :cond_d
    new-instance v4, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentLogoHeader$2;

    move-object/from16 v5, v22

    invoke-direct {v4, v5, v0, v1, v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentLogoHeader$2;-><init>(LgV2;Ljava/util/List;II)V

    invoke-interface {v3, v4}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_9
    return-void
.end method

.method private static final ConsentMainContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
            "Ldp<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v9, p6

    const v0, -0x774fedc3

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v10

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.consent.ConsentMainContent (ConsentScreen.kt:156)"

    invoke-static {v0, v9, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    const/4 v11, 0x1

    invoke-static {v0, v10, v0, v11}, LUp5;->a(ILEt0;II)LXp5;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getTitle()Ljava/lang/String;

    move-result-object v0

    const v2, 0x44faf204

    invoke-interface {v10, v2}, LEt0;->F(I)V

    invoke-interface {v10, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v10}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_1

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_2

    :cond_1
    new-instance v3, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/financialconnections/ui/sdui/ServerDrivenUiKt;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    invoke-interface {v10, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    invoke-interface {v10}, LEt0;->Q()V

    move-object v7, v3

    check-cast v7, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getBody()Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/ConsentPaneBody;->getBullets()Ljava/util/List;

    move-result-object v0

    invoke-interface {v10, v2}, LEt0;->F(I)V

    invoke-interface {v10, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v10}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_3

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_5

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/ConsentPane;->getBody()Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/ConsentPaneBody;->getBullets()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/financialconnections/model/Bullet;

    sget-object v4, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;->Companion:Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;

    invoke-virtual {v4, v3}, Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;->from(Lcom/stripe/android/financialconnections/model/Bullet;)Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-interface {v10, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    invoke-interface {v10}, LEt0;->Q()V

    move-object v8, v2

    check-cast v8, Ljava/util/List;

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1;

    move-object/from16 v12, p0

    move-object/from16 v13, p4

    invoke-direct {v0, v12, v1, v13, v9}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;LXp5;Lkotlin/jvm/functions/Function0;I)V

    const v2, 0x554de62e

    invoke-static {v10, v2, v11, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v14

    new-instance v15, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;

    move-object v0, v15

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p6

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2;-><init>(LXp5;Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILcom/stripe/android/financialconnections/ui/TextResource$Text;Ljava/util/List;)V

    const v0, 0x4a5a97ea    # 3581434.5f

    invoke-static {v10, v0, v11, v15}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x36

    invoke-static {v14, v0, v10, v1}, Lcom/stripe/android/financialconnections/ui/components/ScaffoldKt;->FinancialConnectionsScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface {v10}, LEt0;->w()LWm5;

    move-result-object v7

    if-nez v7, :cond_7

    goto :goto_1

    :cond_7
    new-instance v8, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$3;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$3;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v7, v8}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method public static final ConsentScreen(LEt0;I)V
    .locals 20

    move/from16 v0, p1

    const v1, -0x7e42522

    move-object/from16 v2, p0

    invoke-interface {v2, v1}, LEt0;->u(I)LEt0;

    move-result-object v10

    if-nez v0, :cond_1

    invoke-interface {v10}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v10}, LEt0;->k()V

    goto/16 :goto_8

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.consent.ConsentScreen (ConsentScreen.kt:79)"

    invoke-static {v1, v0, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const v1, 0x1e871a90

    invoke-interface {v10, v1}, LEt0;->F(I)V

    invoke-static {}, Landroidx/compose/ui/platform/h;->i()LU94;

    move-result-object v1

    invoke-interface {v10, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLifecycleOwner;

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v2

    invoke-interface {v10, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-static {v2}, LtN2;->f(Landroid/content/Context;)Landroidx/activity/ComponentActivity;

    move-result-object v12

    if-eqz v12, :cond_15

    instance-of v2, v1, LXr6;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    move-object v2, v1

    check-cast v2, LXr6;

    goto :goto_1

    :cond_3
    move-object v2, v3

    :goto_1
    if-eqz v2, :cond_14

    instance-of v4, v1, LPi5;

    if-eqz v4, :cond_4

    move-object v4, v1

    check-cast v4, LPi5;

    goto :goto_2

    :cond_4
    move-object v4, v3

    :goto_2
    if-eqz v4, :cond_13

    invoke-interface {v4}, LPi5;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v4

    const-class v5, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object v6

    invoke-interface {v10, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    const/4 v7, 0x4

    new-array v8, v7, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v1, v8, v9

    const/4 v11, 0x1

    aput-object v12, v8, v11

    const/4 v11, 0x2

    aput-object v2, v8, v11

    const/4 v11, 0x3

    aput-object v4, v8, v11

    const v11, -0x21de6e89

    invoke-interface {v10, v11}, LEt0;->F(I)V

    move v11, v9

    move v13, v11

    :goto_3
    if-ge v11, v7, :cond_5

    aget-object v14, v8, v11

    invoke-interface {v10, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_5
    invoke-interface {v10}, LEt0;->G()Ljava/lang/Object;

    move-result-object v7

    if-nez v13, :cond_6

    sget-object v8, LEt0;->a:LEt0$a;

    invoke-virtual {v8}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v7, v8, :cond_c

    :cond_6
    instance-of v7, v1, Landroidx/fragment/app/Fragment;

    if-eqz v7, :cond_7

    check-cast v1, Landroidx/fragment/app/Fragment;

    goto :goto_4

    :cond_7
    move-object v1, v3

    :goto_4
    if-nez v1, :cond_8

    invoke-static {v6}, LtN2;->g(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    :cond_8
    move-object v14, v1

    const-string v1, "mavericks:arg"

    if-eqz v14, :cond_a

    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    goto :goto_5

    :cond_9
    move-object v13, v3

    :goto_5
    new-instance v1, LFy1;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x18

    const/16 v18, 0x0

    move-object v11, v1

    invoke-direct/range {v11 .. v18}, LFy1;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;Landroidx/fragment/app/Fragment;LXr6;Landroidx/savedstate/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v12}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v6

    if-eqz v6, :cond_b

    invoke-virtual {v6, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    :cond_b
    new-instance v1, Lr6;

    invoke-direct {v1, v12, v3, v2, v4}, Lr6;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;LXr6;Landroidx/savedstate/a;)V

    :goto_6
    move-object v7, v1

    invoke-interface {v10, v7}, LEt0;->z(Ljava/lang/Object;)V

    :cond_c
    invoke-interface {v10}, LEt0;->Q()V

    move-object v14, v7

    check-cast v14, LPr6;

    const v1, 0x1e7b2b64

    invoke-interface {v10, v1}, LEt0;->F(I)V

    invoke-interface {v10, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v10, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {v10}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_d

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_e

    :cond_d
    sget-object v11, LYN2;->a:LYN2;

    invoke-static {v5}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v12

    const-class v13, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    invoke-static {v5}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v15

    const-string v1, "keyFactory?.invoke() ?: viewModelClass.java.name"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x30

    const/16 v19, 0x0

    invoke-static/range {v11 .. v19}, LYN2;->c(LYN2;Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;ILjava/lang/Object;)LRN2;

    move-result-object v2

    invoke-interface {v10, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_e
    invoke-interface {v10}, LEt0;->Q()V

    check-cast v2, LRN2;

    invoke-interface {v10}, LEt0;->Q()V

    move-object v1, v2

    check-cast v1, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;

    invoke-static {v10, v9}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt;->parentViewModel(LEt0;I)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v11

    const/16 v2, 0x8

    invoke-static {v1, v10, v2}, LtN2;->b(LRN2;LEt0;I)LsP5;

    move-result-object v12

    invoke-static {}, Lhu0;->p()LU94;

    move-result-object v2

    invoke-interface {v10, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, LDf6;

    const v2, 0x2e20b340

    invoke-interface {v10, v2}, LEt0;->F(I)V

    const v2, -0x1d58f75c

    invoke-interface {v10, v2}, LEt0;->F(I)V

    invoke-interface {v10}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_f

    sget-object v2, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {v2, v10}, LY91;->j(Lkotlin/coroutines/CoroutineContext;LEt0;)LZC0;

    move-result-object v2

    new-instance v3, Liu0;

    invoke-direct {v3, v2}, Liu0;-><init>(LZC0;)V

    invoke-interface {v10, v3}, LEt0;->z(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_f
    invoke-interface {v10}, LEt0;->Q()V

    check-cast v2, Liu0;

    invoke-virtual {v2}, Liu0;->a()LZC0;

    move-result-object v14

    invoke-interface {v10}, LEt0;->Q()V

    sget-object v2, LHU2;->b:LHU2;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v7, 0x186

    const/16 v8, 0xa

    move-object v6, v10

    invoke-static/range {v2 .. v8}, LFU2;->p(LHU2;Llf;ZLkotlin/jvm/functions/Function1;LEt0;II)LGU2;

    move-result-object v15

    invoke-virtual {v15}, LGU2;->l()Z

    move-result v2

    new-instance v3, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentScreen$1;

    invoke-direct {v3, v14, v15}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentScreen$1;-><init>(LZC0;LGU2;)V

    invoke-static {v2, v3, v10, v9, v9}, LSv;->a(ZLkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-interface {v12}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/consent/ConsentState;->getViewEffect()Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;

    move-result-object v2

    const v3, 0x2bf6f999

    invoke-interface {v10, v3}, LEt0;->F(I)V

    if-nez v2, :cond_10

    goto :goto_7

    :cond_10
    new-instance v9, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentScreen$2$1;

    const/4 v8, 0x0

    move-object v3, v9

    move-object v4, v2

    move-object v5, v13

    move-object v6, v15

    move-object v7, v1

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentScreen$2$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState$ViewEffect;LDf6;LGU2;Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel;Lkotlin/coroutines/Continuation;)V

    const/16 v3, 0x40

    invoke-static {v2, v9, v10, v3}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_7
    invoke-interface {v10}, LEt0;->Q()V

    invoke-interface {v12}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    new-instance v4, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentScreen$3;

    invoke-direct {v4, v1}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentScreen$3;-><init>(Ljava/lang/Object;)V

    new-instance v5, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentScreen$4;

    invoke-direct {v5, v1}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentScreen$4;-><init>(Ljava/lang/Object;)V

    new-instance v6, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentScreen$5;

    invoke-direct {v6, v14, v15}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentScreen$5;-><init>(LZC0;LGU2;)V

    new-instance v7, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentScreen$6;

    invoke-direct {v7, v11}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentScreen$6;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)V

    const/16 v9, 0x8

    move-object v3, v15

    move-object v8, v10

    invoke-static/range {v2 .. v9}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->ConsentContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-static {}, LQt0;->Y()V

    :cond_11
    :goto_8
    invoke-interface {v10}, LEt0;->w()LWm5;

    move-result-object v1

    if-nez v1, :cond_12

    goto :goto_9

    :cond_12
    new-instance v2, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentScreen$7;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentScreen$7;-><init>(I)V

    invoke-interface {v1, v2}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_9
    return-void

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner must be a SavedStateRegistryOwner!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner must be a ViewModelStoreOwner!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composable is not hosted in a ComponentActivity!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final ContentLegalDetailsPreview(LEt0;I)V
    .locals 4

    const v0, -0x11469e9e

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

    const-string v2, "com.stripe.android.financialconnections.features.consent.ContentLegalDetailsPreview (ConsentScreen.kt:525)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt;->getLambda-3$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v0, p0, v1, v2}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt;->FinancialConnectionsPreview(ZLkotlin/jvm/functions/Function2;LEt0;II)V

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentLegalDetailsPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentLegalDetailsPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final ContentManualEntryPlusMicrodeposits(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LEt0;II)V
    .locals 5

    const v0, -0x2aee2211

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p3, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p2, 0x2

    goto :goto_0

    :cond_0
    move v2, p2

    :goto_0
    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    and-int/lit8 v2, v2, 0xb

    const/4 v4, 0x2

    if-ne v2, v4, :cond_2

    invoke-interface {p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_4

    :cond_2
    :goto_1
    invoke-interface {p1}, LEt0;->J()V

    and-int/lit8 v2, p2, 0x1

    if-eqz v2, :cond_4

    invoke-interface {p1}, LEt0;->l()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_3

    :cond_4
    :goto_2
    if-eqz v1, :cond_5

    sget-object p0, Lcom/stripe/android/financialconnections/features/consent/ConsentStates;->Companion:Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;->manualEntryPlusMicrodeposits()Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p0

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.consent.ContentManualEntryPlusMicrodeposits (ConsentScreen.kt:541)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentManualEntryPlusMicrodeposits$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentManualEntryPlusMicrodeposits$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;)V

    const v1, -0x24ab1c21

    invoke-static {p1, v1, v3, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x0

    invoke-static {v2, v0, p1, v1, v3}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt;->FinancialConnectionsPreview(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_4
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_5

    :cond_8
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentManualEntryPlusMicrodeposits$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentManualEntryPlusMicrodeposits$2;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;II)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method public static final ContentPreview(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LEt0;II)V
    .locals 5

    const v0, -0x7d23a050

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p3, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p2, 0x2

    goto :goto_0

    :cond_0
    move v2, p2

    :goto_0
    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    and-int/lit8 v2, v2, 0xb

    const/4 v4, 0x2

    if-ne v2, v4, :cond_2

    invoke-interface {p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_4

    :cond_2
    :goto_1
    invoke-interface {p1}, LEt0;->J()V

    and-int/lit8 v2, p2, 0x1

    if-eqz v2, :cond_4

    invoke-interface {p1}, LEt0;->l()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_3

    :cond_4
    :goto_2
    if-eqz v1, :cond_5

    sget-object p0, Lcom/stripe/android/financialconnections/features/consent/ConsentStates;->Companion:Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;->canonical()Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p0

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.consent.ContentPreview (ConsentScreen.kt:429)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentPreview$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentPreview$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;)V

    const v1, 0x1b9383c0

    invoke-static {p1, v1, v3, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x0

    invoke-static {v2, v0, p1, v1, v3}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt;->FinancialConnectionsPreview(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_4
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_5

    :cond_8
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentPreview$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentPreview$2;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;II)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method public static final ContentRequestedDataPreview(LEt0;I)V
    .locals 4

    const v0, 0x5690965b

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

    const-string v2, "com.stripe.android.financialconnections.features.consent.ContentRequestedDataPreview (ConsentScreen.kt:507)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/consent/ComposableSingletons$ConsentScreenKt;->getLambda-2$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v0, p0, v1, v2}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt;->FinancialConnectionsPreview(ZLkotlin/jvm/functions/Function2;LEt0;II)V

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentRequestedDataPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentRequestedDataPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final ContentWithConnectedAccountLogosPreview(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LEt0;II)V
    .locals 5

    const v0, 0x5af89c58

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p3, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p2, 0x2

    goto :goto_0

    :cond_0
    move v2, p2

    :goto_0
    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    and-int/lit8 v2, v2, 0xb

    const/4 v4, 0x2

    if-ne v2, v4, :cond_2

    invoke-interface {p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_4

    :cond_2
    :goto_1
    invoke-interface {p1}, LEt0;->J()V

    and-int/lit8 v2, p2, 0x1

    if-eqz v2, :cond_4

    invoke-interface {p1}, LEt0;->l()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_3

    :cond_4
    :goto_2
    if-eqz v1, :cond_5

    sget-object p0, Lcom/stripe/android/financialconnections/features/consent/ConsentStates;->Companion:Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;->withConnectedAccountLogos()Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p0

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.consent.ContentWithConnectedAccountLogosPreview (ConsentScreen.kt:486)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;)V

    const v1, -0x2498d5b8

    invoke-static {p1, v1, v3, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x0

    invoke-static {v2, v0, p1, v1, v3}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt;->FinancialConnectionsPreview(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_4
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_5

    :cond_8
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithConnectedAccountLogosPreview$2;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;II)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method public static final ContentWithNoLogosPreview(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LEt0;II)V
    .locals 5

    const v0, -0x4e3266a5

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p3, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p2, 0x2

    goto :goto_0

    :cond_0
    move v2, p2

    :goto_0
    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    and-int/lit8 v2, v2, 0xb

    const/4 v4, 0x2

    if-ne v2, v4, :cond_2

    invoke-interface {p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_4

    :cond_2
    :goto_1
    invoke-interface {p1}, LEt0;->J()V

    and-int/lit8 v2, p2, 0x1

    if-eqz v2, :cond_4

    invoke-interface {p1}, LEt0;->l()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_3

    :cond_4
    :goto_2
    if-eqz v1, :cond_5

    sget-object p0, Lcom/stripe/android/financialconnections/features/consent/ConsentStates;->Companion:Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;->withNoLogos()Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p0

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.consent.ContentWithNoLogosPreview (ConsentScreen.kt:448)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithNoLogosPreview$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithNoLogosPreview$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;)V

    const v1, -0x38edb4b5

    invoke-static {p1, v1, v3, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x0

    invoke-static {v2, v0, p1, v1, v3}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt;->FinancialConnectionsPreview(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_4
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_5

    :cond_8
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithNoLogosPreview$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithNoLogosPreview$2;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;II)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method public static final ContentWithPlatformLogosPreview(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LEt0;II)V
    .locals 5

    const v0, -0x736b0657

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p3, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p2, 0x2

    goto :goto_0

    :cond_0
    move v2, p2

    :goto_0
    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    and-int/lit8 v2, v2, 0xb

    const/4 v4, 0x2

    if-ne v2, v4, :cond_2

    invoke-interface {p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_4

    :cond_2
    :goto_1
    invoke-interface {p1}, LEt0;->J()V

    and-int/lit8 v2, p2, 0x1

    if-eqz v2, :cond_4

    invoke-interface {p1}, LEt0;->l()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_3

    :cond_4
    :goto_2
    if-eqz v1, :cond_5

    sget-object p0, Lcom/stripe/android/financialconnections/features/consent/ConsentStates;->Companion:Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentStates$Companion;->withPlatformLogos()Lcom/stripe/android/financialconnections/features/consent/ConsentState;

    move-result-object p0

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.consent.ContentWithPlatformLogosPreview (ConsentScreen.kt:467)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithPlatformLogosPreview$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithPlatformLogosPreview$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;)V

    const v1, 0x65a87799

    invoke-static {p1, v1, v3, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x0

    invoke-static {v2, v0, p1, v1, v3}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt;->FinancialConnectionsPreview(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_4
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_5

    :cond_8
    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithPlatformLogosPreview$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ContentWithPlatformLogosPreview$2;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState;II)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method private static final LoadedContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;LGU2;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;LEt0;I)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
            "LGU2;",
            "Ldp<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v9, p9

    const v0, 0x1baf2214

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v7

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.consent.LoadedContent (ConsentScreen.kt:313)"

    invoke-static {v0, v9, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v1, 0x6

    invoke-virtual {v0, v7, v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getBackgroundSurface-0d7_KjU()J

    move-result-wide v15

    const/16 v2, 0x8

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v2}, Lcc5;->d(F)Lbc5;

    move-result-object v13

    invoke-virtual {v0, v7, v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v17

    const/high16 v19, 0x3f000000    # 0.5f

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0xe

    const/16 v24, 0x0

    invoke-static/range {v17 .. v24}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v19

    new-instance v6, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;

    move-object v0, v6

    move-object/from16 v1, p7

    move-object/from16 v2, p0

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move/from16 v5, p9

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$1;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V

    const v0, 0x279398a6

    const/4 v8, 0x1

    invoke-static {v7, v0, v8, v6}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v14, 0x0

    const-wide/16 v17, 0x0

    new-instance v12, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$2;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p9

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$2;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    const v0, 0x7d2ca32e

    invoke-static {v7, v0, v8, v12}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v21

    shl-int/lit8 v0, v9, 0x3

    and-int/lit16 v0, v0, 0x380

    const v1, 0x6000006

    or-int v23, v0, v1

    const/16 v24, 0x52

    move-object/from16 v12, p1

    move-object/from16 v22, v7

    invoke-static/range {v10 .. v24}, LFU2;->c(Lkotlin/jvm/functions/Function3;LgV2;LGU2;Lhy5;FJJJLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {v7}, LEt0;->w()LWm5;

    move-result-object v10

    if-nez v10, :cond_2

    goto :goto_0

    :cond_2
    new-instance v11, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$3;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt$LoadedContent$3;-><init>(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;LGU2;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;I)V

    invoke-interface {v10, v11}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public static final synthetic access$ConsentContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->ConsentContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$ConsentFooter(Ldp;Lcom/stripe/android/financialconnections/model/ConsentPane;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->ConsentFooter(Ldp;Lcom/stripe/android/financialconnections/model/ConsentPane;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$ConsentLoadingContent(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->ConsentLoadingContent(LEt0;I)V

    return-void
.end method

.method public static final synthetic access$ConsentLogoHeader(LgV2;Ljava/util/List;LEt0;II)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->ConsentLogoHeader(LgV2;Ljava/util/List;LEt0;II)V

    return-void
.end method

.method public static final synthetic access$ConsentMainContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->ConsentMainContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$LoadedContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;LGU2;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/stripe/android/financialconnections/features/consent/ConsentScreenKt;->LoadedContent(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;LGU2;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/features/consent/ConsentState$BottomSheetContent;LEt0;I)V

    return-void
.end method
