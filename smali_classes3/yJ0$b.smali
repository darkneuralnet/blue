.class public final LyJ0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLr1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LyJ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;

.field public final c:Lco/bird/android/core/mvp/BaseActivity;

.field public final d:Lhy1;

.field public final e:Lcom/uber/autodispose/ScopeProvider;

.field public final f:Lmp1;

.field public final g:LyJ0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lhy1;Lmp1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LyJ0$b;->g:LyJ0$b;

    iput-object p1, p0, LyJ0$b;->a:LlG2;

    iput-object p2, p0, LyJ0$b;->b:Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;

    iput-object p3, p0, LyJ0$b;->c:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p5, p0, LyJ0$b;->d:Lhy1;

    iput-object p4, p0, LyJ0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    iput-object p6, p0, LyJ0$b;->f:Lmp1;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lhy1;Lmp1;LzJ0;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LyJ0$b;-><init>(LlG2;Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lhy1;Lmp1;)V

    return-void
.end method


# virtual methods
.method public a(LLr1;)V
    .locals 0

    invoke-virtual {p0, p1}, LyJ0$b;->d(LLr1;)LLr1;

    return-void
.end method

.method public final b()LTr1;
    .locals 8

    new-instance v7, LTr1;

    iget-object v0, p0, LyJ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->l1()LBq1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LBq1;

    iget-object v0, p0, LyJ0$b;->b:Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;

    invoke-interface {v0}, Lco/bird/android/feature/fleetstatus/common/FleetActivity$a;->a()Lkp1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lkp1;

    new-instance v3, LKr1;

    invoke-direct {v3}, LKr1;-><init>()V

    invoke-virtual {p0}, LyJ0$b;->c()LUr1;

    move-result-object v4

    iget-object v5, p0, LyJ0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    iget-object v6, p0, LyJ0$b;->f:Lmp1;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LTr1;-><init>(LBq1;Lkp1;LKr1;LUr1;Lcom/uber/autodispose/ScopeProvider;Lmp1;)V

    return-object v7
.end method

.method public final c()LUr1;
    .locals 3

    new-instance v0, LUr1;

    iget-object v1, p0, LyJ0$b;->c:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LyJ0$b;->d:Lhy1;

    invoke-direct {v0, v1, v2}, LUr1;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lhy1;)V

    return-object v0
.end method

.method public final d(LLr1;)LLr1;
    .locals 1

    invoke-virtual {p0}, LyJ0$b;->b()LTr1;

    move-result-object v0

    invoke-static {p1, v0}, LMr1;->b(LLr1;LTr1;)V

    return-object p1
.end method
