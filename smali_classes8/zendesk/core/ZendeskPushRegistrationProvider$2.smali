.class Lzendesk/core/ZendeskPushRegistrationProvider$2;
.super Lzendesk/core/PassThroughErrorZendeskCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/core/ZendeskPushRegistrationProvider;->unregisterDevice(LlI6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lzendesk/core/PassThroughErrorZendeskCallback<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lzendesk/core/ZendeskPushRegistrationProvider;

.field final synthetic val$callback:LlI6;

.field final synthetic val$userId:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Lzendesk/core/ZendeskPushRegistrationProvider;LlI6;Ljava/lang/Long;LlI6;)V
    .locals 0

    iput-object p1, p0, Lzendesk/core/ZendeskPushRegistrationProvider$2;->this$0:Lzendesk/core/ZendeskPushRegistrationProvider;

    iput-object p3, p0, Lzendesk/core/ZendeskPushRegistrationProvider$2;->val$userId:Ljava/lang/Long;

    iput-object p4, p0, Lzendesk/core/ZendeskPushRegistrationProvider$2;->val$callback:LlI6;

    invoke-direct {p0, p2}, Lzendesk/core/PassThroughErrorZendeskCallback;-><init>(LlI6;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lzendesk/core/ZendeskPushRegistrationProvider$2;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 2

    iget-object v0, p0, Lzendesk/core/ZendeskPushRegistrationProvider$2;->this$0:Lzendesk/core/ZendeskPushRegistrationProvider;

    invoke-static {v0}, Lzendesk/core/ZendeskPushRegistrationProvider;->access$500(Lzendesk/core/ZendeskPushRegistrationProvider;)Lzendesk/core/PushDeviceIdStorage;

    move-result-object v0

    invoke-interface {v0}, Lzendesk/core/PushDeviceIdStorage;->removeRegisteredDeviceId()V

    iget-object v0, p0, Lzendesk/core/ZendeskPushRegistrationProvider$2;->this$0:Lzendesk/core/ZendeskPushRegistrationProvider;

    invoke-static {v0}, Lzendesk/core/ZendeskPushRegistrationProvider;->access$600(Lzendesk/core/ZendeskPushRegistrationProvider;)Lzendesk/core/BlipsCoreProvider;

    move-result-object v0

    iget-object v1, p0, Lzendesk/core/ZendeskPushRegistrationProvider$2;->val$userId:Ljava/lang/Long;

    invoke-interface {v0, v1}, Lzendesk/core/BlipsCoreProvider;->corePushDisabled(Ljava/lang/Long;)V

    iget-object v0, p0, Lzendesk/core/ZendeskPushRegistrationProvider$2;->val$callback:LlI6;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LlI6;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
