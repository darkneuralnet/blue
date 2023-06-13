.class public final Lzendesk/core/ZendeskProvidersModule_ProvideSdkSettingsServiceFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/core/SdkSettingsService;",
        ">;"
    }
.end annotation


# instance fields
.field private final retrofitProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMN4;",
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
            "LMN4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/ZendeskProvidersModule_ProvideSdkSettingsServiceFactory;->retrofitProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/core/ZendeskProvidersModule_ProvideSdkSettingsServiceFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LMN4;",
            ">;)",
            "Lzendesk/core/ZendeskProvidersModule_ProvideSdkSettingsServiceFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/core/ZendeskProvidersModule_ProvideSdkSettingsServiceFactory;

    invoke-direct {v0, p0}, Lzendesk/core/ZendeskProvidersModule_ProvideSdkSettingsServiceFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static provideSdkSettingsService(LMN4;)Lzendesk/core/SdkSettingsService;
    .locals 0

    invoke-static {p0}, Lzendesk/core/ZendeskProvidersModule;->provideSdkSettingsService(LMN4;)Lzendesk/core/SdkSettingsService;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/core/SdkSettingsService;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/ZendeskProvidersModule_ProvideSdkSettingsServiceFactory;->get()Lzendesk/core/SdkSettingsService;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/core/SdkSettingsService;
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskProvidersModule_ProvideSdkSettingsServiceFactory;->retrofitProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LMN4;

    invoke-static {v0}, Lzendesk/core/ZendeskProvidersModule_ProvideSdkSettingsServiceFactory;->provideSdkSettingsService(LMN4;)Lzendesk/core/SdkSettingsService;

    move-result-object v0

    return-object v0
.end method
