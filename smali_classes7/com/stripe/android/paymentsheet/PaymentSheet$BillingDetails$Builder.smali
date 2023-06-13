.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u0003\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u000b\u001a\u00020\u000cJ\u0010\u0010\u0005\u001a\u00020\u00002\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0008\u001a\u00020\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;",
        "",
        "()V",
        "address",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;",
        "email",
        "",
        "name",
        "phone",
        "addressBuilder",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;",
        "build",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheet.kt\ncom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1086:1\n1#2:1087\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private address:Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

.field private email:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private phone:Ljava/lang/String;


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
.method public final address(Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;
    .locals 1

    const-string v0, "addressBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;->build()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->address:Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    return-object p0
.end method

.method public final address(Lcom/stripe/android/paymentsheet/PaymentSheet$Address;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->address:Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    return-object p0
.end method

.method public final build()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;
    .locals 5

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->address:Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->email:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->name:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->phone:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final email(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->email:Ljava/lang/String;

    return-object p0
.end method

.method public final name(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method public final phone(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->phone:Ljava/lang/String;

    return-object p0
.end method
