.class public final Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;
.super Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CompletedWithPaymentResult"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;",
        "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;",
        "result",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V",
        "getResult",
        "()Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final result:Lcom/stripe/android/payments/paymentlauncher/PaymentResult;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;->$stable:I

    sput v0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;->result:Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    return-void
.end method


# virtual methods
.method public final getResult()Lcom/stripe/android/payments/paymentlauncher/PaymentResult;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;->result:Lcom/stripe/android/payments/paymentlauncher/PaymentResult;

    return-object v0
.end method
