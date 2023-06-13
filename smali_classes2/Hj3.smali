.class public final LHj3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbn;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lom3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lot5;",
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
            "LCw3;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LSm;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
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
            "Lbn;",
            ">;",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "Lot5;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LCw3;",
            ">;",
            "LY94<",
            "LSm;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHj3;->a:LY94;

    iput-object p2, p0, LHj3;->b:LY94;

    iput-object p3, p0, LHj3;->c:LY94;

    iput-object p4, p0, LHj3;->d:LY94;

    iput-object p5, p0, LHj3;->e:LY94;

    iput-object p6, p0, LHj3;->f:LY94;

    iput-object p7, p0, LHj3;->g:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LHj3;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lbn;",
            ">;",
            "LY94<",
            "Lom3;",
            ">;",
            "LY94<",
            "Lot5;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LCw3;",
            ">;",
            "LY94<",
            "LSm;",
            ">;",
            "LY94<",
            "Le13;",
            ">;)",
            "LHj3;"
        }
    .end annotation

    new-instance v8, LHj3;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LHj3;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LNm3;Lbn;Lom3;Lot5;LTq4;LCw3;LSm;Le13;)LBj3;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LNm3;",
            "Lbn;",
            "Lom3;",
            "Lot5;",
            "LTq4;",
            "LCw3;",
            "LSm;",
            "Le13;",
            ")",
            "LBj3;"
        }
    .end annotation

    new-instance v10, LBj3;

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

    invoke-direct/range {v0 .. v9}, LBj3;-><init>(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LNm3;Lbn;Lom3;Lot5;LTq4;LCw3;LSm;Le13;)V

    return-object v10
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LNm3;)LBj3;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LNm3;",
            ")",
            "LBj3;"
        }
    .end annotation

    iget-object v0, p0, LHj3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lbn;

    iget-object v0, p0, LHj3;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lom3;

    iget-object v0, p0, LHj3;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lot5;

    iget-object v0, p0, LHj3;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LTq4;

    iget-object v0, p0, LHj3;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LCw3;

    iget-object v0, p0, LHj3;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, LSm;

    iget-object v0, p0, LHj3;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Le13;

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v1 .. v9}, LHj3;->c(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LNm3;Lbn;Lom3;Lot5;LTq4;LCw3;LSm;Le13;)LBj3;

    move-result-object p1

    return-object p1
.end method
