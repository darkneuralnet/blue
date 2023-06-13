.class public final LN39;
.super Lf49;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Lf49<",
        "TI;TO;",
        "Lk69<",
        "-TI;+TO;>;",
        "LMb9<",
        "+TO;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(LMb9;Lk69;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMb9<",
            "+TI;>;",
            "Lk69<",
            "-TI;+TO;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lf49;-><init>(LMb9;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic D(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Lk69;

    invoke-interface {p1, p2}, Lk69;->zza(Ljava/lang/Object;)LMb9;

    move-result-object p2

    const-string v0, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s"

    invoke-static {p2, v0, p1}, LyK8;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final bridge synthetic E(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LMb9;

    invoke-virtual {p0, p1}, Lv39;->g(LMb9;)Z

    return-void
.end method
