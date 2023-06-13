.class public Lco/bird/android/app/feature/map/ui/MapUiImpl;
.super LxE;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/ui/MapUi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/map/ui/MapUiImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00da\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0016\u0018\u0000 \u00d3\u00012\u00020\u00012\u00020\u0002:\u0002\u00d3\u0001Bx\u0012\u0008\u0010\u00cf\u0001\u001a\u00030\u00ce\u0001\u0012\t\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010`\u001a\u00020_\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010h\u001a\u00020g\u0012\u0008\u0010m\u001a\u0004\u0018\u00010l\u0012\u0006\u0010r\u001a\u00020q\u0012\u0006\u0010v\u001a\u00020J\u0012\u0006\u0010z\u001a\u00020J\u0012\u0006\u0010}\u001a\u00020|\u00a2\u0006\u0006\u0008\u00d1\u0001\u0010\u00d2\u0001J\u0008\u0010\u0004\u001a\u00020\u0003H\u0002J\u0008\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0008\u0010\u000c\u001a\u00020\u0005H\u0016J\u000e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\rH\u0016J\u000e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\rH\u0016J\u000e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\rH\u0016J\u001e\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0004\u0012\u00020\u00030\u00130\u0012J\u0010\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rH\u0016J!\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0016\u0010\u0018\u001a\u00020\u00052\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0014H\u0016J\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0008\u0010\u001f\u001a\u00020\u0005H\u0016J\u0008\u0010!\u001a\u00020 H\u0016J\u0008\u0010#\u001a\u00020\"H\u0016J\u000e\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\rH\u0016J\u000e\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0\rH\u0016J\u0010\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rH\u0016J\u0016\u0010*\u001a\u00020\u00052\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020(0\u0014H\u0016J(\u0010/\u001a\u00020\u00052\u0006\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020 H\u0016J\u0008\u00100\u001a\u00020\u0005H\u0016J\u0016\u00101\u001a\u0008\u0012\u0004\u0012\u00020%0\r2\u0006\u0010\u0008\u001a\u00020%H\u0016J\u0008\u00102\u001a\u00020\u0005H\u0016J\u0016\u00105\u001a\u00020\u00052\u000c\u00104\u001a\u0008\u0012\u0004\u0012\u0002030\u0014H\u0016J\u0016\u00108\u001a\u00020\u00052\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u0002060\u0014H\u0016J\u001e\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u0002092\u000c\u00104\u001a\u0008\u0012\u0004\u0012\u0002030\u0014H\u0016J\u000e\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00050\rH\u0016J\u0014\u0010>\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002030=0\rH\u0016J\u000e\u0010?\u001a\u0008\u0012\u0004\u0012\u0002060\rH\u0016J\u0008\u0010@\u001a\u00020\u0005H\u0016J \u0010B\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00032\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0014H\u0016J\u0010\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u000fH\u0016J\u000e\u0010A\u001a\u0008\u0012\u0004\u0012\u00020E0\u0014H\u0016J\u000e\u0010F\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0014H\u0016J\u0008\u0010H\u001a\u00020GH\u0016J\u0010\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020\u000fH\u0016J\u0018\u0010O\u001a\u00020\u00052\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020\u000fH\u0004R\u001a\u0010Q\u001a\u00020P8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008Q\u0010R\u001a\u0004\u0008S\u0010TR\u001a\u0010V\u001a\u00020U8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008V\u0010W\u001a\u0004\u0008X\u0010YR\u001a\u0010[\u001a\u00020Z8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008[\u0010\\\u001a\u0004\u0008]\u0010^R\u001a\u0010`\u001a\u00020_8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008`\u0010a\u001a\u0004\u0008b\u0010cR\u001a\u0010#\u001a\u00020\"8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008#\u0010d\u001a\u0004\u0008e\u0010fR\u001a\u0010h\u001a\u00020g8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008h\u0010i\u001a\u0004\u0008j\u0010kR\u001c\u0010m\u001a\u0004\u0018\u00010l8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008m\u0010n\u001a\u0004\u0008o\u0010pR\u001a\u0010r\u001a\u00020q8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008r\u0010s\u001a\u0004\u0008t\u0010uR\u001a\u0010v\u001a\u00020J8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008v\u0010w\u001a\u0004\u0008x\u0010yR\u001a\u0010z\u001a\u00020J8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008z\u0010w\u001a\u0004\u0008{\u0010yR\u001b\u0010}\u001a\u00020|8\u0004X\u0084\u0004\u00a2\u0006\r\n\u0004\u0008}\u0010~\u001a\u0005\u0008\u007f\u0010\u0080\u0001R \u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0004X\u0084\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001\u001a\u0006\u0008\u0084\u0001\u0010\u0085\u0001R \u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0004X\u0084\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0086\u0001\u0010\u0083\u0001\u001a\u0006\u0008\u0087\u0001\u0010\u0085\u0001R,\u0010\u0089\u0001\u001a\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030=0\u0088\u00018\u0004X\u0084\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0089\u0001\u0010\u008a\u0001\u001a\u0006\u0008\u008b\u0001\u0010\u008c\u0001R0\u0010\u008d\u0001\u001a\u001b\u0012\u0016\u0012\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0004\u0012\u00020\u00030\u00130\u0088\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008d\u0001\u0010\u008a\u0001R\u001a\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008f\u0001\u0010\u0090\u0001R\'\u0010\u0093\u0001\u001a\u0012\u0012\r\u0012\u000b \u0092\u0001*\u0004\u0018\u00010%0%0\u0091\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001R%\u0010\u001d\u001a\u0012\u0012\r\u0012\u000b \u0092\u0001*\u0004\u0018\u00010\u001c0\u001c0\u0091\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001d\u0010\u0094\u0001R \u0010\u0095\u0001\u001a\u00030\u0081\u00018\u0004X\u0084\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0095\u0001\u0010\u0083\u0001\u001a\u0006\u0008\u0096\u0001\u0010\u0085\u0001R,\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0098\u0001\u0010\u0099\u0001\u001a\u0006\u0008\u009a\u0001\u0010\u009b\u0001\"\u0006\u0008\u009c\u0001\u0010\u009d\u0001R\u001c\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u009f\u0001\u0010\u00a0\u0001R\u001c\u0010\u00a1\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a1\u0001\u0010\u00a0\u0001R\u001c\u0010\u00a3\u0001\u001a\u0005\u0018\u00010\u00a2\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001R\u0018\u0010\u00a6\u0001\u001a\u00030\u00a5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001R)\u0010\u00a9\u0001\u001a\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030=0\u00a8\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001\u001a\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001R5\u0010\u00ad\u0001\u001a\u001b\u0012\u0016\u0012\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0004\u0012\u00020\u00030\u00130\u00a8\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u00ad\u0001\u0010\u00aa\u0001\u001a\u0006\u0008\u00ae\u0001\u0010\u00ac\u0001R\u0018\u0010\u00b0\u0001\u001a\u00030\u00af\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001RR\u0010\u00b2\u0001\u001a5\u00121\u0012/\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0004\u0012\u00020\u0003 \u0092\u0001*\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00130\u00130\r8\u0004X\u0084\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001\u001a\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001R:\u0010\u00b6\u0001\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003 \u0092\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010=0=0\r8\u0004X\u0084\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00b6\u0001\u0010\u00b3\u0001\u001a\u0006\u0008\u00b7\u0001\u0010\u00b5\u0001R\u0018\u0010\u00b9\u0001\u001a\u00030\u00b8\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001R\u001f\u0010\u00bd\u0001\u001a\n\u0012\u0005\u0012\u00030\u00bc\u00010\u00bb\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00bd\u0001\u0010\u00be\u0001R\u0018\u0010\u00c0\u0001\u001a\u00030\u00bf\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c0\u0001\u0010\u00c1\u0001R!\u0010\u00c6\u0001\u001a\u00030\u009e\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00c2\u0001\u0010\u00c3\u0001\u001a\u0006\u0008\u00c4\u0001\u0010\u00c5\u0001R%\u0010\u00c7\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050\r8\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00c7\u0001\u0010\u00b3\u0001\u001a\u0006\u0008\u00c8\u0001\u0010\u00b5\u0001R\u0016\u0010\u00ca\u0001\u001a\u00020J8BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00c9\u0001\u0010yR\u0017\u0010\u00cd\u0001\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001\u00a8\u0006\u00d4\u0001"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/MapUiImpl;",
        "LxE;",
        "Lco/bird/android/app/feature/map/ui/MapUi;",
        "",
        "getZoomLevelForMovingTo",
        "",
        "onDestroy",
        "Landroid/location/Location;",
        "location",
        "updateMyLocation",
        "direction",
        "updateLocationRotate",
        "removeRoute",
        "Lio/reactivex/Observable;",
        "mapClicks",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "mapClicksLocation",
        "centerLocationChanged",
        "Lio/reactivex/k;",
        "Lkotlin/Pair;",
        "",
        "viewportChanged",
        "myLocationClicks",
        "zoomLevel",
        "zoomTo",
        "(Landroid/location/Location;Ljava/lang/Float;)V",
        "Lco/bird/android/model/Point;",
        "points",
        "Lcom/google/android/gms/maps/model/CameraPosition;",
        "cameraPosition",
        "moveTo",
        "clearBirds",
        "",
        "nearbyRadius",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "reactiveMapEvent",
        "cameraPositionUpdates",
        "Lco/bird/android/model/wire/WireLocation;",
        "mapLongClicks",
        "myLocationLongClicks",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "sites",
        "setMerchantSites",
        "startLatitude",
        "startLongitude",
        "endLatitude",
        "endLongitude",
        "setDestination",
        "clearDestination",
        "showTeleportMarker",
        "removeTeleportMarker",
        "Lco/bird/android/model/persistence/Area;",
        "areas",
        "setAreas",
        "Lco/bird/android/model/persistence/ZonePolygonable;",
        "zones",
        "setZones",
        "",
        "key",
        "setAdditionalAreas",
        "setAreasCompleteChanges",
        "Lco/bird/android/buava/Optional;",
        "selectedAreaMarker",
        "zoneClicks",
        "hideInfoWindow",
        "viewport",
        "updateAreasUi",
        "point",
        "showInfoWindowForNonOperationalArea",
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "latLngViewport",
        "Lcom/google/android/gms/maps/model/LatLngBounds;",
        "latLngBounds",
        "latlng",
        "",
        "viewportContains",
        "Lco/bird/android/model/Route;",
        "route",
        "includeLatLng",
        "drawRouteAndZoom",
        "Li66;",
        "traceProvider",
        "Li66;",
        "getTraceProvider",
        "()Li66;",
        "LTq4;",
        "reactiveConfig",
        "LTq4;",
        "getReactiveConfig",
        "()LTq4;",
        "LOh;",
        "appBuildConfig",
        "LOh;",
        "getAppBuildConfig",
        "()LOh;",
        "LcD1;",
        "map",
        "LcD1;",
        "getMap",
        "()LcD1;",
        "Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "getReactiveMapEvent",
        "()Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;",
        "Lcom/google/android/gms/maps/MapView;",
        "mapView",
        "Lcom/google/android/gms/maps/MapView;",
        "getMapView",
        "()Lcom/google/android/gms/maps/MapView;",
        "Landroid/view/View;",
        "myLocationButton",
        "Landroid/view/View;",
        "getMyLocationButton",
        "()Landroid/view/View;",
        "Lco/bird/android/model/constant/MapMode;",
        "mode",
        "Lco/bird/android/model/constant/MapMode;",
        "getMode",
        "()Lco/bird/android/model/constant/MapMode;",
        "drawUserLocation",
        "Z",
        "getDrawUserLocation",
        "()Z",
        "userDirectionalArrow",
        "getUserDirectionalArrow",
        "Ldr4;",
        "locationManager",
        "Ldr4;",
        "getLocationManager",
        "()Ldr4;",
        "",
        "zoomPaddingPx",
        "I",
        "getZoomPaddingPx",
        "()I",
        "extraLargeZoomPaddingPx",
        "getExtraLargeZoomPaddingPx",
        "La94;",
        "mutableZoomLevelObservable",
        "La94;",
        "getMutableZoomLevelObservable",
        "()La94;",
        "mutableViewportChanges",
        "Landroid/widget/TextView;",
        "locationDebugText",
        "Landroid/widget/TextView;",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "mapLongClickSubject",
        "Lio/reactivex/subjects/d;",
        "pathColor",
        "getPathColor",
        "LMX3;",
        "currentRoute",
        "LMX3;",
        "getCurrentRoute",
        "()LMX3;",
        "setCurrentRoute",
        "(LMX3;)V",
        "LfM2;",
        "locationMarker",
        "LfM2;",
        "teleportMarker",
        "Lxj0;",
        "radiusCircle",
        "Lxj0;",
        "Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;",
        "areasUi",
        "Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;",
        "LZ84;",
        "zoomLevelObservable",
        "LZ84;",
        "getZoomLevelObservable",
        "()LZ84;",
        "viewportChangesObservable",
        "getViewportChangesObservable",
        "Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;",
        "areaModelManager",
        "Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;",
        "mapModelManagerViewportChangesObservable",
        "Lio/reactivex/Observable;",
        "getMapModelManagerViewportChangesObservable",
        "()Lio/reactivex/Observable;",
        "mapModelManagerZoomObservable",
        "getMapModelManagerZoomObservable",
        "Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;",
        "merchantSiteModelManager",
        "Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;",
        "",
        "LhF0;",
        "destinationCurves",
        "Ljava/util/List;",
        "LjF0;",
        "curveManager",
        "LjF0;",
        "destinationMarker$delegate",
        "Lkotlin/Lazy;",
        "getDestinationMarker",
        "()LfM2;",
        "destinationMarker",
        "destinationFlagClicks",
        "getDestinationFlagClicks",
        "getShowLocationDebugData",
        "showLocationDebugData",
        "getCenterLocation",
        "()Lcom/google/android/gms/maps/model/LatLng;",
        "centerLocation",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "initialCameraPosition",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;Li66;LTq4;LOh;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLdr4;)V",
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
        "SMAP\nMapUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUi.kt\nco/bird/android/app/feature/map/ui/MapUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,538:1\n180#2:539\n161#2:540\n180#2:541\n180#2:542\n1855#3,2:543\n1855#3,2:545\n1855#3,2:547\n*S KotlinDebug\n*F\n+ 1 MapUi.kt\nco/bird/android/app/feature/map/ui/MapUiImpl\n*L\n226#1:539\n235#1:540\n241#1:541\n247#1:542\n337#1:543,2\n430#1:545,2\n513#1:547,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lco/bird/android/app/feature/map/ui/MapUiImpl$Companion;

.field private static final MAP_MODEL_MANAGER_ZOOM_THROTTLE_MS:J = 0x1f4L


# instance fields
.field private final appBuildConfig:LOh;

.field private final areaModelManager:Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;

.field private final areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

.field private final cameraPosition:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lcom/google/android/gms/maps/model/CameraPosition;",
            ">;"
        }
    .end annotation
.end field

.field private currentRoute:LMX3;

.field private final curveManager:LjF0;

.field private final destinationCurves:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LhF0;",
            ">;"
        }
    .end annotation
.end field

.field private final destinationFlagClicks:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final destinationMarker$delegate:Lkotlin/Lazy;

.field private final drawUserLocation:Z

.field private final extraLargeZoomPaddingPx:I

.field private final locationDebugText:Landroid/widget/TextView;

.field private final locationManager:Ldr4;

.field private locationMarker:LfM2;

.field private final map:LcD1;

.field private final mapLongClickSubject:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;"
        }
    .end annotation
.end field

.field private final mapModelManagerViewportChangesObservable:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mapModelManagerZoomObservable:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mapView:Lcom/google/android/gms/maps/MapView;

.field private final merchantSiteModelManager:Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;

.field private final mode:Lco/bird/android/model/constant/MapMode;

.field private final mutableViewportChanges:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mutableZoomLevelObservable:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field private final myLocationButton:Landroid/view/View;

.field private final pathColor:I

.field private radiusCircle:Lxj0;

.field private final reactiveConfig:LTq4;

.field private final reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

.field private teleportMarker:LfM2;

.field private final traceProvider:Li66;

.field private final userDirectionalArrow:Z

.field private final viewportChangesObservable:LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ84<",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field private final zoomLevelObservable:LZ84;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field private final zoomPaddingPx:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/map/ui/MapUiImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/map/ui/MapUiImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->Companion:Lco/bird/android/app/feature/map/ui/MapUiImpl$Companion;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;Li66;LTq4;LOh;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;Lco/bird/android/model/constant/MapMode;ZZLdr4;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v6, p5

    move-object/from16 v12, p6

    move-object/from16 v13, p7

    move-object/from16 v1, p8

    move-object/from16 v2, p10

    move-object/from16 v7, p13

    const-string v3, "activity"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "traceProvider"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "reactiveConfig"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "appBuildConfig"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "map"

    invoke-static {v12, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "reactiveMapEvent"

    invoke-static {v13, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "mapView"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "mode"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "locationManager"

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object v10, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->traceProvider:Li66;

    iput-object v11, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->reactiveConfig:LTq4;

    iput-object v6, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->appBuildConfig:LOh;

    iput-object v12, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    iput-object v13, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    iput-object v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mapView:Lcom/google/android/gms/maps/MapView;

    move-object/from16 v1, p9

    iput-object v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->myLocationButton:Landroid/view/View;

    iput-object v2, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mode:Lco/bird/android/model/constant/MapMode;

    move/from16 v1, p11

    iput-boolean v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->drawUserLocation:Z

    move/from16 v1, p12

    iput-boolean v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->userDirectionalArrow:Z

    iput-object v7, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->locationManager:Ldr4;

    invoke-virtual/range {p1 .. p1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LXf4;->map_zoom_padding:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->zoomPaddingPx:I

    invoke-virtual/range {p1 .. p1}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LXf4;->map_zoom_padding_xlarge:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->extraLargeZoomPaddingPx:I

    sget-object v1, La94;->h:La94$a;

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v14

    iput-object v14, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mutableZoomLevelObservable:La94;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {v1, v2, v3, v4, v3}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object v15

    iput-object v15, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mutableViewportChanges:La94;

    sget v1, LAh4;->locationDebugText:I

    invoke-static {v8, v1}, LfB0;->x(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->locationDebugText:Landroid/widget/TextView;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v1

    const-string v2, "create<WireLocation>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mapLongClickSubject:Lio/reactivex/subjects/d;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object v1

    const-string v2, "create<CameraPosition>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->cameraPosition:Lio/reactivex/subjects/d;

    sget v1, LDf4;->extraGreen:I

    invoke-static {v8, v1}, LfB0;->f(Landroid/content/Context;I)I

    move-result v1

    iput v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->pathColor:I

    new-instance v5, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    move-object v1, v5

    move-object/from16 v2, p1

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move-object v13, v5

    move-object/from16 v5, p4

    invoke-direct/range {v1 .. v7}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;-><init>(Lco/bird/android/core/mvp/BaseActivity;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;LTq4;LOh;Ldr4;)V

    iput-object v13, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    sget-object v1, LZ84;->d:LZ84$a;

    invoke-virtual {v1, v14}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object v2

    iput-object v2, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->zoomLevelObservable:LZ84;

    invoke-virtual {v1, v15}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->viewportChangesObservable:LZ84;

    new-instance v3, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;

    new-instance v4, Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;

    new-instance v5, Lco/bird/android/app/feature/map/ui/MapUiImpl$areaModelManager$1;

    invoke-direct {v5, v13}, Lco/bird/android/app/feature/map/ui/MapUiImpl$areaModelManager$1;-><init>(Ljava/lang/Object;)V

    invoke-direct {v4, v5}, Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {v3, v4, v10}, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;-><init>(Lco/bird/android/app/feature/map/ui/renderer/AreaRenderer;Li66;)V

    iput-object v3, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->areaModelManager:Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x1f4

    invoke-virtual {v1, v4, v5, v3}, Lio/reactivex/Observable;->throttleLatest(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v1

    const/4 v6, 0x1

    invoke-virtual {v1, v6}, Lio/reactivex/Observable;->replay(I)Lio/reactivex/observables/a;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/observables/a;->i()Lio/reactivex/Observable;

    move-result-object v1

    const-string v7, "viewportChangesObservabl\u2026replay(1)\n    .refCount()"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mapModelManagerViewportChangesObservable:Lio/reactivex/Observable;

    invoke-virtual {v2, v4, v5, v3}, Lio/reactivex/Observable;->throttleLatest(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-virtual {v1, v6}, Lio/reactivex/Observable;->replay(I)Lio/reactivex/observables/a;

    move-result-object v1

    invoke-virtual {v1}, Lio/reactivex/observables/a;->i()Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "zoomLevelObservable\n    \u2026replay(1)\n    .refCount()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mapModelManagerZoomObservable:Lio/reactivex/Observable;

    new-instance v2, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;

    new-instance v3, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;

    invoke-direct {v3, v8, v12}, Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;-><init>(Landroid/content/Context;LcD1;)V

    invoke-direct {v2, v3, v11, v1}, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;-><init>(Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;LTq4;Lio/reactivex/Observable;)V

    iput-object v2, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->merchantSiteModelManager:Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->destinationCurves:Ljava/util/List;

    new-instance v1, LjF0;

    invoke-direct {v1, v12}, LjF0;-><init>(LcD1;)V

    new-instance v2, LQL2;

    invoke-direct {v2, v0}, LQL2;-><init>(Lco/bird/android/app/feature/map/ui/MapUiImpl;)V

    invoke-virtual {v1, v2}, LjF0;->h(Lnf3;)V

    iput-object v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->curveManager:LjF0;

    new-instance v1, Lco/bird/android/app/feature/map/ui/MapUiImpl$destinationMarker$2;

    invoke-direct {v1, v0, v8}, Lco/bird/android/app/feature/map/ui/MapUiImpl$destinationMarker$2;-><init>(Lco/bird/android/app/feature/map/ui/MapUiImpl;Lco/bird/android/core/mvp/BaseActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->destinationMarker$delegate:Lkotlin/Lazy;

    const/4 v1, 0x0

    invoke-virtual {v12, v1}, LcD1;->o(Z)Z

    invoke-virtual/range {p6 .. p6}, LcD1;->l()Lxd6;

    move-result-object v2

    invoke-virtual {v2, v1}, Lxd6;->b(Z)V

    if-eqz v9, :cond_0

    invoke-virtual {v0, v9}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->moveTo(Lcom/google/android/gms/maps/model/CameraPosition;)V

    :cond_0
    invoke-interface/range {p7 .. p7}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->cameraMoves()Lio/reactivex/Observable;

    move-result-object v1

    invoke-static/range {p1 .. p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Lco/bird/android/app/feature/map/ui/MapUiImpl$1;

    invoke-direct {v3, v0}, Lco/bird/android/app/feature/map/ui/MapUiImpl$1;-><init>(Lco/bird/android/app/feature/map/ui/MapUiImpl;)V

    new-instance v4, LRL2;

    invoke-direct {v4, v3}, LRL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->viewportChanged()Lio/reactivex/k;

    move-result-object v1

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/reactivex/k;->s0(Lio/reactivex/E;)Lio/reactivex/k;

    move-result-object v1

    const-string v3, "viewportChanged()\n      \u2026Schedulers.computation())"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/reactivex/k;->f(Lio/reactivex/l;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/uber/autodispose/FlowableSubscribeProxy;

    new-instance v3, Lco/bird/android/app/feature/map/ui/MapUiImpl$2;

    invoke-direct {v3, v0}, Lco/bird/android/app/feature/map/ui/MapUiImpl$2;-><init>(Lco/bird/android/app/feature/map/ui/MapUiImpl;)V

    new-instance v4, LSL2;

    invoke-direct {v4, v3}, LSL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v4}, Lcom/uber/autodispose/FlowableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface/range {p7 .. p7}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->mapLongClicks()Lio/reactivex/Observable;

    move-result-object v1

    invoke-static/range {p1 .. p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v3, Lco/bird/android/app/feature/map/ui/MapUiImpl$3;

    invoke-direct {v3, v0}, Lco/bird/android/app/feature/map/ui/MapUiImpl$3;-><init>(Lco/bird/android/app/feature/map/ui/MapUiImpl;)V

    new-instance v4, LTL2;

    invoke-direct {v4, v3}, LTL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface/range {p7 .. p7}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->mapClicks()Lio/reactivex/Observable;

    move-result-object v1

    invoke-static/range {p1 .. p1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, Lco/bird/android/app/feature/map/ui/MapUiImpl$4;

    invoke-direct {v2, v0}, Lco/bird/android/app/feature/map/ui/MapUiImpl$4;-><init>(Lco/bird/android/app/feature/map/ui/MapUiImpl;)V

    new-instance v3, LUL2;

    invoke-direct {v3, v2}, LUL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v1, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface/range {p7 .. p7}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->markerClicks()Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lco/bird/android/app/feature/map/ui/MapUiImpl$destinationFlagClicks$1;

    invoke-direct {v2, v0}, Lco/bird/android/app/feature/map/ui/MapUiImpl$destinationFlagClicks$1;-><init>(Lco/bird/android/app/feature/map/ui/MapUiImpl;)V

    new-instance v3, LVL2;

    invoke-direct {v3, v2}, LVL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lco/bird/android/app/feature/map/ui/MapUiImpl$destinationFlagClicks$2;->INSTANCE:Lco/bird/android/app/feature/map/ui/MapUiImpl$destinationFlagClicks$2;

    new-instance v3, LML2;

    invoke-direct {v3, v2}, LML2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "reactiveMapEvent.markerC\u2026er.id }\n    .map { Unit }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->destinationFlagClicks:Lio/reactivex/Observable;

    return-void
.end method

.method public static synthetic Pl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->viewportChanged$lambda$11(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Ql(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->destinationFlagClicks$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic Rl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mapClicks$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Sl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->_init_$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Tl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->centerLocationChanged$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Ul(Lco/bird/android/app/feature/map/ui/MapUiImpl;LhF0;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->curveManager$lambda$1$lambda$0(Lco/bird/android/app/feature/map/ui/MapUiImpl;LhF0;)V

    return-void
.end method

.method public static synthetic Vl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->_init_$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Wl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->_init_$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Xl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->_init_$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic Yl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->centerLocationChanged$lambda$10(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic Zl(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->destinationFlagClicks$lambda$8(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final _init_$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$getCameraPosition$p(Lco/bird/android/app/feature/map/ui/MapUiImpl;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->cameraPosition:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getDestinationMarker(Lco/bird/android/app/feature/map/ui/MapUiImpl;)LfM2;
    .locals 0

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getDestinationMarker()LfM2;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMapLongClickSubject$p(Lco/bird/android/app/feature/map/ui/MapUiImpl;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mapLongClickSubject:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$getMutableViewportChanges$p(Lco/bird/android/app/feature/map/ui/MapUiImpl;)La94;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mutableViewportChanges:La94;

    return-object p0
.end method

.method public static final synthetic access$getTeleportMarker$p(Lco/bird/android/app/feature/map/ui/MapUiImpl;)LfM2;
    .locals 0

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->teleportMarker:LfM2;

    return-object p0
.end method

.method private static final centerLocationChanged$lambda$10(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method private static final centerLocationChanged$lambda$9(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/maps/model/LatLng;

    return-object p0
.end method

.method private static final curveManager$lambda$1$lambda$0(Lco/bird/android/app/feature/map/ui/MapUiImpl;LhF0;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->destinationCurves:Ljava/util/List;

    const-string v0, "curve"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final destinationFlagClicks$lambda$7(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method private static final destinationFlagClicks$lambda$8(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    return-object p0
.end method

.method private final getDestinationMarker()LfM2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->destinationMarker$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LfM2;

    return-object v0
.end method

.method private final getShowLocationDebugData()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->reactiveConfig:LTq4;

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getEnableLocationDebugInfoOnMapScreen()Z

    move-result v0

    return v0
.end method

.method private final getZoomLevelForMovingTo()F
    .locals 3

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->zoomLevelObservable:LZ84;

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    const/high16 v1, 0x41400000    # 12.0f

    cmpg-float v2, v0, v1

    if-gez v2, :cond_1

    move v0, v1

    goto :goto_0

    :cond_0
    const/high16 v0, 0x41880000    # 17.0f

    :cond_1
    :goto_0
    return v0
.end method

.method private static final mapClicks$lambda$6(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Unit;

    return-object p0
.end method

.method private static final viewportChanged$lambda$11(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public cameraPositionUpdates()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/maps/model/CameraPosition;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->cameraPosition:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "cameraPosition.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public centerLocationChanged()Lio/reactivex/Observable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->cameraIdles()Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lio/reactivex/Observable;->debounce(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/ui/MapUiImpl$centerLocationChanged$1;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl$centerLocationChanged$1;-><init>(Lco/bird/android/app/feature/map/ui/MapUiImpl;)V

    new-instance v2, LNL2;

    invoke-direct {v2, v1}, LNL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/ui/MapUiImpl$centerLocationChanged$2;->INSTANCE:Lco/bird/android/app/feature/map/ui/MapUiImpl$centerLocationChanged$2;

    new-instance v2, LOL2;

    invoke-direct {v2, v1}, LOL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "override fun centerLocat\u2026 { it.isProbablyValid() }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public clearBirds()V
    .locals 0

    return-void
.end method

.method public clearDestination()V
    .locals 2

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getDestinationMarker()LfM2;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LfM2;->r(Z)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->destinationCurves:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LhF0;

    invoke-interface {v1}, LhF0;->remove()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->destinationCurves:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final drawRouteAndZoom(Lco/bird/android/model/Route;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 8

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "includeLatLng"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->currentRoute:LMX3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LMX3;->a()V

    :cond_0
    new-instance v0, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    iget v1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->pathColor:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->E(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/maps/model/RoundCap;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/RoundCap;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->k1(Lcom/google/android/gms/maps/model/Cap;)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/maps/model/RoundCap;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/RoundCap;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->F(Lcom/google/android/gms/maps/model/Cap;)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->j1(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    const-string v1, "PolylineOptions()\n      \u2026ointType(JointType.ROUND)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/maps/model/LatLngBounds;->s()Lcom/google/android/gms/maps/model/LatLngBounds$a;

    move-result-object v1

    const-string v2, "builder()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/Route;->getPoints()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->s(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->b(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    goto :goto_0

    :cond_1
    invoke-virtual {v1, p2}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->b(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    invoke-virtual {p1, v0}, LcD1;->e(Lcom/google/android/gms/maps/model/PolylineOptions;)LMX3;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->currentRoute:LMX3;

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mode:Lco/bird/android/model/constant/MapMode;

    sget-object p2, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    if-ne p1, p2, :cond_2

    iget-object v2, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v3

    const-string p1, "latLngBounds.build()"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v4, 0x64

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lco/bird/android/app/feature/map/ui/MapUiKt;->safeAnimateCamera$default(LcD1;Lcom/google/android/gms/maps/model/LatLngBounds;ILkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public final getAppBuildConfig()LOh;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->appBuildConfig:LOh;

    return-object v0
.end method

.method public getCenterLocation()Lcom/google/android/gms/maps/model/LatLng;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    invoke-virtual {v0}, LcD1;->i()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/maps/model/CameraPosition;->b:Lcom/google/android/gms/maps/model/LatLng;

    const-string v1, "map.cameraPosition.target"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getCurrentRoute()LMX3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->currentRoute:LMX3;

    return-object v0
.end method

.method public getDestinationFlagClicks()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->destinationFlagClicks:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final getDrawUserLocation()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->drawUserLocation:Z

    return v0
.end method

.method public final getExtraLargeZoomPaddingPx()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->extraLargeZoomPaddingPx:I

    return v0
.end method

.method public final getLocationManager()Ldr4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->locationManager:Ldr4;

    return-object v0
.end method

.method public final getMap()LcD1;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    return-object v0
.end method

.method public final getMapModelManagerViewportChangesObservable()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mapModelManagerViewportChangesObservable:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final getMapModelManagerZoomObservable()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mapModelManagerZoomObservable:Lio/reactivex/Observable;

    return-object v0
.end method

.method public final getMapView()Lcom/google/android/gms/maps/MapView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mapView:Lcom/google/android/gms/maps/MapView;

    return-object v0
.end method

.method public final getMode()Lco/bird/android/model/constant/MapMode;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mode:Lco/bird/android/model/constant/MapMode;

    return-object v0
.end method

.method public final getMutableZoomLevelObservable()La94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mutableZoomLevelObservable:La94;

    return-object v0
.end method

.method public final getMyLocationButton()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->myLocationButton:Landroid/view/View;

    return-object v0
.end method

.method public final getPathColor()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->pathColor:I

    return v0
.end method

.method public final getReactiveConfig()LTq4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->reactiveConfig:LTq4;

    return-object v0
.end method

.method public final getReactiveMapEvent()Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    return-object v0
.end method

.method public final getTraceProvider()Li66;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->traceProvider:Li66;

    return-object v0
.end method

.method public final getUserDirectionalArrow()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->userDirectionalArrow:Z

    return v0
.end method

.method public final getViewportChangesObservable()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->viewportChangesObservable:LZ84;

    return-object v0
.end method

.method public final getZoomLevelObservable()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->zoomLevelObservable:LZ84;

    return-object v0
.end method

.method public final getZoomPaddingPx()I
    .locals 1

    iget v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->zoomPaddingPx:I

    return v0
.end method

.method public hideInfoWindow()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->hideInfoWindow()V

    return-void
.end method

.method public latLngBounds()Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    invoke-virtual {v0}, LcD1;->k()LU74;

    move-result-object v0

    invoke-virtual {v0}, LU74;->b()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->f:Lcom/google/android/gms/maps/model/LatLngBounds;

    const-string v1, "map.projection.visibleRegion.latLngBounds"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public latLngViewport()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    invoke-virtual {v0}, LcD1;->k()LU74;

    move-result-object v0

    invoke-virtual {v0}, LU74;->b()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Lcom/google/android/gms/maps/model/LatLng;

    iget-object v2, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->d:Lcom/google/android/gms/maps/model/LatLng;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    iget-object v3, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->e:Lcom/google/android/gms/maps/model/LatLng;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->c:Lcom/google/android/gms/maps/model/LatLng;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-object v0, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->b:Lcom/google/android/gms/maps/model/LatLng;

    aput-object v0, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public mapClicks()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->mapClicks()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/feature/map/ui/MapUiImpl$mapClicks$1;->INSTANCE:Lco/bird/android/app/feature/map/ui/MapUiImpl$mapClicks$1;

    new-instance v2, LPL2;

    invoke-direct {v2, v1}, LPL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "reactiveMapEvent.mapClicks().map { Unit }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public mapClicksLocation()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->mapClicks()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public mapLongClicks()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->mapLongClickSubject:Lio/reactivex/subjects/d;

    invoke-virtual {v0}, Lio/reactivex/Observable;->hide()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "mapLongClickSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public moveTo(Landroid/location/Location;)V
    .locals 5

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getZoomLevelForMovingTo()F

    move-result v1

    invoke-static {v0, v1}, Lrc0;->e(Lcom/google/android/gms/maps/model/LatLng;F)Lqc0;

    move-result-object v0

    invoke-virtual {p1, v0}, LcD1;->m(Lqc0;)V

    return-void
.end method

.method public final moveTo(Lcom/google/android/gms/maps/model/CameraPosition;)V
    .locals 6

    const-string v0, "cameraPosition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p1, Lcom/google/android/gms/maps/model/CameraPosition;->b:Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v2, v1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-wide v4, v1, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    iget p1, p1, Lcom/google/android/gms/maps/model/CameraPosition;->c:F

    invoke-static {v0, p1}, Lrc0;->e(Lcom/google/android/gms/maps/model/LatLng;F)Lqc0;

    move-result-object p1

    invoke-virtual {v1, p1}, LcD1;->m(Lqc0;)V

    return-void
.end method

.method public myLocationClicks()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->myLocationButton:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lmf5;->a(Landroid/view/View;)Lio/reactivex/Observable;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public myLocationLongClicks()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->myLocationButton:Landroid/view/View;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lmf5;->e(Landroid/view/View;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    :cond_0
    return-object v1
.end method

.method public nearbyRadius()D
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    invoke-static {v0}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->nearbyRadius(LcD1;)D

    move-result-wide v0

    return-wide v0
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->curveManager:LjF0;

    invoke-virtual {v0}, LjF0;->i()V

    return-void
.end method

.method public reactiveMapEvent()Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    return-object v0
.end method

.method public removeRoute()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->currentRoute:LMX3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LMX3;->a()V

    :cond_0
    return-void
.end method

.method public removeTeleportMarker()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->teleportMarker:LfM2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LfM2;->f()V

    :cond_0
    return-void
.end method

.method public selectedAreaMarker()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/persistence/Area;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->selectedAreaMarker()Lio/reactivex/Observable;

    move-result-object v0

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

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->setAdditionalAreas(Ljava/lang/String;Ljava/util/List;)V

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

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->areaModelManager:Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/modelmanager/AreaModelManager;->setItems(Ljava/util/List;)V

    return-void
.end method

.method public setAreasCompleteChanges()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->setAreasCompleteChanges()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "areasUi.setAreasCompleteChanges()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final setCurrentRoute(LMX3;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->currentRoute:LMX3;

    return-void
.end method

.method public setDestination(DDDD)V
    .locals 7

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getDestinationMarker()LfM2;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {v1, p5, p6, p7, p8}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v0, v1}, LfM2;->m(Lcom/google/android/gms/maps/model/LatLng;)V

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getDestinationMarker()LfM2;

    move-result-object p5

    const/4 p6, 0x1

    invoke-virtual {p5, p6}, LfM2;->r(Z)V

    new-instance p5, Lcom/google/android/gms/maps/model/LatLng;

    invoke-direct {p5, p1, p2, p3, p4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getDestinationMarker()LfM2;

    move-result-object p1

    invoke-virtual {p1}, LfM2;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    const-string p2, "destinationMarker.position"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LkF0;

    invoke-direct {p2}, LkF0;-><init>()V

    const/4 p3, 0x2

    new-array p4, p3, [Lcom/google/android/gms/maps/model/LatLng;

    const/4 p7, 0x0

    aput-object p5, p4, p7

    aput-object p1, p4, p6

    invoke-virtual {p2, p4}, LkF0;->a([Lcom/google/android/gms/maps/model/LatLng;)LkF0;

    invoke-virtual {p2, p7}, LkF0;->b(Z)LkF0;

    const/high16 p4, 0x43160000    # 150.0f

    invoke-virtual {p2, p4}, LkF0;->m(F)LkF0;

    const/high16 p8, 0x41900000    # 18.0f

    invoke-virtual {p2, p8}, LkF0;->l(F)LkF0;

    new-instance v0, Lcom/google/android/gms/maps/model/RoundCap;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/RoundCap;-><init>()V

    invoke-virtual {p2, v0}, LkF0;->k(Lcom/google/android/gms/maps/model/Cap;)LkF0;

    new-instance v0, Lcom/google/android/gms/maps/model/RoundCap;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/RoundCap;-><init>()V

    invoke-virtual {p2, v0}, LkF0;->d(Lcom/google/android/gms/maps/model/Cap;)LkF0;

    invoke-virtual {p2, p7}, LkF0;->e(Z)LkF0;

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p2, v0}, LkF0;->j(F)LkF0;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    sget v1, LDf4;->destination_line:I

    invoke-static {v0, v1}, LfB0;->f(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p2, v0}, LkF0;->c(I)LkF0;

    new-instance v0, LkF0;

    invoke-direct {v0}, LkF0;-><init>()V

    new-array p3, p3, [Lcom/google/android/gms/maps/model/LatLng;

    aput-object p5, p3, p7

    aput-object p1, p3, p6

    invoke-virtual {v0, p3}, LkF0;->a([Lcom/google/android/gms/maps/model/LatLng;)LkF0;

    invoke-virtual {v0, p7}, LkF0;->b(Z)LkF0;

    invoke-virtual {v0, p4}, LkF0;->m(F)LkF0;

    invoke-virtual {v0, p8}, LkF0;->l(F)LkF0;

    new-instance p3, Lcom/google/android/gms/maps/model/RoundCap;

    invoke-direct {p3}, Lcom/google/android/gms/maps/model/RoundCap;-><init>()V

    invoke-virtual {v0, p3}, LkF0;->k(Lcom/google/android/gms/maps/model/Cap;)LkF0;

    new-instance p3, Lcom/google/android/gms/maps/model/RoundCap;

    invoke-direct {p3}, Lcom/google/android/gms/maps/model/RoundCap;-><init>()V

    invoke-virtual {v0, p3}, LkF0;->d(Lcom/google/android/gms/maps/model/Cap;)LkF0;

    const p3, 0x3dcccccd    # 0.1f

    invoke-virtual {v0, p3}, LkF0;->j(F)LkF0;

    invoke-virtual {v0, p7}, LkF0;->e(Z)LkF0;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object p3

    sget p4, LDf4;->destination_line_shadow:I

    invoke-static {p3, p4}, LfB0;->f(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {v0, p3}, LkF0;->c(I)LkF0;

    iget-object p3, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->curveManager:LjF0;

    invoke-virtual {p3, p2}, LjF0;->f(LkF0;)V

    iget-object p2, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->curveManager:LjF0;

    invoke-virtual {p2, v0}, LjF0;->f(LkF0;)V

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    invoke-static {}, Lcom/google/android/gms/maps/model/LatLngBounds;->s()Lcom/google/android/gms/maps/model/LatLngBounds$a;

    move-result-object p2

    invoke-virtual {p2, p5}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->b(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->b(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v2

    const-string p1, "builder().include(start).include(end).build()"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget v3, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->extraLargeZoomPaddingPx:I

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lco/bird/android/app/feature/map/ui/MapUiKt;->safeAnimateCamera$default(LcD1;Lcom/google/android/gms/maps/model/LatLngBounds;ILkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public setMerchantSites(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireMerchantSite;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sites"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->merchantSiteModelManager:Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/modelmanager/MerchantSiteModelManager;->setItems(Ljava/util/List;)V

    return-void
.end method

.method public setZones(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/ZonePolygonable;",
            ">;)V"
        }
    .end annotation

    const-string v0, "zones"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->setZones(Ljava/util/List;)V

    return-void
.end method

.method public showInfoWindowForArea(Lco/bird/android/model/persistence/Area;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/app/feature/map/ui/MapUi$DefaultImpls;->showInfoWindowForArea(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/model/persistence/Area;Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public showInfoWindowForNonOperationalArea(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    const-string v0, "point"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-virtual {v0, p1}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->showInfoWindowForNonOperationalArea(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public showTeleportMarker(Lco/bird/android/model/wire/WireLocation;)Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireLocation;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;"
        }
    .end annotation

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->teleportMarker:LfM2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LfM2;->f()V

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-static {p1}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toLatLng(Lco/bird/android/model/wire/WireLocation;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v1

    sget v2, Lrg4;->ic_location_dark:I

    const/16 v3, 0x24

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v2, v4, v3}, LfB0;->o(Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;)LPT;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    const-string v1, "Change location"

    invoke-virtual {p1, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->L1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    const-string v1, "Tap to change your location to this point"

    invoke-virtual {p1, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->J1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    invoke-virtual {v0, p1}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->teleportMarker:LfM2;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LfM2;->t()V

    :cond_1
    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    invoke-interface {p1}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->infoWindowClicks()Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, Lco/bird/android/app/feature/map/ui/MapUiImpl$showTeleportMarker$1;

    invoke-direct {v0, p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl$showTeleportMarker$1;-><init>(Lco/bird/android/app/feature/map/ui/MapUiImpl;)V

    invoke-static {p1, v0}, LYf5;->T(Lio/reactivex/Observable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
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

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->updateAreasUi(FLjava/util/List;)V

    return-void
.end method

.method public updateLocationRotate(F)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->locationMarker:LfM2;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LfM2;->j(Z)V

    :goto_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->locationMarker:LfM2;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1}, LfM2;->n(F)V

    :goto_1
    return-void
.end method

.method public updateMyLocation(Landroid/location/Location;)V
    .locals 9

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getShowLocationDebugData()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->locationDebugText:Landroid/widget/TextView;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/location/Location;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->locationDebugText:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getShowLocationDebugData()Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_2
    iget-boolean v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->drawUserLocation:Z

    if-nez v0, :cond_3

    return-void

    :cond_3
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-boolean v1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->userDirectionalArrow:Z

    if-eqz v1, :cond_4

    sget v1, Lrg4;->ic_user_location_v2:I

    goto :goto_1

    :cond_4
    sget v1, Lrg4;->ic_user_location:I

    :goto_1
    move v3, v1

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->locationMarker:LfM2;

    if-nez v1, :cond_5

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    new-instance v2, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v2}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->u1(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-virtual {v2, v4, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->u(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v8

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LfB0;->icon$default(Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)LPT;

    move-result-object v2

    invoke-virtual {v8, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->N0(LPT;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v3

    sget v4, Lnl4;->map_my_location:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->L1(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    const/high16 v3, 0x42c80000    # 100.0f

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/MarkerOptions;->Y1(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->E(Z)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v2

    invoke-virtual {v1, v2}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object v1

    iput-object v1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->locationMarker:LfM2;

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    new-instance v2, Lcom/google/android/gms/maps/model/CircleOptions;

    invoke-direct {v2}, Lcom/google/android/gms/maps/model/CircleOptions;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/android/gms/maps/model/CircleOptions;->s(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result p1

    float-to-double v4, p1

    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/maps/model/CircleOptions;->m0(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object p1

    sget v0, LDf4;->birdBlue20:I

    invoke-virtual {p0, v0}, LXC;->getColor(I)I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/google/android/gms/maps/model/CircleOptions;->u(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object p1

    invoke-virtual {p0, v0}, LXC;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/CircleOptions;->p0(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->E0(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object p1

    invoke-virtual {v1, p1}, LcD1;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lxj0;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->radiusCircle:Lxj0;

    goto :goto_4

    :cond_5
    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v1, v0}, LfM2;->m(Lcom/google/android/gms/maps/model/LatLng;)V

    :goto_2
    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->radiusCircle:Lxj0;

    if-nez v1, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v1, v0}, Lxj0;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    :goto_3
    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->radiusCircle:Lxj0;

    if-nez v0, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result p1

    float-to-double v1, p1

    invoke-virtual {v0, v1, v2}, Lxj0;->b(D)V

    :goto_4
    return-void
.end method

.method public viewport()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    invoke-virtual {v0}, LcD1;->k()LU74;

    move-result-object v0

    invoke-virtual {v0}, LU74;->b()Lcom/google/android/gms/maps/model/VisibleRegion;

    move-result-object v0

    const-string v1, "map.projection.visibleRegion"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x4

    new-array v1, v1, [Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    iget-object v2, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->d:Lcom/google/android/gms/maps/model/LatLng;

    const-string v3, "visibleRegion.farLeft"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lco/bird/android/app/feature/map/ui/MapUiKt;->toGeolocation(Lcom/google/android/gms/maps/model/LatLng;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->e:Lcom/google/android/gms/maps/model/LatLng;

    const-string v3, "visibleRegion.farRight"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lco/bird/android/app/feature/map/ui/MapUiKt;->toGeolocation(Lcom/google/android/gms/maps/model/LatLng;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->c:Lcom/google/android/gms/maps/model/LatLng;

    const-string v3, "visibleRegion.nearRight"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lco/bird/android/app/feature/map/ui/MapUiKt;->toGeolocation(Lcom/google/android/gms/maps/model/LatLng;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v0, v0, Lcom/google/android/gms/maps/model/VisibleRegion;->b:Lcom/google/android/gms/maps/model/LatLng;

    const-string v2, "visibleRegion.nearLeft"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lco/bird/android/app/feature/map/ui/MapUiKt;->toGeolocation(Lcom/google/android/gms/maps/model/LatLng;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v0

    const/4 v2, 0x3

    aput-object v0, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final viewportChanged()Lio/reactivex/k;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/k<",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    invoke-interface {v0}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->cameraIdles()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->reactiveMapEvent:Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;

    invoke-interface {v1}, Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;->cameraMoveCancels()Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {v0, v1}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/app/feature/map/ui/MapUiImpl$viewportChanged$1;

    invoke-direct {v1, p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl$viewportChanged$1;-><init>(Lco/bird/android/app/feature/map/ui/MapUiImpl;)V

    new-instance v2, LLL2;

    invoke-direct {v2, v1}, LLL2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lio/reactivex/b;->f:Lio/reactivex/b;

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object v0

    const-string v1, "final override fun viewp\u2026kpressureStrategy.LATEST)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public viewportContains(Lcom/google/android/gms/maps/model/LatLng;)Z
    .locals 1

    const-string v0, "latlng"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->visibleRegionContains(LcD1;Lcom/google/android/gms/maps/model/LatLng;)Z

    move-result p1

    return p1
.end method

.method public zoneClicks()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/persistence/ZonePolygonable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->areasUi:Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/ui/MapAreasUiImpl;->zoneClicks()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public zoomTo(Landroid/location/Location;Ljava/lang/Float;)V
    .locals 5

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lco/bird/android/app/feature/map/ui/MapUiImpl;->getZoomLevelForMovingTo()F

    move-result p1

    :goto_0
    iget-object p2, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    invoke-static {v0, p1}, Lrc0;->e(Lcom/google/android/gms/maps/model/LatLng;F)Lqc0;

    move-result-object p1

    invoke-virtual {p2, p1}, LcD1;->f(Lqc0;)V

    return-void
.end method

.method public zoomTo(Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/Point;",
            ">;)V"
        }
    .end annotation

    const-string v0, "points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/maps/model/LatLngBounds;->s()Lcom/google/android/gms/maps/model/LatLngBounds$a;

    move-result-object v0

    const-string v1, "builder()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/Point;

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v3, v1, Lco/bird/android/model/Point;->y:D

    iget-wide v5, v1, Lco/bird/android/model/Point;->x:D

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->b(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$a;

    goto :goto_0

    :cond_0
    iget-object v7, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->map:LcD1;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/LatLngBounds$a;->a()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v8

    const-string p1, "latLngBoundsBuilder.build()"

    invoke-static {v8, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget v9, p0, Lco/bird/android/app/feature/map/ui/MapUiImpl;->zoomPaddingPx:I

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lco/bird/android/app/feature/map/ui/MapUiKt;->safeAnimateCamera$default(LcD1;Lcom/google/android/gms/maps/model/LatLngBounds;ILkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method
