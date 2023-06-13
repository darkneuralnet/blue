.class public final Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "isRootScreen",
        "Lkotlin/Function0;",
        "",
        "onButtonClick",
        "AddressOptionsAppBar",
        "(ZLkotlin/jvm/functions/Function0;LEt0;I)V",
        "paymentsheet_release"
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
        "SMAP\nAddressOptionsAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressOptionsAppBar.kt\ncom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,49:1\n154#2:50\n*S KotlinDebug\n*F\n+ 1 AddressOptionsAppBar.kt\ncom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt\n*L\n23#1:50\n*E\n"
    }
.end annotation


# direct methods
.method public static final AddressOptionsAppBar(ZLkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "onButtonClick"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, -0x6a98236

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v4, v2, 0xe

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LEt0;->o(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x70

    if-nez v5, :cond_3

    invoke-interface {v15, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v4, 0x5b

    const/16 v6, 0x12

    if-ne v5, v6, :cond_5

    invoke-interface {v15}, LEt0;->b()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v15}, LEt0;->k()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, -0x1

    const-string v6, "com.stripe.android.paymentsheet.ui.AddressOptionsAppBar (AddressOptionsAppBar.kt:16)"

    invoke-static {v3, v4, v5, v6}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_6
    sget-object v3, LgV2;->b0:LgV2$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v3, v5, v7, v6}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v3

    const/4 v5, 0x0

    int-to-float v5, v5

    invoke-static {v5}, Lk61;->g(F)F

    move-result v9

    sget-object v5, LTM2;->a:LTM2;

    sget v6, LTM2;->b:I

    invoke-virtual {v5, v15, v6}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v5

    invoke-virtual {v5}, LMm0;->n()J

    move-result-wide v5

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    new-instance v8, Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt$AddressOptionsAppBar$1;

    invoke-direct {v8, v1, v4, v0}, Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt$AddressOptionsAppBar$1;-><init>(Lkotlin/jvm/functions/Function0;IZ)V

    const v4, 0x278ee8b9

    invoke-static {v15, v4, v7, v8}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v13

    const v14, 0x30c06

    const/16 v16, 0x14

    move-object v4, v3

    move-wide v7, v10

    move-object v10, v12

    move-object v11, v13

    move-object v12, v15

    move v13, v14

    move/from16 v14, v16

    invoke-static/range {v4 .. v14}, LIh;->b(LgV2;JJFLPD3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_4
    invoke-interface {v15}, LEt0;->w()LWm5;

    move-result-object v3

    if-nez v3, :cond_8

    goto :goto_5

    :cond_8
    new-instance v4, Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt$AddressOptionsAppBar$2;

    invoke-direct {v4, v0, v1, v2}, Lcom/stripe/android/paymentsheet/ui/AddressOptionsAppBarKt$AddressOptionsAppBar$2;-><init>(ZLkotlin/jvm/functions/Function0;I)V

    invoke-interface {v3, v4}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_5
    return-void
.end method
