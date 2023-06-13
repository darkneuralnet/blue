.class public Lfz2$c;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfz2;->f(Lio/reactivex/y;Landroid/content/Context;)Landroid/net/ConnectivityManager$NetworkCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lio/reactivex/y;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lfz2;


# direct methods
.method public constructor <init>(Lfz2;Lio/reactivex/y;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lfz2$c;->c:Lfz2;

    iput-object p2, p0, Lfz2$c;->a:Lio/reactivex/y;

    iput-object p3, p0, Lfz2$c;->b:Landroid/content/Context;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lfz2$c;->a:Lio/reactivex/y;

    iget-object v0, p0, Lfz2$c;->b:Landroid/content/Context;

    invoke-static {v0}, LBy0;->c(Landroid/content/Context;)LBy0;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lfz2$c;->a:Lio/reactivex/y;

    iget-object v0, p0, Lfz2$c;->b:Landroid/content/Context;

    invoke-static {v0}, LBy0;->c(Landroid/content/Context;)LBy0;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method
