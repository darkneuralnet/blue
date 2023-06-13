.class public final Ll63;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lio/reactivex/functions/g<",
        "Ljava/lang/Throwable;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:LP43;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LP43;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Landroid/os/Handler;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll63;->a:LP43;

    iput-object p2, p0, Ll63;->b:LY94;

    iput-object p3, p0, Ll63;->c:LY94;

    return-void
.end method

.method public static a(LP43;LY94;LY94;)Ll63;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "Landroid/os/Handler;",
            ">;)",
            "Ll63;"
        }
    .end annotation

    new-instance v0, Ll63;

    invoke-direct {v0, p0, p1, p2}, Ll63;-><init>(LP43;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LP43;Landroid/content/Context;Landroid/os/Handler;)Lio/reactivex/functions/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LP43;",
            "Landroid/content/Context;",
            "Landroid/os/Handler;",
            ")",
            "Lio/reactivex/functions/g<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LP43;->y0(Landroid/content/Context;Landroid/os/Handler;)Lio/reactivex/functions/g;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/functions/g;

    return-object p0
.end method


# virtual methods
.method public b()Lio/reactivex/functions/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/functions/g<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll63;->a:LP43;

    iget-object v1, p0, Ll63;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Ll63;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Handler;

    invoke-static {v0, v1, v2}, Ll63;->c(LP43;Landroid/content/Context;Landroid/os/Handler;)Lio/reactivex/functions/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ll63;->b()Lio/reactivex/functions/g;

    move-result-object v0

    return-object v0
.end method
