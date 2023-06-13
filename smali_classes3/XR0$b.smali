.class public final LXR0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRD6$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LXR0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lco/bird/android/core/mvp/BaseActivity;

.field public final b:Landroid/content/DialogInterface;

.field public final c:Lt31;

.field public final d:Lcom/uber/autodispose/ScopeProvider;

.field public final e:LlG2;

.field public final f:LXR0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LRD6;Landroid/content/DialogInterface;Lt31;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LXR0$b;->f:LXR0$b;

    iput-object p2, p0, LXR0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p5, p0, LXR0$b;->b:Landroid/content/DialogInterface;

    iput-object p6, p0, LXR0$b;->c:Lt31;

    iput-object p3, p0, LXR0$b;->d:Lcom/uber/autodispose/ScopeProvider;

    iput-object p1, p0, LXR0$b;->e:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LRD6;Landroid/content/DialogInterface;Lt31;LYR0;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LXR0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LRD6;Landroid/content/DialogInterface;Lt31;)V

    return-void
.end method


# virtual methods
.method public a(LRD6;)V
    .locals 0

    invoke-virtual {p0, p1}, LXR0$b;->b(LRD6;)LRD6;

    return-void
.end method

.method public final b(LRD6;)LRD6;
    .locals 1

    invoke-virtual {p0}, LXR0$b;->d()LbE6;

    move-result-object v0

    invoke-static {p1, v0}, LSD6;->b(LRD6;LXD6;)V

    return-object p1
.end method

.method public final c()LVD6;
    .locals 2

    new-instance v0, LVD6;

    iget-object v1, p0, LXR0$b;->e:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, LVD6;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final d()LbE6;
    .locals 4

    new-instance v0, LbE6;

    invoke-virtual {p0}, LXR0$b;->e()LdE6;

    move-result-object v1

    iget-object v2, p0, LXR0$b;->d:Lcom/uber/autodispose/ScopeProvider;

    invoke-virtual {p0}, LXR0$b;->c()LVD6;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, LbE6;-><init>(LcE6;Lcom/uber/autodispose/ScopeProvider;LTD6;)V

    return-object v0
.end method

.method public final e()LdE6;
    .locals 4

    new-instance v0, LdE6;

    iget-object v1, p0, LXR0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LXR0$b;->b:Landroid/content/DialogInterface;

    iget-object v3, p0, LXR0$b;->c:Lt31;

    invoke-direct {v0, v1, v2, v3}, LdE6;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/content/DialogInterface;Lt31;)V

    return-object v0
.end method
