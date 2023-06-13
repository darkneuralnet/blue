.class public final Lcom/stripe/android/financialconnections/ui/components/ScaffoldKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a1\u0010\u0006\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lkotlin/Function0;",
        "",
        "topBar",
        "Lkotlin/Function1;",
        "LPD3;",
        "content",
        "FinancialConnectionsScaffold",
        "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LEt0;I)V",
        "financial-connections_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final FinancialConnectionsScaffold(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LEt0;I)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPD3;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v2, p0

    move-object/from16 v14, p1

    move/from16 v15, p3

    const-string v0, "topBar"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x51e8cbee

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v12

    and-int/lit8 v1, v15, 0xe

    if-nez v1, :cond_1

    invoke-interface {v12, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v15

    goto :goto_1

    :cond_1
    move v1, v15

    :goto_1
    and-int/lit8 v3, v15, 0x70

    if-nez v3, :cond_3

    invoke-interface {v12, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    move v13, v1

    and-int/lit8 v1, v13, 0x5b

    const/16 v11, 0x12

    if-ne v1, v11, :cond_5

    invoke-interface {v12}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v12}, LEt0;->k()V

    move-object/from16 v27, v12

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v3, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsScaffold (Scaffold.kt:10)"

    invoke-static {v0, v13, v1, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    sget-object v0, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v1, 0x6

    invoke-virtual {v0, v12, v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getBackgroundSurface-0d7_KjU()J

    move-result-wide v18

    invoke-virtual {v0, v12, v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextPrimary-0d7_KjU()J

    move-result-wide v20

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v16, 0x0

    move/from16 v22, v11

    move/from16 v11, v16

    const-wide/16 v16, 0x0

    move-object/from16 v27, v12

    move/from16 v23, v13

    move-wide/from16 v12, v16

    move-wide/from16 v14, v16

    shl-int/lit8 v0, v23, 0x6

    and-int/lit16 v0, v0, 0x380

    move/from16 v24, v0

    const/high16 v0, 0x1c00000

    shl-int/lit8 v22, v23, 0x12

    and-int v25, v22, v0

    const/16 v26, 0x7ffb

    move-object v0, v2

    move-object/from16 v2, p0

    move-object/from16 v22, p1

    move-object/from16 v23, v27

    const/4 v0, 0x0

    invoke-static/range {v0 .. v26}, LVi5;->a(LgV2;LXi5;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLhy5;FJJJJJLkotlin/jvm/functions/Function3;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_4
    invoke-interface/range {v27 .. v27}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_8

    goto :goto_5

    :cond_8
    new-instance v1, Lcom/stripe/android/financialconnections/ui/components/ScaffoldKt$FinancialConnectionsScaffold$1;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p3

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/financialconnections/ui/components/ScaffoldKt$FinancialConnectionsScaffold$1;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;I)V

    invoke-interface {v0, v1}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method
