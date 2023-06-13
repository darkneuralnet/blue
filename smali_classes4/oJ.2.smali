.class public final LoJ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LkJ;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J=\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJC\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\r\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000c\u0010\u0014\u001a\u00020\u0011*\u00020\u0011H\u0002J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "LoJ;",
        "LkJ;",
        "",
        "serialNumber",
        "",
        "distance",
        "Lio/reactivex/Observable;",
        "Y",
        "imei",
        "bleMacAddress",
        "Lio/reactivex/F;",
        "q0",
        "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;",
        "model",
        "battery",
        "Landroid/location/Location;",
        "location",
        "Lco/bird/api/request/BluetoothTrackBody;",
        "p1",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/location/Location;)Lio/reactivex/F;",
        "v",
        "",
        "h",
        "LVK;",
        "b",
        "LVK;",
        "birdClient",
        "<init>",
        "(LVK;)V",
        "bluetooth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LVK;


# direct methods
.method public constructor <init>(LVK;)V
    .locals 1

    const-string v0, "birdClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoJ;->b:LVK;

    return-void
.end method

.method public static final synthetic access$isOkb(LoJ;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, LoJ;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$transformForOkb(LoJ;Lco/bird/api/request/BluetoothTrackBody;)Lco/bird/api/request/BluetoothTrackBody;
    .locals 0

    invoke-virtual {p0, p1}, LoJ;->v(Lco/bird/api/request/BluetoothTrackBody;)Lco/bird/api/request/BluetoothTrackBody;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LoJ;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/request/BluetoothTrackBody;
    .locals 0

    invoke-static {p0, p1}, LoJ;->r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/request/BluetoothTrackBody;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LoJ;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/api/request/BluetoothTrackBody;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/api/request/BluetoothTrackBody;

    return-object p0
.end method


# virtual methods
.method public Y(Ljava/lang/String;I)Lio/reactivex/Observable;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lio/reactivex/Observable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LoJ;->b:LVK;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v7}, LVK$a;->getToken$default(LVK;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1}, Lio/reactivex/Observable;->retry(J)Lio/reactivex/Observable;

    move-result-object p1

    sget-object p2, LoJ$a;->g:LoJ$a;

    new-instance v0, LnJ;

    invoke-direct {v0, p2}, LnJ;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    const-string p2, "birdClient\n      .getTok\u2026\n        it.token\n      }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c()Lio/reactivex/i;
    .locals 1

    invoke-static {p0}, LkJ$a;->a(LkJ;)Lio/reactivex/i;

    move-result-object v0

    return-object v0
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    if-eqz p2, :cond_0

    const-string p1, "bd"

    const/4 v0, 0x1

    invoke-static {p2, p1, v0}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    const/4 v0, 0x0

    const-string v1, "BD"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, p2, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public i(Lio/reactivex/F;)Lio/reactivex/F;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lio/reactivex/F<",
            "TT;>;)",
            "Lio/reactivex/F<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LkJ$a;->e(LkJ;Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public m()Lio/reactivex/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/v<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, LkJ$a;->b(LkJ;)Lio/reactivex/v;

    move-result-object v0

    return-object v0
.end method

.method public o()Lio/reactivex/C;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/C<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, LkJ$a;->c(LkJ;)Lio/reactivex/C;

    move-result-object v0

    return-object v0
.end method

.method public p1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/location/Location;)Lio/reactivex/F;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Landroid/location/Location;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/api/request/BluetoothTrackBody;",
            ">;"
        }
    .end annotation

    const-string v0, "serialNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LoJ;->b:LVK;

    new-instance v1, Lco/bird/api/request/TrackBirdBody;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p5, v2, v3, v2}, Lco/bird/android/model/wire/WireLocationKt;->toLocation$default(Landroid/location/Location;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/WireLocation;

    move-result-object p5

    invoke-direct {v1, p1, p3, p4, p5}, Lco/bird/api/request/TrackBirdBody;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lco/bird/android/model/wire/WireLocation;)V

    invoke-interface {v0, v1}, LVK;->H(Lco/bird/api/request/TrackBirdBody;)Lio/reactivex/F;

    move-result-object p3

    new-instance p4, LoJ$c;

    invoke-direct {p4, p0, p1, p2}, LoJ$c;-><init>(LoJ;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, LlJ;

    invoke-direct {p1, p4}, LlJ;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p3, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "override fun trackBird(s\u2026}\n      .schedulers()\n  }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LoJ;->i(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public q0(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LoJ;->b:LVK;

    invoke-interface {v0, p2, p1, p3, p4}, LVK;->L(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/F;->Y(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-wide/16 p2, 0x1

    invoke-virtual {p1, p2, p3}, Lio/reactivex/F;->T(J)Lio/reactivex/F;

    move-result-object p1

    sget-object p2, LoJ$b;->g:LoJ$b;

    new-instance p3, LmJ;

    invoke-direct {p3, p2}, LmJ;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "birdClient\n      .getTok\u2026\n        it.token\n      }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public s()Lio/reactivex/L;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/L<",
            "TT;TT;>;"
        }
    .end annotation

    invoke-static {p0}, LkJ$a;->d(LkJ;)Lio/reactivex/L;

    move-result-object v0

    return-object v0
.end method

.method public final v(Lco/bird/api/request/BluetoothTrackBody;)Lco/bird/api/request/BluetoothTrackBody;
    .locals 4

    invoke-virtual {p1}, Lco/bird/api/request/BluetoothTrackBody;->getMaxSpeed()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v2, 0x7

    goto :goto_0

    :cond_0
    const/16 v3, 0x1f6f

    if-gt v0, v3, :cond_1

    const/4 v2, 0x6

    goto :goto_0

    :cond_1
    const/16 v3, 0x2c01

    if-gt v0, v3, :cond_2

    const/4 v2, 0x5

    goto :goto_0

    :cond_2
    const/16 v3, 0x452d

    if-gt v0, v3, :cond_3

    const/4 v2, 0x4

    goto :goto_0

    :cond_3
    const/16 v3, 0x4f44

    if-gt v0, v3, :cond_4

    const/4 v2, 0x3

    goto :goto_0

    :cond_4
    const/16 v3, 0x5dc0

    if-gt v0, v3, :cond_5

    const/4 v2, 0x2

    goto :goto_0

    :cond_5
    const/16 v3, 0x6adf

    if-gt v0, v3, :cond_6

    goto :goto_0

    :cond_6
    move v2, v1

    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lco/bird/api/request/BluetoothTrackBody;->copy(Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/api/request/BluetoothTrackBody;

    move-result-object p1

    :cond_7
    return-object p1
.end method
