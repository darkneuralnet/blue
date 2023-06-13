.class Lzendesk/support/ZendeskRequestProvider$4;
.super Lzendesk/support/ZendeskCallbackSuccess;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/support/ZendeskRequestProvider;->getRequests(Ljava/lang/String;LlI6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzendesk/support/ZendeskCallbackSuccess<",
        "Lzendesk/support/SupportSdkSettings;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lzendesk/support/ZendeskRequestProvider;

.field final synthetic val$callback:LlI6;

.field final synthetic val$status:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lzendesk/support/ZendeskRequestProvider;LlI6;Ljava/lang/String;LlI6;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/ZendeskRequestProvider$4;->this$0:Lzendesk/support/ZendeskRequestProvider;

    iput-object p3, p0, Lzendesk/support/ZendeskRequestProvider$4;->val$status:Ljava/lang/String;

    iput-object p4, p0, Lzendesk/support/ZendeskRequestProvider$4;->val$callback:LlI6;

    invoke-direct {p0, p2}, Lzendesk/support/ZendeskCallbackSuccess;-><init>(LlI6;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/SupportSdkSettings;

    invoke-virtual {p0, p1}, Lzendesk/support/ZendeskRequestProvider$4;->onSuccess(Lzendesk/support/SupportSdkSettings;)V

    return-void
.end method

.method public onSuccess(Lzendesk/support/SupportSdkSettings;)V
    .locals 3

    invoke-static {p1}, Lzendesk/support/ZendeskRequestProvider;->access$700(Lzendesk/support/SupportSdkSettings;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzendesk/support/ZendeskRequestProvider$4;->this$0:Lzendesk/support/ZendeskRequestProvider;

    iget-object v1, p0, Lzendesk/support/ZendeskRequestProvider$4;->val$status:Ljava/lang/String;

    invoke-virtual {p1}, Lzendesk/support/SupportSdkSettings;->getAuthenticationType()Lzendesk/core/AuthenticationType;

    move-result-object p1

    iget-object v2, p0, Lzendesk/support/ZendeskRequestProvider$4;->val$callback:LlI6;

    invoke-static {v0, v1, p1, v2}, Lzendesk/support/ZendeskRequestProvider;->access$800(Lzendesk/support/ZendeskRequestProvider;Ljava/lang/String;Lzendesk/core/AuthenticationType;LlI6;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/support/ZendeskRequestProvider$4;->val$callback:LlI6;

    invoke-static {p1}, Lzendesk/support/ZendeskRequestProvider;->access$900(LlI6;)V

    :goto_0
    return-void
.end method
