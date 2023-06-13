.class public final Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;
.super Lie;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\u0017\u0012\u0006\u0010\'\u001a\u00020&\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR(\u0010%\u001a\u0004\u0018\u00010\u001f2\u0008\u0010 \u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$\u00a8\u0006+"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
        "Lie;",
        "Landroidx/lifecycle/p;",
        "handle",
        "Landroidx/lifecycle/p;",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;",
        "flowControllerStateComponent",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;",
        "getFlowControllerStateComponent",
        "()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
        "initializationMode",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
        "getInitializationMode",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
        "setInitializationMode",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;)V",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "paymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "getPaymentSelection",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "setPaymentSelection",
        "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V",
        "Lcom/stripe/android/model/ElementsSessionParams;",
        "previousElementsSessionParams",
        "Lcom/stripe/android/model/ElementsSessionParams;",
        "getPreviousElementsSessionParams",
        "()Lcom/stripe/android/model/ElementsSessionParams;",
        "setPreviousElementsSessionParams",
        "(Lcom/stripe/android/model/ElementsSessionParams;)V",
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;",
        "value",
        "getState",
        "()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;",
        "setState",
        "(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;)V",
        "state",
        "Landroid/app/Application;",
        "application",
        "<init>",
        "(Landroid/app/Application;Landroidx/lifecycle/p;)V",
        "Companion",
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
.field private static final Companion:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Companion;

.field private static final STATE_KEY:Ljava/lang/String; = "state"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final flowControllerStateComponent:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;

.field private final handle:Landroidx/lifecycle/p;

.field private initializationMode:Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;

.field private paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

.field private previousElementsSessionParams:Lcom/stripe/android/model/ElementsSessionParams;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->Companion:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Landroidx/lifecycle/p;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lie;-><init>(Landroid/app/Application;)V

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->handle:Landroidx/lifecycle/p;

    invoke-static {}, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent;->builder()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;->appContext(Landroid/content/Context;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;->flowControllerViewModel(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;->build()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->flowControllerStateComponent:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;

    return-void
.end method


# virtual methods
.method public final getFlowControllerStateComponent()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->flowControllerStateComponent:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;

    return-object v0
.end method

.method public final getInitializationMode()Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->initializationMode:Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;

    return-object v0
.end method

.method public final getPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v0
.end method

.method public final getPreviousElementsSessionParams()Lcom/stripe/android/model/ElementsSessionParams;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->previousElementsSessionParams:Lcom/stripe/android/model/ElementsSessionParams;

    return-object v0
.end method

.method public final getState()Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->handle:Landroidx/lifecycle/p;

    const-string v1, "state"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/p;->f(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;

    return-object v0
.end method

.method public final setInitializationMode(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->initializationMode:Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;

    return-void
.end method

.method public final setPaymentSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->paymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-void
.end method

.method public final setPreviousElementsSessionParams(Lcom/stripe/android/model/ElementsSessionParams;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->previousElementsSessionParams:Lcom/stripe/android/model/ElementsSessionParams;

    return-void
.end method

.method public final setState(Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;)V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;->handle:Landroidx/lifecycle/p;

    const-string v1, "state"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/p;->m(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
