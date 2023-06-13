.class public final LpN0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LjI3$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LpN0;
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

.field public final f:Lio/reactivex/subjects/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/c<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LlG2;

.field public final h:LpN0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lf00;Landroid/content/DialogInterface;Lio/reactivex/subjects/c;Ldm5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lf00;",
            "Landroid/content/DialogInterface;",
            "Lio/reactivex/subjects/c<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;",
            "Ldm5;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LpN0$b;->h:LpN0$b;

    iput-object p2, p0, LpN0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LpN0$b;->b:Lf00;

    iput-object p5, p0, LpN0$b;->c:Landroid/content/DialogInterface;

    iput-object p7, p0, LpN0$b;->d:Ldm5;

    iput-object p3, p0, LpN0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    iput-object p6, p0, LpN0$b;->f:Lio/reactivex/subjects/c;

    iput-object p1, p0, LpN0$b;->g:LlG2;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lf00;Landroid/content/DialogInterface;Lio/reactivex/subjects/c;Ldm5;LqN0;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, LpN0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lf00;Landroid/content/DialogInterface;Lio/reactivex/subjects/c;Ldm5;)V

    return-void
.end method


# virtual methods
.method public a(LjI3;)V
    .locals 0

    invoke-virtual {p0, p1}, LpN0$b;->c(LjI3;)LjI3;

    return-void
.end method

.method public final b()LjE;
    .locals 4

    new-instance v0, LjE;

    iget-object v1, p0, LpN0$b;->a:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LpN0$b;->b:Lf00;

    iget-object v3, p0, LpN0$b;->c:Landroid/content/DialogInterface;

    invoke-direct {v0, v1, v2, v3}, LjE;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lf00;Landroid/content/DialogInterface;)V

    return-object v0
.end method

.method public final c(LjI3;)LjI3;
    .locals 1

    invoke-virtual {p0}, LpN0$b;->d()LqI3;

    move-result-object v0

    invoke-static {p1, v0}, LkI3;->b(LjI3;LqI3;)V

    return-object p1
.end method

.method public final d()LqI3;
    .locals 9

    new-instance v8, LqI3;

    invoke-virtual {p0}, LpN0$b;->b()LjE;

    move-result-object v1

    iget-object v2, p0, LpN0$b;->d:Ldm5;

    iget-object v3, p0, LpN0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    iget-object v4, p0, LpN0$b;->f:Lio/reactivex/subjects/c;

    iget-object v0, p0, LpN0$b;->g:LlG2;

    invoke-interface {v0}, LlG2;->Y0()LNQ5;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, LNQ5;

    iget-object v0, p0, LpN0$b;->g:LlG2;

    invoke-interface {v0}, LlG2;->C0()LSM;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LSM;

    iget-object v0, p0, LpN0$b;->g:LlG2;

    invoke-interface {v0}, LlG2;->B1()LTq4;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LTq4;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LqI3;-><init>(LjE;Ldm5;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/c;LNQ5;LSM;LTq4;)V

    return-object v8
.end method
