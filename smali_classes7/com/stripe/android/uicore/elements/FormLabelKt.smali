.class public final Lcom/stripe/android/uicore/elements/FormLabelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "text",
        "LgV2;",
        "modifier",
        "",
        "enabled",
        "",
        "FormLabel",
        "(Ljava/lang/String;LgV2;ZLEt0;II)V",
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
.method public static final FormLabel(Ljava/lang/String;LgV2;ZLEt0;II)V
    .locals 29

    move-object/from16 v2, p0

    move/from16 v3, p4

    const-string v0, "text"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x24a30353

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v4, p5, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v3, 0xe

    if-nez v4, :cond_2

    invoke-interface {v1, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v3

    goto :goto_1

    :cond_2
    move v4, v3

    :goto_1
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v3, 0x70

    if-nez v6, :cond_5

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v6, p1

    :goto_4
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v4, v4, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v8, v3, 0x380

    if-nez v8, :cond_8

    move/from16 v8, p2

    invoke-interface {v1, v8}, LEt0;->o(Z)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_5

    :cond_7
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v4, v9

    goto :goto_7

    :cond_8
    :goto_6
    move/from16 v8, p2

    :goto_7
    move v15, v4

    and-int/lit16 v4, v15, 0x2db

    const/16 v9, 0x92

    if-ne v4, v9, :cond_a

    invoke-interface {v1}, LEt0;->b()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_8

    :cond_9
    invoke-interface {v1}, LEt0;->k()V

    move-object/from16 v28, v1

    move-object v2, v6

    move v3, v8

    goto/16 :goto_c

    :cond_a
    :goto_8
    if-eqz v5, :cond_b

    sget-object v4, LgV2;->b0:LgV2$a;

    move-object/from16 v24, v4

    goto :goto_9

    :cond_b
    move-object/from16 v24, v6

    :goto_9
    if-eqz v7, :cond_c

    const/4 v4, 0x1

    move/from16 v25, v4

    goto :goto_a

    :cond_c
    move/from16 v25, v8

    :goto_a
    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_d

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.uicore.elements.FormLabel (FormLabel.kt:10)"

    invoke-static {v0, v15, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_d
    sget-object v0, LTM2;->a:LTM2;

    sget v13, LTM2;->b:I

    invoke-static {v0, v1, v13}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/uicore/StripeColors;->getPlaceholderText-0d7_KjU()J

    move-result-wide v5

    if-eqz v25, :cond_e

    move-wide/from16 v26, v5

    goto :goto_b

    :cond_e
    sget-object v4, LWz0;->a:LWz0;

    sget v7, LWz0;->b:I

    invoke-virtual {v4, v1, v7}, LWz0;->b(LEt0;I)F

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xe

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v4

    move-wide/from16 v26, v4

    :goto_b
    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v16, 0x0

    move v4, v13

    move-wide/from16 v13, v16

    const/4 v5, 0x0

    move/from16 v20, v15

    move v15, v5

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-virtual {v0, v1, v4}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v0

    invoke-virtual {v0}, LGc6;->k()LG26;

    move-result-object v19

    and-int/lit8 v0, v20, 0xe

    and-int/lit8 v4, v20, 0x70

    or-int v21, v0, v4

    const/16 v22, 0x0

    const/16 v23, 0x7ff8

    move-object/from16 v0, p0

    move-object/from16 v28, v1

    move-object/from16 v1, v24

    move-wide/from16 v2, v26

    move-object/from16 v20, v28

    const-wide/16 v4, 0x0

    invoke-static/range {v0 .. v23}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LQt0;->Y()V

    :cond_f
    move-object/from16 v2, v24

    move/from16 v3, v25

    :goto_c
    invoke-interface/range {v28 .. v28}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_10

    goto :goto_d

    :cond_10
    new-instance v7, Lcom/stripe/android/uicore/elements/FormLabelKt$FormLabel$1;

    move-object v0, v7

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/elements/FormLabelKt$FormLabel$1;-><init>(Ljava/lang/String;LgV2;ZII)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_d
    return-void
.end method
