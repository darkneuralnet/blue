.class public final LLK$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLK;->b1(Lco/bird/android/model/Vehicle;Ljava/lang/String;ZLorg/joda/time/DateTime;)Lio/reactivex/Observable;
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
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/Vehicle;",
        "+",
        "Lco/bird/android/model/Vehicle;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u009a\u0001\u0012F\u0008\u0001\u0012B\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000 \u0004* \u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003 \u0004*L\u0012F\u0008\u0001\u0012B\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000 \u0004* \u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0012\u000c\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "vehicleWithNewToken",
        "Lio/reactivex/B;",
        "Lkotlin/Pair;",
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
.field public final synthetic g:LLK;


# direct methods
.method public constructor <init>(LLK;)V
    .locals 0

    iput-object p1, p0, LLK$n;->g:LLK;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/Vehicle;",
            "Lco/bird/android/model/Vehicle;",
            ">;>;"
        }
    .end annotation

    const-string v0, "vehicleWithNewToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    const-string v2, "just(vehicleWithNewToken)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LLK$n;->g:LLK;

    invoke-static {v2}, LLK;->access$getVehicleManager$p(LLK;)Lsm6;

    move-result-object v2

    invoke-interface {v2, p1}, Lsm6;->j(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->k0()Lio/reactivex/Observable;

    move-result-object p1

    const-string v2, "vehicleManager.authentic\u2026hNewToken).toObservable()"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lio/reactivex/rxkotlin/e;->a(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Vehicle;

    invoke-virtual {p0, p1}, LLK$n;->a(Lco/bird/android/model/Vehicle;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
