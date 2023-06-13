.class Lzendesk/support/ZendeskHelpCenterProvider$8$1;
.super Lzendesk/support/ZendeskHelpCenterProvider$ZendeskCallbackSuccess;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/support/ZendeskHelpCenterProvider$8;->onSuccess(Lzendesk/support/HelpCenterSettings;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzendesk/support/ZendeskHelpCenterProvider$ZendeskCallbackSuccess<",
        "Lzendesk/support/Article;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lzendesk/support/ZendeskHelpCenterProvider$8;


# direct methods
.method public constructor <init>(Lzendesk/support/ZendeskHelpCenterProvider$8;LlI6;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/ZendeskHelpCenterProvider$8$1;->this$1:Lzendesk/support/ZendeskHelpCenterProvider$8;

    invoke-direct {p0, p2}, Lzendesk/support/ZendeskHelpCenterProvider$ZendeskCallbackSuccess;-><init>(LlI6;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/Article;

    invoke-virtual {p0, p1}, Lzendesk/support/ZendeskHelpCenterProvider$8$1;->onSuccess(Lzendesk/support/Article;)V

    return-void
.end method

.method public onSuccess(Lzendesk/support/Article;)V
    .locals 3

    iget-object v0, p0, Lzendesk/support/ZendeskHelpCenterProvider$8$1;->this$1:Lzendesk/support/ZendeskHelpCenterProvider$8;

    iget-object v0, v0, Lzendesk/support/ZendeskHelpCenterProvider$8;->this$0:Lzendesk/support/ZendeskHelpCenterProvider;

    invoke-virtual {p1}, Lzendesk/support/Article;->getLocale()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LCv2;->c(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v1

    new-instance v2, Lzendesk/support/ZendeskHelpCenterProvider$8$1$1;

    invoke-direct {v2, p0}, Lzendesk/support/ZendeskHelpCenterProvider$8$1$1;-><init>(Lzendesk/support/ZendeskHelpCenterProvider$8$1;)V

    invoke-virtual {v0, p1, v1, v2}, Lzendesk/support/ZendeskHelpCenterProvider;->submitRecordArticleView(Lzendesk/support/Article;Ljava/util/Locale;LlI6;)V

    iget-object v0, p0, Lzendesk/support/ZendeskHelpCenterProvider$8$1;->this$1:Lzendesk/support/ZendeskHelpCenterProvider$8;

    iget-object v0, v0, Lzendesk/support/ZendeskHelpCenterProvider$8;->val$callback:LlI6;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LlI6;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
