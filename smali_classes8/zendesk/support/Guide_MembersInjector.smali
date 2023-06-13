.class public final Lzendesk/support/Guide_MembersInjector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lzendesk/support/Guide;",
        ">;"
    }
.end annotation


# instance fields
.field private final blipsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/HelpCenterBlipsProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final guideModuleProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/GuideModule;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/support/GuideModule;",
            ">;",
            "LY94<",
            "Lzendesk/support/HelpCenterBlipsProvider;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/Guide_MembersInjector;->guideModuleProvider:LY94;

    iput-object p2, p0, Lzendesk/support/Guide_MembersInjector;->blipsProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/support/GuideModule;",
            ">;",
            "LY94<",
            "Lzendesk/support/HelpCenterBlipsProvider;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lzendesk/support/Guide;",
            ">;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/Guide_MembersInjector;

    invoke-direct {v0, p0, p1}, Lzendesk/support/Guide_MembersInjector;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static injectBlipsProvider(Lzendesk/support/Guide;Lzendesk/support/HelpCenterBlipsProvider;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/Guide;->blipsProvider:Lzendesk/support/HelpCenterBlipsProvider;

    return-void
.end method

.method public static injectGuideModule(Lzendesk/support/Guide;Lzendesk/support/GuideModule;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/Guide;->guideModule:Lzendesk/support/GuideModule;

    return-void
.end method


# virtual methods
.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/Guide;

    invoke-virtual {p0, p1}, Lzendesk/support/Guide_MembersInjector;->injectMembers(Lzendesk/support/Guide;)V

    return-void
.end method

.method public injectMembers(Lzendesk/support/Guide;)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/Guide_MembersInjector;->guideModuleProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/GuideModule;

    invoke-static {p1, v0}, Lzendesk/support/Guide_MembersInjector;->injectGuideModule(Lzendesk/support/Guide;Lzendesk/support/GuideModule;)V

    iget-object v0, p0, Lzendesk/support/Guide_MembersInjector;->blipsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/HelpCenterBlipsProvider;

    invoke-static {p1, v0}, Lzendesk/support/Guide_MembersInjector;->injectBlipsProvider(Lzendesk/support/Guide;Lzendesk/support/HelpCenterBlipsProvider;)V

    return-void
.end method
