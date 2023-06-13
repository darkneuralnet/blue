.class public final LPs5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\"$\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0002\u0010\u0003\"$\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u00008FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\t\u0010\u0005\u001a\u0004\u0008\u0008\u0010\u0003\u00a8\u0006\u000b"
    }
    d2 = {
        "LMs5;",
        "",
        "a",
        "(LMs5;)Ljava/lang/Iterable;",
        "getElementDescriptors$annotations",
        "(LMs5;)V",
        "elementDescriptors",
        "",
        "b",
        "getElementNames$annotations",
        "elementNames",
        "kotlinx-serialization-core"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LMs5;)Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMs5;",
            ")",
            "Ljava/lang/Iterable<",
            "LMs5;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPs5$c;

    invoke-direct {v0, p0}, LPs5$c;-><init>(LMs5;)V

    return-object v0
.end method

.method public static final b(LMs5;)Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMs5;",
            ")",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPs5$d;

    invoke-direct {v0, p0}, LPs5$d;-><init>(LMs5;)V

    return-object v0
.end method
