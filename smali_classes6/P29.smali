.class public final LP29;
.super LZ29;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        "X:",
        "Ljava/lang/Throwable;",
        ">",
        "LZ29<",
        "TV;TX;",
        "Lk69<",
        "-TX;+TV;>;",
        "LMb9<",
        "+TV;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(LMb9;Ljava/lang/Class;Lk69;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMb9<",
            "+TV;>;",
            "Ljava/lang/Class<",
            "TX;>;",
            "Lk69<",
            "-TX;+TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, LZ29;-><init>(LMb9;Ljava/lang/Class;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic D(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-interface {p1, p2}, Lk69;->zza(Ljava/lang/Object;)LMb9;

    move-result-object p2

    const-string v0, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"

    invoke-static {p2, v0, p1}, LyK8;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final bridge synthetic E(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lv39;->g(LMb9;)Z

    return-void
.end method
