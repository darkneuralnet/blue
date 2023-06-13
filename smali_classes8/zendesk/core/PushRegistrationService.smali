.class interface abstract Lzendesk/core/PushRegistrationService;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract registerDevice(Lzendesk/core/PushRegistrationRequestWrapper;)Lx80;
    .param p1    # Lzendesk/core/PushRegistrationRequestWrapper;
        .annotation runtime LPY;
        .end annotation
    .end param
    .annotation runtime LAD3;
        value = "/api/mobile/push_notification_devices.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/core/PushRegistrationRequestWrapper;",
            ")",
            "Lx80<",
            "Lzendesk/core/PushRegistrationResponseWrapper;",
            ">;"
        }
    .end annotation
.end method

.method public abstract unregisterDevice(Ljava/lang/String;)Lx80;
    .param p1    # Ljava/lang/String;
        .annotation runtime LdJ3;
            value = "id"
        .end annotation
    .end param
    .annotation runtime LKF0;
        value = "/api/mobile/push_notification_devices/{id}.json"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lx80<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method
