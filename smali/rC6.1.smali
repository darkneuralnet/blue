.class public final LrC6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "LD32;",
        "LG32;",
        "b",
        "insets",
        "",
        "name",
        "LKj6;",
        "a",
        "foundation-layout_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LD32;Ljava/lang/String;)LKj6;
    .locals 1

    const-string v0, "insets"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKj6;

    invoke-static {p0}, LrC6;->b(LD32;)LG32;

    move-result-object p0

    invoke-direct {v0, p0, p1}, LKj6;-><init>(LG32;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final b(LD32;)LG32;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LG32;

    iget v1, p0, LD32;->a:I

    iget v2, p0, LD32;->b:I

    iget v3, p0, LD32;->c:I

    iget p0, p0, LD32;->d:I

    invoke-direct {v0, v1, v2, v3, p0}, LG32;-><init>(IIII)V

    return-object v0
.end method
