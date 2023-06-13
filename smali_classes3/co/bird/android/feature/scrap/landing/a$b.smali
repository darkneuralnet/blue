.class public final Lco/bird/android/feature/scrap/landing/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/scrap/landing/ScrapLandingActivity$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/scrap/landing/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LDQ3;

.field public final c:Lco/bird/android/widget/OperatorInfoCard;

.field public final d:Lco/bird/android/widget/BlockingEnterLocationView;

.field public final e:Lco/bird/android/core/mvp/BaseActivity;

.field public final f:Landroid/widget/Button;

.field public final g:Landroid/widget/Button;

.field public final h:Lcom/uber/autodispose/ScopeProvider;

.field public final i:Lco/bird/android/feature/scrap/landing/a$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LDQ3;Landroid/widget/Button;Landroid/widget/Button;Lco/bird/android/widget/OperatorInfoCard;Lco/bird/android/widget/BlockingEnterLocationView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/scrap/landing/a$b;->i:Lco/bird/android/feature/scrap/landing/a$b;

    iput-object p1, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    iput-object p4, p0, Lco/bird/android/feature/scrap/landing/a$b;->b:LDQ3;

    iput-object p7, p0, Lco/bird/android/feature/scrap/landing/a$b;->c:Lco/bird/android/widget/OperatorInfoCard;

    iput-object p8, p0, Lco/bird/android/feature/scrap/landing/a$b;->d:Lco/bird/android/widget/BlockingEnterLocationView;

    iput-object p2, p0, Lco/bird/android/feature/scrap/landing/a$b;->e:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p5, p0, Lco/bird/android/feature/scrap/landing/a$b;->f:Landroid/widget/Button;

    iput-object p6, p0, Lco/bird/android/feature/scrap/landing/a$b;->g:Landroid/widget/Button;

    iput-object p3, p0, Lco/bird/android/feature/scrap/landing/a$b;->h:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LDQ3;Landroid/widget/Button;Landroid/widget/Button;Lco/bird/android/widget/OperatorInfoCard;Lco/bird/android/widget/BlockingEnterLocationView;LmQ0;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lco/bird/android/feature/scrap/landing/a$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LDQ3;Landroid/widget/Button;Landroid/widget/Button;Lco/bird/android/widget/OperatorInfoCard;Lco/bird/android/widget/BlockingEnterLocationView;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/scrap/landing/ScrapLandingActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/scrap/landing/a$b;->b(Lco/bird/android/feature/scrap/landing/ScrapLandingActivity;)Lco/bird/android/feature/scrap/landing/ScrapLandingActivity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/scrap/landing/ScrapLandingActivity;)Lco/bird/android/feature/scrap/landing/ScrapLandingActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LLy;->n(Lco/bird/android/core/mvp/BaseActivity;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LLy;->p(Lco/bird/android/core/mvp/BaseActivity;LTq4;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->X2()Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, LLy;->k(Lco/bird/android/core/mvp/BaseActivity;Landroid/os/Handler;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LLy;->o(Lco/bird/android/core/mvp/BaseActivity;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {p1, v0}, LLy;->b(Lco/bird/android/core/mvp/BaseActivity;LEa;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->z2()LEg1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEg1;

    invoke-static {p1, v0}, LLy;->g(Lco/bird/android/core/mvp/BaseActivity;LEg1;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->x1()Llh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh6;

    invoke-static {p1, v0}, LLy;->r(Lco/bird/android/core/mvp/BaseActivity;Llh6;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->s()Llg6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg6;

    invoke-static {p1, v0}, LLy;->a(Lco/bird/android/core/mvp/BaseActivity;Llg6;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->P0()Lqi1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqi1;

    invoke-static {p1, v0}, LLy;->i(Lco/bird/android/core/mvp/BaseActivity;Lqi1;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->A0()LVq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVq4;

    invoke-static {p1, v0}, LLy;->h(Lco/bird/android/core/mvp/BaseActivity;LVq4;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->i0()LjB0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LjB0;

    invoke-static {p1, v0}, LLy;->e(Lco/bird/android/core/mvp/BaseActivity;LjB0;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->y2()LFO2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFO2;

    invoke-static {p1, v0}, LLy;->l(Lco/bird/android/core/mvp/BaseActivity;LFO2;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->b0()LYR4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    invoke-static {p1, v0}, LLy;->q(Lco/bird/android/core/mvp/BaseActivity;LYR4;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->x()LaM;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LaM;

    invoke-static {p1, v0}, LLy;->c(Lco/bird/android/core/mvp/BaseActivity;LaM;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d3()LpJ;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LpJ;

    invoke-static {p1, v0}, LLy;->d(Lco/bird/android/core/mvp/BaseActivity;LpJ;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->q()Ldr4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr4;

    invoke-static {p1, v0}, LLy;->j(Lco/bird/android/core/mvp/BaseActivity;Ldr4;)V

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->p3()Lo21;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo21;

    invoke-static {p1, v0}, LLy;->f(Lco/bird/android/core/mvp/BaseActivity;Lo21;)V

    invoke-virtual {p0}, Lco/bird/android/feature/scrap/landing/a$b;->c()LZn5;

    move-result-object v0

    invoke-static {p1, v0}, LPn5;->b(Lco/bird/android/feature/scrap/landing/ScrapLandingActivity;LQn5;)V

    return-object p1
.end method

.method public final c()LZn5;
    .locals 9

    new-instance v8, LZn5;

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->Y()LGt5;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LGt5;

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->j1()Leo5;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Leo5;

    iget-object v3, p0, Lco/bird/android/feature/scrap/landing/a$b;->b:LDQ3;

    invoke-virtual {p0}, Lco/bird/android/feature/scrap/landing/a$b;->d()Ldo5;

    move-result-object v4

    iget-object v5, p0, Lco/bird/android/feature/scrap/landing/a$b;->h:Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Le13;

    invoke-virtual {p0}, Lco/bird/android/feature/scrap/landing/a$b;->e()Liy6;

    move-result-object v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LZn5;-><init>(LGt5;Leo5;LDQ3;Lco5;Lcom/uber/autodispose/ScopeProvider;Le13;Liy6;)V

    return-object v8
.end method

.method public final d()Ldo5;
    .locals 7

    new-instance v6, Ldo5;

    iget-object v1, p0, Lco/bird/android/feature/scrap/landing/a$b;->c:Lco/bird/android/widget/OperatorInfoCard;

    iget-object v2, p0, Lco/bird/android/feature/scrap/landing/a$b;->d:Lco/bird/android/widget/BlockingEnterLocationView;

    iget-object v3, p0, Lco/bird/android/feature/scrap/landing/a$b;->e:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v4, p0, Lco/bird/android/feature/scrap/landing/a$b;->f:Landroid/widget/Button;

    iget-object v5, p0, Lco/bird/android/feature/scrap/landing/a$b;->g:Landroid/widget/Button;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ldo5;-><init>(Lco/bird/android/widget/OperatorInfoCard;Lco/bird/android/widget/BlockingEnterLocationView;Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/Button;Landroid/widget/Button;)V

    return-object v6
.end method

.method public final e()Liy6;
    .locals 7

    new-instance v6, Liy6;

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->x1()Llh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Llh6;

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->K2()LSy6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LSy6;

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LTq4;

    iget-object v4, p0, Lco/bird/android/feature/scrap/landing/a$b;->h:Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, Lco/bird/android/feature/scrap/landing/a$b;->a:LlG2;

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
