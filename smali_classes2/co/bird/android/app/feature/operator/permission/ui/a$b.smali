.class public final Lco/bird/android/app/feature/operator/permission/ui/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/operator/permission/ui/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/operator/permission/ui/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/operator/permission/ui/a$b$a;,
        Lco/bird/android/app/feature/operator/permission/ui/a$b$c;,
        Lco/bird/android/app/feature/operator/permission/ui/a$b$b;
    }
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/app/feature/operator/permission/ui/a$b;

.field public c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LuQ3;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;>;"
        }
    .end annotation
.end field

.field public e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field public f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ly4;",
            ">;"
        }
    .end annotation
.end field

.field public g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LfR3;",
            ">;"
        }
    .end annotation
.end field

.field public h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public j:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LDQ3;",
            ">;"
        }
    .end annotation
.end field

.field public k:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;",
            ">;"
        }
    .end annotation
.end field

.field public l:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public m:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;",
            ">;"
        }
    .end annotation
.end field

.field public n:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public o:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LaR3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Ly4;LDQ3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Ly4;",
            "LDQ3;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->b:Lco/bird/android/app/feature/operator/permission/ui/a$b;

    iput-object p1, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-virtual/range {p0 .. p5}, Lco/bird/android/app/feature/operator/permission/ui/a$b;->c(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Ly4;LDQ3;)V

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Ly4;LDQ3;LTM0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lco/bird/android/app/feature/operator/permission/ui/a$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Ly4;LDQ3;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/operator/permission/ui/a$b;->d(Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;)Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;

    return-void
.end method

.method public final b()Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;

    iget-object v1, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->M()LuQ3;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LuQ3;

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;-><init>(LuQ3;)V

    return-object v0
.end method

.method public final c(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Ly4;LDQ3;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Ly4;",
            "LDQ3;",
            ")V"
        }
    .end annotation

    new-instance v0, Lco/bird/android/app/feature/operator/permission/ui/a$b$a;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/operator/permission/ui/a$b$a;-><init>(LlG2;)V

    iput-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->c:LY94;

    invoke-static {p3}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p3

    iput-object p3, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->d:LY94;

    invoke-static {p2}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->e:LY94;

    invoke-static {p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->f:LY94;

    iget-object p3, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->e:LY94;

    invoke-static {p3, p2}, LgR3;->a(LY94;LY94;)LgR3;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->g:LY94;

    new-instance p2, Lco/bird/android/app/feature/operator/permission/ui/a$b$c;

    invoke-direct {p2, p1}, Lco/bird/android/app/feature/operator/permission/ui/a$b$c;-><init>(LlG2;)V

    iput-object p2, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->h:LY94;

    new-instance p2, Lco/bird/android/app/feature/operator/permission/ui/a$b$b;

    invoke-direct {p2, p1}, Lco/bird/android/app/feature/operator/permission/ui/a$b$b;-><init>(LlG2;)V

    iput-object p2, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->i:LY94;

    invoke-static {p5}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->j:LY94;

    iget-object p1, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->c:LY94;

    invoke-static {p1}, LgX;->a(LY94;)LgX;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->k:LY94;

    invoke-static {p1}, LDq3;->b(LY94;)LDq3;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->l:LY94;

    iget-object p1, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->c:LY94;

    invoke-static {p1}, LWv2;->a(LY94;)LWv2;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->m:LY94;

    invoke-static {p1}, LEq3;->a(LY94;)LEq3;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object v7

    iput-object v7, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->n:LY94;

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->c:LY94;

    iget-object v1, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->d:LY94;

    iget-object v2, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->g:LY94;

    iget-object v3, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->h:LY94;

    iget-object v4, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->i:LY94;

    iget-object v5, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->j:LY94;

    iget-object v6, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->l:LY94;

    invoke-static/range {v0 .. v7}, LbR3;->a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LbR3;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->o:LY94;

    return-void
.end method

.method public final d(Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;)Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LLy;->n(Lco/bird/android/core/mvp/BaseActivity;Le13;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LLy;->p(Lco/bird/android/core/mvp/BaseActivity;LTq4;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->X2()Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, LLy;->k(Lco/bird/android/core/mvp/BaseActivity;Landroid/os/Handler;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LLy;->o(Lco/bird/android/core/mvp/BaseActivity;Lgl;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {p1, v0}, LLy;->b(Lco/bird/android/core/mvp/BaseActivity;LEa;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->z2()LEg1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEg1;

    invoke-static {p1, v0}, LLy;->g(Lco/bird/android/core/mvp/BaseActivity;LEg1;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->x1()Llh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh6;

    invoke-static {p1, v0}, LLy;->r(Lco/bird/android/core/mvp/BaseActivity;Llh6;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->s()Llg6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg6;

    invoke-static {p1, v0}, LLy;->a(Lco/bird/android/core/mvp/BaseActivity;Llg6;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->P0()Lqi1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqi1;

    invoke-static {p1, v0}, LLy;->i(Lco/bird/android/core/mvp/BaseActivity;Lqi1;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->A0()LVq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVq4;

    invoke-static {p1, v0}, LLy;->h(Lco/bird/android/core/mvp/BaseActivity;LVq4;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->i0()LjB0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LjB0;

    invoke-static {p1, v0}, LLy;->e(Lco/bird/android/core/mvp/BaseActivity;LjB0;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->y2()LFO2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFO2;

    invoke-static {p1, v0}, LLy;->l(Lco/bird/android/core/mvp/BaseActivity;LFO2;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->b0()LYR4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    invoke-static {p1, v0}, LLy;->q(Lco/bird/android/core/mvp/BaseActivity;LYR4;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->x()LaM;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LaM;

    invoke-static {p1, v0}, LLy;->c(Lco/bird/android/core/mvp/BaseActivity;LaM;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d3()LpJ;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LpJ;

    invoke-static {p1, v0}, LLy;->d(Lco/bird/android/core/mvp/BaseActivity;LpJ;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->q()Ldr4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr4;

    invoke-static {p1, v0}, LLy;->j(Lco/bird/android/core/mvp/BaseActivity;Ldr4;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->p3()Lo21;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo21;

    invoke-static {p1, v0}, LLy;->f(Lco/bird/android/core/mvp/BaseActivity;Lo21;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->o:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LGQ3;

    invoke-static {p1, v0}, LFq3;->d(Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;LGQ3;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/operator/permission/ui/a$b;->b()Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;

    move-result-object v0

    invoke-static {p1, v0}, LFq3;->a(Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/operator/permission/ui/a$b;->e()Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

    move-result-object v0

    invoke-static {p1, v0}, LFq3;->b(Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;)V

    return-object p1
.end method

.method public final e()Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

    iget-object v1, p0, Lco/bird/android/app/feature/operator/permission/ui/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->M()LuQ3;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LuQ3;

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;-><init>(LuQ3;)V

    return-object v0
.end method