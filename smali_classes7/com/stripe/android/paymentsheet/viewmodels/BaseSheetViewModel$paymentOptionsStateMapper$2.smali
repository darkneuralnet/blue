.class final Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;-><init>(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/repositories/CustomerRepository;Lcom/stripe/android/paymentsheet/PrefsRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Landroidx/lifecycle/p;Lcom/stripe/android/paymentsheet/LinkHandler;Lcom/stripe/android/paymentsheet/ui/HeaderTextFactory;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;",
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
.field final synthetic $application:Landroid/app/Application;

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Landroid/app/Application;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2;->this$0:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2;->$application:Landroid/app/Application;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2;->this$0:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getPaymentMethods$paymentsheet_release()LtP5;

    move-result-object v2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2;->this$0:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getSelection$paymentsheet_release()LtP5;

    move-result-object v6

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2;->this$0:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getGooglePayState$paymentsheet_release()LtP5;

    move-result-object v3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2;->this$0:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->getLinkHandler()Lcom/stripe/android/paymentsheet/LinkHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/LinkHandler;->isLinkEnabled()LtP5;

    move-result-object v4

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2;->this$0:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->access$getSavedSelection$p(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;)LtP5;

    move-result-object v5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2;->this$0:Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    instance-of v8, v0, Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;

    new-instance v9, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;

    new-instance v7, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2$1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2;->$application:Landroid/app/Application;

    invoke-direct {v7, v0, v1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2$1;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;Landroid/app/Application;)V

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;-><init>(LtP5;LtP5;LtP5;LtP5;LtP5;Lkotlin/jvm/functions/Function1;Z)V

    return-object v9
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$paymentOptionsStateMapper$2;->invoke()Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;

    move-result-object v0

    return-object v0
.end method
