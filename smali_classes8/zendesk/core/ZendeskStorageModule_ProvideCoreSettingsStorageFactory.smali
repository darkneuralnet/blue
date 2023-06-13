.class public final Lzendesk/core/ZendeskStorageModule_ProvideCoreSettingsStorageFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/core/CoreSettingsStorage;",
        ">;"
    }
.end annotation


# instance fields
.field private final settingsStorageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/SettingsStorage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/SettingsStorage;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/ZendeskStorageModule_ProvideCoreSettingsStorageFactory;->settingsStorageProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/core/ZendeskStorageModule_ProvideCoreSettingsStorageFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/SettingsStorage;",
            ">;)",
            "Lzendesk/core/ZendeskStorageModule_ProvideCoreSettingsStorageFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/core/ZendeskStorageModule_ProvideCoreSettingsStorageFactory;

    invoke-direct {v0, p0}, Lzendesk/core/ZendeskStorageModule_ProvideCoreSettingsStorageFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static provideCoreSettingsStorage(Ljava/lang/Object;)Lzendesk/core/CoreSettingsStorage;
    .locals 0

    check-cast p0, Lzendesk/core/SettingsStorage;

    invoke-static {p0}, Lzendesk/core/ZendeskStorageModule;->provideCoreSettingsStorage(Lzendesk/core/SettingsStorage;)Lzendesk/core/CoreSettingsStorage;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/core/CoreSettingsStorage;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/ZendeskStorageModule_ProvideCoreSettingsStorageFactory;->get()Lzendesk/core/CoreSettingsStorage;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/core/CoreSettingsStorage;
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskStorageModule_ProvideCoreSettingsStorageFactory;->settingsStorageProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzendesk/core/ZendeskStorageModule_ProvideCoreSettingsStorageFactory;->provideCoreSettingsStorage(Ljava/lang/Object;)Lzendesk/core/CoreSettingsStorage;

    move-result-object v0

    return-object v0
.end method
