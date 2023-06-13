.class public final LaL0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La42$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LaL0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lio/reactivex/subjects/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/h<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LlG2;

.field public final c:Lco/bird/android/core/mvp/BaseActivity;

.field public final d:Landroid/widget/Button;

.field public final e:Landroid/widget/Button;

.field public final f:Landroidx/recyclerview/widget/RecyclerView;

.field public final g:Landroid/content/DialogInterface;

.field public final h:Lcom/uber/autodispose/ScopeProvider;

.field public final i:LaL0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;Landroid/widget/Button;Lio/reactivex/subjects/h;Landroid/content/DialogInterface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Landroid/widget/Button;",
            "Landroid/widget/Button;",
            "Lio/reactivex/subjects/h<",
            "Lco/bird/android/model/DialogResponse;",
            ">;",
            "Landroid/content/DialogInterface;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LaL0$b;->i:LaL0$b;

    iput-object p7, p0, LaL0$b;->a:Lio/reactivex/subjects/h;

    iput-object p1, p0, LaL0$b;->b:LlG2;

    iput-object p2, p0, LaL0$b;->c:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p5, p0, LaL0$b;->d:Landroid/widget/Button;

    iput-object p6, p0, LaL0$b;->e:Landroid/widget/Button;

    iput-object p4, p0, LaL0$b;->f:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p8, p0, LaL0$b;->g:Landroid/content/DialogInterface;

    iput-object p3, p0, LaL0$b;->h:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;Landroid/widget/Button;Lio/reactivex/subjects/h;Landroid/content/DialogInterface;LbL0;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LaL0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;Landroid/widget/Button;Lio/reactivex/subjects/h;Landroid/content/DialogInterface;)V

    return-void
.end method


# virtual methods
.method public a(La42;)V
    .locals 0

    invoke-virtual {p0, p1}, LaL0$b;->b(La42;)La42;

    return-void
.end method

.method public final b(La42;)La42;
    .locals 1

    invoke-virtual {p0}, LaL0$b;->d()Lj42;

    move-result-object v0

    invoke-static {p1, v0}, Lb42;->b(La42;Lj42;)V

    return-object p1
.end method

.method public final c()Lc42;
    .locals 2

    new-instance v0, Lc42;

    iget-object v1, p0, LaL0$b;->b:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lc42;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final d()Lj42;
    .locals 5

    new-instance v0, Lj42;

    iget-object v1, p0, LaL0$b;->a:Lio/reactivex/subjects/h;

    invoke-virtual {p0}, LaL0$b;->c()Lc42;

    move-result-object v2

    invoke-virtual {p0}, LaL0$b;->e()Lk42;

    move-result-object v3

    iget-object v4, p0, LaL0$b;->h:Lcom/uber/autodispose/ScopeProvider;

    invoke-direct {v0, v1, v2, v3, v4}, Lj42;-><init>(Lio/reactivex/subjects/h;Lc42;Lk42;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v0
.end method

.method public final e()Lk42;
    .locals 7

    new-instance v6, Lk42;

    iget-object v1, p0, LaL0$b;->c:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LaL0$b;->d:Landroid/widget/Button;

    iget-object v3, p0, LaL0$b;->e:Landroid/widget/Button;

    iget-object v4, p0, LaL0$b;->f:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, p0, LaL0$b;->g:Landroid/content/DialogInterface;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lk42;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/Button;Landroid/widget/Button;Landroidx/recyclerview/widget/RecyclerView;Landroid/content/DialogInterface;)V

    return-object v6
.end method
