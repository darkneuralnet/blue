.class public final Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u008d\u0001\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00000\n2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00000\n2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0007H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001aw\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00000\n2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00000\nH\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001aG\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000f2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00000\nH\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001aU\u0010\u001d\u001a\u00020\u00002\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00000\nH\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0002\u001a9\u0010\"\u001a\u00020\u00002\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00072\u0006\u0010!\u001a\u00020 2\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00000\nH\u0003\u00a2\u0006\u0004\u0008\"\u0010#\u001a\u001f\u0010\'\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008\'\u0010(\u001a\u000f\u0010)\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008)\u0010\u0002\"\u0014\u0010+\u001a\u00020*8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008+\u0010,\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008-\u0010,\u00a8\u0006."
    }
    d2 = {
        "",
        "PartnerAuthScreen",
        "(LEt0;I)V",
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;",
        "state",
        "LGU2;",
        "modalBottomSheetState",
        "Lkotlin/Function0;",
        "onContinueClick",
        "onSelectAnotherBank",
        "Lkotlin/Function1;",
        "",
        "onClickableTextClick",
        "onEnterDetailsManually",
        "onCloseClick",
        "",
        "onCloseFromErrorClick",
        "onConfirmModalClick",
        "PartnerAuthScreenContent",
        "(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "PartnerAuthScreenMainContent",
        "(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "error",
        "ErrorContent",
        "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "Ldp;",
        "authenticationStatus",
        "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;",
        "payload",
        "LoadedContent",
        "(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "BrowserLoadingContent",
        "Lcom/stripe/android/financialconnections/domain/OauthPrepane;",
        "content",
        "InstitutionalPrePaneContent",
        "(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/domain/OauthPrepane;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "LgV2;",
        "modifier",
        "gifUrl",
        "GifWebView",
        "(LgV2;Ljava/lang/String;LEt0;I)V",
        "InstitutionalPrepaneContentPreview",
        "",
        "PHONE_BACKGROUND_WIDTH_DP",
        "I",
        "PHONE_BACKGROUND_HEIGHT_DP",
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
        "SMAP\nPartnerAuthScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartnerAuthScreen.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,538:1\n119#2,4:539\n123#2,4:544\n57#2,12:548\n69#2,8:566\n79#2:577\n80#2,5:580\n53#2:586\n54#2,15:588\n69#2,8:609\n79#2:620\n80#2,5:626\n76#3:543\n76#3:585\n76#3:587\n76#3:656\n76#3:704\n76#3:732\n76#3:742\n76#3:778\n83#4,3:560\n50#4:578\n49#4:579\n83#4,3:603\n50#4:621\n49#4:622\n25#4:638\n460#4,13:668\n473#4,3:682\n460#4,13:716\n460#4,13:754\n460#4,13:790\n473#4,3:809\n473#4,3:817\n473#4,3:822\n1057#5,3:563\n1060#5,3:574\n1057#5,3:606\n1060#5,3:617\n1057#5,3:623\n1060#5,3:631\n1057#5,3:639\n1060#5,3:645\n1057#5,6:687\n474#6,4:634\n478#6,2:642\n482#6:648\n474#7:644\n154#8:649\n154#8:693\n154#8:694\n154#8:695\n154#8:696\n154#8:730\n154#8:731\n154#8:733\n154#8:734\n154#8:770\n154#8:804\n154#8:805\n154#8:806\n154#8:807\n154#8:808\n154#8:814\n154#8:816\n68#9,5:650\n73#9:681\n77#9:686\n67#9,6:771\n73#9:803\n77#9:813\n75#10:655\n76#10,11:657\n89#10:685\n75#10:703\n76#10,11:705\n75#10:741\n76#10,11:743\n75#10:777\n76#10,11:779\n89#10:812\n89#10:820\n89#10:825\n74#11,6:697\n80#11:729\n74#11,6:735\n80#11:767\n84#11:821\n84#11:826\n1864#12,2:768\n1866#12:815\n*S KotlinDebug\n*F\n+ 1 PartnerAuthScreen.kt\ncom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt\n*L\n98#1:539,4\n98#1:544,4\n98#1:548,12\n98#1:566,8\n98#1:577\n98#1:580,5\n104#1:586\n104#1:588,15\n104#1:609,8\n104#1:620\n104#1:626,5\n98#1:543\n101#1:585\n104#1:587\n289#1:656\n306#1:704\n323#1:732\n337#1:742\n347#1:778\n98#1:560,3\n98#1:578\n98#1:579\n104#1:603,3\n104#1:621\n104#1:622\n108#1:638\n289#1:668,13\n289#1:682,3\n306#1:716,13\n337#1:754,13\n347#1:790,13\n347#1:809,3\n337#1:817,3\n306#1:822,3\n98#1:563,3\n98#1:574,3\n104#1:606,3\n104#1:617,3\n104#1:623,3\n104#1:631,3\n108#1:639,3\n108#1:645,3\n302#1:687,6\n108#1:634,4\n108#1:642,2\n108#1:648\n108#1:644\n160#1:649\n310#1:693\n311#1:694\n312#1:695\n313#1:696\n318#1:730\n319#1:731\n327#1:733\n339#1:734\n351#1:770\n362#1:804\n363#1:805\n368#1:806\n369#1:807\n370#1:808\n389#1:814\n394#1:816\n289#1:650,5\n289#1:681\n289#1:686\n347#1:771,6\n347#1:803\n347#1:813\n289#1:655\n289#1:657,11\n289#1:685\n306#1:703\n306#1:705,11\n337#1:741\n337#1:743,11\n347#1:777\n347#1:779,11\n347#1:812\n337#1:820\n306#1:825\n306#1:697,6\n306#1:729\n337#1:735,6\n337#1:767\n337#1:821\n306#1:826\n344#1:768,2\n344#1:815\n*E\n"
    }
.end annotation


# static fields
.field private static final PHONE_BACKGROUND_HEIGHT_DP:I = 0x108

.field private static final PHONE_BACKGROUND_WIDTH_DP:I = 0x110


# direct methods
.method private static final BrowserLoadingContent(LEt0;I)V
    .locals 10

    const v0, -0x583234e1

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

    const-string v2, "com.stripe.android.financialconnections.features.partnerauth.BrowserLoadingContent (PartnerAuthScreen.kt:287)"

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

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v1, v2, p0, v3}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v1

    const v4, -0x4ee9b9da

    invoke-interface {p0, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {p0, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {p0, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {p0, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    sget-object v7, LBt0;->M:LBt0$a;

    invoke-virtual {v7}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {p0}, LEt0;->v()Llm;

    move-result-object v9

    instance-of v9, v9, Llm;

    if-nez v9, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {p0}, LEt0;->h()V

    invoke-interface {p0}, LEt0;->t()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {p0, v8}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface {p0}, LEt0;->e()V

    :goto_1
    invoke-interface {p0}, LEt0;->L()V

    invoke-static {p0}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v8

    invoke-virtual {v7}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v8, v1, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v8, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v8, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v8, v6, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p0}, LEt0;->q()V

    invoke-static {p0}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, p0, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {p0, v0}, LEt0;->F(I)V

    const v0, -0x7f65a980

    invoke-interface {p0, v0}, LEt0;->F(I)V

    sget-object v0, Lf10;->a:Lf10;

    const v0, 0xab186d9

    invoke-interface {p0, v0}, LEt0;->F(I)V

    const/4 v1, 0x0

    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v0, p0, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getIconBrand-0d7_KjU()J

    move-result-wide v2

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x5

    move-object v5, p0

    invoke-static/range {v1 .. v7}, LK74;->b(LgV2;JFLEt0;II)V

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$BrowserLoadingContent$2;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$BrowserLoadingContent$2;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_3
    return-void
.end method

.method public static final ErrorContent(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSelectAnotherBank"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEnterDetailsManually"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCloseFromErrorClick"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x365b73aa

    invoke-interface {p4, v0}, LEt0;->u(I)LEt0;

    move-result-object p4

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.partnerauth.ErrorContent (PartnerAuthScreen.kt:227)"

    invoke-static {v0, p5, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    instance-of v0, p0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;

    if-eqz v0, :cond_1

    const v0, 0x715a69bf

    invoke-interface {p4, v0}, LEt0;->F(I)V

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;

    and-int/lit8 v1, p5, 0x70

    and-int/lit16 v2, p5, 0x380

    or-int/2addr v1, v2

    invoke-static {v0, p1, p2, p4, v1}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->InstitutionPlannedDowntimeErrorContent(Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-interface {p4}, LEt0;->Q()V

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;

    if-eqz v0, :cond_2

    const v0, 0x715a6ab4

    invoke-interface {p4, v0}, LEt0;->F(I)V

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;

    and-int/lit8 v1, p5, 0x70

    and-int/lit16 v2, p5, 0x380

    or-int/2addr v1, v2

    invoke-static {v0, p1, p2, p4, v1}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->InstitutionUnplannedDowntimeErrorContent(Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-interface {p4}, LEt0;->Q()V

    goto :goto_0

    :cond_2
    const v0, 0x715a6b8b

    invoke-interface {p4, v0}, LEt0;->F(I)V

    shr-int/lit8 v0, p5, 0x6

    and-int/lit8 v0, v0, 0x70

    or-int/lit8 v0, v0, 0x8

    invoke-static {p0, p3, p4, v0}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->UnclassifiedErrorContent(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-interface {p4}, LEt0;->Q()V

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p4}, LEt0;->w()LWm5;

    move-result-object p4

    if-nez p4, :cond_4

    goto :goto_1

    :cond_4
    new-instance v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$ErrorContent$1;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$ErrorContent$1;-><init>(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {p4, v6}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method private static final GifWebView(LgV2;Ljava/lang/String;LEt0;I)V
    .locals 16

    move-object/from16 v12, p0

    move-object/from16 v13, p1

    move/from16 v14, p3

    const v0, -0x162742b1

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v1, v14, 0xe

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {v15, v12}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, v14

    goto :goto_1

    :cond_1
    move v1, v14

    :goto_1
    and-int/lit8 v3, v14, 0x70

    if-nez v3, :cond_3

    invoke-interface {v15, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit8 v3, v1, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_5

    invoke-interface {v15}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LEt0;->k()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.financialconnections.features.partnerauth.GifWebView (PartnerAuthScreen.kt:428)"

    invoke-static {v0, v1, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "<html><body><img style=\"width: 100%\" src=\""

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\"></body></html>"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v3, v15, v4, v2}, LuA6;->i(Ljava/lang/String;Ljava/lang/String;LEt0;II)LBA6;

    move-result-object v0

    const/4 v2, 0x0

    sget-object v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$GifWebView$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$GifWebView$1;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/lit16 v10, v1, 0x6000

    const/16 v11, 0x1ec

    move-object/from16 v1, p0

    move-object v9, v15

    invoke-static/range {v0 .. v11}, LuA6;->a(LBA6;LgV2;ZLvA6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lx2;Lw2;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_4
    invoke-interface {v15}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_8

    goto :goto_5

    :cond_8
    new-instance v1, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$GifWebView$2;

    invoke-direct {v1, v12, v13, v14}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$GifWebView$2;-><init>(LgV2;Ljava/lang/String;I)V

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method private static final InstitutionalPrePaneContent(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/domain/OauthPrepane;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 56
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/financialconnections/domain/OauthPrepane;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move/from16 v1, p4

    const v2, 0x41280d88

    move-object/from16 v3, p3

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v15

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.financialconnections.features.partnerauth.InstitutionalPrePaneContent (PartnerAuthScreen.kt:296)"

    invoke-static {v2, v1, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v15, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v15}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v3, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/stripe/android/financialconnections/ui/sdui/ServerDrivenUiKt;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v2

    invoke-direct {v3, v2}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    invoke-interface {v15, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2
    move-object v2, v3

    check-cast v2, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    const/4 v14, 0x0

    const/4 v13, 0x1

    invoke-static {v14, v15, v14, v13}, LUp5;->a(ILEt0;II)LXp5;

    move-result-object v16

    sget-object v12, LgV2;->b0:LgV2$a;

    const/4 v11, 0x0

    const/4 v10, 0x0

    invoke-static {v12, v11, v13, v10}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v3

    const/16 v4, 0x10

    int-to-float v9, v4

    invoke-static {v9}, Lk61;->g(F)F

    move-result v4

    const/16 v5, 0x18

    int-to-float v5, v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v6

    invoke-static {v5}, Lk61;->g(F)F

    move-result v7

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    invoke-static {v3, v6, v4, v7, v5}, LND3;->l(LgV2;FFFF)LgV2;

    move-result-object v3

    const v8, -0x1cd0f17e

    invoke-interface {v15, v8}, LEt0;->F(I)V

    sget-object v17, Llo;->a:Llo;

    invoke-virtual/range {v17 .. v17}, Llo;->g()Llo$l;

    move-result-object v4

    sget-object v18, LK9;->a:LK9$a;

    invoke-virtual/range {v18 .. v18}, LK9$a;->j()LK9$b;

    move-result-object v5

    invoke-static {v4, v5, v15, v14}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v4

    const v7, -0x4ee9b9da

    invoke-interface {v15, v7}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v15, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {v15, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v7

    invoke-interface {v15, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJq6;

    sget-object v19, LBt0;->M:LBt0$a;

    invoke-virtual/range {v19 .. v19}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    invoke-static {v3}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v3

    invoke-interface {v15}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {v15}, LEt0;->h()V

    invoke-interface {v15}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v15, v8}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_4
    invoke-interface {v15}, LEt0;->e()V

    :goto_0
    invoke-interface {v15}, LEt0;->L()V

    invoke-static {v15}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v8

    invoke-virtual/range {v19 .. v19}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v8, v4, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v5, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v6, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v7, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15}, LEt0;->q()V

    invoke-static {v15}, LMB5;->b(LEt0;)LEt0;

    move-result-object v4

    invoke-static {v4}, LMB5;->a(LEt0;)LMB5;

    move-result-object v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v4, v15, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v10, 0x7ab4aae9

    invoke-interface {v15, v10}, LEt0;->F(I)V

    const v8, -0x455f09d5

    invoke-interface {v15, v8}, LEt0;->F(I)V

    sget-object v28, LQm0;->a:LQm0;

    const v3, -0x492a3cae

    invoke-interface {v15, v3}, LEt0;->F(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->getInstitutionIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    :goto_1
    const v4, 0x76721a0c

    invoke-interface {v15, v4}, LEt0;->F(I)V

    const/4 v7, 0x6

    if-nez v3, :cond_6

    move v13, v7

    move/from16 v20, v9

    move-object v11, v12

    move v0, v14

    goto :goto_2

    :cond_6
    const/16 v4, 0x24

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    invoke-static {v12, v4}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v4

    int-to-float v5, v7

    invoke-static {v5}, Lk61;->g(F)F

    move-result v5

    invoke-static {v5}, Lcc5;->d(F)Lbc5;

    move-result-object v5

    invoke-static {v4, v5}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v6

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalImageLoader()LU94;

    move-result-object v4

    invoke-interface {v15, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/uicore/image/StripeImageLoader;

    const/4 v5, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    new-instance v7, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$1$1$1;

    invoke-direct {v7, v6}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$1$1$1;-><init>(LgV2;)V

    const v8, -0x714effd5

    invoke-static {v15, v8, v13, v7}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v27

    const/16 v29, 0x0

    sget v7, Lcom/stripe/android/uicore/image/StripeImageLoader;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    const v8, 0xc00180

    or-int v30, v7, v8

    const/16 v31, 0x170

    const v8, -0x4ee9b9da

    move-object/from16 v7, v22

    move-object/from16 v8, v23

    move/from16 v20, v9

    move-object/from16 v9, v24

    move-object/from16 v10, v27

    move-object/from16 v11, v29

    move-object/from16 v32, v12

    move-object v12, v15

    move/from16 v13, v30

    move v0, v14

    move/from16 v14, v31

    invoke-static/range {v3 .. v14}, Lcom/stripe/android/uicore/image/StripeImageKt;->StripeImage(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static/range {v20 .. v20}, Lk61;->g(F)F

    move-result v3

    move-object/from16 v11, v32

    invoke-static {v11, v3}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v3

    const/4 v13, 0x6

    invoke-static {v3, v15, v13}, LDN5;->a(LgV2;LEt0;I)V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_2
    invoke-interface {v15}, LEt0;->Q()V

    sget-object v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$1$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$1$2;

    sget-object v3, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v3, v15, v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitle()LG26;

    move-result-object v5

    const/4 v6, 0x0

    sget-object v7, Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;->BOLD:Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;

    invoke-virtual {v3, v15, v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitleEmphasized()LG26;

    move-result-object v3

    invoke-virtual {v3}, LG26;->L()LGN5;

    move-result-object v3

    invoke-static {v7, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/16 v9, 0x38

    const/16 v10, 0x8

    move-object v3, v2

    move-object v8, v15

    invoke-static/range {v3 .. v10}, Lcom/stripe/android/financialconnections/ui/components/TextKt;->AnnotatedText(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;LG26;LgV2;Ljava/util/Map;LEt0;II)V

    const/4 v4, 0x0

    invoke-static/range {v20 .. v20}, Lk61;->g(F)F

    move-result v5

    const/4 v6, 0x0

    invoke-static/range {v20 .. v20}, Lk61;->g(F)F

    move-result v7

    const/4 v8, 0x5

    const/4 v9, 0x0

    move-object v3, v11

    invoke-static/range {v3 .. v9}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v23

    const/high16 v24, 0x3f800000    # 1.0f

    const/16 v25, 0x0

    const/16 v26, 0x2

    const/16 v27, 0x0

    move-object/from16 v22, v28

    invoke-static/range {v22 .. v27}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xe

    move-object/from16 v4, v16

    invoke-static/range {v3 .. v9}, LUp5;->d(LgV2;LXp5;ZLcu1;ZILjava/lang/Object;)LgV2;

    move-result-object v2

    const v3, -0x1cd0f17e

    invoke-interface {v15, v3}, LEt0;->F(I)V

    invoke-virtual/range {v17 .. v17}, Llo;->g()Llo$l;

    move-result-object v3

    invoke-virtual/range {v18 .. v18}, LK9$a;->j()LK9$b;

    move-result-object v4

    invoke-static {v3, v4, v15, v0}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v3

    const v14, -0x4ee9b9da

    invoke-interface {v15, v14}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v15, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {v15, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {v15, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    invoke-virtual/range {v19 .. v19}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface {v15}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_7

    invoke-static {}, Lyt0;->c()V

    :cond_7
    invoke-interface {v15}, LEt0;->h()V

    invoke-interface {v15}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v15, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_3

    :cond_8
    invoke-interface {v15}, LEt0;->e()V

    :goto_3
    invoke-interface {v15}, LEt0;->L()V

    invoke-static {v15}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual/range {v19 .. v19}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v3, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v7, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v7, v5, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v7, v6, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15}, LEt0;->q()V

    invoke-static {v15}, LMB5;->b(LEt0;)LEt0;

    move-result-object v3

    invoke-static {v3}, LMB5;->a(LEt0;)LMB5;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v3, v15, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v2, 0x7ab4aae9

    invoke-interface {v15, v2}, LEt0;->F(I)V

    const v3, -0x455f09d5

    invoke-interface {v15, v3}, LEt0;->F(I)V

    const v3, -0x702cf7e4    # -2.080933E-29f

    invoke-interface {v15, v3}, LEt0;->F(I)V

    const v3, 0x4eb2285f

    invoke-interface {v15, v3}, LEt0;->F(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->getBody()Lcom/stripe/android/financialconnections/domain/Body;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/domain/Body;->getEntries()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    move v12, v0

    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v17, v12, 0x1

    if-gez v12, :cond_9

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_9
    move-object v11, v3

    check-cast v11, Lcom/stripe/android/financialconnections/domain/Entry;

    instance-of v3, v11, Lcom/stripe/android/financialconnections/domain/Entry$Image;

    const/16 v4, 0x8

    if-eqz v3, :cond_c

    const v3, -0x5be8f694

    invoke-interface {v15, v3}, LEt0;->F(I)V

    sget-object v9, LgV2;->b0:LgV2$a;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static {v9, v8, v6, v7}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v3

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    invoke-static {v4}, Lcc5;->d(F)Lbc5;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v5, v15, v13}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getBackgroundContainer-0d7_KjU()J

    move-result-wide v6

    invoke-static {v3, v6, v7, v4}, Lbw;->c(LgV2;JLhy5;)LgV2;

    move-result-object v3

    const v4, 0x2bb5b5d7

    invoke-interface {v15, v4}, LEt0;->F(I)V

    sget-object v18, LK9;->a:LK9$a;

    invoke-virtual/range {v18 .. v18}, LK9$a;->n()LK9;

    move-result-object v4

    invoke-static {v4, v0, v15, v0}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v4

    invoke-interface {v15, v14}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v15, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {v15, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v7

    invoke-interface {v15, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJq6;

    sget-object v19, LBt0;->M:LBt0$a;

    invoke-virtual/range {v19 .. v19}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    invoke-static {v3}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v3

    invoke-interface {v15}, LEt0;->v()Llm;

    move-result-object v10

    instance-of v10, v10, Llm;

    if-nez v10, :cond_a

    invoke-static {}, Lyt0;->c()V

    :cond_a
    invoke-interface {v15}, LEt0;->h()V

    invoke-interface {v15}, LEt0;->t()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v15, v8}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    :cond_b
    invoke-interface {v15}, LEt0;->e()V

    :goto_5
    invoke-interface {v15}, LEt0;->L()V

    invoke-static {v15}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v8

    invoke-virtual/range {v19 .. v19}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v8, v4, v10}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v5, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v6, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v19 .. v19}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v7, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15}, LEt0;->q()V

    invoke-static {v15}, LMB5;->b(LEt0;)LEt0;

    move-result-object v4

    invoke-static {v4}, LMB5;->a(LEt0;)LMB5;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v4, v15, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v15, v2}, LEt0;->F(I)V

    const v3, -0x7f65a980

    invoke-interface {v15, v3}, LEt0;->F(I)V

    sget-object v10, Lf10;->a:Lf10;

    const v3, -0x4f6ab1b

    invoke-interface {v15, v3}, LEt0;->F(I)V

    sget v3, Lcom/stripe/android/financialconnections/R$drawable;->stripe_prepane_phone_bg:I

    invoke-static {v3, v15, v0}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v3

    sget-object v4, LBA0;->a:LBA0$a;

    invoke-virtual {v4}, LBA0$a;->a()LBA0;

    move-result-object v7

    invoke-virtual/range {v18 .. v18}, LK9$a;->e()LK9;

    move-result-object v4

    invoke-interface {v10, v9, v4}, Le10;->c(LgV2;LK9;)LgV2;

    move-result-object v4

    const/16 v5, 0x108

    int-to-float v8, v5

    invoke-static {v8}, Lk61;->g(F)F

    move-result v5

    invoke-static {v4, v5}, LBB5;->A(LgV2;F)LgV2;

    move-result-object v4

    const/16 v5, 0x110

    int-to-float v6, v5

    invoke-static {v6}, Lk61;->g(F)F

    move-result v5

    invoke-static {v4, v5}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v5

    const-string v4, "Test"

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x6038

    const/16 v24, 0x68

    move/from16 v25, v6

    const/4 v2, 0x1

    move-object/from16 v6, v19

    const/4 v14, 0x0

    move/from16 v19, v8

    const/4 v2, 0x0

    move/from16 v8, v21

    move-object v13, v9

    move-object/from16 v9, v22

    move-object v0, v10

    move-object v10, v15

    move-object/from16 v33, v11

    move/from16 v11, v23

    move/from16 v34, v12

    move/from16 v12, v24

    invoke-static/range {v3 .. v12}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    invoke-virtual/range {v18 .. v18}, LK9$a;->e()LK9;

    move-result-object v3

    invoke-interface {v0, v13, v3}, Le10;->c(LgV2;LK9;)LgV2;

    move-result-object v0

    invoke-static/range {v19 .. v19}, Lk61;->g(F)F

    move-result v3

    invoke-static {v0, v3}, LBB5;->A(LgV2;F)LgV2;

    move-result-object v0

    invoke-static/range {v25 .. v25}, Lk61;->g(F)F

    move-result v3

    invoke-static {v0, v3}, LBB5;->o(LgV2;F)LgV2;

    move-result-object v0

    invoke-static/range {v20 .. v20}, Lk61;->g(F)F

    move-result v3

    const/4 v5, 0x2

    invoke-static {v0, v3, v2, v5, v14}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v0

    move-object/from16 v3, v33

    move-object v11, v3

    check-cast v11, Lcom/stripe/android/financialconnections/domain/Entry$Image;

    invoke-virtual {v11}, Lcom/stripe/android/financialconnections/domain/Entry$Image;->getContent()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v4, 0x0

    invoke-static {v0, v3, v15, v4}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->GifWebView(LgV2;Ljava/lang/String;LEt0;I)V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->f()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    goto/16 :goto_6

    :cond_c
    move-object v3, v11

    move/from16 v34, v12

    const/4 v2, 0x0

    const/4 v5, 0x2

    const/4 v14, 0x0

    instance-of v0, v3, Lcom/stripe/android/financialconnections/domain/Entry$Text;

    if-eqz v0, :cond_d

    const v0, -0x5be8f0bb

    invoke-interface {v15, v0}, LEt0;->F(I)V

    new-instance v0, Lcom/stripe/android/financialconnections/ui/TextResource$Text;

    move-object v11, v3

    check-cast v11, Lcom/stripe/android/financialconnections/domain/Entry$Text;

    invoke-virtual {v11}, Lcom/stripe/android/financialconnections/domain/Entry$Text;->getContent()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/stripe/android/financialconnections/ui/sdui/ServerDrivenUiKt;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/stripe/android/financialconnections/ui/TextResource$Text;-><init>(Ljava/lang/CharSequence;)V

    sget-object v3, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v6, 0x6

    invoke-virtual {v3, v15, v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBody()LG26;

    move-result-object v7

    const/4 v8, 0x0

    new-array v5, v5, [Lkotlin/Pair;

    sget-object v9, Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;->BOLD:Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;

    invoke-virtual {v3, v15, v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBodyEmphasized()LG26;

    move-result-object v10

    invoke-virtual {v10}, LG26;->L()LGN5;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v5, v10

    sget-object v9, Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;->CLICKABLE:Lcom/stripe/android/financialconnections/ui/components/StringAnnotation;

    invoke-virtual {v3, v15, v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBodyEmphasized()LG26;

    move-result-object v10

    invoke-virtual {v10}, LG26;->L()LGN5;

    move-result-object v35

    invoke-virtual {v3, v15, v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextBrand-0d7_KjU()J

    move-result-wide v36

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const-wide/16 v50, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x3ffe

    const/16 v55, 0x0

    invoke-static/range {v35 .. v55}, LGN5;->b(LGN5;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILjava/lang/Object;)LGN5;

    move-result-object v3

    invoke-static {v9, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v6, 0x1

    aput-object v3, v5, v6

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v9

    shr-int/lit8 v3, v1, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/lit8 v10, v3, 0x8

    const/16 v11, 0x8

    move-object v3, v0

    move-object/from16 v4, p2

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v15

    move v9, v10

    move v10, v11

    invoke-static/range {v3 .. v10}, Lcom/stripe/android/financialconnections/ui/components/TextKt;->AnnotatedText(Lcom/stripe/android/financialconnections/ui/TextResource;Lkotlin/jvm/functions/Function1;LG26;LgV2;Ljava/util/Map;LEt0;II)V

    invoke-interface {v15}, LEt0;->Q()V

    goto :goto_6

    :cond_d
    const v0, -0x5be8ede5

    invoke-interface {v15, v0}, LEt0;->F(I)V

    invoke-interface {v15}, LEt0;->Q()V

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->getBody()Lcom/stripe/android/financialconnections/domain/Body;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/domain/Body;->getEntries()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v0

    move/from16 v3, v34

    if-eq v3, v0, :cond_e

    sget-object v0, LgV2;->b0:LgV2$a;

    invoke-static/range {v20 .. v20}, Lk61;->g(F)F

    move-result v3

    invoke-static {v0, v3}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v0

    const/4 v3, 0x6

    invoke-static {v0, v15, v3}, LDN5;->a(LgV2;LEt0;I)V

    :cond_e
    move/from16 v12, v17

    const/4 v0, 0x0

    const v2, 0x7ab4aae9

    const/4 v13, 0x6

    const v14, -0x4ee9b9da

    goto/16 :goto_4

    :cond_f
    const/4 v2, 0x0

    const/4 v14, 0x0

    invoke-interface {v15}, LEt0;->Q()V

    sget-object v0, LgV2;->b0:LgV2$a;

    const/high16 v24, 0x3f800000    # 1.0f

    const/16 v25, 0x0

    const/16 v26, 0x2

    const/16 v27, 0x0

    move-object/from16 v22, v28

    move-object/from16 v23, v0

    invoke-static/range {v22 .. v27}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v15, v4}, Ld10;->a(LgV2;LEt0;I)V

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->getPartnerNotice()Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    move-result-object v3

    const v4, 0x76722848

    invoke-interface {v15, v4}, LEt0;->F(I)V

    if-nez v3, :cond_10

    goto :goto_7

    :cond_10
    invoke-static/range {v20 .. v20}, Lk61;->g(F)F

    move-result v3

    invoke-static {v0, v3}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v3, v15, v4}, LDN5;->a(LgV2;LEt0;I)V

    const/4 v3, 0x0

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->getPartnerNotice()Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    move-result-object v4

    and-int/lit16 v7, v1, 0x380

    const/4 v8, 0x1

    move-object/from16 v5, p2

    move-object v6, v15

    invoke-static/range {v3 .. v8}, Lcom/stripe/android/financialconnections/features/common/PartnerCalloutKt;->PartnerCallout(LgV2;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lkotlin/jvm/functions/Function1;LEt0;II)V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_7
    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->f()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v14}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$1$4;

    move-object/from16 v2, p1

    invoke-direct {v0, v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$1$4;-><init>(Lcom/stripe/android/financialconnections/domain/OauthPrepane;)V

    const v9, -0xd698ea7

    invoke-static {v15, v9, v3, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v9

    and-int/lit8 v0, v1, 0xe

    const v3, 0x180030

    or-int v11, v0, v3

    const/16 v12, 0x3c

    move-object/from16 v3, p0

    move-object v10, v15

    invoke-static/range {v3 .. v12}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->f()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, LQt0;->Y()V

    :cond_11
    invoke-interface {v15}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_12

    goto :goto_8

    :cond_12
    new-instance v3, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$2;

    move-object/from16 v4, p0

    move-object/from16 v5, p2

    invoke-direct {v3, v4, v2, v5, v1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrePaneContent$2;-><init>(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/domain/OauthPrepane;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v0, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_8
    return-void
.end method

.method public static final InstitutionalPrepaneContentPreview(LEt0;I)V
    .locals 4

    const v0, 0x2bc9ce51

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

    const-string v2, "com.stripe.android.financialconnections.features.partnerauth.InstitutionalPrepaneContentPreview (PartnerAuthScreen.kt:452)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/partnerauth/ComposableSingletons$PartnerAuthScreenKt;->getLambda-2$financial_connections_release()Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrepaneContentPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$InstitutionalPrepaneContentPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final LoadedContent(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;",
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
            "LEt0;",
            "I)V"
        }
    .end annotation

    const v0, 0x4b1afef

    invoke-interface {p5, v0}, LEt0;->u(I)LEt0;

    move-result-object p5

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.partnerauth.LoadedContent (PartnerAuthScreen.kt:251)"

    invoke-static {v0, p6, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    instance-of v0, p0, LMd6;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const v0, 0x38b1fb32

    invoke-interface {p5, v0}, LEt0;->F(I)V

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;->getAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->isOAuth()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const v0, 0x38b1fb6b

    invoke-interface {p5, v0}, LEt0;->F(I)V

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;->getAuthSession()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->getDisplay()Lcom/stripe/android/financialconnections/domain/Display;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/domain/Display;->getText()Lcom/stripe/android/financialconnections/domain/Text;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/domain/Text;->getOauthPrepane()Lcom/stripe/android/financialconnections/domain/OauthPrepane;

    move-result-object v0

    shr-int/lit8 v1, p6, 0x6

    and-int/lit8 v2, v1, 0xe

    or-int/lit8 v2, v2, 0x40

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v1, v2

    invoke-static {p2, v0, p4, p5, v1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->InstitutionalPrePaneContent(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/domain/OauthPrepane;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-interface {p5}, LEt0;->Q()V

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    const v0, 0x38b1fc67

    invoke-interface {p5, v0}, LEt0;->F(I)V

    const/4 v0, 0x0

    sget v2, Lcom/stripe/android/financialconnections/R$string;->stripe_partnerauth_loading_title:I

    invoke-static {v2, p5, v1}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/stripe/android/financialconnections/R$string;->stripe_partnerauth_loading_desc:I

    invoke-static {v3, p5, v1}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, v0

    move-object v4, p5

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->LoadingContent(LgV2;Ljava/lang/String;Ljava/lang/String;LEt0;II)V

    invoke-interface {p5}, LEt0;->Q()V

    goto :goto_0

    :cond_2
    const v0, 0x38b1fd3e

    invoke-interface {p5, v0}, LEt0;->F(I)V

    invoke-interface {p5}, LEt0;->Q()V

    :goto_0
    invoke-interface {p5}, LEt0;->Q()V

    goto :goto_1

    :cond_3
    instance-of v0, p0, LAt2;

    if-eqz v0, :cond_4

    const v0, 0x38b1fd56

    invoke-interface {p5, v0}, LEt0;->F(I)V

    invoke-static {p5, v1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->BrowserLoadingContent(LEt0;I)V

    invoke-interface {p5}, LEt0;->Q()V

    goto :goto_1

    :cond_4
    instance-of v0, p0, LwT5;

    if-eqz v0, :cond_5

    const v0, 0x38b1fd85

    invoke-interface {p5, v0}, LEt0;->F(I)V

    const/4 v0, 0x0

    sget v2, Lcom/stripe/android/financialconnections/R$string;->stripe_account_picker_loading_title:I

    invoke-static {v2, p5, v1}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/stripe/android/financialconnections/R$string;->stripe_account_picker_loading_desc:I

    invoke-static {v3, p5, v1}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v1, v0

    move-object v4, p5

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->LoadingContent(LgV2;Ljava/lang/String;Ljava/lang/String;LEt0;II)V

    invoke-interface {p5}, LEt0;->Q()V

    goto :goto_1

    :cond_5
    instance-of v0, p0, LCj1;

    if-eqz v0, :cond_6

    const v0, 0x38b1fe57

    invoke-interface {p5, v0}, LEt0;->F(I)V

    shr-int/lit8 v0, p6, 0x9

    and-int/lit8 v0, v0, 0xe

    invoke-static {p3, p5, v0}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->InstitutionUnknownErrorContent(Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-interface {p5}, LEt0;->Q()V

    goto :goto_1

    :cond_6
    const v0, 0x38b1fef6

    invoke-interface {p5, v0}, LEt0;->F(I)V

    invoke-interface {p5}, LEt0;->Q()V

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    invoke-interface {p5}, LEt0;->w()LWm5;

    move-result-object p5

    if-nez p5, :cond_8

    goto :goto_2

    :cond_8
    new-instance v7, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$LoadedContent$1;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$LoadedContent$1;-><init>(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {p5, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final PartnerAuthScreen(LEt0;I)V
    .locals 42

    move/from16 v0, p1

    const v1, 0x485442c8    # 217355.12f

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

    goto/16 :goto_f

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreen (PartnerAuthScreen.kt:95)"

    invoke-static {v1, v0, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const v1, 0x180798b6

    invoke-interface {v13, v1}, LEt0;->F(I)V

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v1

    invoke-interface {v13, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v1}, LtN2;->f(Landroid/content/Context;)Landroidx/activity/ComponentActivity;

    move-result-object v1

    if-eqz v1, :cond_21

    const v8, 0x1e871a90

    invoke-interface {v13, v8}, LEt0;->F(I)V

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v2

    invoke-interface {v13, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-static {v2}, LtN2;->f(Landroid/content/Context;)Landroidx/activity/ComponentActivity;

    move-result-object v15

    const-string v9, "Composable is not hosted in a ComponentActivity!"

    if-eqz v15, :cond_20

    invoke-interface {v1}, LPi5;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v2

    const-class v3, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v3

    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object v4

    invoke-interface {v13, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    const/4 v10, 0x4

    new-array v5, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v1, v5, v11

    const/4 v12, 0x1

    aput-object v15, v5, v12

    const/16 v22, 0x2

    aput-object v1, v5, v22

    const/16 v23, 0x3

    aput-object v2, v5, v23

    const v7, -0x21de6e89

    invoke-interface {v13, v7}, LEt0;->F(I)V

    move v6, v11

    move v14, v6

    :goto_1
    if-ge v6, v10, :cond_3

    aget-object v7, v5, v6

    invoke-interface {v13, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v14, v7

    add-int/lit8 v6, v6, 0x1

    const v7, -0x21de6e89

    goto :goto_1

    :cond_3
    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    const-string v7, "mavericks:arg"

    const/4 v6, 0x0

    if-nez v14, :cond_4

    sget-object v14, LEt0;->a:LEt0$a;

    invoke-virtual {v14}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v5, v14, :cond_a

    :cond_4
    instance-of v5, v1, Landroidx/fragment/app/Fragment;

    if-eqz v5, :cond_5

    move-object v5, v1

    check-cast v5, Landroidx/fragment/app/Fragment;

    goto :goto_2

    :cond_5
    move-object v5, v6

    :goto_2
    if-nez v5, :cond_6

    invoke-static {v4}, LtN2;->g(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    move-result-object v4

    move-object/from16 v17, v4

    goto :goto_3

    :cond_6
    move-object/from16 v17, v5

    :goto_3
    if-eqz v17, :cond_8

    invoke-virtual/range {v17 .. v17}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1, v7}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    goto :goto_4

    :cond_7
    move-object/from16 v16, v6

    :goto_4
    new-instance v1, LFy1;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x18

    const/16 v21, 0x0

    move-object v14, v1

    invoke-direct/range {v14 .. v21}, LFy1;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;Landroidx/fragment/app/Fragment;LXr6;Landroidx/savedstate/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v1

    goto :goto_6

    :cond_8
    invoke-virtual {v15}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_9

    invoke-virtual {v4, v7}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_5

    :cond_9
    move-object v4, v6

    :goto_5
    new-instance v5, Lr6;

    invoke-direct {v5, v15, v4, v1, v2}, Lr6;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;LXr6;Landroidx/savedstate/a;)V

    :goto_6
    invoke-interface {v13, v5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_a
    invoke-interface {v13}, LEt0;->Q()V

    move-object v1, v5

    check-cast v1, LPr6;

    const v14, 0x1e7b2b64

    invoke-interface {v13, v14}, LEt0;->F(I)V

    invoke-interface {v13, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v13, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    const-string v15, "keyFactory?.invoke() ?: viewModelClass.java.name"

    if-nez v2, :cond_b

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_c

    :cond_b
    sget-object v24, LYN2;->a:LYN2;

    invoke-static {v3}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v25

    const-class v26, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;

    invoke-static {v3}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x30

    const/16 v32, 0x0

    move-object/from16 v27, v1

    move-object/from16 v28, v2

    invoke-static/range {v24 .. v32}, LYN2;->c(LYN2;Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;ILjava/lang/Object;)LRN2;

    move-result-object v4

    invoke-interface {v13, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_c
    invoke-interface {v13}, LEt0;->Q()V

    check-cast v4, LRN2;

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    move-object/from16 v28, v4

    check-cast v28, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    invoke-static {v13, v11}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModelKt;->parentViewModel(LEt0;I)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object v1

    const/4 v3, 0x0

    sget-object v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$webAuthFlow$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$webAuthFlow$1;

    const/16 v16, 0x188

    const/16 v17, 0x1

    move-object/from16 v2, v28

    move-object v5, v13

    move/from16 v6, v16

    move-object/from16 v33, v7

    const v14, -0x21de6e89

    move/from16 v7, v17

    invoke-static/range {v2 .. v7}, LtN2;->c(LRN2;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LEt0;II)LsP5;

    move-result-object v7

    invoke-static {}, Lhu0;->p()LU94;

    move-result-object v2

    invoke-interface {v13, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v27, v2

    check-cast v27, LDf6;

    invoke-interface {v13, v8}, LEt0;->F(I)V

    invoke-static {}, Landroidx/compose/ui/platform/h;->i()LU94;

    move-result-object v2

    invoke-interface {v13, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LLifecycleOwner;

    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v3

    invoke-interface {v13, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-static {v3}, LtN2;->f(Landroid/content/Context;)Landroidx/activity/ComponentActivity;

    move-result-object v3

    if-eqz v3, :cond_1f

    instance-of v4, v2, LXr6;

    if-eqz v4, :cond_d

    move-object v6, v2

    check-cast v6, LXr6;

    goto :goto_7

    :cond_d
    const/4 v6, 0x0

    :goto_7
    if-eqz v6, :cond_1e

    instance-of v4, v2, LPi5;

    if-eqz v4, :cond_e

    move-object v4, v2

    check-cast v4, LPi5;

    goto :goto_8

    :cond_e
    const/4 v4, 0x0

    :goto_8
    if-eqz v4, :cond_1d

    invoke-interface {v4}, LPi5;->getSavedStateRegistry()Landroidx/savedstate/a;

    move-result-object v4

    const-class v5, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v5

    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object v8

    invoke-interface {v13, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/View;

    new-array v9, v10, [Ljava/lang/Object;

    aput-object v2, v9, v11

    aput-object v3, v9, v12

    aput-object v6, v9, v22

    aput-object v4, v9, v23

    invoke-interface {v13, v14}, LEt0;->F(I)V

    move v12, v11

    :goto_9
    if-ge v11, v10, :cond_f

    aget-object v14, v9, v11

    invoke-interface {v13, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v12, v14

    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    :cond_f
    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v9

    if-nez v12, :cond_10

    sget-object v10, LEt0;->a:LEt0$a;

    invoke-virtual {v10}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_16

    :cond_10
    instance-of v9, v2, Landroidx/fragment/app/Fragment;

    if-eqz v9, :cond_11

    check-cast v2, Landroidx/fragment/app/Fragment;

    goto :goto_a

    :cond_11
    const/4 v2, 0x0

    :goto_a
    if-nez v2, :cond_12

    invoke-static {v8}, LtN2;->g(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    move-result-object v2

    :cond_12
    move-object/from16 v37, v2

    if-eqz v37, :cond_14

    invoke-virtual/range {v37 .. v37}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_13

    move-object/from16 v8, v33

    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v36, v6

    goto :goto_b

    :cond_13
    const/16 v36, 0x0

    :goto_b
    new-instance v2, LFy1;

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x18

    const/16 v41, 0x0

    move-object/from16 v34, v2

    move-object/from16 v35, v3

    invoke-direct/range {v34 .. v41}, LFy1;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;Landroidx/fragment/app/Fragment;LXr6;Landroidx/savedstate/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v2

    goto :goto_d

    :cond_14
    move-object/from16 v8, v33

    invoke-virtual {v3}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_15

    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_c

    :cond_15
    const/4 v2, 0x0

    :goto_c
    new-instance v8, Lr6;

    invoke-direct {v8, v3, v2, v6, v4}, Lr6;-><init>(Landroidx/activity/ComponentActivity;Ljava/lang/Object;LXr6;Landroidx/savedstate/a;)V

    move-object v9, v8

    :goto_d
    invoke-interface {v13, v9}, LEt0;->z(Ljava/lang/Object;)V

    :cond_16
    invoke-interface {v13}, LEt0;->Q()V

    move-object v2, v9

    check-cast v2, LPr6;

    const v3, 0x1e7b2b64

    invoke-interface {v13, v3}, LEt0;->F(I)V

    invoke-interface {v13, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v13, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_17

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_18

    :cond_17
    sget-object v17, LYN2;->a:LYN2;

    invoke-static {v5}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v18

    const-class v19, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    invoke-static {v5}, Lkotlin/jvm/JvmClassMappingKt;->getJavaClass(Lkotlin/reflect/KClass;)Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x30

    const/16 v25, 0x0

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    invoke-static/range {v17 .. v25}, LYN2;->c(LYN2;Ljava/lang/Class;Ljava/lang/Class;LPr6;Ljava/lang/String;ZLBN2;ILjava/lang/Object;)LRN2;

    move-result-object v4

    invoke-interface {v13, v4}, LEt0;->z(Ljava/lang/Object;)V

    :cond_18
    invoke-interface {v13}, LEt0;->Q()V

    check-cast v4, LRN2;

    invoke-interface {v13}, LEt0;->Q()V

    move-object v9, v4

    check-cast v9, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;

    const/16 v2, 0x8

    invoke-static {v9, v13, v2}, LtN2;->b(LRN2;LEt0;I)LsP5;

    move-result-object v10

    const v2, 0x2e20b340

    invoke-interface {v13, v2}, LEt0;->F(I)V

    const v2, -0x1d58f75c

    invoke-interface {v13, v2}, LEt0;->F(I)V

    invoke-interface {v13}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LEt0;->a:LEt0$a;

    invoke-virtual {v3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_19

    sget-object v2, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {v2, v13}, LY91;->j(Lkotlin/coroutines/CoroutineContext;LEt0;)LZC0;

    move-result-object v2

    new-instance v3, Liu0;

    invoke-direct {v3, v2}, Liu0;-><init>(LZC0;)V

    invoke-interface {v13, v3}, LEt0;->z(Ljava/lang/Object;)V

    move-object v2, v3

    :cond_19
    invoke-interface {v13}, LEt0;->Q()V

    check-cast v2, Liu0;

    invoke-virtual {v2}, Liu0;->a()LZC0;

    move-result-object v11

    invoke-interface {v13}, LEt0;->Q()V

    sget-object v2, LHU2;->b:LHU2;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v8, 0x186

    const/16 v12, 0xa

    move-object v6, v13

    move-object v14, v7

    move v7, v8

    move v8, v12

    invoke-static/range {v2 .. v8}, LFU2;->p(LHU2;Llf;ZLkotlin/jvm/functions/Function1;LEt0;II)LGU2;

    move-result-object v3

    invoke-interface {v10}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;->getViewEffect()Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;

    move-result-object v2

    const v4, -0x26ea2a88

    invoke-interface {v13, v4}, LEt0;->F(I)V

    if-nez v2, :cond_1a

    goto :goto_e

    :cond_1a
    new-instance v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;

    const/16 v30, 0x0

    move-object/from16 v24, v4

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move-object/from16 v29, v9

    invoke-direct/range {v24 .. v30}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$1$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$ViewEffect;LGU2;LDf6;Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;Lkotlin/coroutines/Continuation;)V

    const/16 v5, 0x40

    invoke-static {v2, v4, v13, v5}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_e
    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v14}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    new-instance v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$2;

    const/4 v5, 0x0

    invoke-direct {v4, v9, v14, v5}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$2;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;LsP5;Lkotlin/coroutines/Continuation;)V

    const/16 v5, 0x48

    invoke-static {v2, v4, v13, v5}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-interface {v10}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;

    new-instance v4, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$3;

    invoke-direct {v4, v9}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$3;-><init>(Ljava/lang/Object;)V

    new-instance v5, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$4;

    invoke-direct {v5, v9}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$4;-><init>(Ljava/lang/Object;)V

    new-instance v7, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$5;

    invoke-direct {v7, v9}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$5;-><init>(Ljava/lang/Object;)V

    new-instance v6, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$6;

    invoke-direct {v6, v9}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$6;-><init>(Ljava/lang/Object;)V

    new-instance v9, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$7;

    invoke-direct {v9, v1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$7;-><init>(Ljava/lang/Object;)V

    new-instance v8, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$8;

    invoke-direct {v8, v1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$8;-><init>(Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;)V

    new-instance v10, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$9;

    invoke-direct {v10, v11, v3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$9;-><init>(LZC0;LGU2;)V

    const/16 v12, 0x8

    move-object v11, v13

    invoke-static/range {v2 .. v12}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->PartnerAuthScreenContent(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-static {}, LQt0;->Y()V

    :cond_1b
    :goto_f
    invoke-interface {v13}, LEt0;->w()LWm5;

    move-result-object v1

    if-nez v1, :cond_1c

    goto :goto_10

    :cond_1c
    new-instance v2, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$10;

    invoke-direct {v2, v0}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreen$10;-><init>(I)V

    invoke-interface {v1, v2}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_10
    return-void

    :cond_1d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner must be a SavedStateRegistryOwner!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner must be a ViewModelStoreOwner!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LocalContext is not a ComponentActivity!"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final PartnerAuthScreenContent(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;",
            "LGU2;",
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
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
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

    const v0, 0x4f2a7640

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v9

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenContent (PartnerAuthScreen.kt:145)"

    invoke-static {v0, v10, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v1, 0x6

    invoke-virtual {v0, v9, v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getBackgroundSurface-0d7_KjU()J

    move-result-wide v16

    const/16 v2, 0x8

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v2}, Lcc5;->d(F)Lbc5;

    move-result-object v14

    invoke-virtual {v0, v9, v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextSecondary-0d7_KjU()J

    move-result-wide v1

    const/high16 v3, 0x3f000000    # 0.5f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v20

    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenContent$1;

    move-object/from16 v15, p0

    move-object/from16 v13, p4

    move-object/from16 v12, p8

    invoke-direct {v0, v15, v13, v12, v10}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenContent$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V

    const v1, -0x2fb56612

    const/4 v11, 0x1

    invoke-static {v9, v1, v11, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v18

    const/16 v19, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    new-instance v8, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenContent$2;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v2, p6

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p2

    move-object/from16 v7, p4

    move-object v12, v8

    move/from16 v8, p10

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenContent$2;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V

    const v0, 0x85b0066

    invoke-static {v9, v0, v11, v12}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    shl-int/lit8 v1, v10, 0x3

    and-int/lit16 v1, v1, 0x380

    const v2, 0x6000006

    or-int/2addr v1, v2

    const/16 v25, 0x52

    move-object/from16 v11, v18

    move-object/from16 v12, v19

    move-object/from16 v13, p1

    move/from16 v15, v22

    move-wide/from16 v18, v23

    move-object/from16 v22, v0

    move-object/from16 v23, v9

    move/from16 v24, v1

    invoke-static/range {v11 .. v25}, LFU2;->c(Lkotlin/jvm/functions/Function3;LgV2;LGU2;Lhy5;FJJJLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {v9}, LEt0;->w()LWm5;

    move-result-object v11

    if-nez v11, :cond_2

    goto :goto_0

    :cond_2
    new-instance v12, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenContent$3;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenContent$3;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v11, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method private static final PartnerAuthScreenMainContent(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;",
            "Lkotlin/jvm/functions/Function0<",
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
            "Ljava/lang/Throwable;",
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
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v8, p8

    const v0, 0x887bf4f    # 8.169993E-34f

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v9

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenMainContent (PartnerAuthScreen.kt:185)"

    invoke-static {v0, v8, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$1;

    move-object v10, p0

    move-object/from16 v11, p1

    invoke-direct {v0, p0, v11, v8}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$1;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Lkotlin/jvm/functions/Function0;I)V

    const v1, 0x18f05fbe

    const/4 v12, 0x1

    invoke-static {v9, v1, v12, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v13

    new-instance v14, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;

    move-object v0, v14

    move-object v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p8

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$2;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    const v0, -0x51ce937e

    invoke-static {v9, v0, v12, v14}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x36

    invoke-static {v13, v0, v9, v1}, Lcom/stripe/android/financialconnections/ui/components/ScaffoldKt;->FinancialConnectionsScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {v9}, LEt0;->w()LWm5;

    move-result-object v9

    if-nez v9, :cond_2

    goto :goto_0

    :cond_2
    new-instance v12, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$3;

    move-object v0, v12

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt$PartnerAuthScreenMainContent$3;-><init>(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {v9, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public static final synthetic access$BrowserLoadingContent(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->BrowserLoadingContent(LEt0;I)V

    return-void
.end method

.method public static final synthetic access$GifWebView(LgV2;Ljava/lang/String;LEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->GifWebView(LgV2;Ljava/lang/String;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$InstitutionalPrePaneContent(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/domain/OauthPrepane;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->InstitutionalPrePaneContent(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/domain/OauthPrepane;Lkotlin/jvm/functions/Function1;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$LoadedContent(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->LoadedContent(Ldp;Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState$Payload;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$PartnerAuthScreenContent(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p10}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->PartnerAuthScreenContent(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;LGU2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$PartnerAuthScreenMainContent(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->PartnerAuthScreenMainContent(Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    return-void
.end method
