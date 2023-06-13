.class public abstract Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$Companion;,
        Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$MarkerAction;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "T:",
        "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem<",
        "TK;>;>",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008&\u0018\u0000 G*\u0004\u0008\u0000\u0010\u0001*\u000e\u0008\u0001\u0010\u0003*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004:\u0002GHB\u001f\u0012\u0006\u0010(\u001a\u00020\'\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u00102\u001a\u000201\u00a2\u0006\u0004\u0008E\u0010FJ\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H$\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0008\u001a\u00028\u0001H$\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00028\u0000H$\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00028\u0000H$\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0014\u0010\u0014\u001a\u00020\u00132\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011J\u0014\u0010\u0015\u001a\u00020\u00132\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0011J\u0006\u0010\u0016\u001a\u00020\u0013J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J \u0010\u001d\u001a\u00020\u00132\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u001aJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00028\u0001H\u0004\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0008\u0010!\u001a\u00020\u0013H\u0004J$\u0010#\u001a\u0004\u0018\u00018\u0001*\u0008\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0005\u001a\u00028\u0000H\u0084\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020%H\u0014R\u001a\u0010(\u001a\u00020\'8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u001a\u0010-\u001a\u00020,8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100R\u001a\u00102\u001a\u0002018\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105R \u00106\u001a\u0008\u0012\u0004\u0012\u00028\u00010\"8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109R.\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 ;*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\u00110:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010<R\u0014\u0010@\u001a\u00020=8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008>\u0010?R \u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010A8$X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010C\u00a8\u0006I"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;",
        "K",
        "Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;",
        "T",
        "",
        "marker",
        "newMarker",
        "(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;",
        "existingClusterItem",
        "updateMarker",
        "(Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;",
        "",
        "id",
        "(Ljava/lang/Object;)Ljava/lang/String;",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "latLng",
        "(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;",
        "",
        "markers",
        "",
        "add",
        "set",
        "clear",
        "select",
        "(Ljava/lang/Object;)V",
        "deselect",
        "Lkotlin/Function2;",
        "",
        "listener",
        "setOnClusterItemClickListener",
        "item",
        "safeUpdateItem",
        "(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)V",
        "init",
        "LGl0;",
        "get",
        "(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;",
        "LfM2;",
        "filterClickable",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "getActivity",
        "()Lco/bird/android/core/mvp/BaseActivity;",
        "LcD1;",
        "map",
        "LcD1;",
        "getMap",
        "()LcD1;",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "reactiveMapEvent",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "getReactiveMapEvent",
        "()Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "clusterManager",
        "LGl0;",
        "getClusterManager",
        "()LGl0;",
        "LAG;",
        "kotlin.jvm.PlatformType",
        "LAG;",
        "Lg46$b;",
        "getLogger",
        "()Lg46$b;",
        "logger",
        "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;",
        "getRenderer",
        "()Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;",
        "renderer",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;)V",
        "Companion",
        "MarkerAction",
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
        "SMAP\nAbstractMarkerClusterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n180#2:226\n161#2:227\n288#3,2:228\n*S KotlinDebug\n*F\n+ 1 AbstractMarkerClusterManager.kt\nco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager\n*L\n112#1:226\n195#1:227\n209#1:228,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$Companion;

.field private static final FRAME_RENDER_DURATION_MS:J = 0x64L


# instance fields
.field private final activity:Lco/bird/android/core/mvp/BaseActivity;

.field private final clusterManager:LGl0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGl0<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final map:LcD1;

.field private final markers:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Ljava/util/List<",
            "TK;>;>;"
        }
    .end annotation
.end field

.field private final reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->Companion:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$Companion;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "map"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveMapEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->activity:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p2, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->map:LcD1;

    iput-object p3, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    new-instance p3, LGl0;

    invoke-direct {p3, p1, p2}, LGl0;-><init>(Landroid/content/Context;LcD1;)V

    iput-object p3, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->clusterManager:LGl0;

    invoke-static {}, LAG;->g()LAG;

    move-result-object p1

    const-string p2, "create<List<K>>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->markers:LAG;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->init$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getLogger(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;)Lg46$b;
    .locals 0

    invoke-direct {p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getLogger()Lg46$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->init$lambda$4(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->init$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->init$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->init$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function2;Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->setOnClusterItemClickListener$lambda$0(Lkotlin/jvm/functions/Function2;Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)Z

    move-result p0

    return p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/google/android/gms/maps/model/VisibleRegion;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->init$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lg46$b;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    const-string v1, "tag(\"${this::class.simpleName}\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final init$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final init$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final init$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/google/android/gms/maps/model/VisibleRegion;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/maps/model/VisibleRegion;

    return-object p0
.end method

.method private static final init$lambda$4(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method private static final init$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lna4;

    return-object p0
.end method

.method private static final init$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final setOnClusterItemClickListener$lambda$0(Lkotlin/jvm/functions/Function2;Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)Z
    .locals 1

    const-string v0, "$listener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;->getMarker()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;->getSelected()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final add(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TK;>;)V"
        }
    .end annotation

    const-string v0, "markers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->markers:LAG;

    invoke-virtual {v0}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :cond_0
    check-cast v1, Ljava/util/Collection;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final clear()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->clusterManager:LGl0;

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

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->markers:LAG;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LAG;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final deselect(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p0, v0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->get(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;->setSelected(Z)V

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->safeUpdateItem(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)V

    return-void
.end method

.method public filterClickable(LfM2;)Z
    .locals 1

    const-string v0, "marker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final get(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LGl0<",
            "TT;>;TK;)TT;"
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

    check-cast v1, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;

    invoke-virtual {v1}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p2}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->id(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;

    return-object v0
.end method

.method public final getActivity()Lco/bird/android/core/mvp/BaseActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->activity:Lco/bird/android/core/mvp/BaseActivity;

    return-object v0
.end method

.method public final getClusterManager()LGl0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGl0<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->clusterManager:LGl0;

    return-object v0
.end method

.method public final getMap()LcD1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->map:LcD1;

    return-object v0
.end method

.method public final getReactiveMapEvent()Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    return-object v0
.end method

.method public abstract getRenderer()Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer<",
            "TK;TT;>;"
        }
    .end annotation
.end method

.method public abstract id(Ljava/lang/Object;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method public final init()V
    .locals 8

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getRenderer()Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;

    move-result-object v1

    invoke-virtual {v0, v1}, LGl0;->t(LHl0;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->markerClicks()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$1;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$1;-><init>(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;)V

    new-instance v2, LQ0;

    invoke-direct {v2, v1}, LQ0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "protected fun init() {\n \u2026ger.cluster()\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->activity:Lco/bird/android/core/mvp/BaseActivity;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$2;

    iget-object v3, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->clusterManager:LGl0;

    invoke-direct {v2, v3}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$2;-><init>(Ljava/lang/Object;)V

    new-instance v3, LR0;

    invoke-direct {v3, v2}, LR0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->markers:LAG;

    iget-object v2, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    invoke-interface {v2}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->cameraMoves()Lio/reactivex/Observable;

    move-result-object v2

    new-instance v3, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$3;

    invoke-direct {v3, p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$3;-><init>(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;)V

    new-instance v4, LS0;

    invoke-direct {v4, v3}, LS0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v4}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v2

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x64

    invoke-virtual {v2, v4, v5, v3}, Lio/reactivex/Observable;->throttleLatest(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v2

    sget-object v6, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$4;->INSTANCE:Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$4;

    new-instance v7, LT0;

    invoke-direct {v7, v6}, LT0;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-static {v0, v2, v7}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0, v4, v5, v3}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-static {v2}, Lio/reactivex/schedulers/a;->b(Ljava/util/concurrent/Executor;)Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v2, Lio/reactivex/b;->f:Lio/reactivex/b;

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object v0

    new-instance v2, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;

    invoke-direct {v2, p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$5;-><init>(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;)V

    new-instance v3, LU0;

    invoke-direct {v3, v2}, LU0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3}, Lio/reactivex/k;->b1(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/k;->B()Lio/reactivex/k;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/k;->s0(Lio/reactivex/E;)Lio/reactivex/k;

    move-result-object v0

    const-string v2, "K, T: MarkerClusterItem<\u2026ger.cluster()\n      }\n  }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->activity:Lco/bird/android/core/mvp/BaseActivity;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/k;->f(Lio/reactivex/l;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/FlowableSubscribeProxy;

    new-instance v1, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$6;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager$init$6;-><init>(Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;)V

    new-instance v2, LV0;

    invoke-direct {v2, v1}, LV0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/FlowableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public abstract latLng(Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lcom/google/android/gms/maps/model/LatLng;"
        }
    .end annotation
.end method

.method public abstract newMarker(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TT;"
        }
    .end annotation
.end method

.method public final safeUpdateItem(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getRenderer()Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->getRenderer()Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;

    move-result-object v1

    invoke-virtual {v1, p1}, LEW0;->getMarker(LEl0;)LfM2;

    move-result-object v1

    const-string v2, "renderer.getMarker(item)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1}, Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;->updateItem(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;LfM2;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final select(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->clusterManager:LGl0;

    invoke-virtual {p0, v0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->get(LGl0;Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;->setSelected(Z)V

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->safeUpdateItem(Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)V

    return-void
.end method

.method public final set(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TK;>;)V"
        }
    .end annotation

    const-string v0, "markers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->markers:LAG;

    invoke-virtual {v0, p1}, LAG;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public final setOnClusterItemClickListener(Lkotlin/jvm/functions/Function2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-TK;-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/cluster/AbstractMarkerClusterManager;->clusterManager:LGl0;

    new-instance v1, LW0;

    invoke-direct {v1, p1}, LW0;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0, v1}, LGl0;->s(LGl0$d;)V

    return-void
.end method

.method public abstract updateMarker(Ljava/lang/Object;Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;)Lco/bird/android/app/feature/map/cluster/MarkerClusterItem;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TT;)TT;"
        }
    .end annotation
.end method
