.class public final Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a?\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
        "screen",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paymentMethods",
        "",
        "isLiveMode",
        "isProcessing",
        "isEditing",
        "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
        "rememberPaymentSheetTopBarState",
        "(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Ljava/util/List;ZZZLEt0;I)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
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
        "SMAP\nPaymentSheetTopBarState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetTopBarState.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,59:1\n1057#2,6:60\n*S KotlinDebug\n*F\n+ 1 PaymentSheetTopBarState.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateKt\n*L\n28#1:60,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final rememberPaymentSheetTopBarState(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Ljava/util/List;ZZZLEt0;I)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;ZZZ",
            "LEt0;",
            "I)",
            "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;"
        }
    .end annotation

    const-string v0, "screen"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x36e75c3c    # -625212.25f

    invoke-interface {p5, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.ui.rememberPaymentSheetTopBarState (PaymentSheetTopBarState.kt:20)"

    invoke-static {v0, p6, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p5, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p6

    invoke-interface {p5, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p6, v0

    invoke-interface {p5, p2}, LEt0;->o(Z)Z

    move-result v0

    or-int/2addr p6, v0

    invoke-interface {p5, p3}, LEt0;->o(Z)Z

    move-result v0

    or-int/2addr p6, v0

    invoke-interface {p5, p4}, LEt0;->o(Z)Z

    move-result v0

    or-int/2addr p6, v0

    invoke-interface {p5}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p6, :cond_1

    sget-object p6, LEt0;->a:LEt0$a;

    invoke-virtual {p6}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p6

    if-ne v0, p6, :cond_8

    :cond_1
    sget-object p6, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddAnotherPaymentMethod;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddAnotherPaymentMethod;

    invoke-static {p0, p6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_paymentsheet_back:I

    goto :goto_0

    :cond_2
    sget v0, Lcom/stripe/android/paymentsheet/R$drawable;->stripe_ic_paymentsheet_close:I

    :goto_0
    move v2, v0

    invoke-static {p0, p6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_3

    sget p6, Lcom/stripe/android/paymentsheet/R$string;->back:I

    goto :goto_1

    :cond_3
    sget p6, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_close:I

    :goto_1
    move v3, p6

    instance-of p0, p0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;

    if-eqz p4, :cond_4

    sget p4, Lcom/stripe/android/paymentsheet/R$string;->done:I

    goto :goto_2

    :cond_4
    sget p4, Lcom/stripe/android/paymentsheet/R$string;->edit:I

    :goto_2
    move v6, p4

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    const/4 p4, 0x1

    xor-int/lit8 v4, p2, 0x1

    const/4 p2, 0x0

    if-eqz p0, :cond_7

    check-cast p1, Ljava/util/Collection;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_5

    goto :goto_3

    :cond_5
    move p0, p2

    goto :goto_4

    :cond_6
    :goto_3
    move p0, p4

    :goto_4
    if-nez p0, :cond_7

    move v5, p4

    goto :goto_5

    :cond_7
    move v5, p2

    :goto_5
    xor-int/lit8 v7, p3, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;-><init>(IIZZIZ)V

    invoke-interface {p5, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_8
    check-cast v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    invoke-interface {p5}, LEt0;->Q()V

    return-object v0
.end method
