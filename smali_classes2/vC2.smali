.class public final LvC2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field

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
            "LiD1;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LCx4;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LAM3;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpM3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LiD1;",
            ">;",
            "LY94<",
            "LCx4;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LAM3;",
            ">;",
            "LY94<",
            "LpM3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvC2;->a:LY94;

    iput-object p2, p0, LvC2;->b:LY94;

    iput-object p3, p0, LvC2;->c:LY94;

    iput-object p4, p0, LvC2;->d:LY94;

    iput-object p5, p0, LvC2;->e:LY94;

    iput-object p6, p0, LvC2;->f:LY94;

    iput-object p7, p0, LvC2;->g:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LvC2;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LiD1;",
            ">;",
            "LY94<",
            "LCx4;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LAM3;",
            ">;",
            "LY94<",
            "LpM3;",
            ">;)",
            "LvC2;"
        }
    .end annotation

    new-instance v8, LvC2;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LvC2;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(LEa;Llh6;LiD1;LCx4;Landroid/content/Context;LAM3;LpM3;LQA2;Lcom/uber/autodispose/ScopeProvider;LxC2;Landroid/app/Activity;Le13;)LmC2;
    .locals 14

    new-instance v13, LmC2;

    move-object v0, v13

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v0 .. v12}, LmC2;-><init>(LEa;Llh6;LiD1;LCx4;Landroid/content/Context;LAM3;LpM3;LQA2;Lcom/uber/autodispose/ScopeProvider;LxC2;Landroid/app/Activity;Le13;)V

    return-object v13
.end method


# virtual methods
.method public b(LQA2;Lcom/uber/autodispose/ScopeProvider;LxC2;Landroid/app/Activity;Le13;)LmC2;
    .locals 14

    move-object v0, p0

    iget-object v1, v0, LvC2;->a:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LEa;

    iget-object v1, v0, LvC2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Llh6;

    iget-object v1, v0, LvC2;->c:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, LiD1;

    iget-object v1, v0, LvC2;->d:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, LCx4;

    iget-object v1, v0, LvC2;->e:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/content/Context;

    iget-object v1, v0, LvC2;->f:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, LAM3;

    iget-object v1, v0, LvC2;->g:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, LpM3;

    move-object v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move-object/from16 v13, p5

    invoke-static/range {v2 .. v13}, LvC2;->c(LEa;Llh6;LiD1;LCx4;Landroid/content/Context;LAM3;LpM3;LQA2;Lcom/uber/autodispose/ScopeProvider;LxC2;Landroid/app/Activity;Le13;)LmC2;

    move-result-object v1

    return-object v1
.end method
