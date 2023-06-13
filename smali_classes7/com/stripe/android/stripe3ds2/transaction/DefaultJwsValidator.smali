.class public final Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001e\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J&\u0010\u0015\u001a\u00020\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007R\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;",
        "Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;",
        "Ljh2;",
        "jwsObject",
        "",
        "Ljava/security/cert/X509Certificate;",
        "rootCerts",
        "",
        "isValid",
        "Lih2;",
        "jwsHeader",
        "Lkh2;",
        "getVerifier",
        "Ljava/security/PublicKey;",
        "getPublicKeyFromHeader",
        "",
        "jws",
        "Lorg/json/JSONObject;",
        "getPayload",
        "LGy;",
        "encodedChainCerts",
        "isCertificateChainValid",
        "isLiveMode",
        "Z",
        "Ljava/util/List;",
        "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "errorReporter",
        "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "<init>",
        "(ZLjava/util/List;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V",
        "Companion",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator$Companion;


# instance fields
.field private final errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

.field private final isLiveMode:Z

.field private final rootCerts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/security/cert/X509Certificate;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;->Companion:Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator$Companion;

    return-void
.end method

.method public constructor <init>(ZLjava/util/List;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/X509Certificate;",
            ">;",
            "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
            ")V"
        }
    .end annotation

    const-string v0, "rootCerts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;->isLiveMode:Z

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;->rootCerts:Ljava/util/List;

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    return-void
.end method

.method private final getPublicKeyFromHeader(Lih2;)Ljava/security/PublicKey;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    invoke-virtual {p1}, Lih2;->m()Ljava/util/List;

    move-result-object p1

    const-string v0, "jwsHeader.x509CertChain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LGy;

    invoke-virtual {p1}, LGy;->a()[B

    move-result-object p1

    invoke-static {p1}, LsH6;->b([B)Ljava/security/cert/X509Certificate;

    move-result-object p1

    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object p1

    const-string v0, "parseWithException(\n    \u2026ode()\n        ).publicKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getVerifier(Lih2;)Lkh2;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;,
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    new-instance v0, LRX0;

    invoke-direct {v0}, LRX0;-><init>()V

    invoke-virtual {v0}, LRX0;->getJCAContext()LBg2;

    move-result-object v1

    invoke-static {}, Lr00;->a()Lp00;

    move-result-object v2

    invoke-virtual {v1, v2}, LBg2;->c(Ljava/security/Provider;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;->getPublicKeyFromHeader(Lih2;)Ljava/security/PublicKey;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LRX0;->c(Lih2;Ljava/security/Key;)Lkh2;

    move-result-object p1

    const-string v0, "verifierFactory.createJW\u2026KeyFromHeader(jwsHeader))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final isValid(Ljh2;Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljh2;",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/X509Certificate;",
            ">;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;,
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    invoke-virtual {p1}, Ljh2;->h()Lih2;

    move-result-object v0

    invoke-virtual {v0}, Lih2;->j()Lfh2;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Encountered a JWK in "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljh2;->h()Lih2;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;->reportError(Ljava/lang/Throwable;)V

    :cond_0
    sget-object v0, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;->Companion:Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator$Companion;

    invoke-virtual {p1}, Ljh2;->h()Lih2;

    move-result-object v1

    const-string v2, "jwsObject.header"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator$Companion;->sanitizedJwsHeader$3ds2sdk_release(Lih2;)Lih2;

    move-result-object v0

    invoke-virtual {v0}, Lih2;->m()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;->isCertificateChainValid(Ljava/util/List;Ljava/util/List;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-direct {p0, v0}, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;->getVerifier(Lih2;)Lkh2;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljh2;->n(Lkh2;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public getPayload(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Ljava/text/ParseException;,
            Lcom/nimbusds/jose/JOSEException;,
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    const-string v0, "jws"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljh2;->k(Ljava/lang/String;)Ljh2;

    move-result-object p1

    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;->isLiveMode:Z

    if-eqz v0, :cond_1

    const-string v0, "jwsObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;->rootCerts:Ljava/util/List;

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;->isValid(Ljh2;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Could not validate JWS"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-virtual {p1}, LFg2;->b()LvL3;

    move-result-object p1

    invoke-virtual {p1}, LvL3;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final isCertificateChainValid(Ljava/util/List;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "LGy;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Ljava/security/cert/X509Certificate;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "rootCerts"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    xor-int/2addr v0, v1

    if-eqz v0, :cond_3

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_2

    sget-object v0, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;->Companion:Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator$Companion;

    invoke-static {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator$Companion;->access$validateChain(Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator$Companion;Ljava/util/List;Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_2
    const-string p1, "Root certificates are empty"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    const-string p1, "JWSHeader\'s X.509 certificate chain is null or empty"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_4

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultJwsValidator;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    invoke-interface {v0, p2}, Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;->reportError(Ljava/lang/Throwable;)V

    :cond_4
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
