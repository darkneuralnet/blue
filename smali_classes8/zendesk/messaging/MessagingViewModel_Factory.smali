.class public final Lzendesk/messaging/MessagingViewModel_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/messaging/MessagingViewModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final messagingModelProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/MessagingModel;",
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
            "Lzendesk/messaging/MessagingModel;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingViewModel_Factory;->messagingModelProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/messaging/MessagingViewModel_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/messaging/MessagingModel;",
            ">;)",
            "Lzendesk/messaging/MessagingViewModel_Factory;"
        }
    .end annotation

    new-instance v0, Lzendesk/messaging/MessagingViewModel_Factory;

    invoke-direct {v0, p0}, Lzendesk/messaging/MessagingViewModel_Factory;-><init>(LY94;)V

    return-object v0
.end method

.method public static newInstance(Ljava/lang/Object;)Lzendesk/messaging/MessagingViewModel;
    .locals 1

    new-instance v0, Lzendesk/messaging/MessagingViewModel;

    check-cast p0, Lzendesk/messaging/MessagingModel;

    invoke-direct {v0, p0}, Lzendesk/messaging/MessagingViewModel;-><init>(Lzendesk/messaging/MessagingModel;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/messaging/MessagingViewModel_Factory;->get()Lzendesk/messaging/MessagingViewModel;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/messaging/MessagingViewModel;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/MessagingViewModel_Factory;->messagingModelProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzendesk/messaging/MessagingViewModel_Factory;->newInstance(Ljava/lang/Object;)Lzendesk/messaging/MessagingViewModel;

    move-result-object v0

    return-object v0
.end method
