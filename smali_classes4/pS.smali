.class public final LpS;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LgS;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LVK;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTk3;",
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
            "LbL;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJM;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Li40;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lwi2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LVK;",
            ">;",
            "LY94<",
            "LTk3;",
            ">;",
            "LY94<",
            "Lp54;",
            ">;",
            "LY94<",
            "LbL;",
            ">;",
            "LY94<",
            "LJM;",
            ">;",
            "LY94<",
            "Li40;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpS;->a:LY94;

    iput-object p2, p0, LpS;->b:LY94;

    iput-object p3, p0, LpS;->c:LY94;

    iput-object p4, p0, LpS;->d:LY94;

    iput-object p5, p0, LpS;->e:LY94;

    iput-object p6, p0, LpS;->f:LY94;

    iput-object p7, p0, LpS;->g:LY94;

    iput-object p8, p0, LpS;->h:LY94;

    iput-object p9, p0, LpS;->i:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LpS;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LVK;",
            ">;",
            "LY94<",
            "LTk3;",
            ">;",
            "LY94<",
            "Lp54;",
            ">;",
            "LY94<",
            "LbL;",
            ">;",
            "LY94<",
            "LJM;",
            ">;",
            "LY94<",
            "Li40;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;)",
            "LpS;"
        }
    .end annotation

    new-instance v10, LpS;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, LpS;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v10
.end method

.method public static c(LVK;LTk3;Lp54;LbL;LJM;Li40;LTq4;Lgl;Lwi2;)LgS;
    .locals 11

    new-instance v10, LgS;

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v9}, LgS;-><init>(LVK;LTk3;Lp54;LbL;LJM;Li40;LTq4;Lgl;Lwi2;)V

    return-object v10
.end method


# virtual methods
.method public b()LgS;
    .locals 10

    iget-object v0, p0, LpS;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LVK;

    iget-object v0, p0, LpS;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LTk3;

    iget-object v0, p0, LpS;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lp54;

    iget-object v0, p0, LpS;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LbL;

    iget-object v0, p0, LpS;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LJM;

    iget-object v0, p0, LpS;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Li40;

    iget-object v0, p0, LpS;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LTq4;

    iget-object v0, p0, LpS;->h:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lgl;

    iget-object v0, p0, LpS;->i:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lwi2;

    invoke-static/range {v1 .. v9}, LpS;->c(LVK;LTk3;Lp54;LbL;LJM;Li40;LTq4;Lgl;Lwi2;)LgS;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LpS;->b()LgS;

    move-result-object v0

    return-object v0
.end method
