.class public final Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
        "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "viewModel",
        "",
        "Content",
        "(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LEt0;I)V",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final Content(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LEt0;I)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x55a24989

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.navigation.Content (PaymentSheetScreen.kt:63)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LgV2;->b0:LgV2$a;

    shl-int/lit8 v1, p3, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int/lit8 v1, v1, 0x38

    invoke-interface {p0, p1, v0, p2, v1}, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;->Content(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreenKt$Content$1;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreenKt$Content$1;-><init>(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method
