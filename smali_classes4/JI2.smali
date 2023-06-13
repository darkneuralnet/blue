.class public final LJI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LXF1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LdF1;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LiF1;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LlH1;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVH2;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LdF1;",
            ">;",
            "LY94<",
            "LiF1;",
            ">;",
            "LY94<",
            "LlH1;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJI2;->a:LVH2;

    iput-object p2, p0, LJI2;->b:LY94;

    iput-object p3, p0, LJI2;->c:LY94;

    iput-object p4, p0, LJI2;->d:LY94;

    iput-object p5, p0, LJI2;->e:LY94;

    iput-object p6, p0, LJI2;->f:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;LY94;LY94;LY94;LY94;)LJI2;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LdF1;",
            ">;",
            "LY94<",
            "LiF1;",
            ">;",
            "LY94<",
            "LlH1;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;)",
            "LJI2;"
        }
    .end annotation

    new-instance v7, LJI2;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LJI2;-><init>(LVH2;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(LVH2;Llh6;LdF1;LiF1;LlH1;Lgl;)LXF1;
    .locals 0

    invoke-virtual/range {p0 .. p5}, LVH2;->O(Llh6;LdF1;LiF1;LlH1;Lgl;)LXF1;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LXF1;

    return-object p0
.end method


# virtual methods
.method public b()LXF1;
    .locals 6

    iget-object v0, p0, LJI2;->a:LVH2;

    iget-object v1, p0, LJI2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llh6;

    iget-object v2, p0, LJI2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LdF1;

    iget-object v3, p0, LJI2;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LiF1;

    iget-object v4, p0, LJI2;->e:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LlH1;

    iget-object v5, p0, LJI2;->f:LY94;

    invoke-interface {v5}, LY94;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lgl;

    invoke-static/range {v0 .. v5}, LJI2;->c(LVH2;Llh6;LdF1;LiF1;LlH1;Lgl;)LXF1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJI2;->b()LXF1;

    move-result-object v0

    return-object v0
.end method
