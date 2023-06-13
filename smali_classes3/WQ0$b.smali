.class public final LWQ0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw46$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWQ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:LlG2;

.field public final b:Lco/bird/android/core/mvp/BaseActivity;

.field public final c:Landroidx/recyclerview/widget/RecyclerView;

.field public final d:Lcom/uber/autodispose/ScopeProvider;

.field public final e:LWQ0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LWQ0$b;->e:LWQ0$b;

    iput-object p1, p0, LWQ0$b;->a:LlG2;

    iput-object p2, p0, LWQ0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LWQ0$b;->c:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p3, p0, LWQ0$b;->d:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;LXQ0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LWQ0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method


# virtual methods
.method public a(Lw46;)V
    .locals 0

    invoke-virtual {p0, p1}, LWQ0$b;->b(Lw46;)Lw46;

    return-void
.end method

.method public final b(Lw46;)Lw46;
    .locals 1

    invoke-virtual {p0}, LWQ0$b;->d()LG46;

    move-result-object v0

    invoke-static {p1, v0}, Lx46;->b(Lw46;Lz46;)V

    return-object p1
.end method

.method public final c()Lv46;
    .locals 2

    new-instance v0, Lv46;

    iget-object v1, p0, LWQ0$b;->a:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lv46;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final d()LG46;
    .locals 7

    new-instance v6, LG46;

    iget-object v0, p0, LWQ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->x()LaM;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LaM;

    iget-object v0, p0, LWQ0$b;->a:LlG2;

    invoke-interface {v0}, LlG2;->I1()Ltc5;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ltc5;

    invoke-virtual {p0}, LWQ0$b;->e()LI46;

    move-result-object v3

    iget-object v4, p0, LWQ0$b;->d:Lcom/uber/autodispose/ScopeProvider;

    invoke-virtual {p0}, LWQ0$b;->c()Lv46;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LG46;-><init>(LaM;Ltc5;LH46;Lcom/uber/autodispose/ScopeProvider;Lt46;)V

    return-object v6
.end method

.method public final e()LI46;
    .locals 3

    new-instance v0, LI46;

    iget-object v1, p0, LWQ0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LWQ0$b;->c:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {v0, v1, v2}, LI46;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroidx/recyclerview/widget/RecyclerView;)V

    return-object v0
.end method
