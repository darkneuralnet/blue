.class final Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreen$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt;->PaymentOptionsScreen(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;LgV2;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LgV2;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $viewModel:Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreen$2;->$viewModel:Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LgV2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreen$2;->invoke(LgV2;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LgV2;LEt0;I)V
    .locals 3

    const-string v0, "scrollModifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0xe

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x5b

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LEt0;->k()V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.ui.PaymentOptionsScreen.<anonymous> (PaymentOptionsScreen.kt:31)"

    const v2, 0x1cfda5a5

    invoke-static {v2, p3, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt$PaymentOptionsScreen$2;->$viewModel:Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;

    shl-int/lit8 p3, p3, 0x3

    and-int/lit8 p3, p3, 0x70

    or-int/lit8 p3, p3, 0x8

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, p3, v1}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt;->PaymentOptionsScreenContent(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;LgV2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_2
    return-void
.end method
