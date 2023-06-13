.class public final LgE3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a-\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "Key",
        "LZD3$d;",
        "key",
        "LfE3$a;",
        "a",
        "(LZD3$d;Ljava/lang/Object;)LfE3$a;",
        "paging-common"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final a(LZD3$d;Ljava/lang/Object;)LfE3$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Key:",
            "Ljava/lang/Object;",
            ">(",
            "LZD3$d;",
            "TKey;)",
            "LfE3$a<",
            "TKey;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LfE3$a$d;

    iget v1, p0, LZD3$d;->d:I

    iget-boolean p0, p0, LZD3$d;->c:Z

    invoke-direct {v0, p1, v1, p0}, LfE3$a$d;-><init>(Ljava/lang/Object;IZ)V

    return-object v0
.end method
