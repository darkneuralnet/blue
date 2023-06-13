.class public final LcP0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCD4$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LcP0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/uber/autodispose/ScopeProvider;

.field public final b:Lco/bird/android/core/mvp/BaseActivity;

.field public final c:Landroidx/recyclerview/widget/RecyclerView;

.field public final d:Landroid/widget/Button;

.field public final e:Landroid/content/DialogInterface;

.field public final f:LlG2;

.field public final g:LcP0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/content/DialogInterface;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LcP0$b;->g:LcP0$b;

    iput-object p3, p0, LcP0$b;->a:Lcom/uber/autodispose/ScopeProvider;

    iput-object p2, p0, LcP0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p5, p0, LcP0$b;->c:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p6, p0, LcP0$b;->d:Landroid/widget/Button;

    iput-object p4, p0, LcP0$b;->e:Landroid/content/DialogInterface;

    iput-object p1, p0, LcP0$b;->f:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/content/DialogInterface;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;LdP0;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LcP0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroid/content/DialogInterface;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;)V

    return-void
.end method


# virtual methods
.method public a(LCD4;)V
    .locals 0

    invoke-virtual {p0, p1}, LcP0$b;->b(LCD4;)LCD4;

    return-void
.end method

.method public final b(LCD4;)LCD4;
    .locals 1

    invoke-virtual {p0}, LcP0$b;->d()LMD4;

    move-result-object v0

    invoke-static {p1, v0}, LDD4;->b(LCD4;LID4;)V

    return-object p1
.end method

.method public final c()LGD4;
    .locals 2

    new-instance v0, LGD4;

    iget-object v1, p0, LcP0$b;->f:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, LGD4;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final d()LMD4;
    .locals 4

    new-instance v0, LMD4;

    iget-object v1, p0, LcP0$b;->a:Lcom/uber/autodispose/ScopeProvider;

    invoke-virtual {p0}, LcP0$b;->e()LQD4;

    move-result-object v2

    invoke-virtual {p0}, LcP0$b;->c()LGD4;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, LMD4;-><init>(Lcom/uber/autodispose/ScopeProvider;LPD4;LED4;)V

    return-object v0
.end method

.method public final e()LQD4;
    .locals 5

    new-instance v0, LQD4;

    iget-object v1, p0, LcP0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LcP0$b;->c:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, p0, LcP0$b;->d:Landroid/widget/Button;

    iget-object v4, p0, LcP0$b;->e:Landroid/content/DialogInterface;

    invoke-direct {v0, v1, v2, v3, v4}, LQD4;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;Landroid/content/DialogInterface;)V

    return-object v0
.end method
