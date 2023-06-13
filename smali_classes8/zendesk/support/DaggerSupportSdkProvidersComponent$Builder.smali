.class final Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/support/DaggerSupportSdkProvidersComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private coreModule:Lzendesk/core/CoreModule;

.field private guideModule:Lzendesk/support/GuideModule;

.field private providerModule:Lzendesk/support/ProviderModule;

.field private storageModule:Lzendesk/support/StorageModule;

.field private supportApplicationModule:Lzendesk/support/SupportApplicationModule;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzendesk/support/DaggerSupportSdkProvidersComponent$1;)V
    .locals 0

    invoke-direct {p0}, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lzendesk/support/SupportSdkProvidersComponent;
    .locals 8

    iget-object v0, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->supportApplicationModule:Lzendesk/support/SupportApplicationModule;

    const-class v1, Lzendesk/support/SupportApplicationModule;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->coreModule:Lzendesk/core/CoreModule;

    const-class v1, Lzendesk/core/CoreModule;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->providerModule:Lzendesk/support/ProviderModule;

    if-nez v0, :cond_0

    new-instance v0, Lzendesk/support/ProviderModule;

    invoke-direct {v0}, Lzendesk/support/ProviderModule;-><init>()V

    iput-object v0, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->providerModule:Lzendesk/support/ProviderModule;

    :cond_0
    iget-object v0, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->guideModule:Lzendesk/support/GuideModule;

    const-class v1, Lzendesk/support/GuideModule;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->storageModule:Lzendesk/support/StorageModule;

    if-nez v0, :cond_1

    new-instance v0, Lzendesk/support/StorageModule;

    invoke-direct {v0}, Lzendesk/support/StorageModule;-><init>()V

    iput-object v0, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->storageModule:Lzendesk/support/StorageModule;

    :cond_1
    new-instance v0, Lzendesk/support/DaggerSupportSdkProvidersComponent;

    iget-object v2, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->supportApplicationModule:Lzendesk/support/SupportApplicationModule;

    iget-object v3, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->coreModule:Lzendesk/core/CoreModule;

    iget-object v4, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->providerModule:Lzendesk/support/ProviderModule;

    iget-object v5, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->guideModule:Lzendesk/support/GuideModule;

    iget-object v6, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->storageModule:Lzendesk/support/StorageModule;

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lzendesk/support/DaggerSupportSdkProvidersComponent;-><init>(Lzendesk/support/SupportApplicationModule;Lzendesk/core/CoreModule;Lzendesk/support/ProviderModule;Lzendesk/support/GuideModule;Lzendesk/support/StorageModule;Lzendesk/support/DaggerSupportSdkProvidersComponent$1;)V

    return-object v0
.end method

.method public coreModule(Lzendesk/core/CoreModule;)Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzendesk/core/CoreModule;

    iput-object p1, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->coreModule:Lzendesk/core/CoreModule;

    return-object p0
.end method

.method public guideModule(Lzendesk/support/GuideModule;)Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzendesk/support/GuideModule;

    iput-object p1, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->guideModule:Lzendesk/support/GuideModule;

    return-object p0
.end method

.method public providerModule(Lzendesk/support/ProviderModule;)Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzendesk/support/ProviderModule;

    iput-object p1, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->providerModule:Lzendesk/support/ProviderModule;

    return-object p0
.end method

.method public serviceModule(Lzendesk/support/ServiceModule;)Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public storageModule(Lzendesk/support/StorageModule;)Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzendesk/support/StorageModule;

    iput-object p1, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->storageModule:Lzendesk/support/StorageModule;

    return-object p0
.end method

.method public supportApplicationModule(Lzendesk/support/SupportApplicationModule;)Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzendesk/support/SupportApplicationModule;

    iput-object p1, p0, Lzendesk/support/DaggerSupportSdkProvidersComponent$Builder;->supportApplicationModule:Lzendesk/support/SupportApplicationModule;

    return-object p0
.end method
