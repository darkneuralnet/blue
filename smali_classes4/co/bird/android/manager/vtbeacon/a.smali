.class public final Lco/bird/android/manager/vtbeacon/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Laj6;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/manager/vtbeacon/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\n\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\u0004B\u0011\u0008\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J8\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\"\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0002*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0002*\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Lco/bird/android/manager/vtbeacon/a;",
        "Laj6;",
        "Lio/reactivex/F;",
        "",
        "a",
        "macAddress",
        "pin",
        "newProximityUUID",
        "",
        "newMajorNumber",
        "newMinorNumber",
        "newPin",
        "Lio/reactivex/c;",
        "b",
        "Lke5;",
        "o",
        "LXi6;",
        "command",
        "y",
        "Lde5;",
        "Lde5;",
        "rxBleClient",
        "<init>",
        "(Lde5;)V",
        "vtbeacon_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:Lco/bird/android/manager/vtbeacon/a$a;


# instance fields
.field public final a:Lde5;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/manager/vtbeacon/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/manager/vtbeacon/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/manager/vtbeacon/a;->b:Lco/bird/android/manager/vtbeacon/a$a;

    return-void
.end method

.method public constructor <init>(Lde5;)V
    .locals 1

    const-string v0, "rxBleClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/manager/vtbeacon/a;->a:Lde5;

    return-void
.end method

.method public static final A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final synthetic access$authenticate(Lco/bird/android/manager/vtbeacon/a;Lke5;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/manager/vtbeacon/a;->o(Lke5;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$write(Lco/bird/android/manager/vtbeacon/a;Lke5;LXi6;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/manager/vtbeacon/a;->y(Lke5;LXi6;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/vtbeacon/a;->p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/vtbeacon/a;->B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/vtbeacon/a;->r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/vtbeacon/a;->u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/vtbeacon/a;->A(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/vtbeacon/a;->q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/vtbeacon/a;->t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/vtbeacon/a;->x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/vtbeacon/a;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/vtbeacon/a;->z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/vtbeacon/a;->w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/vtbeacon/a;->v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static final w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static final x(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final z(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method


# virtual methods
.method public a()Lio/reactivex/F;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/polidea/rxandroidble2/scan/ScanSettings$b;

    invoke-direct {v0}, Lcom/polidea/rxandroidble2/scan/ScanSettings$b;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/polidea/rxandroidble2/scan/ScanSettings$b;->b(I)Lcom/polidea/rxandroidble2/scan/ScanSettings$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/polidea/rxandroidble2/scan/ScanSettings$b;->a()Lcom/polidea/rxandroidble2/scan/ScanSettings;

    move-result-object v0

    new-instance v1, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;

    invoke-direct {v1}, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;-><init>()V

    invoke-virtual {v1}, Lcom/polidea/rxandroidble2/scan/ScanFilter$b;->a()Lcom/polidea/rxandroidble2/scan/ScanFilter;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/manager/vtbeacon/a;->a:Lde5;

    const/4 v3, 0x1

    new-array v3, v3, [Lcom/polidea/rxandroidble2/scan/ScanFilter;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-virtual {v2, v0, v3}, Lde5;->e(Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/manager/vtbeacon/a$h;->g:Lco/bird/android/manager/vtbeacon/a$h;

    new-instance v2, Lhj6;

    invoke-direct {v2, v1}, Lhj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/manager/vtbeacon/a$i;->g:Lco/bird/android/manager/vtbeacon/a$i;

    new-instance v2, Lij6;

    invoke-direct {v2, v1}, Lij6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/manager/vtbeacon/a$j;->g:Lco/bird/android/manager/vtbeacon/a$j;

    new-instance v2, Ljj6;

    invoke-direct {v2, v1}, Ljj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v0

    const-string v1, "rxBleClient.scanBleDevic\u2026s }\n      .firstOrError()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;SSLjava/lang/String;)Lio/reactivex/c;
    .locals 1

    const-string v0, "macAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pin"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newProximityUUID"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newPin"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/vtbeacon/a;->a:Lde5;

    invoke-virtual {v0, p1}, Lde5;->b(Ljava/lang/String;)Lne5;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p2, Lco/bird/android/manager/vtbeacon/VTBeaconError$UnknownDevice;

    invoke-direct {p2, p1}, Lco/bird/android/manager/vtbeacon/VTBeaconError$UnknownDevice;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "error(VTBeaconError.UnknownDevice(macAddress))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    invoke-interface {v0, p1}, Lne5;->a(Z)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, Lco/bird/android/manager/vtbeacon/a$c;

    invoke-direct {v0, p0, p2, p6}, Lco/bird/android/manager/vtbeacon/a$c;-><init>(Lco/bird/android/manager/vtbeacon/a;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Lkj6;

    invoke-direct {p2, v0}, Lkj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lco/bird/android/manager/vtbeacon/a$d;

    invoke-direct {p2, p0, p3}, Lco/bird/android/manager/vtbeacon/a$d;-><init>(Lco/bird/android/manager/vtbeacon/a;Ljava/lang/String;)V

    new-instance p3, Llj6;

    invoke-direct {p3, p2}, Llj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lco/bird/android/manager/vtbeacon/a$e;

    invoke-direct {p2, p0, p4}, Lco/bird/android/manager/vtbeacon/a$e;-><init>(Lco/bird/android/manager/vtbeacon/a;S)V

    new-instance p3, Lmj6;

    invoke-direct {p3, p2}, Lmj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lco/bird/android/manager/vtbeacon/a$f;

    invoke-direct {p2, p0, p5}, Lco/bird/android/manager/vtbeacon/a$f;-><init>(Lco/bird/android/manager/vtbeacon/a;S)V

    new-instance p3, Lcj6;

    invoke-direct {p3, p2}, Lcj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lco/bird/android/manager/vtbeacon/a$g;

    invoke-direct {p2, p0, p6}, Lco/bird/android/manager/vtbeacon/a$g;-><init>(Lco/bird/android/manager/vtbeacon/a;Ljava/lang/String;)V

    new-instance p3, Ldj6;

    invoke-direct {p3, p2}, Ldj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    const-string p2, "override fun configureBe\u2026     .ignoreElement()\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final o(Lke5;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke5;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lke5;",
            ">;"
        }
    .end annotation

    new-instance v0, LZi6;

    invoke-direct {v0, p2}, LZi6;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lco/bird/android/manager/vtbeacon/a;->y(Lke5;LXi6;)Lio/reactivex/F;

    move-result-object p2

    new-instance v0, Lco/bird/android/manager/vtbeacon/a$b;

    invoke-direct {v0, p0, p1, p3}, Lco/bird/android/manager/vtbeacon/a$b;-><init>(Lco/bird/android/manager/vtbeacon/a;Lke5;Ljava/lang/String;)V

    new-instance p1, Lbj6;

    invoke-direct {p1, v0}, Lbj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, p1}, Lio/reactivex/F;->P(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "private fun RxBleConnect\u2026or)\n        }\n      }\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final y(Lke5;LXi6;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke5;",
            "LXi6;",
            ")",
            "Lio/reactivex/F<",
            "Lke5;",
            ">;"
        }
    .end annotation

    sget-object v0, LWi6;->d:LWi6;

    invoke-virtual {v0}, LWi6;->b()Ljava/util/UUID;

    move-result-object v0

    invoke-interface {p1, v0}, Lke5;->d(Ljava/util/UUID;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/vtbeacon/a$k;

    invoke-direct {v1, p1, p2}, Lco/bird/android/manager/vtbeacon/a$k;-><init>(Lke5;LXi6;)V

    new-instance v2, Lej6;

    invoke-direct {v2, v1}, Lej6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lco/bird/android/manager/vtbeacon/a$l;->g:Lco/bird/android/manager/vtbeacon/a$l;

    new-instance v2, Lfj6;

    invoke-direct {v2, v1}, Lfj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/vtbeacon/a$m;

    invoke-direct {v1, p1, p2}, Lco/bird/android/manager/vtbeacon/a$m;-><init>(Lke5;LXi6;)V

    new-instance p1, Lgj6;

    invoke-direct {p1, v1}, Lgj6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    const-wide/16 v0, 0xa

    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, p2}, Lio/reactivex/Observable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p1

    const-string p2, "RxBleConnection.write(co\u2026DS)\n      .firstOrError()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
