.class public final Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/ObjectBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/ObjectBuilder<",
        "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\r\u001a\u00020\u0002H\u0016J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u00020\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tJ\u0015\u0010\u0011\u001a\u00020\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000c\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;",
        "Lcom/stripe/android/ObjectBuilder;",
        "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;",
        "()V",
        "isPaymentSessionActive",
        "",
        "paymentSessionConfig",
        "Lcom/stripe/android/PaymentSessionConfig;",
        "paymentSessionData",
        "Lcom/stripe/android/PaymentSessionData;",
        "windowFlags",
        "",
        "Ljava/lang/Integer;",
        "build",
        "setIsPaymentSessionActive",
        "setPaymentSessionConfig",
        "setPaymentSessionData",
        "setWindowFlags",
        "(Ljava/lang/Integer;)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private isPaymentSessionActive:Z

.field private paymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

.field private paymentSessionData:Lcom/stripe/android/PaymentSessionData;

.field private windowFlags:Ljava/lang/Integer;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;->paymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;->paymentSessionData:Lcom/stripe/android/PaymentSessionData;

    if-eqz v1, :cond_0

    iget-boolean v2, p0, Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;->isPaymentSessionActive:Z

    iget-object v3, p0, Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;->windowFlags:Ljava/lang/Integer;

    new-instance v4, Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;-><init>(Lcom/stripe/android/PaymentSessionConfig;Lcom/stripe/android/PaymentSessionData;ZLjava/lang/Integer;)V

    return-object v4

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "PaymentFlowActivity launched without PaymentSessionData"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "PaymentFlowActivity launched without PaymentSessionConfig"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;->build()Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;

    move-result-object v0

    return-object v0
.end method

.method public final setIsPaymentSessionActive(Z)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;->isPaymentSessionActive:Z

    return-object p0
.end method

.method public final setPaymentSessionConfig(Lcom/stripe/android/PaymentSessionConfig;)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;->paymentSessionConfig:Lcom/stripe/android/PaymentSessionConfig;

    return-object p0
.end method

.method public final setPaymentSessionData(Lcom/stripe/android/PaymentSessionData;)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;->paymentSessionData:Lcom/stripe/android/PaymentSessionData;

    return-object p0
.end method

.method public final setWindowFlags(Ljava/lang/Integer;)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;->windowFlags:Ljava/lang/Integer;

    return-object p0
.end method
