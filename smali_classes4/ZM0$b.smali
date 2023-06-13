.class public final LZM0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyt3$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZM0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lco/bird/android/core/mvp/BaseActivity;

.field public final b:Lf00;

.field public final c:Landroid/content/DialogInterface;

.field public final d:Ldm5;

.field public final e:Lcom/uber/autodispose/ScopeProvider;

.field public final f:LlG2;

.field public final g:Lio/reactivex/subjects/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/g<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LZM0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/g;Lf00;Landroid/content/DialogInterface;Ldm5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lio/reactivex/subjects/g<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "Lf00;",
            "Landroid/content/DialogInterface;",
            "Ldm5;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LZM0$b;->h:LZM0$b;

    iput-object p2, p0, LZM0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p5, p0, LZM0$b;->b:Lf00;

    iput-object p6, p0, LZM0$b;->c:Landroid/content/DialogInterface;

    iput-object p7, p0, LZM0$b;->d:Ldm5;

    iput-object p3, p0, LZM0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    iput-object p1, p0, LZM0$b;->f:LlG2;

    iput-object p4, p0, LZM0$b;->g:Lio/reactivex/subjects/g;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/g;Lf00;Landroid/content/DialogInterface;Ldm5;LaN0;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LZM0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/g;Lf00;Landroid/content/DialogInterface;Ldm5;)V

    return-void
.end method


# virtual methods
.method public a(Lyt3;)V
    .locals 0

    invoke-virtual {p0, p1}, LZM0$b;->c(Lyt3;)Lyt3;

    return-void
.end method

.method public final b()LjE;
    .locals 4

    new-instance v0, LjE;

    iget-object v1, p0, LZM0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LZM0$b;->b:Lf00;

    iget-object v3, p0, LZM0$b;->c:Landroid/content/DialogInterface;

    invoke-direct {v0, v1, v2, v3}, LjE;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lf00;Landroid/content/DialogInterface;)V

    return-object v0
.end method

.method public final c(Lyt3;)Lyt3;
    .locals 1

    invoke-virtual {p0}, LZM0$b;->d()LEt3;

    move-result-object v0

    invoke-static {p1, v0}, Lzt3;->b(Lyt3;LEt3;)V

    return-object p1
.end method

.method public final d()LEt3;
    .locals 8

    new-instance v7, LEt3;

    invoke-virtual {p0}, LZM0$b;->b()LjE;

    move-result-object v1

    iget-object v2, p0, LZM0$b;->d:Ldm5;

    iget-object v3, p0, LZM0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    iget-object v0, p0, LZM0$b;->f:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LTq4;

    iget-object v0, p0, LZM0$b;->f:LlG2;

    invoke-interface {v0}, LlG2;->F0()Lom3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lom3;

    iget-object v6, p0, LZM0$b;->g:Lio/reactivex/subjects/g;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LEt3;-><init>(LjE;Ldm5;Lcom/uber/autodispose/ScopeProvider;LTq4;Lom3;Lio/reactivex/subjects/g;)V

    return-object v7
.end method
