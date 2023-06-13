.class interface abstract Lzendesk/core/SdkSettingsService;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getSettings(Ljava/lang/String;Ljava/lang/String;)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LzH1;
            value = "Accept-Language"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "applicationId"
        .end annotation
    .end param
    .annotation runtime LNA1;
        value = "/api/private/mobile_sdk/settings/{applicationId}.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lx80<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lyi2;",
            ">;>;"
        }
    .end annotation
.end method
