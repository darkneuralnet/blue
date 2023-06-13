.class public final Lcom/stripe/android/PaymentSessionPrefs$Default;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/PaymentSessionPrefs;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/PaymentSessionPrefs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Default"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000cH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/PaymentSessionPrefs$Default;",
        "Lcom/stripe/android/PaymentSessionPrefs;",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "prefs",
        "Landroid/content/SharedPreferences;",
        "getPrefs",
        "()Landroid/content/SharedPreferences;",
        "prefs$delegate",
        "Lkotlin/Lazy;",
        "getPaymentMethod",
        "Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;",
        "customerId",
        "",
        "savePaymentMethod",
        "",
        "paymentMethod",
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
.field private final prefs$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/stripe/android/PaymentSessionPrefs$Default$prefs$2;

    invoke-direct {v0, p1}, Lcom/stripe/android/PaymentSessionPrefs$Default$prefs$2;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/PaymentSessionPrefs$Default;->prefs$delegate:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public getPaymentMethod(Ljava/lang/String;)Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;
    .locals 4

    sget-object v0, Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;->Companion:Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$Companion;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/PaymentSessionPrefs$Default;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/PaymentSessionPrefs;->Companion:Lcom/stripe/android/PaymentSessionPrefs$Companion;

    invoke-static {v3, p1}, Lcom/stripe/android/PaymentSessionPrefs$Companion;->access$getPaymentMethodKey(Lcom/stripe/android/PaymentSessionPrefs$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0, v1}, Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod$Companion;->fromString(Ljava/lang/String;)Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;

    move-result-object p1

    return-object p1
.end method

.method public final getPrefs()Landroid/content/SharedPreferences;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/PaymentSessionPrefs$Default;->prefs$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-prefs>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public savePaymentMethod(Ljava/lang/String;Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;)V
    .locals 2

    const-string v0, "customerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/PaymentSessionPrefs$Default;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/PaymentSessionPrefs;->Companion:Lcom/stripe/android/PaymentSessionPrefs$Companion;

    invoke-static {v1, p1}, Lcom/stripe/android/PaymentSessionPrefs$Companion;->access$getPaymentMethodKey(Lcom/stripe/android/PaymentSessionPrefs$Companion;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/stripe/android/PaymentSessionPrefs$SelectedPaymentMethod;->getStringValue()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
