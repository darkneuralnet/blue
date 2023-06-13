.class public final Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwu6;
.implements LVX0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwu6<",
        "Lvt4;",
        ">;",
        "LVX0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 t2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fBE\u0008\u0007\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010J\u001a\u00020G\u0012\u0006\u0010N\u001a\u00020K\u0012\u0008\u0008\u0001\u0010Q\u001a\u00020\u0004\u0012\u0006\u0010U\u001a\u00020R\u0012\u0008\u0008\u0001\u0010:\u001a\u00020\u0002\u00a2\u0006\u0004\u0008r\u0010sJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u0016J\u001a\u0010\u0014\u001a\u00020\u000e2\u0010\u0010\u0013\u001a\u000c\u0012\u0008\u0012\u00060\u0011j\u0002`\u00120\u0010H\u0002J\u001e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0010H\u0002J$\u0010\u001c\u001a\u000c\u0012\u0008\u0012\u00060\u0017j\u0002`\u001b0\u00102\u0010\u0010\u001a\u001a\u000c\u0012\u0008\u0012\u00060\u0011j\u0002`\u00120\u0010H\u0002J\u0008\u0010\u001d\u001a\u00020\u0006H\u0002J\u0008\u0010\u001e\u001a\u00020\u0006H\u0002J\"\u0010 \u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0010\u0010\u001f\u001a\u000c\u0012\u0008\u0012\u00060\u0017j\u0002`\u001b0\u0010H\u0002J\u0015\u0010#\u001a\u0004\u0018\u00010\"*\u00020!H\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u0018\u0010&\u001a\u00060\u0011j\u0002`\u0012*\u00020\u00152\u0006\u0010%\u001a\u00020\"H\u0002J\u0018\u0010(\u001a\u00020\'*\u00060\u0011j\u0002`\u00122\u0006\u0010%\u001a\u00020\"H\u0002J$\u0010+\u001a\u00060\u0011j\u0002`\u0012*\u00060\u0011j\u0002`\u00122\u0006\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\"H\u0002J&\u0010-\u001a\u000c\u0012\u0008\u0012\u00060\u0011j\u0002`\u00120\u0010*\u00020\t2\u0006\u0010%\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"H\u0002J\u000c\u0010/\u001a\u00020.*\u00020\tH\u0002J\u0012\u00102\u001a\u0008\u0012\u0004\u0012\u00020100*\u00020\u0002H\u0002JB\u00107\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0008\u0012\u00060\u0017j\u0002`\u001b\u0012\u0004\u0012\u00020\"060504*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0010\u00103\u001a\u000c\u0012\u0008\u0012\u00060\u0017j\u0002`\u001b0\u0010H\u0002J\u0012\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000b*\u00020\u0002H\u0002J\u0016\u0010<\u001a\u0004\u0018\u00010;*\u0002092\u0006\u0010:\u001a\u00020\u0002H\u0002J\u001d\u0010=\u001a\u0004\u0018\u00010\"*\u00020!2\u0006\u0010:\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008=\u0010>R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR\u0014\u0010Q\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u001a\u0010:\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008V\u0010W\u001a\u0004\u0008X\u0010YR\u0014\u0010%\u001a\u00020\"8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008Z\u0010[R\u0014\u0010,\u001a\u00020\"8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\\\u0010[R\u0014\u0010^\u001a\u00020\"8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008]\u0010[R\u0014\u0010`\u001a\u00020\"8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008_\u0010[R4\u0010d\u001a\"\u0012\u001e\u0012\u001c\u0012\u0008\u0012\u00060\u0011j\u0002`\u0012\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u00060\u0017j\u0002`\u001b0\u0010060a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008b\u0010cR*\u0010g\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0008\u0012\u00060\u0017j\u0002`\u001b\u0012\u0004\u0012\u00020e060a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008f\u0010cR \u0010i\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u0017050a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008h\u0010cR\u001a\u0010k\u001a\u0008\u0012\u0004\u0012\u0002010a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008j\u0010cR(\u0010p\u001a\u0010\u0012\u000c\u0012\n m*\u0004\u0018\u000101010l8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008n\u0010o\u001a\u0004\u0008p\u0010q\u00a8\u0006u"
    }
    d2 = {
        "Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;",
        "Lwu6;",
        "Lvt4;",
        "LVX0;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onCreate",
        "onStart",
        "Lcom/google/android/gms/maps/model/LatLngBounds;",
        "region",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "birds",
        "Lio/reactivex/c;",
        "a",
        "",
        "",
        "Lco/bird/android/feature/rider/impl/MapGeocacheSubRegion;",
        "requestedSubregions",
        "B",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "center",
        "",
        "cellIds",
        "z",
        "subregions",
        "Lco/bird/android/feature/rider/impl/ServerCellId;",
        "V",
        "t",
        "u",
        "serverCellIds",
        "R",
        "Lco/bird/android/model/wire/configs/MobileMapConfigView;",
        "",
        "x",
        "(Lco/bird/android/model/wire/configs/MobileMapConfigView;)Ljava/lang/Integer;",
        "gridDegreeSubdivision",
        "X",
        "Lco/bird/android/model/wire/WireRiderCellGeometry;",
        "Y",
        "lat",
        "lon",
        "K",
        "maxGeocacheSubRegionLayersPerMapRegion",
        "D",
        "",
        "W",
        "Lio/reactivex/Observable;",
        "",
        "E",
        "neededCellIds",
        "Lio/reactivex/F;",
        "Lco/bird/android/buava/Optional;",
        "",
        "S",
        "U",
        "Lco/bird/android/model/wire/WireRiderCellByType;",
        "cellType",
        "Lco/bird/android/model/wire/WireRiderCell;",
        "v",
        "y",
        "(Lco/bird/android/model/wire/configs/MobileMapConfigView;Lvt4;)Ljava/lang/Integer;",
        "LaM;",
        "b",
        "LaM;",
        "birdManager",
        "Lbn;",
        "c",
        "Lbn;",
        "areaManager",
        "LTq4;",
        "d",
        "LTq4;",
        "reactiveConfig",
        "LDB1;",
        "e",
        "LDB1;",
        "geocachedDataClient",
        "f",
        "LLifecycleOwner;",
        "processLifecycleOwner",
        "Lgl;",
        "g",
        "Lgl;",
        "appPreference",
        "h",
        "Lvt4;",
        "w",
        "()Lvt4;",
        "i",
        "I",
        "j",
        "k",
        "maxMapGeocacheSubRegionCacheLimit",
        "l",
        "maxServerCellIdCacheLimit",
        "La94;",
        "m",
        "La94;",
        "subRegionToServerCells",
        "Lorg/joda/time/DateTime;",
        "n",
        "serverCellLastQuery",
        "o",
        "serverCellStrategy",
        "p",
        "isEnabledRelay",
        "LZ84;",
        "kotlin.jvm.PlatformType",
        "q",
        "LZ84;",
        "isEnabled",
        "()LZ84;",
        "<init>",
        "(LaM;Lbn;LTq4;LDB1;LLifecycleOwner;Lgl;Lvt4;)V",
        "r",
        "impl_release"
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
        "SMAP\nGeocachedDataManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,523:1\n44#2:524\n44#2:526\n44#2:528\n180#3:525\n180#3:527\n180#3:529\n766#4:530\n857#4,2:531\n1855#4,2:533\n1360#4:535\n1446#4,5:536\n766#4:541\n857#4,2:542\n1549#4:544\n1620#4,3:545\n*S KotlinDebug\n*F\n+ 1 GeocachedDataManagerImpl.kt\nco/bird/android/feature/rider/impl/GeocachedDataManagerImpl\n*L\n118#1:524\n125#1:526\n138#1:528\n118#1:525\n125#1:527\n138#1:529\n189#1:530\n189#1:531,2\n196#1:533,2\n297#1:535\n297#1:536,5\n331#1:541\n331#1:542,2\n341#1:544\n341#1:545,3\n*E\n"
    }
.end annotation


# static fields
.field public static final r:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$a;


# instance fields
.field public final b:LaM;

.field public final c:Lbn;

.field public final d:LTq4;

.field public final e:LDB1;

.field public final f:LLifecycleOwner;

.field public final g:Lgl;

.field public final h:Lvt4;

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public final n:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/joda/time/DateTime;",
            ">;>;"
        }
    .end annotation
.end field

.field public final o:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final p:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final q:LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->r:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$a;

    return-void
.end method

.method public constructor <init>(LaM;Lbn;LTq4;LDB1;LLifecycleOwner;Lgl;Lvt4;)V
    .locals 1

    const-string v0, "birdManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "areaManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "geocachedDataClient"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processLifecycleOwner"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appPreference"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cellType"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->b:LaM;

    iput-object p2, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->c:Lbn;

    iput-object p3, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->d:LTq4;

    iput-object p4, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->e:LDB1;

    iput-object p5, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->f:LLifecycleOwner;

    iput-object p6, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->g:Lgl;

    iput-object p7, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->h:Lvt4;

    const/16 p1, 0x64

    iput p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->i:I

    const/4 p1, 0x3

    iput p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->j:I

    const/16 p1, 0x3e8

    iput p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->k:I

    const/16 p1, 0x1900

    iput p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->l:I

    sget-object p1, La94;->h:La94$a;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    const/4 p3, 0x0

    const/4 p4, 0x2

    invoke-static {p1, p2, p3, p4, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->m:La94;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2, p3, p4, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->n:La94;

    sget-object p2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p2

    invoke-static {p1, p2, p3, p4, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->o:La94;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2, p3, p4, p3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->p:La94;

    sget-object p2, LZ84;->d:LZ84$a;

    invoke-virtual {p2, p1}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->q:LZ84;

    invoke-interface {p5}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/f;->a(LFq2;)V

    return-void
.end method

.method public static final A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/buava/Optional;

    return-object p0
.end method

.method public static final synthetic access$evictMapGeocacheLookupIfRequired(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)V
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->t()V

    return-void
.end method

.method public static final synthetic access$evictServerCellIdIfRequired(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)V
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->u()V

    return-void
.end method

.method public static final synthetic access$getBirdManager$p(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)LaM;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->b:LaM;

    return-object p0
.end method

.method public static final synthetic access$getByType(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Lco/bird/android/model/wire/WireRiderCellByType;Lvt4;)Lco/bird/android/model/wire/WireRiderCell;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->v(Lco/bird/android/model/wire/WireRiderCellByType;Lvt4;)Lco/bird/android/model/wire/WireRiderCell;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getGridDegreeSubdivision$p(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)I
    .locals 0

    iget p0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->i:I

    return p0
.end method

.method public static final synthetic access$getMaxGeocacheSubRegionLayersPerMapRegion$p(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)I
    .locals 0

    iget p0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->j:I

    return p0
.end method

.method public static final synthetic access$getServerCellLastQuery$p(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->n:La94;

    return-object p0
.end method

.method public static final synthetic access$getServerCellStrategy$p(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->o:La94;

    return-object p0
.end method

.method public static final synthetic access$getSubRegionToServerCells$p(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->m:La94;

    return-object p0
.end method

.method public static final synthetic access$hydrateMapGeocacheSubRegions(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Ljava/util/Set;)Lio/reactivex/c;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->B(Ljava/util/Set;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$innerRegions(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Lcom/google/android/gms/maps/model/LatLngBounds;II)Ljava/util/Set;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->D(Lcom/google/android/gms/maps/model/LatLngBounds;II)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$refreshServerCellIds(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Lcom/google/android/gms/maps/model/LatLng;Ljava/util/Set;)Lio/reactivex/c;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->R(Lcom/google/android/gms/maps/model/LatLng;Ljava/util/Set;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$serverCellIdsForSubRegions(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->V(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->Q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->T(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->O(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->H(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->C(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->P(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/util/Set;)Lio/reactivex/c;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hydrateMapGeocacheSubRegions called with requestedSubregions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->m:La94;

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "knownRegions="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "filtered subregions to check "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    const-string v0, "complete()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_2
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    iget v6, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->i:I

    invoke-virtual {p0, v3, v4, v6}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->Y(JI)Lco/bird/android/model/wire/WireRiderCellGeometry;

    move-result-object v3

    invoke-interface {p1, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    new-instance v0, Lco/bird/android/model/wire/WireRiderCellsRequest;

    invoke-virtual {p0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->w()Lvt4;

    move-result-object v3

    invoke-virtual {p0, v3}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->U(Lvt4;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, p1, v3}, Lco/bird/android/model/wire/WireRiderCellsRequest;-><init>(Ljava/util/Map;Ljava/util/List;)V

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRiderCellsRequest;->getGeometries()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "making subregions to cell id request: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->e:LDB1;

    invoke-interface {p1, v0}, LDB1;->a(Lco/bird/android/model/wire/WireRiderCellsRequest;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c;

    invoke-direct {v0, p0, v2}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$c;-><init>(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Ljava/util/List;)V

    new-instance v1, LEB1;

    invoke-direct {v1, v0}, LEB1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "private fun hydrateMapGe\u2026ions.toSet())\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final D(Lcom/google/android/gms/maps/model/LatLngBounds;II)Ljava/util/Set;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            "II)",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "innerRegions called with gridDegreeSubdivision="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " and maxGeocacheSubRegionLayersPerMapRegion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/LatLngBounds;->v()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    const-string v2, "center"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->X(Lcom/google/android/gms/maps/model/LatLng;I)J

    move-result-wide v2

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->W(Lcom/google/android/gms/maps/model/LatLngBounds;)D

    move-result-wide v4

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double/2addr v4, v6

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "spanRadius="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    int-to-double p1, p2

    mul-double/2addr v4, p1

    double-to-int p1, v4

    const/4 p2, 0x1

    sub-int/2addr p1, p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "layersDesired="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v0, v4}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    if-ge p1, p2, :cond_0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "resolvedLayerCount="

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p3, v0}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    new-array p3, p2, [Ljava/lang/Long;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, p3, v1

    invoke-static {p3}, Lkotlin/collections/SetsKt;->mutableSetOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p3

    if-gt p2, p1, :cond_2

    :goto_0
    neg-int v0, p2

    if-gt v0, p2, :cond_1

    move v4, v0

    :goto_1
    invoke-virtual {p0, v2, v3, v4, v0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->K(JII)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {p3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v2, v3, v4, p2}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->K(JII)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {p3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v2, v3, v0, v4}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->K(JII)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {p3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v2, v3, p2, v4}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->K(JII)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {p3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    if-eq v4, p2, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    if-eq p2, p1, :cond_2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "result="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p3
.end method

.method public final E(Lvt4;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvt4;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    instance-of v0, p1, LUK;

    const-string v1, "reactiveConfig.config\n  \u2026  .distinctUntilChanged()"

    if-eqz v0, :cond_0

    iget-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->d:LTq4;

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    sget-object v0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$d;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$d;

    new-instance v2, LOB1;

    invoke-direct {v2, v0}, LOB1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LUm;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->d:LTq4;

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    sget-object v0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$e;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$e;

    new-instance v2, LPB1;

    invoke-direct {v2, v0}, LPB1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    instance-of p1, p1, LB23;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->d:LTq4;

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    sget-object v0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$f;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$f;

    new-instance v2, LFB1;

    invoke-direct {v2, v0}, LFB1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final K(JII)J
    .locals 5

    const/16 v0, 0x20

    ushr-long v1, p1, v0

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    int-to-long v3, p3

    add-long/2addr v1, v3

    shl-long v0, v1, v0

    int-to-long p3, p4

    add-long/2addr p1, p3

    or-long/2addr p1, v0

    return-wide p1
.end method

.method public final R(Lcom/google/android/gms/maps/model/LatLng;Ljava/util/Set;)Lio/reactivex/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/model/LatLng;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "refreshServerCellIds called with center="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " and serverCellIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->d:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRiderMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v0

    invoke-virtual {p0, v0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->x(Lco/bird/android/model/wire/configs/MobileMapConfigView;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_0

    :cond_0
    const/16 v2, 0x12c

    :goto_0
    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-virtual {v3, v2}, Lorg/joda/time/DateTime;->minusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object v2

    iget-object v3, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->n:La94;

    invoke-virtual {v3}, La94;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/joda/time/DateTime;

    if-nez v6, :cond_2

    new-instance v6, Lorg/joda/time/DateTime;

    const-wide/16 v7, 0x0

    invoke-static {v7, v8}, Lorg/joda/time/Instant;->ofEpochSecond(J)Lorg/joda/time/Instant;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/joda/time/DateTime;-><init>(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v6, v2}, Lorg/joda/time/base/AbstractInstant;->compareTo(Lorg/joda/time/ReadableInstant;)I

    move-result v6

    if-gez v6, :cond_3

    const/4 v6, 0x1

    goto :goto_2

    :cond_3
    move v6, v1

    :goto_2
    if-eqz v6, :cond_1

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "neededServerCellIds = "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p2, v2}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    const-string p2, "complete()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_5
    invoke-virtual {p0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->w()Lvt4;

    move-result-object p2

    invoke-virtual {p0, v0, p2}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->y(Lco/bird/android/model/wire/configs/MobileMapConfigView;Lvt4;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_3

    :cond_6
    const/16 p2, 0x10

    :goto_3
    invoke-static {v4, p2}, Lkotlin/collections/CollectionsKt;->chunked(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "idCellId Bundle requests: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->z(Lcom/google/android/gms/maps/model/LatLng;Ljava/util/Set;)Lio/reactivex/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    invoke-static {v0}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "concat(streams)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final S(Lvt4;Lcom/google/android/gms/maps/model/LatLng;Ljava/util/Set;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvt4;",
            "Lcom/google/android/gms/maps/model/LatLng;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/F<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;>;>;"
        }
    .end annotation

    instance-of v0, p1, LUK;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->b:LaM;

    invoke-static {p2}, Lcm2;->e(Lcom/google/android/gms/maps/model/LatLng;)Landroid/location/Location;

    move-result-object p2

    invoke-interface {p1, p2, p3}, LaM;->P0(Landroid/location/Location;Ljava/util/Set;)Lio/reactivex/F;

    move-result-object p1

    sget-object p2, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$o;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$o;

    new-instance p3, LGB1;

    invoke-direct {p3, p2}, LGB1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "birdManager.fetchNearbyB\u2026 .map { Optional.of(it) }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, LUm;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->c:Lbn;

    invoke-static {p2}, Lcm2;->e(Lcom/google/android/gms/maps/model/LatLng;)Landroid/location/Location;

    move-result-object p2

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->g:Lgl;

    invoke-virtual {v0}, Lgl;->t0()Lco/bird/android/model/constant/MapMode;

    move-result-object v0

    invoke-interface {p1, p2, p3, v0}, Lbn;->P(Landroid/location/Location;Ljava/util/Set;Lco/bird/android/model/constant/MapMode;)Lio/reactivex/c;

    move-result-object p1

    sget-object p2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->j0(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "areaManager.refreshNearb\u2026efault(Optional.absent())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_1
    instance-of p1, p1, LB23;

    if-eqz p1, :cond_2

    new-instance p1, Lkotlin/NotImplementedError;

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-direct {p1, p3, p2, p3}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final U(Lvt4;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvt4;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    instance-of v0, p1, LUK;

    if-eqz v0, :cond_0

    const-string p1, "bird"

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LUm;

    if-eqz v0, :cond_1

    const-string p1, "zone"

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of p1, p1, LB23;

    if-eqz p1, :cond_2

    const-string p1, "nest"

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final V(Ljava/util/Set;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "serverCellIdsForSubRegions called with subregions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->m:La94;

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    if-nez v2, :cond_0

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v2

    :cond_0
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public final W(Lcom/google/android/gms/maps/model/LatLngBounds;)D
    .locals 7

    iget-object v0, p1, Lcom/google/android/gms/maps/model/LatLngBounds;->c:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v1, v0, Lcom/google/android/gms/maps/model/LatLng;->c:D

    iget-object p1, p1, Lcom/google/android/gms/maps/model/LatLngBounds;->b:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v3, p1, Lcom/google/android/gms/maps/model/LatLng;->c:D

    sub-double/2addr v1, v3

    iget-wide v3, v0, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-wide v5, p1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    sub-double/2addr v3, v5

    cmpl-double p1, v1, v3

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    move-wide v1, v3

    :goto_0
    return-wide v1
.end method

.method public final X(Lcom/google/android/gms/maps/model/LatLng;I)J
    .locals 6

    iget-wide v0, p1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    const-wide v2, 0x4056800000000000L    # 90.0

    add-double/2addr v0, v2

    int-to-double v2, p2

    mul-double/2addr v0, v2

    double-to-long v0, v0

    iget-wide p1, p1, Lcom/google/android/gms/maps/model/LatLng;->c:D

    const-wide v4, 0x4066800000000000L    # 180.0

    add-double/2addr p1, v4

    mul-double/2addr p1, v2

    double-to-long p1, p1

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    or-long/2addr p1, v0

    return-wide p1
.end method

.method public final Y(JI)Lco/bird/android/model/wire/WireRiderCellGeometry;
    .locals 40

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    move/from16 v2, p3

    int-to-double v2, v2

    div-double/2addr v0, v2

    const/16 v2, 0x20

    ushr-long v2, p1, v2

    long-to-double v2, v2

    mul-double/2addr v2, v0

    const-wide v4, 0x4056800000000000L    # 90.0

    sub-double/2addr v2, v4

    const-wide v4, 0xffffffffL

    and-long v4, p1, v4

    long-to-double v4, v4

    mul-double/2addr v4, v0

    const-wide v6, 0x4066800000000000L    # 180.0

    sub-double/2addr v4, v6

    new-instance v15, Lco/bird/android/model/wire/WireRiderCellGeometry;

    new-instance v14, Lco/bird/android/model/wire/WireRiderCellRect;

    new-instance v13, Lco/bird/android/model/wire/WireLocation;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1fc

    const/16 v22, 0x0

    move-object v6, v13

    move-wide v7, v2

    move-wide v9, v4

    move-object/from16 v23, v13

    move-object/from16 v13, v16

    move-object/from16 v24, v14

    move-object/from16 v14, v17

    move-object/from16 v25, v15

    move/from16 v15, v18

    move-object/from16 v16, v19

    move-object/from16 v17, v20

    move/from16 v18, v21

    move-object/from16 v19, v22

    invoke-direct/range {v6 .. v19}, Lco/bird/android/model/wire/WireLocation;-><init>(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lco/bird/android/model/wire/WireLocation;

    add-double v27, v2, v0

    add-double v29, v4, v0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x1fc

    const/16 v39, 0x0

    move-object/from16 v26, v6

    invoke-direct/range {v26 .. v39}, Lco/bird/android/model/wire/WireLocation;-><init>(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v23

    move-object/from16 v0, v24

    invoke-direct {v0, v1, v6}, Lco/bird/android/model/wire/WireRiderCellRect;-><init>(Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/wire/WireLocation;)V

    move-object/from16 v1, v25

    invoke-direct {v1, v0}, Lco/bird/android/model/wire/WireRiderCellGeometry;-><init>(Lco/bird/android/model/wire/WireRiderCellRect;)V

    return-object v1
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/util/List;)Lio/reactivex/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    const-string v0, "region"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$j;

    invoke-direct {v0, p1, p2, p0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$j;-><init>(Lcom/google/android/gms/maps/model/LatLngBounds;Ljava/util/List;Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)V

    invoke-static {v0}, Lnh5;->k(Lkotlin/jvm/functions/Function1;)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$k;

    invoke-direct {v0, p0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$k;-><init>(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)V

    new-instance v1, LJB1;

    invoke-direct {v1, v0}, LJB1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$l;

    invoke-direct {v0, p0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$l;-><init>(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)V

    new-instance v1, LKB1;

    invoke-direct {v1, v0}, LKB1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$m;

    invoke-direct {v0, p0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$m;-><init>(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)V

    new-instance v1, LLB1;

    invoke-direct {v1, v0}, LLB1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$n;

    invoke-direct {v0, p0, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$n;-><init>(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Lcom/google/android/gms/maps/model/LatLngBounds;)V

    new-instance p1, LMB1;

    invoke-direct {p1, v0}, LMB1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "override fun refresh(reg\u2026ch,\n        )\n      }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public isEnabled()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->q:LZ84;

    return-object v0
.end method

.method public onCreate(LLifecycleOwner;)V
    .locals 7

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onCreate(LLifecycleOwner;)V

    invoke-virtual {p0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->w()Lvt4;

    move-result-object v0

    invoke-virtual {p0, v0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->E(Lvt4;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v1

    const-string v2, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    iget-object v3, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->p:La94;

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-virtual {p0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->isEnabled()LZ84;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v3, 0x1

    invoke-virtual {v0, v3, v4}, Lio/reactivex/Observable;->skip(J)Lio/reactivex/Observable;

    move-result-object v0

    const-string v5, "isEnabled\n      .distinc\u2026lChanged()\n      .skip(1)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v5

    invoke-virtual {v0, v5}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v5, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$g;

    invoke-direct {v5, p0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$g;-><init>(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)V

    new-instance v6, LHB1;

    invoke-direct {v6, v5}, LHB1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v6}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->o:La94;

    sget-object v5, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$h;->g:Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$h;

    invoke-static {v0, v5}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lio/reactivex/Observable;->skip(J)Lio/reactivex/Observable;

    move-result-object v0

    const-string v3, "serverCellStrategy\n     \u2026lChanged()\n      .skip(1)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$i;

    invoke-direct {v0, p0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$i;-><init>(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;)V

    new-instance v1, LIB1;

    invoke-direct {v1, v0}, LIB1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public onStart(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onStart(LLifecycleOwner;)V

    return-void
.end method

.method public final t()V
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "evictMapGeocacheLookupIfRequired called"

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->m:La94;

    invoke-virtual {v1}, La94;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    iget v2, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->k:I

    if-le v1, v2, :cond_0

    const-string v1, "evictMapGeocacheLookupIfRequired reset subRegionToServerCells"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->m:La94;

    invoke-virtual {v0}, La94;->j()V

    :cond_0
    return-void
.end method

.method public final u()V
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "evictServerCellIdIfRequired called"

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->n:La94;

    invoke-virtual {v1}, La94;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    iget v2, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->l:I

    if-le v1, v2, :cond_0

    const-string v1, "evictServerCellIdIfRequired reset serverCellLastQuery"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v0}, Lg46;->l(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->n:La94;

    invoke-virtual {v0}, La94;->j()V

    :cond_0
    return-void
.end method

.method public final v(Lco/bird/android/model/wire/WireRiderCellByType;Lvt4;)Lco/bird/android/model/wire/WireRiderCell;
    .locals 1

    instance-of v0, p2, LUK;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRiderCellByType;->getBirds()Lco/bird/android/model/wire/WireRiderCell;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p2, LUm;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRiderCellByType;->getZones()Lco/bird/android/model/wire/WireRiderCell;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of p2, p2, LB23;

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRiderCellByType;->getNests()Lco/bird/android/model/wire/WireRiderCell;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public w()Lvt4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->h:Lvt4;

    return-object v0
.end method

.method public final x(Lco/bird/android/model/wire/configs/MobileMapConfigView;)Ljava/lang/Integer;
    .locals 3

    invoke-virtual {p0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->w()Lvt4;

    move-result-object v0

    instance-of v1, v0, LUK;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getClientBirdGeocacheConfig()Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/MapGeocacheConfig;->getExpirySeconds()Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_0
    instance-of v1, v0, LUm;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getClientZoneGeocacheConfig()Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/MapGeocacheConfig;->getExpirySeconds()Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_1
    instance-of v0, v0, LB23;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getClientNestGeocacheConfig()Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/MapGeocacheConfig;->getExpirySeconds()Ljava/lang/Integer;

    move-result-object v2

    :cond_2
    :goto_0
    return-object v2

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final y(Lco/bird/android/model/wire/configs/MobileMapConfigView;Lvt4;)Ljava/lang/Integer;
    .locals 2

    instance-of v0, p2, LUK;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getClientBirdGeocacheConfig()Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/MapGeocacheConfig;->getQueryLimit()Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    instance-of v0, p2, LUm;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getClientZoneGeocacheConfig()Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/MapGeocacheConfig;->getQueryLimit()Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of p2, p2, LB23;

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getClientNestGeocacheConfig()Lco/bird/android/model/wire/configs/MapGeocacheConfig;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/MapGeocacheConfig;->getQueryLimit()Ljava/lang/Integer;

    move-result-object v1

    :cond_2
    :goto_0
    return-object v1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final z(Lcom/google/android/gms/maps/model/LatLng;Ljava/util/Set;)Lio/reactivex/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/model/LatLng;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleBundleOfCellIds called with center="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " and cellIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->w()Lvt4;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;->S(Lvt4;Lcom/google/android/gms/maps/model/LatLng;Ljava/util/Set;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b;

    invoke-direct {v1, p0, p2, p1}, Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl$b;-><init>(Lco/bird/android/feature/rider/impl/GeocachedDataManagerImpl;Ljava/util/Set;Lcom/google/android/gms/maps/model/LatLng;)V

    new-instance p1, LNB1;

    invoke-direct {p1, v1}, LNB1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "private fun handleBundle\u2026ds,\n        )\n      }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
