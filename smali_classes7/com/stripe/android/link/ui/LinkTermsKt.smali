.class public final Lcom/stripe/android/link/ui/LinkTermsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a)\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u000c\u0010\t\u001a\u00020\u0008*\u00020\u0008H\u0002\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\n"
    }
    d2 = {
        "LgV2;",
        "modifier",
        "Lr06;",
        "textAlign",
        "",
        "LinkTerms-5stqomU",
        "(LgV2;ILEt0;II)V",
        "LinkTerms",
        "",
        "replaceHyperlinks",
        "link_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final LinkTerms-5stqomU(LgV2;ILEt0;II)V
    .locals 39

    move/from16 v0, p3

    move/from16 v1, p4

    const v2, -0x48591550

    move-object/from16 v3, p2

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v3, v1, 0x1

    const/4 v4, 0x2

    if-eqz v3, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0xe

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-interface {v15, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    move v6, v4

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v0

    :goto_1
    and-int/lit8 v7, v6, 0xb

    if-ne v7, v4, :cond_4

    invoke-interface {v15}, LEt0;->b()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v15}, LEt0;->k()V

    move/from16 v3, p1

    move-object v2, v15

    goto/16 :goto_6

    :cond_4
    :goto_2
    invoke-interface {v15}, LEt0;->J()V

    and-int/lit8 v4, v0, 0x1

    if-eqz v4, :cond_7

    invoke-interface {v15}, LEt0;->l()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {v15}, LEt0;->k()V

    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_6

    and-int/lit8 v6, v6, -0x71

    :cond_6
    move/from16 v17, p1

    move-object/from16 v16, v5

    goto :goto_5

    :cond_7
    :goto_3
    if-eqz v3, :cond_8

    sget-object v3, LgV2;->b0:LgV2$a;

    goto :goto_4

    :cond_8
    move-object v3, v5

    :goto_4
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_9

    sget-object v4, Lr06;->b:Lr06$a;

    invoke-virtual {v4}, Lr06$a;->a()I

    move-result v4

    and-int/lit8 v6, v6, -0x71

    move-object/from16 v16, v3

    move/from16 v17, v4

    goto :goto_5

    :cond_9
    move/from16 v17, p1

    move-object/from16 v16, v3

    :goto_5
    invoke-interface {v15}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_a

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.link.ui.LinkTerms (LinkTerms.kt:15)"

    invoke-static {v2, v6, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_a
    sget v2, Lcom/stripe/android/link/R$string;->sign_up_terms:I

    const/4 v3, 0x0

    invoke-static {v2, v15, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/stripe/android/link/ui/LinkTermsKt;->replaceHyperlinks(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v2, LTM2;->a:LTM2;

    sget v4, LTM2;->b:I

    invoke-static {v2, v15, v4}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/uicore/StripeColors;->getPlaceholderText-0d7_KjU()J

    move-result-wide v7

    invoke-virtual {v2, v15, v4}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v5

    invoke-virtual {v5}, LGc6;->k()LG26;

    move-result-object v9

    new-instance v10, LGN5;

    move-object/from16 v18, v10

    invoke-virtual {v2, v15, v4}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->j()J

    move-result-wide v19

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x3ffe

    const/16 v38, 0x0

    invoke-direct/range {v18 .. v38}, LGN5;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    shl-int/lit8 v4, v6, 0x3

    and-int/lit8 v14, v4, 0x70

    const/16 v18, 0x1a4

    move-object/from16 v4, v16

    move-wide v6, v7

    move-object v8, v9

    move v9, v2

    move-object v13, v15

    move-object v2, v15

    move/from16 v15, v18

    invoke-static/range {v3 .. v15}, Lcom/stripe/android/uicore/text/HtmlKt;->Html-m4MizFo(Ljava/lang/String;LgV2;Ljava/util/Map;JLG26;ZLGN5;ILkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-static {}, LQt0;->Y()V

    :cond_b
    move-object/from16 v5, v16

    move/from16 v3, v17

    :goto_6
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v2

    if-nez v2, :cond_c

    goto :goto_7

    :cond_c
    new-instance v4, Lcom/stripe/android/link/ui/LinkTermsKt$LinkTerms$1;

    invoke-direct {v4, v5, v3, v0, v1}, Lcom/stripe/android/link/ui/LinkTermsKt$LinkTerms$1;-><init>(LgV2;III)V

    invoke-interface {v2, v4}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method private static final replaceHyperlinks(Ljava/lang/String;)Ljava/lang/String;
    .locals 12

    const-string v1, "<terms>"

    const-string v2, "<a href=\"https://link.co/terms\">"

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "</terms>"

    const-string v8, "</a>"

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "<privacy>"

    const-string v2, "<a href=\"https://link.co/privacy\">"

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "</privacy>"

    const-string v8, "</a>"

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
