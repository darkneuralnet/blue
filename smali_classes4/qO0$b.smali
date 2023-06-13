.class public final LqO0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRa4$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LqO0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/core/mvp/BaseActivity;

.field public final c:Landroid/content/DialogInterface;

.field public final d:LE31;

.field public final e:Lcom/uber/autodispose/ScopeProvider;

.field public final f:Lio/reactivex/subjects/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/h<",
            "Ljava/util/List<",
            "Lco/bird/android/model/QCAutoCheck;",
            ">;>;"
        }
    .end annotation
.end field

.field public final g:LqO0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LRa4;LE31;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "LRa4;",
            "LE31;",
            "Landroid/content/DialogInterface;",
            "Lio/reactivex/subjects/h<",
            "Ljava/util/List<",
            "Lco/bird/android/model/QCAutoCheck;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LqO0$b;->g:LqO0$b;

    iput-object p1, p0, LqO0$b;->a:LlG2;

    iput-object p2, p0, LqO0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p6, p0, LqO0$b;->c:Landroid/content/DialogInterface;

    iput-object p5, p0, LqO0$b;->d:LE31;

    iput-object p3, p0, LqO0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    iput-object p7, p0, LqO0$b;->f:Lio/reactivex/subjects/h;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LRa4;LE31;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;LrO0;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LqO0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LRa4;LE31;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;)V

    return-void
.end method


# virtual methods
.method public a(LRa4;)V
    .locals 0

    invoke-virtual {p0, p1}, LqO0$b;->b(LRa4;)LRa4;

    return-void
.end method

.method public final b(LRa4;)LRa4;
    .locals 1

    invoke-virtual {p0}, LqO0$b;->d()Lgb4;

    move-result-object v0

    invoke-static {p1, v0}, LSa4;->b(LRa4;LXa4;)V

    return-object p1
.end method

.method public final c()LVa4;
    .locals 2

    new-instance v0, LVa4;

    iget-object v1, p0, LqO0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, LVa4;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final d()Lgb4;
    .locals 8

    new-instance v7, Lgb4;

    iget-object v0, p0, LqO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->T2()LaG6;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LaG6;

    invoke-virtual {p0}, LqO0$b;->e()Lib4;

    move-result-object v2

    iget-object v3, p0, LqO0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    invoke-virtual {p0}, LqO0$b;->c()LVa4;

    move-result-object v4

    iget-object v5, p0, LqO0$b;->f:Lio/reactivex/subjects/h;

    iget-object v0, p0, LqO0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->P1()LAb4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LAb4;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lgb4;-><init>(LaG6;Lhb4;Lcom/uber/autodispose/ScopeProvider;LTa4;Lio/reactivex/subjects/h;LAb4;)V

    return-object v7
.end method

.method public final e()Lib4;
    .locals 4

    new-instance v0, Lib4;

    iget-object v1, p0, LqO0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LqO0$b;->c:Landroid/content/DialogInterface;

    iget-object v3, p0, LqO0$b;->d:LE31;

    invoke-direct {v0, v1, v2, v3}, Lib4;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/content/DialogInterface;LE31;)V

    return-object v0
.end method
