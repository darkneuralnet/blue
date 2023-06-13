.class public LbD6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LmZ5;


# instance fields
.field public final a:LSs5;

.field public final b:Landroid/os/Handler;

.field public final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, LbD6;->b:Landroid/os/Handler;

    new-instance v0, LbD6$a;

    invoke-direct {v0, p0}, LbD6$a;-><init>(LbD6;)V

    iput-object v0, p0, LbD6;->c:Ljava/util/concurrent/Executor;

    new-instance v0, LSs5;

    invoke-direct {v0, p1}, LSs5;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, LbD6;->a:LSs5;

    return-void
.end method


# virtual methods
.method public b()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, LbD6;->c:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public bridge synthetic c()LRs5;
    .locals 1

    invoke-virtual {p0}, LbD6;->d()LSs5;

    move-result-object v0

    return-object v0
.end method

.method public d()LSs5;
    .locals 1

    iget-object v0, p0, LbD6;->a:LSs5;

    return-object v0
.end method
