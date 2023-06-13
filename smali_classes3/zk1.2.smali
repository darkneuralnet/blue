.class public final Lzk1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lyk1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTo2;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJf;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lbg;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTo2;",
            ">;",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "LJf;",
            ">;",
            "LY94<",
            "Lbg;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzk1;->a:LY94;

    iput-object p2, p0, Lzk1;->b:LY94;

    iput-object p3, p0, Lzk1;->c:LY94;

    iput-object p4, p0, Lzk1;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)Lzk1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LTo2;",
            ">;",
            "LY94<",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ">;",
            "LY94<",
            "LJf;",
            ">;",
            "LY94<",
            "Lbg;",
            ">;)",
            "Lzk1;"
        }
    .end annotation

    new-instance v0, Lzk1;

    invoke-direct {v0, p0, p1, p2, p3}, Lzk1;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LTo2;Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;)Lyk1;
    .locals 1

    new-instance v0, Lyk1;

    invoke-direct {v0, p0, p1, p2, p3}, Lyk1;-><init>(LTo2;Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;)V

    return-object v0
.end method


# virtual methods
.method public b()Lyk1;
    .locals 4

    iget-object v0, p0, Lzk1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTo2;

    iget-object v1, p0, Lzk1;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/core/mvp/BaseActivity;

    iget-object v2, p0, Lzk1;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJf;

    iget-object v3, p0, Lzk1;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbg;

    invoke-static {v0, v1, v2, v3}, Lzk1;->c(LTo2;Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;)Lyk1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzk1;->b()Lyk1;

    move-result-object v0

    return-object v0
.end method
