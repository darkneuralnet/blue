.class public final Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Static;
.super Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Static"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Static;",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "(Lcom/stripe/android/model/StripeIntent;)V",
        "get",
        "Lcom/stripe/android/model/ElementsSession;",
        "initializationMode",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
        "configuration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final stripeIntent:Lcom/stripe/android/model/StripeIntent;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/StripeIntent;)V
    .locals 1

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Static;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    return-void
.end method


# virtual methods
.method public get(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/ElementsSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lcom/stripe/android/model/ElementsSession;

    const/4 p2, 0x0

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository$Static;->stripeIntent:Lcom/stripe/android/model/StripeIntent;

    invoke-direct {p1, p2, p2, p3}, Lcom/stripe/android/model/ElementsSession;-><init>(Lcom/stripe/android/model/ElementsSession$LinkSettings;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V

    return-object p1
.end method
