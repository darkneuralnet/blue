.class public abstract Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Companion;,
        Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Success;,
        Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Cancelled;,
        Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u0000 \u00042\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0007\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;",
        "Landroid/os/Parcelable;",
        "()V",
        "Cancelled",
        "Companion",
        "Failure",
        "Success",
        "Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Cancelled;",
        "Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Failure;",
        "Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Success;",
        "link_release"
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
.field public static final Companion:Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Companion;

.field public static final KEY:Ljava/lang/String; = "PaymentDetailsResult"


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;->Companion:Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;-><init>()V

    return-void
.end method
