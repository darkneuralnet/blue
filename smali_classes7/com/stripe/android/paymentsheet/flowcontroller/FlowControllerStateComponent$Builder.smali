.class public interface abstract Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0008\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0008H\'\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;",
        "",
        "appContext",
        "Landroid/content/Context;",
        "build",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;",
        "flowControllerViewModel",
        "viewModel",
        "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;",
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
.method public abstract appContext(Landroid/content/Context;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract build()Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent;
.end method

.method public abstract flowControllerViewModel(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerStateComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method
