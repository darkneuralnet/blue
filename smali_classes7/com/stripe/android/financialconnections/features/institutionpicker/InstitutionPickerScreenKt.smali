.class public final Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u009f\u0001\u0010\u0015\u001a\u00020\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00030\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00000\u000b2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000e2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00062\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00062\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00062\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0006H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u0091\u0001\u0010\u0017\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00000\u000b2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00062\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00062\u0012\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00030\u00062\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000e2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0006H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001aO\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00000\u000b2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00062\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\n\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a[\u0010\u001e\u001a\u00020\u00002\u0012\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00030\u00062\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\u000c2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00062\u0006\u0010\u001d\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001a%\u0010 \u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\t2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0006H\u0003\u00a2\u0006\u0004\u0008 \u0010!\u001a+\u0010#\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00000\u000b2\u0006\u0010\"\u001a\u00020\u000fH\u0003\u00a2\u0006\u0004\u0008#\u0010$\u001a?\u0010\'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000eH\u0003\u00a2\u0006\u0004\u0008\'\u0010(\u001a\u0019\u0010+\u001a\u00020\u00002\u0008\u0008\u0002\u0010*\u001a\u00020)H\u0001\u00a2\u0006\u0004\u0008+\u0010,\u001a\u0019\u0010-\u001a\u00020\u00002\u0008\u0008\u0002\u0010*\u001a\u00020)H\u0001\u00a2\u0006\u0004\u0008-\u0010,\u001a\u0019\u0010.\u001a\u00020\u00002\u0008\u0008\u0002\u0010*\u001a\u00020)H\u0001\u00a2\u0006\u0004\u0008.\u0010,\u001a\u0019\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010*\u001a\u00020)H\u0001\u00a2\u0006\u0004\u0008/\u0010,\u001a\u0019\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010*\u001a\u00020)H\u0001\u00a2\u0006\u0004\u00080\u0010,\u001a\u0019\u00101\u001a\u00020\u00002\u0008\u0008\u0002\u0010*\u001a\u00020)H\u0001\u00a2\u0006\u0004\u00081\u0010,\u001a\u0019\u00102\u001a\u00020\u00002\u0008\u0008\u0002\u0010*\u001a\u00020)H\u0001\u00a2\u0006\u0004\u00082\u0010,\u00a8\u00063"
    }
    d2 = {
        "",
        "InstitutionPickerScreen",
        "(LEt0;I)V",
        "Ldp;",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;",
        "payload",
        "Lkotlin/Function0;",
        "Lcom/stripe/android/financialconnections/model/InstitutionResponse;",
        "institutionsProvider",
        "",
        "searchMode",
        "Lkotlin/Function1;",
        "",
        "onQueryChanged",
        "Lkotlin/Function2;",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "onInstitutionSelected",
        "onCancelSearchClick",
        "onCloseClick",
        "onSearchFocused",
        "onManualEntryClick",
        "InstitutionPickerContent",
        "(Ldp;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "LoadedContent",
        "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ldp;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "LF16;",
        "query",
        "FinancialConnectionsSearchRow",
        "(LF16;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLEt0;I)V",
        "manualEntryEnabled",
        "SearchInstitutionsList",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLEt0;I)V",
        "SearchInstitutionsFailedRow",
        "(ZLkotlin/jvm/functions/Function0;LEt0;I)V",
        "institution",
        "InstitutionResultTile",
        "(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;LEt0;I)V",
        "LgV2;",
        "modifier",
        "FeaturedInstitutionsGrid",
        "(LgV2;Ldp;Lkotlin/jvm/functions/Function2;LEt0;I)V",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;",
        "state",
        "InitialLoading",
        "(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;LEt0;II)V",
        "SearchModeSearchingInstitutions",
        "SearchModeWithResults",
        "SearchModeNoResults",
        "SearchModeFailed",
        "SearchModeNoQuery",
        "NoSearchMode",
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
        "SMAP\nInstitutionPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,617:1\n53#2:618\n54#2,15:620\n69#2,8:641\n79#2:652\n80#2,5:655\n76#3:619\n76#3:660\n76#3:690\n76#3:732\n76#3:741\n76#3:802\n76#3:855\n76#3:883\n76#3:893\n83#4,3:635\n50#4:653\n49#4:654\n36#4:661\n50#4:674\n49#4:675\n460#4,13:702\n50#4:719\n49#4:720\n473#4,3:727\n460#4,13:753\n36#4:767\n36#4:774\n473#4,3:781\n83#4,3:787\n460#4,13:814\n36#4:828\n473#4,3:835\n460#4,13:867\n460#4,13:905\n473#4,3:919\n473#4,3:924\n1057#5,3:638\n1060#5,3:649\n1057#5,6:662\n1057#5,6:668\n1057#5,6:676\n1057#5,6:721\n1057#5,6:768\n1057#5,6:775\n1057#5,6:790\n1057#5,6:829\n1057#5,6:840\n73#6,7:682\n80#6:715\n84#6:731\n78#6,2:799\n80#6:827\n84#6:839\n73#6,7:885\n80#6:918\n84#6:923\n75#7:689\n76#7,11:691\n89#7:730\n75#7:740\n76#7,11:742\n89#7:784\n75#7:801\n76#7,11:803\n89#7:838\n75#7:854\n76#7,11:856\n75#7:892\n76#7,11:894\n89#7:922\n89#7:927\n154#8:716\n154#8:717\n154#8:718\n154#8:733\n154#8:786\n154#8:796\n154#8:797\n154#8:798\n154#8:846\n154#8:847\n154#8:881\n154#8:882\n154#8:884\n154#8:929\n154#8:930\n154#8:931\n154#8:932\n154#8:933\n75#9,6:734\n81#9:766\n85#9:785\n75#9,6:848\n81#9:880\n85#9:928\n76#10:934\n76#10:935\n102#10,2:936\n*S KotlinDebug\n*F\n+ 1 InstitutionPickerScreen.kt\ncom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt\n*L\n84#1:618\n84#1:620,15\n84#1:641,8\n84#1:652\n84#1:655,5\n84#1:619\n89#1:660\n155#1:690\n205#1:732\n206#1:741\n318#1:802\n365#1:855\n380#1:883\n387#1:893\n84#1:635,3\n84#1:653\n84#1:654\n97#1:661\n154#1:674\n154#1:675\n155#1:702,13\n171#1:719\n171#1:720\n155#1:727,3\n206#1:753,13\n237#1:767\n247#1:774\n206#1:781,3\n263#1:787,3\n318#1:814,13\n344#1:828\n318#1:835,3\n365#1:867,13\n387#1:905,13\n387#1:919,3\n365#1:924,3\n84#1:638,3\n84#1:649,3\n97#1:662,6\n153#1:668,6\n154#1:676,6\n171#1:721,6\n237#1:768,6\n247#1:775,6\n263#1:790,6\n344#1:829,6\n369#1:840,6\n155#1:682,7\n155#1:715\n155#1:731\n318#1:799,2\n318#1:827\n318#1:839\n387#1:885,7\n387#1:918\n387#1:923\n155#1:689\n155#1:691,11\n155#1:730\n206#1:740\n206#1:742,11\n206#1:784\n318#1:801\n318#1:803,11\n318#1:838\n365#1:854\n365#1:856,11\n387#1:892\n387#1:894,11\n387#1:922\n365#1:927\n157#1:716\n160#1:717\n166#1:718\n208#1:733\n262#1:786\n322#1:796\n323#1:797\n326#1:798\n371#1:846\n372#1:847\n376#1:881\n377#1:882\n386#1:884\n414#1:929\n415#1:930\n416#1:931\n418#1:932\n419#1:933\n206#1:734,6\n206#1:766\n206#1:785\n365#1:848,6\n365#1:880\n365#1:928\n86#1:934\n153#1:935\n153#1:936,2\n*E\n"
    }
.end annotation


# direct methods
.method private static final FeaturedInstitutionsGrid(LgV2;Ldp;Lkotlin/jvm/functions/Function2;LEt0;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p4

    const v3, 0x567ad62e

    move-object/from16 v4, p3

    invoke-interface {v4, v3}, LEt0;->u(I)LEt0;

    move-result-object v17

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.financialconnections.features.institutionpicker.FeaturedInstitutionsGrid (InstitutionPickerScreen.kt:404)"

    invoke-static {v3, v2, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance v4, LcE1$a;

    const/4 v3, 0x2

    invoke-direct {v4, v3}, LcE1$a;-><init>(I)V

    const/16 v3, 0x10

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v6

    const/16 v3, 0x18

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v5

    invoke-static {v3}, Lk61;->g(F)F

    move-result v7

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, LND3;->e(FFFFILjava/lang/Object;)LPD3;

    move-result-object v7

    sget-object v3, Llo;->a:Llo;

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v6

    invoke-virtual {v3, v6}, Llo;->n(F)Llo$e;

    move-result-object v9

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    invoke-virtual {v3, v5}, Llo;->n(F)Llo$e;

    move-result-object v10

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    new-instance v13, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1;

    invoke-direct {v13, v0, v1, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1;-><init>(Ldp;Lkotlin/jvm/functions/Function2;I)V

    shl-int/lit8 v3, v2, 0x3

    and-int/lit8 v3, v3, 0x70

    const/high16 v5, 0x1b0000

    or-int v15, v3, v5

    const/16 v16, 0x194

    move-object/from16 v5, p0

    move-object/from16 v14, v17

    invoke-static/range {v4 .. v16}, Ljn2;->a(LcE1;LgV2;LGn2;LPD3;ZLlo$l;Llo$d;Lcu1;ZLkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface/range {v17 .. v17}, LEt0;->w()LWm5;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    new-instance v4, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$2;

    move-object/from16 v5, p0

    invoke-direct {v4, v5, v0, v1, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FeaturedInstitutionsGrid$2;-><init>(LgV2;Ldp;Lkotlin/jvm/functions/Function2;I)V

    invoke-interface {v3, v4}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method private static final FinancialConnectionsSearchRow(LF16;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLEt0;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF16;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LF16;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p6

    const v0, 0x160ff343

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v7, v6, 0xe

    const/4 v8, 0x2

    move-object/from16 v15, p0

    if-nez v7, :cond_1

    invoke-interface {v1, v15}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    move v7, v8

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_1
    move v7, v6

    :goto_1
    and-int/lit8 v9, v6, 0x70

    if-nez v9, :cond_3

    invoke-interface {v1, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v7, v9

    :cond_3
    and-int/lit16 v9, v6, 0x380

    if-nez v9, :cond_5

    invoke-interface {v1, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v7, v9

    :cond_5
    and-int/lit16 v9, v6, 0x1c00

    if-nez v9, :cond_7

    invoke-interface {v1, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_4

    :cond_6
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v7, v9

    :cond_7
    const v9, 0xe000

    and-int/2addr v9, v6

    if-nez v9, :cond_9

    invoke-interface {v1, v5}, LEt0;->o(Z)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x4000

    goto :goto_5

    :cond_8
    const/16 v9, 0x2000

    :goto_5
    or-int/2addr v7, v9

    :cond_9
    const v9, 0xb6db

    and-int/2addr v9, v7

    const/16 v10, 0x2492

    if-ne v9, v10, :cond_b

    invoke-interface {v1}, LEt0;->b()Z

    move-result v9

    if-nez v9, :cond_a

    goto :goto_6

    :cond_a
    invoke-interface {v1}, LEt0;->k()V

    goto/16 :goto_9

    :cond_b
    :goto_6
    invoke-static {}, LQt0;->O()Z

    move-result v9

    if-eqz v9, :cond_c

    const/4 v9, -0x1

    const-string v10, "com.stripe.android.financialconnections.features.institutionpicker.FinancialConnectionsSearchRow (InstitutionPickerScreen.kt:197)"

    invoke-static {v0, v7, v9, v10}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_c
    invoke-static {}, Lhu0;->h()LU94;

    move-result-object v0

    invoke-interface {v1, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBv1;

    sget-object v9, LK9;->a:LK9$a;

    invoke-virtual {v9}, LK9$a;->h()LK9$c;

    move-result-object v9

    sget-object v10, LgV2;->b0:LgV2$a;

    const/16 v11, 0x18

    int-to-float v11, v11

    invoke-static {v11}, Lk61;->g(F)F

    move-result v11

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static {v10, v11, v12, v8, v13}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v8

    const v11, 0x2952b718

    invoke-interface {v1, v11}, LEt0;->F(I)V

    sget-object v11, Llo;->a:Llo;

    invoke-virtual {v11}, Llo;->f()Llo$d;

    move-result-object v11

    const/16 v12, 0x30

    invoke-static {v11, v9, v1, v12}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v9

    const v11, -0x4ee9b9da

    invoke-interface {v1, v11}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v11

    invoke-interface {v1, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v12

    invoke-interface {v1, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v13

    invoke-interface {v1, v13}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LJq6;

    sget-object v14, LBt0;->M:LBt0$a;

    invoke-virtual {v14}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-static {v8}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v8

    invoke-interface {v1}, LEt0;->v()Llm;

    move-result-object v15

    instance-of v15, v15, Llm;

    if-nez v15, :cond_d

    invoke-static {}, Lyt0;->c()V

    :cond_d
    invoke-interface {v1}, LEt0;->h()V

    invoke-interface {v1}, LEt0;->t()Z

    move-result v15

    if-eqz v15, :cond_e

    invoke-interface {v1, v6}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_7

    :cond_e
    invoke-interface {v1}, LEt0;->e()V

    :goto_7
    invoke-interface {v1}, LEt0;->L()V

    invoke-static {v1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v6

    invoke-virtual {v14}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v6, v9, v15}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v6, v11, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v6, v12, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v14}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v6, v13, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v1}, LEt0;->q()V

    invoke-static {v1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v6

    invoke-static {v6}, LMB5;->a(LEt0;)LMB5;

    move-result-object v6

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v6, v1, v9}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v6, 0x7ab4aae9

    invoke-interface {v1, v6}, LEt0;->F(I)V

    const v6, -0x286e2e7f

    invoke-interface {v1, v6}, LEt0;->F(I)V

    sget-object v11, Lad5;->a:Lad5;

    const v6, 0x1858cb5f

    invoke-interface {v1, v6}, LEt0;->F(I)V

    new-instance v6, Lbl2;

    const/4 v13, 0x0

    const/4 v14, 0x0

    sget-object v8, Lcl2;->b:Lcl2$a;

    invoke-virtual {v8}, Lcl2$a;->h()I

    move-result v15

    sget-object v8, LFY1;->b:LFY1$a;

    invoke-virtual {v8}, LFY1$a;->b()I

    move-result v16

    const/16 v17, 0x3

    const/16 v18, 0x0

    move-object v12, v6

    invoke-direct/range {v12 .. v18}, Lbl2;-><init>(IZIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz v5, :cond_f

    new-instance v8, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$1;

    invoke-direct {v8, v3, v0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$1;-><init>(Lkotlin/jvm/functions/Function0;LBv1;)V

    const v0, 0x73907326

    const/4 v9, 0x1

    invoke-static {v1, v0, v9, v8}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    goto :goto_8

    :cond_f
    sget-object v0, Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$InstitutionPickerScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$InstitutionPickerScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$InstitutionPickerScreenKt;->getLambda-1$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    :goto_8
    const v8, 0x44faf204

    invoke-interface {v1, v8}, LEt0;->F(I)V

    invoke-interface {v1, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v12

    if-nez v9, :cond_10

    sget-object v9, LEt0;->a:LEt0$a;

    invoke-virtual {v9}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v12, v9, :cond_11

    :cond_10
    new-instance v12, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$2$1;

    invoke-direct {v12, v4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$2$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-interface {v1, v12}, LEt0;->z(Ljava/lang/Object;)V

    :cond_11
    invoke-interface {v1}, LEt0;->Q()V

    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-static {v10, v12}, Landroidx/compose/ui/focus/b;->a(LgV2;Lkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v12

    const/high16 v13, 0x3f800000    # 1.0f

    const/4 v14, 0x0

    const/4 v15, 0x2

    const/16 v16, 0x0

    invoke-static/range {v11 .. v16}, LZc5;->b(LZc5;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v9

    invoke-interface {v1, v8}, LEt0;->F(I)V

    invoke-interface {v1, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_12

    sget-object v8, LEt0;->a:LEt0$a;

    invoke-virtual {v8}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v10, v8, :cond_13

    :cond_12
    new-instance v10, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$3$1;

    invoke-direct {v10, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$3$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v10}, LEt0;->z(Ljava/lang/Object;)V

    :cond_13
    invoke-interface {v1}, LEt0;->Q()V

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    const/4 v12, 0x0

    sget-object v8, Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$InstitutionPickerScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$InstitutionPickerScreenKt;

    invoke-virtual {v8}, Lcom/stripe/android/financialconnections/features/institutionpicker/ComposableSingletons$InstitutionPickerScreenKt;->getLambda-2$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/high16 v8, 0x180000

    and-int/lit8 v7, v7, 0xe

    or-int v19, v7, v8

    const/16 v20, 0x0

    const/16 v21, 0x598

    move-object/from16 v7, p0

    move-object v8, v9

    move-object v9, v10

    move v10, v11

    move v11, v12

    move-object v12, v6

    move-object/from16 v16, v0

    move-object/from16 v18, v1

    invoke-static/range {v7 .. v21}, Lcom/stripe/android/financialconnections/ui/components/TextFieldKt;->FinancialConnectionsOutlinedTextField(LF16;LgV2;Lkotlin/jvm/functions/Function1;ZZLbl2;Lkotlin/jvm/functions/Function2;LEu6;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LEt0;III)V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->f()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-interface {v1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {}, LQt0;->Y()V

    :cond_14
    :goto_9
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v7

    if-nez v7, :cond_15

    goto :goto_a

    :cond_15
    new-instance v8, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$2;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$FinancialConnectionsSearchRow$2;-><init>(LF16;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZI)V

    invoke-interface {v7, v8}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_a
    return-void
.end method

.method public static final InitialLoading(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;LEt0;II)V
    .locals 5

    const v0, 0x492c0d1b

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

    sget-object p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;->Companion:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->initialLoading()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object p0

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.institutionpicker.InitialLoading (InstitutionPickerScreen.kt:486)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InitialLoading$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InitialLoading$1;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)V

    const v1, 0x1258b52b

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InitialLoading$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InitialLoading$2;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;II)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method private static final InstitutionPickerContent(Ldp;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/InstitutionResponse;",
            ">;>;Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
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

    move/from16 v10, p10

    const v0, -0x76b4feaa

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v11

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerContent (InstitutionPickerScreen.kt:108)"

    invoke-static {v0, v10, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerContent$1;

    move/from16 v12, p2

    move-object/from16 v13, p6

    invoke-direct {v0, v12, v13, v10}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerContent$1;-><init>(ZLkotlin/jvm/functions/Function0;I)V

    const v1, -0x6b326af9

    const/4 v14, 0x1

    invoke-static {v11, v1, v14, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v15

    new-instance v9, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerContent$2;

    move-object v0, v9

    move/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p7

    move-object/from16 v4, p5

    move-object/from16 v5, p1

    move-object/from16 v6, p4

    move-object/from16 v7, p0

    move-object/from16 v8, p8

    move-object v10, v9

    move/from16 v9, p10

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerContent$2;-><init>(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ldp;Lkotlin/jvm/functions/Function0;I)V

    const v0, 0x3f80e7c3

    invoke-static {v11, v0, v14, v10}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x36

    invoke-static {v15, v0, v11, v1}, Lcom/stripe/android/financialconnections/ui/components/ScaffoldKt;->FinancialConnectionsScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {v11}, LEt0;->w()LWm5;

    move-result-object v11

    if-nez v11, :cond_2

    goto :goto_0

    :cond_2
    new-instance v14, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerContent$3;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerContent$3;-><init>(Ldp;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v11, v14}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public static final InstitutionPickerScreen(LEt0;I)V
    .locals 23

    move/from16 v0, p1

    const v1, -0x220aae8e

    move-object/from16 v2, p0

    invoke-interface {v2, v1}, LEt0;->u(I)LEt0;

    move-result-object v13

    if-nez v0, :cond_1

    invoke-interface {v13}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v13}, LEt0;->k()V

    goto/16 :goto_7

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreen (InstitutionPickerScreen.kt:82)"

    invoke-static {v1, v0, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const v1, 0x1e871a90

    invoke-interface {v13, v1}, LEt0;->F(I)V

    invoke-static {}, Landroidx/compose/ui/platform/h;->i()LU94;

    move-result-object v1

    invoke-interface {v13, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLifecycleOwner;

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v2

    invoke-interface {v13, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-static {v2}, LtN2;->f(Landroid/content/Context;)Landroidx/activity/ComponentActivity;

    move-result-object v4

    if-eqz v4, :cond_15

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

    instance-of v5, v1, LPi5;

    if-eqz v5, :cond_4

    move-object v5, v1

    check-cast v5, LPi5;

    goto :goto_2

    :cond_4
    move-object v5, v3

    :goto_2
    if-eqz v5, :cond_13

    invoke-interface {v5}, LPi5;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v5

    const-class v6, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;

    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v11

    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object v6

    invoke-interface {v13, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    const/4 v7, 0x4

    new-array v8, v7, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v1, v8, v12

    const/4 v9, 0x1

    aput-object v4, v8, v9

    const/4 v9, 0x2

    aput-object v2, v8, v9

    const/4 v9, 0x3

    aput-object v5, v8, v9

    const v9, -0x21de6e89

    invoke-interface {v13, v9}, LEt0;->F(I)V

    move v9, v12

    move v10, v9

    :goto_3
    if-ge v9, v7, :cond_5

    aget-object v14, v8, v9

    invoke-interface {v13, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v10, v14

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_5
    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v7

    if-nez v10, :cond_6

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
    move-object v6, v1

    const-string v1, "mavericks:arg"

    if-eqz v6, :cond_a

    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    goto :goto_5

    :cond_9
    move-object v5, v3

    :goto_5
    new-instance v1, LFy1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x18

    const/4 v10, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, LFy1;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;Landroidx/fragment/app/Fragment;LXr6;Landroidx/savedstate/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v6

    if-eqz v6, :cond_b

    invoke-virtual {v6, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    :cond_b
    new-instance v1, Lr6;

    invoke-direct {v1, v4, v3, v2, v5}, Lr6;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;LXr6;Landroidx/savedstate/a;)V

    :goto_6
    move-object v7, v1

    invoke-interface {v13, v7}, LEt0;->z(Ljava/lang/Object;)V

    :cond_c
    invoke-interface {v13}, LEt0;->Q()V

    move-object v1, v7

    check-cast v1, LPr6;

    const v2, 0x1e7b2b64

    invoke-interface {v13, v2}, LEt0;->F(I)V

    invoke-interface {v13, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v13, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_d

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_e

    :cond_d
    sget-object v14, LYN2;->a:LYN2;

    invoke-static {v11}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v15

    const-class v16, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    invoke-static {v11}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "keyFactory?.invoke() ?: viewModelClass.java.name"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x30

    const/16 v22, 0x0

    move-object/from16 v17, v1

    move-object/from16 v18, v2

    invoke-static/range {v14 .. v22}, LYN2;->c(LYN2;Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;ILjava/lang/Object;)LRN2;

    move-result-object v3

    invoke-interface {v13, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_e
    invoke-interface {v13}, LEt0;->Q()V

    check-cast v3, LRN2;

    invoke-interface {v13}, LEt0;->Q()V

    check-cast v3, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;

    invoke-static {v13, v12}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt;->parentViewModel(LEt0;I)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {v3, v13, v2}, LtN2;->b(LRN2;LEt0;I)LsP5;

    move-result-object v2

    invoke-static {}, Lhu0;->h()LU94;

    move-result-object v4

    invoke-interface {v13, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBv1;

    invoke-static {v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->InstitutionPickerScreen$lambda$0(LsP5;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;->getSearchMode()Z

    move-result v5

    new-instance v6, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$1;

    invoke-direct {v6, v4, v3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$1;-><init>(LBv1;Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;)V

    invoke-static {v5, v6, v13, v12, v12}, LSv;->a(ZLkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-static {v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->InstitutionPickerScreen$lambda$0(LsP5;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;->getPayload()Ldp;

    move-result-object v4

    const v5, 0x44faf204

    invoke-interface {v13, v5}, LEt0;->F(I)V

    invoke-interface {v13, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_f

    sget-object v5, LEt0;->a:LEt0$a;

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_10

    :cond_f
    new-instance v6, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$2$1;

    invoke-direct {v6, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$2$1;-><init>(LsP5;)V

    invoke-interface {v13, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_10
    invoke-interface {v13}, LEt0;->Q()V

    move-object v5, v6

    check-cast v5, Lkotlin/jvm/functions/Function0;

    invoke-static {v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->InstitutionPickerScreen$lambda$0(LsP5;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;->getSearchMode()Z

    move-result v6

    new-instance v7, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$3;

    invoke-direct {v7, v3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$3;-><init>(Ljava/lang/Object;)V

    new-instance v8, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$4;

    invoke-direct {v8, v3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$4;-><init>(Ljava/lang/Object;)V

    new-instance v9, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$5;

    invoke-direct {v9, v3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$5;-><init>(Ljava/lang/Object;)V

    new-instance v10, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$6;

    invoke-direct {v10, v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$6;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)V

    new-instance v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$7;

    invoke-direct {v1, v3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$7;-><init>(Ljava/lang/Object;)V

    new-instance v11, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$8;

    invoke-direct {v11, v3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$8;-><init>(Ljava/lang/Object;)V

    const/16 v12, 0x8

    move-object v2, v4

    move-object v3, v5

    move v4, v6

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v1

    move-object v10, v11

    move-object v11, v13

    invoke-static/range {v2 .. v12}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->InstitutionPickerContent(Ldp;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-static {}, LQt0;->Y()V

    :cond_11
    :goto_7
    invoke-interface {v13}, LEt0;->w()LWm5;

    move-result-object v1

    if-nez v1, :cond_12

    goto :goto_8

    :cond_12
    new-instance v2, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$9;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionPickerScreen$9;-><init>(I)V

    invoke-interface {v1, v2}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_8
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

.method private static final InstitutionPickerScreen$lambda$0(LsP5;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;",
            ">;)",
            "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    return-object p0
.end method

.method private static final InstitutionResultTile(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;LEt0;I)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const v3, 0x13d0734

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v4, v2, 0xe

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x70

    if-nez v5, :cond_3

    invoke-interface {v15, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v4, 0x5b

    const/16 v6, 0x12

    if-ne v5, v6, :cond_5

    invoke-interface {v15}, LEt0;->b()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LEt0;->k()V

    move-object v0, v15

    goto/16 :goto_6

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, -0x1

    const-string v6, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionResultTile (InstitutionPickerScreen.kt:360)"

    invoke-static {v3, v4, v5, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->h()LK9$c;

    move-result-object v4

    sget-object v14, LgV2;->b0:LgV2$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v14, v5, v7, v6}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-interface {v15, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v15, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-interface {v15}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_7

    sget-object v5, LEt0;->a:LEt0$a;

    invoke-virtual {v5}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_8

    :cond_7
    new-instance v6, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionResultTile$1$1;

    invoke-direct {v6, v0, v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionResultTile$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V

    invoke-interface {v15, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_8
    move-object/from16 v20, v6

    check-cast v20, Lkotlin/jvm/functions/Function0;

    const/16 v21, 0x7

    const/16 v22, 0x0

    invoke-static/range {v16 .. v22}, Lak0;->e(LgV2;ZLjava/lang/String;LCb5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LgV2;

    move-result-object v5

    const/16 v6, 0x8

    int-to-float v13, v6

    invoke-static {v13}, Lk61;->g(F)F

    move-result v6

    const/16 v8, 0x18

    int-to-float v8, v8

    invoke-static {v8}, Lk61;->g(F)F

    move-result v8

    invoke-static {v5, v8, v6}, LND3;->j(LgV2;FF)LgV2;

    move-result-object v5

    const v6, 0x2952b718

    invoke-interface {v15, v6}, LEt0;->F(I)V

    sget-object v16, Llo;->a:Llo;

    invoke-virtual/range {v16 .. v16}, Llo;->f()Llo$d;

    move-result-object v6

    const/16 v8, 0x30

    invoke-static {v6, v4, v15, v8}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v4

    const v12, -0x4ee9b9da

    invoke-interface {v15, v12}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v15, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

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

    sget-object v17, LBt0;->M:LBt0$a;

    invoke-virtual/range {v17 .. v17}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v10

    invoke-static {v5}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v5

    invoke-interface {v15}, LEt0;->v()Llm;

    move-result-object v11

    instance-of v11, v11, Llm;

    if-nez v11, :cond_9

    invoke-static {}, Lyt0;->c()V

    :cond_9
    invoke-interface {v15}, LEt0;->h()V

    invoke-interface {v15}, LEt0;->t()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v15, v10}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    :cond_a
    invoke-interface {v15}, LEt0;->e()V

    :goto_4
    invoke-interface {v15}, LEt0;->L()V

    invoke-static {v15}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v10

    invoke-virtual/range {v17 .. v17}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v10, v4, v11}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v10, v6, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v10, v8, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v10, v9, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15}, LEt0;->q()V

    invoke-static {v15}, LMB5;->b(LEt0;)LEt0;

    move-result-object v4

    invoke-static {v4}, LMB5;->a(LEt0;)LMB5;

    move-result-object v4

    const/4 v11, 0x0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v5, v4, v15, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v10, 0x7ab4aae9

    invoke-interface {v15, v10}, LEt0;->F(I)V

    const v4, -0x286e2e7f

    invoke-interface {v15, v4}, LEt0;->F(I)V

    sget-object v4, Lad5;->a:Lad5;

    const v4, -0x499c3368

    invoke-interface {v15, v4}, LEt0;->F(I)V

    const/16 v4, 0x24

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    invoke-static {v14, v4}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v4

    const/4 v9, 0x6

    int-to-float v5, v9

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    invoke-static {v5}, Lcc5;->d(F)Lbc5;

    move-result-object v5

    invoke-static {v4, v5}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v4

    const-string v28, ""

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_c

    :cond_b
    move-object/from16 v4, v28

    :cond_c
    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalImageLoader()LU94;

    move-result-object v5

    invoke-interface {v15, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/uicore/image/StripeImageLoader;

    const/4 v6, 0x0

    sget-object v18, LBA0;->a:LBA0$a;

    invoke-virtual/range {v18 .. v18}, LBA0$a;->a()LBA0;

    move-result-object v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    new-instance v9, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionResultTile$2$1;

    invoke-direct {v9, v8}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionResultTile$2$1;-><init>(LgV2;)V

    const v10, 0x7b5f1e33

    invoke-static {v15, v10, v7, v9}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v22

    const/16 v23, 0x0

    sget v7, Lcom/stripe/android/uicore/image/StripeImageLoader;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    const v9, 0xc06180

    or-int v24, v7, v9

    const/16 v25, 0x160

    move-object v7, v8

    move-object/from16 v8, v18

    const/4 v10, 0x6

    move-object/from16 v9, v19

    move-object/from16 v10, v20

    move-object/from16 v11, v22

    move-object/from16 v12, v23

    move/from16 v18, v13

    move-object v13, v15

    move-object/from16 v29, v14

    move/from16 v14, v24

    move-object v0, v15

    move/from16 v15, v25

    invoke-static/range {v4 .. v15}, Lcom/stripe/android/uicore/image/StripeImageKt;->StripeImage(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static/range {v18 .. v18}, Lk61;->g(F)F

    move-result v4

    move-object/from16 v5, v29

    invoke-static {v5, v4}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v4

    const/4 v15, 0x6

    invoke-static {v4, v0, v15}, LDN5;->a(LgV2;LEt0;I)V

    const v4, -0x1cd0f17e

    invoke-interface {v0, v4}, LEt0;->F(I)V

    invoke-virtual/range {v16 .. v16}, Llo;->g()Llo$l;

    move-result-object v4

    invoke-virtual {v3}, LK9$a;->j()LK9$b;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v4, v3, v0, v6}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v3

    const v4, -0x4ee9b9da

    invoke-interface {v0, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v0, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v7

    invoke-interface {v0, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v8

    invoke-interface {v0, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LJq6;

    invoke-virtual/range {v17 .. v17}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v5}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v5

    invoke-interface {v0}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_d

    invoke-static {}, Lyt0;->c()V

    :cond_d
    invoke-interface {v0}, LEt0;->h()V

    invoke-interface {v0}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_e

    invoke-interface {v0, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    :cond_e
    invoke-interface {v0}, LEt0;->e()V

    :goto_5
    invoke-interface {v0}, LEt0;->L()V

    invoke-static {v0}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual/range {v17 .. v17}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v3, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v7, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v8, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v0}, LEt0;->q()V

    invoke-static {v0}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v3, v0, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v3, 0x7ab4aae9

    invoke-interface {v0, v3}, LEt0;->F(I)V

    const v3, -0x455f09d5

    invoke-interface {v0, v3}, LEt0;->F(I)V

    sget-object v3, LQm0;->a:LQm0;

    const v3, -0x11f9b4f2

    invoke-interface {v0, v3}, LEt0;->F(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    sget-object v3, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v3, v0, v15}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/16 v16, 0x0

    move v5, v15

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-virtual {v3, v0, v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBodyEmphasized()LG26;

    move-result-object v23

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x7ffa

    move-object/from16 v24, v0

    move v1, v5

    const/4 v5, 0x0

    invoke-static/range {v4 .. v27}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getUrl()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_f

    move-object/from16 v4, v28

    :cond_f
    invoke-virtual {v3, v0, v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v6

    invoke-virtual {v3, v0, v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getCaptionTight()LG26;

    move-result-object v23

    sget-object v1, Ln26;->a:Ln26$a;

    invoke-virtual {v1}, Ln26$a;->b()I

    move-result v19

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0xc30

    const/16 v27, 0x57fa

    move-object/from16 v24, v0

    invoke-static/range {v4 .. v27}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->f()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->f()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static {}, LQt0;->Y()V

    :cond_10
    :goto_6
    invoke-interface {v0}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_11

    goto :goto_7

    :cond_11
    new-instance v1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionResultTile$3;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v1, v3, v4, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$InstitutionResultTile$3;-><init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;I)V

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method private static final LoadedContent(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ldp;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
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
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/InstitutionResponse;",
            ">;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v7, p0

    move-object/from16 v8, p1

    move/from16 v9, p9

    const v0, 0x755deb6f

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v6

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.institutionpicker.LoadedContent (InstitutionPickerScreen.kt:142)"

    invoke-static {v0, v9, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {v6}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ne v0, v2, :cond_1

    new-instance v0, LF16;

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x7

    const/16 v16, 0x0

    move-object v10, v0

    invoke-direct/range {v10 .. v16}, LF16;-><init>(Ljava/lang/String;JLs26;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v4, v3, v4}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    invoke-interface {v6, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    move-object v5, v0

    check-cast v5, LEX2;

    invoke-static/range {p0 .. p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static/range {p0 .. p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    and-int/lit8 v10, v9, 0xe

    const v14, 0x1e7b2b64

    invoke-interface {v6, v14}, LEt0;->F(I)V

    invoke-interface {v6, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v6, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v2, v11

    invoke-interface {v6}, LEt0;->G()Ljava/lang/Object;

    move-result-object v11

    if-nez v2, :cond_2

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v11, v2, :cond_3

    :cond_2
    new-instance v11, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$LoadedContent$1$1;

    invoke-direct {v11, v7, v5, v4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$LoadedContent$1$1;-><init>(ZLEX2;Lkotlin/coroutines/Continuation;)V

    invoke-interface {v6, v11}, LEt0;->z(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {v6}, LEt0;->Q()V

    check-cast v11, Lkotlin/jvm/functions/Function2;

    or-int/lit8 v2, v10, 0x40

    invoke-static {v0, v11, v6, v2}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    const v0, -0x1cd0f17e

    invoke-interface {v6, v0}, LEt0;->F(I)V

    sget-object v2, LgV2;->b0:LgV2$a;

    sget-object v0, Llo;->a:Llo;

    invoke-virtual {v0}, Llo;->g()Llo$l;

    move-result-object v0

    sget-object v10, LK9;->a:LK9$a;

    invoke-virtual {v10}, LK9$a;->j()LK9$b;

    move-result-object v10

    const/4 v15, 0x0

    invoke-static {v0, v10, v6, v15}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v0

    const v10, -0x4ee9b9da

    invoke-interface {v6, v10}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v10

    invoke-interface {v6, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v11

    invoke-interface {v6, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v12

    invoke-interface {v6, v12}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LJq6;

    sget-object v13, LBt0;->M:LBt0$a;

    invoke-virtual {v13}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v14

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v3

    invoke-interface {v6}, LEt0;->v()Llm;

    move-result-object v4

    instance-of v4, v4, Llm;

    if-nez v4, :cond_4

    invoke-static {}, Lyt0;->c()V

    :cond_4
    invoke-interface {v6}, LEt0;->h()V

    invoke-interface {v6}, LEt0;->t()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v6, v14}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_5
    invoke-interface {v6}, LEt0;->e()V

    :goto_0
    invoke-interface {v6}, LEt0;->L()V

    invoke-static {v6}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v4

    invoke-virtual {v13}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v4, v0, v14}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v13}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v4, v10, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v13}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v4, v11, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v13}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v4, v12, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v6}, LEt0;->q()V

    invoke-static {v6}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v0, v6, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v6, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v6, v0}, LEt0;->F(I)V

    sget-object v34, LQm0;->a:LQm0;

    const v0, 0xffea665

    invoke-interface {v6, v0}, LEt0;->F(I)V

    const v0, -0x733df3a5

    invoke-interface {v6, v0}, LEt0;->F(I)V

    const/16 v0, 0x10

    const/4 v4, 0x1

    const/4 v3, 0x6

    if-nez v7, :cond_6

    int-to-float v10, v0

    invoke-static {v10}, Lk61;->g(F)F

    move-result v10

    invoke-static {v2, v10}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v10

    invoke-static {v10, v6, v3}, LDN5;->a(LgV2;LEt0;I)V

    const/16 v10, 0x18

    int-to-float v10, v10

    invoke-static {v10}, Lk61;->g(F)F

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v13, 0x0

    invoke-static {v2, v10, v11, v12, v13}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v10

    invoke-static {v10, v11, v4, v13}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v11

    sget v10, Lcom/stripe/android/financialconnections/R$string;->stripe_institutionpicker_pane_select_bank:I

    invoke-static {v10, v6, v15}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v10

    sget-object v12, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v12, v6, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v12

    invoke-virtual {v12}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitle()LG26;

    move-result-object v29

    const-wide/16 v12, 0x0

    const-wide/16 v16, 0x0

    move/from16 v35, v15

    const v4, 0x1e7b2b64

    move-wide/from16 v14, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v31, 0x30

    const/16 v32, 0x0

    const/16 v33, 0x7ffc

    move-object/from16 v30, v6

    invoke-static/range {v10 .. v33}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    goto :goto_1

    :cond_6
    move/from16 v35, v15

    const v4, 0x1e7b2b64

    :goto_1
    invoke-interface {v6}, LEt0;->Q()V

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    invoke-static {v2, v0}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v0

    invoke-static {v0, v6, v3}, LDN5;->a(LgV2;LEt0;I)V

    const v0, -0x733df1e7

    invoke-interface {v6, v0}, LEt0;->F(I)V

    invoke-virtual/range {p6 .. p6}, Ldp;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->getSearchDisabled()Z

    move-result v0

    if-nez v0, :cond_7

    const/4 v15, 0x1

    goto :goto_2

    :cond_7
    move/from16 v15, v35

    :goto_2
    if-eqz v15, :cond_a

    invoke-static {v5}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->LoadedContent$lambda$3(LEX2;)LF16;

    move-result-object v0

    invoke-interface {v6, v4}, LEt0;->F(I)V

    invoke-interface {v6, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v6, v8}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {v6}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_8

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_9

    :cond_8
    new-instance v4, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$LoadedContent$2$1$1;

    invoke-direct {v4, v8, v5}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$LoadedContent$2$1$1;-><init>(Lkotlin/jvm/functions/Function1;LEX2;)V

    invoke-interface {v6, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_9
    invoke-interface {v6}, LEt0;->Q()V

    move-object v1, v4

    check-cast v1, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v3, v9, 0x3

    and-int/lit16 v3, v3, 0x380

    shl-int/lit8 v4, v9, 0x3

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    shl-int/lit8 v4, v9, 0xc

    const v10, 0xe000

    and-int/2addr v4, v10

    or-int v10, v3, v4

    move-object v11, v2

    move-object/from16 v2, p3

    move-object/from16 v3, p2

    const/4 v12, 0x1

    move/from16 v4, p0

    move-object v13, v5

    move-object v5, v6

    move-object v15, v6

    move v6, v10

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->FinancialConnectionsSearchRow(LF16;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLEt0;I)V

    goto :goto_3

    :cond_a
    move-object v11, v2

    move-object v13, v5

    move-object v15, v6

    const/4 v12, 0x1

    :goto_3
    invoke-interface {v15}, LEt0;->Q()V

    invoke-static {v13}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->LoadedContent$lambda$3(LEX2;)LF16;

    move-result-object v0

    invoke-virtual {v0}, LF16;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/2addr v0, v12

    if-eqz v0, :cond_c

    const v0, -0x733df01c    # -2.9899997E-31f

    invoke-interface {v15, v0}, LEt0;->F(I)V

    invoke-static {v13}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->LoadedContent$lambda$3(LEX2;)LF16;

    move-result-object v0

    invoke-virtual {v0}, LF16;->h()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p6 .. p6}, Ldp;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState$Payload;->getAllowManualEntry()Z

    move-result v0

    move v14, v0

    goto :goto_4

    :cond_b
    move/from16 v14, v35

    :goto_4
    shr-int/lit8 v0, v9, 0xc

    and-int/lit8 v1, v0, 0xe

    and-int/lit8 v2, v0, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0x1c00

    or-int v16, v1, v0

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    move-object/from16 v13, p7

    move-object v0, v15

    invoke-static/range {v10 .. v16}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->SearchInstitutionsList(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLEt0;I)V

    invoke-interface {v0}, LEt0;->Q()V

    move-object/from16 v6, p5

    move-object/from16 v10, p6

    goto :goto_5

    :cond_c
    move-object v0, v15

    const v1, -0x733deeb6

    invoke-interface {v0, v1}, LEt0;->F(I)V

    const/high16 v17, 0x3f800000    # 1.0f

    const/16 v18, 0x0

    const/16 v19, 0x2

    const/16 v20, 0x0

    move-object/from16 v15, v34

    move-object/from16 v16, v11

    invoke-static/range {v15 .. v20}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v1

    shr-int/lit8 v2, v9, 0x9

    and-int/lit16 v2, v2, 0x380

    or-int/lit8 v2, v2, 0x40

    move-object/from16 v6, p5

    move-object/from16 v10, p6

    invoke-static {v1, v10, v6, v0, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->FeaturedInstitutionsGrid(LgV2;Ldp;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-interface {v0}, LEt0;->Q()V

    :goto_5
    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->f()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {}, LQt0;->Y()V

    :cond_d
    invoke-interface {v0}, LEt0;->w()LWm5;

    move-result-object v11

    if-nez v11, :cond_e

    goto :goto_6

    :cond_e
    new-instance v12, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$LoadedContent$3;

    move-object v0, v12

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$LoadedContent$3;-><init>(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ldp;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v11, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void
.end method

.method private static final LoadedContent$lambda$3(LEX2;)LF16;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LF16;",
            ">;)",
            "LF16;"
        }
    .end annotation

    invoke-interface {p0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF16;

    return-object p0
.end method

.method private static final LoadedContent$lambda$4(LEX2;LF16;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LF16;",
            ">;",
            "LF16;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, LEX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final NoSearchMode(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;LEt0;II)V
    .locals 5

    const v0, 0x502bbe67

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

    sget-object p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;->Companion:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->noSearchMode()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object p0

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.institutionpicker.NoSearchMode (InstitutionPickerScreen.kt:600)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$NoSearchMode$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$NoSearchMode$1;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)V

    const v1, 0x11832a77

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$NoSearchMode$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$NoSearchMode$2;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;II)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method private static final SearchInstitutionsFailedRow(ZLkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const v3, -0x81721a

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v4, v2, 0xe

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LEt0;->o(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x70

    if-nez v5, :cond_3

    invoke-interface {v15, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v4, 0x5b

    const/16 v6, 0x12

    if-ne v5, v6, :cond_5

    invoke-interface {v15}, LEt0;->b()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LEt0;->k()V

    move-object/from16 v28, v15

    goto/16 :goto_6

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, -0x1

    const-string v6, "com.stripe.android.financialconnections.features.institutionpicker.SearchInstitutionsFailedRow (InstitutionPickerScreen.kt:313)"

    invoke-static {v3, v4, v5, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    sget-object v3, LgV2;->b0:LgV2$a;

    const/4 v14, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x0

    invoke-static {v3, v14, v12, v11}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    const/16 v5, 0x18

    int-to-float v5, v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    const/16 v6, 0x8

    int-to-float v6, v6

    invoke-static {v6}, Lk61;->g(F)F

    move-result v7

    invoke-static {v4, v5, v7}, LND3;->j(LgV2;FF)LgV2;

    move-result-object v4

    sget-object v5, LK9;->a:LK9$a;

    invoke-virtual {v5}, LK9$a;->g()LK9$b;

    move-result-object v5

    sget-object v7, Llo;->a:Llo;

    invoke-static {v6}, Lk61;->g(F)F

    move-result v6

    invoke-virtual {v7, v6}, Llo;->n(F)Llo$e;

    move-result-object v6

    const v7, -0x1cd0f17e

    invoke-interface {v15, v7}, LEt0;->F(I)V

    const/16 v7, 0x36

    invoke-static {v6, v5, v15, v7}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v5

    const v6, -0x4ee9b9da

    invoke-interface {v15, v6}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v15, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v7

    invoke-interface {v15, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v8

    invoke-interface {v15, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LJq6;

    sget-object v9, LBt0;->M:LBt0$a;

    invoke-virtual {v9}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v10

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface {v15}, LEt0;->v()Llm;

    move-result-object v11

    instance-of v11, v11, Llm;

    if-nez v11, :cond_7

    invoke-static {}, Lyt0;->c()V

    :cond_7
    invoke-interface {v15}, LEt0;->h()V

    invoke-interface {v15}, LEt0;->t()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v15, v10}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    :cond_8
    invoke-interface {v15}, LEt0;->e()V

    :goto_4
    invoke-interface {v15}, LEt0;->L()V

    invoke-static {v15}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v10

    invoke-virtual {v9}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v10, v5, v11}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v10, v6, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v10, v7, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v10, v8, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15}, LEt0;->q()V

    invoke-static {v15}, LMB5;->b(LEt0;)LEt0;

    move-result-object v5

    invoke-static {v5}, LMB5;->a(LEt0;)LMB5;

    move-result-object v5

    const/4 v11, 0x0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v5, v15, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x7ab4aae9

    invoke-interface {v15, v4}, LEt0;->F(I)V

    const v4, -0x455f09d5

    invoke-interface {v15, v4}, LEt0;->F(I)V

    sget-object v4, LQm0;->a:LQm0;

    const v4, 0x14fbc5c

    invoke-interface {v15, v4}, LEt0;->F(I)V

    sget v4, Lcom/stripe/android/financialconnections/R$drawable;->stripe_ic_warning:I

    invoke-static {v4, v15, v11}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v4

    const-string v5, "Warning icon"

    const/4 v6, 0x0

    sget-object v10, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v9, 0x6

    invoke-virtual {v10, v15, v9}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v7

    const/16 v16, 0x38

    const/16 v17, 0x4

    move v13, v9

    move-object v9, v15

    move-object v14, v10

    move/from16 v10, v16

    move v12, v11

    move/from16 v11, v17

    invoke-static/range {v4 .. v11}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    sget v4, Lcom/stripe/android/financialconnections/R$string;->stripe_institutionpicker_pane_error_title:I

    invoke-static {v4, v15, v12}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v15, v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBody()LG26;

    move-result-object v23

    invoke-virtual {v14, v15, v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v6

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v17, 0x0

    move-object/from16 v12, v17

    const-wide/16 v16, 0x0

    move-object/from16 v31, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move-object/from16 p2, v15

    move-object/from16 v15, v16

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x7ffa

    move-object/from16 v24, p2

    invoke-static/range {v4 .. v27}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    if-eqz v0, :cond_b

    const v4, 0x3fa8239d

    move-object/from16 v15, p2

    invoke-interface {v15, v4}, LEt0;->F(I)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v3, v5, v4, v6}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v7

    new-instance v4, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;

    sget v3, Lcom/stripe/android/financialconnections/R$string;->stripe_institutionpicker_pane_error_desc_manual_entry:I

    const/4 v5, 0x2

    invoke-direct {v4, v3, v6, v5, v6}, Lcom/stripe/android/financialconnections/ui/TextResource$StringId;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v31

    const/4 v5, 0x6

    invoke-virtual {v3, v15, v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBody()LG26;

    move-result-object v16

    sget-object v6, Lr06;->b:Lr06$a;

    invoke-virtual {v6}, Lr06$a;->a()I

    move-result v6

    invoke-virtual {v3, v15, v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

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

    invoke-static {v6}, Lr06;->g(I)Lr06;

    move-result-object v35

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const v40, 0x3bffe

    const/16 v41, 0x0

    invoke-static/range {v16 .. v41}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v6

    const v3, 0x44faf204

    invoke-interface {v15, v3}, LEt0;->F(I)V

    invoke-interface {v15, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v15}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_9

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_a

    :cond_9
    new-instance v5, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsFailedRow$1$1$1;

    invoke-direct {v5, v1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsFailedRow$1$1$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-interface {v15, v5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_a
    invoke-interface {v15}, LEt0;->Q()V

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    const/16 v10, 0xc08

    const/16 v11, 0x10

    move-object v9, v15

    invoke-static/range {v4 .. v11}, Lcom/stripe/android/financialconnections/ui/components/TextKt;->AnnotatedText(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;LG26;LgV2;Ljava/util/Map;LEt0;II)V

    invoke-interface {v15}, LEt0;->Q()V

    move-object/from16 v28, v15

    goto :goto_5

    :cond_b
    move-object/from16 v15, p2

    move-object/from16 v3, v31

    const/4 v5, 0x6

    const v4, 0x3fa825b6

    invoke-interface {v15, v4}, LEt0;->F(I)V

    sget v4, Lcom/stripe/android/financialconnections/R$string;->stripe_institutionpicker_pane_error_desc:I

    const/4 v6, 0x0

    invoke-static {v4, v15, v6}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v15, v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBody()LG26;

    move-result-object v23

    invoke-virtual {v3, v15, v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v6

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v3, 0x0

    move-object/from16 v28, v15

    move-object v15, v3

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x7ffa

    move-object/from16 v24, v28

    invoke-static/range {v4 .. v27}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface/range {v28 .. v28}, LEt0;->Q()V

    :goto_5
    invoke-interface/range {v28 .. v28}, LEt0;->Q()V

    invoke-interface/range {v28 .. v28}, LEt0;->Q()V

    invoke-interface/range {v28 .. v28}, LEt0;->Q()V

    invoke-interface/range {v28 .. v28}, LEt0;->f()V

    invoke-interface/range {v28 .. v28}, LEt0;->Q()V

    invoke-interface/range {v28 .. v28}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-static {}, LQt0;->Y()V

    :cond_c
    :goto_6
    invoke-interface/range {v28 .. v28}, LEt0;->w()LWm5;

    move-result-object v3

    if-nez v3, :cond_d

    goto :goto_7

    :cond_d
    new-instance v4, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsFailedRow$2;

    invoke-direct {v4, v0, v1, v2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsFailedRow$2;-><init>(ZLkotlin/jvm/functions/Function0;I)V

    invoke-interface {v3, v4}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method private static final SearchInstitutionsList(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLEt0;I)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/InstitutionResponse;",
            ">;>;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move/from16 v11, p6

    const v0, -0x2e1e579a

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v1, v11, 0xe

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v1, :cond_1

    invoke-interface {v15, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_1
    move v1, v11

    :goto_1
    and-int/lit8 v4, v11, 0x70

    const/16 v5, 0x10

    if-nez v4, :cond_3

    invoke-interface {v15, v8}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    move v4, v5

    :goto_2
    or-int/2addr v1, v4

    :cond_3
    and-int/lit16 v4, v11, 0x380

    if-nez v4, :cond_5

    invoke-interface {v15, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v1, v4

    :cond_5
    and-int/lit16 v4, v11, 0x1c00

    if-nez v4, :cond_7

    invoke-interface {v15, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v1, v4

    :cond_7
    const v4, 0xe000

    and-int/2addr v4, v11

    move/from16 v14, p4

    if-nez v4, :cond_9

    invoke-interface {v15, v14}, LEt0;->o(Z)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x4000

    goto :goto_5

    :cond_8
    const/16 v4, 0x2000

    :goto_5
    or-int/2addr v1, v4

    :cond_9
    move v4, v1

    const v1, 0xb6db

    and-int/2addr v1, v4

    const/16 v6, 0x2492

    if-ne v1, v6, :cond_b

    invoke-interface {v15}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_6

    :cond_a
    invoke-interface {v15}, LEt0;->k()V

    move-object v1, v15

    goto/16 :goto_8

    :cond_b
    :goto_6
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_c

    const/4 v1, -0x1

    const-string v6, "com.stripe.android.financialconnections.features.institutionpicker.SearchInstitutionsList (InstitutionPickerScreen.kt:252)"

    invoke-static {v0, v4, v1, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_c
    sget-object v0, LK9;->a:LK9$a;

    invoke-virtual {v0}, LK9$a;->g()LK9$b;

    move-result-object v17

    const/16 v18, 0x0

    int-to-float v0, v5

    invoke-static {v0}, Lk61;->g(F)F

    move-result v19

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0xd

    const/16 v23, 0x0

    invoke-static/range {v18 .. v23}, LND3;->e(FFFFILjava/lang/Object;)LPD3;

    move-result-object v16

    const/4 v12, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v0, 0x5

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v7, v1, v5

    invoke-static/range {p4 .. p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const/16 v22, 0x1

    aput-object v6, v1, v22

    aput-object v10, v1, v3

    const/4 v3, 0x3

    aput-object v9, v1, v3

    aput-object v8, v1, v2

    const v2, -0x21de6e89

    invoke-interface {v15, v2}, LEt0;->F(I)V

    move v2, v5

    :goto_7
    if-ge v5, v0, :cond_d

    aget-object v3, v1, v5

    invoke-interface {v15, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_d
    invoke-interface {v15}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez v2, :cond_e

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_f

    :cond_e
    new-instance v6, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1;

    move-object v0, v6

    move-object/from16 v1, p0

    move/from16 v2, p4

    move-object/from16 v3, p3

    move-object/from16 v5, p2

    move-object v13, v6

    move-object/from16 v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$1$1;-><init>(Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;ILjava/lang/String;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15, v13}, LEt0;->z(Ljava/lang/Object;)V

    move-object v0, v13

    :cond_f
    invoke-interface {v15}, LEt0;->Q()V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const v22, 0x30180

    const/16 v23, 0xdb

    const/4 v1, 0x0

    move-object v13, v1

    move-object/from16 v14, v16

    move-object v1, v15

    move/from16 v15, v18

    move-object/from16 v16, v19

    move-object/from16 v18, v20

    move/from16 v19, v21

    move-object/from16 v20, v0

    move-object/from16 v21, v1

    invoke-static/range {v12 .. v23}, Lgn2;->a(LgV2;LCo2;LPD3;ZLlo$l;LK9$b;Lcu1;ZLkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LQt0;->Y()V

    :cond_10
    :goto_8
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v12

    if-nez v12, :cond_11

    goto :goto_9

    :cond_11
    new-instance v13, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$2;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchInstitutionsList$2;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZI)V

    invoke-interface {v12, v13}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_9
    return-void
.end method

.method public static final SearchModeFailed(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;LEt0;II)V
    .locals 5

    const v0, -0x40c83395

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

    sget-object p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;->Companion:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->searchModeFailed()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object p0

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.institutionpicker.SearchModeFailed (InstitutionPickerScreen.kt:562)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeFailed$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeFailed$1;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)V

    const v1, -0x10254f85

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeFailed$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeFailed$2;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;II)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method public static final SearchModeNoQuery(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;LEt0;II)V
    .locals 5

    const v0, -0x5909a90d

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

    sget-object p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;->Companion:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->searchModeNoQuery()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object p0

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.institutionpicker.SearchModeNoQuery (InstitutionPickerScreen.kt:581)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeNoQuery$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeNoQuery$1;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)V

    const v1, -0x75500b1d

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeNoQuery$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeNoQuery$2;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;II)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method public static final SearchModeNoResults(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;LEt0;II)V
    .locals 5

    const v0, -0x7d17117b

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

    sget-object p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;->Companion:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->searchModeNoResults()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object p0

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.institutionpicker.SearchModeNoResults (InstitutionPickerScreen.kt:543)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeNoResults$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeNoResults$1;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)V

    const v1, 0x5eb2d075

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeNoResults$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeNoResults$2;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;II)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method public static final SearchModeSearchingInstitutions(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;LEt0;II)V
    .locals 5

    const v0, 0x5c7d77e5

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

    sget-object p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;->Companion:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->searchModeSearchingInstitutions()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object p0

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.institutionpicker.SearchModeSearchingInstitutions (InstitutionPickerScreen.kt:505)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeSearchingInstitutions$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeSearchingInstitutions$1;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)V

    const v1, -0x69ac0e2b

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeSearchingInstitutions$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeSearchingInstitutions$2;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;II)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method public static final SearchModeWithResults(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;LEt0;II)V
    .locals 5

    const v0, 0x6031150a

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

    sget-object p0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates;->Companion:Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerStates$Companion;->searchModeWithResults()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object p0

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.institutionpicker.SearchModeWithResults (InstitutionPickerScreen.kt:524)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeWithResults$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeWithResults$1;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)V

    const v1, 0x710a3afa

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeWithResults$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt$SearchModeWithResults$2;-><init>(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;II)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method public static final synthetic access$FeaturedInstitutionsGrid(LgV2;Ldp;Lkotlin/jvm/functions/Function2;LEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->FeaturedInstitutionsGrid(LgV2;Ldp;Lkotlin/jvm/functions/Function2;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$FinancialConnectionsSearchRow(LF16;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->FinancialConnectionsSearchRow(LF16;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLEt0;I)V

    return-void
.end method

.method public static final synthetic access$InstitutionPickerContent(Ldp;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p10}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->InstitutionPickerContent(Ldp;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$InstitutionPickerScreen$lambda$0(LsP5;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->InstitutionPickerScreen$lambda$0(LsP5;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$InstitutionResultTile(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;LEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->InstitutionResultTile(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$LoadedContent(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ldp;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->LoadedContent(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ldp;Lkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$LoadedContent$lambda$3(LEX2;)LF16;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->LoadedContent$lambda$3(LEX2;)LF16;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$LoadedContent$lambda$4(LEX2;LF16;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->LoadedContent$lambda$4(LEX2;LF16;)V

    return-void
.end method

.method public static final synthetic access$SearchInstitutionsFailedRow(ZLkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->SearchInstitutionsFailedRow(ZLkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$SearchInstitutionsList(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerScreenKt;->SearchInstitutionsList(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLEt0;I)V

    return-void
.end method
