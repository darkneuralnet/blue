.class public final Lzendesk/core/ZendeskApplicationModule_ProvideExecutorFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/core/ZendeskApplicationModule_ProvideExecutorFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ljava/util/concurrent/ScheduledExecutorService;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lzendesk/core/ZendeskApplicationModule_ProvideExecutorFactory;
    .locals 1

    invoke-static {}, Lzendesk/core/ZendeskApplicationModule_ProvideExecutorFactory$InstanceHolder;->access$000()Lzendesk/core/ZendeskApplicationModule_ProvideExecutorFactory;

    move-result-object v0

    return-object v0
.end method

.method public static provideExecutor()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    invoke-static {}, Lzendesk/core/ZendeskApplicationModule;->provideExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-static {v0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/ZendeskApplicationModule_ProvideExecutorFactory;->get()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    invoke-static {}, Lzendesk/core/ZendeskApplicationModule_ProvideExecutorFactory;->provideExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method
