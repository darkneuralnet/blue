.class public final Lco/bird/android/vehiclescanner/servicecenter/code/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/vehiclescanner/servicecenter/code/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/vehiclescanner/servicecenter/code/a$a$c;,
        Lco/bird/android/vehiclescanner/servicecenter/code/a$a$a;,
        Lco/bird/android/vehiclescanner/servicecenter/code/a$a$d;,
        Lco/bird/android/vehiclescanner/servicecenter/code/a$a$b;
    }
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/vehiclescanner/servicecenter/code/a$a;

.field public c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lom3;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LSM;",
            ">;"
        }
    .end annotation
.end field

.field public e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LNQ5;",
            ">;"
        }
    .end annotation
.end field

.field public f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field public h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ly3;",
            ">;"
        }
    .end annotation
.end field

.field public i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LVe1;",
            ">;"
        }
    .end annotation
.end field

.field public j:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public k:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LNe1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Ly3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->b:Lco/bird/android/vehiclescanner/servicecenter/code/a$a;

    iput-object p1, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->b(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Ly3;)V

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Ly3;LJI0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Ly3;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->c(Lco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity;)Lco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity;

    return-void
.end method

.method public final b(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Ly3;)V
    .locals 6

    new-instance v0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a$c;

    invoke-direct {v0, p1}, Lco/bird/android/vehiclescanner/servicecenter/code/a$a$c;-><init>(LlG2;)V

    iput-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->c:LY94;

    new-instance v0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a$a;

    invoke-direct {v0, p1}, Lco/bird/android/vehiclescanner/servicecenter/code/a$a$a;-><init>(LlG2;)V

    iput-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->d:LY94;

    new-instance v0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a$d;

    invoke-direct {v0, p1}, Lco/bird/android/vehiclescanner/servicecenter/code/a$a$d;-><init>(LlG2;)V

    iput-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->e:LY94;

    invoke-static {p3}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p3

    iput-object p3, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->f:LY94;

    invoke-static {p2}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->g:LY94;

    invoke-static {p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->h:LY94;

    iget-object p3, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->g:LY94;

    invoke-static {p3, p2}, LWe1;->a(LY94;LY94;)LWe1;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->i:LY94;

    new-instance v5, Lco/bird/android/vehiclescanner/servicecenter/code/a$a$b;

    invoke-direct {v5, p1}, Lco/bird/android/vehiclescanner/servicecenter/code/a$a$b;-><init>(LlG2;)V

    iput-object v5, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->j:LY94;

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->c:LY94;

    iget-object v1, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->d:LY94;

    iget-object v2, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->e:LY94;

    iget-object v3, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->f:LY94;

    iget-object v4, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->i:LY94;

    invoke-static/range {v0 .. v5}, LRe1;->a(LY94;LY94;LY94;LY94;LY94;LY94;)LRe1;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->k:LY94;

    return-void
.end method

.method public final c(Lco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity;)Lco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LLy;->n(Lco/bird/android/core/mvp/BaseActivity;Le13;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LLy;->p(Lco/bird/android/core/mvp/BaseActivity;LTq4;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->X2()Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, LLy;->k(Lco/bird/android/core/mvp/BaseActivity;Landroid/os/Handler;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LLy;->o(Lco/bird/android/core/mvp/BaseActivity;Lgl;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {p1, v0}, LLy;->b(Lco/bird/android/core/mvp/BaseActivity;LEa;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->z2()LEg1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEg1;

    invoke-static {p1, v0}, LLy;->g(Lco/bird/android/core/mvp/BaseActivity;LEg1;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->x1()Llh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh6;

    invoke-static {p1, v0}, LLy;->r(Lco/bird/android/core/mvp/BaseActivity;Llh6;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->s()Llg6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg6;

    invoke-static {p1, v0}, LLy;->a(Lco/bird/android/core/mvp/BaseActivity;Llg6;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->P0()Lqi1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqi1;

    invoke-static {p1, v0}, LLy;->i(Lco/bird/android/core/mvp/BaseActivity;Lqi1;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->A0()LVq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVq4;

    invoke-static {p1, v0}, LLy;->h(Lco/bird/android/core/mvp/BaseActivity;LVq4;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->i0()LjB0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LjB0;

    invoke-static {p1, v0}, LLy;->e(Lco/bird/android/core/mvp/BaseActivity;LjB0;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->y2()LFO2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFO2;

    invoke-static {p1, v0}, LLy;->l(Lco/bird/android/core/mvp/BaseActivity;LFO2;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->b0()LYR4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    invoke-static {p1, v0}, LLy;->q(Lco/bird/android/core/mvp/BaseActivity;LYR4;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->x()LaM;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LaM;

    invoke-static {p1, v0}, LLy;->c(Lco/bird/android/core/mvp/BaseActivity;LaM;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->d3()LpJ;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LpJ;

    invoke-static {p1, v0}, LLy;->d(Lco/bird/android/core/mvp/BaseActivity;LpJ;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->q()Ldr4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr4;

    invoke-static {p1, v0}, LLy;->j(Lco/bird/android/core/mvp/BaseActivity;Ldr4;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->a:LlG2;

    invoke-interface {v0}, LlG2;->p3()Lo21;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo21;

    invoke-static {p1, v0}, LLy;->f(Lco/bird/android/core/mvp/BaseActivity;Lo21;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/code/a$a;->k:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lse1;

    invoke-static {p1, v0}, Lre1;->b(Lco/bird/android/vehiclescanner/servicecenter/code/EnterCodeActivity;Lse1;)V

    return-object p1
.end method
