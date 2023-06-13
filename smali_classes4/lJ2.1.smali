.class public final LlJ2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LMK4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LxK4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpU4;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpM3;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVH2;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LxK4;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LpU4;",
            ">;",
            "LY94<",
            "LpM3;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlJ2;->a:LVH2;

    iput-object p2, p0, LlJ2;->b:LY94;

    iput-object p3, p0, LlJ2;->c:LY94;

    iput-object p4, p0, LlJ2;->d:LY94;

    iput-object p5, p0, LlJ2;->e:LY94;

    iput-object p6, p0, LlJ2;->f:LY94;

    iput-object p7, p0, LlJ2;->g:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;LY94;LY94;LY94;LY94;LY94;)LlJ2;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "LxK4;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LpU4;",
            ">;",
            "LY94<",
            "LpM3;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;)",
            "LlJ2;"
        }
    .end annotation

    new-instance v8, LlJ2;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LlJ2;-><init>(LVH2;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(LVH2;LxK4;Lgl;LYR4;LpU4;LpM3;LRh6;)LMK4;
    .locals 0

    invoke-virtual/range {p0 .. p6}, LVH2;->r0(LxK4;Lgl;LYR4;LpU4;LpM3;LRh6;)LMK4;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LMK4;

    return-object p0
.end method


# virtual methods
.method public b()LMK4;
    .locals 7

    iget-object v0, p0, LlJ2;->a:LVH2;

    iget-object v1, p0, LlJ2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LxK4;

    iget-object v2, p0, LlJ2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgl;

    iget-object v3, p0, LlJ2;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYR4;

    iget-object v4, p0, LlJ2;->e:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LpU4;

    iget-object v5, p0, LlJ2;->f:LY94;

    invoke-interface {v5}, LY94;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LpM3;

    iget-object v6, p0, LlJ2;->g:LY94;

    invoke-interface {v6}, LY94;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LRh6;

    invoke-static/range {v0 .. v6}, LlJ2;->c(LVH2;LxK4;Lgl;LYR4;LpU4;LpM3;LRh6;)LMK4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LlJ2;->b()LMK4;

    move-result-object v0

    return-object v0
.end method
