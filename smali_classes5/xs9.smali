.class public final Lxs9;
.super Len7;
.source "SourceFile"


# instance fields
.field public final d:Ljava/util/concurrent/Callable;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/concurrent/Callable;)V
    .locals 0

    const-string p1, "internal.appMetadata"

    invoke-direct {p0, p1}, Len7;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lxs9;->d:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public final d(Lam8;Ljava/util/List;)LXs7;
    .locals 0

    :try_start_0
    iget-object p1, p0, Lxs9;->d:Ljava/util/concurrent/Callable;

    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LeA8;->b(Ljava/lang/Object;)LXs7;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    sget-object p1, LXs7;->h0:LXs7;

    return-object p1
.end method
