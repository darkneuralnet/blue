.class public final Lcom/stripe/android/uicore/text/HtmlKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a=\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a=\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\n0\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\u0008\u001aa\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00000\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a\u007f\u0010)\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\u0008\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u00002\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001e2\u0008\u0008\u0002\u0010!\u001a\u00020 2\u0008\u0008\u0002\u0010#\u001a\u00020\"2\u0008\u0008\u0002\u0010%\u001a\u00020$2\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\'\u0010(\u001a7\u0010,\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00012\u0014\u0008\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u00002\u0008\u0008\u0002\u0010%\u001a\u00020$H\u0007\u00a2\u0006\u0004\u0008,\u0010-\u001a\u0095\u0001\u00109\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\u0008\u0002\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u00002\u0008\u0008\u0002\u0010/\u001a\u00020\"2\u0008\u0008\u0002\u00101\u001a\u0002002\u0008\u0008\u0002\u00103\u001a\u0002022\u0014\u0008\u0002\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0015042\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001504H\u0003\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00087\u00108\"\u0014\u0010:\u001a\u00020\u00018\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008:\u0010;\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006<"
    }
    d2 = {
        "",
        "",
        "Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;",
        "drawableImageLoader",
        "LXU3;",
        "imageAlign",
        "LL22;",
        "rememberDrawableImages-0fZqiVQ",
        "(Ljava/util/Map;ILEt0;I)Ljava/util/Map;",
        "rememberDrawableImages",
        "Lcom/stripe/android/uicore/text/EmbeddableImage$Bitmap;",
        "bitmapImageLoader",
        "rememberBitmapImages-0fZqiVQ",
        "rememberBitmapImages",
        "LDf;",
        "annotatedText",
        "Lcom/stripe/android/uicore/text/EmbeddableImage;",
        "imageLoader",
        "Lcom/stripe/android/uicore/image/StripeImageLoader;",
        "stripeImageLoader",
        "Lkotlin/Function0;",
        "",
        "onLoaded",
        "LsP5;",
        "rememberRemoteImages-XiPi2c8",
        "(LDf;Ljava/util/Map;Lcom/stripe/android/uicore/image/StripeImageLoader;ILkotlin/jvm/functions/Function0;LEt0;I)LsP5;",
        "rememberRemoteImages",
        "html",
        "LgV2;",
        "modifier",
        "Lpm0;",
        "color",
        "LG26;",
        "style",
        "",
        "enabled",
        "LGN5;",
        "urlSpanStyle",
        "onClick",
        "Html-m4MizFo",
        "(Ljava/lang/String;LgV2;Ljava/util/Map;JLG26;ZLGN5;ILkotlin/jvm/functions/Function0;LEt0;II)V",
        "Html",
        "text",
        "imageGetter",
        "annotatedStringResource",
        "(Ljava/lang/String;Ljava/util/Map;LGN5;LEt0;II)LDf;",
        "inlineContent",
        "softWrap",
        "Ln26;",
        "overflow",
        "",
        "maxLines",
        "Lkotlin/Function1;",
        "Li26;",
        "onTextLayout",
        "ClickableText-mZk19tU",
        "(LDf;JLG26;LgV2;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V",
        "ClickableText",
        "LINK_TAG",
        "Ljava/lang/String;",
        "stripe-ui-core_release"
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
        "SMAP\nHtml.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 8 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 9 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,433:1\n1179#2,2:434\n1253#2,2:436\n1256#2:440\n1179#2,2:441\n1253#2,2:443\n1256#2:446\n766#2:447\n857#2,2:448\n141#3,2:438\n76#4:445\n76#4:456\n76#4:457\n76#4:458\n1057#5,6:450\n1057#5,6:460\n1057#5,6:467\n1057#5,6:488\n1057#5,6:494\n1057#5,3:500\n1060#5,3:506\n1057#5,6:509\n1057#5,6:515\n1057#5,6:523\n25#6:459\n25#6:466\n36#6:487\n50#6:521\n49#6:522\n483#7,7:473\n483#7,7:480\n916#8:503\n13579#9,2:504\n*S KotlinDebug\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt\n*L\n82#1:434,2\n82#1:436,2\n82#1:440\n115#1:441,2\n115#1:443,2\n115#1:446\n150#1:447\n150#1:448,2\n86#1:438,2\n116#1:445\n157#1:456\n226#1:457\n232#1:458\n156#1:450,6\n234#1:460,6\n235#1:467,6\n263#1:488,6\n308#1:494,6\n311#1:500,3\n311#1:506,3\n397#1:509,6\n398#1:515,6\n426#1:523,6\n234#1:459\n235#1:466\n263#1:487\n426#1:521\n426#1:522\n244#1:473,7\n252#1:480,7\n312#1:503\n314#1:504,2\n*E\n"
    }
.end annotation


# static fields
.field private static final LINK_TAG:Ljava/lang/String; = "URL"


# direct methods
.method private static final ClickableText-mZk19tU(LDf;JLG26;LgV2;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDf;",
            "J",
            "LG26;",
            "LgV2;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LL22;",
            ">;ZII",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Li26;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    const v0, -0x74686388

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v1

    and-int/lit8 v2, v13, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v12, 0x6

    move v4, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v12, 0xe

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v12

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v4, v12

    :goto_1
    and-int/lit8 v5, v13, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v4, v4, 0x30

    move-wide/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v12, 0x70

    move-wide/from16 v7, p1

    if-nez v5, :cond_5

    invoke-interface {v1, v7, v8}, LEt0;->s(J)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, v13, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v4, v4, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v12, 0x380

    if-nez v5, :cond_8

    move-object/from16 v5, p3

    invoke-interface {v1, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v4, v9

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v5, p3

    :goto_6
    and-int/lit8 v9, v13, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v4, v4, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v10, v12, 0x1c00

    if-nez v10, :cond_b

    move-object/from16 v10, p4

    invoke-interface {v1, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_7

    :cond_a
    const/16 v14, 0x400

    :goto_7
    or-int/2addr v4, v14

    goto :goto_9

    :cond_b
    :goto_8
    move-object/from16 v10, p4

    :goto_9
    and-int/lit8 v14, v13, 0x10

    if-eqz v14, :cond_c

    or-int/lit16 v4, v4, 0x2000

    :cond_c
    and-int/lit8 v15, v13, 0x20

    const/high16 v40, 0x70000

    if-eqz v15, :cond_d

    const/high16 v16, 0x30000

    or-int v4, v4, v16

    move/from16 v3, p6

    goto :goto_b

    :cond_d
    and-int v16, v12, v40

    move/from16 v3, p6

    if-nez v16, :cond_f

    invoke-interface {v1, v3}, LEt0;->o(Z)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_e
    const/high16 v16, 0x10000

    :goto_a
    or-int v4, v4, v16

    :cond_f
    :goto_b
    and-int/lit8 v16, v13, 0x40

    const/high16 v41, 0x380000

    if-eqz v16, :cond_10

    const/high16 v17, 0x180000

    or-int v4, v4, v17

    move/from16 v0, p7

    goto :goto_d

    :cond_10
    and-int v17, v12, v41

    move/from16 v0, p7

    if-nez v17, :cond_12

    invoke-interface {v1, v0}, LEt0;->r(I)Z

    move-result v18

    if-eqz v18, :cond_11

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_11
    const/high16 v18, 0x80000

    :goto_c
    or-int v4, v4, v18

    :cond_12
    :goto_d
    and-int/lit16 v6, v13, 0x80

    if-eqz v6, :cond_13

    const/high16 v19, 0xc00000

    or-int v4, v4, v19

    move/from16 v0, p8

    goto :goto_f

    :cond_13
    const/high16 v19, 0x1c00000

    and-int v19, v12, v19

    move/from16 v0, p8

    if-nez v19, :cond_15

    invoke-interface {v1, v0}, LEt0;->r(I)Z

    move-result v19

    if-eqz v19, :cond_14

    const/high16 v19, 0x800000

    goto :goto_e

    :cond_14
    const/high16 v19, 0x400000

    :goto_e
    or-int v4, v4, v19

    :cond_15
    :goto_f
    and-int/lit16 v0, v13, 0x100

    if-eqz v0, :cond_16

    const/high16 v19, 0x6000000

    or-int v4, v4, v19

    move-object/from16 v2, p9

    goto :goto_11

    :cond_16
    const/high16 v19, 0xe000000

    and-int v19, v12, v19

    move-object/from16 v2, p9

    if-nez v19, :cond_18

    invoke-interface {v1, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_17

    const/high16 v19, 0x4000000

    goto :goto_10

    :cond_17
    const/high16 v19, 0x2000000

    :goto_10
    or-int v4, v4, v19

    :cond_18
    :goto_11
    and-int/lit16 v2, v13, 0x200

    if-eqz v2, :cond_19

    const/high16 v2, 0x30000000

    :goto_12
    or-int/2addr v4, v2

    goto :goto_13

    :cond_19
    const/high16 v2, 0x70000000

    and-int/2addr v2, v12

    if-nez v2, :cond_1b

    invoke-interface {v1, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1a

    const/high16 v2, 0x20000000

    goto :goto_12

    :cond_1a
    const/high16 v2, 0x10000000

    goto :goto_12

    :cond_1b
    :goto_13
    const/16 v2, 0x10

    if-ne v14, v2, :cond_1d

    const v2, 0x5b6db6db

    and-int/2addr v2, v4

    const v3, 0x12492492

    if-ne v2, v3, :cond_1d

    invoke-interface {v1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_1c

    goto :goto_14

    :cond_1c
    invoke-interface {v1}, LEt0;->k()V

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object v5, v10

    move-object/from16 v10, p9

    goto/16 :goto_1b

    :cond_1d
    :goto_14
    if-eqz v9, :cond_1e

    sget-object v2, LgV2;->b0:LgV2$a;

    goto :goto_15

    :cond_1e
    move-object v2, v10

    :goto_15
    if-eqz v14, :cond_1f

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    goto :goto_16

    :cond_1f
    move-object/from16 v3, p5

    :goto_16
    if-eqz v15, :cond_20

    const/4 v9, 0x1

    goto :goto_17

    :cond_20
    move/from16 v9, p6

    :goto_17
    if-eqz v16, :cond_21

    sget-object v10, Ln26;->a:Ln26$a;

    invoke-virtual {v10}, Ln26$a;->a()I

    move-result v10

    goto :goto_18

    :cond_21
    move/from16 v10, p7

    :goto_18
    if-eqz v6, :cond_22

    const v6, 0x7fffffff

    goto :goto_19

    :cond_22
    move/from16 v6, p8

    :goto_19
    if-eqz v0, :cond_23

    sget-object v0, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$1;->INSTANCE:Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$1;

    goto :goto_1a

    :cond_23
    move-object/from16 v0, p9

    :goto_1a
    invoke-static {}, LQt0;->O()Z

    move-result v14

    if-eqz v14, :cond_24

    const/4 v14, -0x1

    const-string v15, "com.stripe.android.uicore.text.ClickableText (Html.kt:384)"

    const v5, -0x74686388

    invoke-static {v5, v4, v14, v15}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_24
    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    sget-object v42, LEt0;->a:LEt0$a;

    invoke-virtual/range {v42 .. v42}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v14

    const/4 v15, 0x0

    if-ne v5, v14, :cond_25

    const/4 v14, 0x2

    invoke-static {v15, v15, v14, v15}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v5

    invoke-interface {v1, v5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_25
    check-cast v5, LEX2;

    sget-object v14, LgV2;->b0:LgV2$a;

    invoke-interface {v1, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v16

    invoke-interface {v1, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v15

    if-nez v16, :cond_26

    invoke-virtual/range {v42 .. v42}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v15, v7, :cond_27

    :cond_26
    new-instance v15, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$pressIndicator$1$1;

    const/4 v7, 0x0

    invoke-direct {v15, v5, v11, v7}, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$pressIndicator$1$1;-><init>(LEX2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    invoke-interface {v1, v15}, LEt0;->z(Ljava/lang/Object;)V

    :cond_27
    check-cast v15, Lkotlin/jvm/functions/Function2;

    invoke-static {v14, v11, v15}, LzW5;->c(LgV2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)LgV2;

    move-result-object v7

    invoke-interface {v2, v7}, LgV2;->t0(LgV2;)LgV2;

    move-result-object v7

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const v38, 0x3fffe

    const/16 v39, 0x0

    move-object/from16 v14, p3

    move-wide/from16 v15, p1

    invoke-static/range {v14 .. v39}, LG26;->e(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;ILjava/lang/Object;)LG26;

    move-result-object v16

    const v8, 0x1e7b2b64

    invoke-interface {v1, v8}, LEt0;->F(I)V

    invoke-interface {v1, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    invoke-interface {v1, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v8, v14

    invoke-interface {v1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v14

    if-nez v8, :cond_28

    invoke-virtual/range {v42 .. v42}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v14, v8, :cond_29

    :cond_28
    new-instance v14, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$2$1;

    invoke-direct {v14, v5, v0}, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$2$1;-><init>(LEX2;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v14}, LEt0;->z(Ljava/lang/Object;)V

    :cond_29
    invoke-interface {v1}, LEt0;->Q()V

    move-object/from16 v17, v14

    check-cast v17, Lkotlin/jvm/functions/Function1;

    const/high16 v5, 0x1000000

    and-int/lit8 v8, v4, 0xe

    or-int/2addr v5, v8

    const v8, 0xe000

    shr-int/lit8 v14, v4, 0x6

    and-int/2addr v8, v14

    or-int/2addr v5, v8

    and-int v8, v4, v40

    or-int/2addr v5, v8

    shr-int/lit8 v4, v4, 0x3

    and-int v4, v4, v41

    or-int v23, v5, v4

    const/16 v24, 0x0

    move-object/from16 v14, p0

    move-object v15, v7

    move/from16 v18, v10

    move/from16 v19, v9

    move/from16 v20, v6

    move-object/from16 v21, v3

    move-object/from16 v22, v1

    invoke-static/range {v14 .. v24}, LUE;->a(LDf;LgV2;LG26;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_2a

    invoke-static {}, LQt0;->Y()V

    :cond_2a
    move-object v5, v2

    move v7, v9

    move v8, v10

    move-object v10, v0

    move v9, v6

    move-object v6, v3

    :goto_1b
    invoke-interface {v1}, LEt0;->w()LWm5;

    move-result-object v14

    if-nez v14, :cond_2b

    goto :goto_1c

    :cond_2b
    new-instance v15, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;

    move-object v0, v15

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Lcom/stripe/android/uicore/text/HtmlKt$ClickableText$3;-><init>(LDf;JLG26;LgV2;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    invoke-interface {v14, v15}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1c
    return-void
.end method

.method public static final Html-m4MizFo(Ljava/lang/String;LgV2;Ljava/util/Map;JLG26;ZLGN5;ILkotlin/jvm/functions/Function0;LEt0;II)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LgV2;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/stripe/android/uicore/text/EmbeddableImage;",
            ">;J",
            "LG26;",
            "Z",
            "LGN5;",
            "I",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v11, p11

    move/from16 v12, p12

    const-string v0, "html"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x95e229

    move-object/from16 v2, p10

    invoke-interface {v2, v0}, LEt0;->u(I)LEt0;

    move-result-object v2

    and-int/lit8 v3, v12, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v11, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v11, 0xe

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v11

    goto :goto_1

    :cond_2
    move v3, v11

    :goto_1
    and-int/lit8 v6, v12, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v11, 0x70

    if-nez v7, :cond_5

    move-object/from16 v7, p1

    invoke-interface {v2, v7}, LEt0;->n(Ljava/lang/Object;)Z

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
    move-object/from16 v7, p1

    :goto_4
    and-int/lit8 v8, v12, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v3, v3, 0x80

    :cond_6
    and-int/lit8 v9, v12, 0x8

    if-eqz v9, :cond_7

    or-int/lit16 v3, v3, 0xc00

    move-wide/from16 v13, p3

    goto :goto_6

    :cond_7
    and-int/lit16 v10, v11, 0x1c00

    move-wide/from16 v13, p3

    if-nez v10, :cond_9

    invoke-interface {v2, v13, v14}, LEt0;->s(J)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x800

    goto :goto_5

    :cond_8
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v3, v10

    :cond_9
    :goto_6
    const v10, 0xe000

    and-int/2addr v10, v11

    if-nez v10, :cond_c

    and-int/lit8 v10, v12, 0x10

    if-nez v10, :cond_a

    move-object/from16 v10, p5

    invoke-interface {v2, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_b

    const/16 v15, 0x4000

    goto :goto_7

    :cond_a
    move-object/from16 v10, p5

    :cond_b
    const/16 v15, 0x2000

    :goto_7
    or-int/2addr v3, v15

    goto :goto_8

    :cond_c
    move-object/from16 v10, p5

    :goto_8
    and-int/lit8 v15, v12, 0x20

    if-eqz v15, :cond_d

    const/high16 v16, 0x30000

    or-int v3, v3, v16

    move/from16 v5, p6

    goto :goto_a

    :cond_d
    const/high16 v16, 0x70000

    and-int v16, v11, v16

    move/from16 v5, p6

    if-nez v16, :cond_f

    invoke-interface {v2, v5}, LEt0;->o(Z)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x20000

    goto :goto_9

    :cond_e
    const/high16 v16, 0x10000

    :goto_9
    or-int v3, v3, v16

    :cond_f
    :goto_a
    and-int/lit8 v16, v12, 0x40

    if-eqz v16, :cond_10

    const/high16 v17, 0x180000

    or-int v3, v3, v17

    move-object/from16 v0, p7

    goto :goto_c

    :cond_10
    const/high16 v17, 0x380000

    and-int v17, v11, v17

    move-object/from16 v0, p7

    if-nez v17, :cond_12

    invoke-interface {v2, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_11

    const/high16 v18, 0x100000

    goto :goto_b

    :cond_11
    const/high16 v18, 0x80000

    :goto_b
    or-int v3, v3, v18

    :cond_12
    :goto_c
    const/high16 v18, 0x1c00000

    and-int v18, v11, v18

    if-nez v18, :cond_15

    and-int/lit16 v4, v12, 0x80

    if-nez v4, :cond_13

    move/from16 v4, p8

    invoke-interface {v2, v4}, LEt0;->r(I)Z

    move-result v19

    if-eqz v19, :cond_14

    const/high16 v19, 0x800000

    goto :goto_d

    :cond_13
    move/from16 v4, p8

    :cond_14
    const/high16 v19, 0x400000

    :goto_d
    or-int v3, v3, v19

    goto :goto_e

    :cond_15
    move/from16 v4, p8

    :goto_e
    and-int/lit16 v0, v12, 0x100

    if-eqz v0, :cond_16

    const/high16 v19, 0x6000000

    :goto_f
    or-int v3, v3, v19

    goto :goto_10

    :cond_16
    const/high16 v19, 0xe000000

    and-int v19, v11, v19

    move-object/from16 v1, p9

    if-nez v19, :cond_18

    invoke-interface {v2, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_17

    const/high16 v19, 0x4000000

    goto :goto_f

    :cond_17
    const/high16 v19, 0x2000000

    goto :goto_f

    :cond_18
    :goto_10
    const/4 v1, 0x4

    if-ne v8, v1, :cond_1a

    const v1, 0xb6db6db

    and-int/2addr v1, v3

    const v4, 0x2492492

    if-ne v1, v4, :cond_1a

    invoke-interface {v2}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_19

    goto :goto_11

    :cond_19
    invoke-interface {v2}, LEt0;->k()V

    move-object/from16 v3, p2

    move-object/from16 v9, p7

    move-object/from16 v11, p9

    move v8, v5

    move-object v6, v10

    move-wide v4, v13

    move/from16 v10, p8

    goto/16 :goto_1c

    :cond_1a
    :goto_11
    invoke-interface {v2}, LEt0;->J()V

    and-int/lit8 v1, v11, 0x1

    const v18, -0xe001

    if-eqz v1, :cond_1e

    invoke-interface {v2}, LEt0;->l()Z

    move-result v1

    if-eqz v1, :cond_1b

    goto :goto_13

    :cond_1b
    invoke-interface {v2}, LEt0;->k()V

    and-int/lit8 v0, v12, 0x10

    if-eqz v0, :cond_1c

    and-int v3, v3, v18

    :cond_1c
    and-int/lit16 v0, v12, 0x80

    if-eqz v0, :cond_1d

    const v0, -0x1c00001

    and-int/2addr v3, v0

    :cond_1d
    move-object/from16 v1, p2

    move/from16 v0, p8

    move-object v6, v10

    move-wide v8, v13

    move-object/from16 v10, p7

    :goto_12
    move v13, v3

    move-object/from16 v3, p9

    goto/16 :goto_19

    :cond_1e
    :goto_13
    if-eqz v6, :cond_1f

    sget-object v1, LgV2;->b0:LgV2$a;

    move-object v7, v1

    :cond_1f
    if-eqz v8, :cond_20

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    goto :goto_14

    :cond_20
    move-object/from16 v1, p2

    :goto_14
    if-eqz v9, :cond_21

    sget-object v6, Lpm0;->b:Lpm0$a;

    invoke-virtual {v6}, Lpm0$a;->g()J

    move-result-wide v8

    goto :goto_15

    :cond_21
    move-wide v8, v13

    :goto_15
    and-int/lit8 v6, v12, 0x10

    if-eqz v6, :cond_22

    invoke-static {}, Lc26;->f()LU94;

    move-result-object v6

    invoke-interface {v2, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LG26;

    and-int v3, v3, v18

    goto :goto_16

    :cond_22
    move-object v6, v10

    :goto_16
    if-eqz v15, :cond_23

    const/4 v5, 0x1

    :cond_23
    if-eqz v16, :cond_24

    new-instance v10, LGN5;

    move-object/from16 v20, v10

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    sget-object v13, LR06;->b:LR06$a;

    invoke-virtual {v13}, LR06$a;->d()LR06;

    move-result-object v37

    const/16 v38, 0x0

    const/16 v39, 0x2fff

    const/16 v40, 0x0

    invoke-direct/range {v20 .. v40}, LGN5;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_17

    :cond_24
    move-object/from16 v10, p7

    :goto_17
    and-int/lit16 v13, v12, 0x80

    if-eqz v13, :cond_25

    sget-object v13, LXU3;->a:LXU3$a;

    invoke-virtual {v13}, LXU3$a;->a()I

    move-result v13

    const v14, -0x1c00001

    and-int/2addr v3, v14

    goto :goto_18

    :cond_25
    move/from16 v13, p8

    :goto_18
    if-eqz v0, :cond_26

    sget-object v0, Lcom/stripe/android/uicore/text/HtmlKt$Html$1;->INSTANCE:Lcom/stripe/android/uicore/text/HtmlKt$Html$1;

    move/from16 v41, v3

    move-object v3, v0

    move v0, v13

    move/from16 v13, v41

    goto :goto_19

    :cond_26
    move v0, v13

    goto :goto_12

    :goto_19
    invoke-interface {v2}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v14

    if-eqz v14, :cond_27

    const/4 v14, -0x1

    const-string v15, "com.stripe.android.uicore.text.Html (Html.kt:220)"

    const v4, -0x95e229

    invoke-static {v4, v13, v14, v15}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_27
    invoke-static {}, Landroidx/compose/ui/platform/h;->g()LU94;

    move-result-object v4

    invoke-interface {v2, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    and-int/lit8 v14, v13, 0xe

    or-int/lit8 v14, v14, 0x40

    shr-int/lit8 v15, v13, 0xc

    and-int/lit16 v11, v15, 0x380

    or-int/2addr v11, v14

    const/4 v14, 0x0

    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v10

    move-object/from16 p4, v2

    move/from16 p5, v11

    move/from16 p6, v14

    invoke-static/range {p1 .. p6}, Lcom/stripe/android/uicore/text/HtmlKt;->annotatedStringResource(Ljava/lang/String;Ljava/util/Map;LGN5;LEt0;II)LDf;

    move-result-object v11

    const v14, -0x1d58f75c

    invoke-interface {v2, v14}, LEt0;->F(I)V

    invoke-interface {v2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v14

    sget-object v17, LEt0;->a:LEt0$a;

    move-object/from16 p9, v10

    invoke-virtual/range {v17 .. v17}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v14, v10, :cond_28

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v14, 0x0

    const/4 v12, 0x2

    invoke-static {v10, v14, v12, v14}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v14

    invoke-interface {v2, v14}, LEt0;->z(Ljava/lang/Object;)V

    :cond_28
    invoke-interface {v2}, LEt0;->Q()V

    check-cast v14, LEX2;

    const v10, -0x1d58f75c

    invoke-interface {v2, v10}, LEt0;->F(I)V

    invoke-interface {v2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual/range {v17 .. v17}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v12

    if-ne v10, v12, :cond_29

    new-instance v10, Lcom/stripe/android/uicore/image/StripeImageLoader;

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xe

    const/16 v21, 0x0

    move-object/from16 p1, v10

    move-object/from16 p2, v4

    move-object/from16 p3, v12

    move-object/from16 p4, v17

    move-object/from16 p5, v18

    move-object/from16 p6, v19

    move/from16 p7, v20

    move-object/from16 p8, v21

    invoke-direct/range {p1 .. p8}, Lcom/stripe/android/uicore/image/StripeImageLoader;-><init>(Landroid/content/Context;Lcom/stripe/android/core/Logger;Lcom/stripe/android/uicore/image/ImageLruMemoryCache;Lcom/stripe/android/uicore/image/NetworkImageDecoder;Lcom/stripe/android/uicore/image/ImageLruDiskCache;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v10}, LEt0;->z(Ljava/lang/Object;)V

    :cond_29
    invoke-interface {v2}, LEt0;->Q()V

    check-cast v10, Lcom/stripe/android/uicore/image/StripeImageLoader;

    new-instance v12, Ljava/util/LinkedHashMap;

    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v17

    invoke-interface/range {v17 .. v17}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_1a
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_2b

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/util/Map$Entry;

    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 p8, v6

    move-object/from16 v6, v19

    check-cast v6, Lcom/stripe/android/uicore/text/EmbeddableImage;

    instance-of v6, v6, Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;

    if-eqz v6, :cond_2a

    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    move-wide/from16 v27, v8

    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v12, v6, v8}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v6, p8

    move-wide/from16 v8, v27

    goto :goto_1a

    :cond_2a
    move-object/from16 v6, p8

    goto :goto_1a

    :cond_2b
    move-object/from16 p8, v6

    move-wide/from16 v27, v8

    shr-int/lit8 v6, v13, 0x12

    and-int/lit8 v6, v6, 0x70

    or-int/lit8 v6, v6, 0x8

    invoke-static {v12, v0, v2, v6}, Lcom/stripe/android/uicore/text/HtmlKt;->rememberDrawableImages-0fZqiVQ(Ljava/util/Map;ILEt0;I)Ljava/util/Map;

    move-result-object v8

    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1b
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_2d

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/util/Map$Entry;

    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 p1, v12

    move-object/from16 v12, v18

    check-cast v12, Lcom/stripe/android/uicore/text/EmbeddableImage;

    instance-of v12, v12, Lcom/stripe/android/uicore/text/EmbeddableImage$Bitmap;

    if-eqz v12, :cond_2c

    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    move/from16 v18, v13

    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v9, v12, v13}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v12, p1

    move/from16 v13, v18

    goto :goto_1b

    :cond_2c
    move-object/from16 v12, p1

    goto :goto_1b

    :cond_2d
    move/from16 v18, v13

    invoke-static {v9, v0, v2, v6}, Lcom/stripe/android/uicore/text/HtmlKt;->rememberBitmapImages-0fZqiVQ(Ljava/util/Map;ILEt0;I)Ljava/util/Map;

    move-result-object v6

    const v9, 0x44faf204

    invoke-interface {v2, v9}, LEt0;->F(I)V

    invoke-interface {v2, v14}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    invoke-interface {v2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v12

    if-nez v9, :cond_2e

    sget-object v9, LEt0;->a:LEt0$a;

    invoke-virtual {v9}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v12, v9, :cond_2f

    :cond_2e
    new-instance v12, Lcom/stripe/android/uicore/text/HtmlKt$Html$remoteImages$1$1;

    invoke-direct {v12, v14}, Lcom/stripe/android/uicore/text/HtmlKt$Html$remoteImages$1$1;-><init>(LEX2;)V

    invoke-interface {v2, v12}, LEt0;->z(Ljava/lang/Object;)V

    :cond_2f
    invoke-interface {v2}, LEt0;->Q()V

    move-object v9, v12

    check-cast v9, Lkotlin/jvm/functions/Function0;

    and-int/lit16 v12, v15, 0x1c00

    or-int/lit16 v12, v12, 0x240

    move-object/from16 p1, v11

    move-object/from16 p2, v1

    move-object/from16 p3, v10

    move/from16 p4, v0

    move-object/from16 p5, v9

    move-object/from16 p6, v2

    move/from16 p7, v12

    invoke-static/range {p1 .. p7}, Lcom/stripe/android/uicore/text/HtmlKt;->rememberRemoteImages-XiPi2c8(LDf;Ljava/util/Map;Lcom/stripe/android/uicore/image/StripeImageLoader;ILkotlin/jvm/functions/Function0;LEt0;I)LsP5;

    move-result-object v9

    invoke-interface {v9}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map;

    invoke-interface {v9}, Ljava/util/Map;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_30

    invoke-interface {v14}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_31

    :cond_30
    sget-object v10, Lcom/stripe/android/uicore/text/HtmlKt$Html$2;->INSTANCE:Lcom/stripe/android/uicore/text/HtmlKt$Html$2;

    const/4 v12, 0x1

    invoke-static {v7, v12, v10}, Lfs5;->a(LgV2;ZLkotlin/jvm/functions/Function1;)LgV2;

    move-result-object v17

    invoke-static {v8, v6}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    invoke-static {v6, v9}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    new-instance v8, Lcom/stripe/android/uicore/text/HtmlKt$Html$3;

    invoke-direct {v8, v5, v3, v11, v4}, Lcom/stripe/android/uicore/text/HtmlKt$Html$3;-><init>(ZLkotlin/jvm/functions/Function0;LDf;Landroid/content/Context;)V

    shr-int/lit8 v4, v18, 0x6

    and-int/lit8 v9, v4, 0x70

    const v10, 0x8000

    or-int/2addr v9, v10

    and-int/lit16 v4, v4, 0x380

    or-int v25, v9, v4

    const/16 v26, 0x1e0

    move-object v13, v11

    move-wide/from16 v14, v27

    move-object/from16 v16, p8

    move-object/from16 v18, v6

    move-object/from16 v23, v8

    move-object/from16 v24, v2

    invoke-static/range {v13 .. v26}, Lcom/stripe/android/uicore/text/HtmlKt;->ClickableText-mZk19tU(LDf;JLG26;LgV2;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V

    :cond_31
    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_32

    invoke-static {}, LQt0;->Y()V

    :cond_32
    move-object/from16 v6, p8

    move-object/from16 v9, p9

    move v10, v0

    move-object v11, v3

    move v8, v5

    move-wide/from16 v4, v27

    move-object v3, v1

    :goto_1c
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v13

    if-nez v13, :cond_33

    goto :goto_1d

    :cond_33
    new-instance v14, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object v2, v7

    move v7, v8

    move-object v8, v9

    move v9, v10

    move-object v10, v11

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lcom/stripe/android/uicore/text/HtmlKt$Html$4;-><init>(Ljava/lang/String;LgV2;Ljava/util/Map;JLG26;ZLGN5;ILkotlin/jvm/functions/Function0;II)V

    invoke-interface {v13, v14}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1d
    return-void
.end method

.method public static final synthetic access$ClickableText-mZk19tU(LDf;JLG26;LgV2;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V
    .locals 0

    invoke-static/range {p0 .. p13}, Lcom/stripe/android/uicore/text/HtmlKt;->ClickableText-mZk19tU(LDf;JLG26;LgV2;Ljava/util/Map;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V

    return-void
.end method

.method public static final annotatedStringResource(Ljava/lang/String;Ljava/util/Map;LGN5;LEt0;II)LDf;
    .locals 56
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/stripe/android/uicore/text/EmbeddableImage;",
            ">;",
            "LGN5;",
            "LEt0;",
            "II)",
            "LDf;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-string v2, "text"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x74f92f20

    invoke-interface {v1, v2}, LEt0;->F(I)V

    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_1

    new-instance v4, LGN5;

    move-object v5, v4

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    sget-object v22, LR06;->b:LR06$a;

    invoke-virtual/range {v22 .. v22}, LR06$a;->d()LR06;

    move-result-object v22

    const/16 v23, 0x0

    const/16 v24, 0x2fff

    const/16 v25, 0x0

    invoke-direct/range {v5 .. v25}, LGN5;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object/from16 v4, p2

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v5, -0x1

    const-string v6, "com.stripe.android.uicore.text.annotatedStringResource (Html.kt:302)"

    move/from16 v7, p4

    invoke-static {v2, v7, v5, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    invoke-interface {v1, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p3 .. p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v2, :cond_3

    sget-object v2, LEt0;->a:LEt0$a;

    invoke-virtual {v2}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_4

    :cond_3
    invoke-static {v0, v6}, LwN1;->a(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v5

    invoke-interface {v1, v5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    const-string v0, "remember(text) {\n       \u2026M_HTML_MODE_LEGACY)\n    }"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Landroid/text/Spanned;

    invoke-interface {v1, v5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface/range {p3 .. p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_5

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_13

    :cond_5
    new-instance v0, LDf$a;

    const/4 v2, 0x1

    const/4 v7, 0x0

    invoke-direct {v0, v6, v2, v7}, LDf$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v8

    const-class v9, Ljava/lang/Object;

    invoke-interface {v5, v6, v8, v9}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v8

    const-string v9, "spanned.getSpans(0, span\u2026.length, Any::class.java)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v9, v8

    move v10, v6

    :goto_2
    if-ge v6, v9, :cond_11

    aget-object v11, v8, v6

    invoke-interface {v5, v11}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v12

    invoke-interface {v5, v11}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v13

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v14

    if-ge v10, v14, :cond_10

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v14

    if-ge v12, v14, :cond_10

    sub-int v14, v12, v10

    if-ltz v14, :cond_10

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14, v10, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    const-string v14, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v10, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v10}, LDf$a;->i(Ljava/lang/String;)V

    instance-of v10, v11, Landroid/text/style/StyleSpan;

    const/4 v14, 0x2

    if-eqz v10, :cond_9

    check-cast v11, Landroid/text/style/StyleSpan;

    invoke-virtual {v11}, Landroid/text/style/StyleSpan;->getStyle()I

    move-result v10

    if-eq v10, v2, :cond_8

    if-eq v10, v14, :cond_7

    const/4 v11, 0x3

    if-eq v10, v11, :cond_6

    goto/16 :goto_3

    :cond_6
    new-instance v10, LGN5;

    move-object v14, v10

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    sget-object v11, LJw1;->c:LJw1$a;

    invoke-virtual {v11}, LJw1$a;->a()LJw1;

    move-result-object v19

    sget-object v11, LEw1;->b:LEw1$a;

    invoke-virtual {v11}, LEw1$a;->a()I

    move-result v11

    invoke-static {v11}, LEw1;->c(I)LEw1;

    move-result-object v20

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x3ff3

    const/16 v34, 0x0

    invoke-direct/range {v14 .. v34}, LGN5;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v10, v12, v13}, LDf$a;->c(LGN5;II)V

    goto/16 :goto_3

    :cond_7
    new-instance v10, LGN5;

    move-object/from16 v35, v10

    const-wide/16 v36, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    sget-object v11, LEw1;->b:LEw1$a;

    invoke-virtual {v11}, LEw1$a;->a()I

    move-result v11

    invoke-static {v11}, LEw1;->c(I)LEw1;

    move-result-object v41

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

    const/16 v54, 0x3ff7

    const/16 v55, 0x0

    invoke-direct/range {v35 .. v55}, LGN5;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v10, v12, v13}, LDf$a;->c(LGN5;II)V

    goto/16 :goto_3

    :cond_8
    new-instance v10, LGN5;

    move-object v14, v10

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    sget-object v11, LJw1;->c:LJw1$a;

    invoke-virtual {v11}, LJw1$a;->a()LJw1;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x3ffb

    const/16 v34, 0x0

    invoke-direct/range {v14 .. v34}, LGN5;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v10, v12, v13}, LDf$a;->c(LGN5;II)V

    goto/16 :goto_3

    :cond_9
    instance-of v10, v11, Landroid/text/style/UnderlineSpan;

    if-eqz v10, :cond_a

    new-instance v10, LGN5;

    move-object v15, v10

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    sget-object v11, LR06;->b:LR06$a;

    invoke-virtual {v11}, LR06$a;->d()LR06;

    move-result-object v32

    const/16 v33, 0x0

    const/16 v34, 0x2fff

    const/16 v35, 0x0

    invoke-direct/range {v15 .. v35}, LGN5;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v10, v12, v13}, LDf$a;->c(LGN5;II)V

    goto/16 :goto_3

    :cond_a
    instance-of v10, v11, Landroid/text/style/ForegroundColorSpan;

    if-eqz v10, :cond_b

    new-instance v10, LGN5;

    move-object v15, v10

    check-cast v11, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {v11}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    move-result v11

    invoke-static {v11}, Lvm0;->b(I)J

    move-result-wide v16

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x3ffe

    const/16 v35, 0x0

    invoke-direct/range {v15 .. v35}, LGN5;-><init>(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v10, v12, v13}, LDf$a;->c(LGN5;II)V

    goto :goto_3

    :cond_b
    instance-of v10, v11, Landroid/text/style/ImageSpan;

    if-eqz v10, :cond_e

    check-cast v11, Landroid/text/style/ImageSpan;

    invoke-virtual {v11}, Landroid/text/style/ImageSpan;->getSource()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_d

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v10

    xor-int/2addr v10, v2

    if-eqz v10, :cond_c

    invoke-virtual {v11}, Landroid/text/style/ImageSpan;->getSource()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v3, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    :cond_c
    invoke-virtual {v11}, Landroid/text/style/ImageSpan;->getSource()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0, v10, v7, v14, v7}, LM22;->b(LDf$a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_d
    move v10, v13

    goto :goto_4

    :cond_e
    instance-of v10, v11, Landroid/text/style/URLSpan;

    if-eqz v10, :cond_f

    invoke-virtual {v0, v4, v12, v13}, LDf$a;->c(LGN5;II)V

    check-cast v11, Landroid/text/style/URLSpan;

    invoke-virtual {v11}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v10

    const-string v11, "span.url"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "URL"

    invoke-virtual {v0, v11, v10, v12, v13}, LDf$a;->a(Ljava/lang/String;Ljava/lang/String;II)V

    :cond_f
    :goto_3
    move v10, v12

    :cond_10
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_2

    :cond_11
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-eq v10, v2, :cond_12

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "this as java.lang.String).substring(startIndex)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, LDf$a;->i(Ljava/lang/String;)V

    :cond_12
    invoke-virtual {v0}, LDf$a;->l()LDf;

    move-result-object v2

    invoke-interface {v1, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_13
    check-cast v2, LDf;

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {}, LQt0;->Y()V

    :cond_14
    invoke-interface/range {p3 .. p3}, LEt0;->Q()V

    return-object v2
.end method

.method private static final rememberBitmapImages-0fZqiVQ(Ljava/util/Map;ILEt0;I)Ljava/util/Map;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/text/EmbeddableImage$Bitmap;",
            ">;I",
            "LEt0;",
            "I)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LL22;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    const v1, 0x72c0e48a

    invoke-interface {v0, v1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.text.rememberBitmapImages (Html.kt:110)"

    move/from16 v4, p3

    invoke-static {v1, v4, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/uicore/text/EmbeddableImage$Bitmap;

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v0, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/text/EmbeddableImage$Bitmap;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v2}, Lcom/stripe/android/uicore/text/EmbeddableImage$Bitmap;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    int-to-float v7, v7

    invoke-static {v6, v7}, LCB5;->a(FF)J

    move-result-wide v6

    const/4 v8, 0x1

    int-to-float v9, v8

    invoke-interface {v5}, Lg01;->b()F

    move-result v5

    div-float/2addr v9, v5

    invoke-static {v6, v7, v9}, LxB5;->l(JF)J

    move-result-wide v5

    new-instance v7, LL22;

    new-instance v15, LTU3;

    invoke-static {v5, v6}, LxB5;->i(J)F

    move-result v9

    invoke-static {v9}, LN26;->e(F)J

    move-result-wide v10

    invoke-static {v5, v6}, LxB5;->g(J)F

    move-result v5

    invoke-static {v5}, LN26;->e(F)J

    move-result-wide v12

    const/4 v5, 0x0

    move-object v9, v15

    move/from16 v14, p1

    move-object v6, v15

    move-object v15, v5

    invoke-direct/range {v9 .. v15}, LTU3;-><init>(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/stripe/android/uicore/text/HtmlKt$rememberBitmapImages$1$1;

    invoke-direct {v5, v2}, Lcom/stripe/android/uicore/text/HtmlKt$rememberBitmapImages$1$1;-><init>(Lcom/stripe/android/uicore/text/EmbeddableImage$Bitmap;)V

    const v2, -0x216dc58b

    invoke-static {v0, v2, v8, v5}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v2

    invoke-direct {v7, v6, v2}, LL22;-><init>(LTU3;Lkotlin/jvm/functions/Function3;)V

    invoke-static {v4, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    return-object v3
.end method

.method private static final rememberDrawableImages-0fZqiVQ(Ljava/util/Map;ILEt0;I)Ljava/util/Map;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;",
            ">;I",
            "LEt0;",
            "I)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LL22;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    const v1, 0x17344afb

    invoke-interface {v0, v1}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.uicore.text.rememberDrawableImages (Html.kt:77)"

    move/from16 v4, p3

    invoke-static {v1, v4, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;->getId()I

    move-result v5

    const/4 v6, 0x0

    invoke-static {v5, v0, v6}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v5

    invoke-virtual {v5}, LnE3;->getIntrinsicSize-NH-jbRc()J

    move-result-wide v6

    invoke-static {v6, v7}, LxB5;->g(J)F

    move-result v6

    invoke-virtual {v5}, LnE3;->getIntrinsicSize-NH-jbRc()J

    move-result-wide v7

    invoke-static {v7, v8}, LxB5;->i(J)F

    move-result v7

    sget-object v8, LTM2;->a:LTM2;

    sget v9, LTM2;->b:I

    invoke-virtual {v8, v0, v9}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v10

    invoke-virtual {v10}, LGc6;->c()LG26;

    move-result-object v10

    invoke-virtual {v10}, LG26;->n()J

    move-result-wide v10

    div-float/2addr v7, v6

    invoke-static {v10, v11}, LN26;->b(J)V

    invoke-static {v10, v11}, LM26;->f(J)J

    move-result-wide v12

    invoke-static {v10, v11}, LM26;->h(J)F

    move-result v6

    mul-float/2addr v6, v7

    invoke-static {v12, v13, v6}, LN26;->i(JF)J

    move-result-wide v15

    new-instance v6, LL22;

    new-instance v7, LTU3;

    invoke-virtual {v8, v0, v9}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v8

    invoke-virtual {v8}, LGc6;->c()LG26;

    move-result-object v8

    invoke-virtual {v8}, LG26;->n()J

    move-result-wide v17

    const/16 v20, 0x0

    move-object v14, v7

    move/from16 v19, p1

    invoke-direct/range {v14 .. v20}, LTU3;-><init>(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/stripe/android/uicore/text/HtmlKt$rememberDrawableImages$1$1;

    invoke-direct {v8, v2, v5}, Lcom/stripe/android/uicore/text/HtmlKt$rememberDrawableImages$1$1;-><init>(Lcom/stripe/android/uicore/text/EmbeddableImage$Drawable;LnE3;)V

    const v2, -0x2bf82dda

    const/4 v5, 0x1

    invoke-static {v0, v2, v5, v8}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v2

    invoke-direct {v6, v7, v2}, LL22;-><init>(LTU3;Lkotlin/jvm/functions/Function3;)V

    invoke-static {v4, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_1
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    return-object v3
.end method

.method private static final rememberRemoteImages-XiPi2c8(LDf;Ljava/util/Map;Lcom/stripe/android/uicore/image/StripeImageLoader;ILkotlin/jvm/functions/Function0;LEt0;I)LsP5;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDf;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/stripe/android/uicore/text/EmbeddableImage;",
            ">;",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            "I",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)",
            "LsP5<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LL22;",
            ">;>;"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p5

    move/from16 v2, p6

    const v3, -0x6f0fcf9e

    invoke-interface {v1, v3}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.uicore.text.rememberRemoteImages (Html.kt:139)"

    invoke-static {v3, v2, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LDf;->length()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {p0, v4, v3}, LDf;->h(II)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v13, 0x1

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, LDf$b;

    invoke-virtual {v7}, LDf$b;->e()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Lcom/stripe/android/uicore/image/UiUtilsKt;->isSupportedImageUrl(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    move v13, v4

    :goto_1
    if-eqz v13, :cond_1

    invoke-interface {v6, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface/range {p5 .. p5}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_4

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    invoke-static {v3}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v3

    invoke-interface {v1, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, LGX2;

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v1, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Lg01;

    const v4, -0x3a92887

    invoke-interface {v1, v4}, LEt0;->F(I)V

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v13

    if-eqz v4, :cond_5

    new-instance v4, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;

    const/4 v12, 0x0

    move-object v5, v4

    move-object v7, v3

    move-object/from16 v8, p4

    move-object/from16 v9, p2

    move/from16 v11, p3

    invoke-direct/range {v5 .. v12}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;-><init>(Ljava/util/List;LGX2;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/uicore/image/StripeImageLoader;Lg01;ILkotlin/coroutines/Continuation;)V

    and-int/lit8 v2, v2, 0xe

    or-int/lit8 v2, v2, 0x40

    invoke-static {p0, v4, v1, v2}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    :cond_5
    invoke-interface/range {p5 .. p5}, LEt0;->Q()V

    const/4 v0, 0x0

    const/16 v2, 0x8

    invoke-static {v3, v0, v1, v2, v13}, LGM5;->b(LtP5;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v0

    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface/range {p5 .. p5}, LEt0;->Q()V

    return-object v0
.end method
