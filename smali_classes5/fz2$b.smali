.class public Lfz2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfz2;->a(Landroid/content/Context;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/z<",
        "LBy0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Landroid/net/ConnectivityManager;

.field public final synthetic d:Lfz2;


# direct methods
.method public constructor <init>(Lfz2;Landroid/content/Context;Landroid/net/ConnectivityManager;)V
    .locals 0

    iput-object p1, p0, Lfz2$b;->d:Lfz2;

    iput-object p2, p0, Lfz2$b;->b:Landroid/content/Context;

    iput-object p3, p0, Lfz2$b;->c:Landroid/net/ConnectivityManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public subscribe(Lio/reactivex/y;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "LBy0;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lfz2$b;->d:Lfz2;

    iget-object v1, p0, Lfz2$b;->b:Landroid/content/Context;

    invoke-static {v0, p1, v1}, Lfz2;->e(Lfz2;Lio/reactivex/y;Landroid/content/Context;)Landroid/net/ConnectivityManager$NetworkCallback;

    move-result-object p1

    invoke-static {v0, p1}, Lfz2;->d(Lfz2;Landroid/net/ConnectivityManager$NetworkCallback;)Landroid/net/ConnectivityManager$NetworkCallback;

    new-instance p1, Landroid/net/NetworkRequest$Builder;

    invoke-direct {p1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    invoke-virtual {p1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object p1

    iget-object v0, p0, Lfz2$b;->c:Landroid/net/ConnectivityManager;

    iget-object v1, p0, Lfz2$b;->d:Lfz2;

    invoke-static {v1}, Lfz2;->c(Lfz2;)Landroid/net/ConnectivityManager$NetworkCallback;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method
