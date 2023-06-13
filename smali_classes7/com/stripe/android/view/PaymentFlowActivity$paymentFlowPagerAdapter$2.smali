.class final Lcom/stripe/android/view/PaymentFlowActivity$paymentFlowPagerAdapter$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/PaymentFlowActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/stripe/android/view/PaymentFlowPagerAdapter;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/view/PaymentFlowPagerAdapter;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/PaymentFlowActivity;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/PaymentFlowActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivity$paymentFlowPagerAdapter$2;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/stripe/android/view/PaymentFlowPagerAdapter;
    .locals 6

    new-instance v0, Lcom/stripe/android/view/PaymentFlowPagerAdapter;

    iget-object v1, p0, Lcom/stripe/android/view/PaymentFlowActivity$paymentFlowPagerAdapter$2;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-static {v1}, Lcom/stripe/android/view/PaymentFlowActivity;->access$getPaymentSessionConfig(Lcom/stripe/android/view/PaymentFlowActivity;)Lcom/stripe/android/PaymentSessionConfig;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/view/PaymentFlowActivity$paymentFlowPagerAdapter$2;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-static {v3}, Lcom/stripe/android/view/PaymentFlowActivity;->access$getPaymentSessionConfig(Lcom/stripe/android/view/PaymentFlowActivity;)Lcom/stripe/android/PaymentSessionConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/PaymentSessionConfig;->getAllowedShippingCountryCodes()Ljava/util/Set;

    move-result-object v3

    new-instance v4, Lcom/stripe/android/view/PaymentFlowActivity$paymentFlowPagerAdapter$2$1;

    iget-object v5, p0, Lcom/stripe/android/view/PaymentFlowActivity$paymentFlowPagerAdapter$2;->this$0:Lcom/stripe/android/view/PaymentFlowActivity;

    invoke-direct {v4, v5}, Lcom/stripe/android/view/PaymentFlowActivity$paymentFlowPagerAdapter$2$1;-><init>(Lcom/stripe/android/view/PaymentFlowActivity;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/view/PaymentFlowPagerAdapter;-><init>(Landroid/content/Context;Lcom/stripe/android/PaymentSessionConfig;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentFlowActivity$paymentFlowPagerAdapter$2;->invoke()Lcom/stripe/android/view/PaymentFlowPagerAdapter;

    move-result-object v0

    return-object v0
.end method
