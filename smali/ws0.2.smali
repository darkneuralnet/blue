.class public final Lws0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a,\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "a",
        "b",
        "c",
        "Lkotlin/Pair;",
        "Lvs0;",
        "num",
        "animation-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,112:1\n103#1:113\n107#1:119\n103#1:123\n103#1:134\n35#2,2:114\n72#2,3:116\n66#2,3:120\n35#2,2:124\n72#2,3:126\n35#2,2:129\n66#2,3:131\n35#2,2:135\n54#2,3:137\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n*L\n86#1:113\n87#1:119\n87#1:123\n107#1:134\n86#1:114,2\n86#1:116,3\n87#1:120,3\n87#1:124,2\n87#1:126,3\n103#1:129,2\n107#1:131,3\n107#1:135,2\n111#1:137,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(DDD)Lkotlin/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DDD)",
            "Lkotlin/Pair<",
            "Lvs0;",
            "Lvs0;",
            ">;"
        }
    .end annotation

    neg-double v0, p2

    mul-double/2addr p2, p2

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    mul-double/2addr v2, p0

    mul-double/2addr v2, p4

    sub-double/2addr p2, v2

    invoke-static {p2, p3}, Lws0;->b(D)Lvs0;

    move-result-object p4

    invoke-static {p4}, Lvs0;->b(Lvs0;)D

    move-result-wide v2

    add-double/2addr v2, v0

    invoke-static {p4, v2, v3}, Lvs0;->d(Lvs0;D)V

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    mul-double/2addr p0, v2

    invoke-static {p4}, Lvs0;->b(Lvs0;)D

    move-result-wide v2

    div-double/2addr v2, p0

    invoke-static {p4, v2, v3}, Lvs0;->d(Lvs0;D)V

    invoke-static {p4}, Lvs0;->a(Lvs0;)D

    move-result-wide v2

    div-double/2addr v2, p0

    invoke-static {p4, v2, v3}, Lvs0;->c(Lvs0;D)V

    invoke-static {p2, p3}, Lws0;->b(D)Lvs0;

    move-result-object p2

    invoke-static {p2}, Lvs0;->b(Lvs0;)D

    move-result-wide v2

    const/4 p3, -0x1

    int-to-double v4, p3

    mul-double/2addr v2, v4

    invoke-static {p2, v2, v3}, Lvs0;->d(Lvs0;D)V

    invoke-static {p2}, Lvs0;->a(Lvs0;)D

    move-result-wide v2

    mul-double/2addr v2, v4

    invoke-static {p2, v2, v3}, Lvs0;->c(Lvs0;D)V

    invoke-static {p2}, Lvs0;->b(Lvs0;)D

    move-result-wide v2

    add-double/2addr v2, v0

    invoke-static {p2, v2, v3}, Lvs0;->d(Lvs0;D)V

    invoke-static {p2}, Lvs0;->b(Lvs0;)D

    move-result-wide v0

    div-double/2addr v0, p0

    invoke-static {p2, v0, v1}, Lvs0;->d(Lvs0;D)V

    invoke-static {p2}, Lvs0;->a(Lvs0;)D

    move-result-wide v0

    div-double/2addr v0, p0

    invoke-static {p2, v0, v1}, Lvs0;->c(Lvs0;D)V

    invoke-static {p4, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final b(D)Lvs0;
    .locals 3

    const-wide/16 v0, 0x0

    cmpg-double v2, p0, v0

    if-gez v2, :cond_0

    new-instance v2, Lvs0;

    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    invoke-direct {v2, v0, v1, p0, p1}, Lvs0;-><init>(DD)V

    goto :goto_0

    :cond_0
    new-instance v2, Lvs0;

    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    invoke-direct {v2, p0, p1, v0, v1}, Lvs0;-><init>(DD)V

    :goto_0
    return-object v2
.end method
