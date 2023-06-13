.class public final Lcom/stripe/android/paymentsheet/ui/PrimaryButtonContainerFragmentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "convert",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final convert(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;

    if-eqz v0, :cond_0

    sget-object p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$StartProcessing;

    if-eqz v0, :cond_1

    sget-object p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;->getOnComplete()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;-><init>(Lkotlin/jvm/functions/Function0;)V

    move-object p0, v0

    :goto_0
    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
