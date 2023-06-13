.class public final LsJ0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzq1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LsJ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/core/mvp/BaseActivity;

.field public final c:Lfy1;

.field public final d:Lcom/uber/autodispose/ScopeProvider;

.field public final e:LsJ0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;Lfy1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LsJ0$b;->e:LsJ0$b;

    iput-object p1, p0, LsJ0$b;->a:LlG2;

    iput-object p2, p0, LsJ0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p6, p0, LsJ0$b;->c:Lfy1;

    iput-object p3, p0, LsJ0$b;->d:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;Lfy1;LtJ0;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LsJ0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;Lfy1;)V

    return-void
.end method


# virtual methods
.method public a(Lzq1;)V
    .locals 0

    invoke-virtual {p0, p1}, LsJ0$b;->e(Lzq1;)Lzq1;

    return-void
.end method

.method public final b()Lpq1;
    .locals 2

    new-instance v0, Lpq1;

    iget-object v1, p0, LsJ0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->B1()LTq4;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LTq4;

    invoke-direct {v0, v1}, Lpq1;-><init>(LTq4;)V

    return-object v0
.end method

.method public final c()LYq1;
    .locals 12

    new-instance v11, LYq1;

    iget-object v0, p0, LsJ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->l1()LBq1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LBq1;

    iget-object v0, p0, LsJ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->k0()Lot5;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lot5;

    iget-object v0, p0, LsJ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->d0()LEa;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LEa;

    new-instance v4, LMZ3;

    invoke-direct {v4}, LMZ3;-><init>()V

    invoke-virtual {p0}, LsJ0$b;->b()Lpq1;

    move-result-object v5

    new-instance v6, Lqp1;

    invoke-direct {v6}, Lqp1;-><init>()V

    iget-object v0, p0, LsJ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LTq4;

    invoke-virtual {p0}, LsJ0$b;->d()Ltr1;

    move-result-object v8

    iget-object v9, p0, LsJ0$b;->d:Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LsJ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Le13;

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, LYq1;-><init>(LBq1;Lot5;LEa;LMZ3;Lpq1;Lqp1;LTq4;Ltr1;Lcom/uber/autodispose/ScopeProvider;Le13;)V

    return-object v11
.end method

.method public final d()Ltr1;
    .locals 3

    new-instance v0, Ltr1;

    iget-object v1, p0, LsJ0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LsJ0$b;->c:Lfy1;

    invoke-direct {v0, v1, v2}, Ltr1;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lfy1;)V

    return-object v0
.end method

.method public final e(Lzq1;)Lzq1;
    .locals 1

    invoke-virtual {p0}, LsJ0$b;->c()LYq1;

    move-result-object v0

    invoke-static {p1, v0}, LAq1;->b(Lzq1;LYq1;)V

    return-object p1
.end method
