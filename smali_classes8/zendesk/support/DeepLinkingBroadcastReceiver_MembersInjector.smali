.class public final Lzendesk/support/DeepLinkingBroadcastReceiver_MembersInjector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lzendesk/support/DeepLinkingBroadcastReceiver;",
        ">;"
    }
.end annotation


# instance fields
.field private final registryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/DeepLinkingBroadcastReceiver_MembersInjector;->registryProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/ActionHandlerRegistry;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lzendesk/support/DeepLinkingBroadcastReceiver;",
            ">;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/DeepLinkingBroadcastReceiver_MembersInjector;

    invoke-direct {v0, p0}, Lzendesk/support/DeepLinkingBroadcastReceiver_MembersInjector;-><init>(LY94;)V

    return-object v0
.end method

.method public static injectRegistry(Lzendesk/support/DeepLinkingBroadcastReceiver;Lzendesk/core/ActionHandlerRegistry;)V
    .locals 0

    iput-object p1, p0, Lzendesk/support/DeepLinkingBroadcastReceiver;->registry:Lzendesk/core/ActionHandlerRegistry;

    return-void
.end method


# virtual methods
.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/DeepLinkingBroadcastReceiver;

    invoke-virtual {p0, p1}, Lzendesk/support/DeepLinkingBroadcastReceiver_MembersInjector;->injectMembers(Lzendesk/support/DeepLinkingBroadcastReceiver;)V

    return-void
.end method

.method public injectMembers(Lzendesk/support/DeepLinkingBroadcastReceiver;)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/DeepLinkingBroadcastReceiver_MembersInjector;->registryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/ActionHandlerRegistry;

    invoke-static {p1, v0}, Lzendesk/support/DeepLinkingBroadcastReceiver_MembersInjector;->injectRegistry(Lzendesk/support/DeepLinkingBroadcastReceiver;Lzendesk/core/ActionHandlerRegistry;)V

    return-void
.end method
