.class public final Lzendesk/support/guide/HelpCenterActivity_MembersInjector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lzendesk/support/guide/HelpCenterActivity;",
        ">;"
    }
.end annotation


# instance fields
.field private final actionHandlerRegistryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;"
        }
    .end annotation
.end field

.field private final configurationHelperProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LBx0;",
            ">;"
        }
    .end annotation
.end field

.field private final helpCenterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/HelpCenterProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final networkInfoProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/NetworkInfoProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final settingsProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/HelpCenterSettingsProvider;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/support/HelpCenterProvider;",
            ">;",
            "LY94<",
            "Lzendesk/support/HelpCenterSettingsProvider;",
            ">;",
            "LY94<",
            "Lzendesk/core/NetworkInfoProvider;",
            ">;",
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;",
            "LY94<",
            "LBx0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->helpCenterProvider:LY94;

    iput-object p2, p0, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->settingsProvider:LY94;

    iput-object p3, p0, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->networkInfoProvider:LY94;

    iput-object p4, p0, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->actionHandlerRegistryProvider:LY94;

    iput-object p5, p0, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->configurationHelperProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;LY94;LY94;)Ldagger/MembersInjector;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/support/HelpCenterProvider;",
            ">;",
            "LY94<",
            "Lzendesk/support/HelpCenterSettingsProvider;",
            ">;",
            "LY94<",
            "Lzendesk/core/NetworkInfoProvider;",
            ">;",
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;",
            "LY94<",
            "LBx0;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lzendesk/support/guide/HelpCenterActivity;",
            ">;"
        }
    .end annotation

    new-instance v6, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static injectActionHandlerRegistry(Lzendesk/support/guide/HelpCenterActivity;Lzendesk/core/ActionHandlerRegistry;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/guide/HelpCenterActivity;->actionHandlerRegistry:Lzendesk/core/ActionHandlerRegistry;

    return-void
.end method

.method public static injectConfigurationHelper(Lzendesk/support/guide/HelpCenterActivity;LBx0;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/guide/HelpCenterActivity;->configurationHelper:LBx0;

    return-void
.end method

.method public static injectHelpCenterProvider(Lzendesk/support/guide/HelpCenterActivity;Lzendesk/support/HelpCenterProvider;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/guide/HelpCenterActivity;->helpCenterProvider:Lzendesk/support/HelpCenterProvider;

    return-void
.end method

.method public static injectNetworkInfoProvider(Lzendesk/support/guide/HelpCenterActivity;Lzendesk/core/NetworkInfoProvider;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/guide/HelpCenterActivity;->networkInfoProvider:Lzendesk/core/NetworkInfoProvider;

    return-void
.end method

.method public static injectSettingsProvider(Lzendesk/support/guide/HelpCenterActivity;Lzendesk/support/HelpCenterSettingsProvider;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/guide/HelpCenterActivity;->settingsProvider:Lzendesk/support/HelpCenterSettingsProvider;

    return-void
.end method


# virtual methods
.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/guide/HelpCenterActivity;

    invoke-virtual {p0, p1}, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->injectMembers(Lzendesk/support/guide/HelpCenterActivity;)V

    return-void
.end method

.method public injectMembers(Lzendesk/support/guide/HelpCenterActivity;)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->helpCenterProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/HelpCenterProvider;

    invoke-static {p1, v0}, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->injectHelpCenterProvider(Lzendesk/support/guide/HelpCenterActivity;Lzendesk/support/HelpCenterProvider;)V

    iget-object v0, p0, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->settingsProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/HelpCenterSettingsProvider;

    invoke-static {p1, v0}, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->injectSettingsProvider(Lzendesk/support/guide/HelpCenterActivity;Lzendesk/support/HelpCenterSettingsProvider;)V

    iget-object v0, p0, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->networkInfoProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/NetworkInfoProvider;

    invoke-static {p1, v0}, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->injectNetworkInfoProvider(Lzendesk/support/guide/HelpCenterActivity;Lzendesk/core/NetworkInfoProvider;)V

    iget-object v0, p0, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->actionHandlerRegistryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/ActionHandlerRegistry;

    invoke-static {p1, v0}, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->injectActionHandlerRegistry(Lzendesk/support/guide/HelpCenterActivity;Lzendesk/core/ActionHandlerRegistry;)V

    iget-object v0, p0, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->configurationHelperProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBx0;

    invoke-static {p1, v0}, Lzendesk/support/guide/HelpCenterActivity_MembersInjector;->injectConfigurationHelper(Lzendesk/support/guide/HelpCenterActivity;LBx0;)V

    return-void
.end method
