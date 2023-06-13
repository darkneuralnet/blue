.class public abstract Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/PaymentSessionPrefs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "SelectedPaymentMethod"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$Companion;,
        Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$Saved;,
        Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$GooglePay;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\u0008\tB\u000f\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;",
        "",
        "stringValue",
        "",
        "(Ljava/lang/String;)V",
        "getStringValue",
        "()Ljava/lang/String;",
        "Companion",
        "GooglePay",
        "Saved",
        "Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$GooglePay;",
        "Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$Saved;",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$Companion;


# instance fields
.field private final stringValue:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;->Companion:Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;->stringValue:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getStringValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;->stringValue:Ljava/lang/String;

    return-object v0
.end method
