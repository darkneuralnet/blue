.class public final LBU0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LiD1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LzN3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJT0;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
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
            "LiD1;",
            ">;",
            "LY94<",
            "LzN3;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LJT0;",
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

    iput-object p1, p0, LBU0;->a:LY94;

    iput-object p2, p0, LBU0;->b:LY94;

    iput-object p3, p0, LBU0;->c:LY94;

    iput-object p4, p0, LBU0;->d:LY94;

    iput-object p5, p0, LBU0;->e:LY94;

    iput-object p6, p0, LBU0;->f:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;)LBU0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LiD1;",
            ">;",
            "LY94<",
            "LzN3;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LJT0;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)",
            "LBU0;"
        }
    .end annotation

    new-instance v7, LBU0;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, LBU0;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v7
.end method

.method public static c(LiD1;LzN3;Llh6;LJT0;LTq4;LEa;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LCU0;Le13;Lgl;)LxU0;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LiD1;",
            "LzN3;",
            "Llh6;",
            "LJT0;",
            "LTq4;",
            "LEa;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LCU0;",
            "Le13;",
            "Lgl;",
            ")",
            "LxU0;"
        }
    .end annotation

    new-instance v12, LxU0;

    move-object v0, v12

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, LxU0;-><init>(LiD1;LzN3;Llh6;LJT0;LTq4;LEa;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LCU0;Le13;Lgl;)V

    return-object v12
.end method


# virtual methods
.method public b(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LCU0;Le13;Lgl;)LxU0;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LCU0;",
            "Le13;",
            "Lgl;",
            ")",
            "LxU0;"
        }
    .end annotation

    move-object v0, p0

    iget-object v1, v0, LBU0;->a:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LiD1;

    iget-object v1, v0, LBU0;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LzN3;

    iget-object v1, v0, LBU0;->c:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Llh6;

    iget-object v1, v0, LBU0;->d:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, LJT0;

    iget-object v1, v0, LBU0;->e:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, LTq4;

    iget-object v1, v0, LBU0;->f:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, LEa;

    move-object v8, p1

    move-object v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    invoke-static/range {v2 .. v12}, LBU0;->c(LiD1;LzN3;Llh6;LJT0;LTq4;LEa;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LCU0;Le13;Lgl;)LxU0;

    move-result-object v1

    return-object v1
.end method
