.class public final Lcom/stripe/android/uicore/image/StripeImageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\u008b\u0001\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0019\u0008\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0002\u0008\u00102\u0019\u0008\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0002\u0008\u0010H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u0018\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015*\u00020\u000eH\u0002\u00a8\u0006\u0018"
    }
    d2 = {
        "",
        "url",
        "Lcom/stripe/android/uicore/image/StripeImageLoader;",
        "imageLoader",
        "contentDescription",
        "LgV2;",
        "modifier",
        "LBA0;",
        "contentScale",
        "Lsm0;",
        "colorFilter",
        "LnE3;",
        "debugPainter",
        "Lkotlin/Function1;",
        "Lh10;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "errorContent",
        "loadingContent",
        "StripeImage",
        "(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;II)V",
        "Lkotlin/Pair;",
        "",
        "calculateBoxSize",
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
.method public static final StripeImage(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            "Ljava/lang/String;",
            "LgV2;",
            "LBA0;",
            "Lsm0;",
            "LnE3;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lh10;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Lh10;",
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

    move/from16 v11, p10

    move/from16 v12, p11

    const-string v0, "url"

    move-object/from16 v13, p0

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageLoader"

    move-object/from16 v14, p1

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x2229bc6a

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v1, v12, 0x8

    if-eqz v1, :cond_0

    sget-object v1, LgV2;->b0:LgV2$a;

    move-object/from16 v16, v1

    goto :goto_0

    :cond_0
    move-object/from16 v16, p3

    :goto_0
    and-int/lit8 v1, v12, 0x10

    if-eqz v1, :cond_1

    sget-object v1, LBA0;->a:LBA0$a;

    invoke-virtual {v1}, LBA0$a;->b()LBA0;

    move-result-object v1

    move-object/from16 v17, v1

    goto :goto_1

    :cond_1
    move-object/from16 v17, p4

    :goto_1
    and-int/lit8 v1, v12, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object/from16 v18, v2

    goto :goto_2

    :cond_2
    move-object/from16 v18, p5

    :goto_2
    and-int/lit8 v1, v12, 0x40

    if-eqz v1, :cond_3

    move-object/from16 v19, v2

    goto :goto_3

    :cond_3
    move-object/from16 v19, p6

    :goto_3
    and-int/lit16 v1, v12, 0x80

    if-eqz v1, :cond_4

    sget-object v1, Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;->INSTANCE:Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;->getLambda-1$stripe_ui_core_release()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    move-object/from16 v20, v1

    goto :goto_4

    :cond_4
    move-object/from16 v20, p7

    :goto_4
    and-int/lit16 v1, v12, 0x100

    if-eqz v1, :cond_5

    sget-object v1, Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;->INSTANCE:Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/image/ComposableSingletons$StripeImageKt;->getLambda-2$stripe_ui_core_release()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    move-object/from16 v21, v1

    goto :goto_5

    :cond_5
    move-object/from16 v21, p8

    :goto_5
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.uicore.image.StripeImage (StripeImage.kt:42)"

    invoke-static {v0, v11, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    const/16 v22, 0x0

    const/16 v23, 0x0

    new-instance v10, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p10

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    move-object/from16 v5, p2

    move-object/from16 v6, v16

    move-object/from16 v7, v17

    move-object/from16 v8, v18

    move-object/from16 v9, v19

    move-object v12, v10

    move-object/from16 v10, p1

    invoke-direct/range {v0 .. v10}, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$1;-><init>(Ljava/lang/String;ILkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lcom/stripe/android/uicore/image/StripeImageLoader;)V

    const v0, 0x1368f3d4

    const/4 v1, 0x1

    invoke-static {v15, v0, v1, v12}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    shr-int/lit8 v1, v11, 0x9

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0xc00

    const/4 v2, 0x6

    move-object/from16 p3, v16

    move-object/from16 p4, v22

    move/from16 p5, v23

    move-object/from16 p6, v0

    move-object/from16 p7, v15

    move/from16 p8, v1

    move/from16 p9, v2

    invoke-static/range {p3 .. p9}, Lg10;->a(LgV2;LK9;ZLkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    invoke-interface {v15}, LEt0;->w()LWm5;

    move-result-object v12

    if-nez v12, :cond_8

    goto :goto_6

    :cond_8
    new-instance v15, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, v16

    move-object/from16 v5, v17

    move-object/from16 v6, v18

    move-object/from16 v7, v19

    move-object/from16 v8, v20

    move-object/from16 v9, v21

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lcom/stripe/android/uicore/image/StripeImageKt$StripeImage$2;-><init>(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;II)V

    invoke-interface {v12, v15}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_6
    return-void
.end method

.method public static final synthetic access$calculateBoxSize(Lh10;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/image/StripeImageKt;->calculateBoxSize(Lh10;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final calculateBoxSize(Lh10;)Lkotlin/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh10;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lh10;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkz0;->n(J)I

    move-result v0

    sget-object v1, LG52;->b:LG52$a;

    invoke-virtual {v1}, LG52$a;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LG52;->g(J)I

    move-result v2

    const/4 v3, -0x1

    if-le v0, v2, :cond_0

    invoke-interface {p0}, Lh10;->b()J

    move-result-wide v4

    invoke-static {v4, v5}, Lkz0;->n(J)I

    move-result v0

    sget-object v2, Lk61;->c:Lk61$a;

    invoke-virtual {v2}, Lk61$a;->b()F

    move-result v2

    float-to-int v2, v2

    if-ge v0, v2, :cond_0

    invoke-interface {p0}, Lh10;->b()J

    move-result-wide v4

    invoke-static {v4, v5}, Lkz0;->n(J)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-interface {p0}, Lh10;->b()J

    move-result-wide v4

    invoke-static {v4, v5}, Lkz0;->m(J)I

    move-result v2

    invoke-virtual {v1}, LG52$a;->a()J

    move-result-wide v4

    invoke-static {v4, v5}, LG52;->f(J)I

    move-result v1

    if-le v2, v1, :cond_1

    invoke-interface {p0}, Lh10;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Lkz0;->m(J)I

    move-result v1

    sget-object v2, Lk61;->c:Lk61$a;

    invoke-virtual {v2}, Lk61$a;->b()F

    move-result v2

    float-to-int v2, v2

    if-ge v1, v2, :cond_1

    invoke-interface {p0}, Lh10;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Lkz0;->m(J)I

    move-result p0

    goto :goto_1

    :cond_1
    move p0, v3

    :goto_1
    if-ne v0, v3, :cond_2

    move v0, p0

    :cond_2
    if-ne p0, v3, :cond_3

    move p0, v0

    :cond_3
    new-instance v1, Lkotlin/Pair;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method
