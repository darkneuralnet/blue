.class public final LqM0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB13$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LqM0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LqM0$b$a;,
        LqM0$b$b;
    }
.end annotation


# instance fields
.field public final a:LqM0$b;

.field public b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field public f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ly31;",
            ">;"
        }
    .end annotation
.end field

.field public g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LP13;",
            ">;"
        }
    .end annotation
.end field

.field public h:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LM13;",
            ">;"
        }
    .end annotation
.end field

.field public i:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lio/reactivex/subjects/h<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public j:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lio/reactivex/subjects/h<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field public k:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LK13;",
            ">;"
        }
    .end annotation
.end field

.field public l:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LD13;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Ly31;Lio/reactivex/subjects/h;Lio/reactivex/subjects/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Ly31;",
            "Lio/reactivex/subjects/h<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;",
            "Lio/reactivex/subjects/h<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LqM0$b;->a:LqM0$b;

    invoke-virtual/range {p0 .. p6}, LqM0$b;->b(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Ly31;Lio/reactivex/subjects/h;Lio/reactivex/subjects/h;)V

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Ly31;Lio/reactivex/subjects/h;Lio/reactivex/subjects/h;LrM0;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LqM0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Ly31;Lio/reactivex/subjects/h;Lio/reactivex/subjects/h;)V

    return-void
.end method


# virtual methods
.method public a(LB13;)V
    .locals 0

    invoke-virtual {p0, p1}, LqM0$b;->c(LB13;)LB13;

    return-void
.end method

.method public final b(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Ly31;Lio/reactivex/subjects/h;Lio/reactivex/subjects/h;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Ly31;",
            "Lio/reactivex/subjects/h<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;>;",
            "Lio/reactivex/subjects/h<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    new-instance v0, LqM0$b$a;

    invoke-direct {v0, p1}, LqM0$b$a;-><init>(LlG2;)V

    iput-object v0, p0, LqM0$b;->b:LY94;

    new-instance v0, LqM0$b$b;

    invoke-direct {v0, p1}, LqM0$b$b;-><init>(LlG2;)V

    iput-object v0, p0, LqM0$b;->c:LY94;

    invoke-static {p3}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, LqM0$b;->d:LY94;

    invoke-static {p2}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, LqM0$b;->e:LY94;

    invoke-static {p4}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, LqM0$b;->f:LY94;

    iget-object p2, p0, LqM0$b;->e:LY94;

    invoke-static {p2, p1}, LQ13;->a(LY94;LY94;)LQ13;

    move-result-object p1

    iput-object p1, p0, LqM0$b;->g:LY94;

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LqM0$b;->h:LY94;

    invoke-static {p5}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, LqM0$b;->i:LY94;

    invoke-static {p6}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v5

    iput-object v5, p0, LqM0$b;->j:LY94;

    iget-object v0, p0, LqM0$b;->b:LY94;

    iget-object v1, p0, LqM0$b;->c:LY94;

    iget-object v2, p0, LqM0$b;->d:LY94;

    iget-object v3, p0, LqM0$b;->h:LY94;

    iget-object v4, p0, LqM0$b;->i:LY94;

    invoke-static/range {v0 .. v5}, LL13;->a(LY94;LY94;LY94;LY94;LY94;LY94;)LL13;

    move-result-object p1

    iput-object p1, p0, LqM0$b;->k:LY94;

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, LqM0$b;->l:LY94;

    return-void
.end method

.method public final c(LB13;)LB13;
    .locals 1

    iget-object v0, p0, LqM0$b;->l:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD13;

    invoke-static {p1, v0}, LC13;->b(LB13;LD13;)V

    return-object p1
.end method
