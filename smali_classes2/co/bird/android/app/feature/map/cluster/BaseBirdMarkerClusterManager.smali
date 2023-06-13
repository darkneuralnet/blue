.class public abstract Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterManager;
.implements LGl0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterManager<",
        "TT;>;",
        "LGl0$b<",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
        "TT;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008&\u0018\u0000 l*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00040\u0003:\u0001lB7\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u0010<\u001a\u00020;\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010O\u001a\u00020$\u00a2\u0006\u0004\u0008j\u0010kJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004*\u00028\u0000H&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0008\u0010\u000f\u001a\u00020\u000eH\u0016J\u0016\u0010\u0012\u001a\u00020\u000e2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\u0008\u0010\u0013\u001a\u00020\u000eH\u0016J\u0016\u0010\u0014\u001a\u00020\u000e2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\u0008\u0010\u0015\u001a\u00020\u000eH\u0016J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u0017J\u0008\u0010\u001c\u001a\u00020\u000eH\u0016J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u0017J!\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u00002\u0008\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001c\u0010#\u001a\u00020\u000e2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0!H\u0016J\u0008\u0010%\u001a\u00020$H\u0016J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016\u00a2\u0006\u0004\u0008&\u0010\u0017J\u0008\u0010\'\u001a\u00020\u000eH\u0004J\u001c\u0010)\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00040\u0010H\u0004J\u001c\u0010*\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00040\u0010H\u0004J\u0014\u0010-\u001a\u00020\u000e2\n\u0010,\u001a\u00060\u0006j\u0002`+H\u0004J\u0016\u0010/\u001a\u00020\u000e2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004H\u0004J\u0016\u00100\u001a\u00020\u000e2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004H\u0004J0\u00102\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0004012\u0006\u0010\u0005\u001a\u00028\u0000H\u0084\u0002\u00a2\u0006\u0004\u00082\u00103J\u0010\u00105\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u000204H\u0004R\u001a\u00107\u001a\u0002068\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:R\u001a\u0010<\u001a\u00020;8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?R\u001a\u0010A\u001a\u00020@8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008A\u0010B\u001a\u0004\u0008C\u0010DR\u001a\u0010F\u001a\u00020E8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008F\u0010G\u001a\u0004\u0008H\u0010IR\u001a\u0010K\u001a\u00020J8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008K\u0010L\u001a\u0004\u0008M\u0010NR\u001a\u0010O\u001a\u00020$8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008O\u0010P\u001a\u0004\u0008Q\u0010RR&\u0010S\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0004018\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008S\u0010T\u001a\u0004\u0008U\u0010VR$\u0010W\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008W\u0010X\u001a\u0004\u0008Y\u0010Z\"\u0004\u0008[\u0010\u0017R0\u0010\\\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010!8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008\\\u0010]\u001a\u0004\u0008^\u0010_\"\u0004\u0008`\u0010aR \u0010e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00040b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008c\u0010dR\u001a\u0010i\u001a\u0008\u0012\u0004\u0012\u00028\u00000f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008g\u0010h\u00a8\u0006m"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;",
        "T",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterManager;",
        "LGl0$b;",
        "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "marker",
        "",
        "markerId",
        "(Ljava/lang/Object;)Ljava/lang/String;",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "markerPosition",
        "(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;",
        "markerClusterItem",
        "(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "",
        "clear",
        "",
        "markers",
        "set",
        "animateMarkers",
        "add",
        "reload",
        "remove",
        "(Ljava/lang/Object;)V",
        "",
        "selected",
        "(Ljava/lang/Object;Z)V",
        "select",
        "showInfoWindow",
        "deselect",
        "latLng",
        "move",
        "(Ljava/lang/Object;Lcom/google/android/gms/maps/model/LatLng;)V",
        "Lkotlin/Function1;",
        "listener",
        "setOnMarkerInfoItemClick",
        "Lco/bird/android/model/constant/MapMode;",
        "mapMode",
        "closeInfoWindow",
        "init",
        "markerItems",
        "addMarkerItems",
        "updateMarkerItems",
        "Lco/bird/android/coreinterface/manager/MarkerOverrideId;",
        "overrideId",
        "setOverrideReadyToRender",
        "item",
        "selectMarker",
        "deselectMarker",
        "LGl0;",
        "get",
        "(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;",
        "LfM2;",
        "notifyInfoWindowClickListener",
        "LTq4;",
        "reactiveConfig",
        "LTq4;",
        "getReactiveConfig",
        "()LTq4;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "getActivity",
        "()Lco/bird/android/core/mvp/BaseActivity;",
        "LBK2;",
        "markerOverridesManager",
        "LBK2;",
        "getMarkerOverridesManager",
        "()LBK2;",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "reactiveMapEvent",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "getReactiveMapEvent",
        "()Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "LcD1;",
        "map",
        "LcD1;",
        "getMap",
        "()LcD1;",
        "mode",
        "Lco/bird/android/model/constant/MapMode;",
        "getMode",
        "()Lco/bird/android/model/constant/MapMode;",
        "clusterManager",
        "LGl0;",
        "getClusterManager",
        "()LGl0;",
        "clickedMarker",
        "Ljava/lang/Object;",
        "getClickedMarker",
        "()Ljava/lang/Object;",
        "setClickedMarker",
        "currentInfoWindowClickListener",
        "Lkotlin/jvm/functions/Function1;",
        "getCurrentInfoWindowClickListener",
        "()Lkotlin/jvm/functions/Function1;",
        "setCurrentInfoWindowClickListener",
        "(Lkotlin/jvm/functions/Function1;)V",
        "LEW0;",
        "getRenderer",
        "()LEW0;",
        "renderer",
        "Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;",
        "getMarkerOverrides",
        "()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;",
        "markerOverrides",
        "<init>",
        "(LTq4;Lco/bird/android/core/mvp/BaseActivity;LBK2;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LcD1;Lco/bird/android/model/constant/MapMode;)V",
        "Companion",
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
        "SMAP\nBirdMarkerClusterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,362:1\n1222#2,4:363\n1855#2,2:367\n1549#2:369\n1620#2,3:370\n1549#2:373\n1620#2,3:374\n288#2,2:382\n1#3:377\n180#4:378\n180#4:379\n180#4:380\n180#4:381\n*S KotlinDebug\n*F\n+ 1 BirdMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager\n*L\n178#1:363,4\n179#1:367,2\n185#1:369\n185#1:370,3\n198#1:373\n198#1:374,3\n352#1:382,2\n277#1:378\n283#1:379\n289#1:380\n297#1:381\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$Companion;


# instance fields
.field private final activity:Lco/bird/android/core/mvp/BaseActivity;

.field private clickedMarker:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final clusterManager:LGl0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private currentInfoWindowClickListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final map:LcD1;

.field private final markerOverridesManager:LBK2;

.field private final mode:Lco/bird/android/model/constant/MapMode;

.field private final reactiveConfig:LTq4;

.field private final reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->Companion:Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$Companion;

    return-void
.end method

.method public constructor <init>(LTq4;Lco/bird/android/core/mvp/BaseActivity;LBK2;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LcD1;Lco/bird/android/model/constant/MapMode;)V
    .locals 1

    const-string v0, "reactiveConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "markerOverridesManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveMapEvent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->reactiveConfig:LTq4;

    iput-object p2, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->activity:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p3, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->markerOverridesManager:LBK2;

    iput-object p4, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    iput-object p5, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->map:LcD1;

    iput-object p6, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->mode:Lco/bird/android/model/constant/MapMode;

    new-instance p1, LGl0;

    invoke-direct {p1, p2, p5}, LGl0;-><init>(Landroid/content/Context;LcD1;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->init$lambda$15(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->init$lambda$18(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->init$lambda$17(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->init$lambda$16(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final init$lambda$15(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final init$lambda$16(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final init$lambda$17(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final init$lambda$18(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->markerClusterItem(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object p1

    if-eqz p2, :cond_0

    sget-object p2, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    invoke-virtual {p1, p2}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->setState(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getMarkerOverrides()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;

    move-result-object p2

    invoke-interface {p2, p1}, Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;->holdIfNotReady(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p2, p1}, LGl0;->g(LEl0;)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p1}, LGl0;->j()V

    :cond_1
    return-void
.end method

.method public add(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "markers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->markerClusterItem(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->addMarkerItems(Ljava/util/List;)V

    return-void
.end method

.method public final addMarkerItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;>;)V"
        }
    .end annotation

    const-string v0, "markerItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getMarkerOverrides()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;

    move-result-object v0

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;->holdNonReadyItems(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LGl0;->h(Ljava/util/Collection;)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p1}, LGl0;->j()V

    return-void
.end method

.method public animateMarkers()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getRenderer()LEW0;

    move-result-object v0

    invoke-virtual {v0}, LEW0;->startMarkerAnimation()V

    return-void
.end method

.method public clear()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {v0}, LGl0;->k()LF9;

    move-result-object v0

    invoke-interface {v0}, LF9;->b()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "clusterManager.algorithm.items"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {v0}, LGl0;->i()V

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {v0}, LGl0;->j()V

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getMarkerOverrides()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;

    move-result-object v0

    invoke-interface {v0}, Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;->clear()V

    return-void
.end method

.method public closeInfoWindow(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p0, v0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->get(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getRenderer()LEW0;

    move-result-object v0

    invoke-virtual {v0, p1}, LEW0;->getMarker(LEl0;)LfM2;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LfM2;->d()V

    :cond_0
    return-void
.end method

.method public deselect(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p0, v0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->get(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object p1, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->AVAILABLE:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->setState(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->deselectMarker(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getMarkerOverrides()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;

    move-result-object v0

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;->heldItem(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->AVAILABLE:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    invoke-virtual {p1, v0}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->setState(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V

    :goto_0
    return-void
.end method

.method public final deselectMarker(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getRenderer()LEW0;

    move-result-object v0

    invoke-virtual {v0, p1}, LEW0;->getMarker(LEl0;)LfM2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LfM2;->p(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getRenderer()LEW0;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, LEW0;->deselectItem(LEl0;LfM2;)V

    :cond_0
    return-void
.end method

.method public final get(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;>;TT;)",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LGl0;->k()LF9;

    move-result-object p1

    invoke-interface {p1}, LF9;->b()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "algorithm.items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p2}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->markerId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    return-object v0
.end method

.method public final getActivity()Lco/bird/android/core/mvp/BaseActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->activity:Lco/bird/android/core/mvp/BaseActivity;

    return-object v0
.end method

.method public final getClickedMarker()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clickedMarker:Ljava/lang/Object;

    return-object v0
.end method

.method public final getClusterManager()LGl0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGl0<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    return-object v0
.end method

.method public final getCurrentInfoWindowClickListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "TT;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->currentInfoWindowClickListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getMap()LcD1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->map:LcD1;

    return-object v0
.end method

.method public abstract getMarkerOverrides()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides<",
            "TT;>;"
        }
    .end annotation
.end method

.method public final getMarkerOverridesManager()LBK2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->markerOverridesManager:LBK2;

    return-object v0
.end method

.method public final getMode()Lco/bird/android/model/constant/MapMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->mode:Lco/bird/android/model/constant/MapMode;

    return-object v0
.end method

.method public final getReactiveConfig()LTq4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->reactiveConfig:LTq4;

    return-object v0
.end method

.method public final getReactiveMapEvent()Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    return-object v0
.end method

.method public abstract getRenderer()LEW0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEW0<",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;>;"
        }
    .end annotation
.end method

.method public final init()V
    .locals 5

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getRenderer()LEW0;

    move-result-object v1

    invoke-virtual {v0, v1}, LGl0;->t(LHl0;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {v0, p0}, LGl0;->r(LGl0$b;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->cameraIdles()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->activity:Lco/bird/android/core/mvp/BaseActivity;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$1;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$1;-><init>(Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;)V

    new-instance v3, LRy;

    invoke-direct {v3, v2}, LRy;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->markerClicks()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->activity:Lco/bird/android/core/mvp/BaseActivity;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$2;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$2;-><init>(Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;)V

    new-instance v3, LSy;

    invoke-direct {v3, v2}, LSy;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->infoWindowClicks()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->activity:Lco/bird/android/core/mvp/BaseActivity;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$3;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$3;-><init>(Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;)V

    new-instance v3, LTy;

    invoke-direct {v3, v2}, LTy;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->markerOverridesManager:LBK2;

    invoke-interface {v0}, LBK2;->b()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->activity:Lco/bird/android/core/mvp/BaseActivity;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$4;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager$init$4;-><init>(Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;)V

    new-instance v2, LUy;

    invoke-direct {v2, v1}, LUy;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->map:LcD1;

    iget-object v1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {v1}, LGl0;->n()LlM2;

    move-result-object v1

    invoke-virtual {v0, v1}, LcD1;->p(LcD1$b;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->map:LcD1;

    new-instance v1, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;

    iget-object v2, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->activity:Lco/bird/android/core/mvp/BaseActivity;

    iget-object v3, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->mode:Lco/bird/android/model/constant/MapMode;

    iget-object v4, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->reactiveConfig:LTq4;

    invoke-virtual {v4}, LTq4;->f8()LZ84;

    move-result-object v4

    invoke-virtual {v4}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/Config;->getRiderMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getShowRangeInsteadOfBatteryPercentage()Z

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;-><init>(Landroid/content/Context;Lco/bird/android/model/constant/MapMode;Z)V

    invoke-virtual {v0, v1}, LcD1;->p(LcD1$b;)V

    return-void
.end method

.method public mapMode()Lco/bird/android/model/constant/MapMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->mode:Lco/bird/android/model/constant/MapMode;

    return-object v0
.end method

.method public abstract markerClusterItem(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract markerId(Ljava/lang/Object;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method public abstract markerPosition(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/google/android/gms/maps/model/LatLng;"
        }
    .end annotation
.end method

.method public move(Ljava/lang/Object;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p0, v0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->get(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getRenderer()LEW0;

    move-result-object v1

    invoke-virtual {v1, v0}, LEW0;->getMarker(LEl0;)LfM2;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->markerPosition(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p2

    :cond_0
    invoke-virtual {v0, p2}, LfM2;->m(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_1
    return-void
.end method

.method public final notifyInfoWindowClickListener(LfM2;)V
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->currentInfoWindowClickListener:Lkotlin/jvm/functions/Function1;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LfM2;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of p1, p1, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItem;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clickedMarker:Ljava/lang/Object;

    if-eqz p1, :cond_1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public abstract synthetic onClusterClick(LDl0;)Z
.end method

.method public reload()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {v0}, LGl0;->o()V

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {v0}, LGl0;->j()V

    return-void
.end method

.method public remove(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p0, v0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->get(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {v1, v0}, LGl0;->p(LEl0;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {v0}, LGl0;->j()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getMarkerOverrides()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;

    move-result-object v0

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;->removeHeldItem(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public select(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p0, v0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->get(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object p1, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->setState(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->selectMarker(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getMarkerOverrides()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;

    move-result-object v0

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;->heldItem(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;->SELECTED:Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;

    invoke-virtual {p1, v0}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->setState(Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;)V

    :goto_0
    return-void
.end method

.method public final selectMarker(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getRenderer()LEW0;

    move-result-object v0

    invoke-virtual {v0, p1}, LEW0;->getMarker(LEl0;)LfM2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LfM2;->p(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getRenderer()LEW0;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, LEW0;->selectItem(LEl0;LfM2;)V

    :cond_0
    return-void
.end method

.method public set(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "markers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-direct {v2, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->markerId(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p1}, LGl0;->k()LF9;

    move-result-object p1

    invoke-interface {p1}, LF9;->b()Ljava/util/Collection;

    move-result-object p1

    const-string v1, "clusterManager.algorithm.items"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, v3}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->markerClusterItem(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    const-string v1, "markerMap.values"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->markerClusterItem(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p1}, LGl0;->i()V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getMarkerOverrides()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;

    move-result-object p1

    invoke-interface {p1}, Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;->clear()V

    invoke-virtual {p0, v0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->addMarkerItems(Ljava/util/List;)V

    return-void
.end method

.method public final setClickedMarker(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clickedMarker:Ljava/lang/Object;

    return-void
.end method

.method public final setCurrentInfoWindowClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->currentInfoWindowClickListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public setOnMarkerInfoItemClick(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->currentInfoWindowClickListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final declared-synchronized setOverrideReadyToRender(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "overrideId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getMarkerOverrides()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;

    move-result-object v0

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;->setReadyAndReleaseItemsFor(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->updateMarkerItems(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public showInfoWindow()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clickedMarker:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p0, v1, v0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->get(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getRenderer()LEW0;

    move-result-object v1

    invoke-virtual {v1, v0}, LEW0;->getMarker(LEl0;)LfM2;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LfM2;->t()V

    :cond_0
    return-void
.end method

.method public final updateMarkerItems(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem<",
            "TT;>;>;)V"
        }
    .end annotation

    const-string v0, "markerItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->getMarkerOverrides()Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;

    move-result-object v0

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;->holdNonReadyItems(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v0, p1}, LGl0;->u(Ljava/util/Collection;)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/cluster/BaseBirdMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p1}, LGl0;->j()V

    return-void
.end method
