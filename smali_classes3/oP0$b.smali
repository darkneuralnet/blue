.class public final LoP0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKF4$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LoP0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lco/bird/android/core/mvp/BaseActivity;

.field public final b:Lvy1;

.field public final c:Lcom/uber/autodispose/ScopeProvider;

.field public final d:LlG2;

.field public final e:LDQ3;

.field public final f:LoP0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lvy1;LDQ3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LoP0$b;->f:LoP0$b;

    iput-object p2, p0, LoP0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LoP0$b;->b:Lvy1;

    iput-object p3, p0, LoP0$b;->c:Lcom/uber/autodispose/ScopeProvider;

    iput-object p1, p0, LoP0$b;->d:LlG2;

    iput-object p5, p0, LoP0$b;->e:LDQ3;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lvy1;LDQ3;LpP0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LoP0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lvy1;LDQ3;)V

    return-void
.end method


# virtual methods
.method public a(LKF4;)V
    .locals 0

    invoke-virtual {p0, p1}, LoP0$b;->b(LKF4;)LKF4;

    return-void
.end method

.method public final b(LKF4;)LKF4;
    .locals 1

    invoke-virtual {p0}, LoP0$b;->c()LQF4;

    move-result-object v0

    invoke-static {p1, v0}, LLF4;->b(LKF4;LQF4;)V

    return-object p1
.end method

.method public final c()LQF4;
    .locals 7

    new-instance v6, LQF4;

    invoke-virtual {p0}, LoP0$b;->d()LSF4;

    move-result-object v1

    iget-object v2, p0, LoP0$b;->c:Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LoP0$b;->d:LlG2;

    invoke-interface {v0}, LlG2;->w2()Le13;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Le13;

    iget-object v0, p0, LoP0$b;->d:LlG2;

    invoke-interface {v0}, LlG2;->e3()Lrn6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lrn6;

    iget-object v5, p0, LoP0$b;->e:LDQ3;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LQF4;-><init>(LSF4;Lcom/uber/autodispose/ScopeProvider;Le13;Lrn6;LDQ3;)V

    return-object v6
.end method

.method public final d()LSF4;
    .locals 3

    new-instance v0, LSF4;

    iget-object v1, p0, LoP0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LoP0$b;->b:Lvy1;

    invoke-direct {v0, v1, v2}, LSF4;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lvy1;)V

    return-object v0
.end method
