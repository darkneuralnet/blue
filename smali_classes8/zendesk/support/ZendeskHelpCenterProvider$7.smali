.class Lzendesk/support/ZendeskHelpCenterProvider$7;
.super Lzendesk/support/ZendeskHelpCenterProvider$ZendeskCallbackSuccess;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/support/ZendeskHelpCenterProvider;->searchArticles(Lzendesk/support/HelpCenterSearch;LlI6;)V
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

.field final synthetic val$callback:LlI6;

.field final synthetic val$search:Lzendesk/support/HelpCenterSearch;


# direct methods
.method public constructor <init>(Lzendesk/support/ZendeskHelpCenterProvider;LlI6;LlI6;Lzendesk/support/HelpCenterSearch;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->this$0:Lzendesk/support/ZendeskHelpCenterProvider;

    iput-object p3, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$callback:LlI6;

    iput-object p4, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$search:Lzendesk/support/HelpCenterSearch;

    invoke-direct {p0, p2}, Lzendesk/support/ZendeskHelpCenterProvider$ZendeskCallbackSuccess;-><init>(LlI6;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/HelpCenterSettings;

    invoke-virtual {p0, p1}, Lzendesk/support/ZendeskHelpCenterProvider$7;->onSuccess(Lzendesk/support/HelpCenterSettings;)V

    return-void
.end method

.method public onSuccess(Lzendesk/support/HelpCenterSettings;)V
    .locals 13

    iget-object v0, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->this$0:Lzendesk/support/ZendeskHelpCenterProvider;

    iget-object v1, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$callback:LlI6;

    invoke-virtual {v0, v1, p1}, Lzendesk/support/ZendeskHelpCenterProvider;->sanityCheckHelpCenterSettings(LlI6;Lzendesk/support/HelpCenterSettings;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$search:Lzendesk/support/HelpCenterSearch;

    invoke-virtual {v0}, Lzendesk/support/HelpCenterSearch;->getInclude()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LlS5;->d(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const-string v0, "sections"

    const-string v3, "users"

    const-string v4, "categories"

    filled-new-array {v4, v0, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LlS5;->g([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-array v0, v2, [Ljava/lang/String;

    iget-object v3, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$search:Lzendesk/support/HelpCenterSearch;

    invoke-virtual {v3}, Lzendesk/support/HelpCenterSearch;->getInclude()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    invoke-static {v0}, LlS5;->g([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v6, v0

    iget-object v0, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$search:Lzendesk/support/HelpCenterSearch;

    invoke-virtual {v0}, Lzendesk/support/HelpCenterSearch;->getLabelNames()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LlS5;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    new-array v0, v2, [Ljava/lang/String;

    iget-object v2, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$search:Lzendesk/support/HelpCenterSearch;

    invoke-virtual {v2}, Lzendesk/support/HelpCenterSearch;->getLabelNames()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, LlS5;->g([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object v7, v0

    iget-object v0, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$search:Lzendesk/support/HelpCenterSearch;

    invoke-virtual {v0}, Lzendesk/support/HelpCenterSearch;->getLocale()Ljava/util/Locale;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->this$0:Lzendesk/support/ZendeskHelpCenterProvider;

    invoke-virtual {v0, p1}, Lzendesk/support/ZendeskHelpCenterProvider;->getLocale(Lzendesk/support/HelpCenterSettings;)Ljava/util/Locale;

    move-result-object p1

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$search:Lzendesk/support/HelpCenterSearch;

    invoke-virtual {p1}, Lzendesk/support/HelpCenterSearch;->getLocale()Ljava/util/Locale;

    move-result-object p1

    :goto_2
    move-object v5, p1

    iget-object p1, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->this$0:Lzendesk/support/ZendeskHelpCenterProvider;

    invoke-static {p1}, Lzendesk/support/ZendeskHelpCenterProvider;->access$200(Lzendesk/support/ZendeskHelpCenterProvider;)Lzendesk/support/ZendeskHelpCenterService;

    move-result-object v3

    iget-object p1, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$search:Lzendesk/support/HelpCenterSearch;

    invoke-virtual {p1}, Lzendesk/support/HelpCenterSearch;->getQuery()Ljava/lang/String;

    move-result-object v4

    iget-object p1, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$search:Lzendesk/support/HelpCenterSearch;

    invoke-virtual {p1}, Lzendesk/support/HelpCenterSearch;->getCategoryIds()Ljava/lang/String;

    move-result-object v8

    iget-object p1, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$search:Lzendesk/support/HelpCenterSearch;

    invoke-virtual {p1}, Lzendesk/support/HelpCenterSearch;->getSectionIds()Ljava/lang/String;

    move-result-object v9

    iget-object p1, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$search:Lzendesk/support/HelpCenterSearch;

    invoke-virtual {p1}, Lzendesk/support/HelpCenterSearch;->getPage()Ljava/lang/Integer;

    move-result-object v10

    iget-object p1, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$search:Lzendesk/support/HelpCenterSearch;

    invoke-virtual {p1}, Lzendesk/support/HelpCenterSearch;->getPerPage()Ljava/lang/Integer;

    move-result-object v11

    new-instance v12, Lzendesk/support/ZendeskHelpCenterProvider$7$1;

    iget-object p1, p0, Lzendesk/support/ZendeskHelpCenterProvider$7;->val$callback:LlI6;

    invoke-direct {v12, p0, p1}, Lzendesk/support/ZendeskHelpCenterProvider$7$1;-><init>(Lzendesk/support/ZendeskHelpCenterProvider$7;LlI6;)V

    invoke-virtual/range {v3 .. v12}, Lzendesk/support/ZendeskHelpCenterService;->searchArticles(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;LlI6;)V

    :cond_3
    return-void
.end method
