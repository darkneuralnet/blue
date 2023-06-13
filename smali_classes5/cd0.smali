.class public final Lcd0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "LpI4;",
        "",
        "a",
        "(LpI4;)Z",
        "isCancelled",
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
.method public static final a(LpI4;)Z
    .locals 1

    const-string v0, "$this$isCancelled"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbd0;->f:Lbd0$a;

    invoke-interface {p0}, LMI4;->getRequest()LpI4;

    move-result-object p0

    invoke-virtual {v0, p0}, Lbd0$a;->b(LpI4;)Lbd0;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lbd0;->isCancelled()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
