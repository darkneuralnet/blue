.class Lzendesk/support/ZendeskHelpCenterProvider$16;
.super Lzendesk/support/ZendeskHelpCenterProvider$ZendeskCallbackSuccess;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/support/ZendeskHelpCenterProvider;->submitRecordArticleView(Lzendesk/support/Article;Ljava/util/Locale;LlI6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzendesk/support/ZendeskHelpCenterProvider$ZendeskCallbackSuccess<",
        "Lzendesk/support/HelpCenterSettings;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lzendesk/support/ZendeskHelpCenterProvider;

.field final synthetic val$article:Lzendesk/support/Article;

.field final synthetic val$callback:LlI6;

.field final synthetic val$locale:Ljava/util/Locale;


# direct methods
.method public constructor <init>(Lzendesk/support/ZendeskHelpCenterProvider;LlI6;LlI6;Lzendesk/support/Article;Ljava/util/Locale;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/ZendeskHelpCenterProvider$16;->this$0:Lzendesk/support/ZendeskHelpCenterProvider;

    iput-object p3, p0, Lzendesk/support/ZendeskHelpCenterProvider$16;->val$callback:LlI6;

    iput-object p4, p0, Lzendesk/support/ZendeskHelpCenterProvider$16;->val$article:Lzendesk/support/Article;

    iput-object p5, p0, Lzendesk/support/ZendeskHelpCenterProvider$16;->val$locale:Ljava/util/Locale;

    invoke-direct {p0, p2}, Lzendesk/support/ZendeskHelpCenterProvider$ZendeskCallbackSuccess;-><init>(LlI6;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/HelpCenterSettings;

    invoke-virtual {p0, p1}, Lzendesk/support/ZendeskHelpCenterProvider$16;->onSuccess(Lzendesk/support/HelpCenterSettings;)V

    return-void
.end method

.method public onSuccess(Lzendesk/support/HelpCenterSettings;)V
    .locals 5

    iget-object v0, p0, Lzendesk/support/ZendeskHelpCenterProvider$16;->this$0:Lzendesk/support/ZendeskHelpCenterProvider;

    iget-object v1, p0, Lzendesk/support/ZendeskHelpCenterProvider$16;->val$callback:LlI6;

    invoke-virtual {v0, v1, p1}, Lzendesk/support/ZendeskHelpCenterProvider;->sanityCheckHelpCenterSettings(LlI6;Lzendesk/support/HelpCenterSettings;)Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Lzendesk/support/RecordArticleViewRequest;

    iget-object v0, p0, Lzendesk/support/ZendeskHelpCenterProvider$16;->this$0:Lzendesk/support/ZendeskHelpCenterProvider;

    invoke-static {v0}, Lzendesk/support/ZendeskHelpCenterProvider;->access$300(Lzendesk/support/ZendeskHelpCenterProvider;)Lzendesk/support/HelpCenterSessionCache;

    move-result-object v0

    invoke-interface {v0}, Lzendesk/support/HelpCenterSessionCache;->getLastSearch()Lzendesk/support/LastSearch;

    move-result-object v0

    iget-object v1, p0, Lzendesk/support/ZendeskHelpCenterProvider$16;->this$0:Lzendesk/support/ZendeskHelpCenterProvider;

    invoke-static {v1}, Lzendesk/support/ZendeskHelpCenterProvider;->access$300(Lzendesk/support/ZendeskHelpCenterProvider;)Lzendesk/support/HelpCenterSessionCache;

    move-result-object v1

    invoke-interface {v1}, Lzendesk/support/HelpCenterSessionCache;->isUniqueSearchResultClick()Z

    move-result v1

    invoke-direct {p1, v0, v1}, Lzendesk/support/RecordArticleViewRequest;-><init>(Lzendesk/support/LastSearch;Z)V

    iget-object v0, p0, Lzendesk/support/ZendeskHelpCenterProvider$16;->this$0:Lzendesk/support/ZendeskHelpCenterProvider;

    invoke-static {v0}, Lzendesk/support/ZendeskHelpCenterProvider;->access$200(Lzendesk/support/ZendeskHelpCenterProvider;)Lzendesk/support/ZendeskHelpCenterService;

    move-result-object v0

    iget-object v1, p0, Lzendesk/support/ZendeskHelpCenterProvider$16;->val$article:Lzendesk/support/Article;

    invoke-virtual {v1}, Lzendesk/support/Article;->getId()Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lzendesk/support/ZendeskHelpCenterProvider$16;->val$locale:Ljava/util/Locale;

    new-instance v3, Lzendesk/support/ZendeskHelpCenterProvider$16$1;

    iget-object v4, p0, Lzendesk/support/ZendeskHelpCenterProvider$16;->val$callback:LlI6;

    invoke-direct {v3, p0, v4}, Lzendesk/support/ZendeskHelpCenterProvider$16$1;-><init>(Lzendesk/support/ZendeskHelpCenterProvider$16;LlI6;)V

    invoke-virtual {v0, v1, v2, p1, v3}, Lzendesk/support/ZendeskHelpCenterService;->submitRecordArticleView(Ljava/lang/Long;Ljava/util/Locale;Lzendesk/support/RecordArticleViewRequest;LlI6;)V

    :cond_0
    return-void
.end method
