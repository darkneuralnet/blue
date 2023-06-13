.class final Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0002\u0018\u0000 O2\u00020\u0001:\u0001OB9\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010A\u001a\u00020@\u0012\u0008\u0010L\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008M\u0010NJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0002J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0002J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J#\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J+\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ9\u0010\"\u001a\u00020\u000c2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020 0\u001fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\"\u0010#J#\u0010$\u001a\u00020\u000c2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008$\u0010\u0016J-\u0010&\u001a\u00020\u000c2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0008\u0010%\u001a\u0004\u0018\u00010\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008&\u0010\'J\u001b\u0010(\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008(\u0010\u0019J\u001c\u0010+\u001a\u00020\n2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120)H\u0016R\u0017\u0010-\u001a\u00020,8\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100R\u0017\u00102\u001a\u0002018\u0006\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105R\u0017\u00107\u001a\u0002068\u0006\u00a2\u0006\u000c\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:R\u0017\u0010<\u001a\u00020;8\u0006\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?R\u0017\u0010A\u001a\u00020@8\u0006\u00a2\u0006\u000c\n\u0004\u0008A\u0010B\u001a\u0004\u0008C\u0010DR\u0017\u0010F\u001a\u00020E8\u0006\u00a2\u0006\u000c\n\u0004\u0008F\u0010G\u001a\u0004\u0008H\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010K\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006P"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;",
        "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepository;",
        "",
        "applicationId",
        "clientSecret",
        "Lcom/stripe/android/core/networking/ApiRequest;",
        "synchronizeRequest",
        "source",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "institution",
        "",
        "updateActiveInstitution",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "authSession",
        "updateCachedActiveAuthSession",
        "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
        "synchronizeSessionResponse",
        "updateCachedSynchronizeSessionResponse",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "manifest",
        "updateCachedManifest",
        "getOrFetchSynchronizeFinancialConnectionsSession",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "synchronizeFinancialConnectionsSession",
        "markConsentAcquired",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "postAuthorizationSession",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Ljava/util/Date;",
        "clientTimestamp",
        "sessionId",
        "",
        "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;",
        "authSessionEvents",
        "postAuthorizationSessionEvent",
        "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "cancelAuthorizationSession",
        "publicToken",
        "completeAuthorizationSession",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "postMarkLinkingMoreAccounts",
        "Lkotlin/Function1;",
        "block",
        "updateLocalManifest",
        "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "requestExecutor",
        "Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "getRequestExecutor",
        "()Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "apiRequestFactory",
        "Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "getApiRequestFactory",
        "()Lcom/stripe/android/core/networking/ApiRequest$Factory;",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "apiOptions",
        "Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "getApiOptions",
        "()Lcom/stripe/android/core/networking/ApiRequest$Options;",
        "Ljava/util/Locale;",
        "locale",
        "Ljava/util/Locale;",
        "getLocale",
        "()Ljava/util/Locale;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "getLogger",
        "()Lcom/stripe/android/core/Logger;",
        "LSX2;",
        "mutex",
        "LSX2;",
        "getMutex",
        "()LSX2;",
        "cachedSynchronizeSessionResponse",
        "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
        "initialSync",
        "<init>",
        "(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V",
        "Companion",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFinancialConnectionsManifestRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsManifestRepository.kt\ncom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,390:1\n107#2,8:391\n116#2:400\n115#2:401\n107#2,10:402\n107#2,10:412\n1#3:399\n1559#4:422\n1590#4,4:423\n515#5:427\n500#5,6:428\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsManifestRepository.kt\ncom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl\n*L\n161#1:391,8\n161#1:400\n161#1:401\n174#1:402,10\n202#1:412,10\n255#1:422\n255#1:423,4\n297#1:427\n297#1:428,6\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$Companion;

.field public static final PARAMS_FULLSCREEN:Ljava/lang/String; = "fullscreen"

.field public static final PARAMS_HIDE_CLOSE_BUTTON:Ljava/lang/String; = "hide_close_button"

.field private static final cancelAuthSessionUrl:Ljava/lang/String;

.field private static final consentAcquiredUrl:Ljava/lang/String;

.field private static final eventsAuthSessionUrl:Ljava/lang/String;

.field private static final linkMoreAccountsUrl:Ljava/lang/String;

.field private static final synchronizeSessionUrl:Ljava/lang/String;


# instance fields
.field private final apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

.field private final apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

.field private cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

.field private final locale:Ljava/util/Locale;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final mutex:LSX2;

.field private final requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$Companion;

    sget-object v0, Lcom/stripe/android/core/networking/ApiRequest;->Companion:Lcom/stripe/android/core/networking/ApiRequest$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/v1/financial_connections/sessions/synchronize"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->synchronizeSessionUrl:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/v1/connections/auth_sessions/cancel"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cancelAuthSessionUrl:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/v1/connections/auth_sessions/events"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->eventsAuthSessionUrl:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/v1/link_account_sessions/consent_acquired"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->consentAcquiredUrl:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/stripe/android/core/networking/ApiRequest$Companion;->getAPI_HOST()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/v1/link_account_sessions/link_more_accounts"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->linkMoreAccountsUrl:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;Lcom/stripe/android/core/networking/ApiRequest$Factory;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Locale;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V
    .locals 1

    const-string v0, "requestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiOptions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->locale:Ljava/util/Locale;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static {p3, p1, p2}, LUX2;->b(ZILjava/lang/Object;)LSX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->mutex:LSX2;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    return-void
.end method

.method public static final synthetic access$getCancelAuthSessionUrl$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cancelAuthSessionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getConsentAcquiredUrl$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->consentAcquiredUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getEventsAuthSessionUrl$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->eventsAuthSessionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getLinkMoreAccountsUrl$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->linkMoreAccountsUrl:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getSynchronizeSessionUrl$cp()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->synchronizeSessionUrl:Ljava/lang/String;

    return-object v0
.end method

.method private final synchronizeRequest(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/networking/ApiRequest;
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->synchronizeSessionUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v3, 0x4

    new-array v3, v3, [Lkotlin/Pair;

    const-string v4, "manifest.active_auth_session"

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v5, "expand"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->locale:Ljava/util/Locale;

    invoke-virtual {v4}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v4

    const-string v6, "locale"

    invoke-static {v6, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v6, 0x1

    aput-object v4, v3, v6

    const/4 v4, 0x3

    new-array v7, v4, [Lkotlin/Pair;

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v9, "fullscreen"

    invoke-static {v9, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v7, v5

    const-string v5, "hide_close_button"

    invoke-static {v5, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v7, v6

    const-string v5, "application_id"

    invoke-static {v5, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v5, 0x2

    aput-object p1, v7, v5

    invoke-static {v7}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    const-string v6, "mobile"

    invoke-static {v6, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v3, v5

    const-string p1, "client_secret"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v3, v4

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    return-object p1
.end method

.method private final updateActiveInstitution(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V
    .locals 48

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SYNC_CACHE: updating local active institution from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    iget-object v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v2

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const v45, -0x400001

    const/16 v46, 0x3ff

    const/16 v47, 0x0

    move-object/from16 v25, p2

    invoke-static/range {v2 .. v47}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;IILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "updating active institution"

    invoke-direct {v0, v2, v1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    :cond_0
    return-void
.end method

.method private final updateCachedActiveAuthSession(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V
    .locals 48

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SYNC_CACHE: updating local active auth session from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    iget-object v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v2

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const v45, -0x200001

    const/16 v46, 0x3ff

    const/16 v47, 0x0

    move-object/from16 v24, p2

    invoke-static/range {v2 .. v47}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;ZZZZLjava/lang/String;ZZZZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/ManualEntryMode;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Product;ZZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$AccountDisconnectionMethod;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$LinkAccountSessionCancellationBehavior;Ljava/util/Map;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$SupportedPaymentMethodTypes;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;IILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "updating active auth session"

    invoke-direct {v0, v2, v1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    :cond_0
    return-void
.end method

.method private final updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SYNC_CACHE: updating local manifest from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    if-eqz v1, :cond_0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v2, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->copy$default(Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;Lcom/stripe/android/financialconnections/model/TextUpdate;Lcom/stripe/android/financialconnections/model/VisualUpdate;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    return-void
.end method

.method private final updateCachedSynchronizeSessionResponse(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SYNC_CACHE: updating local sync object from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    return-void
.end method


# virtual methods
.method public cancelAuthorizationSession(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v5, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cancelAuthSessionUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 p3, 0x2

    new-array p3, p3, [Lkotlin/Pair;

    const-string v2, "id"

    invoke-static {v2, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v2, 0x0

    aput-object p2, p3, v2

    const-string p2, "client_secret"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p3, v3

    invoke-static {p3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    sget-object p3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;->serializer()LKj2;

    move-result-object p3

    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$cancelAuthorizationSession$1;->label:I

    invoke-virtual {p2, p1, p3, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    move-object p2, p3

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    const-string v0, "cancelAuthorizationSession"

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedActiveAuthSession(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    return-object p3
.end method

.method public completeAuthorizationSession(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl$Companion;

    invoke-virtual {p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl$Companion;->getAuthorizeSessionUrl$financial_connections_release()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 p4, 0x3

    new-array p4, p4, [Lkotlin/Pair;

    const-string v2, "id"

    invoke-static {v2, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v2, 0x0

    aput-object p2, p4, v2

    const-string p2, "client_secret"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p4, v3

    const-string p1, "public_token"

    invoke-static {p1, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, p4, p2

    invoke-static {p4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_4

    move p3, v3

    goto :goto_2

    :cond_4
    move p3, v2

    :goto_2
    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p3

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v7, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_5
    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    sget-object p3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;->serializer()LKj2;

    move-result-object p3

    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$completeAuthorizationSession$1;->label:I

    invoke-virtual {p2, p1, p3, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_6

    return-object v1

    :cond_6
    move-object p1, p0

    :goto_3
    move-object p2, p4

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    const-string p3, "completeAuthorizationSession"

    invoke-direct {p1, p3, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedActiveAuthSession(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    return-object p4
.end method

.method public final getApiOptions()Lcom/stripe/android/core/networking/ApiRequest$Options;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    return-object v0
.end method

.method public final getApiRequestFactory()Lcom/stripe/android/core/networking/ApiRequest$Factory;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    return-object v0
.end method

.method public final getLocale()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->locale:Ljava/util/Locale;

    return-object v0
.end method

.method public final getLogger()Lcom/stripe/android/core/Logger;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->logger:Lcom/stripe/android/core/Logger;

    return-object v0
.end method

.method public final getMutex()LSX2;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->mutex:LSX2;

    return-object v0
.end method

.method public getOrFetchSynchronizeFinancialConnectionsSession(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    iget-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    check-cast p2, LSX2;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->L$3:Ljava/lang/Object;

    check-cast p1, LSX2;

    iget-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p3, p2

    move-object p2, p1

    move-object p1, v4

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->mutex:LSX2;

    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->label:I

    invoke-interface {p3, v5, v0}, LSX2;->a(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p1

    move-object p1, p0

    move-object v6, p3

    move-object p3, p2

    move-object p2, v6

    :goto_1
    :try_start_1
    iget-object v4, p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    if-nez v4, :cond_6

    iget-object v4, p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    invoke-direct {p1, p3, v2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->synchronizeRequest(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p3

    sget-object v2, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->Companion:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse$Companion;->serializer()LKj2;

    move-result-object v2

    iput-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->L$2:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$getOrFetchSynchronizeFinancialConnectionsSession$1;->label:I

    invoke-virtual {v4, p3, v2, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    const-string v1, "get/fetch"

    invoke-direct {p1, v1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedSynchronizeSessionResponse(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {p2, v5}, LSX2;->b(Ljava/lang/Object;)V

    return-object p3

    :cond_6
    invoke-interface {p2, v5}, LSX2;->b(Ljava/lang/Object;)V

    return-object v4

    :goto_3
    invoke-interface {p2, v5}, LSX2;->b(Ljava/lang/Object;)V

    throw p1
.end method

.method public final getRequestExecutor()Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    return-object v0
.end method

.method public markConsentAcquired(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;

    iget v3, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;

    invoke-direct {v2, v1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$1:Ljava/lang/Object;

    check-cast v3, LSX2;

    iget-object v2, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$2:Ljava/lang/Object;

    check-cast v4, LSX2;

    iget-object v8, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v17, v8

    move-object v8, v4

    move-object/from16 v4, v17

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->mutex:LSX2;

    iput-object v1, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$0:Ljava/lang/Object;

    move-object/from16 v4, p1

    iput-object v4, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$1:Ljava/lang/Object;

    iput-object v0, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$2:Ljava/lang/Object;

    iput v6, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->label:I

    invoke-interface {v0, v7, v2}, LSX2;->a(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v3, :cond_4

    return-object v3

    :cond_4
    move-object v8, v0

    move-object v9, v1

    :goto_1
    :try_start_1
    iget-object v10, v9, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v11, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->consentAcquiredUrl:Ljava/lang/String;

    iget-object v12, v9, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    new-array v0, v5, [Lkotlin/Pair;

    const-string v13, "expand"

    const-string v14, "active_auth_session"

    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    const/4 v14, 0x0

    aput-object v13, v0, v14

    const-string v13, "client_secret"

    invoke-static {v13, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v0, v6

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v13

    const/4 v14, 0x0

    const/16 v15, 0x8

    const/16 v16, 0x0

    invoke-static/range {v10 .. v16}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object v0

    iget-object v4, v9, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    sget-object v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;->serializer()LKj2;

    move-result-object v6

    iput-object v9, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->L$2:Ljava/lang/Object;

    iput v5, v2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$markConsentAcquired$1;->label:I

    invoke-virtual {v4, v0, v6, v2}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v3, :cond_5

    return-object v3

    :cond_5
    move-object v3, v8

    move-object v2, v9

    :goto_2
    :try_start_2
    move-object v4, v0

    check-cast v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    const-string v5, "consent acquired"

    invoke-direct {v2, v5, v4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v3, v7}, LSX2;->b(Ljava/lang/Object;)V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v3, v8

    :goto_3
    invoke-interface {v3, v7}, LSX2;->b(Ljava/lang/Object;)V

    throw v0
.end method

.method public postAuthorizationSession(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;

    invoke-direct {v0, p0, p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->L$1:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object p4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl;->Companion:Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl$Companion;

    invoke-virtual {p4}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepositoryImpl$Companion;->getAuthorizationSessionUrl$financial_connections_release()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 p4, 0x5

    new-array p4, p4, [Lkotlin/Pair;

    const-string v2, "client_secret"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, p4, v2

    const-string p1, "use_mobile_handoff"

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p4, v3

    const-string p1, "use_abstract_flow"

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {p1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v2, 0x2

    aput-object p1, p4, v2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "auth-redirect/"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "return_url"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x3

    aput-object p1, p4, p2

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getId()Ljava/lang/String;

    move-result-object p1

    const-string p2, "institution"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x4

    aput-object p1, p4, p2

    invoke-static {p4}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    sget-object p4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;

    invoke-virtual {p4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;->serializer()LKj2;

    move-result-object p4

    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postAuthorizationSession$1;->label:I

    invoke-virtual {p2, p1, p4, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    move-object p2, p4

    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    const-string v0, "postAuthorizationSession"

    invoke-direct {p1, v0, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateActiveInstitution(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;)V

    invoke-direct {p1, v0, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedActiveAuthSession(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;)V

    return-object p4
.end method

.method public postAuthorizationSessionEvent(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->eventsAuthSessionUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 v3, 0x3

    new-array v3, v3, [Lkotlin/Pair;

    const-string v4, "client_secret"

    invoke-static {v4, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    const-string p2, "client_timestamp"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v3, p2

    const-string p1, "id"

    invoke-static {p1, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v3, p2

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    check-cast p4, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {p4, p3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    add-int/lit8 v3, v4, 0x1

    if-gez v4, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast p4, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "frontend_events["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p4}, Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;->toMap()Ljava/util/Map;

    move-result-object p4

    invoke-static {v4, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p4

    invoke-interface {p2, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v4, v3

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    sget-object p3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;->serializer()LKj2;

    move-result-object p3

    invoke-virtual {p2, p1, p3, p5}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public postMarkLinkingMoreAccounts(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiRequestFactory:Lcom/stripe/android/core/networking/ApiRequest$Factory;

    sget-object v5, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->linkMoreAccountsUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->apiOptions:Lcom/stripe/android/core/networking/ApiRequest$Options;

    const/4 p2, 0x2

    new-array p2, p2, [Lkotlin/Pair;

    const-string v2, "active_auth_session"

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v7, "expand"

    invoke-static {v7, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v7, 0x0

    aput-object v2, p2, v7

    const-string v2, "client_secret"

    invoke-static {v2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, p2, v3

    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/core/networking/ApiRequest$Factory;->createPost$default(Lcom/stripe/android/core/networking/ApiRequest$Factory;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Ljava/util/Map;ZILjava/lang/Object;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Companion;->serializer()LKj2;

    move-result-object v2

    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$postMarkLinkingMoreAccounts$1;->label:I

    invoke-virtual {p2, p1, v2, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    move-object v0, p2

    check-cast v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    const-string v1, "postMarkLinkingMoreAccounts"

    invoke-direct {p1, v1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    return-object p2
.end method

.method public synchronizeFinancialConnectionsSession(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;

    iget v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;

    invoke-direct {v0, p0, p3}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;-><init>(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    check-cast p1, LSX2;

    iget-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->L$3:Ljava/lang/Object;

    check-cast p1, LSX2;

    iget-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    check-cast v4, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object p3, p1

    move-object p1, v2

    move-object v2, p2

    move-object p2, v4

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->mutex:LSX2;

    iput-object p0, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->label:I

    invoke-interface {p3, v5, v0}, LSX2;->a(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p2

    move-object p2, p0

    :goto_1
    :try_start_1
    invoke-direct {p2, v2, p1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->synchronizeRequest(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/core/networking/ApiRequest;

    move-result-object p1

    iget-object v2, p2, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->requestExecutor:Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;

    sget-object v4, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->Companion:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse$Companion;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse$Companion;->serializer()LKj2;

    move-result-object v4

    iput-object p2, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->L$2:Ljava/lang/Object;

    iput-object v5, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl$synchronizeFinancialConnectionsSession$1;->label:I

    invoke-virtual {v2, p1, v4, v0}, Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;->execute(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v6, p3

    move-object p3, p1

    move-object p1, v6

    :goto_2
    :try_start_2
    move-object v0, p3

    check-cast v0, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    const-string v1, "synchronize"

    invoke-direct {p2, v1, v0}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedSynchronizeSessionResponse(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {p1, v5}, LSX2;->b(Ljava/lang/Object;)V

    return-object p3

    :catchall_1
    move-exception p2

    move-object p1, p3

    :goto_3
    invoke-interface {p1, v5}, LSX2;->b(Ljava/lang/Object;)V

    throw p2
.end method

.method public updateLocalManifest(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
            ">;)V"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->cachedSynchronizeSessionResponse:Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;->getManifest()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;

    if-eqz p1, :cond_0

    const-string v0, "updateLocalManifest"

    invoke-direct {p0, v0, p1}, Lcom/stripe/android/financialconnections/repository/FinancialConnectionsManifestRepositoryImpl;->updateCachedManifest(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V

    :cond_0
    return-void
.end method
