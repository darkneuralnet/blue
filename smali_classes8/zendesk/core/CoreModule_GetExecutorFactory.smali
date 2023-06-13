.class public final Lzendesk/core/CoreModule_GetExecutorFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ljava/util/concurrent/Executor;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lzendesk/core/CoreModule;


# direct methods
.method public constructor <init>(Lzendesk/core/CoreModule;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/core/CoreModule_GetExecutorFactory;->module:Lzendesk/core/CoreModule;

    return-void
.end method

.method public static create(Lzendesk/core/CoreModule;)Lzendesk/core/CoreModule_GetExecutorFactory;
    .locals 1

    new-instance v0, Lzendesk/core/CoreModule_GetExecutorFactory;

    invoke-direct {v0, p0}, Lzendesk/core/CoreModule_GetExecutorFactory;-><init>(Lzendesk/core/CoreModule;)V

    return-object v0
.end method

.method public static getExecutor(Lzendesk/core/CoreModule;)Ljava/util/concurrent/Executor;
    .locals 0

    invoke-virtual {p0}, Lzendesk/core/CoreModule;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzendesk/core/CoreModule_GetExecutorFactory;->get()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lzendesk/core/CoreModule_GetExecutorFactory;->module:Lzendesk/core/CoreModule;

    invoke-static {v0}, Lzendesk/core/CoreModule_GetExecutorFactory;->getExecutor(Lzendesk/core/CoreModule;)Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method
