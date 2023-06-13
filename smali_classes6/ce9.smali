.class public final Lce9;
.super LFb9;
.source "SourceFile"


# instance fields
.field public final d:Ljava/util/concurrent/Callable;

.field public final synthetic e:Lke9;


# direct methods
.method public constructor <init>(Lke9;Ljava/util/concurrent/Callable;)V
    .locals 0

    iput-object p1, p0, Lce9;->e:Lke9;

    invoke-direct {p0}, LFb9;-><init>()V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Lce9;->d:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lce9;->d:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lce9;->d:Ljava/util/concurrent/Callable;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lce9;->e:Lke9;

    invoke-virtual {v0, p1}, Lv39;->x(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lce9;->e:Lke9;

    invoke-virtual {v0, p1}, Lv39;->w(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lce9;->e:Lke9;

    invoke-virtual {v0}, Lv39;->isDone()Z

    move-result v0

    return v0
.end method
