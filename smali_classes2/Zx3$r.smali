.class public final LZx3$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZx3;->K()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/ZoneMarker;",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/ZoneMarker;",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;+",
        "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u00a2\u0001\u0012J\u0008\u0001\u0012F\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\"\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u0001 \u0007*P\u0012J\u0008\u0001\u0012F\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\u0012\u0004\u0012\u00020\u0006 \u0007*\"\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00010\u0001\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/ZoneMarker;",
        "",
        "pairs",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/util/List;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LZx3;


# direct methods
.method public constructor <init>(LZx3;)V
    .locals 0

    iput-object p1, p0, LZx3$r;->g:LZx3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LZx3$r;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/List;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/ZoneMarker;",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/ZoneMarker;",
            "Ljava/lang/Boolean;",
            ">;>;",
            "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;",
            ">;>;"
        }
    .end annotation

    const-string v0, "pairs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/ZoneMarker;

    iget-object v1, p0, LZx3$r;->g:LZx3;

    invoke-static {v1}, LZx3;->access$getZoneManager$p(LZx3;)LQI6;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/persistence/ZoneMarker;->getZoneId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, LQI6;->f0(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LZx3$r$a;

    invoke-direct {v1, p1}, LZx3$r$a;-><init>(Ljava/util/List;)V

    new-instance p1, Lay3;

    invoke-direct {p1, v1}, Lay3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LZx3$r;->b(Ljava/util/List;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
