.class public final LlJ4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0012\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000*$\u0008\u0002\u0010\u0005\"\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "LpI4;",
        "Ljava/util/concurrent/Callable;",
        "LFM4;",
        "a",
        "Lkotlin/Pair;",
        "RequestTaskResult",
        "fuel"
    }
    k = 0x2
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LpI4;)Ljava/util/concurrent/Callable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LpI4;",
            ")",
            "Ljava/util/concurrent/Callable<",
            "LFM4;",
            ">;"
        }
    .end annotation

    const-string v0, "$this$toTask"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LkJ4;

    invoke-direct {v0, p0}, LkJ4;-><init>(LpI4;)V

    return-object v0
.end method
