.class public final LIT4$S;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4;->b4(Lco/bird/android/model/wire/WireRide;LvT3;ZLkotlin/jvm/functions/Function0;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Vehicle;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "vehicle",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/wire/WireBird;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:LIT4;

.field public final synthetic i:Lco/bird/android/model/wire/WireRide;

.field public final synthetic j:LvT3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LvT3<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLIT4;Lco/bird/android/model/wire/WireRide;LvT3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LIT4;",
            "Lco/bird/android/model/wire/WireRide;",
            "LvT3<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, LIT4$S;->g:Z

    iput-object p2, p0, LIT4$S;->h:LIT4;

    iput-object p3, p0, LIT4$S;->i:Lco/bird/android/model/wire/WireRide;

    iput-object p4, p0, LIT4$S;->j:LvT3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LIT4$S;->g:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LIT4$S;->h:LIT4;

    iget-object v1, p0, LIT4$S;->i:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getDistance()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, v1, p1}, LIT4;->access$lockRideInternal(LIT4;Lco/bird/android/model/wire/WireRide;Ljava/lang/Integer;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LIT4$S;->h:LIT4;

    iget-object v1, p0, LIT4$S;->i:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getDistance()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, v1, p1}, LIT4;->access$unlockRideInternal(LIT4;Lco/bird/android/model/wire/WireRide;Ljava/lang/Integer;)Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p1

    const-string v0, "if (lock) {\n          lo\u2026          .firstOrError()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIT4$S;->j:LvT3;

    invoke-static {p1, v0}, LMm4;->n(Lio/reactivex/F;LvT3;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->k0()Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Vehicle;

    invoke-virtual {p0, p1}, LIT4$S;->a(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
