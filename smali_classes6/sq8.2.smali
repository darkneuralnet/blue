.class public final synthetic Lsq8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc69;


# instance fields
.field public final synthetic a:LOs8;

.field public final synthetic b:LMb9;

.field public final synthetic c:Lk69;

.field public final synthetic d:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(LOs8;LMb9;Lk69;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsq8;->a:LOs8;

    iput-object p2, p0, Lsq8;->b:LMb9;

    iput-object p3, p0, Lsq8;->c:Lk69;

    iput-object p4, p0, Lsq8;->d:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final zza()LMb9;
    .locals 5

    iget-object v0, p0, Lsq8;->a:LOs8;

    iget-object v1, p0, Lsq8;->b:LMb9;

    iget-object v2, p0, Lsq8;->c:Lk69;

    iget-object v3, p0, Lsq8;->d:Ljava/util/concurrent/Executor;

    new-instance v4, Lqr8;

    invoke-direct {v4, v0, v2, v3}, Lqr8;-><init>(LOs8;Lk69;Ljava/util/concurrent/Executor;)V

    invoke-static {v4}, LKD8;->c(Lk69;)Lk69;

    move-result-object v0

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object v0

    return-object v0
.end method
