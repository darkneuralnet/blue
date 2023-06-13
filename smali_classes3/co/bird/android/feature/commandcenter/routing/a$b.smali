.class public final Lco/bird/android/feature/commandcenter/routing/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/commandcenter/routing/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/commandcenter/routing/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/core/mvp/BaseActivity;

.field public final c:Landroidx/recyclerview/widget/RecyclerView;

.field public final d:Landroid/widget/Button;

.field public final e:Lcom/uber/autodispose/ScopeProvider;

.field public final f:Lco/bird/android/feature/commandcenter/routing/a$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->f:Lco/bird/android/feature/commandcenter/routing/a$b;

    iput-object p1, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->a:LlG2;

    iput-object p2, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->c:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p5, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->d:Landroid/widget/Button;

    iput-object p3, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->e:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;LMP0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lco/bird/android/feature/commandcenter/routing/a$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;)V

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/feature/commandcenter/routing/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/commandcenter/routing/a$b;->b(Lco/bird/android/feature/commandcenter/routing/b;)Lco/bird/android/feature/commandcenter/routing/b;

    return-void
.end method

.method public final b(Lco/bird/android/feature/commandcenter/routing/b;)Lco/bird/android/feature/commandcenter/routing/b;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/commandcenter/routing/a$b;->d()LOc5;

    move-result-object v0

    invoke-static {p1, v0}, Lsc5;->b(Lco/bird/android/feature/commandcenter/routing/b;Lvc5;)V

    return-object p1
.end method

.method public final c()Lqc5;
    .locals 2

    new-instance v0, Lqc5;

    iget-object v1, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lqc5;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final d()LOc5;
    .locals 10

    new-instance v9, LOc5;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->I1()Ltc5;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ltc5;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->T2()LaG6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LaG6;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LEa;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LTq4;

    invoke-virtual {p0}, Lco/bird/android/feature/commandcenter/routing/a$b;->e()LTc5;

    move-result-object v5

    iget-object v6, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->e:Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Le13;

    invoke-virtual {p0}, Lco/bird/android/feature/commandcenter/routing/a$b;->c()Lqc5;

    move-result-object v8

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, LOc5;-><init>(Ltc5;LaG6;LEa;LTq4;LSc5;Lcom/uber/autodispose/ScopeProvider;Le13;Loc5;)V

    return-object v9
.end method

.method public final e()LTc5;
    .locals 4

    new-instance v0, LTc5;

    iget-object v1, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->c:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, p0, Lco/bird/android/feature/commandcenter/routing/a$b;->d:Landroid/widget/Button;

    invoke-direct {v0, v1, v2, v3}, LTc5;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;)V

    return-object v0
.end method
