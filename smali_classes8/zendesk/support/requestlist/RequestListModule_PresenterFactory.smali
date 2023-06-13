.class public final Lzendesk/support/requestlist/RequestListModule_PresenterFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/requestlist/RequestListPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final modelProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/requestlist/RequestListModel;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lzendesk/support/requestlist/RequestListModule;


# direct methods
.method public constructor <init>(Lzendesk/support/requestlist/RequestListModule;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/requestlist/RequestListModule;",
            "LY94<",
            "Lzendesk/support/requestlist/RequestListModel;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/requestlist/RequestListModule_PresenterFactory;->module:Lzendesk/support/requestlist/RequestListModule;

    iput-object p2, p0, Lzendesk/support/requestlist/RequestListModule_PresenterFactory;->modelProvider:LY94;

    return-void
.end method

.method public static create(Lzendesk/support/requestlist/RequestListModule;LY94;)Lzendesk/support/requestlist/RequestListModule_PresenterFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzendesk/support/requestlist/RequestListModule;",
            "LY94<",
            "Lzendesk/support/requestlist/RequestListModel;",
            ">;)",
            "Lzendesk/support/requestlist/RequestListModule_PresenterFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/requestlist/RequestListModule_PresenterFactory;

    invoke-direct {v0, p0, p1}, Lzendesk/support/requestlist/RequestListModule_PresenterFactory;-><init>(Lzendesk/support/requestlist/RequestListModule;LY94;)V

    return-object v0
.end method

.method public static presenter(Lzendesk/support/requestlist/RequestListModule;Ljava/lang/Object;)Lzendesk/support/requestlist/RequestListPresenter;
    .locals 0

    check-cast p1, Lzendesk/support/requestlist/RequestListModel;

    invoke-virtual {p0, p1}, Lzendesk/support/requestlist/RequestListModule;->presenter(Lzendesk/support/requestlist/RequestListModel;)Lzendesk/support/requestlist/RequestListPresenter;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/requestlist/RequestListPresenter;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/requestlist/RequestListModule_PresenterFactory;->get()Lzendesk/support/requestlist/RequestListPresenter;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/requestlist/RequestListPresenter;
    .locals 2

    iget-object v0, p0, Lzendesk/support/requestlist/RequestListModule_PresenterFactory;->module:Lzendesk/support/requestlist/RequestListModule;

    iget-object v1, p0, Lzendesk/support/requestlist/RequestListModule_PresenterFactory;->modelProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lzendesk/support/requestlist/RequestListModule_PresenterFactory;->presenter(Lzendesk/support/requestlist/RequestListModule;Ljava/lang/Object;)Lzendesk/support/requestlist/RequestListPresenter;

    move-result-object v0

    return-object v0
.end method
