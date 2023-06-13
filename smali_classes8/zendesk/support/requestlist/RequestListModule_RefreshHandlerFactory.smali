.class public final Lzendesk/support/requestlist/RequestListModule_RefreshHandlerFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/requestlist/RequestListSyncHandler;",
        ">;"
    }
.end annotation


# instance fields
.field private final presenterProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/requestlist/RequestListPresenter;",
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
            "Lzendesk/support/requestlist/RequestListPresenter;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/requestlist/RequestListModule_RefreshHandlerFactory;->presenterProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/support/requestlist/RequestListModule_RefreshHandlerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/support/requestlist/RequestListPresenter;",
            ">;)",
            "Lzendesk/support/requestlist/RequestListModule_RefreshHandlerFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/requestlist/RequestListModule_RefreshHandlerFactory;

    invoke-direct {v0, p0}, Lzendesk/support/requestlist/RequestListModule_RefreshHandlerFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static refreshHandler(Ljava/lang/Object;)Lzendesk/support/requestlist/RequestListSyncHandler;
    .locals 0

    check-cast p0, Lzendesk/support/requestlist/RequestListPresenter;

    invoke-static {p0}, Lzendesk/support/requestlist/RequestListModule;->refreshHandler(Lzendesk/support/requestlist/RequestListPresenter;)Lzendesk/support/requestlist/RequestListSyncHandler;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/requestlist/RequestListSyncHandler;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/requestlist/RequestListModule_RefreshHandlerFactory;->get()Lzendesk/support/requestlist/RequestListSyncHandler;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/requestlist/RequestListSyncHandler;
    .locals 1

    iget-object v0, p0, Lzendesk/support/requestlist/RequestListModule_RefreshHandlerFactory;->presenterProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzendesk/support/requestlist/RequestListModule_RefreshHandlerFactory;->refreshHandler(Ljava/lang/Object;)Lzendesk/support/requestlist/RequestListSyncHandler;

    move-result-object v0

    return-object v0
.end method
