.class public final Lzendesk/core/ZendeskStorageModule_ProvideSettingsStorageFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/core/SettingsStorage;",
        ">;"
    }
.end annotation


# instance fields
.field private final baseStorageProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/BaseStorage;",
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
            "Lzendesk/core/BaseStorage;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/ZendeskStorageModule_ProvideSettingsStorageFactory;->baseStorageProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/core/ZendeskStorageModule_ProvideSettingsStorageFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/BaseStorage;",
            ">;)",
            "Lzendesk/core/ZendeskStorageModule_ProvideSettingsStorageFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/core/ZendeskStorageModule_ProvideSettingsStorageFactory;

    invoke-direct {v0, p0}, Lzendesk/core/ZendeskStorageModule_ProvideSettingsStorageFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static provideSettingsStorage(Lzendesk/core/BaseStorage;)Lzendesk/core/SettingsStorage;
    .locals 0

    invoke-static {p0}, Lzendesk/core/ZendeskStorageModule;->provideSettingsStorage(Lzendesk/core/BaseStorage;)Lzendesk/core/SettingsStorage;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/core/SettingsStorage;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/ZendeskStorageModule_ProvideSettingsStorageFactory;->get()Lzendesk/core/SettingsStorage;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/core/SettingsStorage;
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskStorageModule_ProvideSettingsStorageFactory;->baseStorageProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/BaseStorage;

    invoke-static {v0}, Lzendesk/core/ZendeskStorageModule_ProvideSettingsStorageFactory;->provideSettingsStorage(Lzendesk/core/BaseStorage;)Lzendesk/core/SettingsStorage;

    move-result-object v0

    return-object v0
.end method
