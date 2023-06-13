.class public final LI54;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LF54;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LGI3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lp54;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LfH;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRR;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "LGI3;",
            ">;",
            "LY94<",
            "Lp54;",
            ">;",
            "LY94<",
            "LfH;",
            ">;",
            "LY94<",
            "LRR;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI54;->a:LY94;

    iput-object p2, p0, LI54;->b:LY94;

    iput-object p3, p0, LI54;->c:LY94;

    iput-object p4, p0, LI54;->d:LY94;

    iput-object p5, p0, LI54;->e:LY94;

    iput-object p6, p0, LI54;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)LI54;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "LGI3;",
            ">;",
            "LY94<",
            "Lp54;",
            ">;",
            "LY94<",
            "LfH;",
            ">;",
            "LY94<",
            "LRR;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;)",
            "LI54;"
        }
    .end annotation

    new-instance v7, LI54;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LI54;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(LRh6;LGI3;Lp54;LfH;LRR;LTq4;)LF54;
    .locals 8

    new-instance v7, LF54;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LF54;-><init>(LRh6;LGI3;Lp54;LfH;LRR;LTq4;)V

    return-object v7
.end method


# virtual methods
.method public b()LF54;
    .locals 7

    iget-object v0, p0, LI54;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LRh6;

    iget-object v0, p0, LI54;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LGI3;

    iget-object v0, p0, LI54;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lp54;

    iget-object v0, p0, LI54;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LfH;

    iget-object v0, p0, LI54;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LRR;

    iget-object v0, p0, LI54;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LTq4;

    invoke-static/range {v1 .. v6}, LI54;->c(LRh6;LGI3;Lp54;LfH;LRR;LTq4;)LF54;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI54;->b()LF54;

    move-result-object v0

    return-object v0
.end method
