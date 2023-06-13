.class public final Lco/bird/android/app/feature/operator/activity/OperatorActivity;
.super Lco/bird/android/core/map/BaseMapActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/operator/activity/OperatorActivity$a;,
        Lco/bird/android/app/feature/operator/activity/OperatorActivity$b;,
        Lco/bird/android/app/feature/operator/activity/OperatorActivity$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d4\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 D2\u00020\u0001:\u0006\u00f3\u0001\u00f4\u0001\u00f5\u0001B\t\u00a2\u0006\u0006\u0008\u00f1\u0001\u0010\u00f2\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0008\u0010\u000b\u001a\u00020\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0016J\u0012\u0010\u0010\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0008\u0010\u0014\u001a\u00020\u0002H\u0016J*\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0008\u0010\u001b\u001a\u00020\u0002H\u0014R\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010@R\"\u0010H\u001a\u00020B8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010C\u001a\u0004\u0008D\u0010E\"\u0004\u0008F\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008J\u0010K\u001a\u0004\u0008L\u0010M\"\u0004\u0008N\u0010OR\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008R\u0010S\u001a\u0004\u0008T\u0010U\"\u0004\u0008V\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008Z\u0010[\u001a\u0004\u0008\\\u0010]\"\u0004\u0008^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008b\u0010c\u001a\u0004\u0008d\u0010e\"\u0004\u0008f\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008j\u0010k\u001a\u0004\u0008l\u0010m\"\u0004\u0008n\u0010oR\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008r\u0010s\u001a\u0004\u0008t\u0010u\"\u0004\u0008v\u0010wR\"\u0010|\u001a\u00020q8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008y\u0010s\u001a\u0004\u0008z\u0010u\"\u0004\u0008{\u0010wR\'\u0010\u0084\u0001\u001a\u00020}8\u0006@\u0006X\u0087.\u00a2\u0006\u0016\n\u0004\u0008~\u0010\u007f\u001a\u0006\u0008\u0080\u0001\u0010\u0081\u0001\"\u0006\u0008\u0082\u0001\u0010\u0083\u0001R*\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001\u001a\u0006\u0008\u0088\u0001\u0010\u0089\u0001\"\u0006\u0008\u008a\u0001\u0010\u008b\u0001R)\u0010\u0093\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0017\n\u0005\u0008\u001a\u0010\u008e\u0001\u001a\u0006\u0008\u008f\u0001\u0010\u0090\u0001\"\u0006\u0008\u0091\u0001\u0010\u0092\u0001R*\u0010\u009b\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u0095\u0001\u0010\u0096\u0001\u001a\u0006\u0008\u0097\u0001\u0010\u0098\u0001\"\u0006\u0008\u0099\u0001\u0010\u009a\u0001R*\u0010\u00a3\u0001\u001a\u00030\u009c\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u009d\u0001\u0010\u009e\u0001\u001a\u0006\u0008\u009f\u0001\u0010\u00a0\u0001\"\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001R*\u0010\u00ab\u0001\u001a\u00030\u00a4\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001\u001a\u0006\u0008\u00a7\u0001\u0010\u00a8\u0001\"\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001R*\u0010\u00b3\u0001\u001a\u00030\u00ac\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0018\n\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001\u001a\u0006\u0008\u00af\u0001\u0010\u00b0\u0001\"\u0006\u0008\u00b1\u0001\u0010\u00b2\u0001R\u001e\u0010\u00b7\u0001\u001a\u00020\u00158\u0014X\u0094\u0004\u00a2\u0006\u000f\n\u0005\u0008\u00b4\u0001\u0010#\u001a\u0006\u0008\u00b5\u0001\u0010\u00b6\u0001R!\u0010\u00bd\u0001\u001a\u00030\u00b8\u00018TX\u0094\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001\u001a\u0006\u0008\u00bb\u0001\u0010\u00bc\u0001R\u001c\u0010\u00c1\u0001\u001a\u0005\u0018\u00010\u00be\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001R\u001c\u0010\u00c5\u0001\u001a\u0005\u0018\u00010\u00c2\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c3\u0001\u0010\u00c4\u0001R\u001c\u0010\u00c9\u0001\u001a\u0005\u0018\u00010\u00c6\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001R\u001b\u0010\u00cc\u0001\u001a\u0005\u0018\u00010\u00ca\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\n\u0010\u00cb\u0001R\u001c\u0010\u00d0\u0001\u001a\u0005\u0018\u00010\u00cd\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ce\u0001\u0010\u00cf\u0001R\u001b\u0010\u00d3\u0001\u001a\u0005\u0018\u00010\u00d1\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0003\u0010\u00d2\u0001R\u001c\u0010\u00d7\u0001\u001a\u0005\u0018\u00010\u00d4\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00d5\u0001\u0010\u00d6\u0001R\u001b\u0010\u00da\u0001\u001a\u0005\u0018\u00010\u00d8\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008t\u0010\u00d9\u0001R\u001b\u0010\u00dd\u0001\u001a\u0005\u0018\u00010\u00db\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008l\u0010\u00dc\u0001R\u001a\u0010\u00e1\u0001\u001a\u00030\u00de\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00df\u0001\u0010\u00e0\u0001R\u001a\u0010\u00e5\u0001\u001a\u00030\u00e2\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00e3\u0001\u0010\u00e4\u0001R\u001a\u0010\u00e9\u0001\u001a\u00030\u00e6\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00e7\u0001\u0010\u00e8\u0001R\u001a\u0010\u00ed\u0001\u001a\u00030\u00ea\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00eb\u0001\u0010\u00ec\u0001R\u0019\u0010\u00f0\u0001\u001a\u00030\u00ee\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0007\n\u0005\u0008%\u0010\u00ef\u0001\u00a8\u0006\u00f6\u0001"
    }
    d2 = {
        "Lco/bird/android/app/feature/operator/activity/OperatorActivity;",
        "Lco/bird/android/core/map/BaseMapActivity;",
        "",
        "C0",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "LcD1;",
        "map",
        "onMapReady",
        "A0",
        "onPause",
        "Landroid/view/Menu;",
        "menu",
        "",
        "onCreateOptionsMenu",
        "onPrepareOptionsMenu",
        "Landroid/view/MenuItem;",
        "item",
        "onOptionsItemSelected",
        "onBackPressed",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "q0",
        "onDestroy",
        "LJy;",
        "H",
        "LJy;",
        "Q",
        "()LJy;",
        "kind",
        "LBK2;",
        "I",
        "LBK2;",
        "K0",
        "()LBK2;",
        "setMapMarkerOverridesManager",
        "(LBK2;)V",
        "mapMarkerOverridesManager",
        "LCw3;",
        "J",
        "LCw3;",
        "Y0",
        "()LCw3;",
        "setOperatorUi",
        "(LCw3;)V",
        "operatorUi",
        "LG03;",
        "K",
        "LG03;",
        "N0",
        "()LG03;",
        "setNavigationDrawerPresenterFactory",
        "(LG03;)V",
        "navigationDrawerPresenterFactory",
        "LPm3;",
        "P",
        "LPm3;",
        "M0",
        "()LPm3;",
        "setMapUiFactory",
        "(LPm3;)V",
        "mapUiFactory",
        "Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;",
        "Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;",
        "L0",
        "()Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;",
        "setMapPresenterFactory",
        "(Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;)V",
        "mapPresenterFactory",
        "LHs3;",
        "R",
        "LHs3;",
        "V0",
        "()LHs3;",
        "setOperatorPresenterFactory",
        "(LHs3;)V",
        "operatorPresenterFactory",
        "Landroid/os/Handler;",
        "S",
        "Landroid/os/Handler;",
        "getHandler",
        "()Landroid/os/Handler;",
        "setHandler",
        "(Landroid/os/Handler;)V",
        "handler",
        "LuQ3;",
        "T",
        "LuQ3;",
        "h1",
        "()LuQ3;",
        "setPermissionDelegate",
        "(LuQ3;)V",
        "permissionDelegate",
        "LRh6;",
        "U",
        "LRh6;",
        "i1",
        "()LRh6;",
        "setUserStream",
        "(LRh6;)V",
        "userStream",
        "LAs1;",
        "W",
        "LAs1;",
        "F0",
        "()LAs1;",
        "setFlightSheetDelegate",
        "(LAs1;)V",
        "flightSheetDelegate",
        "Luk1;",
        "X",
        "Luk1;",
        "E0",
        "()Luk1;",
        "setBannerAnnouncementPresenterFactory",
        "(Luk1;)V",
        "bannerAnnouncementPresenterFactory",
        "Y",
        "Q0",
        "setOperatorAnnouncementPresenterFactory",
        "operatorAnnouncementPresenterFactory",
        "LSs3;",
        "Z",
        "LSs3;",
        "X0",
        "()LSs3;",
        "setOperatorReleasePresenter",
        "(LSs3;)V",
        "operatorReleasePresenter",
        "Lzq3;",
        "p0",
        "Lzq3;",
        "f1",
        "()Lzq3;",
        "setParkingNestPresenterFactory",
        "(Lzq3;)V",
        "parkingNestPresenterFactory",
        "LEj3;",
        "LEj3;",
        "R0",
        "()LEj3;",
        "setOperatorAreaPresenterFactory",
        "(LEj3;)V",
        "operatorAreaPresenterFactory",
        "LMk3;",
        "r0",
        "LMk3;",
        "S0",
        "()LMk3;",
        "setOperatorBountyPresenterFactory",
        "(LMk3;)V",
        "operatorBountyPresenterFactory",
        "LSm3;",
        "s0",
        "LSm3;",
        "U0",
        "()LSm3;",
        "setOperatorNestMarkerPresenterFactory",
        "(LSm3;)V",
        "operatorNestMarkerPresenterFactory",
        "Lnx3;",
        "t0",
        "Lnx3;",
        "Z0",
        "()Lnx3;",
        "setOperatorWarehousePresenterFactory",
        "(Lnx3;)V",
        "operatorWarehousePresenterFactory",
        "Lcy3;",
        "u0",
        "Lcy3;",
        "a1",
        "()Lcy3;",
        "setOperatorZonePresenterFactory",
        "(Lcy3;)V",
        "operatorZonePresenterFactory",
        "v0",
        "o0",
        "()I",
        "layoutResource",
        "Lcom/google/android/gms/maps/MapView;",
        "w0",
        "Lkotlin/Lazy;",
        "n0",
        "()Lcom/google/android/gms/maps/MapView;",
        "googleMapView",
        "LJq3;",
        "x0",
        "LJq3;",
        "operatorPresenter",
        "Lyq3;",
        "y0",
        "Lyq3;",
        "parkingNestPresenter",
        "LEk3;",
        "z0",
        "LEk3;",
        "bountyPresenter",
        "Lco3;",
        "Lco3;",
        "nestPresenter",
        "Lmx3;",
        "B0",
        "Lmx3;",
        "warehousePresenter",
        "LZx3;",
        "LZx3;",
        "zonePresenter",
        "Lco/bird/android/app/feature/map/presenter/MapPresenter;",
        "D0",
        "Lco/bird/android/app/feature/map/presenter/MapPresenter;",
        "mapPresenter",
        "LaZ2;",
        "LaZ2;",
        "navigationDrawerPresenter",
        "LNm3;",
        "LNm3;",
        "mapUi",
        "LBj3;",
        "G0",
        "LBj3;",
        "operatorAreaPresenter",
        "Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;",
        "H0",
        "Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;",
        "locationEnableChangeReceiver",
        "Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;",
        "I0",
        "Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;",
        "bluetoothEnableChangeReceiver",
        "Lu4;",
        "J0",
        "Lu4;",
        "binding",
        "LCt6;",
        "LCt6;",
        "sideMenuBannerBinding",
        "<init>",
        "()V",
        "a",
        "b",
        "c",
        "app_birdRelease"
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
        "SMAP\nOperatorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorActivity.kt\nco/bird/android/app/feature/operator/activity/OperatorActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,436:1\n1#2:437\n44#3:438\n1549#4:439\n1620#4,3:440\n1855#4,2:443\n*S KotlinDebug\n*F\n+ 1 OperatorActivity.kt\nco/bird/android/app/feature/operator/activity/OperatorActivity\n*L\n157#1:438\n179#1:439\n179#1:440,3\n284#1:443,2\n*E\n"
    }
.end annotation


# static fields
.field public static final L0:Lco/bird/android/app/feature/operator/activity/OperatorActivity$a;

.field public static final M0:I

.field public static final N0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public A0:Lco3;

.field public B0:Lmx3;

.field public C0:LZx3;

.field public D0:Lco/bird/android/app/feature/map/presenter/MapPresenter;

.field public E0:LaZ2;

.field public F0:LNm3;

.field public G0:LBj3;

.field public final H:LJy;

.field public H0:Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

.field public I:LBK2;

.field public I0:Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;

.field public J:LCw3;

.field public J0:Lu4;

.field public K:LG03;

.field public K0:LCt6;

.field public P:LPm3;

.field public Q:Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;

.field public R:LHs3;

.field public S:Landroid/os/Handler;

.field public T:LuQ3;

.field public U:LRh6;

.field public W:LAs1;

.field public X:Luk1;

.field public Y:Luk1;

.field public Z:LSs3;

.field public p0:Lzq3;

.field public q0:LEj3;

.field public r0:LMk3;

.field public s0:LSm3;

.field public t0:Lnx3;

.field public u0:Lcy3;

.field public final v0:I

.field public final w0:Lkotlin/Lazy;

.field public x0:LJq3;

.field public y0:Lyq3;

.field public z0:LEk3;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/app/feature/operator/activity/OperatorActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/operator/activity/OperatorActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->L0:Lco/bird/android/app/feature/operator/activity/OperatorActivity$a;

    const/16 v0, 0x8

    sput v0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->M0:I

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0x2733

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x2734

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->N0:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lco/bird/android/core/map/BaseMapActivity;-><init>(Z)V

    sget-object v0, LJy;->c:LJy;

    iput-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->H:LJy;

    sget v0, Lcj4;->activity_operator:I

    iput v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->v0:I

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lco/bird/android/app/feature/operator/activity/OperatorActivity$d;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity$d;-><init>(Lco/bird/android/app/feature/operator/activity/OperatorActivity;)V

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->w0:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic B0(Lco/bird/android/app/feature/operator/activity/OperatorActivity;)V
    .locals 0

    invoke-static {p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->j1(Lco/bird/android/app/feature/operator/activity/OperatorActivity;)V

    return-void
.end method

.method public static final j1(Lco/bird/android/app/feature/operator/activity/OperatorActivity;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->E0:LaZ2;

    if-eqz p0, :cond_0

    sget v0, Lvi4;->nav_inspection:I

    invoke-interface {p0, v0}, LaZ2;->c(I)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public A0(LcD1;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lco/bird/android/core/map/BaseMapActivity;->A0(LcD1;)V

    iget-object p1, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->D0:Lco/bird/android/app/feature/map/presenter/MapPresenter;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->p0()Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v0

    invoke-interface {p1, v0}, Lco/bird/android/app/feature/map/presenter/MapPresenter;->onResume(Lcom/uber/autodispose/ScopeProvider;)V

    :cond_0
    iget-object p1, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->x0:LJq3;

    if-eqz p1, :cond_1

    invoke-interface {p1}, LJq3;->onResume()V

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->X0()LSs3;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/map/BaseMapActivity;->p0()Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v0

    invoke-virtual {p1, v0}, LSs3;->m(Lcom/uber/autodispose/ScopeProvider;)V

    iget-object p1, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->A0:Lco3;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco3;->p1()V

    :cond_2
    iget-object p1, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->z0:LEk3;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LEk3;->O0()V

    :cond_3
    iget-object p1, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->E0:LaZ2;

    if-eqz p1, :cond_4

    invoke-interface {p1}, LaZ2;->onResume()V

    :cond_4
    return-void
.end method

.method public final C0()V
    .locals 9

    new-instance v7, LT03;

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->J0:Lu4;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v3, v0, Lu4;->E:Landroidx/appcompat/widget/Toolbar;

    const-string v0, "binding.toolbar"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->J0:Lu4;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    iget-object v4, v0, Lu4;->k:Landroidx/drawerlayout/widget/DrawerLayout;

    const-string v0, "binding.drawer"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->J0:Lu4;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    iget-object v5, v1, Lu4;->s:Lcom/guness/widget/NavigationView;

    const-string v0, "binding.navigationView"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->X()Lgl;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v8

    move-object v0, v7

    move-object v1, p0

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, LT03;-><init>(Lco/bird/android/core/mvp/BaseActivity;Landroidx/appcompat/widget/Toolbar;Landroidx/drawerlayout/widget/DrawerLayout;Lcom/guness/widget/NavigationView;Lgl;LTq4;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->N0()LG03;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->x()LDQ3;

    move-result-object v3

    invoke-interface {v0, v1, v7, v2, v3}, LG03;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LM03;Le13;LDQ3;)LD03;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->E0:LaZ2;

    if-eqz v0, :cond_3

    invoke-interface {v0}, LaZ2;->a()V

    :cond_3
    return-void
.end method

.method public final E0()Luk1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->X:Luk1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "bannerAnnouncementPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final F0()LAs1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->W:LAs1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "flightSheetDelegate"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final K0()LBK2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->I:LBK2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mapMarkerOverridesManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final L0()Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->Q:Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mapPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final M0()LPm3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->P:LPm3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mapUiFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final N0()LG03;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->K:LG03;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "navigationDrawerPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public Q()LJy;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->H:LJy;

    return-object v0
.end method

.method public final Q0()Luk1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->Y:Luk1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "operatorAnnouncementPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final R0()LEj3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->q0:LEj3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "operatorAreaPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final S0()LMk3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->r0:LMk3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "operatorBountyPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final U0()LSm3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->s0:LSm3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "operatorNestMarkerPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final V0()LHs3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->R:LHs3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "operatorPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final X0()LSs3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->Z:LSs3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "operatorReleasePresenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Y0()LCw3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->J:LCw3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "operatorUi"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Z0()Lnx3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->t0:Lnx3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "operatorWarehousePresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final a1()Lcy3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->u0:Lcy3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "operatorZonePresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final f1()Lzq3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->p0:Lzq3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "parkingNestPresenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h1()LuQ3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->T:LuQ3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "permissionDelegate"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i1()LRh6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->U:LRh6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "userStream"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public n0()Lcom/google/android/gms/maps/MapView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->w0:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-googleMapView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/gms/maps/MapView;

    return-object v0
.end method

.method public o0()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->v0:I

    return v0
.end method

.method public onBackPressed()V
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->J0:Lu4;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget-object v0, v0, Lu4;->k:Landroidx/drawerlayout/widget/DrawerLayout;

    const v3, 0x800003

    invoke-virtual {v0, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->C(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->J0:Lu4;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    iget-object v0, v1, Lu4;->k:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->d(I)V

    goto :goto_1

    :cond_2
    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onBackPressed()V

    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 20

    move-object/from16 v11, p0

    sget v0, LCl4;->LightAppTheme_NoActionBar:I

    invoke-virtual {v11, v0}, Landroidx/appcompat/app/AppCompatActivity;->setTheme(I)V

    invoke-super/range {p0 .. p1}, Lco/bird/android/core/map/BaseMapActivity;->onCreate(Landroid/os/Bundle;)V

    sget v0, LVg4;->drawer:I

    invoke-virtual {v11, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lu4;->a(Landroid/view/View;)Lu4;

    move-result-object v0

    const-string v1, "bind(findViewById(R.id.drawer))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v11, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->J0:Lu4;

    const-string v17, "binding"

    if-nez v0, :cond_0

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    iget-object v0, v0, Lu4;->s:Lcom/guness/widget/NavigationView;

    invoke-virtual {v0}, Lcom/guness/widget/NavigationView;->u()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, LVq6;->a(Landroid/view/View;)LVq6;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, v0, LVq6;->c:LCt6;

    const-string v1, "binding.sideMenuBanner"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v11, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->K0:LCt6;

    :cond_1
    invoke-static {}, Lco/bird/android/app/feature/operator/activity/a;->a()Lco/bird/android/app/feature/operator/activity/OperatorActivity$b$a;

    move-result-object v0

    sget-object v1, LoG2;->a:LoG2;

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v2

    const-string v3, "application"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    new-instance v2, Lco/bird/android/app/feature/operator/activity/OperatorActivity$c;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v3

    invoke-direct {v2, v3}, Lco/bird/android/app/feature/operator/activity/OperatorActivity$c;-><init>(LTq4;)V

    invoke-static/range {p0 .. p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v4

    const-string v3, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/map/BaseMapActivity;->p0()Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v5

    sget v3, LVg4;->navigationView:I

    invoke-virtual {v11, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lcom/guness/widget/NavigationView;

    iget-object v3, v11, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->J0:Lu4;

    if-nez v3, :cond_2

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/16 v18, 0x0

    goto :goto_0

    :cond_2
    move-object/from16 v18, v3

    :goto_0
    iget-object v3, v11, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->K0:LCt6;

    if-nez v3, :cond_3

    const-string v3, "sideMenuBannerBinding"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/16 v19, 0x0

    goto :goto_1

    :cond_3
    move-object/from16 v19, v3

    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v3

    move-object v12, v3

    invoke-virtual/range {p0 .. p0}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v15

    move-object v13, v15

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->x()LDQ3;

    move-result-object v14

    const-string v8, "factory()"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v10, "supportFragmentManager"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "lifecycle"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v15, 0x180

    const/16 v16, 0x0

    move-object/from16 v3, p0

    move-object/from16 v10, v18

    move-object/from16 v11, v19

    invoke-static/range {v0 .. v16}, Lco/bird/android/app/feature/operator/activity/OperatorActivity$b$a$a;->create$default(Lco/bird/android/app/feature/operator/activity/OperatorActivity$b$a;LlG2;Lco/bird/android/app/feature/operator/activity/OperatorActivity$c;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lcom/guness/widget/NavigationView;Lco/bird/android/model/constant/FlightSheetContext;ZLu4;LCt6;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;LDQ3;ILjava/lang/Object;)Lco/bird/android/app/feature/operator/activity/OperatorActivity$b;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-interface {v0, v1}, Lco/bird/android/app/feature/operator/activity/OperatorActivity$b;->a(Lco/bird/android/app/feature/operator/activity/OperatorActivity;)V

    iget-object v10, v1, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->J0:Lu4;

    if-nez v10, :cond_4

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v10, 0x0

    :cond_4
    iget-object v0, v10, Lu4;->E:Landroidx/appcompat/widget/Toolbar;

    sget v2, Lnl4;->contractor_activity_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v10, v1, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->J0:Lu4;

    if-nez v10, :cond_5

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v10, 0x0

    :cond_5
    iget-object v0, v10, Lu4;->E:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, v0}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->C0()V

    new-instance v0, Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->h1()LuQ3;

    move-result-object v2

    invoke-direct {v0, v2}, Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;-><init>(LuQ3;)V

    iput-object v0, v1, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->H0:Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

    new-instance v0, Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->h1()LuQ3;

    move-result-object v2

    invoke-direct {v0, v2}, Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;-><init>(LuQ3;)V

    iput-object v0, v1, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->I0:Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    iget-object v10, v1, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->H0:Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

    if-nez v10, :cond_6

    const-string v0, "locationEnableChangeReceiver"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v10, 0x0

    :cond_6
    new-instance v0, Landroid/content/IntentFilter;

    const-string v2, "android.location.MODE_CHANGED"

    invoke-direct {v0, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v10, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->i1()LRh6;

    move-result-object v0

    invoke-interface {v0}, LRh6;->a()Lco/bird/android/model/User;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lco/bird/android/model/User;->getOperatorRoles()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_7

    check-cast v0, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/OperatorRole;

    invoke-virtual {v2}, Lco/bird/android/model/OperatorRole;->getRole()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v10, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    const/4 v10, 0x0

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->E0()Luk1;

    move-result-object v0

    sget-object v2, Lco/bird/android/model/constant/AnnouncementContext;->SIDE_MENU:Lco/bird/android/model/constant/AnnouncementContext;

    new-instance v11, Lgk1$h;

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v3, Lco/bird/android/model/constant/MapMode;->OPERATOR:Lco/bird/android/model/constant/MapMode;

    invoke-virtual {v3}, Lco/bird/android/model/constant/MapMode;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x3

    const/4 v9, 0x0

    move-object v3, v11

    move-object v7, v10

    invoke-direct/range {v3 .. v9}, Lgk1$h;-><init>(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v12, 0x0

    invoke-interface {v0, v12, v2, v11}, Luk1;->a(LZr1;Lco/bird/android/model/constant/AnnouncementContext;Lgk1$h;)Lgk1;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->Q0()Luk1;

    move-result-object v0

    sget-object v2, Lco/bird/android/model/constant/AnnouncementContext;->OPERATOR_MAP:Lco/bird/android/model/constant/AnnouncementContext;

    new-instance v11, Lgk1$h;

    const/4 v6, 0x0

    const/4 v8, 0x7

    move-object v3, v11

    invoke-direct/range {v3 .. v9}, Lgk1$h;-><init>(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v12, v2, v11}, Luk1;->a(LZr1;Lco/bird/android/model/constant/AnnouncementContext;Lgk1$h;)Lgk1;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->X0()LSs3;

    move-result-object v0

    invoke-virtual {v0}, LSs3;->k()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    const-string v0, "menu"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    sget v1, LUk4;->menu_operator_activity:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->Y0()LCw3;

    move-result-object v0

    invoke-interface {v0, p1}, LCw3;->Z0(Landroid/view/Menu;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->x0:LJq3;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LJq3;->onDestroy()V

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->F0:LNm3;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/MapUi;->onDestroy()V

    :cond_1
    invoke-super {p0}, Lco/bird/android/core/map/BaseMapActivity;->onDestroy()V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->H0:Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    const-string v0, "locationEnableChangeReceiver"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->I0:Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;

    if-nez v0, :cond_3

    const-string v0, "bluetoothEnableChangeReceiver"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v1, v0

    :goto_0
    invoke-virtual {p0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public onMapReady(LcD1;)V
    .locals 21

    move-object/from16 v10, p0

    move-object/from16 v3, p1

    const-string v0, "map"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Lco/bird/android/core/map/BaseMapActivity;->onMapReady(LcD1;)V

    invoke-virtual/range {p1 .. p1}, LcD1;->l()Lxd6;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lxd6;->a(Z)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRiderMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/MobileMapConfigView;->getEnableUserLocationV2()Z

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->M0()LPm3;

    move-result-object v0

    const/4 v2, 0x0

    new-instance v4, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;

    invoke-direct {v4, v3}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;-><init>(LcD1;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->n0()Lcom/google/android/gms/maps/MapView;

    move-result-object v5

    iget-object v1, v10, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->J0:Lu4;

    const/4 v11, 0x0

    if-nez v1, :cond_0

    const-string v1, "binding"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v11

    :cond_0
    iget-object v6, v1, Lu4;->r:Landroid/widget/ImageButton;

    const/4 v7, 0x1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->K0()LBK2;

    move-result-object v8

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    invoke-interface/range {v0 .. v9}, LPm3;->a(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZLBK2;Z)LOm3;

    move-result-object v0

    iput-object v0, v10, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->F0:LNm3;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->L0()Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/map/BaseMapActivity;->p0()Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/constant/MapMode;->OPERATOR:Lco/bird/android/model/constant/MapMode;

    const/4 v4, 0x0

    invoke-interface {v1, v2, v0, v3, v4}, Lco/bird/android/app/feature/map/presenter/MapPresenterImplFactory;->create(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/constant/MapMode;Z)Lco/bird/android/app/feature/map/presenter/MapPresenterImpl;

    move-result-object v1

    iput-object v1, v10, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->D0:Lco/bird/android/app/feature/map/presenter/MapPresenter;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->V0()LHs3;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/map/BaseMapActivity;->p0()Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->Y0()LCw3;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v17

    iget-object v1, v10, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->H0:Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

    if-nez v1, :cond_1

    const-string v1, "locationEnableChangeReceiver"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v11

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;->a()Lio/reactivex/Observable;

    move-result-object v18

    iget-object v1, v10, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->I0:Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;

    if-nez v1, :cond_2

    const-string v1, "bluetoothEnableChangeReceiver"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v11

    :cond_2
    invoke-virtual {v1}, Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;->a()Lio/reactivex/Observable;

    move-result-object v19

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->F0()LAs1;

    move-result-object v20

    move-object v15, v0

    invoke-interface/range {v12 .. v20}, LHs3;->a(Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LNm3;LCw3;Le13;Lio/reactivex/Observable;Lio/reactivex/Observable;LAs1;)Lts3;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "zoom_include_region"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v2

    instance-of v3, v2, Ljava/util/ArrayList;

    if-eqz v3, :cond_3

    move-object v11, v2

    check-cast v11, Ljava/util/ArrayList;

    :cond_3
    invoke-virtual {v1, v11}, Lts3;->I1(Ljava/util/List;)V

    iput-object v1, v10, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->x0:LJq3;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->R0()LEj3;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v2

    invoke-interface {v1, v2, v0}, LEj3;->a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LNm3;)LBj3;

    move-result-object v1

    invoke-virtual {v1}, LBj3;->y()V

    iput-object v1, v10, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->G0:LBj3;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->U0()LSm3;

    move-result-object v1

    invoke-interface {v1, v0, v0}, LSm3;->a(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapNestMarkerUi;)Lco3;

    move-result-object v1

    invoke-virtual {v1}, Lco3;->k0()V

    iput-object v1, v10, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->A0:Lco3;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->Z0()Lnx3;

    move-result-object v1

    invoke-interface {v1, v0, v0}, Lnx3;->a(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapWarehouseMarkerUi;)Lmx3;

    move-result-object v1

    invoke-virtual {v1}, Lmx3;->x()V

    iput-object v1, v10, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->B0:Lmx3;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->S0()LMk3;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->Y0()LCw3;

    move-result-object v3

    invoke-interface {v1, v0, v2, v3}, LMk3;->a(LNm3;Lcom/uber/autodispose/ScopeProvider;LPk3;)LEk3;

    move-result-object v1

    invoke-virtual {v1}, LEk3;->Z()V

    iput-object v1, v10, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->z0:LEk3;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->f1()Lzq3;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->Y0()LCw3;

    move-result-object v3

    invoke-interface {v1, v0, v2, v3}, Lzq3;->a(LNm3;Lcom/uber/autodispose/ScopeProvider;LCw3;)Lyq3;

    move-result-object v1

    invoke-virtual {v1}, Lyq3;->v()V

    iput-object v1, v10, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->y0:Lyq3;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->a1()Lcy3;

    move-result-object v1

    invoke-interface {v1, v0, v0}, Lcy3;->a(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapZoneMarkerUi;)LZx3;

    move-result-object v0

    invoke-virtual {v0}, LZx3;->K()V

    iput-object v0, v10, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->C0:LZx3;

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 4

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, LVg4;->areaRefresh:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    iget-object p1, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->G0:LBj3;

    if-nez p1, :cond_0

    const-string p1, "operatorAreaPresenter"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    invoke-virtual {v3}, LBj3;->w()V

    goto :goto_1

    :cond_1
    sget v1, LVg4;->notifications:I

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object p1

    invoke-static {p1, v3, v2, v3}, Le13$a;->goToNotificationCenter$default(Le13;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v2

    :goto_1
    return v2
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/map/BaseMapActivity;->onPause()V

    iget-object v0, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->D0:Lco/bird/android/app/feature/map/presenter/MapPresenter;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lco/bird/android/app/feature/map/presenter/MapPresenter;->onPause()V

    :cond_0
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    invoke-super {p0, p1}, Landroid/app/Activity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-interface {p1}, Landroid/view/Menu;->size()I

    move-result v1

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lkotlin/collections/IntIterator;

    invoke-virtual {v1}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v1

    invoke-interface {p1, v1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    sget v2, LDf4;->birdWhite:I

    invoke-static {p0, v2}, LNA0;->c(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    return v0
.end method

.method public q0(IILandroid/content/Intent;LcD1;)V
    .locals 3

    const-string v0, "map"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3, p4}, Lco/bird/android/core/map/BaseMapActivity;->q0(IILandroid/content/Intent;LcD1;)V

    sget-object p4, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->N0:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p4

    const/4 v0, -0x1

    if-eqz p4, :cond_0

    if-ne p2, v0, :cond_8

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p2, Lii3;

    invoke-direct {p2, p0}, Lii3;-><init>(Lco/bird/android/app/feature/operator/activity/OperatorActivity;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    const/16 p4, 0x2753

    const-string v1, "nest_release_count"

    const/4 v2, 0x0

    if-ne p1, p4, :cond_2

    if-ne p2, v0, :cond_8

    iget-object p1, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->A0:Lco3;

    if-eqz p1, :cond_8

    if-eqz p3, :cond_1

    invoke-virtual {p3, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    :cond_1
    invoke-virtual {p1, v2}, Lco3;->w1(I)V

    goto :goto_0

    :cond_2
    const/16 p4, 0x2759

    if-ne p1, p4, :cond_4

    if-ne p2, v0, :cond_8

    invoke-virtual {p0}, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->X0()LSs3;

    move-result-object p1

    if-eqz p3, :cond_3

    invoke-virtual {p3, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    :cond_3
    invoke-virtual {p1, v2}, LSs3;->l(I)V

    goto :goto_0

    :cond_4
    const/16 p4, 0x2754

    if-ne p1, p4, :cond_5

    if-ne p2, v0, :cond_8

    iget-object p1, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->A0:Lco3;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lco3;->v1()V

    goto :goto_0

    :cond_5
    iget-object p4, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->x0:LJq3;

    if-eqz p4, :cond_6

    invoke-interface {p4, p1, p2, p3}, LJq3;->onActivityResult(IILandroid/content/Intent;)V

    :cond_6
    iget-object p4, p0, Lco/bird/android/app/feature/operator/activity/OperatorActivity;->G0:LBj3;

    if-nez p4, :cond_7

    const-string p4, "operatorAreaPresenter"

    invoke-static {p4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p4, 0x0

    :cond_7
    invoke-virtual {p4, p1, p2, p3}, LBj3;->x(IILandroid/content/Intent;)V

    :cond_8
    :goto_0
    return-void
.end method
