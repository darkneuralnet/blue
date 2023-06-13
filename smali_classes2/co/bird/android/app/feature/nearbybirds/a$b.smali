.class public final Lco/bird/android/app/feature/nearbybirds/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/nearbybirds/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lcom/uber/autodispose/ScopeProvider;

.field public final c:Ly23;

.field public final d:Landroid/content/ClipboardManager;

.field public final e:Lio/reactivex/E;

.field public final f:Lio/reactivex/E;

.field public final g:Lco/bird/android/app/feature/nearbybirds/a$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Landroid/content/ClipboardManager;Lcom/uber/autodispose/ScopeProvider;Ly23;Lio/reactivex/E;Lio/reactivex/E;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->g:Lco/bird/android/app/feature/nearbybirds/a$b;

    iput-object p1, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    iput-object p4, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->b:Lcom/uber/autodispose/ScopeProvider;

    iput-object p5, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->c:Ly23;

    iput-object p3, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->d:Landroid/content/ClipboardManager;

    iput-object p7, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->e:Lio/reactivex/E;

    iput-object p6, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->f:Lio/reactivex/E;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Landroid/content/ClipboardManager;Lcom/uber/autodispose/ScopeProvider;Ly23;Lio/reactivex/E;Lio/reactivex/E;LoM0;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lco/bird/android/app/feature/nearbybirds/a$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Landroid/content/ClipboardManager;Lcom/uber/autodispose/ScopeProvider;Ly23;Lio/reactivex/E;Lio/reactivex/E;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/nearbybirds/a$b;->b(Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;)Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;

    return-void
.end method

.method public final b(Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;)Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LLy;->n(Lco/bird/android/core/mvp/BaseActivity;Le13;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LLy;->p(Lco/bird/android/core/mvp/BaseActivity;LTq4;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->X2()Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, LLy;->k(Lco/bird/android/core/mvp/BaseActivity;Landroid/os/Handler;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LLy;->o(Lco/bird/android/core/mvp/BaseActivity;Lgl;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {p1, v0}, LLy;->b(Lco/bird/android/core/mvp/BaseActivity;LEa;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->z2()LEg1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEg1;

    invoke-static {p1, v0}, LLy;->g(Lco/bird/android/core/mvp/BaseActivity;LEg1;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->x1()Llh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh6;

    invoke-static {p1, v0}, LLy;->r(Lco/bird/android/core/mvp/BaseActivity;Llh6;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->s()Llg6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg6;

    invoke-static {p1, v0}, LLy;->a(Lco/bird/android/core/mvp/BaseActivity;Llg6;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->P0()Lqi1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqi1;

    invoke-static {p1, v0}, LLy;->i(Lco/bird/android/core/mvp/BaseActivity;Lqi1;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->A0()LVq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVq4;

    invoke-static {p1, v0}, LLy;->h(Lco/bird/android/core/mvp/BaseActivity;LVq4;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->i0()LjB0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LjB0;

    invoke-static {p1, v0}, LLy;->e(Lco/bird/android/core/mvp/BaseActivity;LjB0;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->y2()LFO2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFO2;

    invoke-static {p1, v0}, LLy;->l(Lco/bird/android/core/mvp/BaseActivity;LFO2;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->b0()LYR4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    invoke-static {p1, v0}, LLy;->q(Lco/bird/android/core/mvp/BaseActivity;LYR4;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->x()LaM;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LaM;

    invoke-static {p1, v0}, LLy;->c(Lco/bird/android/core/mvp/BaseActivity;LaM;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d3()LpJ;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LpJ;

    invoke-static {p1, v0}, LLy;->d(Lco/bird/android/core/mvp/BaseActivity;LpJ;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->q()Ldr4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr4;

    invoke-static {p1, v0}, LLy;->j(Lco/bird/android/core/mvp/BaseActivity;Ldr4;)V

    iget-object v0, p0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->p3()Lo21;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo21;

    invoke-static {p1, v0}, LLy;->f(Lco/bird/android/core/mvp/BaseActivity;Lo21;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/nearbybirds/a$b;->c()Lu23;

    move-result-object v0

    invoke-static {p1, v0}, Lv13;->b(Lco/bird/android/app/feature/nearbybirds/NearbyBirdsActivity;Lu23;)V

    return-object p1
.end method

.method public final c()Lu23;
    .locals 21

    move-object/from16 v0, p0

    new-instance v19, Lu23;

    move-object/from16 v1, v19

    iget-object v2, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->b3()Llp2;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llp2;

    iget-object v3, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v3}, LlG2;->d3()LpJ;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LpJ;

    iget-object v4, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v4}, LlG2;->g3()LyL;

    move-result-object v4

    invoke-static {v4}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LyL;

    iget-object v5, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v5}, LlG2;->g()Lde5;

    move-result-object v5

    invoke-static {v5}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lde5;

    iget-object v6, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v6}, LlG2;->x()LaM;

    move-result-object v6

    invoke-static {v6}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LaM;

    iget-object v7, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v7}, LlG2;->x1()Llh6;

    move-result-object v7

    invoke-static {v7}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Llh6;

    iget-object v8, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v8}, LlG2;->d0()LEa;

    move-result-object v8

    invoke-static {v8}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LEa;

    iget-object v9, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v9}, LlG2;->r()Lgl;

    move-result-object v9

    invoke-static {v9}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lgl;

    iget-object v10, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v10}, LlG2;->B1()LTq4;

    move-result-object v10

    invoke-static {v10}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LTq4;

    iget-object v11, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v11}, LlG2;->t3()Lxk6;

    move-result-object v11

    invoke-static {v11}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lxk6;

    iget-object v12, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->b:Lcom/uber/autodispose/ScopeProvider;

    iget-object v13, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->a:LlG2;

    invoke-interface {v13}, LlG2;->w2()Le13;

    move-result-object v13

    invoke-static {v13}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Le13;

    iget-object v14, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->c:Ly23;

    iget-object v15, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->d:Landroid/content/ClipboardManager;

    new-instance v17, LA13;

    move-object/from16 v16, v17

    invoke-direct/range {v17 .. v17}, LA13;-><init>()V

    move-object/from16 v20, v1

    iget-object v1, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->e:Lio/reactivex/E;

    move-object/from16 v17, v1

    iget-object v1, v0, Lco/bird/android/app/feature/nearbybirds/a$b;->f:Lio/reactivex/E;

    move-object/from16 v18, v1

    move-object/from16 v1, v20

    invoke-direct/range {v1 .. v18}, Lu23;-><init>(Llp2;LpJ;LyL;Lde5;LaM;Llh6;LEa;Lgl;LTq4;Lxk6;Lcom/uber/autodispose/ScopeProvider;Le13;Ly23;Landroid/content/ClipboardManager;LA13;Lio/reactivex/E;Lio/reactivex/E;)V

    return-object v19
.end method
