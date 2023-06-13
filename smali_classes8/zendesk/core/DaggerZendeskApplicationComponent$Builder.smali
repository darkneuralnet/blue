.class final Lzendesk/core/DaggerZendeskApplicationComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/core/DaggerZendeskApplicationComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private zendeskApplicationModule:Lzendesk/core/ZendeskApplicationModule;

.field private zendeskNetworkModule:Lzendesk/core/ZendeskNetworkModule;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzendesk/core/DaggerZendeskApplicationComponent$1;)V
    .locals 0

    invoke-direct {p0}, Lzendesk/core/DaggerZendeskApplicationComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lzendesk/core/ZendeskApplicationComponent;
    .locals 4

    iget-object v0, p0, Lzendesk/core/DaggerZendeskApplicationComponent$Builder;->zendeskApplicationModule:Lzendesk/core/ZendeskApplicationModule;

    const-class v1, Lzendesk/core/ZendeskApplicationModule;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lzendesk/core/DaggerZendeskApplicationComponent$Builder;->zendeskNetworkModule:Lzendesk/core/ZendeskNetworkModule;

    if-nez v0, :cond_0

    new-instance v0, Lzendesk/core/ZendeskNetworkModule;

    invoke-direct {v0}, Lzendesk/core/ZendeskNetworkModule;-><init>()V

    iput-object v0, p0, Lzendesk/core/DaggerZendeskApplicationComponent$Builder;->zendeskNetworkModule:Lzendesk/core/ZendeskNetworkModule;

    :cond_0
    new-instance v0, Lzendesk/core/DaggerZendeskApplicationComponent;

    iget-object v1, p0, Lzendesk/core/DaggerZendeskApplicationComponent$Builder;->zendeskApplicationModule:Lzendesk/core/ZendeskApplicationModule;

    iget-object v2, p0, Lzendesk/core/DaggerZendeskApplicationComponent$Builder;->zendeskNetworkModule:Lzendesk/core/ZendeskNetworkModule;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lzendesk/core/DaggerZendeskApplicationComponent;-><init>(Lzendesk/core/ZendeskApplicationModule;Lzendesk/core/ZendeskNetworkModule;Lzendesk/core/DaggerZendeskApplicationComponent$1;)V

    return-object v0
.end method

.method public zendeskApplicationModule(Lzendesk/core/ZendeskApplicationModule;)Lzendesk/core/DaggerZendeskApplicationComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzendesk/core/ZendeskApplicationModule;

    iput-object p1, p0, Lzendesk/core/DaggerZendeskApplicationComponent$Builder;->zendeskApplicationModule:Lzendesk/core/ZendeskApplicationModule;

    return-object p0
.end method

.method public zendeskNetworkModule(Lzendesk/core/ZendeskNetworkModule;)Lzendesk/core/DaggerZendeskApplicationComponent$Builder;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzendesk/core/ZendeskNetworkModule;

    iput-object p1, p0, Lzendesk/core/DaggerZendeskApplicationComponent$Builder;->zendeskNetworkModule:Lzendesk/core/ZendeskNetworkModule;

    return-object p0
.end method

.method public zendeskProvidersModule(Lzendesk/core/ZendeskProvidersModule;)Lzendesk/core/DaggerZendeskApplicationComponent$Builder;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public zendeskStorageModule(Lzendesk/core/ZendeskStorageModule;)Lzendesk/core/DaggerZendeskApplicationComponent$Builder;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
