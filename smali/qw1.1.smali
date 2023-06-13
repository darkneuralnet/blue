.class public final Lqw1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a;\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "resId",
        "LJw1;",
        "weight",
        "LEw1;",
        "style",
        "Luw1;",
        "loadingStrategy",
        "Lew1;",
        "a",
        "(ILJw1;II)Lew1;",
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
.method public static final a(ILJw1;II)Lew1;
    .locals 8

    const-string v0, "weight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LgM4;

    new-instance v5, LIw1;

    const/4 v1, 0x0

    new-array v1, v1, [LHw1;

    invoke-direct {v5, v1}, LIw1;-><init>([LHw1;)V

    const/4 v7, 0x0

    move-object v1, v0

    move v2, p0

    move-object v3, p1

    move v4, p2

    move v6, p3

    invoke-direct/range {v1 .. v7}, LgM4;-><init>(ILJw1;ILIw1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic b(ILJw1;IIILjava/lang/Object;)Lew1;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p1, LJw1;->c:LJw1$a;

    invoke-virtual {p1}, LJw1$a;->d()LJw1;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_1

    sget-object p2, LEw1;->b:LEw1$a;

    invoke-virtual {p2}, LEw1$a;->b()I

    move-result p2

    :cond_1
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_2

    sget-object p3, Luw1;->a:Luw1$a;

    invoke-virtual {p3}, Luw1$a;->b()I

    move-result p3

    :cond_2
    invoke-static {p0, p1, p2, p3}, Lqw1;->a(ILJw1;II)Lew1;

    move-result-object p0

    return-object p0
.end method
