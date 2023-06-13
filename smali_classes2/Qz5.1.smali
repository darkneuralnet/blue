.class public final LQz5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lwi2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lwi2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQz5;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LQz5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lwi2;",
            ">;)",
            "LQz5;"
        }
    .end annotation

    new-instance v0, LQz5;

    invoke-direct {v0, p0}, LQz5;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lwi2;Lco/bird/android/core/mvp/BaseActivity;)LNz5;
    .locals 1

    new-instance v0, LNz5;

    invoke-direct {v0, p0, p1}, LNz5;-><init>(Lwi2;Lco/bird/android/core/mvp/BaseActivity;)V

    return-object v0
.end method


# virtual methods
.method public b(Lco/bird/android/core/mvp/BaseActivity;)LNz5;
    .locals 1

    iget-object v0, p0, LQz5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwi2;

    invoke-static {v0, p1}, LQz5;->c(Lwi2;Lco/bird/android/core/mvp/BaseActivity;)LNz5;

    move-result-object p1

    return-object p1
.end method
