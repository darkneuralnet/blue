.class public final Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEventFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEventFactory;",
        "",
        "()V",
        "create",
        "Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;",
        "errorData",
        "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;
    .locals 5

    const-string v0, "errorData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transactions/ErrorData;->getAcsTransId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transactions/ErrorData;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transactions/ErrorData;->getErrorDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transactions/ErrorData;->getErrorDetail()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/transactions/ErrorData;->getSdkTransId()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/stripe/android/stripe3ds2/transaction/ProtocolErrorEvent;-><init>(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/ErrorMessage;)V

    return-object v1
.end method
