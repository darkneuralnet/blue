.class public interface abstract Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Component;
    modules = {
        Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;,
        Lcom/stripe/android/paymentsheet/injection/PaymentSheetCommonModule;,
        Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule;,
        Lcom/stripe/android/googlepaylauncher/injection/GooglePayLauncherModule;,
        Lcom/stripe/android/core/injection/CoroutineContextModule;,
        Lcom/stripe/android/core/injection/CoreCommonModule;,
        Lcom/stripe/android/ui/core/forms/resources/injection/ResourceRepositoryModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u00002\u00020\u0001:\u0001\u000cJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;",
        "",
        "flowControllerComponentBuilder",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;",
        "getFlowControllerComponentBuilder",
        "()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;",
        "inject",
        "",
        "paymentOptionsViewModel",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;",
        "factory",
        "Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;",
        "Builder",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getFlowControllerComponentBuilder()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerComponent$Builder;
.end method

.method public abstract inject(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;)V
.end method

.method public abstract inject(Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;)V
.end method
