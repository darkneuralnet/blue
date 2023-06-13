.class public final Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SelectSavedPaymentMethods"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000b\u001a\u0004\u0008\u000f\u0010\r\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
        "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "viewModel",
        "LgV2;",
        "modifier",
        "",
        "Content",
        "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;I)V",
        "",
        "showsBuyButton",
        "Z",
        "getShowsBuyButton",
        "()Z",
        "showsContinueButton",
        "getShowsContinueButton",
        "<init>",
        "()V",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;

.field private static final showsBuyButton:Z

.field private static final showsContinueButton:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;->showsBuyButton:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public Content(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;I)V
    .locals 3

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x1b8c069d

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.SelectSavedPaymentMethods.Content (PaymentSheetScreen.kt:34)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v0, p4, 0x70

    or-int/lit8 v0, v0, 0x8

    const/4 v1, 0x0

    invoke-static {p1, p2, p3, v0, v1}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt;->PaymentOptions(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods$Content$1;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods$Content$1;-><init>(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;I)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public getShowsBuyButton()Z
    .locals 1

    sget-boolean v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;->showsBuyButton:Z

    return v0
.end method

.method public getShowsContinueButton()Z
    .locals 1

    sget-boolean v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;->showsContinueButton:Z

    return v0
.end method
