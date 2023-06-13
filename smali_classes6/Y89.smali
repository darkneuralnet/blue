.class public abstract LY89;
.super LJ89;
.source "SourceFile"

# interfaces
.implements LMb9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "LJ89<",
        "TV;>;",
        "LMb9<",
        "TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LJ89;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Ljava/util/concurrent/Future;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public abstract c()LMb9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LMb9<",
            "+TV;>;"
        }
    .end annotation
.end method

.method public final o(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-virtual {p0}, LY89;->c()LMb9;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LMb9;->o(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
