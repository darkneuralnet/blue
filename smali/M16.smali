.class public final LM16;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "LL16;",
        "start",
        "stop",
        "",
        "fraction",
        "a",
        "ui-text_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(LL16;LL16;F)LL16;
    .locals 3

    const-string v0, "start"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stop"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LL16;

    invoke-virtual {p0}, LL16;->b()F

    move-result v1

    invoke-virtual {p1}, LL16;->b()F

    move-result v2

    invoke-static {v1, v2, p2}, LYM2;->a(FFF)F

    move-result v1

    invoke-virtual {p0}, LL16;->c()F

    move-result p0

    invoke-virtual {p1}, LL16;->c()F

    move-result p1

    invoke-static {p0, p1, p2}, LYM2;->a(FFF)F

    move-result p0

    invoke-direct {v0, v1, p0}, LL16;-><init>(FF)V

    return-object v0
.end method
