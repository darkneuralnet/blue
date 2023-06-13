.class public abstract Lcom/stripe/android/payments/paymentlauncher/PaymentResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Companion;,
        Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;,
        Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;,
        Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00062\u00020\u0001:\u0004\u0005\u0006\u0007\u0008B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0001\u0003\t\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "Landroid/os/Parcelable;",
        "()V",
        "toBundle",
        "Landroid/os/Bundle;",
        "Canceled",
        "Companion",
        "Completed",
        "Failed",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Canceled;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;",
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
.field public static final $stable:I = 0x0

.field public static final Companion:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Companion;

.field private static final EXTRA:Ljava/lang/String; = "extra_args"


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;->Companion:Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic toBundle()Landroid/os/Bundle;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "extra_args"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ld70;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
