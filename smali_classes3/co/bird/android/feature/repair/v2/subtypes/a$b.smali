.class public final Lco/bird/android/feature/repair/v2/subtypes/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/repair/v2/subtypes/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LNy4;

.field public final c:Lco/bird/android/core/mvp/BaseActivity;

.field public final d:Landroid/widget/TextView;

.field public final e:Landroid/widget/TextView;

.field public final f:Landroid/widget/ImageView;

.field public final g:Landroid/widget/Button;

.field public final h:Landroid/widget/Button;

.field public final i:Landroidx/recyclerview/widget/RecyclerView;

.field public final j:Lcom/uber/autodispose/ScopeProvider;

.field public final k:Lco/bird/android/feature/repair/v2/subtypes/a$b;


# direct methods
.method public constructor <init>(LlG2;LNy4;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/Button;Landroid/widget/Button;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->k:Lco/bird/android/feature/repair/v2/subtypes/a$b;

    iput-object p1, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    iput-object p2, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->b:LNy4;

    iput-object p3, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->c:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p5, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->d:Landroid/widget/TextView;

    iput-object p6, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->e:Landroid/widget/TextView;

    iput-object p7, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->f:Landroid/widget/ImageView;

    iput-object p8, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->g:Landroid/widget/Button;

    iput-object p9, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->h:Landroid/widget/Button;

    iput-object p10, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->i:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p4, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->j:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LNy4;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/Button;Landroid/widget/Button;Landroidx/recyclerview/widget/RecyclerView;LLO0;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, Lco/bird/android/feature/repair/v2/subtypes/a$b;-><init>(LlG2;LNy4;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/Button;Landroid/widget/Button;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/repair/v2/subtypes/a$b;->b(Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;)Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;

    return-void
.end method

.method public final b(Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;)Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LLy;->n(Lco/bird/android/core/mvp/BaseActivity;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LLy;->p(Lco/bird/android/core/mvp/BaseActivity;LTq4;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->X2()Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, LLy;->k(Lco/bird/android/core/mvp/BaseActivity;Landroid/os/Handler;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LLy;->o(Lco/bird/android/core/mvp/BaseActivity;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {p1, v0}, LLy;->b(Lco/bird/android/core/mvp/BaseActivity;LEa;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->z2()LEg1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEg1;

    invoke-static {p1, v0}, LLy;->g(Lco/bird/android/core/mvp/BaseActivity;LEg1;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->x1()Llh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh6;

    invoke-static {p1, v0}, LLy;->r(Lco/bird/android/core/mvp/BaseActivity;Llh6;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->s()Llg6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg6;

    invoke-static {p1, v0}, LLy;->a(Lco/bird/android/core/mvp/BaseActivity;Llg6;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->P0()Lqi1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqi1;

    invoke-static {p1, v0}, LLy;->i(Lco/bird/android/core/mvp/BaseActivity;Lqi1;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->A0()LVq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVq4;

    invoke-static {p1, v0}, LLy;->h(Lco/bird/android/core/mvp/BaseActivity;LVq4;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->i0()LjB0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LjB0;

    invoke-static {p1, v0}, LLy;->e(Lco/bird/android/core/mvp/BaseActivity;LjB0;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->y2()LFO2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFO2;

    invoke-static {p1, v0}, LLy;->l(Lco/bird/android/core/mvp/BaseActivity;LFO2;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->b0()LYR4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    invoke-static {p1, v0}, LLy;->q(Lco/bird/android/core/mvp/BaseActivity;LYR4;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->x()LaM;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LaM;

    invoke-static {p1, v0}, LLy;->c(Lco/bird/android/core/mvp/BaseActivity;LaM;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d3()LpJ;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LpJ;

    invoke-static {p1, v0}, LLy;->d(Lco/bird/android/core/mvp/BaseActivity;LpJ;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->q()Ldr4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr4;

    invoke-static {p1, v0}, LLy;->j(Lco/bird/android/core/mvp/BaseActivity;Ldr4;)V

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->p3()Lo21;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo21;

    invoke-static {p1, v0}, LLy;->f(Lco/bird/android/core/mvp/BaseActivity;Lo21;)V

    invoke-virtual {p0}, Lco/bird/android/feature/repair/v2/subtypes/a$b;->d()Lxz4;

    move-result-object v0

    invoke-static {p1, v0}, LRy4;->b(Lco/bird/android/feature/repair/v2/subtypes/RepairIssueSubtypesActivity;LYy4;)V

    return-object p1
.end method

.method public final c()LWy4;
    .locals 2

    new-instance v0, LWy4;

    iget-object v1, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, LWy4;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final d()Lxz4;
    .locals 10

    new-instance v9, Lxz4;

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->T2()LaG6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LaG6;

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->j0()Lsu2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lsu2;

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->k3()LnS1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LnS1;

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->b:LNy4;

    invoke-interface {v0}, LNy4;->a()LCy4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LCy4;

    invoke-virtual {p0}, Lco/bird/android/feature/repair/v2/subtypes/a$b;->e()LGz4;

    move-result-object v5

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Le13;

    invoke-virtual {p0}, Lco/bird/android/feature/repair/v2/subtypes/a$b;->c()LWy4;

    move-result-object v7

    iget-object v8, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->j:Lcom/uber/autodispose/ScopeProvider;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lxz4;-><init>(LaG6;Lsu2;LnS1;LCy4;LFz4;Le13;LUy4;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v9
.end method

.method public final e()LGz4;
    .locals 10

    new-instance v9, LGz4;

    iget-object v1, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->c:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v0, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->j0()Lsu2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lsu2;

    iget-object v3, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->d:Landroid/widget/TextView;

    iget-object v4, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->e:Landroid/widget/TextView;

    iget-object v5, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->f:Landroid/widget/ImageView;

    iget-object v6, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->g:Landroid/widget/Button;

    iget-object v7, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->h:Landroid/widget/Button;

    iget-object v8, p0, Lco/bird/android/feature/repair/v2/subtypes/a$b;->i:Landroidx/recyclerview/widget/RecyclerView;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, LGz4;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lsu2;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/Button;Landroid/widget/Button;Landroidx/recyclerview/widget/RecyclerView;)V

    return-object v9
.end method
