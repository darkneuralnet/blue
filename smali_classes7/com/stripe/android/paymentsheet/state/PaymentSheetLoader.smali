.class public interface abstract Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;,
        Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001:\u0001\tJ%\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0008\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader;",
        "",
        "load",
        "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;",
        "initializationMode",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
        "paymentSheetConfiguration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Result",
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


# virtual methods
.method public abstract load(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/state/PaymentSheetLoader$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
