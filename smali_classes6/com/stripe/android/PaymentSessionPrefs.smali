.class public interface abstract Lcom/stripe/android/PaymentSessionPrefs;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;,
        Lcom/stripe/android/PaymentSessionPrefs$Companion;,
        Lcom/stripe/android/PaymentSessionPrefs$Default;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008`\u0018\u0000 \t2\u00020\u0001:\u0003\t\n\u000bJ\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003H&\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/PaymentSessionPrefs;",
        "",
        "getPaymentMethod",
        "Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;",
        "customerId",
        "",
        "savePaymentMethod",
        "",
        "paymentMethod",
        "Companion",
        "Default",
        "SelectedPaymentMethod",
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
.field public static final Companion:Lcom/stripe/android/PaymentSessionPrefs$Companion;

.field public static final GOOGLE_PAY:Ljava/lang/String; = "GooglePay"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/PaymentSessionPrefs$Companion;->$$INSTANCE:Lcom/stripe/android/PaymentSessionPrefs$Companion;

    sput-object v0, Lcom/stripe/android/PaymentSessionPrefs;->Companion:Lcom/stripe/android/PaymentSessionPrefs$Companion;

    return-void
.end method


# virtual methods
.method public abstract getPaymentMethod(Ljava/lang/String;)Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;
.end method

.method public abstract savePaymentMethod(Ljava/lang/String;Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;)V
.end method
