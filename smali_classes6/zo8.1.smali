.class public final synthetic Lzo8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc69;


# instance fields
.field public final synthetic a:Lqq8;

.field public final synthetic b:LMb9;

.field public final synthetic c:Lk69;

.field public final synthetic d:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(Lqq8;LMb9;Lk69;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo8;->a:Lqq8;

    iput-object p2, p0, Lzo8;->b:LMb9;

    iput-object p3, p0, Lzo8;->c:Lk69;

    iput-object p4, p0, Lzo8;->d:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final zza()LMb9;
    .locals 6

    iget-object v0, p0, Lzo8;->a:Lqq8;

    iget-object v1, p0, Lzo8;->b:LMb9;

    iget-object v2, p0, Lzo8;->c:Lk69;

    iget-object v3, p0, Lzo8;->d:Ljava/util/concurrent/Executor;

    new-instance v4, LLo8;

    invoke-direct {v4, v0}, LLo8;-><init>(Lqq8;)V

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v5

    invoke-static {v1, v4, v5}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object v1

    invoke-static {v1, v2, v3}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object v2

    new-instance v3, LIp8;

    invoke-direct {v3, v0, v1, v2}, LIp8;-><init>(Lqq8;LMb9;LMb9;)V

    invoke-static {v3}, LKD8;->c(Lk69;)Lk69;

    move-result-object v0

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {v2, v0, v1}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object v0

    return-object v0
.end method
