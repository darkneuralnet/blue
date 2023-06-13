.class public final Lcom/stripe/android/financialconnections/ui/components/TopAppBarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aA\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00002\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u000f\u0010\r\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000c\"\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u000e8@X\u0080\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\"\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00118@X\u0080\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0012\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0013"
    }
    d2 = {
        "",
        "hideStripeLogo",
        "Lk61;",
        "elevation",
        "showBack",
        "Lkotlin/Function0;",
        "",
        "onCloseClick",
        "FinancialConnectionsTopAppBar-DzVHIIc",
        "(ZFZLkotlin/jvm/functions/Function0;LEt0;II)V",
        "FinancialConnectionsTopAppBar",
        "TopAppBarNoStripeLogoPreview",
        "(LEt0;I)V",
        "FinancialConnectionsTopAppBarPreview",
        "LXp5;",
        "getElevation",
        "(LXp5;)F",
        "LCo2;",
        "(LCo2;)F",
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
        "SMAP\nTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopAppBar.kt\ncom/stripe/android/financialconnections/ui/components/TopAppBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,113:1\n76#2:114\n76#2:116\n154#3:115\n154#3:117\n174#3:118\n*S KotlinDebug\n*F\n+ 1 TopAppBar.kt\ncom/stripe/android/financialconnections/ui/components/TopAppBarKt\n*L\n28#1:114\n35#1:116\n29#1:115\n80#1:117\n90#1:118\n*E\n"
    }
.end annotation


# direct methods
.method public static final FinancialConnectionsTopAppBar-DzVHIIc(ZFZLkotlin/jvm/functions/Function0;LEt0;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZFZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "onCloseClick"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x73cd3aa3

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v2, v5, 0xe

    if-nez v2, :cond_2

    and-int/lit8 v2, p6, 0x1

    if-nez v2, :cond_0

    move/from16 v2, p0

    invoke-interface {v1, v2}, LEt0;->o(Z)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move/from16 v2, p0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_2
    move/from16 v2, p0

    move v3, v5

    :goto_1
    and-int/lit8 v6, p6, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v5, 0x70

    if-nez v7, :cond_5

    move/from16 v7, p1

    invoke-interface {v1, v7}, LEt0;->p(F)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v3, v8

    goto :goto_4

    :cond_5
    :goto_3
    move/from16 v7, p1

    :goto_4
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v9, v5, 0x380

    if-nez v9, :cond_8

    move/from16 v9, p2

    invoke-interface {v1, v9}, LEt0;->o(Z)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_5

    :cond_7
    const/16 v10, 0x80

    :goto_5
    or-int/2addr v3, v10

    goto :goto_7

    :cond_8
    :goto_6
    move/from16 v9, p2

    :goto_7
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v10, v5, 0x1c00

    if-nez v10, :cond_b

    invoke-interface {v1, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_8

    :cond_a
    const/16 v10, 0x400

    :goto_8
    or-int/2addr v3, v10

    :cond_b
    :goto_9
    and-int/lit16 v10, v3, 0x16db

    const/16 v11, 0x492

    if-ne v10, v11, :cond_d

    invoke-interface {v1}, LEt0;->b()Z

    move-result v10

    if-nez v10, :cond_c

    goto :goto_a

    :cond_c
    invoke-interface {v1}, LEt0;->k()V

    move v3, v7

    goto/16 :goto_12

    :cond_d
    :goto_a
    invoke-interface {v1}, LEt0;->J()V

    and-int/lit8 v10, v5, 0x1

    const/4 v11, 0x1

    if-eqz v10, :cond_10

    invoke-interface {v1}, LEt0;->l()Z

    move-result v10

    if-eqz v10, :cond_e

    goto :goto_b

    :cond_e
    invoke-interface {v1}, LEt0;->k()V

    and-int/lit8 v6, p6, 0x1

    if-eqz v6, :cond_f

    and-int/lit8 v3, v3, -0xf

    :cond_f
    move v6, v3

    move v3, v7

    move/from16 v18, v9

    goto :goto_e

    :cond_10
    :goto_b
    and-int/lit8 v10, p6, 0x1

    if-eqz v10, :cond_11

    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalReducedBranding()LU94;

    move-result-object v2

    invoke-interface {v1, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    and-int/lit8 v3, v3, -0xf

    :cond_11
    if-eqz v6, :cond_12

    const/4 v6, 0x0

    int-to-float v6, v6

    invoke-static {v6}, Lk61;->g(F)F

    move-result v6

    goto :goto_c

    :cond_12
    move v6, v7

    :goto_c
    if-eqz v8, :cond_13

    move/from16 v18, v11

    goto :goto_d

    :cond_13
    move/from16 v18, v9

    :goto_d
    move/from16 v19, v6

    move v6, v3

    move/from16 v3, v19

    :goto_e
    invoke-interface {v1}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v7

    if-eqz v7, :cond_14

    const/4 v7, -0x1

    const-string v8, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar (TopAppBar.kt:26)"

    invoke-static {v0, v6, v7, v8}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_14
    sget-object v0, Liv2;->a:Liv2;

    sget v7, Liv2;->c:I

    invoke-virtual {v0, v1, v7}, Liv2;->a(LEt0;I)Lcf3;

    move-result-object v0

    const/4 v7, 0x0

    if-eqz v0, :cond_15

    invoke-interface {v0}, Lcf3;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    goto :goto_f

    :cond_15
    move-object v0, v7

    :goto_f
    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalNavHostController()LU94;

    move-result-object v8

    invoke-interface {v1, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LOY2;

    sget-object v9, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$TopAppBarKt;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$TopAppBarKt;

    if-eqz v2, :cond_16

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$TopAppBarKt;->getLambda-1$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    goto :goto_10

    :cond_16
    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$TopAppBarKt;->getLambda-2$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    :goto_10
    invoke-virtual {v8}, LDY2;->F()LAY2;

    move-result-object v8

    if-eqz v8, :cond_17

    if-eqz v18, :cond_17

    new-instance v7, Lcom/stripe/android/financialconnections/ui/components/TopAppBarKt$FinancialConnectionsTopAppBar$1;

    invoke-direct {v7, v0}, Lcom/stripe/android/financialconnections/ui/components/TopAppBarKt$FinancialConnectionsTopAppBar$1;-><init>(Landroidx/activity/OnBackPressedDispatcher;)V

    const v0, -0x5109018f

    invoke-static {v1, v0, v11, v7}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    move-object v8, v0

    goto :goto_11

    :cond_17
    move-object v8, v7

    :goto_11
    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v7, 0x6

    invoke-virtual {v0, v1, v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextWhite-0d7_KjU()J

    move-result-wide v12

    invoke-virtual {v0, v1, v7}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextBrand-0d7_KjU()J

    move-result-wide v14

    const/4 v7, 0x0

    new-instance v0, Lcom/stripe/android/financialconnections/ui/components/TopAppBarKt$FinancialConnectionsTopAppBar$2;

    invoke-direct {v0, v4, v6}, Lcom/stripe/android/financialconnections/ui/components/TopAppBarKt$FinancialConnectionsTopAppBar$2;-><init>(Lkotlin/jvm/functions/Function0;I)V

    const v10, -0x74881bf2

    invoke-static {v1, v10, v11, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    shl-int/lit8 v6, v6, 0xf

    const/high16 v10, 0x380000

    and-int/2addr v6, v10

    or-int/lit16 v10, v6, 0xc00

    const/16 v17, 0x2

    move-object v6, v9

    move-object v9, v0

    move v0, v10

    move-wide v10, v12

    move-wide v12, v14

    move v14, v3

    move-object v15, v1

    move/from16 v16, v0

    invoke-static/range {v6 .. v17}, LIh;->c(Lkotlin/jvm/functions/Function2;LgV2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, LQt0;->Y()V

    :cond_18
    move/from16 v9, v18

    :goto_12
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v7

    if-nez v7, :cond_19

    goto :goto_13

    :cond_19
    new-instance v8, Lcom/stripe/android/financialconnections/ui/components/TopAppBarKt$FinancialConnectionsTopAppBar$3;

    move-object v0, v8

    move v1, v2

    move v2, v3

    move v3, v9

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/ui/components/TopAppBarKt$FinancialConnectionsTopAppBar$3;-><init>(ZFZLkotlin/jvm/functions/Function0;II)V

    invoke-interface {v7, v8}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_13
    return-void
.end method

.method public static final FinancialConnectionsTopAppBarPreview(LEt0;I)V
    .locals 4

    const v0, 0x7612db83

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

    const-string v2, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBarPreview (TopAppBar.kt:105)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$TopAppBarKt;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$TopAppBarKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$TopAppBarKt;->getLambda-6$financial_connections_release()Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lcom/stripe/android/financialconnections/ui/components/TopAppBarKt$FinancialConnectionsTopAppBarPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/ui/components/TopAppBarKt$FinancialConnectionsTopAppBarPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final TopAppBarNoStripeLogoPreview(LEt0;I)V
    .locals 4

    const v0, 0x7abdfb9e

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

    const-string v2, "com.stripe.android.financialconnections.ui.components.TopAppBarNoStripeLogoPreview (TopAppBar.kt:97)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$TopAppBarKt;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$TopAppBarKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$TopAppBarKt;->getLambda-5$financial_connections_release()Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lcom/stripe/android/financialconnections/ui/components/TopAppBarKt$TopAppBarNoStripeLogoPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/ui/components/TopAppBarKt$TopAppBarNoStripeLogoPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final getElevation(LCo2;)F
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LCo2;->o()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LCo2;->p()I

    move-result p0

    int-to-float p0, p0

    invoke-static {p0}, Lk61;->g(F)F

    move-result p0

    invoke-static {p0}, Lk61;->d(F)Lk61;

    move-result-object p0

    sget-object v0, LHh;->a:LHh;

    invoke-virtual {v0}, LHh;->b()F

    move-result v0

    invoke-static {v0}, Lk61;->d(F)Lk61;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/comparisons/ComparisonsKt;->minOf(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Lk61;

    invoke-virtual {p0}, Lk61;->l()F

    move-result p0

    goto :goto_0

    :cond_0
    sget-object p0, LHh;->a:LHh;

    invoke-virtual {p0}, LHh;->b()F

    move-result p0

    :goto_0
    return p0
.end method

.method public static final getElevation(LXp5;)F
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LXp5;->m()I

    move-result p0

    int-to-float p0, p0

    invoke-static {p0}, Lk61;->g(F)F

    move-result p0

    invoke-static {p0}, Lk61;->d(F)Lk61;

    move-result-object p0

    sget-object v0, LHh;->a:LHh;

    invoke-virtual {v0}, LHh;->b()F

    move-result v0

    invoke-static {v0}, Lk61;->d(F)Lk61;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/comparisons/ComparisonsKt;->minOf(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Lk61;

    invoke-virtual {p0}, Lk61;->l()F

    move-result p0

    return p0
.end method
