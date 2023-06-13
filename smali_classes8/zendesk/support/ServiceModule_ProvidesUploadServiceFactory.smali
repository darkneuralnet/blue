.class public final Lzendesk/support/ServiceModule_ProvidesUploadServiceFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/UploadService;",
        ">;"
    }
.end annotation


# instance fields
.field private final restServiceProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/core/RestServiceProvider;",
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
            "Lzendesk/core/RestServiceProvider;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/ServiceModule_ProvidesUploadServiceFactory;->restServiceProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/support/ServiceModule_ProvidesUploadServiceFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/RestServiceProvider;",
            ">;)",
            "Lzendesk/support/ServiceModule_ProvidesUploadServiceFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/ServiceModule_ProvidesUploadServiceFactory;

    invoke-direct {v0, p0}, Lzendesk/support/ServiceModule_ProvidesUploadServiceFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static providesUploadService(Lzendesk/core/RestServiceProvider;)Lzendesk/support/UploadService;
    .locals 0

    invoke-static {p0}, Lzendesk/support/ServiceModule;->providesUploadService(Lzendesk/core/RestServiceProvider;)Lzendesk/support/UploadService;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/UploadService;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/ServiceModule_ProvidesUploadServiceFactory;->get()Lzendesk/support/UploadService;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/UploadService;
    .locals 1

    iget-object v0, p0, Lzendesk/support/ServiceModule_ProvidesUploadServiceFactory;->restServiceProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/RestServiceProvider;

    invoke-static {v0}, Lzendesk/support/ServiceModule_ProvidesUploadServiceFactory;->providesUploadService(Lzendesk/core/RestServiceProvider;)Lzendesk/support/UploadService;

    move-result-object v0

    return-object v0
.end method
