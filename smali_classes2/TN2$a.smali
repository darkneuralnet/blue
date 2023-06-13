.class public final LTN2$a;
.super LSN2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTN2;->a(LRN2;LAN2;)LSN2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LSN2<",
        "TS;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J \u0010\u0007\u001a\u00020\u0006\"\u0008\u0008\u0001\u0010\u0003*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0004H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "TN2$a",
        "LSN2;",
        "LAN2;",
        "S",
        "LRN2;",
        "viewModel",
        "LsN2;",
        "e",
        "mvrx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>(LZC0;ZLfD0;Lkotlin/coroutines/CoroutineContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Z",
            "LfD0<",
            "TS;>;",
            "Lkotlin/coroutines/CoroutineContext;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p2, p3, p1, p4}, LSN2;-><init>(ZLEN2;LZC0;Lkotlin/coroutines/CoroutineContext;)V

    return-void
.end method


# virtual methods
.method public e(LRN2;)LsN2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::",
            "LAN2;",
            ">(",
            "LRN2<",
            "TS;>;)",
            "LsN2;"
        }
    .end annotation

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LsN2;->b:LsN2;

    return-object p1
.end method
