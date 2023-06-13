.class public final Lcom/stripe/android/stripe3ds2/security/DefaultJweEncrypter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/security/JweEncrypter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001f\u0008\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ*\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/security/DefaultJweEncrypter;",
        "Lcom/stripe/android/stripe3ds2/security/JweEncrypter;",
        "ephemeralKeyPairGenerator",
        "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;",
        "errorReporter",
        "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "(Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V",
        "jweRsaEncrypter",
        "Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;",
        "jweEcEncrypter",
        "Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;",
        "(Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V",
        "encrypt",
        "",
        "payload",
        "acsPublicKey",
        "Ljava/security/PublicKey;",
        "directoryServerId",
        "keyId",
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
.field private final errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

.field private final jweEcEncrypter:Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;

.field private final jweRsaEncrypter:Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;


# direct methods
.method public constructor <init>(Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V
    .locals 2

    const-string v0, "ephemeralKeyPairGenerator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;-><init>()V

    new-instance v1, Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;

    invoke-direct {v1, p1, p2}, Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;-><init>(Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V

    invoke-direct {p0, v0, v1, p2}, Lcom/stripe/android/stripe3ds2/security/DefaultJweEncrypter;-><init>(Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultJweEncrypter;->jweRsaEncrypter:Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/security/DefaultJweEncrypter;->jweEcEncrypter:Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/security/DefaultJweEncrypter;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    return-void
.end method


# virtual methods
.method public encrypt(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;,
            Ljava/text/ParseException;
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acsPublicKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "directoryServerId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Ljava/security/interfaces/RSAPublicKey;

    if-eqz v0, :cond_0

    sget-object p3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object p3, p0, Lcom/stripe/android/stripe3ds2/security/DefaultJweEncrypter;->jweRsaEncrypter:Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;

    check-cast p2, Ljava/security/interfaces/RSAPublicKey;

    invoke-virtual {p3, p1, p2, p4}, Lcom/stripe/android/stripe3ds2/security/JweRsaEncrypter;->encrypt(Ljava/lang/String;Ljava/security/interfaces/RSAPublicKey;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p4, p2, Ljava/security/interfaces/ECPublicKey;

    if-eqz p4, :cond_1

    sget-object p4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object p4, p0, Lcom/stripe/android/stripe3ds2/security/DefaultJweEncrypter;->jweEcEncrypter:Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;

    check-cast p2, Ljava/security/interfaces/ECPublicKey;

    invoke-virtual {p4, p1, p2, p3}, Lcom/stripe/android/stripe3ds2/security/JweEcEncrypter;->encrypt(Ljava/lang/String;Ljava/security/interfaces/ECPublicKey;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unsupported public key algorithm: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x2

    const/4 p4, 0x0

    invoke-direct {p1, p2, p4, p3, p4}, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/stripe3ds2/security/DefaultJweEncrypter;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    invoke-interface {p3, p2}, Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;->reportError(Ljava/lang/Throwable;)V

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
