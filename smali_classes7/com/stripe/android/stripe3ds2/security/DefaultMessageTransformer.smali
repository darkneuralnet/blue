.class public final Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/security/MessageTransformer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\t\u0008\u0080\u0008\u0018\u0000 32\u00020\u0001:\u00013B!\u0008\u0001\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u00a2\u0006\u0004\u00080\u00101B\u0011\u0008\u0016\u0012\u0006\u0010$\u001a\u00020\u0002\u00a2\u0006\u0004\u00080\u00102J\t\u0010\u0003\u001a\u00020\u0002H\u00c2\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c2\u0003J\t\u0010\u0006\u001a\u00020\u0004H\u00c2\u0003J\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000bH\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001f\u0010!\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001f\u0010#\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001\u00a2\u0006\u0004\u0008\"\u0010 J\'\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010$\u001a\u00020\u00022\u0008\u0008\u0002\u0010%\u001a\u00020\u00042\u0008\u0008\u0002\u0010&\u001a\u00020\u0004H\u00c6\u0001J\t\u0010(\u001a\u00020\u000bH\u00d6\u0001J\t\u0010*\u001a\u00020)H\u00d6\u0001J\u0013\u0010-\u001a\u00020\u00022\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010.R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010/R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010/\u00a8\u00064"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;",
        "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;",
        "",
        "component1",
        "",
        "component2",
        "component3",
        "Lorg/json/JSONObject;",
        "challengeRequest",
        "Ljavax/crypto/SecretKey;",
        "secretKey",
        "",
        "encrypt",
        "message",
        "decrypt",
        "cres",
        "",
        "validateAcsToSdkCounter$3ds2sdk_release",
        "(Lorg/json/JSONObject;)V",
        "validateAcsToSdkCounter",
        "decryptMessage$3ds2sdk_release",
        "(Ljava/lang/String;Ljavax/crypto/SecretKey;)Lorg/json/JSONObject;",
        "decryptMessage",
        "keyId",
        "Lbh2;",
        "createEncryptionHeader$3ds2sdk_release",
        "(Ljava/lang/String;)Lbh2;",
        "createEncryptionHeader",
        "LUc1;",
        "encryptionMethod",
        "",
        "getDecryptionKey$3ds2sdk_release",
        "(Ljavax/crypto/SecretKey;LUc1;)[B",
        "getDecryptionKey",
        "getEncryptionKey$3ds2sdk_release",
        "getEncryptionKey",
        "isLiveMode",
        "counterSdkToAcs",
        "counterAcsToSdk",
        "copy",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "equals",
        "Z",
        "B",
        "<init>",
        "(ZBB)V",
        "(Z)V",
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
.field public static final BITS_IN_BYTE:I = 0x8

.field public static final Companion:Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer$Companion;

.field private static final ENCRYPTION_METHOD:LUc1;

.field public static final FIELD_ACS_COUNTER_ACS_TO_SDK:Ljava/lang/String; = "acsCounterAtoS"

.field public static final FIELD_SDK_COUNTER_SDK_TO_ACS:Ljava/lang/String; = "sdkCounterStoA"


# instance fields
.field private counterAcsToSdk:B

.field private counterSdkToAcs:B

.field private final isLiveMode:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->Companion:Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer$Companion;

    sget-object v0, LUc1;->f:LUc1;

    sput-object v0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->ENCRYPTION_METHOD:LUc1;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;-><init>(ZBB)V

    return-void
.end method

.method public constructor <init>(ZBB)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    iput-byte p2, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    iput-byte p3, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    return-void
.end method

.method private final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    return v0
.end method

.method private final component2()B
    .locals 1

    iget-byte v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    return v0
.end method

.method private final component3()B
    .locals 1

    iget-byte v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    return v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;ZBBILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-byte p2, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-byte p3, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->copy(ZBB)Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy(ZBB)Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;
    .locals 1

    new-instance v0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;-><init>(ZBB)V

    return-object v0
.end method

.method public final createEncryptionHeader$3ds2sdk_release(Ljava/lang/String;)Lbh2;
    .locals 3

    const-string v0, "keyId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbh2$a;

    sget-object v1, LXg2;->m:LXg2;

    sget-object v2, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->ENCRYPTION_METHOD:LUc1;

    invoke-direct {v0, v1, v2}, Lbh2$a;-><init>(LXg2;LUc1;)V

    invoke-virtual {v0, p1}, Lbh2$a;->m(Ljava/lang/String;)Lbh2$a;

    move-result-object p1

    invoke-virtual {p1}, Lbh2$a;->d()Lbh2;

    move-result-object p1

    const-string v0, "Builder(JWEAlgorithm.DIR\u2026yId)\n            .build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public decrypt(Ljava/lang/String;Ljavax/crypto/SecretKey;)Lorg/json/JSONObject;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;,
            Lcom/nimbusds/jose/JOSEException;,
            Lorg/json/JSONException;,
            Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secretKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->decryptMessage$3ds2sdk_release(Ljava/lang/String;Ljavax/crypto/SecretKey;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->validateAcsToSdkCounter$3ds2sdk_release(Lorg/json/JSONObject;)V

    iget-byte p2, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    const/4 v0, 0x1

    add-int/2addr p2, v0

    int-to-byte p2, p2

    iput-byte p2, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "ACS to SDK counter is zero"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final decryptMessage$3ds2sdk_release(Ljava/lang/String;Ljavax/crypto/SecretKey;)Lorg/json/JSONObject;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;,
            Lcom/nimbusds/jose/JOSEException;,
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secretKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ldh2;->q(Ljava/lang/String;)Ldh2;

    move-result-object p1

    invoke-virtual {p1}, Ldh2;->o()Lbh2;

    move-result-object v0

    invoke-virtual {v0}, Lbh2;->t()LUc1;

    move-result-object v0

    const-string v1, "jweObject.header.encryptionMethod"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, v0}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->getDecryptionKey$3ds2sdk_release(Ljavax/crypto/SecretKey;LUc1;)[B

    move-result-object p2

    new-instance v0, Le41;

    invoke-direct {v0, p2}, Le41;-><init>([B)V

    invoke-virtual {p1, v0}, Ldh2;->f(LZg2;)V

    new-instance p2, Lorg/json/JSONObject;

    invoke-virtual {p1}, LFg2;->b()LvL3;

    move-result-object p1

    invoke-virtual {p1}, LvL3;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    return-object p2
.end method

.method public encrypt(Lorg/json/JSONObject;Ljavax/crypto/SecretKey;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/nimbusds/jose/JOSEException;,
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "challengeRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "secretKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acsTransID"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "challengeRequest.getStri\u2026tData.FIELD_ACS_TRANS_ID)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->createEncryptionHeader$3ds2sdk_release(Ljava/lang/String;)Lbh2;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    iget-byte v4, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const-string v4, "%03d"

    invoke-static {v1, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "format(locale, format, *args)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "sdkCounterStoA"

    invoke-virtual {p1, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v1, Ldh2;

    new-instance v3, LvL3;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, LvL3;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v0, v3}, Ldh2;-><init>(Lbh2;LvL3;)V

    new-instance p1, Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter;

    invoke-virtual {v0}, Lbh2;->t()LUc1;

    move-result-object v0

    const-string v3, "header.encryptionMethod"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, v0}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->getEncryptionKey$3ds2sdk_release(Ljavax/crypto/SecretKey;LUc1;)[B

    move-result-object p2

    iget-byte v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    invoke-direct {p1, p2, v0}, Lcom/stripe/android/stripe3ds2/security/TransactionEncrypter;-><init>([BB)V

    invoke-virtual {v1, p1}, Ldh2;->g(Lah2;)V

    iget-byte p1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    add-int/2addr p1, v2

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ldh2;->r()Ljava/lang/String;

    move-result-object p1

    const-string p2, "jweObject.serialize()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "SDK to ACS counter is zero"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;

    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    iget-boolean v3, p1, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-byte v1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    iget-byte v3, p1, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-byte v1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    iget-byte p1, p1, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDecryptionKey$3ds2sdk_release(Ljavax/crypto/SecretKey;LUc1;)[B
    .locals 1

    const-string v0, "secretKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encryptionMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    sget-object v0, LUc1;->k:LUc1;

    if-ne v0, p2, :cond_0

    array-length p2, p1

    invoke-virtual {v0}, LUc1;->b()I

    move-result v0

    div-int/lit8 v0, v0, 0x8

    sub-int/2addr p2, v0

    array-length v0, p1

    invoke-static {p1, p2, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    const-string p2, "{\n            Arrays.cop\u2026e\n            )\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p2, "{\n            encodedKey\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public final getEncryptionKey$3ds2sdk_release(Ljavax/crypto/SecretKey;LUc1;)[B
    .locals 1

    const-string v0, "secretKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encryptionMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    sget-object v0, LUc1;->k:LUc1;

    if-ne v0, p2, :cond_0

    invoke-virtual {v0}, LUc1;->b()I

    move-result p2

    div-int/lit8 p2, p2, 0x8

    const/4 v0, 0x0

    invoke-static {p1, v0, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    const-string p2, "{\n            Arrays.cop\u2026E\n            )\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p2, "{\n            encodedKey\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    invoke-static {v1}, Ljava/lang/Byte;->hashCode(B)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-byte v1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    invoke-static {v1}, Ljava/lang/Byte;->hashCode(B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DefaultMessageTransformer(isLiveMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", counterSdkToAcs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterSdkToAcs:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", counterAcsToSdk="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final validateAcsToSdkCounter$3ds2sdk_release(Lorg/json/JSONObject;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;,
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "cres"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->isLiveMode:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "acsCounterAtoS"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "cres.getString(FIELD_ACS_COUNTER_ACS_TO_SDK)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    iget-byte v0, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    if-ne v0, p1, :cond_1

    return-void

    :cond_1
    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    sget-object v1, Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;->DataDecryptionFailure:Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Counters are not equal. SDK counter: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v3, p0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;->counterAcsToSdk:B

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", ACS counter: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;-><init>(Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->Companion:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException$Companion;

    invoke-virtual {p1, v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException$Companion;->createInvalidDataElementFormat(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object p1

    throw p1

    :cond_3
    sget-object p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->Companion:Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException$Companion;

    invoke-virtual {p1, v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException$Companion;->createRequiredDataElementMissing(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object p1

    throw p1
.end method
