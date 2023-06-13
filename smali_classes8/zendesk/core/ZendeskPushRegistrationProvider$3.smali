.class Lzendesk/core/ZendeskPushRegistrationProvider$3;
.super Lzendesk/core/PassThroughErrorZendeskCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/core/ZendeskPushRegistrationProvider;->sendPushRegistrationRequest(Lzendesk/core/PushRegistrationRequest;LlI6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzendesk/core/PassThroughErrorZendeskCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lzendesk/core/ZendeskPushRegistrationProvider;

.field final synthetic val$callback:LlI6;


# direct methods
.method public constructor <init>(Lzendesk/core/ZendeskPushRegistrationProvider;LlI6;LlI6;)V
    .locals 0

    iput-object p1, p0, Lzendesk/core/ZendeskPushRegistrationProvider$3;->this$0:Lzendesk/core/ZendeskPushRegistrationProvider;

    iput-object p3, p0, Lzendesk/core/ZendeskPushRegistrationProvider$3;->val$callback:LlI6;

    invoke-direct {p0, p2}, Lzendesk/core/PassThroughErrorZendeskCallback;-><init>(LlI6;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lzendesk/core/ZendeskPushRegistrationProvider$3;->onSuccess(Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lzendesk/core/ZendeskPushRegistrationProvider$3;->this$0:Lzendesk/core/ZendeskPushRegistrationProvider;

    invoke-static {v0, p1}, Lzendesk/core/ZendeskPushRegistrationProvider;->access$700(Lzendesk/core/ZendeskPushRegistrationProvider;Ljava/lang/String;)V

    iget-object v0, p0, Lzendesk/core/ZendeskPushRegistrationProvider$3;->val$callback:LlI6;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LlI6;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
