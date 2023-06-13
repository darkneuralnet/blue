.class public final LF34$g$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF34$g$c;->invoke(Lkotlin/Triple;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        "+",
        "Lco/bird/android/model/persistence/VehicleVersion;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0008\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/model/persistence/Bird;",
        "Lco/bird/android/model/persistence/VehicleVersion;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Pair;)Lio/reactivex/h;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LF34;

.field public final synthetic h:Lco/bird/android/model/persistence/Bird;

.field public final synthetic i:Lco/bird/android/model/persistence/VehicleVersion;


# direct methods
.method public constructor <init>(LF34;Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/VehicleVersion;)V
    .locals 0

    iput-object p1, p0, LF34$g$c$a;->g:LF34;

    iput-object p2, p0, LF34$g$c$a;->h:Lco/bird/android/model/persistence/Bird;

    iput-object p3, p0, LF34$g$c$a;->i:Lco/bird/android/model/persistence/VehicleVersion;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Pair;)Lio/reactivex/h;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/persistence/Bird;",
            "Lco/bird/android/model/persistence/VehicleVersion;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/Bird;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/VehicleVersion;

    iget-object v1, p0, LF34$g$c$a;->g:LF34;

    iget-object v2, p0, LF34$g$c$a;->h:Lco/bird/android/model/persistence/Bird;

    const-string v3, "bird"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v0}, LtC3;->D2(Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/Bird;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    iget-object v3, p0, LF34$g$c$a;->g:LF34;

    iget-object v4, p0, LF34$g$c$a;->i:Lco/bird/android/model/persistence/VehicleVersion;

    const-string v5, "vehicleVersion"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4, p1}, LtC3;->E2(Lco/bird/android/model/persistence/VehicleVersion;Lco/bird/android/model/persistence/VehicleVersion;)Z

    move-result v3

    xor-int/2addr v3, v2

    if-eqz v1, :cond_0

    iget-object v1, p0, LF34$g$c$a;->g:LF34;

    invoke-virtual {v1}, LtC3;->H0()LAG;

    move-result-object v1

    invoke-virtual {v1, v0}, LAG;->accept(Ljava/lang/Object;)V

    iget-object v1, p0, LF34$g$c$a;->g:LF34;

    invoke-virtual {v1}, LtC3;->Q0()Lq54;

    move-result-object v1

    invoke-interface {v1, v0}, Lq54;->e(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v0

    const-string v1, "{\n                  Comp\u2026plete()\n                }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    if-eqz v3, :cond_1

    iget-object v1, p0, LF34$g$c$a;->g:LF34;

    invoke-virtual {v1}, LtC3;->X0()LAG;

    move-result-object v1

    invoke-virtual {v1, p1}, LAG;->accept(Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    :goto_1
    const-string v1, "if (needToUpdateVehicle)\u2026se Completable.complete()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lio/reactivex/c;

    const/4 v3, 0x0

    aput-object v0, v1, v3

    aput-object p1, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/c;->r(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LF34$g$c$a;->invoke(Lkotlin/Pair;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
