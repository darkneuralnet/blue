.class public final Lzendesk/messaging/MessagingActivityModule_MultilineResponseOptionsEnabledFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final messagingComponentProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/MessagingComponent;",
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
            "Lzendesk/messaging/MessagingComponent;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingActivityModule_MultilineResponseOptionsEnabledFactory;->messagingComponentProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/messaging/MessagingActivityModule_MultilineResponseOptionsEnabledFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/messaging/MessagingComponent;",
            ">;)",
            "Lzendesk/messaging/MessagingActivityModule_MultilineResponseOptionsEnabledFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/messaging/MessagingActivityModule_MultilineResponseOptionsEnabledFactory;

    invoke-direct {v0, p0}, Lzendesk/messaging/MessagingActivityModule_MultilineResponseOptionsEnabledFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static multilineResponseOptionsEnabled(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Lzendesk/messaging/MessagingComponent;

    invoke-static {p0}, Lzendesk/messaging/MessagingActivityModule;->multilineResponseOptionsEnabled(Lzendesk/messaging/MessagingComponent;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public get()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/MessagingActivityModule_MultilineResponseOptionsEnabledFactory;->messagingComponentProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzendesk/messaging/MessagingActivityModule_MultilineResponseOptionsEnabledFactory;->multilineResponseOptionsEnabled(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/MessagingActivityModule_MultilineResponseOptionsEnabledFactory;->get()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
