.class public final Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 32\u00020\u0001:\u00013BQ\u0008\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(\u00a2\u0006\u0004\u0008.\u0010/BQ\u0008\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(\u00a2\u0006\u0004\u0008.\u00102J=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0014\u0010-\u001a\u00020\u00028AX\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u00064"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;",
        "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;",
        "",
        "directoryServerId",
        "Ljava/security/PublicKey;",
        "directoryServerPublicKey",
        "keyId",
        "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
        "sdkTransactionId",
        "sdkPublicKey",
        "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;",
        "create",
        "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/security/PublicKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "LRk2;",
        "getKeyUse$3ds2sdk_release",
        "(Ljava/lang/String;)LRk2;",
        "getKeyUse",
        "Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;",
        "deviceDataFactory",
        "Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;",
        "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;",
        "deviceParamNotAvailableFactory",
        "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;",
        "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;",
        "securityChecker",
        "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;",
        "Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;",
        "appInfoRepository",
        "Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;",
        "Lcom/stripe/android/stripe3ds2/security/JweEncrypter;",
        "jweEncrypter",
        "Lcom/stripe/android/stripe3ds2/security/JweEncrypter;",
        "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;",
        "messageVersionRegistry",
        "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;",
        "sdkReferenceNumber",
        "Ljava/lang/String;",
        "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "errorReporter",
        "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "getDeviceDataJson$3ds2sdk_release",
        "()Ljava/lang/String;",
        "deviceDataJson",
        "<init>",
        "(Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;Lcom/stripe/android/stripe3ds2/init/SecurityChecker;Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;Lcom/stripe/android/stripe3ds2/security/JweEncrypter;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V",
        "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;",
        "ephemeralKeyPairGenerator",
        "(Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;Lcom/stripe/android/stripe3ds2/init/SecurityChecker;Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V",
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
.field public static final Companion:Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$Companion;

.field private static final DATA_VERSION:Ljava/lang/String; = "1.1"

.field public static final KEY_DATA_VERSION:Ljava/lang/String; = "DV"

.field public static final KEY_DEVICE_DATA:Ljava/lang/String; = "DD"

.field public static final KEY_DEVICE_PARAM_NOT_AVAILABLE:Ljava/lang/String; = "DPNA"

.field public static final KEY_SECURITY_WARNINGS:Ljava/lang/String; = "SW"


# instance fields
.field private final appInfoRepository:Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;

.field private final deviceDataFactory:Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;

.field private final deviceParamNotAvailableFactory:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;

.field private final errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

.field private final jweEncrypter:Lcom/stripe/android/stripe3ds2/security/JweEncrypter;

.field private final messageVersionRegistry:Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

.field private final sdkReferenceNumber:Ljava/lang/String;

.field private final securityChecker:Lcom/stripe/android/stripe3ds2/init/SecurityChecker;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->Companion:Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;Lcom/stripe/android/stripe3ds2/init/SecurityChecker;Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;Lcom/stripe/android/stripe3ds2/security/JweEncrypter;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "deviceDataFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceParamNotAvailableFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "securityChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appInfoRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jweEncrypter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageVersionRegistry"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkReferenceNumber"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->deviceDataFactory:Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->deviceParamNotAvailableFactory:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->securityChecker:Lcom/stripe/android/stripe3ds2/init/SecurityChecker;

    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->appInfoRepository:Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;

    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->jweEncrypter:Lcom/stripe/android/stripe3ds2/security/JweEncrypter;

    iput-object p6, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->messageVersionRegistry:Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    iput-object p7, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->sdkReferenceNumber:Ljava/lang/String;

    iput-object p8, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    iput-object p9, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;Lcom/stripe/android/stripe3ds2/init/SecurityChecker;Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V
    .locals 11

    move-object v0, p4

    move-object/from16 v8, p8

    const-string v1, "deviceDataFactory"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "deviceParamNotAvailableFactory"

    move-object v3, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "securityChecker"

    move-object v4, p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "ephemeralKeyPairGenerator"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "appInfoRepository"

    move-object/from16 v5, p5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "messageVersionRegistry"

    move-object/from16 v6, p6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "sdkReferenceNumber"

    move-object/from16 v7, p7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "errorReporter"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "workContext"

    move-object/from16 v9, p9

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Lcom/stripe/android/stripe3ds2/security/DefaultJweEncrypter;

    invoke-direct {v10, p4, v8}, Lcom/stripe/android/stripe3ds2/security/DefaultJweEncrypter;-><init>(Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p5

    move-object v5, v10

    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;-><init>(Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;Lcom/stripe/android/stripe3ds2/init/SecurityChecker;Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;Lcom/stripe/android/stripe3ds2/security/JweEncrypter;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method public static final synthetic access$getAppInfoRepository$p(Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;)Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->appInfoRepository:Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;

    return-object p0
.end method

.method public static final synthetic access$getErrorReporter$p(Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;)Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->errorReporter:Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;

    return-object p0
.end method

.method public static final synthetic access$getJweEncrypter$p(Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;)Lcom/stripe/android/stripe3ds2/security/JweEncrypter;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->jweEncrypter:Lcom/stripe/android/stripe3ds2/security/JweEncrypter;

    return-object p0
.end method

.method public static final synthetic access$getMessageVersionRegistry$p(Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;)Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->messageVersionRegistry:Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;

    return-object p0
.end method

.method public static final synthetic access$getSdkReferenceNumber$p(Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->sdkReferenceNumber:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public create(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/security/PublicKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/security/PublicKey;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;",
            "Ljava/security/PublicKey;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object v8, p0

    iget-object v9, v8, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->workContext:Lkotlin/coroutines/CoroutineContext;

    new-instance v10, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;

    const/4 v7, 0x0

    move-object v0, v10

    move-object v1, p4

    move-object v2, p0

    move-object/from16 v3, p5

    move-object v4, p3

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$create$2;-><init>(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;Ljava/security/PublicKey;Lkotlin/coroutines/Continuation;)V

    move-object/from16 v0, p6

    invoke-static {v9, v10, v0}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getDeviceDataJson$3ds2sdk_release()Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "DV"

    const-string v2, "1.1"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    new-instance v1, Lorg/json/JSONObject;

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->deviceDataFactory:Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;

    invoke-interface {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;->create()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    const-string v2, "DD"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    new-instance v1, Lorg/json/JSONObject;

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->deviceParamNotAvailableFactory:Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;

    invoke-interface {v2}, Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;->create()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    const-string v2, "DPNA"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;->securityChecker:Lcom/stripe/android/stripe3ds2/init/SecurityChecker;

    invoke-interface {v1}, Lcom/stripe/android/stripe3ds2/init/SecurityChecker;->getWarnings()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/stripe3ds2/init/Warning;

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/init/Warning;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    const-string v2, "SW"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JSONObject()\n           \u2026              .toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getKeyUse$3ds2sdk_release(Ljava/lang/String;)LRk2;
    .locals 5

    const-string v0, "directoryServerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->values()[Lcom/stripe/android/stripe3ds2/security/DirectoryServer;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->getIds()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/stripe/android/stripe3ds2/security/DirectoryServer;->getKeyUse()LRk2;

    move-result-object p1

    goto :goto_2

    :cond_2
    sget-object p1, LRk2;->c:LRk2;

    :goto_2
    return-object p1
.end method
