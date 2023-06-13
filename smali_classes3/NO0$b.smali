.class public final LNO0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPz4$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNO0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:LNy4;

.field public final c:Lco/bird/android/core/mvp/BaseActivity;

.field public final d:Landroidx/recyclerview/widget/RecyclerView;

.field public final e:Landroid/widget/Button;

.field public final f:Landroid/widget/Button;

.field public final g:Lcom/uber/autodispose/ScopeProvider;

.field public final h:LNO0$b;


# direct methods
.method public constructor <init>(LlG2;LNy4;Lco/bird/android/core/mvp/BaseActivity;LPz4;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;Landroid/widget/Button;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LNO0$b;->h:LNO0$b;

    iput-object p1, p0, LNO0$b;->a:LlG2;

    iput-object p2, p0, LNO0$b;->b:LNy4;

    iput-object p3, p0, LNO0$b;->c:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p6, p0, LNO0$b;->d:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p7, p0, LNO0$b;->e:Landroid/widget/Button;

    iput-object p8, p0, LNO0$b;->f:Landroid/widget/Button;

    iput-object p5, p0, LNO0$b;->g:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;LNy4;Lco/bird/android/core/mvp/BaseActivity;LPz4;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;Landroid/widget/Button;LOO0;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LNO0$b;-><init>(LlG2;LNy4;Lco/bird/android/core/mvp/BaseActivity;LPz4;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;Landroid/widget/Button;)V

    return-void
.end method


# virtual methods
.method public a(LPz4;)V
    .locals 0

    invoke-virtual {p0, p1}, LNO0$b;->b(LPz4;)LPz4;

    return-void
.end method

.method public final b(LPz4;)LPz4;
    .locals 1

    invoke-virtual {p0}, LNO0$b;->e()LyA4;

    move-result-object v0

    invoke-static {p1, v0}, LQz4;->b(LPz4;LSz4;)V

    return-object p1
.end method

.method public final c()LKz4;
    .locals 2

    new-instance v0, LKz4;

    iget-object v1, p0, LNO0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->j0()Lsu2;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsu2;

    invoke-direct {v0, v1}, LKz4;-><init>(Lsu2;)V

    return-object v0
.end method

.method public final d()LOz4;
    .locals 2

    new-instance v0, LOz4;

    iget-object v1, p0, LNO0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, LOz4;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final e()LyA4;
    .locals 9

    new-instance v8, LyA4;

    iget-object v0, p0, LNO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->T2()LaG6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LaG6;

    iget-object v0, p0, LNO0$b;->b:LNy4;

    invoke-interface {v0}, LNy4;->a()LCy4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LCy4;

    invoke-virtual {p0}, LNO0$b;->f()LCA4;

    move-result-object v3

    iget-object v4, p0, LNO0$b;->g:Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LNO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Le13;

    invoke-virtual {p0}, LNO0$b;->d()LOz4;

    move-result-object v6

    iget-object v0, p0, LNO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LTq4;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LyA4;-><init>(LaG6;LCy4;LBA4;Lcom/uber/autodispose/ScopeProvider;Le13;LMz4;LTq4;)V

    return-object v8
.end method

.method public final f()LCA4;
    .locals 7

    new-instance v6, LCA4;

    iget-object v1, p0, LNO0$b;->c:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LNO0$b;->d:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, LNO0$b;->c()LKz4;

    move-result-object v3

    iget-object v4, p0, LNO0$b;->e:Landroid/widget/Button;

    iget-object v5, p0, LNO0$b;->f:Landroid/widget/Button;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LCA4;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroidx/recyclerview/widget/RecyclerView;LKz4;Landroid/widget/Button;Landroid/widget/Button;)V

    return-object v6
.end method
