.class public final LzX2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "LyX2;",
        "LOs4;",
        "a",
        "ui-geometry_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LyX2;)LOs4;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LOs4;

    invoke-virtual {p0}, LyX2;->b()F

    move-result v1

    invoke-virtual {p0}, LyX2;->d()F

    move-result v2

    invoke-virtual {p0}, LyX2;->c()F

    move-result v3

    invoke-virtual {p0}, LyX2;->a()F

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, LOs4;-><init>(FFFF)V

    return-object v0
.end method
