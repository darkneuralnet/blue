.class public final Lcom/stripe/android/financialconnections/features/common/CloseDialogKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u001a+\u0010\u0004\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0001H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lkotlin/Function0;",
        "",
        "onConfirmClick",
        "onDismissClick",
        "CloseDialog",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "CloseDialogPreview",
        "(LEt0;I)V",
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
        "SMAP\nCloseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloseDialog.kt\ncom/stripe/android/financialconnections/features/common/CloseDialogKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,67:1\n154#2:68\n*S KotlinDebug\n*F\n+ 1 CloseDialog.kt\ncom/stripe/android/financialconnections/features/common/CloseDialogKt\n*L\n21#1:68\n*E\n"
    }
.end annotation


# direct methods
.method public static final CloseDialog(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    move/from16 v14, p3

    const-string v1, "onConfirmClick"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onDismissClick"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x3c81bc55

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, LEt0;->u(I)LEt0;

    move-result-object v13

    and-int/lit8 v2, v14, 0xe

    if-nez v2, :cond_1

    invoke-interface {v13, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_1
    move v2, v14

    :goto_1
    and-int/lit8 v3, v14, 0x70

    if-nez v3, :cond_3

    invoke-interface {v13, v15}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit8 v3, v2, 0x5b

    const/16 v4, 0x12

    if-ne v3, v4, :cond_5

    invoke-interface {v13}, LEt0;->b()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v13}, LEt0;->k()V

    move-object/from16 v16, v13

    goto/16 :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.financialconnections.features.common.CloseDialog (CloseDialog.kt:15)"

    invoke-static {v1, v2, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    invoke-static {v1}, Lcc5;->d(F)Lbc5;

    move-result-object v7

    sget-object v1, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v3, 0x6

    invoke-virtual {v1, v13, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getBackgroundContainer-0d7_KjU()J

    move-result-wide v8

    new-instance v1, Lcom/stripe/android/financialconnections/features/common/CloseDialogKt$CloseDialog$1;

    invoke-direct {v1, v0, v2}, Lcom/stripe/android/financialconnections/features/common/CloseDialogKt$CloseDialog$1;-><init>(Lkotlin/jvm/functions/Function0;I)V

    const v3, -0x72cccf63

    const/4 v4, 0x1

    invoke-static {v13, v3, v4, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v3

    const/4 v5, 0x0

    new-instance v1, Lcom/stripe/android/financialconnections/features/common/CloseDialogKt$CloseDialog$2;

    invoke-direct {v1, v15, v2}, Lcom/stripe/android/financialconnections/features/common/CloseDialogKt$CloseDialog$2;-><init>(Lkotlin/jvm/functions/Function0;I)V

    const v6, 0x22a2761f

    invoke-static {v13, v6, v4, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v4

    sget-object v1, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$CloseDialogKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$CloseDialogKt;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$CloseDialogKt;->getLambda-3$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$CloseDialogKt;->getLambda-4$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    const-wide/16 v11, 0x0

    const/16 v16, 0x0

    shr-int/lit8 v1, v2, 0x3

    and-int/lit8 v1, v1, 0xe

    const v2, 0x36c30

    or-int v17, v1, v2

    const/16 v18, 0x304

    move-object/from16 v1, p1

    move-object v2, v3

    move-object v3, v5

    move-object v5, v6

    move-object v6, v10

    move-wide v10, v11

    move-object/from16 v12, v16

    move-object/from16 v16, v13

    move/from16 v14, v17

    move/from16 v15, v18

    invoke-static/range {v1 .. v15}, Llb;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;LgV2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lhy5;JJLD31;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_4
    invoke-interface/range {v16 .. v16}, LEt0;->w()LWm5;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_5

    :cond_8
    new-instance v2, Lcom/stripe/android/financialconnections/features/common/CloseDialogKt$CloseDialog$3;

    move-object/from16 v3, p1

    move/from16 v4, p3

    invoke-direct {v2, v0, v3, v4}, Lcom/stripe/android/financialconnections/features/common/CloseDialogKt$CloseDialog$3;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v1, v2}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method

.method public static final CloseDialogPreview(LEt0;I)V
    .locals 3

    const v0, 0x189736f1

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

    const-string v2, "com.stripe.android.financialconnections.features.common.CloseDialogPreview (CloseDialog.kt:58)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$CloseDialogKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$CloseDialogKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$CloseDialogKt;->getLambda-5$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, p0, v1}, Lcom/stripe/android/financialconnections/ui/theme/ThemeKt;->FinancialConnectionsTheme(Lkotlin/jvm/functions/Function2;LEt0;I)V

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
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/CloseDialogKt$CloseDialogPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/common/CloseDialogKt$CloseDialogPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method
