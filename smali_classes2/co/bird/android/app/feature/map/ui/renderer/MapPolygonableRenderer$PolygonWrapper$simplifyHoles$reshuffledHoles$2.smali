.class final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->simplifyHoles(Ljava/util/List;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Integer;",
        "LWB1;",
        "Lkotlin/Pair<",
        "+",
        "LWB1;",
        "+",
        "LWB1;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "idx",
        "LWB1;",
        "hole",
        "Lkotlin/Pair;",
        "invoke",
        "(ILWB1;)Lkotlin/Pair;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,518:1\n179#2,2:519\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2\n*L\n401#1:519,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $holes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LWB1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "LWB1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2;->$holes:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, LWB1;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2;->invoke(ILWB1;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ILWB1;)Lkotlin/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LWB1;",
            ")",
            "Lkotlin/Pair<",
            "LWB1;",
            "LWB1;",
            ">;"
        }
    .end annotation

    const-string v0, "hole"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2;->$holes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->asSequence(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    move-result-object p1

    new-instance v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2$1;

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2;->$holes:Ljava/util/List;

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2$1;-><init>(Ljava/lang/Object;)V

    invoke-static {p1, v0}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object p1

    invoke-interface {p1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LWB1;

    invoke-virtual {p2, v2}, LWB1;->H0(LWB1;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {p2, v2}, LWB1;->q(LWB1;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {p2, v2}, LWB1;->A0(LWB1;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {p2, v2}, LWB1;->l(LWB1;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {p2, v2}, LWB1;->J0(LWB1;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_0

    goto :goto_2

    :cond_3
    move-object v0, v1

    :goto_2
    check-cast v0, LWB1;

    if-nez v0, :cond_4

    return-object v1

    :cond_4
    invoke-static {p2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method
