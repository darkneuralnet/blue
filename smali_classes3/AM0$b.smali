.class public final LAM0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le93$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LAM0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lio/reactivex/subjects/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/c<",
            "Lco/bird/android/model/NonRepair;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lco/bird/android/core/mvp/BaseActivity;

.field public final c:LRZ;

.field public final d:Landroid/content/DialogInterface;

.field public final e:Lcom/uber/autodispose/ScopeProvider;

.field public final f:LAM0$b;


# direct methods
.method public constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LRZ;Lio/reactivex/subjects/c;Landroid/content/DialogInterface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlG2;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "LRZ;",
            "Lio/reactivex/subjects/c<",
            "Lco/bird/android/model/NonRepair;",
            ">;",
            "Landroid/content/DialogInterface;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LAM0$b;->f:LAM0$b;

    iput-object p5, p0, LAM0$b;->a:Lio/reactivex/subjects/c;

    iput-object p2, p0, LAM0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p4, p0, LAM0$b;->c:LRZ;

    iput-object p6, p0, LAM0$b;->d:Landroid/content/DialogInterface;

    iput-object p3, p0, LAM0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public synthetic constructor <init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LRZ;Lio/reactivex/subjects/c;Landroid/content/DialogInterface;LBM0;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, LAM0$b;-><init>(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LRZ;Lio/reactivex/subjects/c;Landroid/content/DialogInterface;)V

    return-void
.end method


# virtual methods
.method public a(Le93;)V
    .locals 0

    invoke-virtual {p0, p1}, LAM0$b;->b(Le93;)Le93;

    return-void
.end method

.method public final b(Le93;)Le93;
    .locals 1

    invoke-virtual {p0}, LAM0$b;->c()Ls93;

    move-result-object v0

    invoke-static {p1, v0}, Lf93;->b(Le93;Ls93;)V

    return-object p1
.end method

.method public final c()Ls93;
    .locals 5

    new-instance v0, Ls93;

    iget-object v1, p0, LAM0$b;->a:Lio/reactivex/subjects/c;

    new-instance v2, Lg93;

    invoke-direct {v2}, Lg93;-><init>()V

    invoke-virtual {p0}, LAM0$b;->d()LG93;

    move-result-object v3

    iget-object v4, p0, LAM0$b;->e:Lcom/uber/autodispose/ScopeProvider;

    invoke-direct {v0, v1, v2, v3, v4}, Ls93;-><init>(Lio/reactivex/subjects/c;Lg93;LG93;Lcom/uber/autodispose/ScopeProvider;)V

    return-object v0
.end method

.method public final d()LG93;
    .locals 4

    new-instance v0, LG93;

    iget-object v1, p0, LAM0$b;->b:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, LAM0$b;->c:LRZ;

    iget-object v3, p0, LAM0$b;->d:Landroid/content/DialogInterface;

    invoke-direct {v0, v1, v2, v3}, LG93;-><init>(Lco/bird/android/core/mvp/BaseActivity;LRZ;Landroid/content/DialogInterface;)V

    return-object v0
.end method
