.class public final Lmk6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aC\u0010\u0008\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0018\u0010\u000c\u001a\u00020\u0003*\u0006\u0012\u0002\u0008\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002\u001a3\u0010\u0012\u001a\u00020\u0011\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u0008\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lvf;",
        "V",
        "Llk6;",
        "",
        "playTimeMillis",
        "start",
        "end",
        "startVelocity",
        "e",
        "(Llk6;JLvf;Lvf;Lvf;)Lvf;",
        "Lok6;",
        "playTime",
        "c",
        "visibilityThreshold",
        "",
        "dampingRatio",
        "stiffness",
        "Lxf;",
        "d",
        "(Lvf;FF)Lxf;",
        "animation-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final synthetic a(Lok6;J)J
    .locals 0

    invoke-static {p0, p1, p2}, Lmk6;->c(Lok6;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic b(Lvf;FF)Lxf;
    .locals 0

    invoke-static {p0, p1, p2}, Lmk6;->d(Lvf;FF)Lxf;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lok6;J)J
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok6<",
            "*>;J)J"
        }
    .end annotation

    invoke-interface {p0}, Lok6;->f()I

    move-result v0

    int-to-long v0, v0

    sub-long v2, p1, v0

    const-wide/16 v4, 0x0

    invoke-interface {p0}, Lok6;->g()I

    move-result p0

    int-to-long v6, p0

    invoke-static/range {v2 .. v7}, Lkotlin/ranges/RangesKt;->coerceIn(JJJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final d(Lvf;FF)Lxf;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Lvf;",
            ">(TV;FF)",
            "Lxf;"
        }
    .end annotation

    if-eqz p0, :cond_0

    new-instance v0, Lmk6$a;

    invoke-direct {v0, p0, p1, p2}, Lmk6$a;-><init>(Lvf;FF)V

    return-object v0

    :cond_0
    new-instance p0, Lmk6$b;

    invoke-direct {p0, p1, p2}, Lmk6$b;-><init>(FF)V

    return-object p0
.end method

.method public static final e(Llk6;JLvf;Lvf;Lvf;)Lvf;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Lvf;",
            ">(",
            "Llk6<",
            "TV;>;JTV;TV;TV;)TV;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "start"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "end"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startVelocity"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/32 v0, 0xf4240

    mul-long v3, p1, v0

    move-object v2, p0

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-interface/range {v2 .. v7}, Llk6;->e(JLvf;Lvf;Lvf;)Lvf;

    move-result-object p0

    return-object p0
.end method
