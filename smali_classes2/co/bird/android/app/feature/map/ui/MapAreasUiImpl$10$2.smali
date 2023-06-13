.class final Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$10$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$10;->invoke(Ljava/util/List;)Lna4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/Area;",
        "Lio/reactivex/u<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/Area;",
        "+",
        "Lcom/google/android/gms/maps/model/GroundOverlayOptions;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0008\u001ab\u0012*\u0008\u0001\u0012&\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003 \u0005*0\u0012*\u0008\u0001\u0012&\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/model/persistence/Area;",
        "area",
        "Lio/reactivex/u;",
        "Lkotlin/Pair;",
        "Lcom/google/android/gms/maps/model/GroundOverlayOptions;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lco/bird/android/model/persistence/Area;)Lio/reactivex/u;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$10$2;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$10$2;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lco/bird/android/model/persistence/Area;)Lio/reactivex/u;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/Area;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/Area;",
            "Lcom/google/android/gms/maps/model/GroundOverlayOptions;",
            ">;>;"
        }
    .end annotation

    const-string v0, "area"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->isDemandArea()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$10$2;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->getOverlayLabel()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, v0

    move-object v3, p1

    invoke-static/range {v1 .. v7}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->toBitmapDescriptor$default(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Ljava/lang/String;Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LPT;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x8

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->getGroundOverlayOptions$default(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Lco/bird/android/model/persistence/Area;LPT;ZZILjava/lang/Object;)Lio/reactivex/p;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$10$2$1;

    invoke-direct {v1, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$10$2$1;-><init>(Lco/bird/android/model/persistence/Area;)V

    new-instance p1, Lco/bird/android/app/feature/map/ui/c;

    invoke-direct {p1, v1}, Lco/bird/android/app/feature/map/ui/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    const-string v0, "area ->\n            if (\u2026ndOverlay }\n            }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    const-string v0, "{\n              Maybe.ju\u2026ea to null)\n            }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/Area;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$10$2;->invoke(Lco/bird/android/model/persistence/Area;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
