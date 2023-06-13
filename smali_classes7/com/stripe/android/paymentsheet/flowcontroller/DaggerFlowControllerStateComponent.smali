.class public final Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FlowControllerStateComponentImpl;,
        Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentImpl;,
        Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$PaymentOptionsViewModelSubcomponentImpl;,
        Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FlowControllerComponentImpl;,
        Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FormViewModelSubcomponentBuilder;,
        Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$PaymentOptionsViewModelSubcomponentBuilder;,
        Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$FlowControllerComponentBuilder;,
        Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/flowcontroller/DaggerFlowControllerStateComponent$Builder;-><init>(LNJ0;)V

    return-object v0
.end method
