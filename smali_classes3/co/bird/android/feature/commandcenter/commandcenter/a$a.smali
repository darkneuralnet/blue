.class public final Lco/bird/android/feature/commandcenter/commandcenter/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/commandcenter/commandcenter/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lkn0;

.field public final c:Lco/bird/android/core/mvp/BaseActivity;

.field public final d:Lcom/google/android/material/tabs/TabLayout;

.field public final e:Landroidx/viewpager2/widget/ViewPager2;

.field public final f:Landroid/widget/Button;

.field public final g:Landroid/widget/Button;

.field public final h:Landroid/widget/LinearLayout;

.field public final i:Landroid/widget/TextView;

.field public final j:Landroid/widget/ImageView;

.field public final k:Landroidx/fragment/app/FragmentManager;

.field public final l:Landroidx/lifecycle/f;

.field public final m:Lcom/uber/autodispose/ScopeProvider;

.field public final n:Lco/bird/android/feature/commandcenter/commandcenter/a$a;


# direct methods
.method public constructor <init>(LlG2;Lkn0;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->n:Lco/bird/android/feature/commandcenter/commandcenter/a$a;

    iput-object p1, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    iput-object p2, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->b:Lkn0;

    iput-object p3, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->c:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p5, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->d:Lcom/google/android/material/tabs/TabLayout;

    iput-object p6, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->e:Landroidx/viewpager2/widget/ViewPager2;

    iput-object p7, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->f:Landroid/widget/Button;

    iput-object p8, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->g:Landroid/widget/Button;

    iput-object p9, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->h:Landroid/widget/LinearLayout;

    iput-object p10, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->i:Landroid/widget/TextView;

    iput-object p11, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->j:Landroid/widget/ImageView;

    iput-object p12, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->k:Landroidx/fragment/app/FragmentManager;

    iput-object p13, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->l:Landroidx/lifecycle/f;

    iput-object p4, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->m:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lkn0;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LSH0;)V
    .locals 0

    invoke-direct/range {p0 .. p13}, Lco/bird/android/feature/commandcenter/commandcenter/a$a;-><init>(LlG2;Lkn0;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->e(Lco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity;)Lco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity;

    return-void
.end method

.method public final b()Lvn0;
    .locals 4

    new-instance v0, Lvn0;

    iget-object v1, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->k:Landroidx/fragment/app/FragmentManager;

    iget-object v2, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->l:Landroidx/lifecycle/f;

    iget-object v3, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v3}, LlG2;->B1()LTq4;

    move-result-object v3

    invoke-static {v3}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LTq4;

    invoke-direct {v0, v1, v2, v3}, Lvn0;-><init>(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LTq4;)V

    return-object v0
.end method

.method public final c()Lmo0;
    .locals 12

    new-instance v11, Lmo0;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->F0()Lom3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lom3;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->J2()LTn0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LTn0;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->T2()LaG6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LaG6;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->b:Lkn0;

    invoke-interface {v0}, Lkn0;->a()Len0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Len0;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LEa;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->j1()Leo5;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Leo5;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LTq4;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Le13;

    invoke-virtual {p0}, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->d()Lso0;

    move-result-object v9

    iget-object v10, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->m:Lcom/uber/autodispose/ScopeProvider;

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lmo0;-><init>(Lom3;LTn0;LaG6;Len0;LEa;Leo5;LTq4;Le13;Lpo0;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v11
.end method

.method public final d()Lso0;
    .locals 11

    new-instance v10, Lso0;

    iget-object v1, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->c:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->d:Lcom/google/android/material/tabs/TabLayout;

    iget-object v3, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->e:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v4, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->f:Landroid/widget/Button;

    iget-object v5, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->g:Landroid/widget/Button;

    iget-object v6, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->h:Landroid/widget/LinearLayout;

    iget-object v7, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->i:Landroid/widget/TextView;

    iget-object v8, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->j:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->b()Lvn0;

    move-result-object v9

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lso0;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Lvn0;)V

    return-object v10
.end method

.method public final e(Lco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity;)Lco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LLy;->n(Lco/bird/android/core/mvp/BaseActivity;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LLy;->p(Lco/bird/android/core/mvp/BaseActivity;LTq4;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->X2()Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, LLy;->k(Lco/bird/android/core/mvp/BaseActivity;Landroid/os/Handler;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LLy;->o(Lco/bird/android/core/mvp/BaseActivity;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {p1, v0}, LLy;->b(Lco/bird/android/core/mvp/BaseActivity;LEa;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->z2()LEg1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEg1;

    invoke-static {p1, v0}, LLy;->g(Lco/bird/android/core/mvp/BaseActivity;LEg1;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->x1()Llh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh6;

    invoke-static {p1, v0}, LLy;->r(Lco/bird/android/core/mvp/BaseActivity;Llh6;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->s()Llg6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg6;

    invoke-static {p1, v0}, LLy;->a(Lco/bird/android/core/mvp/BaseActivity;Llg6;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->P0()Lqi1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqi1;

    invoke-static {p1, v0}, LLy;->i(Lco/bird/android/core/mvp/BaseActivity;Lqi1;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->A0()LVq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVq4;

    invoke-static {p1, v0}, LLy;->h(Lco/bird/android/core/mvp/BaseActivity;LVq4;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->i0()LjB0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LjB0;

    invoke-static {p1, v0}, LLy;->e(Lco/bird/android/core/mvp/BaseActivity;LjB0;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->y2()LFO2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFO2;

    invoke-static {p1, v0}, LLy;->l(Lco/bird/android/core/mvp/BaseActivity;LFO2;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->b0()LYR4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    invoke-static {p1, v0}, LLy;->q(Lco/bird/android/core/mvp/BaseActivity;LYR4;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->x()LaM;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LaM;

    invoke-static {p1, v0}, LLy;->c(Lco/bird/android/core/mvp/BaseActivity;LaM;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->d3()LpJ;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LpJ;

    invoke-static {p1, v0}, LLy;->d(Lco/bird/android/core/mvp/BaseActivity;LpJ;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->q()Ldr4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr4;

    invoke-static {p1, v0}, LLy;->j(Lco/bird/android/core/mvp/BaseActivity;Ldr4;)V

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->p3()Lo21;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo21;

    invoke-static {p1, v0}, LLy;->f(Lco/bird/android/core/mvp/BaseActivity;Lo21;)V

    invoke-virtual {p0}, Lco/bird/android/feature/commandcenter/commandcenter/a$a;->c()Lmo0;

    move-result-object v0

    invoke-static {p1, v0}, Ldn0;->b(Lco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity;LVn0;)V

    return-object p1
.end method
