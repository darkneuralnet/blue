.class Lzendesk/support/ZendeskRequestProvider$11;
.super LlI6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/support/ZendeskRequestProvider;->getUpdatesForDevice(LlI6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LlI6<",
        "Lzendesk/support/SupportSdkSettings;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lzendesk/support/ZendeskRequestProvider;

.field final synthetic val$callback:LlI6;


# direct methods
.method public constructor <init>(Lzendesk/support/ZendeskRequestProvider;LlI6;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/ZendeskRequestProvider$11;->this$0:Lzendesk/support/ZendeskRequestProvider;

    iput-object p2, p0, Lzendesk/support/ZendeskRequestProvider$11;->val$callback:LlI6;

    invoke-direct {p0}, LlI6;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lsg1;)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/ZendeskRequestProvider$11;->val$callback:LlI6;

    invoke-virtual {v0, p1}, LlI6;->onError(Lsg1;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/SupportSdkSettings;

    invoke-virtual {p0, p1}, Lzendesk/support/ZendeskRequestProvider$11;->onSuccess(Lzendesk/support/SupportSdkSettings;)V

    return-void
.end method

.method public onSuccess(Lzendesk/support/SupportSdkSettings;)V
    .locals 3

    invoke-virtual {p1}, Lzendesk/support/SupportSdkSettings;->isConversationsEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lzendesk/support/ZendeskRequestProvider$11;->val$callback:LlI6;

    invoke-static {p1}, Lzendesk/support/ZendeskRequestProvider;->access$900(LlI6;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lzendesk/support/ZendeskRequestProvider$11;->this$0:Lzendesk/support/ZendeskRequestProvider;

    invoke-virtual {p1}, Lzendesk/support/SupportSdkSettings;->getAuthenticationType()Lzendesk/core/AuthenticationType;

    move-result-object p1

    new-instance v1, Lzendesk/support/ZendeskRequestProvider$11$1;

    iget-object v2, p0, Lzendesk/support/ZendeskRequestProvider$11;->val$callback:LlI6;

    invoke-direct {v1, p0, v2}, Lzendesk/support/ZendeskRequestProvider$11$1;-><init>(Lzendesk/support/ZendeskRequestProvider$11;LlI6;)V

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v1}, Lzendesk/support/ZendeskRequestProvider;->access$800(Lzendesk/support/ZendeskRequestProvider;Ljava/lang/String;Lzendesk/core/AuthenticationType;LlI6;)V

    :goto_0
    return-void
.end method
