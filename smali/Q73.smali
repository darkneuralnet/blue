.class public final LQ73;
.super Ldz0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldz0<",
        "LP73;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\n\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0008\u0010\u0004\u001a\u00020\u0003H\u0016J\u0008\u0010\u0005\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0017"
    }
    d2 = {
        "LQ73;",
        "Ldz0;",
        "LP73;",
        "",
        "h",
        "i",
        "Landroid/net/ConnectivityManager;",
        "f",
        "Landroid/net/ConnectivityManager;",
        "connectivityManager",
        "Q73$a",
        "g",
        "LQ73$a;",
        "networkCallback",
        "k",
        "()LP73;",
        "initialState",
        "Landroid/content/Context;",
        "context",
        "LmZ5;",
        "taskExecutor",
        "<init>",
        "(Landroid/content/Context;LmZ5;)V",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final f:Landroid/net/ConnectivityManager;

.field public final g:LQ73$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;LmZ5;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taskExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Ldz0;-><init>(Landroid/content/Context;LmZ5;)V

    invoke-virtual {p0}, Ldz0;->d()Landroid/content/Context;

    move-result-object p1

    const-string p2, "connectivity"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/net/ConnectivityManager;

    iput-object p1, p0, LQ73;->f:Landroid/net/ConnectivityManager;

    new-instance p1, LQ73$a;

    invoke-direct {p1, p0}, LQ73$a;-><init>(LQ73;)V

    iput-object p1, p0, LQ73;->g:LQ73$a;

    return-void
.end method

.method public static final synthetic j(LQ73;)Landroid/net/ConnectivityManager;
    .locals 0

    iget-object p0, p0, LQ73;->f:Landroid/net/ConnectivityManager;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic e()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQ73;->k()LP73;

    move-result-object v0

    return-object v0
.end method

.method public h()V
    .locals 4

    const-string v0, "Received exception while registering network callback"

    :try_start_0
    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v1

    invoke-static {}, LR73;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Registering network callback"

    invoke-virtual {v1, v2, v3}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LQ73;->f:Landroid/net/ConnectivityManager;

    iget-object v2, p0, LQ73;->g:LQ73$a;

    invoke-static {v1, v2}, Lx73;->a(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v2

    invoke-static {}, LR73;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, LBx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v1

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v2

    invoke-static {}, LR73;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, LBx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public i()V
    .locals 4

    const-string v0, "Received exception while unregistering network callback"

    :try_start_0
    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v1

    invoke-static {}, LR73;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Unregistering network callback"

    invoke-virtual {v1, v2, v3}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LQ73;->f:Landroid/net/ConnectivityManager;

    iget-object v2, p0, LQ73;->g:LQ73$a;

    invoke-static {v1, v2}, Lv73;->c(Landroid/net/ConnectivityManager;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v2

    invoke-static {}, LR73;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, LBx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v1

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v2

    invoke-static {}, LR73;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, LBx2;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public k()LP73;
    .locals 1

    iget-object v0, p0, LQ73;->f:Landroid/net/ConnectivityManager;

    invoke-static {v0}, LR73;->c(Landroid/net/ConnectivityManager;)LP73;

    move-result-object v0

    return-object v0
.end method
