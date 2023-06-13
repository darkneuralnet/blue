.class public final LjI1$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjI1;->s(Lco/bird/android/model/wire/WireBird;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/Vehicle;",
        ">;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireVehicleDiagnostics;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/Vehicle;",
        "vehicleOptional",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/wire/WireVehicleDiagnostics;",
        "kotlin.jvm.PlatformType",
        "d",
        "(Lco/bird/android/buava/Optional;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LjI1;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(LjI1;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, LjI1$l;->g:LjI1;

    iput-object p2, p0, LjI1$l;->h:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LjI1$l;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LjI1$l;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 0

    invoke-static {p0, p1}, LjI1$l;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/buava/Optional;

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Lco/bird/android/buava/Optional;)Lio/reactivex/B;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/Vehicle;",
            ">;)",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireVehicleDiagnostics;",
            ">;>;"
        }
    .end annotation

    const-string v0, "vehicleOptional"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "vehicleOptional.get()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lco/bird/android/model/Vehicle;

    iget-object v0, p0, LjI1$l;->g:LjI1;

    invoke-static {v0}, LjI1;->access$getVehicleDiagnosticsManager$p(LjI1;)Ltl6;

    move-result-object v1

    iget-object v0, p0, LjI1$l;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getImei()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getIccid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getVehicleVersion()Lco/bird/android/model/persistence/VehicleVersion;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/VehicleVersion;->getStmVersion()Ljava/lang/String;

    move-result-object v5

    invoke-static {p1}, Lco/bird/android/model/VehicleKt;->faultCodes(Lco/bird/android/model/Vehicle;)Ljava/lang/String;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Ltl6;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    const-wide/16 v0, 0x2

    invoke-virtual {p1, v0, v1}, Lio/reactivex/F;->T(J)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LjI1$l$a;

    iget-object v1, p0, LjI1$l;->g:LjI1;

    invoke-direct {v0, v1}, LjI1$l$a;-><init>(LjI1;)V

    new-instance v1, LmI1;

    invoke-direct {v1, v0}, LmI1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, LjI1$l$b;->g:LjI1$l$b;

    new-instance v1, LnI1;

    invoke-direct {v1, v0}, LnI1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->D(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, LjI1$l$c;->g:LjI1$l$c;

    new-instance v1, LoI1;

    invoke-direct {v1, v0}, LoI1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, LjI1$l;->d(Lco/bird/android/buava/Optional;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
