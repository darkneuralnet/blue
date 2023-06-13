.class public final LCL4;
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
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMK4;",
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
            "LEa;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LBf1;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpU4;",
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
            "Lgl;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LMK4;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LBf1;",
            ">;",
            "LY94<",
            "LpU4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCL4;->a:LY94;

    iput-object p2, p0, LCL4;->b:LY94;

    iput-object p3, p0, LCL4;->c:LY94;

    iput-object p4, p0, LCL4;->d:LY94;

    iput-object p5, p0, LCL4;->e:LY94;

    iput-object p6, p0, LCL4;->f:LY94;

    iput-object p7, p0, LCL4;->g:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LCL4;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LMK4;",
            ">;",
            "LY94<",
            "LYR4;",
            ">;",
            "LY94<",
            "LEa;",
            ">;",
            "LY94<",
            "LBf1;",
            ">;",
            "LY94<",
            "LpU4;",
            ">;)",
            "LCL4;"
        }
    .end annotation

    new-instance v8, LCL4;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LCL4;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(Lgl;LTq4;LMK4;LYR4;LEa;LBf1;LpU4;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LGL4;Le13;LsJ4;LZr1;LUK4;)LyL4;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgl;",
            "LTq4;",
            "LMK4;",
            "LYR4;",
            "LEa;",
            "LBf1;",
            "LpU4;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LGL4;",
            "Le13;",
            "LsJ4;",
            "LZr1;",
            "LUK4;",
            ")",
            "LyL4;"
        }
    .end annotation

    new-instance v15, LyL4;

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

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

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v0 .. v14}, LyL4;-><init>(Lgl;LTq4;LMK4;LYR4;LEa;LBf1;LpU4;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LGL4;Le13;LsJ4;LZr1;LUK4;)V

    return-object v15
.end method


# virtual methods
.method public b(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LGL4;Le13;LsJ4;LZr1;LUK4;)LyL4;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LGL4;",
            "Le13;",
            "LsJ4;",
            "LZr1;",
            "LUK4;",
            ")",
            "LyL4;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, LCL4;->a:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lgl;

    iget-object v1, v0, LCL4;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LTq4;

    iget-object v1, v0, LCL4;->c:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, LMK4;

    iget-object v1, v0, LCL4;->d:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, LYR4;

    iget-object v1, v0, LCL4;->e:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, LEa;

    iget-object v1, v0, LCL4;->f:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, LBf1;

    iget-object v1, v0, LCL4;->g:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, LpU4;

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move-object/from16 v13, p5

    move-object/from16 v14, p6

    move-object/from16 v15, p7

    invoke-static/range {v2 .. v15}, LCL4;->c(Lgl;LTq4;LMK4;LYR4;LEa;LBf1;LpU4;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LGL4;Le13;LsJ4;LZr1;LUK4;)LyL4;

    move-result-object v1

    return-object v1
.end method
