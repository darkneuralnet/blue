.class final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "PolygonWrapper"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u00082\u00103J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0014\u0010\n\u001a\u00020\u00022\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0004J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\u000c\u001a\u00020\u0002R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\"\u0004\u0008\u0003\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001fR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\r0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001fR\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u001b\u0010)\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\u000c\u001a\u0004\u0008%\u0010&*\u0004\u0008\'\u0010(R$\u0010/\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R\u0011\u00100\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u00080\u0010\u0013R\u0011\u00101\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\u00081\u0010\u0013\u00a8\u00064"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;",
        "",
        "",
        "setModified",
        "",
        "LWB1;",
        "holes",
        "simplifyHoles",
        "Lco/bird/android/model/persistence/Area;",
        "areas",
        "setHolesFromAreas",
        "addToMap",
        "removeFromMap",
        "Lco/bird/android/model/Polygonable;",
        "_polygonable",
        "Lco/bird/android/model/Polygonable;",
        "",
        "isModified",
        "Z",
        "()Z",
        "(Z)V",
        "",
        "size",
        "D",
        "getSize",
        "()D",
        "LDX3;",
        "polygon",
        "LDX3;",
        "",
        "LCX3;",
        "Ljava/util/List;",
        "areasToCut",
        "Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;",
        "Lcom/google/android/gms/maps/model/PolygonOptions;",
        "resettableOptions",
        "Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;",
        "getOption",
        "()Lcom/google/android/gms/maps/model/PolygonOptions;",
        "getOption$delegate",
        "(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;)Ljava/lang/Object;",
        "option",
        "value",
        "getPolygonable",
        "()Lco/bird/android/model/Polygonable;",
        "setPolygonable",
        "(Lco/bird/android/model/Polygonable;)V",
        "polygonable",
        "isAdded",
        "isLatestRendered",
        "<init>",
        "(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lco/bird/android/model/Polygonable;)V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,518:1\n11335#2:519\n11670#2,3:520\n1549#3:523\n1620#3,3:524\n1549#3:527\n1620#3,3:528\n1549#3:531\n1620#3,3:532\n1054#3:536\n1789#3,3:537\n1#4:535\n*S KotlinDebug\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper\n*L\n313#1:519\n313#1:520,3\n353#1:523\n353#1:524,3\n362#1:527\n362#1:528,3\n364#1:531\n364#1:532,3\n396#1:536\n412#1:537,3\n*E\n"
    }
.end annotation


# instance fields
.field private _polygonable:Lco/bird/android/model/Polygonable;

.field private final areasToCut:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/Polygonable;",
            ">;"
        }
    .end annotation
.end field

.field private final holes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LCX3;",
            ">;"
        }
    .end annotation
.end field

.field private isModified:Z

.field private polygon:LDX3;

.field private final resettableOptions:Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/app/feature/map/ui/renderer/MutableLazy<",
            "Lcom/google/android/gms/maps/model/PolygonOptions;",
            ">;"
        }
    .end annotation
.end field

.field private final size:D

.field final synthetic this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lco/bird/android/model/Polygonable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Polygonable;",
            ")V"
        }
    .end annotation

    const-string v0, "_polygonable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->_polygonable:Lco/bird/android/model/Polygonable;

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->getPolygonable()Lco/bird/android/model/Polygonable;

    move-result-object p1

    invoke-interface {p1}, Lco/bird/android/model/Polygonable;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lco/bird/android/model/Polygon;->getRing(I)Lco/bird/android/model/LinearRing;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/PointComposedGeom;->getPoints()[Lco/bird/android/model/Point;

    move-result-object p1

    const-string v0, "polygonable.region.getRing(0).points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    :goto_0
    if-ge p2, v1, :cond_0

    aget-object v2, p1, p2

    const-string v3, "point"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toLatLng(Lco/bird/android/model/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, LRN5;->b(Ljava/util/List;)D

    move-result-wide p1

    iput-wide p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->size:D

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->holes:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->areasToCut:Ljava/util/List;

    sget-object p1, Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;->Companion:Lco/bird/android/app/feature/map/ui/renderer/MutableLazy$Companion;

    new-instance p2, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1;

    invoke-direct {p2, p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$resettableOptions$1;-><init>(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;)V

    invoke-virtual {p1, p2}, Lco/bird/android/app/feature/map/ui/renderer/MutableLazy$Companion;->resettableLazy(Lkotlin/jvm/functions/Function0;)Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->resettableOptions:Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;

    return-void
.end method

.method public static final synthetic access$getHoles$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->holes:Ljava/util/List;

    return-object p0
.end method

.method private final getOption()Lcom/google/android/gms/maps/model/PolygonOptions;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->resettableOptions:Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/PolygonOptions;

    return-object v0
.end method

.method private static getOption$delegate(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->resettableOptions:Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;

    return-object p0
.end method

.method private final setModified()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->isModified:Z

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->resettableOptions:Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/ui/renderer/MutableLazy;->reset()V

    return-void
.end method

.method private final simplifyHoles(Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "LWB1;",
            ">;)",
            "Ljava/util/List<",
            "LWB1;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-object p1

    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$$inlined$sortedByDescending$1;

    invoke-direct {v2}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$$inlined$sortedByDescending$1;-><init>()V

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->asSequence(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    move-result-object v2

    new-instance v3, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2;

    invoke-direct {v3, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper$simplifyHoles$reshuffledHoles$2;-><init>(Ljava/util/List;)V

    invoke-static {v2, v3}, Lkotlin/sequences/SequencesKt;->mapIndexedNotNull(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;

    move-result-object v2

    invoke-static {v2}, Lkotlin/sequences/SequencesKt;->firstOrNull(Lkotlin/sequences/Sequence;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlin/Pair;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LWB1;

    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LWB1;

    const/4 v4, 0x2

    new-array v4, v4, [LWB1;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    aput-object v2, v4, v1

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->union(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-interface {v0, v1, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LWB1;

    check-cast p1, LWB1;

    invoke-virtual {p1, v1}, LWB1;->o(LWB1;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v1}, LWB1;->q(LWB1;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {p1, v1}, LWB1;->H0(LWB1;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    :goto_1
    invoke-virtual {p1, v1}, LWB1;->I0(LWB1;)LWB1;

    move-result-object p1

    const-string v1, "geometry.union(hole)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    check-cast p1, LWB1;

    invoke-static {v2, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->simplifyHoles(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :cond_5
    return-object p1
.end method


# virtual methods
.method public final addToMap()V
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->isLatestRendered()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->removeFromMap()V

    :cond_1
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->this$0:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;->access$getMap$p(Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;)LcD1;

    move-result-object v0

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->getOption()Lcom/google/android/gms/maps/model/PolygonOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, LcD1;->d(Lcom/google/android/gms/maps/model/PolygonOptions;)LDX3;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->getPolygonable()Lco/bird/android/model/Polygonable;

    move-result-object v1

    invoke-virtual {v0, v1}, LDX3;->d(Ljava/lang/Object;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->polygon:LDX3;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->isModified:Z

    return-void
.end method

.method public final getPolygonable()Lco/bird/android/model/Polygonable;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->_polygonable:Lco/bird/android/model/Polygonable;

    return-object v0
.end method

.method public final getSize()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->size:D

    return-wide v0
.end method

.method public final isAdded()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->polygon:LDX3;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isLatestRendered()Z
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->isModified:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isModified()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->isModified:Z

    return v0
.end method

.method public final removeFromMap()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->polygon:LDX3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LDX3;->c()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const/4 v0, 0x0

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->polygon:LDX3;

    :cond_0
    return-void
.end method

.method public final setHolesFromAreas(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Area;",
            ">;)V"
        }
    .end annotation

    const-string v0, "areas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->areasToCut:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0xa

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->areasToCut:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/Polygonable;

    invoke-interface {v3}, Lco/bird/android/model/Polygonable;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/persistence/Area;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/Area;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-interface {v1, v3}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->areasToCut:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->areasToCut:Ljava/util/List;

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/Area;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Area;->getJtsRegion()LCX3;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-direct {p0, v0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->simplifyHoles(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->holes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->holes:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LWB1;

    const-string v3, "null cannot be cast to non-null type org.locationtech.jts.geom.Polygon"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LCX3;

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->setModified()V

    return-void
.end method

.method public final setModified(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->isModified:Z

    return-void
.end method

.method public final setPolygonable(Lco/bird/android/model/Polygonable;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->_polygonable:Lco/bird/android/model/Polygonable;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->setModified()V

    :cond_0
    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$PolygonWrapper;->_polygonable:Lco/bird/android/model/Polygonable;

    return-void
.end method
