.class public final Lsv6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lrv6;",
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
            "Ls6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "Ls6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsv6;->a:LY94;

    iput-object p2, p0, Lsv6;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)Lsv6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "Ls6;",
            ">;)",
            "Lsv6;"
        }
    .end annotation

    new-instance v0, Lsv6;

    invoke-direct {v0, p0, p1}, Lsv6;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/core/mvp/BaseActivity;Ls6;)Lrv6;
    .locals 1

    new-instance v0, Lrv6;

    invoke-direct {v0, p0, p1}, Lrv6;-><init>(Lco/bird/android/core/mvp/BaseActivity;Ls6;)V

    return-object v0
.end method


# virtual methods
.method public b()Lrv6;
    .locals 2

    iget-object v0, p0, Lsv6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v1, p0, Lsv6;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls6;

    invoke-static {v0, v1}, Lsv6;->c(Lco/bird/android/core/mvp/BaseActivity;Ls6;)Lrv6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsv6;->b()Lrv6;

    move-result-object v0

    return-object v0
.end method
