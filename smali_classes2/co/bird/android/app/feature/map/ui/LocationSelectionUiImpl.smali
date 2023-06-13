.class public final Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;
.super LxE;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/ui/LocationSelectionUi;
.implements LUg3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001mB%\u0008\u0007\u0012\u0008\u0008\u0001\u0010j\u001a\u00020i\u0012\u0008\u0008\u0001\u0010O\u001a\u00020N\u0012\u0006\u0010R\u001a\u00020Q\u00a2\u0006\u0004\u0008k\u0010lJ\u0016\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J+\u0010\u000e\u001a\u00020\u000c2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\u000c\u0008\n\u0012\u0008\u0008\u000b\u0012\u0004\u0008\u0008(\u0005\u0012\u0004\u0012\u00020\u000c0\tH\u0002J\u0008\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0019\u0010\u0018\u001a\u00020\u000c2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006H\u0016J\u0018\u0010\u001f\u001a\u00020\u000c2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J \u0010\"\u001a\u00020\u000c2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011H\u0016J\u0008\u0010#\u001a\u00020\u001bH\u0016J\u0010\u0010&\u001a\u00020\u000c2\u0006\u0010%\u001a\u00020$H\u0016J\u0008\u0010\'\u001a\u00020$H\u0016J\u0016\u0010+\u001a\u00020\u000c2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020)0(H\u0016J\u001e\u0010-\u001a\u00020\u000c2\u0006\u0010,\u001a\u00020$2\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020)0(H\u0016J\u0008\u0010.\u001a\u00020\u000cH\u0016J\u0014\u00100\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020)0/0\u0006H\u0016J \u00105\u001a\u00020\u000c2\u0006\u00102\u001a\u0002012\u000e\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010(H\u0016J\u0012\u00107\u001a\u00020\u000c2\u0008\u0008\u0001\u00106\u001a\u00020\u0016H\u0016J\u0010\u0010:\u001a\u00020\u000c2\u0006\u00109\u001a\u000208H\u0016J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u0006H\u0016J\u000e\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0006H\u0016J\u0016\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00062\u0006\u0010=\u001a\u00020\u0011H\u0016J\u000e\u0010?\u001a\u0008\u0012\u0004\u0012\u00020$0\u0006H\u0016J\u0012\u0010B\u001a\u00020\u000c2\u0008\u0010A\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010C\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010D\u001a\u00020\u000cH\u0016J\u0008\u0010E\u001a\u00020\u000cH\u0016J\u0010\u0010G\u001a\u00020\u000c2\u0006\u0010F\u001a\u00020@H\u0016J\u0008\u0010H\u001a\u00020\u000cH\u0016J\u0008\u0010I\u001a\u00020\u000cH\u0016J\u0008\u0010J\u001a\u00020\u000cH\u0016J\u0008\u0010K\u001a\u00020\u000cH\u0016J\u0010\u0010M\u001a\u00020\u000c2\u0006\u0010L\u001a\u000203H\u0016R\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010SR$\u0010\u0005\u001a\u0010\u0012\u000c\u0012\n U*\u0004\u0018\u00010\u00040\u00040T8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008]\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008_\u0010`R\"\u0010c\u001a\u0010\u0012\u000c\u0012\n U*\u0004\u0018\u00010b0b0a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008c\u0010dR\"\u0010g\u001a\u0010\u0012\u000c\u0012\n U*\u0004\u0018\u00010f0f0e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008g\u0010h\u00a8\u0006n"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;",
        "LxE;",
        "Lco/bird/android/app/feature/map/ui/LocationSelectionUi;",
        "LUg3;",
        "LcD1;",
        "map",
        "Lio/reactivex/Observable;",
        "Landroid/location/Location;",
        "centerLocation",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "",
        "perform",
        "withMap",
        "Landroid/view/View;",
        "getView",
        "",
        "enable",
        "enableDoneButton",
        "show",
        "showDoneButton",
        "",
        "text",
        "setHeadsUpText",
        "(Ljava/lang/Integer;)V",
        "doneClicks",
        "Lco/bird/android/model/wire/WireLocation;",
        "location",
        "",
        "radius",
        "setCurrentLocation",
        "animate",
        "indirect",
        "setLocation",
        "getLocation",
        "",
        "address",
        "setAddress",
        "getAddress",
        "",
        "Lco/bird/android/model/persistence/Area;",
        "areas",
        "setAreas",
        "key",
        "setAdditionalAreas",
        "hideInfoWindow",
        "Lco/bird/android/buava/Optional;",
        "selectedAreaMarker",
        "",
        "zoomLevel",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "viewport",
        "updateAreasUi",
        "hint",
        "setAddressHint",
        "Lcom/google/android/gms/maps/model/MarkerOptions;",
        "markerOptions",
        "showInfoWindow",
        "mapClicks",
        "keyboardDoneClicks",
        "includeIndirectUpdates",
        "observeLocation",
        "observeAddressField",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "onMapReady",
        "onStart",
        "onResume",
        "outState",
        "onSaveInstanceState",
        "onPause",
        "onStop",
        "onDestroy",
        "onLowMemory",
        "point",
        "showInfoWindowForNonOperationalArea",
        "LHx5;",
        "binding",
        "LHx5;",
        "Ldr4;",
        "locationManager",
        "Ldr4;",
        "Lio/reactivex/subjects/g;",
        "kotlin.jvm.PlatformType",
        "Lio/reactivex/subjects/g;",
        "Lco/bird/android/app/feature/map/ui/MapAreasUi;",
        "areasUi",
        "Lco/bird/android/app/feature/map/ui/MapAreasUi;",
        "LfM2;",
        "marker",
        "LfM2;",
        "locationMarker",
        "Lxj0;",
        "circleMarker",
        "Lxj0;",
        "Lio/reactivex/subjects/a;",
        "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;",
        "locationSubject",
        "Lio/reactivex/subjects/a;",
        "LAG;",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "reactiveMapEventRelay",
        "LAG;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LHx5;Ldr4;)V",
        "LocationUpdate",
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
        "SMAP\nLocationSelectionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationSelectionUi.kt\nco/bird/android/app/feature/map/ui/LocationSelectionUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,359:1\n199#2:360\n*S KotlinDebug\n*F\n+ 1 LocationSelectionUi.kt\nco/bird/android/app/feature/map/ui/LocationSelectionUiImpl\n*L\n344#1:360\n*E\n"
    }
.end annotation


# instance fields
.field private areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUi;

.field private final binding:LHx5;

.field private circleMarker:Lxj0;

.field private final locationManager:Ldr4;

.field private locationMarker:LfM2;

.field private final locationSubject:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;",
            ">;"
        }
    .end annotation
.end field

.field private map:Lio/reactivex/subjects/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/g<",
            "LcD1;",
            ">;"
        }
    .end annotation
.end field

.field private marker:LfM2;

.field private final reactiveMapEventRelay:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LHx5;Ldr4;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iput-object p3, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->locationManager:Ldr4;

    invoke-static {}, Lio/reactivex/subjects/g;->w0()Lio/reactivex/subjects/g;

    move-result-object p3

    const-string v0, "create<GoogleMap>()"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->map:Lio/reactivex/subjects/g;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object p3

    const-string v0, "create<LocationUpdate>()"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->locationSubject:Lio/reactivex/subjects/a;

    invoke-static {}, LAG;->g()LAG;

    move-result-object p3

    const-string v0, "create<ReactiveMapEvent>()"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->reactiveMapEventRelay:LAG;

    iget-object p2, p2, LHx5;->c:Landroid/widget/LinearLayout;

    invoke-static {p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object p2

    const-string p3, "from(binding.dragView)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h0(Z)V

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p3, LXf4;->bird_bottom_sheet_peek_height:I

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->k0(I)V

    const/4 p1, 0x3

    invoke-virtual {p2, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p0(I)V

    return-void
.end method

.method public static synthetic Pl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->centerLocation$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Ql(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->observeLocation$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic Rl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireLocation;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->mapClicks$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireLocation;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Sl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->centerLocation$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Tl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->withMap$lambda$12(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Ul(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->centerLocation$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Vl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->mapClicks$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Wl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroid/location/Location;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->centerLocation$lambda$8(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroid/location/Location;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Xl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->mapClicks$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Yl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireLocation;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->observeLocation$lambda$10(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireLocation;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Zl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->keyboardDoneClicks$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$centerLocation(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;LcD1;)Lio/reactivex/Observable;
    .locals 0

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->centerLocation(LcD1;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBinding$p(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;)LHx5;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    return-object p0
.end method

.method public static final synthetic access$getCircleMarker$p(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;)Lxj0;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->circleMarker:Lxj0;

    return-object p0
.end method

.method public static final synthetic access$getLocationMarker$p(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;)LfM2;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->locationMarker:LfM2;

    return-object p0
.end method

.method public static final synthetic access$getLocationSubject$p(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;)Lio/reactivex/subjects/a;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->locationSubject:Lio/reactivex/subjects/a;

    return-object p0
.end method

.method public static final synthetic access$getMarker$p(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;)LfM2;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->marker:LfM2;

    return-object p0
.end method

.method public static final synthetic access$getReactiveMapEventRelay$p(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;)LAG;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->reactiveMapEventRelay:LAG;

    return-object p0
.end method

.method public static final synthetic access$setCircleMarker$p(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;Lxj0;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->circleMarker:Lxj0;

    return-void
.end method

.method public static final synthetic access$setLocationMarker$p(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;LfM2;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->locationMarker:LfM2;

    return-void
.end method

.method public static final synthetic access$setMarker$p(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;LfM2;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->marker:LfM2;

    return-void
.end method

.method private final centerLocation(LcD1;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LcD1;",
            ")",
            "Lio/reactivex/Observable<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->reactiveMapEventRelay:LAG;

    sget-object v1, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$centerLocation$2;->INSTANCE:Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$centerLocation$2;

    new-instance v2, LGw2;

    invoke-direct {v2, v1}, LGw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$centerLocation$3;

    invoke-direct {v1, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$centerLocation$3;-><init>(LcD1;)V

    new-instance p1, LHw2;

    invoke-direct {p1, v1}, LHw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-wide/16 v0, 0x1f4

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lio/reactivex/Observable;->debounce(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$centerLocation$4;->INSTANCE:Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$centerLocation$4;

    new-instance v1, LIw2;

    invoke-direct {v1, v0}, LIw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "map: GoogleMap): Observa\u2026ap { Locations.from(it) }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final centerLocation$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method private static final centerLocation$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method private static final centerLocation$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/maps/model/LatLng;

    return-object p0
.end method

.method private static final centerLocation$lambda$8(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroid/location/Location;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/location/Location;

    return-object p0
.end method

.method private static final keyboardDoneClicks$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    return-object p0
.end method

.method private static final mapClicks$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method private static final mapClicks$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method private static final mapClicks$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireLocation;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/WireLocation;

    return-object p0
.end method

.method private static final observeLocation$lambda$10(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireLocation;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/WireLocation;

    return-object p0
.end method

.method private static final observeLocation$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method private final withMap(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LcD1;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->map:Lio/reactivex/subjects/g;

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "map\n      .observeOn(And\u2026dSchedulers.mainThread())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/F;->e(Lio/reactivex/G;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/SingleSubscribeProxy;

    new-instance v1, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$withMap$1;

    invoke-direct {v1, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$withMap$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance p1, LFw2;

    invoke-direct {p1, v1}, LFw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, p1}, Lcom/uber/autodispose/SingleSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method private static final withMap$lambda$12(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public centerLocation()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Landroid/location/Location;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->map:Lio/reactivex/subjects/g;

    new-instance v1, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$centerLocation$1;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$centerLocation$1;-><init>(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;)V

    new-instance v2, Lzw2;

    invoke-direct {v2, v1}, Lzw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->D(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun centerLocat\u2026 centerLocation(it) }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public doneClicks()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->g:Landroid/widget/Button;

    const-string v1, "binding.next"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public enableDoneButton(Z)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->g:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public getAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->b:Lco/bird/android/widget/SilenceableMaterialEditText;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLocation()Lco/bird/android/model/wire/WireLocation;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->marker:LfM2;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, LfM2;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    const-string v1, "marker!!.position"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiKt;->access$toLocation(Lcom/google/android/gms/maps/model/LatLng;)Lco/bird/android/model/wire/WireLocation;

    move-result-object v0

    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    const-string v1, "null cannot be cast to non-null type android.view.View"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public hideInfoWindow()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUi;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapAreasUi;->hideInfoWindow()V

    :cond_0
    return-void
.end method

.method public keyboardDoneClicks()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->b:Lco/bird/android/widget/SilenceableMaterialEditText;

    const-string v1, "binding.addressText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lef5;->b(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$keyboardDoneClicks$1;->INSTANCE:Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$keyboardDoneClicks$1;

    new-instance v2, Lyw2;

    invoke-direct {v2, v1}, Lyw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "binding.addressText.editorActions().map { Unit }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public mapClicks()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->map:Lio/reactivex/subjects/g;

    new-instance v1, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$mapClicks$1;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$mapClicks$1;-><init>(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;)V

    new-instance v2, LCw2;

    invoke-direct {v2, v1}, LCw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->D(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$mapClicks$2;->INSTANCE:Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$mapClicks$2;

    new-instance v2, LDw2;

    invoke-direct {v2, v1}, LDw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$mapClicks$3;->INSTANCE:Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$mapClicks$3;

    new-instance v2, LEw2;

    invoke-direct {v2, v1}, LEw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun mapClicks()\u2026.toLocation()\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public observeAddressField()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->b:Lco/bird/android/widget/SilenceableMaterialEditText;

    const-string v1, "binding.addressText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/16 v3, 0x64

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->textChanges$default(Landroid/widget/EditText;IZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public observeLocation(Z)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->locationSubject:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$observeLocation$1;

    invoke-direct {v1, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$observeLocation$1;-><init>(Z)V

    new-instance p1, LAw2;

    invoke-direct {p1, v1}, LAw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$observeLocation$2;->INSTANCE:Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$observeLocation$2;

    new-instance v1, LBw2;

    invoke-direct {v1, v0}, LBw2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "includeIndirectUpdates: \u2026     .map { it.location }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    invoke-static {v0}, LbM2;->a(Landroid/content/Context;)I

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->e:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapView;->b(Landroid/os/Bundle;)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object p1, p1, LHx5;->e:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/maps/MapView;->a(LUg3;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->e:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->c()V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->e:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->d()V

    return-void
.end method

.method public onMapReady(LcD1;)V
    .locals 10

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->map:Lio/reactivex/subjects/g;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/g;->onSuccess(Ljava/lang/Object;)V

    new-instance v4, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;

    invoke-direct {v4, p1}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;-><init>(LcD1;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->reactiveMapEventRelay:LAG;

    invoke-virtual {v0, v4}, LAG;->accept(Ljava/lang/Object;)V

    new-instance v0, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-object v7, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->locationManager:Ldr4;

    const/16 v8, 0x18

    const/4 v9, 0x0

    move-object v1, v0

    move-object v3, p1

    invoke-direct/range {v1 .. v9}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;-><init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;LOh;Ldr4;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUi;

    invoke-virtual {p1}, LcD1;->l()Lxd6;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lxd6;->a(Z)V

    new-instance v0, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;-><init>(Landroid/content/Context;Lco/bird/android/model/constant/MapMode;Z)V

    invoke-virtual {p1, v0}, LcD1;->p(LcD1$b;)V

    invoke-virtual {p1, v3}, LcD1;->o(Z)Z

    new-instance v0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$onMapReady$2;

    invoke-direct {v0, p0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$onMapReady$2;-><init>(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;LcD1;)V

    invoke-virtual {p1, v0}, LcD1;->C(LcD1$m;)V

    return-void
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->e:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->e()V

    return-void
.end method

.method public onResume()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->e:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->f()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->e:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapView;->g(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->e:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->h()V

    return-void
.end method

.method public onStop()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->e:Lcom/google/android/gms/maps/MapView;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->i()V

    return-void
.end method

.method public selectedAreaMarker()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/persistence/Area;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUi;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapAreasUi;->selectedAreaMarker()Lio/reactivex/Observable;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "empty()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method

.method public setAdditionalAreas(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Area;",
            ">;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "areas"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUi;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lco/bird/android/app/feature/map/ui/MapAreasUi;->setAdditionalAreas(Ljava/lang/String;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public setAddress(Ljava/lang/String;)V
    .locals 3

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->b:Lco/bird/android/widget/SilenceableMaterialEditText;

    sget-object v1, Landroid/widget/TextView$BufferType;->EDITABLE:Landroid/widget/TextView$BufferType;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lco/bird/android/widget/SilenceableMaterialEditText;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;Z)V

    return-void
.end method

.method public setAddressHint(I)V
    .locals 2

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "activity.getString(hint)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->b:Lco/bird/android/widget/SilenceableMaterialEditText;

    const-string v1, "binding.addressText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LR91;->b(Lcom/google/android/material/textfield/TextInputEditText;)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public setAreas(Ljava/util/List;)V
    .locals 1
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

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUi;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUi;->setAreas(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public setAreasCompleteChanges()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi$DefaultImpls;->setAreasCompleteChanges(Lco/bird/android/app/feature/map/ui/LocationSelectionUi;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public setCurrentLocation(Lco/bird/android/model/wire/WireLocation;D)V
    .locals 1

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$setCurrentLocation$1;

    invoke-direct {v0, p1, p0, p2, p3}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$setCurrentLocation$1;-><init>(Lco/bird/android/model/wire/WireLocation;Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;D)V

    invoke-direct {p0, v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->withMap(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public setHeadsUpText(Ljava/lang/Integer;)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v1, v1, LHx5;->d:Landroid/widget/TextView;

    const-string v2, "binding.headsUpText"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, p1, v2, v3, v0}, Ltu6;->setTextAndVisibility$default(Landroid/widget/TextView;Ljava/lang/CharSequence;IILjava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_0
    if-nez v0, :cond_1

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    invoke-virtual {p1}, LHx5;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object p1

    const-string v0, "binding.root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public setLocation(Lco/bird/android/model/wire/WireLocation;ZZ)V
    .locals 2

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->locationSubject:Lio/reactivex/subjects/a;

    new-instance v1, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;

    invoke-direct {v1, p1, p3}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;-><init>(Lco/bird/android/model/wire/WireLocation;Z)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    new-instance p3, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$setLocation$1;

    invoke-direct {p3, p1, p0, p2}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$setLocation$1;-><init>(Lco/bird/android/model/wire/WireLocation;Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;Z)V

    invoke-direct {p0, p3}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->withMap(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public showDoneButton(Z)V
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->binding:LHx5;

    iget-object v0, v0, LHx5;->g:Landroid/widget/Button;

    const-string v1, "binding.next"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public showInfoWindow(Lcom/google/android/gms/maps/model/MarkerOptions;)V
    .locals 1

    const-string v0, "markerOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$showInfoWindow$1;

    invoke-direct {v0, p1}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$showInfoWindow$1;-><init>(Lcom/google/android/gms/maps/model/MarkerOptions;)V

    invoke-direct {p0, v0}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->withMap(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public showInfoWindowForArea(Lco/bird/android/model/persistence/Area;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi$DefaultImpls;->showInfoWindowForArea(Lco/bird/android/app/feature/map/ui/LocationSelectionUi;Lco/bird/android/model/persistence/Area;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public showInfoWindowForNonOperationalArea(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    const-string v0, "point"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUi;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUi;->showInfoWindowForNonOperationalArea(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_0
    return-void
.end method

.method public updateAreasUi(FLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUi;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lco/bird/android/app/feature/map/ui/MapAreasUi;->updateAreasUi(FLjava/util/List;)V

    :cond_0
    return-void
.end method
