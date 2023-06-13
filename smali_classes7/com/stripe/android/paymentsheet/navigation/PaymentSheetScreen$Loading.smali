.class public final Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;
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
    name = "Loading"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000b\u001a\u0004\u0008\u000f\u0010\r\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;",
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

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;

.field private static final showsBuyButton:Z

.field private static final showsContinueButton:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;->INSTANCE:Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public Content(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;LEt0;I)V
    .locals 4

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x67f833a2

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    and-int/lit8 v1, p4, 0x70

    const/16 v2, 0x10

    if-nez v1, :cond_1

    invoke-interface {p3, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v3, v1, 0x51

    if-ne v3, v2, :cond_3

    invoke-interface {p3}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p3}, LEt0;->k()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.navigation.PaymentSheetScreen.Loading.Content (PaymentSheetScreen.kt:23)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    shr-int/lit8 v0, v1, 0x3

    and-int/lit8 v0, v0, 0xe

    const/4 v1, 0x0

    invoke-static {p2, p3, v0, v1}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetLoadingKt;->PaymentSheetLoading(LgV2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading$Content$1;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading$Content$1;-><init>(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;LgV2;I)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method

.method public getShowsBuyButton()Z
    .locals 1

    sget-boolean v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;->showsBuyButton:Z

    return v0
.end method

.method public getShowsContinueButton()Z
    .locals 1

    sget-boolean v0, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;->showsContinueButton:Z

    return v0
.end method
