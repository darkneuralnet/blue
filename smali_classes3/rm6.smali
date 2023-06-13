.class public final Lrm6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lqm6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lp4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lx43;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "Lp4;",
            ">;",
            "LY94<",
            "Lx43;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm6;->a:LY94;

    iput-object p2, p0, Lrm6;->b:LY94;

    iput-object p3, p0, Lrm6;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)Lrm6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "Lp4;",
            ">;",
            "LY94<",
            "Lx43;",
            ">;)",
            "Lrm6;"
        }
    .end annotation

    new-instance v0, Lrm6;

    invoke-direct {v0, p0, p1, p2}, Lrm6;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;Lp4;Lx43;)Lqm6;
    .locals 1

    new-instance v0, Lqm6;

    invoke-direct {v0, p0, p1, p2}, Lqm6;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lp4;Lx43;)V

    return-object v0
.end method


# virtual methods
.method public b()Lqm6;
    .locals 3

    iget-object v0, p0, Lrm6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v1, p0, Lrm6;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp4;

    iget-object v2, p0, Lrm6;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx43;

    invoke-static {v0, v1, v2}, Lrm6;->c(Lco/bird/android/core/mvp/BaseActivity;Lp4;Lx43;)Lqm6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrm6;->b()Lqm6;

    move-result-object v0

    return-object v0
.end method
