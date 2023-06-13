.class public final Lzendesk/support/request/RequestModule_ProvidesAttachmentDownloaderComponentFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/request/AttachmentDownloaderComponent;",
        ">;"
    }
.end annotation


# instance fields
.field private final actionFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/request/ActionFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final attachmentDownloaderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/request/AttachmentDownloaderComponent$AttachmentDownloader;",
            ">;"
        }
    .end annotation
.end field

.field private final dispatcherProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/support/suas/Dispatcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/support/suas/Dispatcher;",
            ">;",
            "LY94<",
            "Lzendesk/support/request/ActionFactory;",
            ">;",
            "LY94<",
            "Lzendesk/support/request/AttachmentDownloaderComponent$AttachmentDownloader;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/RequestModule_ProvidesAttachmentDownloaderComponentFactory;->dispatcherProvider:LY94;

    iput-object p2, p0, Lzendesk/support/request/RequestModule_ProvidesAttachmentDownloaderComponentFactory;->actionFactoryProvider:LY94;

    iput-object p3, p0, Lzendesk/support/request/RequestModule_ProvidesAttachmentDownloaderComponentFactory;->attachmentDownloaderProvider:LY94;

    return-void
.end method

.method public static create(LY94;LY94;LY94;)Lzendesk/support/request/RequestModule_ProvidesAttachmentDownloaderComponentFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/support/suas/Dispatcher;",
            ">;",
            "LY94<",
            "Lzendesk/support/request/ActionFactory;",
            ">;",
            "LY94<",
            "Lzendesk/support/request/AttachmentDownloaderComponent$AttachmentDownloader;",
            ">;)",
            "Lzendesk/support/request/RequestModule_ProvidesAttachmentDownloaderComponentFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/request/RequestModule_ProvidesAttachmentDownloaderComponentFactory;

    invoke-direct {v0, p0, p1, p2}, Lzendesk/support/request/RequestModule_ProvidesAttachmentDownloaderComponentFactory;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static providesAttachmentDownloaderComponent(Lzendesk/support/suas/Dispatcher;Ljava/lang/Object;Ljava/lang/Object;)Lzendesk/support/request/AttachmentDownloaderComponent;
    .locals 0

    check-cast p1, Lzendesk/support/request/ActionFactory;

    check-cast p2, Lzendesk/support/request/AttachmentDownloaderComponent$AttachmentDownloader;

    invoke-static {p0, p1, p2}, Lzendesk/support/request/RequestModule;->providesAttachmentDownloaderComponent(Lzendesk/support/suas/Dispatcher;Lzendesk/support/request/ActionFactory;Lzendesk/support/request/AttachmentDownloaderComponent$AttachmentDownloader;)Lzendesk/support/request/AttachmentDownloaderComponent;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/request/AttachmentDownloaderComponent;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/request/RequestModule_ProvidesAttachmentDownloaderComponentFactory;->get()Lzendesk/support/request/AttachmentDownloaderComponent;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/request/AttachmentDownloaderComponent;
    .locals 3

    iget-object v0, p0, Lzendesk/support/request/RequestModule_ProvidesAttachmentDownloaderComponentFactory;->dispatcherProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/suas/Dispatcher;

    iget-object v1, p0, Lzendesk/support/request/RequestModule_ProvidesAttachmentDownloaderComponentFactory;->actionFactoryProvider:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lzendesk/support/request/RequestModule_ProvidesAttachmentDownloaderComponentFactory;->attachmentDownloaderProvider:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lzendesk/support/request/RequestModule_ProvidesAttachmentDownloaderComponentFactory;->providesAttachmentDownloaderComponent(Lzendesk/support/suas/Dispatcher;Ljava/lang/Object;Ljava/lang/Object;)Lzendesk/support/request/AttachmentDownloaderComponent;

    move-result-object v0

    return-object v0
.end method
