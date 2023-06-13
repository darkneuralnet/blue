.class public final Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/core/Storage;",
        ">;"
    }
.end annotation


# instance fields
.field private final memoryCacheProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/MemoryCache;",
            ">;"
        }
    .end annotation
.end field

.field private final sdkBaseStorageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/BaseStorage;",
            ">;"
        }
    .end annotation
.end field

.field private final sessionStorageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/SessionStorage;",
            ">;"
        }
    .end annotation
.end field

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
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/SettingsStorage;",
            ">;",
            "LY94<",
            "Lzendesk/core/SessionStorage;",
            ">;",
            "LY94<",
            "Lzendesk/core/BaseStorage;",
            ">;",
            "LY94<",
            "Lzendesk/core/MemoryCache;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;->settingsStorageProvider:LY94;

    iput-object p2, p0, Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;->sessionStorageProvider:LY94;

    iput-object p3, p0, Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;->sdkBaseStorageProvider:LY94;

    iput-object p4, p0, Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;->memoryCacheProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;)Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/SettingsStorage;",
            ">;",
            "LY94<",
            "Lzendesk/core/SessionStorage;",
            ">;",
            "LY94<",
            "Lzendesk/core/BaseStorage;",
            ">;",
            "LY94<",
            "Lzendesk/core/MemoryCache;",
            ">;)",
            "Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static provideSdkStorage(Ljava/lang/Object;Lzendesk/core/SessionStorage;Lzendesk/core/BaseStorage;Lzendesk/core/MemoryCache;)Lzendesk/core/Storage;
    .locals 0

    check-cast p0, Lzendesk/core/SettingsStorage;

    invoke-static {p0, p1, p2, p3}, Lzendesk/core/ZendeskStorageModule;->provideSdkStorage(Lzendesk/core/SettingsStorage;Lzendesk/core/SessionStorage;Lzendesk/core/BaseStorage;Lzendesk/core/MemoryCache;)Lzendesk/core/Storage;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/core/Storage;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;->get()Lzendesk/core/Storage;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/core/Storage;
    .locals 4

    iget-object v0, p0, Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;->settingsStorageProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;->sessionStorageProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/core/SessionStorage;

    iget-object v2, p0, Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;->sdkBaseStorageProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzendesk/core/BaseStorage;

    iget-object v3, p0, Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;->memoryCacheProvider:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzendesk/core/MemoryCache;

    invoke-static {v0, v1, v2, v3}, Lzendesk/core/ZendeskStorageModule_ProvideSdkStorageFactory;->provideSdkStorage(Ljava/lang/Object;Lzendesk/core/SessionStorage;Lzendesk/core/BaseStorage;Lzendesk/core/MemoryCache;)Lzendesk/core/Storage;

    move-result-object v0

    return-object v0
.end method
