.class public final Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideViewModelScopeFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LZC0;",
        ">;"
    }
.end annotation


# instance fields
.field private final viewModelProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideViewModelScopeFactory;->viewModelProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideViewModelScopeFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideViewModelScopeFactory;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideViewModelScopeFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideViewModelScopeFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static provideViewModelScope(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)LZC0;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule;->INSTANCE:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule;

    invoke-virtual {v0, p0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule;->provideViewModelScope(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)LZC0;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LZC0;

    return-object p0
.end method


# virtual methods
.method public get()LZC0;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideViewModelScopeFactory;->viewModelProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideViewModelScopeFactory;->provideViewModelScope(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)LZC0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideViewModelScopeFactory;->get()LZC0;

    move-result-object v0

    return-object v0
.end method
