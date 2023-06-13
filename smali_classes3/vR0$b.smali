.class public final LvR0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyl6$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LvR0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lcom/uber/autodispose/ScopeProvider;

.field public final c:LvR0$b;

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
            "Landroidx/recyclerview/widget/RecyclerView;",
            ">;"
        }
    .end annotation
.end field

.field public f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LKl6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LvR0$b;->c:LvR0$b;

    iput-object p1, p0, LvR0$b;->a:LlG2;

    iput-object p3, p0, LvR0$b;->b:Lcom/uber/autodispose/ScopeProvider;

    invoke-virtual {p0, p1, p2, p3, p4}, LvR0$b;->c(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;LwR0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LvR0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method


# virtual methods
.method public a(Lyl6;)V
    .locals 0

    invoke-virtual {p0, p1}, LvR0$b;->d(Lyl6;)Lyl6;

    return-void
.end method

.method public final b()LAo0;
    .locals 7

    new-instance v6, LAo0;

    iget-object v0, p0, LvR0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->q2()LTo0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LTo0;

    iget-object v0, p0, LvR0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->F0()Lom3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lom3;

    iget-object v0, p0, LvR0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w()Lrd5;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lrd5;

    iget-object v4, p0, LvR0$b;->b:Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LvR0$b;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Llp0;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LAo0;-><init>(LTo0;Lom3;Lrd5;Lcom/uber/autodispose/ScopeProvider;Llp0;)V

    return-object v6
.end method

.method public final c(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-static {p2}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, LvR0$b;->d:LY94;

    invoke-static {p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, LvR0$b;->e:LY94;

    iget-object p2, p0, LvR0$b;->d:LY94;

    invoke-static {p2, p1}, LLl6;->a(LY94;LY94;)LLl6;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LvR0$b;->f:LY94;

    return-void
.end method

.method public final d(Lyl6;)Lyl6;
    .locals 1

    invoke-virtual {p0}, LvR0$b;->f()LHl6;

    move-result-object v0

    invoke-static {p1, v0}, Lzl6;->b(Lyl6;LAl6;)V

    return-object p1
.end method

.method public final e()Lxl6;
    .locals 3

    new-instance v0, Lxl6;

    iget-object v1, p0, LvR0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->B1()LTq4;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LTq4;

    iget-object v2, p0, LvR0$b;->a:LlG2;

    invoke-interface {v2}, LlG2;->R1()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lxl6;-><init>(LTq4;Landroid/content/Context;)V

    return-object v0
.end method

.method public final f()LHl6;
    .locals 10

    new-instance v9, LHl6;

    iget-object v0, p0, LvR0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->x()LaM;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LaM;

    iget-object v0, p0, LvR0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->F0()Lom3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lom3;

    iget-object v0, p0, LvR0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->J2()LTn0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LTn0;

    iget-object v0, p0, LvR0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->M2()LGI3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LGI3;

    invoke-virtual {p0}, LvR0$b;->b()LAo0;

    move-result-object v5

    iget-object v0, p0, LvR0$b;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LJl6;

    iget-object v7, p0, LvR0$b;->b:Lcom/uber/autodispose/ScopeProvider;

    invoke-virtual {p0}, LvR0$b;->e()Lxl6;

    move-result-object v8

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, LHl6;-><init>(LaM;Lom3;LTn0;LGI3;Luo0;LJl6;Lcom/uber/autodispose/ScopeProvider;Lvl6;)V

    return-object v9
.end method
