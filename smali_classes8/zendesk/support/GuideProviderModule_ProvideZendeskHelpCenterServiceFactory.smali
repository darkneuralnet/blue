.class public final Lzendesk/support/GuideProviderModule_ProvideZendeskHelpCenterServiceFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/ZendeskHelpCenterService;",
        ">;"
    }
.end annotation


# instance fields
.field private final helpCenterServiceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/HelpCenterService;",
            ">;"
        }
    .end annotation
.end field

.field private final localeConverterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/ZendeskLocaleConverter;",
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
            "Lzendesk/support/HelpCenterService;",
            ">;",
            "LY94<",
            "Lzendesk/core/ZendeskLocaleConverter;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/GuideProviderModule_ProvideZendeskHelpCenterServiceFactory;->helpCenterServiceProvider:LY94;

    iput-object p2, p0, Lzendesk/support/GuideProviderModule_ProvideZendeskHelpCenterServiceFactory;->localeConverterProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;)Lzendesk/support/GuideProviderModule_ProvideZendeskHelpCenterServiceFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/support/HelpCenterService;",
            ">;",
            "LY94<",
            "Lzendesk/core/ZendeskLocaleConverter;",
            ">;)",
            "Lzendesk/support/GuideProviderModule_ProvideZendeskHelpCenterServiceFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/GuideProviderModule_ProvideZendeskHelpCenterServiceFactory;

    invoke-direct {v0, p0, p1}, Lzendesk/support/GuideProviderModule_ProvideZendeskHelpCenterServiceFactory;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static provideZendeskHelpCenterService(Ljava/lang/Object;Lzendesk/core/ZendeskLocaleConverter;)Lzendesk/support/ZendeskHelpCenterService;
    .locals 0

    check-cast p0, Lzendesk/support/HelpCenterService;

    invoke-static {p0, p1}, Lzendesk/support/GuideProviderModule;->provideZendeskHelpCenterService(Lzendesk/support/HelpCenterService;Lzendesk/core/ZendeskLocaleConverter;)Lzendesk/support/ZendeskHelpCenterService;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/ZendeskHelpCenterService;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/GuideProviderModule_ProvideZendeskHelpCenterServiceFactory;->get()Lzendesk/support/ZendeskHelpCenterService;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/ZendeskHelpCenterService;
    .locals 2

    iget-object v0, p0, Lzendesk/support/GuideProviderModule_ProvideZendeskHelpCenterServiceFactory;->helpCenterServiceProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lzendesk/support/GuideProviderModule_ProvideZendeskHelpCenterServiceFactory;->localeConverterProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/core/ZendeskLocaleConverter;

    invoke-static {v0, v1}, Lzendesk/support/GuideProviderModule_ProvideZendeskHelpCenterServiceFactory;->provideZendeskHelpCenterService(Ljava/lang/Object;Lzendesk/core/ZendeskLocaleConverter;)Lzendesk/support/ZendeskHelpCenterService;

    move-result-object v0

    return-object v0
.end method
