.class public final Lzendesk/support/ServiceModule_ProvidesRequestServiceFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lzendesk/support/RequestService;",
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

    iput-object p1, p0, Lzendesk/support/ServiceModule_ProvidesRequestServiceFactory;->restServiceProvider:LY94;

    return-void
.end method

.method public static create(LY94;)Lzendesk/support/ServiceModule_ProvidesRequestServiceFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lzendesk/core/RestServiceProvider;",
            ">;)",
            "Lzendesk/support/ServiceModule_ProvidesRequestServiceFactory;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/ServiceModule_ProvidesRequestServiceFactory;

    invoke-direct {v0, p0}, Lzendesk/support/ServiceModule_ProvidesRequestServiceFactory;-><init>(LY94;)V

    return-object v0
.end method

.method public static providesRequestService(Lzendesk/core/RestServiceProvider;)Lzendesk/support/RequestService;
    .locals 0

    invoke-static {p0}, Lzendesk/support/ServiceModule;->providesRequestService(Lzendesk/core/RestServiceProvider;)Lzendesk/support/RequestService;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/RequestService;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/support/ServiceModule_ProvidesRequestServiceFactory;->get()Lzendesk/support/RequestService;

    move-result-object v0

    return-object v0
.end method

.method public get()Lzendesk/support/RequestService;
    .locals 1

    iget-object v0, p0, Lzendesk/support/ServiceModule_ProvidesRequestServiceFactory;->restServiceProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/core/RestServiceProvider;

    invoke-static {v0}, Lzendesk/support/ServiceModule_ProvidesRequestServiceFactory;->providesRequestService(Lzendesk/core/RestServiceProvider;)Lzendesk/support/RequestService;

    move-result-object v0

    return-object v0
.end method
