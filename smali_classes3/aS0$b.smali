.class public final LaS0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LmE6$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LaS0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lco/bird/android/core/mvp/BaseActivity;

.field public final b:Landroid/content/DialogInterface;

.field public final c:Lu31;

.field public final d:Lcom/uber/autodispose/ScopeProvider;

.field public final e:Lio/reactivex/subjects/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/h<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LaS0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LmE6;Landroid/content/DialogInterface;Lu31;Lio/reactivex/subjects/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "LmE6;",
            "Landroid/content/DialogInterface;",
            "Lu31;",
            "Lio/reactivex/subjects/h<",
            "Lco/bird/android/model/DialogResponse;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LaS0$b;->f:LaS0$b;

    iput-object p2, p0, LaS0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p5, p0, LaS0$b;->b:Landroid/content/DialogInterface;

    iput-object p6, p0, LaS0$b;->c:Lu31;

    iput-object p3, p0, LaS0$b;->d:Lcom/uber/autodispose/ScopeProvider;

    iput-object p7, p0, LaS0$b;->e:Lio/reactivex/subjects/h;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LmE6;Landroid/content/DialogInterface;Lu31;Lio/reactivex/subjects/h;LbS0;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LaS0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LmE6;Landroid/content/DialogInterface;Lu31;Lio/reactivex/subjects/h;)V

    return-void
.end method


# virtual methods
.method public a(LmE6;)V
    .locals 0

    invoke-virtual {p0, p1}, LaS0$b;->b(LmE6;)LmE6;

    return-void
.end method

.method public final b(LmE6;)LmE6;
    .locals 1

    invoke-virtual {p0}, LaS0$b;->d()LvE6;

    move-result-object v0

    invoke-static {p1, v0}, LnE6;->c(LmE6;LsE6;)V

    invoke-virtual {p0}, LaS0$b;->c()LrE6;

    move-result-object v0

    invoke-static {p1, v0}, LnE6;->b(LmE6;LoE6;)V

    return-object p1
.end method

.method public final c()LrE6;
    .locals 4

    new-instance v0, LrE6;

    invoke-virtual {p0}, LaS0$b;->d()LvE6;

    move-result-object v1

    iget-object v2, p0, LaS0$b;->d:Lcom/uber/autodispose/ScopeProvider;

    iget-object v3, p0, LaS0$b;->e:Lio/reactivex/subjects/h;

    invoke-direct {v0, v1, v2, v3}, LrE6;-><init>(LsE6;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/h;)V

    return-object v0
.end method

.method public final d()LvE6;
    .locals 4

    new-instance v0, LvE6;

    iget-object v1, p0, LaS0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LaS0$b;->b:Landroid/content/DialogInterface;

    iget-object v3, p0, LaS0$b;->c:Lu31;

    invoke-direct {v0, v1, v2, v3}, LvE6;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/content/DialogInterface;Lu31;)V

    return-object v0
.end method
