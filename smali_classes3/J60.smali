.class public final LJ60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LI60;",
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
            "Lf3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lyk1;",
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
            "Lf3;",
            ">;",
            "LY94<",
            "Lyk1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ60;->a:LY94;

    iput-object p2, p0, LJ60;->b:LY94;

    iput-object p3, p0, LJ60;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LJ60;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "Lf3;",
            ">;",
            "LY94<",
            "Lyk1;",
            ">;)",
            "LJ60;"
        }
    .end annotation

    new-instance v0, LJ60;

    invoke-direct {v0, p0, p1, p2}, LJ60;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;Lf3;Lyk1;)LI60;
    .locals 1

    new-instance v0, LI60;

    invoke-direct {v0, p0, p1, p2}, LI60;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lf3;Lyk1;)V

    return-object v0
.end method


# virtual methods
.method public b()LI60;
    .locals 3

    iget-object v0, p0, LJ60;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v1, p0, LJ60;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf3;

    iget-object v2, p0, LJ60;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lyk1;

    invoke-static {v0, v1, v2}, LJ60;->c(Lco/bird/android/core/mvp/BaseActivity;Lf3;Lyk1;)LI60;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJ60;->b()LI60;

    move-result-object v0

    return-object v0
.end method
