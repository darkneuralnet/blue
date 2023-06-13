.class public final LAY0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrj1<",
        "LzY0;",
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
            "LVv;",
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
            "LQg1;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LBX5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "LY94<",
            "LVv;",
            ">;",
            "LY94<",
            "LFG6;",
            ">;",
            "LY94<",
            "LQg1;",
            ">;",
            "LY94<",
            "LBX5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAY0;->a:LY94;

    iput-object p2, p0, LAY0;->b:LY94;

    iput-object p3, p0, LAY0;->c:LY94;

    iput-object p4, p0, LAY0;->d:LY94;

    iput-object p5, p0, LAY0;->e:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;)LAY0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "LY94<",
            "LVv;",
            ">;",
            "LY94<",
            "LFG6;",
            ">;",
            "LY94<",
            "LQg1;",
            ">;",
            "LY94<",
            "LBX5;",
            ">;)",
            "LAY0;"
        }
    .end annotation

    new-instance v6, LAY0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LAY0;-><init>(LY94;LY94;LY94;LY94;LY94;)V

    return-object v6
.end method

.method public static c(Ljava/util/concurrent/Executor;LVv;LFG6;LQg1;LBX5;)LzY0;
    .locals 7

    new-instance v6, LzY0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LzY0;-><init>(Ljava/util/concurrent/Executor;LVv;LFG6;LQg1;LBX5;)V

    return-object v6
.end method


# virtual methods
.method public b()LzY0;
    .locals 5

    iget-object v0, p0, LAY0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, LAY0;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LVv;

    iget-object v2, p0, LAY0;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LFG6;

    iget-object v3, p0, LAY0;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LQg1;

    iget-object v4, p0, LAY0;->e:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBX5;

    invoke-static {v0, v1, v2, v3, v4}, LAY0;->c(Ljava/util/concurrent/Executor;LVv;LFG6;LQg1;LBX5;)LzY0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LAY0;->b()LzY0;

    move-result-object v0

    return-object v0
.end method
