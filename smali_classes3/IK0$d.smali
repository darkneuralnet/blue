.class public final LIK0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/servicecenter/idtools/identify/associate/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIK0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:LIK0$b;

.field public final b:LIK0$d;

.field public c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LDQ3;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field public e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LP3;",
            ">;"
        }
    .end annotation
.end field

.field public f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LHR1;",
            ">;"
        }
    .end annotation
.end field

.field public g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LGR1;",
            ">;"
        }
    .end annotation
.end field

.field public h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpQ1;",
            ">;"
        }
    .end annotation
.end field

.field public j:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LmQ1;",
            ">;"
        }
    .end annotation
.end field

.field public k:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LcR1;",
            ">;"
        }
    .end annotation
.end field

.field public l:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LFR1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LIK0$b;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LP3;LDQ3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LIK0$d;->b:LIK0$d;

    iput-object p1, p0, LIK0$d;->a:LIK0$b;

    invoke-virtual {p0, p2, p3, p4, p5}, LIK0$d;->b(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LP3;LDQ3;)V

    return-void
.end method

.method public synthetic constructor <init>(LIK0$b;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LP3;LDQ3;LLK0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LIK0$d;-><init>(LIK0$b;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LP3;LDQ3;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity;)V
    .locals 0

    invoke-virtual {p0, p1}, LIK0$d;->c(Lco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity;)Lco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity;

    return-void
.end method

.method public final b(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LP3;LDQ3;)V
    .locals 20

    move-object/from16 v0, p0

    invoke-static/range {p4 .. p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, LIK0$d;->c:LY94;

    invoke-static/range {p1 .. p1}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, LIK0$d;->d:LY94;

    invoke-static/range {p3 .. p3}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, LIK0$d;->e:LY94;

    iget-object v2, v0, LIK0$d;->d:LY94;

    invoke-static {v2, v1}, LIR1;->a(LY94;LY94;)LIR1;

    move-result-object v1

    iput-object v1, v0, LIK0$d;->f:LY94;

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, LIK0$d;->g:LY94;

    invoke-static/range {p2 .. p2}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v1

    iput-object v1, v0, LIK0$d;->h:LY94;

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->e(LIK0$b;)LY94;

    move-result-object v1

    invoke-static {v1}, LqQ1;->a(LY94;)LqQ1;

    move-result-object v1

    iput-object v1, v0, LIK0$d;->i:LY94;

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, LIK0$d;->j:LY94;

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->n(LIK0$b;)LY94;

    move-result-object v2

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->q(LIK0$b;)LY94;

    move-result-object v3

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->i(LIK0$b;)LY94;

    move-result-object v4

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->g(LIK0$b;)LY94;

    move-result-object v5

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->f(LIK0$b;)LY94;

    move-result-object v6

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->d(LIK0$b;)LY94;

    move-result-object v7

    iget-object v8, v0, LIK0$d;->c:LY94;

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->l(LIK0$b;)LY94;

    move-result-object v9

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->h(LIK0$b;)LY94;

    move-result-object v10

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->j(LIK0$b;)LY94;

    move-result-object v11

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->p(LIK0$b;)LY94;

    move-result-object v12

    iget-object v13, v0, LIK0$d;->g:LY94;

    iget-object v14, v0, LIK0$d;->h:LY94;

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->s(LIK0$b;)LY94;

    move-result-object v15

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->r(LIK0$b;)LY94;

    move-result-object v16

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->k(LIK0$b;)LY94;

    move-result-object v17

    iget-object v1, v0, LIK0$d;->a:LIK0$b;

    invoke-static {v1}, LIK0$b;->m(LIK0$b;)LY94;

    move-result-object v18

    iget-object v1, v0, LIK0$d;->j:LY94;

    move-object/from16 v19, v1

    invoke-static/range {v2 .. v19}, LoR1;->a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LoR1;

    move-result-object v1

    iput-object v1, v0, LIK0$d;->k:LY94;

    invoke-static {v1}, LV51;->b(LY94;)LY94;

    move-result-object v1

    iput-object v1, v0, LIK0$d;->l:LY94;

    return-void
.end method

.method public final c(Lco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity;)Lco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity;
    .locals 1

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {p1, v0}, LLy;->n(Lco/bird/android/core/mvp/BaseActivity;Le13;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LLy;->p(Lco/bird/android/core/mvp/BaseActivity;LTq4;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->X2()Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    invoke-static {p1, v0}, LLy;->k(Lco/bird/android/core/mvp/BaseActivity;Landroid/os/Handler;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->r()Lgl;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LLy;->o(Lco/bird/android/core/mvp/BaseActivity;Lgl;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {p1, v0}, LLy;->b(Lco/bird/android/core/mvp/BaseActivity;LEa;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->z2()LEg1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEg1;

    invoke-static {p1, v0}, LLy;->g(Lco/bird/android/core/mvp/BaseActivity;LEg1;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->x1()Llh6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llh6;

    invoke-static {p1, v0}, LLy;->r(Lco/bird/android/core/mvp/BaseActivity;Llh6;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->s()Llg6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg6;

    invoke-static {p1, v0}, LLy;->a(Lco/bird/android/core/mvp/BaseActivity;Llg6;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->P0()Lqi1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqi1;

    invoke-static {p1, v0}, LLy;->i(Lco/bird/android/core/mvp/BaseActivity;Lqi1;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->A0()LVq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVq4;

    invoke-static {p1, v0}, LLy;->h(Lco/bird/android/core/mvp/BaseActivity;LVq4;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->i0()LjB0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LjB0;

    invoke-static {p1, v0}, LLy;->e(Lco/bird/android/core/mvp/BaseActivity;LjB0;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->y2()LFO2;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFO2;

    invoke-static {p1, v0}, LLy;->l(Lco/bird/android/core/mvp/BaseActivity;LFO2;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->b0()LYR4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    invoke-static {p1, v0}, LLy;->q(Lco/bird/android/core/mvp/BaseActivity;LYR4;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->x()LaM;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LaM;

    invoke-static {p1, v0}, LLy;->c(Lco/bird/android/core/mvp/BaseActivity;LaM;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->d3()LpJ;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LpJ;

    invoke-static {p1, v0}, LLy;->d(Lco/bird/android/core/mvp/BaseActivity;LpJ;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->q()Ldr4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr4;

    invoke-static {p1, v0}, LLy;->j(Lco/bird/android/core/mvp/BaseActivity;Ldr4;)V

    iget-object v0, p0, LIK0$d;->a:LIK0$b;

    invoke-static {v0}, LIK0$b;->o(LIK0$b;)LlG2;

    move-result-object v0

    invoke-interface {v0}, LlG2;->p3()Lo21;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo21;

    invoke-static {p1, v0}, LLy;->f(Lco/bird/android/core/mvp/BaseActivity;Lo21;)V

    iget-object v0, p0, LIK0$d;->l:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFR1;

    invoke-static {p1, v0}, Lco/bird/android/feature/servicecenter/idtools/identify/associate/b;->b(Lco/bird/android/feature/servicecenter/idtools/identify/associate/IdToolsIdentifyAssociateActivity;LFR1;)V

    return-object p1
.end method
