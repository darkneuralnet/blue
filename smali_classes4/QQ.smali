.class public final LQQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LPQ;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LoR;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LoR;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQQ;->a:LY94;

    iput-object p2, p0, LQQ;->b:LY94;

    iput-object p3, p0, LQQ;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LQQ;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LoR;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)",
            "LQQ;"
        }
    .end annotation

    new-instance v0, LQQ;

    invoke-direct {v0, p0, p1, p2}, LQQ;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LoR;LTq4;LRh6;)LPQ;
    .locals 1

    new-instance v0, LPQ;

    invoke-direct {v0, p0, p1, p2}, LPQ;-><init>(LoR;LTq4;LRh6;)V

    return-object v0
.end method


# virtual methods
.method public b()LPQ;
    .locals 3

    iget-object v0, p0, LQQ;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LoR;

    iget-object v1, p0, LQQ;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LTq4;

    iget-object v2, p0, LQQ;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LRh6;

    invoke-static {v0, v1, v2}, LQQ;->c(LoR;LTq4;LRh6;)LPQ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQQ;->b()LPQ;

    move-result-object v0

    return-object v0
.end method
