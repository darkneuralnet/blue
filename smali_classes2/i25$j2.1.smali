.class public final Li25$j2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->N7(Z)V
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
        "Ljava/lang/String;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "",
        "kotlin.jvm.PlatformType",
        "guestId",
        "",
        "a",
        "(Lco/bird/android/buava/Optional;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(Li25;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, Li25$j2;->g:Li25;

    iput-object p2, p0, Li25$j2;->h:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Li25$j2;->g:Li25;

    invoke-static {v0}, Li25;->access$getPreference$p(Li25;)Lgl;

    move-result-object v0

    iget-object v1, p0, Li25$j2;->g:Li25;

    invoke-static {v1}, Li25;->access$getConfigForCurrentBird(Li25;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v1

    invoke-static {v1}, LFv0;->a(Lco/bird/android/model/wire/configs/Config;)Lco/bird/android/model/wire/WireRidePrice;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgl;->h2(Lco/bird/android/model/wire/WireRidePrice;)V

    iget-object v0, p0, Li25$j2;->g:Li25;

    invoke-static {v0}, Li25;->access$getRideMapStateManager$p(Li25;)LpU4;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/RideUpdateState;->RIDE_REQUIREMENTS:Lco/bird/android/model/RideUpdateState;

    invoke-interface {v0, v1}, LpU4;->j(Lco/bird/android/model/RideUpdateState;)V

    iget-object v0, p0, Li25$j2;->g:Li25;

    invoke-static {v0}, Li25;->access$getRequirementPresenter$p(Li25;)LsJ4;

    move-result-object v0

    iget-object v1, p0, Li25$j2;->h:Lco/bird/android/model/wire/WireBird;

    sget-object v2, Lco/bird/android/model/constant/RideRequirementReason;->RIDE:Lco/bird/android/model/constant/RideRequirementReason;

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v0, v1, v2, p1}, LsJ4;->a(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/RideRequirementReason;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, Li25$j2;->a(Lco/bird/android/buava/Optional;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
