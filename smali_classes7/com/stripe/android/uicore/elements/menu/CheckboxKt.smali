.class public final Lcom/stripe/android/uicore/elements/menu/CheckboxKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aA\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "checked",
        "Lkotlin/Function1;",
        "",
        "onCheckedChange",
        "LgV2;",
        "modifier",
        "enabled",
        "Checkbox",
        "(ZLkotlin/jvm/functions/Function1;LgV2;ZLEt0;II)V",
        "stripe-ui-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final Checkbox(ZLkotlin/jvm/functions/Function1;LgV2;ZLEt0;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "Z",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move/from16 v5, p5

    const v0, -0x144dc478

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v2, p6, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v5, 0x6

    move v3, v2

    move/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v5, 0xe

    if-nez v2, :cond_2

    move/from16 v2, p0

    invoke-interface {v1, v2}, LEt0;->o(Z)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_2
    move/from16 v2, p0

    move v3, v5

    :goto_1
    and-int/lit8 v4, p6, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v5, 0x70

    if-nez v4, :cond_5

    move-object/from16 v4, p1

    invoke-interface {v1, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v4, p1

    :goto_4
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v7, v5, 0x380

    if-nez v7, :cond_8

    move-object/from16 v7, p2

    invoke-interface {v1, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_5

    :cond_7
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v3, v8

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v7, p2

    :goto_7
    and-int/lit8 v8, p6, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v9, v5, 0x1c00

    if-nez v9, :cond_b

    move/from16 v9, p3

    invoke-interface {v1, v9}, LEt0;->o(Z)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_8

    :cond_a
    const/16 v10, 0x400

    :goto_8
    or-int/2addr v3, v10

    goto :goto_a

    :cond_b
    :goto_9
    move/from16 v9, p3

    :goto_a
    and-int/lit16 v10, v3, 0x16db

    const/16 v11, 0x492

    if-ne v10, v11, :cond_d

    invoke-interface {v1}, LEt0;->b()Z

    move-result v10

    if-nez v10, :cond_c

    goto :goto_b

    :cond_c
    invoke-interface {v1}, LEt0;->k()V

    move-object v3, v7

    goto/16 :goto_e

    :cond_d
    :goto_b
    if-eqz v6, :cond_e

    sget-object v6, LgV2;->b0:LgV2$a;

    move-object/from16 v20, v6

    goto :goto_c

    :cond_e
    move-object/from16 v20, v7

    :goto_c
    if-eqz v8, :cond_f

    const/4 v6, 0x1

    move/from16 v21, v6

    goto :goto_d

    :cond_f
    move/from16 v21, v9

    :goto_d
    invoke-static {}, LQt0;->O()Z

    move-result v6

    if-eqz v6, :cond_10

    const/4 v6, -0x1

    const-string v7, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:11)"

    invoke-static {v0, v3, v6, v7}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_10
    sget-object v6, Lsi0;->a:Lsi0;

    sget-object v0, LTM2;->a:LTM2;

    sget v7, LTM2;->b:I

    invoke-virtual {v0, v1, v7}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v8

    invoke-virtual {v8}, LMm0;->j()J

    move-result-wide v8

    invoke-static {v0, v1, v7}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v10

    invoke-virtual {v10}, Lcom/stripe/android/uicore/StripeColors;->getSubtitle-0d7_KjU()J

    move-result-wide v10

    invoke-virtual {v0, v1, v7}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v0

    invoke-virtual {v0}, LMm0;->n()J

    move-result-wide v12

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    sget v0, Lsi0;->b:I

    shl-int/lit8 v18, v0, 0xf

    const/16 v19, 0x18

    move-wide v7, v8

    move-wide v9, v10

    move-wide v11, v12

    move-wide v13, v14

    move-wide/from16 v15, v16

    move-object/from16 v17, v1

    invoke-virtual/range {v6 .. v19}, Lsi0;->a(JJJJJLEt0;II)Lri0;

    move-result-object v11

    const/4 v10, 0x0

    and-int/lit8 v0, v3, 0xe

    and-int/lit8 v6, v3, 0x70

    or-int/2addr v0, v6

    and-int/lit16 v6, v3, 0x380

    or-int/2addr v0, v6

    and-int/lit16 v3, v3, 0x1c00

    or-int v13, v0, v3

    const/16 v14, 0x10

    move/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, v20

    move/from16 v9, v21

    move-object v12, v1

    invoke-static/range {v6 .. v14}, Lti0;->a(ZLkotlin/jvm/functions/Function1;LgV2;ZLrX2;Lri0;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, LQt0;->Y()V

    :cond_11
    move-object/from16 v3, v20

    move/from16 v9, v21

    :goto_e
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v7

    if-nez v7, :cond_12

    goto :goto_f

    :cond_12
    new-instance v8, Lcom/stripe/android/uicore/elements/menu/CheckboxKt$Checkbox$1;

    move-object v0, v8

    move/from16 v1, p0

    move-object/from16 v2, p1

    move v4, v9

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/uicore/elements/menu/CheckboxKt$Checkbox$1;-><init>(ZLkotlin/jvm/functions/Function1;LgV2;ZII)V

    invoke-interface {v7, v8}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_f
    return-void
.end method
