.class public final Lcom/stripe/android/paymentsheet/state/DefaultLinkAccountStatusProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/state/DefaultLinkAccountStatusProvider;",
        "Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;",
        "linkLauncher",
        "Lcom/stripe/android/link/LinkPaymentLauncher;",
        "(Lcom/stripe/android/link/LinkPaymentLauncher;)V",
        "invoke",
        "Lcom/stripe/android/link/model/AccountStatus;",
        "configuration",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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


# instance fields
.field private final linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/LinkPaymentLauncher;)V
    .locals 1

    const-string v0, "linkLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/state/DefaultLinkAccountStatusProvider;->linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    return-void
.end method


# virtual methods
.method public invoke(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/link/model/AccountStatus;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/state/DefaultLinkAccountStatusProvider;->linkLauncher:Lcom/stripe/android/link/LinkPaymentLauncher;

    invoke-virtual {v0, p1}, Lcom/stripe/android/link/LinkPaymentLauncher;->getAccountStatusFlow(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;)LEu1;

    move-result-object p1

    invoke-static {p1, p2}, LVu1;->w(LEu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
