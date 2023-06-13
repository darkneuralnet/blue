.class public final Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/core/mvp/BaseActivity;

.field public final c:Landroid/widget/EditText;

.field public final d:Landroid/widget/Button;

.field public final e:Lcom/uber/autodispose/ScopeProvider;

.field public final f:Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/EditText;Landroid/widget/Button;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->f:Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;

    iput-object p1, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    iput-object p2, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->b:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->c:Landroid/widget/EditText;

    iput-object p5, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->d:Landroid/widget/Button;

    iput-object p3, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->e:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/EditText;Landroid/widget/Button;LLI0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/widget/EditText;Landroid/widget/Button;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->d(Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity;)Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity;

    return-void
.end method

.method public final b()Lph1;
    .locals 5

    new-instance v0, Lph1;

    iget-object v1, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v1}, LlG2;->z()LI82;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LI82;

    invoke-virtual {p0}, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->c()Lrh1;

    move-result-object v2

    iget-object v3, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->e:Lcom/uber/autodispose/ScopeProvider;

    iget-object v4, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v4}, LlG2;->w2()Le13;

    move-result-object v4

    invoke-static {v4}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le13;

    invoke-direct {v0, v1, v2, v3, v4}, Lph1;-><init>(LI82;Lqh1;Lcom/uber/autodispose/ScopeProvider;Le13;)V

    return-object v0
.end method

.method public final c()Lrh1;
    .locals 4

    new-instance v0, Lrh1;

    iget-object v1, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->b:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->c:Landroid/widget/EditText;

    iget-object v3, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->d:Landroid/widget/Button;

    invoke-direct {v0, v1, v2, v3}, Lrh1;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/EditText;Landroid/widget/Button;)V

    return-object v0
.end method

.method public final d(Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity;)Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LLy;->n(Lco/bird/android/core/mvp/BaseActivity;Le13;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LLy;->p(Lco/bird/android/core/mvp/BaseActivity;LTq4;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->X2()Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, LLy;->k(Lco/bird/android/core/mvp/BaseActivity;Landroid/os/Handler;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LLy;->o(Lco/bird/android/core/mvp/BaseActivity;Lgl;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {p1, v0}, LLy;->b(Lco/bird/android/core/mvp/BaseActivity;LEa;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->z2()LEg1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEg1;

    invoke-static {p1, v0}, LLy;->g(Lco/bird/android/core/mvp/BaseActivity;LEg1;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->x1()Llh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh6;

    invoke-static {p1, v0}, LLy;->r(Lco/bird/android/core/mvp/BaseActivity;Llh6;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->s()Llg6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg6;

    invoke-static {p1, v0}, LLy;->a(Lco/bird/android/core/mvp/BaseActivity;Llg6;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->P0()Lqi1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqi1;

    invoke-static {p1, v0}, LLy;->i(Lco/bird/android/core/mvp/BaseActivity;Lqi1;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->A0()LVq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVq4;

    invoke-static {p1, v0}, LLy;->h(Lco/bird/android/core/mvp/BaseActivity;LVq4;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->i0()LjB0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LjB0;

    invoke-static {p1, v0}, LLy;->e(Lco/bird/android/core/mvp/BaseActivity;LjB0;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->y2()LFO2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFO2;

    invoke-static {p1, v0}, LLy;->l(Lco/bird/android/core/mvp/BaseActivity;LFO2;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->b0()LYR4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    invoke-static {p1, v0}, LLy;->q(Lco/bird/android/core/mvp/BaseActivity;LYR4;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->x()LaM;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LaM;

    invoke-static {p1, v0}, LLy;->c(Lco/bird/android/core/mvp/BaseActivity;LaM;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->d3()LpJ;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LpJ;

    invoke-static {p1, v0}, LLy;->d(Lco/bird/android/core/mvp/BaseActivity;LpJ;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->q()Ldr4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr4;

    invoke-static {p1, v0}, LLy;->j(Lco/bird/android/core/mvp/BaseActivity;Ldr4;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->p3()Lo21;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo21;

    invoke-static {p1, v0}, LLy;->f(Lco/bird/android/core/mvp/BaseActivity;Lo21;)V

    invoke-virtual {p0}, Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/a$a;->b()Lph1;

    move-result-object v0

    invoke-static {p1, v0}, Ljh1;->b(Lco/bird/android/feature/servicecenter/inventorycount/excessinventory/ExcessInventoryActivity;Lkh1;)V

    return-object p1
.end method
