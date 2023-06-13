.class final Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$7;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;-><init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;LOh;Ldr4;)V
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
        "Lcom/google/android/gms/maps/model/GroundOverlayOptions;",
        "+",
        "Lco/bird/android/model/persistence/Area;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0008\u001aZ\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0005*,\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
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

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$7;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$7;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

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
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/Area;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lkotlin/Pair<",
            "Lcom/google/android/gms/maps/model/GroundOverlayOptions;",
            "Lco/bird/android/model/persistence/Area;",
            ">;>;"
        }
    .end annotation

    const-string v0, "area"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$7;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$getAreaGroundOverlay$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LfE1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LfE1;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v3, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$7;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-static {v3}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$getAreaGroundOverlay$p(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LfE1;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, LfE1;->b()Z

    move-result v2

    :cond_1
    iget-object v10, p0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$7;->this$0:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->getOverlayLabel()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v3, v10

    move-object v5, p1

    invoke-static/range {v3 .. v9}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->toBitmapDescriptor$default(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Ljava/lang/String;Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LPT;

    move-result-object v3

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->getSelectedOverlayLabel()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v3, v10

    move-object v5, p1

    invoke-static/range {v3 .. v9}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->toBitmapDescriptor$default(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Ljava/lang/String;Lco/bird/android/model/persistence/Area;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LPT;

    move-result-object v3

    :goto_1
    xor-int/2addr v0, v1

    invoke-static {v10, p1, v3, v0, v2}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->access$getGroundOverlayOptions(Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;Lco/bird/android/model/persistence/Area;LPT;ZZ)Lio/reactivex/p;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$7$1;

    invoke-direct {v1, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$7$1;-><init>(Lco/bird/android/model/persistence/Area;)V

    new-instance p1, Lco/bird/android/app/feature/map/ui/d;

    invoke-direct {p1, v1}, Lco/bird/android/app/feature/map/ui/d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/Area;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl$7;->invoke(Lco/bird/android/model/persistence/Area;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
