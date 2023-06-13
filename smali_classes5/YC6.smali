.class public final LYC6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrj1<",
        "LXC6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LQg1;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LFG6;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LBX5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "LY94<",
            "LQg1;",
            ">;",
            "LY94<",
            "LFG6;",
            ">;",
            "LY94<",
            "LBX5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYC6;->a:LY94;

    iput-object p2, p0, LYC6;->b:LY94;

    iput-object p3, p0, LYC6;->c:LY94;

    iput-object p4, p0, LYC6;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LYC6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "LY94<",
            "LQg1;",
            ">;",
            "LY94<",
            "LFG6;",
            ">;",
            "LY94<",
            "LBX5;",
            ">;)",
            "LYC6;"
        }
    .end annotation

    new-instance v0, LYC6;

    invoke-direct {v0, p0, p1, p2, p3}, LYC6;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/Executor;LQg1;LFG6;LBX5;)LXC6;
    .locals 1

    new-instance v0, LXC6;

    invoke-direct {v0, p0, p1, p2, p3}, LXC6;-><init>(Ljava/util/concurrent/Executor;LQg1;LFG6;LBX5;)V

    return-object v0
.end method


# virtual methods
.method public b()LXC6;
    .locals 4

    iget-object v0, p0, LYC6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, LYC6;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQg1;

    iget-object v2, p0, LYC6;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LFG6;

    iget-object v3, p0, LYC6;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LBX5;

    invoke-static {v0, v1, v2, v3}, LYC6;->c(Ljava/util/concurrent/Executor;LQg1;LFG6;LBX5;)LXC6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYC6;->b()LXC6;

    move-result-object v0

    return-object v0
.end method
