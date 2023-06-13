.class public final Lcom/stripe/android/financialconnections/ui/components/ButtonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000;\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0006*\u0001\u0012\u001ah\u0010\u0010\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000c\u00a2\u0006\u0002\u0008\u000eH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u000f\u0010\u0015\u001a\u00020\u0001H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lkotlin/Function0;",
        "",
        "onClick",
        "LgV2;",
        "modifier",
        "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;",
        "type",
        "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;",
        "size",
        "",
        "enabled",
        "loading",
        "Lkotlin/Function1;",
        "LZc5;",
        "Lkotlin/ExtensionFunctionType;",
        "content",
        "FinancialConnectionsButton",
        "(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V",
        "com/stripe/android/financialconnections/ui/components/ButtonKt$rippleTheme$1",
        "rippleTheme",
        "(Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;)Lcom/stripe/android/financialconnections/ui/components/ButtonKt$rippleTheme$1;",
        "FinancialConnectionsButtonPreview",
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


# direct methods
.method public static final FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;",
            "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;",
            "ZZ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LZc5;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v9, p0

    move-object/from16 v10, p6

    move/from16 v11, p8

    const-string v0, "onClick"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x43909f18

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v12

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0xe

    if-nez v1, :cond_2

    invoke-interface {v12, v9}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_2
    move v1, v11

    :goto_1
    and-int/lit8 v2, p9, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v11, 0x70

    if-nez v3, :cond_5

    move-object/from16 v3, p1

    invoke-interface {v12, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v3, p1

    :goto_4
    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v5, v11, 0x380

    if-nez v5, :cond_8

    move-object/from16 v5, p2

    invoke-interface {v12, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_5

    :cond_7
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v1, v6

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v5, p2

    :goto_7
    and-int/lit8 v6, p9, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v7, v11, 0x1c00

    if-nez v7, :cond_b

    move-object/from16 v7, p3

    invoke-interface {v12, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_8

    :cond_a
    const/16 v8, 0x400

    :goto_8
    or-int/2addr v1, v8

    goto :goto_a

    :cond_b
    :goto_9
    move-object/from16 v7, p3

    :goto_a
    and-int/lit8 v8, p9, 0x10

    if-eqz v8, :cond_c

    or-int/lit16 v1, v1, 0x6000

    goto :goto_c

    :cond_c
    const v13, 0xe000

    and-int/2addr v13, v11

    if-nez v13, :cond_e

    move/from16 v13, p4

    invoke-interface {v12, v13}, LEt0;->o(Z)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_b

    :cond_d
    const/16 v14, 0x2000

    :goto_b
    or-int/2addr v1, v14

    goto :goto_d

    :cond_e
    :goto_c
    move/from16 v13, p4

    :goto_d
    and-int/lit8 v14, p9, 0x20

    if-eqz v14, :cond_f

    const/high16 v15, 0x30000

    or-int/2addr v1, v15

    goto :goto_f

    :cond_f
    const/high16 v15, 0x70000

    and-int/2addr v15, v11

    if-nez v15, :cond_11

    move/from16 v15, p5

    invoke-interface {v12, v15}, LEt0;->o(Z)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_e

    :cond_10
    const/high16 v16, 0x10000

    :goto_e
    or-int v1, v1, v16

    goto :goto_10

    :cond_11
    :goto_f
    move/from16 v15, p5

    :goto_10
    and-int/lit8 v16, p9, 0x40

    if-eqz v16, :cond_12

    const/high16 v16, 0x180000

    :goto_11
    or-int v1, v1, v16

    goto :goto_12

    :cond_12
    const/high16 v16, 0x380000

    and-int v16, v11, v16

    if-nez v16, :cond_14

    invoke-interface {v12, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_11

    :cond_13
    const/high16 v16, 0x80000

    goto :goto_11

    :cond_14
    :goto_12
    const v16, 0x2db6db

    and-int v0, v1, v16

    const v3, 0x92492

    if-ne v0, v3, :cond_16

    invoke-interface {v12}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_13

    :cond_15
    invoke-interface {v12}, LEt0;->k()V

    move-object/from16 v2, p1

    move-object v3, v5

    move-object v4, v7

    move v5, v13

    move v6, v15

    goto/16 :goto_17

    :cond_16
    :goto_13
    if-eqz v2, :cond_17

    sget-object v0, LgV2;->b0:LgV2$a;

    move-object/from16 v16, v0

    goto :goto_14

    :cond_17
    move-object/from16 v16, p1

    :goto_14
    if-eqz v4, :cond_18

    sget-object v0, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Primary;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Primary;

    move-object/from16 v17, v0

    goto :goto_15

    :cond_18
    move-object/from16 v17, v5

    :goto_15
    if-eqz v6, :cond_19

    sget-object v0, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Regular;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size$Regular;

    move-object/from16 v18, v0

    goto :goto_16

    :cond_19
    move-object/from16 v18, v7

    :goto_16
    const/4 v7, 0x1

    if-eqz v8, :cond_1a

    move v13, v7

    :cond_1a
    const/4 v0, 0x0

    if-eqz v14, :cond_1b

    move v15, v0

    :cond_1b
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_1c

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton (Button.kt:42)"

    const v4, 0x43909f18

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_1c
    new-array v14, v7, [LW94;

    invoke-static {}, Lyb5;->d()LU94;

    move-result-object v2

    invoke-static/range {v17 .. v17}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->rippleTheme(Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;)Lcom/stripe/android/financialconnections/ui/components/ButtonKt$rippleTheme$1;

    move-result-object v3

    invoke-virtual {v2, v3}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object v2

    aput-object v2, v14, v0

    new-instance v8, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;

    move-object v0, v8

    move v2, v1

    move-object/from16 v1, v18

    move-object/from16 v3, v17

    move-object/from16 v4, p0

    move-object/from16 v5, v16

    move v6, v13

    move v9, v7

    move v7, v15

    move-object v10, v8

    move-object/from16 v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;-><init>(Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ILcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lkotlin/jvm/functions/Function0;LgV2;ZZLkotlin/jvm/functions/Function3;)V

    const v0, 0x3363a3d8

    invoke-static {v12, v0, v9, v10}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {v14, v0, v12, v1}, Lgu0;->a([LW94;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, LQt0;->Y()V

    :cond_1d
    move v5, v13

    move v6, v15

    move-object/from16 v2, v16

    move-object/from16 v3, v17

    move-object/from16 v4, v18

    :goto_17
    invoke-interface {v12}, LEt0;->w()LWm5;

    move-result-object v10

    if-nez v10, :cond_1e

    goto :goto_18

    :cond_1e
    new-instance v12, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$2;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$2;-><init>(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;II)V

    invoke-interface {v10, v12}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_18
    return-void
.end method

.method public static final FinancialConnectionsButtonPreview(LEt0;I)V
    .locals 4

    const v0, -0x6121bd2f

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

    const-string v2, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButtonPreview (Button.kt:190)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/components/ComposableSingletons$ButtonKt;->getLambda-6$financial_connections_release()Lkotlin/jvm/functions/Function2;

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
    new-instance v0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButtonPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButtonPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method private static final rippleTheme(Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;)Lcom/stripe/android/financialconnections/ui/components/ButtonKt$rippleTheme$1;
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$rippleTheme$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$rippleTheme$1;-><init>(Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;)V

    return-object v0
.end method
