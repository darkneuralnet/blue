.class public final LCH0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbe0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lco/bird/android/core/mvp/BaseActivity;

.field public final b:Landroid/widget/TextView;

.field public final c:Landroidx/recyclerview/widget/RecyclerView;

.field public final d:Landroid/content/DialogInterface;

.field public final e:Lcom/uber/autodispose/ScopeProvider;

.field public final f:Lio/reactivex/subjects/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/h<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/IssueStatus;",
            "Lco/bird/android/model/constant/IssueStatusReason;",
            ">;>;"
        }
    .end annotation
.end field

.field public final g:LlG2;

.field public final h:LCH0$a;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lbe0;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lbe0;",
            "Landroid/content/DialogInterface;",
            "Lio/reactivex/subjects/h<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/IssueStatus;",
            "Lco/bird/android/model/constant/IssueStatusReason;",
            ">;>;",
            "Landroid/widget/TextView;",
            "Landroidx/recyclerview/widget/RecyclerView;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LCH0$a;->h:LCH0$a;

    iput-object p2, p0, LCH0$a;->a:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p7, p0, LCH0$a;->b:Landroid/widget/TextView;

    iput-object p8, p0, LCH0$a;->c:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p5, p0, LCH0$a;->d:Landroid/content/DialogInterface;

    iput-object p3, p0, LCH0$a;->e:Lcom/uber/autodispose/ScopeProvider;

    iput-object p6, p0, LCH0$a;->f:Lio/reactivex/subjects/h;

    iput-object p1, p0, LCH0$a;->g:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lbe0;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;LBH0;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LCH0$a;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lbe0;Landroid/content/DialogInterface;Lio/reactivex/subjects/h;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method


# virtual methods
.method public a(Lbe0;)V
    .locals 0

    invoke-virtual {p0, p1}, LCH0$a;->e(Lbe0;)Lbe0;

    return-void
.end method

.method public final b()Lee0;
    .locals 2

    new-instance v0, Lee0;

    iget-object v1, p0, LCH0$a;->g:LlG2;

    invoke-interface {v1}, LlG2;->R1()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lee0;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final c()Lje0;
    .locals 5

    new-instance v0, Lje0;

    invoke-virtual {p0}, LCH0$a;->d()Lle0;

    move-result-object v1

    iget-object v2, p0, LCH0$a;->e:Lcom/uber/autodispose/ScopeProvider;

    iget-object v3, p0, LCH0$a;->f:Lio/reactivex/subjects/h;

    invoke-virtual {p0}, LCH0$a;->b()Lee0;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lje0;-><init>(Lke0;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/h;Lee0;)V

    return-object v0
.end method

.method public final d()Lle0;
    .locals 5

    new-instance v0, Lle0;

    iget-object v1, p0, LCH0$a;->a:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LCH0$a;->b:Landroid/widget/TextView;

    iget-object v3, p0, LCH0$a;->c:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, p0, LCH0$a;->d:Landroid/content/DialogInterface;

    invoke-direct {v0, v1, v2, v3, v4}, Lle0;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/content/DialogInterface;)V

    return-object v0
.end method

.method public final e(Lbe0;)Lbe0;
    .locals 1

    invoke-virtual {p0}, LCH0$a;->c()Lje0;

    move-result-object v0

    invoke-static {p1, v0}, Lce0;->b(Lbe0;Lfe0;)V

    return-object p1
.end method
