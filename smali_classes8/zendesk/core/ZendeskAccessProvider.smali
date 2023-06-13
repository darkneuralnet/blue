.class Lzendesk/core/ZendeskAccessProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/core/AccessProvider;


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "ZendeskAccessProvider"


# instance fields
.field private final accessService:Lzendesk/core/AccessService;

.field private final identityManager:Lzendesk/core/IdentityManager;


# direct methods
.method public constructor <init>(Lzendesk/core/IdentityManager;Lzendesk/core/AccessService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/ZendeskAccessProvider;->identityManager:Lzendesk/core/IdentityManager;

    iput-object p2, p0, Lzendesk/core/ZendeskAccessProvider;->accessService:Lzendesk/core/AccessService;

    return-void
.end method


# virtual methods
.method public getAuthTokenViaAnonymous(Lzendesk/core/AnonymousIdentity;)LHM4;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/core/AnonymousIdentity;",
            ")",
            "LHM4<",
            "Lzendesk/core/AuthenticationResponse;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "ZendeskAccessProvider"

    const-string v3, "Requesting an access token for anonymous identity."

    invoke-static {v2, v3, v1}, LIx2;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    new-instance v1, Lzendesk/core/AuthenticationRequestWrapper;

    new-instance v3, Lzendesk/core/ApiAnonymousIdentity;

    iget-object v4, p0, Lzendesk/core/ZendeskAccessProvider;->identityManager:Lzendesk/core/IdentityManager;

    invoke-interface {v4}, Lzendesk/core/IdentityManager;->getSdkGuid()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Lzendesk/core/ApiAnonymousIdentity;-><init>(Lzendesk/core/AnonymousIdentity;Ljava/lang/String;)V

    invoke-direct {v1, v3}, Lzendesk/core/AuthenticationRequestWrapper;-><init>(Lzendesk/core/Identity;)V

    iget-object p1, p0, Lzendesk/core/ZendeskAccessProvider;->accessService:Lzendesk/core/AccessService;

    invoke-interface {p1, v1}, Lzendesk/core/AccessService;->getAuthTokenForAnonymous(Lzendesk/core/AuthenticationRequestWrapper;)Lx80;

    move-result-object p1

    invoke-interface {p1}, Lx80;->execute()LHM4;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, p1, v0}, LIx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public getAuthTokenViaJwt(Lzendesk/core/JwtIdentity;)LHM4;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/core/JwtIdentity;",
            ")",
            "LHM4<",
            "Lzendesk/core/AuthenticationResponse;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "ZendeskAccessProvider"

    const-string v3, "Requesting an access token for jwt identity."

    invoke-static {v2, v3, v1}, LIx2;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lzendesk/core/JwtIdentity;->getJwtUserIdentifier()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LlS5;->d(Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const-string p1, "The jwt user identifier is null or empty. We cannot proceed to get an access token"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, p1, v0}, LIx2;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v3

    :cond_0
    :try_start_0
    new-instance v1, Lzendesk/core/AuthenticationRequestWrapper;

    invoke-direct {v1, p1}, Lzendesk/core/AuthenticationRequestWrapper;-><init>(Lzendesk/core/Identity;)V

    iget-object p1, p0, Lzendesk/core/ZendeskAccessProvider;->accessService:Lzendesk/core/AccessService;

    invoke-interface {p1, v1}, Lzendesk/core/AccessService;->getAuthTokenForJwt(Lzendesk/core/AuthenticationRequestWrapper;)Lx80;

    move-result-object p1

    invoke-interface {p1}, Lx80;->execute()LHM4;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, p1, v0}, LIx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    return-object v3
.end method
