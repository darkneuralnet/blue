.class public final LsN0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwI3$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LsN0;
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

.field public final c:Lb00;

.field public final d:Landroid/content/DialogInterface;

.field public final e:Lcom/uber/autodispose/ScopeProvider;

.field public final f:LsN0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lb00;Landroid/content/DialogInterface;Lio/reactivex/subjects/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lb00;",
            "Landroid/content/DialogInterface;",
            "Lio/reactivex/subjects/g<",
            "Lco/bird/android/model/DialogResponse;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LsN0$b;->f:LsN0$b;

    iput-object p6, p0, LsN0$b;->a:Lio/reactivex/subjects/g;

    iput-object p2, p0, LsN0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LsN0$b;->c:Lb00;

    iput-object p5, p0, LsN0$b;->d:Landroid/content/DialogInterface;

    iput-object p3, p0, LsN0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lb00;Landroid/content/DialogInterface;Lio/reactivex/subjects/g;LtN0;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LsN0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lb00;Landroid/content/DialogInterface;Lio/reactivex/subjects/g;)V

    return-void
.end method


# virtual methods
.method public a(LwI3;)V
    .locals 0

    invoke-virtual {p0, p1}, LsN0$b;->b(LwI3;)LwI3;

    return-void
.end method

.method public final b(LwI3;)LwI3;
    .locals 1

    invoke-virtual {p0}, LsN0$b;->c()LBI3;

    move-result-object v0

    invoke-static {p1, v0}, LxI3;->b(LwI3;LBI3;)V

    return-object p1
.end method

.method public final c()LBI3;
    .locals 4

    new-instance v0, LBI3;

    iget-object v1, p0, LsN0$b;->a:Lio/reactivex/subjects/g;

    invoke-virtual {p0}, LsN0$b;->d()LCI3;

    move-result-object v2

    iget-object v3, p0, LsN0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    invoke-direct {v0, v1, v2, v3}, LBI3;-><init>(Lio/reactivex/subjects/g;LCI3;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v0
.end method

.method public final d()LCI3;
    .locals 4

    new-instance v0, LCI3;

    iget-object v1, p0, LsN0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LsN0$b;->c:Lb00;

    iget-object v3, p0, LsN0$b;->d:Landroid/content/DialogInterface;

    invoke-direct {v0, v1, v2, v3}, LCI3;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lb00;Landroid/content/DialogInterface;)V

    return-object v0
.end method
