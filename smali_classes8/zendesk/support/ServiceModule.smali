.class Lzendesk/support/ServiceModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideZendeskRequestService(Lzendesk/support/RequestService;)Lzendesk/support/ZendeskRequestService;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, Lzendesk/support/ZendeskRequestService;

    invoke-direct {v0, p0}, Lzendesk/support/ZendeskRequestService;-><init>(Lzendesk/support/RequestService;)V

    return-object v0
.end method

.method public static provideZendeskUploadService(Lzendesk/support/UploadService;)Lzendesk/support/ZendeskUploadService;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    new-instance v0, Lzendesk/support/ZendeskUploadService;

    invoke-direct {v0, p0}, Lzendesk/support/ZendeskUploadService;-><init>(Lzendesk/support/UploadService;)V

    return-object v0
.end method

.method public static providesRequestService(Lzendesk/core/RestServiceProvider;)Lzendesk/support/RequestService;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "5.0.9"

    const-string v1, "Support"

    const-class v2, Lzendesk/support/RequestService;

    invoke-interface {p0, v2, v0, v1}, Lzendesk/core/RestServiceProvider;->createRestService(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/RequestService;

    return-object p0
.end method

.method public static providesUploadService(Lzendesk/core/RestServiceProvider;)Lzendesk/support/UploadService;
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "5.0.9"

    const-string v1, "Support"

    const-class v2, Lzendesk/support/UploadService;

    invoke-interface {p0, v2, v0, v1}, Lzendesk/core/RestServiceProvider;->createRestService(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/UploadService;

    return-object p0
.end method
