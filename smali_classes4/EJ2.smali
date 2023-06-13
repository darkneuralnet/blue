.class public final LEJ2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Llh6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTg6;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRp;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lef6;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ll20;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lm46;",
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

.field public final j:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
            ">;"
        }
    .end annotation
.end field

.field public final k:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final l:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LOh;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVH2;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LTg6;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LRp;",
            ">;",
            "LY94<",
            "Lef6;",
            ">;",
            "LY94<",
            "Ll20;",
            ">;",
            "LY94<",
            "Lm46;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LOh;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEJ2;->a:LVH2;

    iput-object p2, p0, LEJ2;->b:LY94;

    iput-object p3, p0, LEJ2;->c:LY94;

    iput-object p4, p0, LEJ2;->d:LY94;

    iput-object p5, p0, LEJ2;->e:LY94;

    iput-object p6, p0, LEJ2;->f:LY94;

    iput-object p7, p0, LEJ2;->g:LY94;

    iput-object p8, p0, LEJ2;->h:LY94;

    iput-object p9, p0, LEJ2;->i:LY94;

    iput-object p10, p0, LEJ2;->j:LY94;

    iput-object p11, p0, LEJ2;->k:LY94;

    iput-object p12, p0, LEJ2;->l:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LEJ2;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LTg6;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LRp;",
            ">;",
            "LY94<",
            "Lef6;",
            ">;",
            "LY94<",
            "Ll20;",
            ">;",
            "LY94<",
            "Lm46;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LOh;",
            ">;)",
            "LEJ2;"
        }
    .end annotation

    new-instance v13, LEJ2;

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

    invoke-direct/range {v0 .. v12}, LEJ2;-><init>(LVH2;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v13
.end method

.method public static c(LVH2;Landroid/content/Context;LTg6;Lgl;LRp;Lef6;Ll20;Lm46;Lwi2;LRh6;LTq4;LOh;)Llh6;
    .locals 0

    invoke-virtual/range {p0 .. p11}, LVH2;->K0(Landroid/content/Context;LTg6;Lgl;LRp;Lef6;Ll20;Lm46;Lwi2;LRh6;LTq4;LOh;)Llh6;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llh6;

    return-object p0
.end method


# virtual methods
.method public b()Llh6;
    .locals 12

    iget-object v0, p0, LEJ2;->a:LVH2;

    iget-object v1, p0, LEJ2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, LEJ2;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LTg6;

    iget-object v3, p0, LEJ2;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgl;

    iget-object v4, p0, LEJ2;->e:LY94;

    invoke-interface {v4}, LY94;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LRp;

    iget-object v5, p0, LEJ2;->f:LY94;

    invoke-interface {v5}, LY94;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lef6;

    iget-object v6, p0, LEJ2;->g:LY94;

    invoke-interface {v6}, LY94;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll20;

    iget-object v7, p0, LEJ2;->h:LY94;

    invoke-interface {v7}, LY94;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm46;

    iget-object v8, p0, LEJ2;->i:LY94;

    invoke-interface {v8}, LY94;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwi2;

    iget-object v9, p0, LEJ2;->j:LY94;

    invoke-interface {v9}, LY94;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LRh6;

    iget-object v10, p0, LEJ2;->k:LY94;

    invoke-interface {v10}, LY94;->get()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LTq4;

    iget-object v11, p0, LEJ2;->l:LY94;

    invoke-interface {v11}, LY94;->get()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LOh;

    invoke-static/range {v0 .. v11}, LEJ2;->c(LVH2;Landroid/content/Context;LTg6;Lgl;LRp;Lef6;Ll20;Lm46;Lwi2;LRh6;LTq4;LOh;)Llh6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LEJ2;->b()Llh6;

    move-result-object v0

    return-object v0
.end method
