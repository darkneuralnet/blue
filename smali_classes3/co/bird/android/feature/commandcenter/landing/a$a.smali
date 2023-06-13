.class public final Lco/bird/android/feature/commandcenter/landing/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/commandcenter/landing/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lcom/uber/autodispose/ScopeProvider;

.field public final c:Lco/bird/android/core/mvp/BaseActivity;

.field public final d:Lco/bird/android/widget/OperatorInfoCard;

.field public final e:Lco/bird/android/widget/BlockingEnterLocationView;

.field public final f:Landroid/widget/Button;

.field public final g:Lco/bird/android/vehiclescanner/views/CodeScanningView;

.field public final h:Landroid/widget/EditText;

.field public final i:Lkn0;

.field public final j:Lco/bird/android/feature/commandcenter/landing/a$a;


# direct methods
.method public constructor <init>(LlG2;Lkn0;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/widget/OperatorInfoCard;Lco/bird/android/widget/BlockingEnterLocationView;Landroid/widget/Button;Lco/bird/android/vehiclescanner/views/CodeScanningView;Landroid/widget/EditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->j:Lco/bird/android/feature/commandcenter/landing/a$a;

    iput-object p1, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    iput-object p4, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->b:Lcom/uber/autodispose/ScopeProvider;

    iput-object p3, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->c:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p5, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->d:Lco/bird/android/widget/OperatorInfoCard;

    iput-object p6, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->e:Lco/bird/android/widget/BlockingEnterLocationView;

    iput-object p7, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->f:Landroid/widget/Button;

    iput-object p8, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->g:Lco/bird/android/vehiclescanner/views/CodeScanningView;

    iput-object p9, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->h:Landroid/widget/EditText;

    iput-object p2, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->i:Lkn0;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lkn0;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/widget/OperatorInfoCard;Lco/bird/android/widget/BlockingEnterLocationView;Landroid/widget/Button;Lco/bird/android/vehiclescanner/views/CodeScanningView;Landroid/widget/EditText;LaI0;)V
    .locals 0

    invoke-direct/range {p0 .. p9}, Lco/bird/android/feature/commandcenter/landing/a$a;-><init>(LlG2;Lkn0;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/widget/OperatorInfoCard;Lco/bird/android/widget/BlockingEnterLocationView;Landroid/widget/Button;Lco/bird/android/vehiclescanner/views/CodeScanningView;Landroid/widget/EditText;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/commandcenter/landing/a$a;->d(Lco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity;)Lco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity;

    return-void
.end method

.method public final b()LOn0;
    .locals 11

    new-instance v10, LOn0;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LTq4;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->q()Ldr4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ldr4;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->C0()LSM;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LSM;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->F0()Lom3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lom3;

    invoke-virtual {p0}, Lco/bird/android/feature/commandcenter/landing/a$a;->e()Liy6;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/feature/commandcenter/landing/a$a;->c()LSn0;

    move-result-object v6

    iget-object v7, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->b:Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Le13;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->i:Lkn0;

    invoke-interface {v0}, Lkn0;->a()Len0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Len0;

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, LOn0;-><init>(LTq4;Ldr4;LSM;Lom3;Liy6;LQn0;Lcom/uber/autodispose/ScopeProvider;Le13;Len0;)V

    return-object v10
.end method

.method public final c()LSn0;
    .locals 8

    new-instance v7, LSn0;

    iget-object v1, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->c:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->d:Lco/bird/android/widget/OperatorInfoCard;

    iget-object v3, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->e:Lco/bird/android/widget/BlockingEnterLocationView;

    iget-object v4, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->f:Landroid/widget/Button;

    iget-object v5, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->g:Lco/bird/android/vehiclescanner/views/CodeScanningView;

    iget-object v6, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->h:Landroid/widget/EditText;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LSn0;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/OperatorInfoCard;Lco/bird/android/widget/BlockingEnterLocationView;Landroid/widget/Button;Lco/bird/android/vehiclescanner/views/CodeScanningView;Landroid/widget/EditText;)V

    return-object v7
.end method

.method public final d(Lco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity;)Lco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LLy;->n(Lco/bird/android/core/mvp/BaseActivity;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LLy;->p(Lco/bird/android/core/mvp/BaseActivity;LTq4;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->X2()Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, LLy;->k(Lco/bird/android/core/mvp/BaseActivity;Landroid/os/Handler;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LLy;->o(Lco/bird/android/core/mvp/BaseActivity;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {p1, v0}, LLy;->b(Lco/bird/android/core/mvp/BaseActivity;LEa;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->z2()LEg1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEg1;

    invoke-static {p1, v0}, LLy;->g(Lco/bird/android/core/mvp/BaseActivity;LEg1;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->x1()Llh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh6;

    invoke-static {p1, v0}, LLy;->r(Lco/bird/android/core/mvp/BaseActivity;Llh6;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->s()Llg6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg6;

    invoke-static {p1, v0}, LLy;->a(Lco/bird/android/core/mvp/BaseActivity;Llg6;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->P0()Lqi1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqi1;

    invoke-static {p1, v0}, LLy;->i(Lco/bird/android/core/mvp/BaseActivity;Lqi1;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->A0()LVq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVq4;

    invoke-static {p1, v0}, LLy;->h(Lco/bird/android/core/mvp/BaseActivity;LVq4;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->i0()LjB0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LjB0;

    invoke-static {p1, v0}, LLy;->e(Lco/bird/android/core/mvp/BaseActivity;LjB0;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->y2()LFO2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFO2;

    invoke-static {p1, v0}, LLy;->l(Lco/bird/android/core/mvp/BaseActivity;LFO2;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->b0()LYR4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    invoke-static {p1, v0}, LLy;->q(Lco/bird/android/core/mvp/BaseActivity;LYR4;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->x()LaM;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LaM;

    invoke-static {p1, v0}, LLy;->c(Lco/bird/android/core/mvp/BaseActivity;LaM;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->d3()LpJ;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LpJ;

    invoke-static {p1, v0}, LLy;->d(Lco/bird/android/core/mvp/BaseActivity;LpJ;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->q()Ldr4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr4;

    invoke-static {p1, v0}, LLy;->j(Lco/bird/android/core/mvp/BaseActivity;Ldr4;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->p3()Lo21;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo21;

    invoke-static {p1, v0}, LLy;->f(Lco/bird/android/core/mvp/BaseActivity;Lo21;)V

    invoke-virtual {p0}, Lco/bird/android/feature/commandcenter/landing/a$a;->b()LOn0;

    move-result-object v0

    invoke-static {p1, v0}, Lwn0;->b(Lco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity;Lxn0;)V

    return-object p1
.end method

.method public final e()Liy6;
    .locals 7

    new-instance v6, Liy6;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->x1()Llh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Llh6;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->K2()LSy6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LSy6;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LTq4;

    iget-object v4, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->b:Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/landing/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le13;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Liy6;-><init>(Llh6;LSy6;LTq4;Lcom/uber/autodispose/ScopeProvider;Le13;)V

    return-object v6
.end method
