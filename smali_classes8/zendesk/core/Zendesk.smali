.class public final enum Lzendesk/core/Zendesk;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzendesk/core/Zendesk;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lzendesk/core/Zendesk;

.field public static final enum INSTANCE:Lzendesk/core/Zendesk;

.field private static final LOG_TAG:Ljava/lang/String; = "Zendesk"


# instance fields
.field private actionHandlerRegistry:Lzendesk/core/ActionHandlerRegistry;

.field private zendeskShadow:Lzendesk/core/ZendeskShadow;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lzendesk/core/Zendesk;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lzendesk/core/Zendesk;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzendesk/core/Zendesk;->INSTANCE:Lzendesk/core/Zendesk;

    const/4 v1, 0x1

    new-array v1, v1, [Lzendesk/core/Zendesk;

    aput-object v0, v1, v2

    sput-object v1, Lzendesk/core/Zendesk;->$VALUES:[Lzendesk/core/Zendesk;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    new-instance p1, Lzendesk/core/ZendeskActionHandlerRegistry;

    invoke-direct {p1}, Lzendesk/core/ZendeskActionHandlerRegistry;-><init>()V

    iput-object p1, p0, Lzendesk/core/Zendesk;->actionHandlerRegistry:Lzendesk/core/ActionHandlerRegistry;

    return-void
.end method

.method public static checkConfig(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p0, :cond_1

    new-array v4, v0, [Ljava/lang/String;

    aput-object p1, v4, v3

    aput-object p2, v4, v2

    aput-object p3, v4, v1

    invoke-static {v4}, LlS5;->c([Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    :goto_0
    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p0, v4, v3

    invoke-static {p1}, LlS5;->b(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    aput-object p0, v4, v2

    invoke-static {p2}, LlS5;->b(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    aput-object p0, v4, v1

    invoke-static {p3}, LlS5;->b(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    aput-object p0, v4, v0

    const-string p0, "Invalid zendesk configuration provided | Context: %b | Url: %b | Application Id: %b | OauthClientId: %b"

    invoke-static {p0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "Zendesk"

    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, LIx2;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return v3
.end method

.method public static valueOf(Ljava/lang/String;)Lzendesk/core/Zendesk;
    .locals 1

    const-class v0, Lzendesk/core/Zendesk;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzendesk/core/Zendesk;

    return-object p0
.end method

.method public static values()[Lzendesk/core/Zendesk;
    .locals 1

    sget-object v0, Lzendesk/core/Zendesk;->$VALUES:[Lzendesk/core/Zendesk;

    invoke-virtual {v0}, [Lzendesk/core/Zendesk;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzendesk/core/Zendesk;

    return-object v0
.end method


# virtual methods
.method public actionHandlerRegistry()Lzendesk/core/ActionHandlerRegistry;
    .locals 1

    iget-object v0, p0, Lzendesk/core/Zendesk;->actionHandlerRegistry:Lzendesk/core/ActionHandlerRegistry;

    return-object v0
.end method

.method public coreModule()Lzendesk/core/CoreModule;
    .locals 3

    invoke-virtual {p0}, Lzendesk/core/Zendesk;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Zendesk"

    const-string v2, "Cannot get CoreModule before SDK has been initialized. init() must be called before coreModule()."

    invoke-static {v1, v2, v0}, LIx2;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lzendesk/core/Zendesk;->zendeskShadow:Lzendesk/core/ZendeskShadow;

    invoke-virtual {v0}, Lzendesk/core/ZendeskShadow;->coreModule()Lzendesk/core/CoreModule;

    move-result-object v0

    return-object v0
.end method

.method public getIdentity()Lzendesk/core/Identity;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/Zendesk;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lzendesk/core/Zendesk;->zendeskShadow:Lzendesk/core/ZendeskShadow;

    invoke-virtual {v0}, Lzendesk/core/ZendeskShadow;->getIdentity()Lzendesk/core/Identity;

    move-result-object v0

    return-object v0
.end method

.method public init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {p1, p2, p3, p4}, Lzendesk/core/Zendesk;->checkConfig(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    new-instance v0, Lzendesk/core/ApplicationConfiguration;

    invoke-direct {v0, p3, p2, p4}, Lzendesk/core/ApplicationConfiguration;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lzendesk/core/DaggerZendeskApplicationComponent;->builder()Lzendesk/core/DaggerZendeskApplicationComponent$Builder;

    move-result-object p2

    new-instance p3, Lzendesk/core/ZendeskApplicationModule;

    invoke-direct {p3, p1, v0}, Lzendesk/core/ZendeskApplicationModule;-><init>(Landroid/content/Context;Lzendesk/core/ApplicationConfiguration;)V

    invoke-virtual {p2, p3}, Lzendesk/core/DaggerZendeskApplicationComponent$Builder;->zendeskApplicationModule(Lzendesk/core/ZendeskApplicationModule;)Lzendesk/core/DaggerZendeskApplicationComponent$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lzendesk/core/DaggerZendeskApplicationComponent$Builder;->build()Lzendesk/core/ZendeskApplicationComponent;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lzendesk/core/Zendesk;->init(Lzendesk/core/ZendeskApplicationComponent;Lzendesk/core/ApplicationConfiguration;)V

    return-void
.end method

.method public init(Lzendesk/core/ZendeskApplicationComponent;Lzendesk/core/ApplicationConfiguration;)V
    .locals 2

    iget-object v0, p0, Lzendesk/core/Zendesk;->zendeskShadow:Lzendesk/core/ZendeskShadow;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v0, p2}, Lzendesk/core/ZendeskShadow;->cleanupIfNewConfig(Lzendesk/core/ApplicationConfiguration;)V

    :cond_1
    invoke-interface {p1}, Lzendesk/core/ZendeskApplicationComponent;->zendeskShadow()Lzendesk/core/ZendeskShadow;

    move-result-object p1

    invoke-virtual {p1, p2, v1}, Lzendesk/core/ZendeskShadow;->init(Lzendesk/core/ApplicationConfiguration;Z)V

    iput-object p1, p0, Lzendesk/core/Zendesk;->zendeskShadow:Lzendesk/core/ZendeskShadow;

    return-void
.end method

.method public isInitialized()Z
    .locals 1

    iget-object v0, p0, Lzendesk/core/Zendesk;->zendeskShadow:Lzendesk/core/ZendeskShadow;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public provider()Lzendesk/core/ProviderStore;
    .locals 4

    invoke-virtual {p0}, Lzendesk/core/Zendesk;->isInitialized()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "Zendesk"

    if-nez v0, :cond_0

    const-string v0, "Cannot get ProviderStore before SDK has been initialized. init() must be called before provider()."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v3, v0, v2}, LIx2;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_0
    invoke-virtual {p0}, Lzendesk/core/Zendesk;->getIdentity()Lzendesk/core/Identity;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "Cannot get ProviderStore before an identity has been set. Zendesk.INSTANCE.setIdentity() must be called before provider()."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v3, v0, v2}, LIx2;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    :cond_1
    iget-object v0, p0, Lzendesk/core/Zendesk;->zendeskShadow:Lzendesk/core/ZendeskShadow;

    invoke-virtual {v0}, Lzendesk/core/ZendeskShadow;->providers()Lzendesk/core/ProviderStore;

    move-result-object v0

    return-object v0
.end method

.method public reset()V
    .locals 3

    invoke-virtual {p0}, Lzendesk/core/Zendesk;->isInitialized()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "Zendesk"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzendesk/core/Zendesk;->zendeskShadow:Lzendesk/core/ZendeskShadow;

    invoke-virtual {v0}, Lzendesk/core/ZendeskShadow;->reset()V

    const/4 v0, 0x0

    iput-object v0, p0, Lzendesk/core/Zendesk;->zendeskShadow:Lzendesk/core/ZendeskShadow;

    const-string v0, "Tearing down Zendesk"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v0, v1}, LIx2;->g(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string v0, "Cant reset, Zendesk is uninitialized"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v0, v1}, LIx2;->g(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public setIdentity(Lzendesk/core/Identity;)V
    .locals 2

    invoke-virtual {p0}, Lzendesk/core/Zendesk;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Zendesk"

    const-string v1, "Cannot get set identity before SDK has been initialized. init() must be called before setIdentity(...)."

    invoke-static {v0, v1, p1}, LIx2;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lzendesk/core/Zendesk;->zendeskShadow:Lzendesk/core/ZendeskShadow;

    invoke-virtual {v0, p1}, Lzendesk/core/ZendeskShadow;->setIdentity(Lzendesk/core/Identity;)V

    return-void
.end method
