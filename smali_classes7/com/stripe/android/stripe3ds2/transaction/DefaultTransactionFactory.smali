.class public final Lcom/stripe/android/stripe3ds2/transaction/DefaultTransactionFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008JH\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/DefaultTransactionFactory;",
        "Lcom/stripe/android/stripe3ds2/transaction/TransactionFactory;",
        "areqParamsFactory",
        "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;",
        "ephemeralKeyPairGenerator",
        "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;",
        "sdkReferenceNumber",
        "",
        "(Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Ljava/lang/String;)V",
        "create",
        "Lcom/stripe/android/stripe3ds2/transaction/Transaction;",
        "directoryServerId",
        "rootCerts",
        "",
        "Ljava/security/cert/X509Certificate;",
        "directoryServerPublicKey",
        "Ljava/security/PublicKey;",
        "keyId",
        "sdkTransactionId",
        "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
        "isLiveMode",
        "",
        "brand",
        "Lcom/stripe/android/stripe3ds2/views/Brand;",
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


# instance fields
.field private final areqParamsFactory:Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;

.field private final ephemeralKeyPairGenerator:Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;

.field private final sdkReferenceNumber:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Ljava/lang/String;)V
    .locals 1

    const-string v0, "areqParamsFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ephemeralKeyPairGenerator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkReferenceNumber"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultTransactionFactory;->areqParamsFactory:Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultTransactionFactory;->ephemeralKeyPairGenerator:Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultTransactionFactory;->sdkReferenceNumber:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/String;Ljava/util/List;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;ZLcom/stripe/android/stripe3ds2/views/Brand;)Lcom/stripe/android/stripe3ds2/transaction/Transaction;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/X509Certificate;",
            ">;",
            "Ljava/security/PublicKey;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
            "Z",
            "Lcom/stripe/android/stripe3ds2/views/Brand;",
            ")",
            "Lcom/stripe/android/stripe3ds2/transaction/Transaction;"
        }
    .end annotation

    const-string p6, "directoryServerId"

    invoke-static {p1, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "rootCerts"

    invoke-static {p2, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "directoryServerPublicKey"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "sdkTransactionId"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "brand"

    invoke-static {p7, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultTransactionFactory;->ephemeralKeyPairGenerator:Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;

    invoke-interface {p2}, Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;->generate()Ljava/security/KeyPair;

    move-result-object v6

    new-instance p2, Lcom/stripe/android/stripe3ds2/transaction/StripeTransaction;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultTransactionFactory;->areqParamsFactory:Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;

    iget-object v7, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultTransactionFactory;->sdkReferenceNumber:Ljava/lang/String;

    move-object v0, p2

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/stripe3ds2/transaction/StripeTransaction;-><init>(Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/security/KeyPair;Ljava/lang/String;)V

    return-object p2
.end method
