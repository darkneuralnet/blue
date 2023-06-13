.class public final LLz5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lhq;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LzN3;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LiD1;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LBc;",
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
            "LEa;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Lhq;",
            ">;",
            "LY94<",
            "LzN3;",
            ">;",
            "LY94<",
            "LiD1;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LBc;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLz5;->a:LY94;

    iput-object p2, p0, LLz5;->b:LY94;

    iput-object p3, p0, LLz5;->c:LY94;

    iput-object p4, p0, LLz5;->d:LY94;

    iput-object p5, p0, LLz5;->e:LY94;

    iput-object p6, p0, LLz5;->f:LY94;

    iput-object p7, p0, LLz5;->g:LY94;

    iput-object p8, p0, LLz5;->h:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LLz5;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Lhq;",
            ">;",
            "LY94<",
            "LzN3;",
            ">;",
            "LY94<",
            "LiD1;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LBc;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)",
            "LLz5;"
        }
    .end annotation

    new-instance v9, LLz5;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, LLz5;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v9
.end method

.method public static c(Lgl;Lhq;LzN3;LiD1;Llh6;LBc;LTq4;LEa;Lcom/uber/autodispose/ScopeProvider;Landroid/app/Activity;LNz5;Le13;)LHz5;
    .locals 14

    new-instance v13, LHz5;

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

    invoke-direct/range {v0 .. v12}, LHz5;-><init>(Lgl;Lhq;LzN3;LiD1;Llh6;LBc;LTq4;LEa;Lcom/uber/autodispose/ScopeProvider;Landroid/app/Activity;LNz5;Le13;)V

    return-object v13
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/ScopeProvider;Landroid/app/Activity;LNz5;Le13;)LHz5;
    .locals 14

    move-object v0, p0

    iget-object v1, v0, LLz5;->a:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lgl;

    iget-object v1, v0, LLz5;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lhq;

    iget-object v1, v0, LLz5;->c:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, LzN3;

    iget-object v1, v0, LLz5;->d:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, LiD1;

    iget-object v1, v0, LLz5;->e:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Llh6;

    iget-object v1, v0, LLz5;->f:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, LBc;

    iget-object v1, v0, LLz5;->g:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, LTq4;

    iget-object v1, v0, LLz5;->h:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, LEa;

    move-object v10, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    invoke-static/range {v2 .. v13}, LLz5;->c(Lgl;Lhq;LzN3;LiD1;Llh6;LBc;LTq4;LEa;Lcom/uber/autodispose/ScopeProvider;Landroid/app/Activity;LNz5;Le13;)LHz5;

    move-result-object v1

    return-object v1
.end method
