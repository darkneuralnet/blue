.class public final LCK0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LeM1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCK0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lco/bird/android/core/mvp/BaseActivity;

.field public final b:Lf00;

.field public final c:Landroid/content/DialogInterface;

.field public final d:Ldm5;

.field public final e:Lcom/uber/autodispose/ScopeProvider;

.field public final f:LlG2;

.field public final g:LCK0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lf00;Landroid/content/DialogInterface;Ldm5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LCK0$b;->g:LCK0$b;

    iput-object p2, p0, LCK0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LCK0$b;->b:Lf00;

    iput-object p5, p0, LCK0$b;->c:Landroid/content/DialogInterface;

    iput-object p6, p0, LCK0$b;->d:Ldm5;

    iput-object p3, p0, LCK0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    iput-object p1, p0, LCK0$b;->f:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lf00;Landroid/content/DialogInterface;Ldm5;LDK0;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LCK0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lf00;Landroid/content/DialogInterface;Ldm5;)V

    return-void
.end method


# virtual methods
.method public a(LeM1;)V
    .locals 0

    invoke-virtual {p0, p1}, LCK0$b;->e(LeM1;)LeM1;

    return-void
.end method

.method public final b()LgM1;
    .locals 2

    new-instance v0, LgM1;

    iget-object v1, p0, LCK0$b;->f:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, LgM1;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final c()LvM1;
    .locals 14

    new-instance v13, LvM1;

    invoke-virtual {p0}, LCK0$b;->d()LFM1;

    move-result-object v1

    iget-object v2, p0, LCK0$b;->d:Ldm5;

    iget-object v3, p0, LCK0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LCK0$b;->f:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LTq4;

    iget-object v0, p0, LCK0$b;->f:LlG2;

    invoke-interface {v0}, LlG2;->F0()Lom3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lom3;

    iget-object v0, p0, LCK0$b;->f:LlG2;

    invoke-interface {v0}, LlG2;->x()LaM;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LaM;

    iget-object v0, p0, LCK0$b;->f:LlG2;

    invoke-interface {v0}, LlG2;->C1()LfF;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LfF;

    iget-object v0, p0, LCK0$b;->f:LlG2;

    invoke-interface {v0}, LlG2;->n()LTk0;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, LTk0;

    iget-object v0, p0, LCK0$b;->f:LlG2;

    invoke-interface {v0}, LlG2;->w()Lrd5;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lrd5;

    iget-object v0, p0, LCK0$b;->f:LlG2;

    invoke-interface {v0}, LlG2;->Z2()LAe5;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, LAe5;

    invoke-virtual {p0}, LCK0$b;->b()LgM1;

    move-result-object v11

    iget-object v0, p0, LCK0$b;->f:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Le13;

    move-object v0, v13

    invoke-direct/range {v0 .. v12}, LvM1;-><init>(LFM1;Ldm5;Lcom/uber/autodispose/ScopeProvider;LTq4;Lom3;LaM;LfF;LTk0;Lrd5;LAe5;LgM1;Le13;)V

    return-object v13
.end method

.method public final d()LFM1;
    .locals 4

    new-instance v0, LFM1;

    iget-object v1, p0, LCK0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LCK0$b;->b:Lf00;

    iget-object v3, p0, LCK0$b;->c:Landroid/content/DialogInterface;

    invoke-direct {v0, v1, v2, v3}, LFM1;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lf00;Landroid/content/DialogInterface;)V

    return-object v0
.end method

.method public final e(LeM1;)LeM1;
    .locals 1

    invoke-virtual {p0}, LCK0$b;->c()LvM1;

    move-result-object v0

    invoke-static {p1, v0}, LfM1;->b(LeM1;LvM1;)V

    return-object p1
.end method
