.class public final LQy2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
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
            "LEp0;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
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
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LEp0;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQy2;->a:LY94;

    iput-object p2, p0, LQy2;->b:LY94;

    iput-object p3, p0, LQy2;->c:LY94;

    iput-object p4, p0, LQy2;->d:LY94;

    iput-object p5, p0, LQy2;->e:LY94;

    iput-object p6, p0, LQy2;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)LQy2;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LEp0;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;)",
            "LQy2;"
        }
    .end annotation

    new-instance v7, LQy2;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LQy2;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(Landroid/content/Context;Lgl;LEa;LTq4;LEp0;Llh6;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSy2;Le13;LDQ3;)LNy2;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lgl;",
            "LEa;",
            "LTq4;",
            "LEp0;",
            "Llh6;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LSy2;",
            "Le13;",
            "LDQ3;",
            ")",
            "LNy2;"
        }
    .end annotation

    new-instance v11, LNy2;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, LNy2;-><init>(Landroid/content/Context;Lgl;LEa;LTq4;LEp0;Llh6;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSy2;Le13;LDQ3;)V

    return-object v11
.end method


# virtual methods
.method public b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSy2;Le13;LDQ3;)LNy2;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LSy2;",
            "Le13;",
            "LDQ3;",
            ")",
            "LNy2;"
        }
    .end annotation

    iget-object v0, p0, LQy2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, LQy2;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lgl;

    iget-object v0, p0, LQy2;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LEa;

    iget-object v0, p0, LQy2;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LTq4;

    iget-object v0, p0, LQy2;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LEp0;

    iget-object v0, p0, LQy2;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Llh6;

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object v10, p4

    invoke-static/range {v1 .. v10}, LQy2;->c(Landroid/content/Context;Lgl;LEa;LTq4;LEp0;Llh6;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSy2;Le13;LDQ3;)LNy2;

    move-result-object p1

    return-object p1
.end method
