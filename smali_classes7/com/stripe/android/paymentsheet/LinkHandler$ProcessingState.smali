.class public abstract Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/LinkHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ProcessingState"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Ready;,
        Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Launched;,
        Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Started;,
        Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$PaymentDetailsCollected;,
        Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Error;,
        Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Cancelled;,
        Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Completed;,
        Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0008\u0003\u0004\u0005\u0006\u0007\u0008\t\nB\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0008\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;",
        "",
        "()V",
        "Cancelled",
        "Completed",
        "CompletedWithPaymentResult",
        "Error",
        "Launched",
        "PaymentDetailsCollected",
        "Ready",
        "Started",
        "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Cancelled;",
        "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Completed;",
        "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$CompletedWithPaymentResult;",
        "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Error;",
        "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Launched;",
        "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$PaymentDetailsCollected;",
        "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Ready;",
        "Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState$Started;",
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


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/LinkHandler$ProcessingState;-><init>()V

    return-void
.end method
