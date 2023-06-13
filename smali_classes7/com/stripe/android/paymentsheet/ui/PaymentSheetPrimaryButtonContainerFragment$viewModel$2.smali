.class final Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$viewModel$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroidx/lifecycle/u$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Landroidx/lifecycle/u$b;",
        "invoke",
        "()Landroidx/lifecycle/u$b;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$viewModel$2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$viewModel$2;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$viewModel$2;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$viewModel$2;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$viewModel$2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/lifecycle/u$b;
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory;

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$viewModel$2$1;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$viewModel$2$1;

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Factory;-><init>(Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$viewModel$2;->invoke()Landroidx/lifecycle/u$b;

    move-result-object v0

    return-object v0
.end method
