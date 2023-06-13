.class public final LhJ2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LBf1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJT0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LV74;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
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
            "LJT0;",
            ">;",
            "LY94<",
            "LV74;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LhJ2;->a:LVH2;

    iput-object p2, p0, LhJ2;->b:LY94;

    iput-object p3, p0, LhJ2;->c:LY94;

    iput-object p4, p0, LhJ2;->d:LY94;

    iput-object p5, p0, LhJ2;->e:LY94;

    iput-object p6, p0, LhJ2;->f:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;LY94;LY94;LY94;LY94;)LhJ2;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LJT0;",
            ">;",
            "LY94<",
            "LV74;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)",
            "LhJ2;"
        }
    .end annotation

    new-instance v7, LhJ2;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LhJ2;-><init>(LVH2;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(LVH2;LJT0;LV74;LTq4;LYR4;LRh6;)LBf1;
    .locals 0

    invoke-virtual/range {p0 .. p5}, LVH2;->m0(LJT0;LV74;LTq4;LYR4;LRh6;)LBf1;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LBf1;

    return-object p0
.end method


# virtual methods
.method public b()LBf1;
    .locals 6

    iget-object v0, p0, LhJ2;->a:LVH2;

    iget-object v1, p0, LhJ2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJT0;

    iget-object v2, p0, LhJ2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LV74;

    iget-object v3, p0, LhJ2;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LTq4;

    iget-object v4, p0, LhJ2;->e:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYR4;

    iget-object v5, p0, LhJ2;->f:LY94;

    invoke-interface {v5}, LY94;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LRh6;

    invoke-static/range {v0 .. v5}, LhJ2;->c(LVH2;LJT0;LV74;LTq4;LYR4;LRh6;)LBf1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LhJ2;->b()LBf1;

    move-result-object v0

    return-object v0
.end method
