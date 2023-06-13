.class Lzendesk/support/suas/Executors;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/suas/Executors$AndroidExecutor;,
        Lzendesk/support/suas/Executors$DefaultCurrentThreadExecutor;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getAndroidExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    new-instance v0, Lzendesk/support/suas/Executors$AndroidExecutor;

    invoke-direct {v0}, Lzendesk/support/suas/Executors$AndroidExecutor;-><init>()V

    return-object v0
.end method

.method public static getDefaultExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    new-instance v0, Lzendesk/support/suas/Executors$DefaultCurrentThreadExecutor;

    invoke-direct {v0}, Lzendesk/support/suas/Executors$DefaultCurrentThreadExecutor;-><init>()V

    return-object v0
.end method
