.class public final enum Lzendesk/support/Guide;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzendesk/support/Guide;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lzendesk/support/Guide;

.field public static final enum INSTANCE:Lzendesk/support/Guide;

.field private static final LOG_TAG:Ljava/lang/String; = "Guide"


# instance fields
.field blipsProvider:Lzendesk/support/HelpCenterBlipsProvider;

.field guideModule:Lzendesk/support/GuideModule;

.field private helpCenterLocaleOverride:Ljava/util/Locale;

.field private helpCenterTracker:Lzendesk/support/HelpCenterTracker;

.field private initialized:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lzendesk/support/Guide;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lzendesk/support/Guide;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lzendesk/support/Guide;->INSTANCE:Lzendesk/support/Guide;

    const/4 v1, 0x1

    new-array v1, v1, [Lzendesk/support/Guide;

    aput-object v0, v1, v2

    sput-object v1, Lzendesk/support/Guide;->$VALUES:[Lzendesk/support/Guide;

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

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lzendesk/support/Guide;
    .locals 1

    const-class v0, Lzendesk/support/Guide;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzendesk/support/Guide;

    return-object p0
.end method

.method public static values()[Lzendesk/support/Guide;
    .locals 1

    sget-object v0, Lzendesk/support/Guide;->$VALUES:[Lzendesk/support/Guide;

    invoke-virtual {v0}, [Lzendesk/support/Guide;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzendesk/support/Guide;

    return-object v0
.end method


# virtual methods
.method public getHelpCenterLocaleOverride()Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lzendesk/support/Guide;->helpCenterLocaleOverride:Ljava/util/Locale;

    return-object v0
.end method

.method public guideModule()Lzendesk/support/GuideModule;
    .locals 1

    iget-object v0, p0, Lzendesk/support/Guide;->guideModule:Lzendesk/support/GuideModule;

    return-object v0
.end method

.method public init(Lzendesk/core/Zendesk;)V
    .locals 2

    iget-object v0, p0, Lzendesk/support/Guide;->helpCenterTracker:Lzendesk/support/HelpCenterTracker;

    if-nez v0, :cond_0

    new-instance v0, Lzendesk/support/HelpCenterTracker$DefaultTracker;

    invoke-direct {v0}, Lzendesk/support/HelpCenterTracker$DefaultTracker;-><init>()V

    iput-object v0, p0, Lzendesk/support/Guide;->helpCenterTracker:Lzendesk/support/HelpCenterTracker;

    :cond_0
    invoke-virtual {p1}, Lzendesk/core/Zendesk;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lzendesk/core/Zendesk;->coreModule()Lzendesk/core/CoreModule;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzendesk/support/Guide;->initApplicationScope(Lzendesk/core/CoreModule;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzendesk/support/Guide;->initialized:Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Guide"

    const-string v1, "Cannot use Guide SDK without initializing Zendesk. Call Zendesk.INSTANCE.init(...)"

    invoke-static {v0, v1, p1}, LIx2;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public initApplicationScope(Lzendesk/core/CoreModule;)V
    .locals 2

    invoke-static {}, Lzendesk/support/DaggerGuideSdkProvidersComponent;->builder()Lzendesk/support/DaggerGuideSdkProvidersComponent$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lzendesk/support/DaggerGuideSdkProvidersComponent$Builder;->coreModule(Lzendesk/core/CoreModule;)Lzendesk/support/DaggerGuideSdkProvidersComponent$Builder;

    move-result-object p1

    new-instance v0, Lzendesk/support/GuideProviderModule;

    iget-object v1, p0, Lzendesk/support/Guide;->helpCenterTracker:Lzendesk/support/HelpCenterTracker;

    invoke-direct {v0, v1}, Lzendesk/support/GuideProviderModule;-><init>(Lzendesk/support/HelpCenterTracker;)V

    invoke-virtual {p1, v0}, Lzendesk/support/DaggerGuideSdkProvidersComponent$Builder;->guideProviderModule(Lzendesk/support/GuideProviderModule;)Lzendesk/support/DaggerGuideSdkProvidersComponent$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lzendesk/support/DaggerGuideSdkProvidersComponent$Builder;->build()Lzendesk/support/GuideSdkProvidersComponent;

    move-result-object p1

    invoke-interface {p1, p0}, Lzendesk/support/GuideSdkProvidersComponent;->inject(Lzendesk/support/Guide;)Lzendesk/support/Guide;

    return-void
.end method

.method public installTracker(Lzendesk/support/HelpCenterTracker;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/Guide;->helpCenterTracker:Lzendesk/support/HelpCenterTracker;

    sget-object p1, Lzendesk/core/Zendesk;->INSTANCE:Lzendesk/core/Zendesk;

    invoke-virtual {p1}, Lzendesk/core/Zendesk;->coreModule()Lzendesk/core/CoreModule;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzendesk/support/Guide;->initApplicationScope(Lzendesk/core/CoreModule;)V

    return-void
.end method

.method public isInitialized()Z
    .locals 1

    iget-boolean v0, p0, Lzendesk/support/Guide;->initialized:Z

    return v0
.end method

.method public provider()Lzendesk/support/HelpCenterProvider;
    .locals 3

    invoke-virtual {p0}, Lzendesk/support/Guide;->isInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Guide"

    const-string v2, "Cannot get HelpCenterProvider before SDK has been initialized. init() must be called before provider()."

    invoke-static {v1, v2, v0}, LIx2;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lzendesk/support/Guide;->guideModule:Lzendesk/support/GuideModule;

    invoke-virtual {v0}, Lzendesk/support/GuideModule;->providesHelpCenterProvider()Lzendesk/support/HelpCenterProvider;

    move-result-object v0

    return-object v0
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lzendesk/support/Guide;->helpCenterTracker:Lzendesk/support/HelpCenterTracker;

    iput-object v0, p0, Lzendesk/support/Guide;->helpCenterLocaleOverride:Ljava/util/Locale;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzendesk/support/Guide;->initialized:Z

    return-void
.end method

.method public setHelpCenterLocaleOverride(Ljava/util/Locale;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/Guide;->helpCenterLocaleOverride:Ljava/util/Locale;

    sget-object p1, Lzendesk/core/Zendesk;->INSTANCE:Lzendesk/core/Zendesk;

    invoke-virtual {p1}, Lzendesk/core/Zendesk;->coreModule()Lzendesk/core/CoreModule;

    move-result-object p1

    invoke-virtual {p0, p1}, Lzendesk/support/Guide;->initApplicationScope(Lzendesk/core/CoreModule;)V

    return-void
.end method
