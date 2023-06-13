.class public final Lcom/stripe/android/link/ui/ErrorTextKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a+\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "ErrorTextPreview",
        "(LEt0;I)V",
        "",
        "text",
        "LgV2;",
        "modifier",
        "Lcom/stripe/android/link/ui/ErrorTextStyle;",
        "style",
        "ErrorText",
        "(Ljava/lang/String;LgV2;Lcom/stripe/android/link/ui/ErrorTextStyle;LEt0;II)V",
        "link_release"
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
        "SMAP\nErrorText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorText.kt\ncom/stripe/android/link/ui/ErrorTextKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,95:1\n75#2,6:96\n81#2:128\n85#2:133\n75#3:102\n76#3,11:104\n89#3:132\n76#4:103\n460#5,13:115\n473#5,3:129\n*S KotlinDebug\n*F\n+ 1 ErrorText.kt\ncom/stripe/android/link/ui/ErrorTextKt\n*L\n74#1:96,6\n74#1:128\n74#1:133\n74#1:102\n74#1:104,11\n74#1:132\n74#1:103\n74#1:115,13\n74#1:129,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final ErrorText(Ljava/lang/String;LgV2;Lcom/stripe/android/link/ui/ErrorTextStyle;LEt0;II)V
    .locals 19

    move-object/from16 v8, p0

    move/from16 v9, p4

    const-string v0, "text"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2e76b14d

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v7

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v9, 0xe

    if-nez v1, :cond_2

    invoke-interface {v7, v8}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_2
    move v1, v9

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v9, 0x70

    if-nez v3, :cond_5

    move-object/from16 v3, p1

    invoke-interface {v7, v3}, LEt0;->n(Ljava/lang/Object;)Z

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
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v5, v9, 0x380

    if-nez v5, :cond_8

    move-object/from16 v5, p2

    invoke-interface {v7, v5}, LEt0;->n(Ljava/lang/Object;)Z

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
    and-int/lit16 v6, v1, 0x2db

    const/16 v10, 0x92

    if-ne v6, v10, :cond_a

    invoke-interface {v7}, LEt0;->b()Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_8

    :cond_9
    invoke-interface {v7}, LEt0;->k()V

    move-object v2, v3

    move-object v3, v5

    move-object v11, v7

    goto/16 :goto_c

    :cond_a
    :goto_8
    if-eqz v2, :cond_b

    sget-object v2, LgV2;->b0:LgV2$a;

    move-object v6, v2

    goto :goto_9

    :cond_b
    move-object v6, v3

    :goto_9
    if-eqz v4, :cond_c

    sget-object v2, Lcom/stripe/android/link/ui/ErrorTextStyle$Medium;->INSTANCE:Lcom/stripe/android/link/ui/ErrorTextStyle$Medium;

    move-object/from16 v18, v2

    goto :goto_a

    :cond_c
    move-object/from16 v18, v5

    :goto_a
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_d

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.ErrorText (ErrorText.kt:68)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_d
    sget-object v0, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-static {v0, v7, v2}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/theme/LinkColors;->getErrorComponentBackground-0d7_KjU()J

    move-result-wide v3

    invoke-virtual/range {v18 .. v18}, Lcom/stripe/android/link/ui/ErrorTextStyle;->getShape()Lhy5;

    move-result-object v5

    invoke-static {v6, v3, v4, v5}, Lbw;->c(LgV2;JLhy5;)LgV2;

    move-result-object v3

    sget-object v4, LK9;->a:LK9$a;

    invoke-virtual {v4}, LK9$a;->h()LK9$c;

    move-result-object v4

    const v5, 0x2952b718

    invoke-interface {v7, v5}, LEt0;->F(I)V

    sget-object v5, Llo;->a:Llo;

    invoke-virtual {v5}, Llo;->f()Llo$d;

    move-result-object v5

    const/16 v10, 0x30

    invoke-static {v5, v4, v7, v10}, LYc5;->a(Llo$d;LK9$c;LEt0;I)LxO2;

    move-result-object v4

    const v5, -0x4ee9b9da

    invoke-interface {v7, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v7, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v10

    invoke-interface {v7, v10}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v11

    invoke-interface {v7, v11}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LJq6;

    sget-object v12, LBt0;->M:LBt0$a;

    invoke-virtual {v12}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    invoke-static {v3}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v3

    invoke-interface {v7}, LEt0;->v()Llm;

    move-result-object v14

    instance-of v14, v14, Llm;

    if-nez v14, :cond_e

    invoke-static {}, Lyt0;->c()V

    :cond_e
    invoke-interface {v7}, LEt0;->h()V

    invoke-interface {v7}, LEt0;->t()Z

    move-result v14

    if-eqz v14, :cond_f

    invoke-interface {v7, v13}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_b

    :cond_f
    invoke-interface {v7}, LEt0;->e()V

    :goto_b
    invoke-interface {v7}, LEt0;->L()V

    invoke-static {v7}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v13

    invoke-virtual {v12}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v14

    invoke-static {v13, v4, v14}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v13, v5, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v13, v10, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v12}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v13, v11, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v7}, LEt0;->q()V

    invoke-static {v7}, LMB5;->b(LEt0;)LEt0;

    move-result-object v4

    invoke-static {v4}, LMB5;->a(LEt0;)LMB5;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v3, v4, v7, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v3, 0x7ab4aae9

    invoke-interface {v7, v3}, LEt0;->F(I)V

    const v3, -0x286e2e7f

    invoke-interface {v7, v3}, LEt0;->F(I)V

    sget-object v3, Lad5;->a:Lad5;

    const v3, -0x50578931

    invoke-interface {v7, v3}, LEt0;->F(I)V

    sget v3, Lcom/stripe/android/link/R$drawable;->ic_link_error:I

    invoke-static {v3, v7, v5}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual/range {v18 .. v18}, Lcom/stripe/android/link/ui/ErrorTextStyle;->getIconModifier()LgV2;

    move-result-object v12

    invoke-static {v0, v7, v2}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/theme/LinkColors;->getErrorText-0d7_KjU()J

    move-result-wide v13

    const/16 v16, 0x38

    const/16 v17, 0x0

    move-object v15, v7

    invoke-static/range {v10 .. v17}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    invoke-virtual/range {v18 .. v18}, Lcom/stripe/android/link/ui/ErrorTextStyle;->getTextModifier()LgV2;

    move-result-object v3

    invoke-static {v0, v7, v2}, Lcom/stripe/android/link/theme/ThemeKt;->getLinkColors(LTM2;LEt0;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/link/theme/LinkColors;->getErrorText-0d7_KjU()J

    move-result-wide v4

    invoke-virtual/range {v18 .. v18}, Lcom/stripe/android/link/ui/ErrorTextStyle;->getTextStyle()LG26;

    move-result-object v10

    and-int/lit8 v11, v1, 0xe

    const/4 v12, 0x0

    move-object/from16 v0, p0

    move-object v1, v3

    move-wide v2, v4

    move-object v4, v10

    move-object v5, v7

    move-object v10, v6

    move v6, v11

    move-object v11, v7

    move v7, v12

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt;->HyperlinkedText-cf5BqRc(Ljava/lang/String;LgV2;JLG26;LEt0;II)V

    invoke-interface {v11}, LEt0;->Q()V

    invoke-interface {v11}, LEt0;->Q()V

    invoke-interface {v11}, LEt0;->Q()V

    invoke-interface {v11}, LEt0;->f()V

    invoke-interface {v11}, LEt0;->Q()V

    invoke-interface {v11}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LQt0;->Y()V

    :cond_10
    move-object v2, v10

    move-object/from16 v3, v18

    :goto_c
    invoke-interface {v11}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_11

    goto :goto_d

    :cond_11
    new-instance v7, Lcom/stripe/android/link/ui/ErrorTextKt$ErrorText$2;

    move-object v0, v7

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/link/ui/ErrorTextKt$ErrorText$2;-><init>(Ljava/lang/String;LgV2;Lcom/stripe/android/link/ui/ErrorTextStyle;II)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_d
    return-void
.end method

.method private static final ErrorTextPreview(LEt0;I)V
    .locals 7

    const v0, -0x6a3f6d9d

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

    const-string v2, "com.stripe.android.link.ui.ErrorTextPreview (ErrorText.kt:63)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const-string v1, "Test error message"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x6

    move-object v4, p0

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/link/ui/ErrorTextKt;->ErrorText(Ljava/lang/String;LgV2;Lcom/stripe/android/link/ui/ErrorTextStyle;LEt0;II)V

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
    new-instance v0, Lcom/stripe/android/link/ui/ErrorTextKt$ErrorTextPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/ErrorTextKt$ErrorTextPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final synthetic access$ErrorTextPreview(LEt0;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/ErrorTextKt;->ErrorTextPreview(LEt0;I)V

    return-void
.end method
