.class public final LhP0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LbE4$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LhP0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lio/reactivex/subjects/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/g<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lco/bird/android/core/mvp/BaseActivity;

.field public final c:Le00;

.field public final d:Landroid/content/DialogInterface;

.field public final e:Lcom/uber/autodispose/ScopeProvider;

.field public final f:LhP0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Le00;Lio/reactivex/subjects/g;Landroid/content/DialogInterface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Le00;",
            "Lio/reactivex/subjects/g<",
            "Lco/bird/android/model/DialogResponse;",
            ">;",
            "Landroid/content/DialogInterface;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LhP0$b;->f:LhP0$b;

    iput-object p5, p0, LhP0$b;->a:Lio/reactivex/subjects/g;

    iput-object p2, p0, LhP0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LhP0$b;->c:Le00;

    iput-object p6, p0, LhP0$b;->d:Landroid/content/DialogInterface;

    iput-object p3, p0, LhP0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Le00;Lio/reactivex/subjects/g;Landroid/content/DialogInterface;LiP0;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LhP0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Le00;Lio/reactivex/subjects/g;Landroid/content/DialogInterface;)V

    return-void
.end method


# virtual methods
.method public a(LbE4;)V
    .locals 0

    invoke-virtual {p0, p1}, LhP0$b;->b(LbE4;)LbE4;

    return-void
.end method

.method public final b(LbE4;)LbE4;
    .locals 1

    invoke-virtual {p0}, LhP0$b;->c()LgE4;

    move-result-object v0

    invoke-static {p1, v0}, LcE4;->b(LbE4;LgE4;)V

    return-object p1
.end method

.method public final c()LgE4;
    .locals 4

    new-instance v0, LgE4;

    iget-object v1, p0, LhP0$b;->a:Lio/reactivex/subjects/g;

    invoke-virtual {p0}, LhP0$b;->d()LhE4;

    move-result-object v2

    iget-object v3, p0, LhP0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    invoke-direct {v0, v1, v2, v3}, LgE4;-><init>(Lio/reactivex/subjects/g;LhE4;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v0
.end method

.method public final d()LhE4;
    .locals 4

    new-instance v0, LhE4;

    iget-object v1, p0, LhP0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LhP0$b;->c:Le00;

    iget-object v3, p0, LhP0$b;->d:Landroid/content/DialogInterface;

    invoke-direct {v0, v1, v2, v3}, LhE4;-><init>(Lco/bird/android/core/mvp/BaseActivity;Le00;Landroid/content/DialogInterface;)V

    return-object v0
.end method
