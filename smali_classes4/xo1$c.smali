.class public Lxo1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxo1;->c(Lco/bird/android/model/persistence/FleetList;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/model/persistence/FleetList;

.field public final synthetic c:Lxo1;


# direct methods
.method public constructor <init>(Lxo1;Lco/bird/android/model/persistence/FleetList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lxo1$c;->c:Lxo1;

    iput-object p2, p0, Lxo1$c;->b:Lco/bird/android/model/persistence/FleetList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lxo1$c;->c:Lxo1;

    invoke-static {v0}, Lxo1;->d(Lxo1;)LEb5;

    move-result-object v0

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, Lxo1$c;->c:Lxo1;

    invoke-static {v0}, Lxo1;->e(Lxo1;)Lcf1;

    move-result-object v0

    iget-object v1, p0, Lxo1$c;->b:Lco/bird/android/model/persistence/FleetList;

    invoke-virtual {v0, v1}, Lcf1;->k(Ljava/lang/Object;)V

    iget-object v0, p0, Lxo1$c;->c:Lxo1;

    invoke-static {v0}, Lxo1;->d(Lxo1;)LEb5;

    move-result-object v0

    invoke-virtual {v0}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lxo1$c;->c:Lxo1;

    invoke-static {v0}, Lxo1;->d(Lxo1;)LEb5;

    move-result-object v0

    invoke-virtual {v0}, LEb5;->g()V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lxo1$c;->c:Lxo1;

    invoke-static {v1}, Lxo1;->d(Lxo1;)LEb5;

    move-result-object v1

    invoke-virtual {v1}, LEb5;->g()V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lxo1$c;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
