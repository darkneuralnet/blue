.class public final LIT4$Y;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;->g4(Lco/bird/android/model/wire/WireBird;LvT3;Lkotlin/jvm/functions/Function0;Lio/reactivex/F;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireRide;",
        "Lio/reactivex/B<",
        "Lco/bird/android/model/wire/WireRide;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0010\u0012\u000c\u0012\n \u0001*\u0004\u0018\u00010\u00000\u00000\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRide;",
        "kotlin.jvm.PlatformType",
        "ride",
        "Lio/reactivex/B;",
        "c",
        "(Lco/bird/android/model/wire/WireRide;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LIT4;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;

.field public final synthetic i:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LIT4;Lco/bird/android/model/wire/WireBird;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LIT4;",
            "Lco/bird/android/model/wire/WireBird;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LIT4$Y;->g:LIT4;

    iput-object p2, p0, LIT4$Y;->h:Lco/bird/android/model/wire/WireBird;

    iput-object p3, p0, LIT4$Y;->i:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireRide;
    .locals 0

    invoke-static {p0, p1}, LIT4$Y;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireRide;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LIT4$Y;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireRide;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/WireRide;

    return-object p0
.end method


# virtual methods
.method public final c(Lco/bird/android/model/wire/WireRide;)Lio/reactivex/B;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireRide;",
            ")",
            "Lio/reactivex/B<",
            "Lco/bird/android/model/wire/WireRide;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LIT4$Y;->g:LIT4;

    iget-object v1, p0, LIT4$Y;->h:Lco/bird/android/model/wire/WireBird;

    iget-object v2, p0, LIT4$Y;->i:Lkotlin/jvm/functions/Function0;

    const-string v3, "ride"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, p1}, LIT4;->access$lockBluetooth(LIT4;Lco/bird/android/model/wire/WireBird;ZLkotlin/jvm/functions/Function0;Lco/bird/android/model/wire/WireRide;)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, LIT4$Y$a;

    iget-object v3, p0, LIT4$Y;->g:LIT4;

    invoke-direct {v2, v3, p1}, LIT4$Y$a;-><init>(LIT4;Lco/bird/android/model/wire/WireRide;)V

    new-instance v3, LYT4;

    invoke-direct {v3, v2}, LYT4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "private fun getStartRide\u2026      .firstOrError()\n  }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, LIT4$Y;->h:Lco/bird/android/model/wire/WireBird;

    const/4 v4, 0x1

    invoke-static {v0, v1, p1, v3, v4}, LIT4;->access$onBluetoothErrorUpdateRide(LIT4;Lio/reactivex/Observable;Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/wire/WireBird;Z)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LIT4$Y$b;

    invoke-direct {v1, p1}, LIT4$Y$b;-><init>(Lco/bird/android/model/wire/WireRide;)V

    new-instance p1, LZT4;

    invoke-direct {p1, v1}, LZT4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireRide;

    invoke-virtual {p0, p1}, LIT4$Y;->c(Lco/bird/android/model/wire/WireRide;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
