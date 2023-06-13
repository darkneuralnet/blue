.class public abstract Lcom/stripe/android/paymentsheet/model/PaymentSelection;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;,
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;,
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;,
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;,
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u0001:\u0005\u000b\u000c\r\u000e\u000fB\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\nH&R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0004\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "Landroid/os/Parcelable;",
        "()V",
        "requiresConfirmation",
        "",
        "getRequiresConfirmation",
        "()Z",
        "mandateText",
        "",
        "context",
        "Landroid/content/Context;",
        "CustomerRequestedSave",
        "GooglePay",
        "Link",
        "New",
        "Saved",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getRequiresConfirmation()Z
.end method

.method public abstract mandateText(Landroid/content/Context;)Ljava/lang/String;
.end method
