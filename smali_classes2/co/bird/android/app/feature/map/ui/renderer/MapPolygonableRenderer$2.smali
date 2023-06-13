.class final Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;-><init>(LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/model/wire/configs/MobileMapConfigView;Ldr4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Polygonable;",
        ">;",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Polygonable;",
        ">;>;",
        "Lkotlin/Pair<",
        "+",
        "Lcom/google/android/gms/maps/model/VisibleRegion;",
        "+",
        "Ljava/lang/Float;",
        ">;",
        "Lkotlin/Triple<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Polygonable;",
        ">;+",
        "Lcom/google/android/gms/maps/model/VisibleRegion;",
        "+",
        "Ljava/lang/Float;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u00082\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u000bH\n\u00a2\u0006\u0002\u0008\u000c"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/Triple;",
        "",
        "Lco/bird/android/model/Polygonable;",
        "Lcom/google/android/gms/maps/model/VisibleRegion;",
        "",
        "polygonables",
        "additionalPolygonables",
        "",
        "",
        "pair",
        "Lkotlin/Pair;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$2;

    invoke-direct {v0}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$2;-><init>()V

    sput-object v0, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$2;->INSTANCE:Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/Map;

    check-cast p3, Lkotlin/Pair;

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$2;->invoke(Ljava/util/List;Ljava/util/Map;Lkotlin/Pair;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/util/List;Ljava/util/Map;Lkotlin/Pair;)Lkotlin/Triple;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/Polygonable;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/Polygonable;",
            ">;>;",
            "Lkotlin/Pair<",
            "Lcom/google/android/gms/maps/model/VisibleRegion;",
            "Ljava/lang/Float;",
            ">;)",
            "Lkotlin/Triple<",
            "Ljava/util/List<",
            "Lco/bird/android/model/Polygonable;",
            ">;",
            "Lcom/google/android/gms/maps/model/VisibleRegion;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    const-string v0, "polygonables"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalPolygonables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pair"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/Triple;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p3

    invoke-direct {v0, p1, p2, p3}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
