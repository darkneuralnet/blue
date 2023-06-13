.class public final Li25$W0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;->Q5(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "LJ35$a;",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032H\u0010\u0005\u001aD\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Triple;",
        "LJ35$a;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/wire/WireBird;",
        "<name for destructuring parameter 0>",
        "a",
        "(Lkotlin/Triple;)Lco/bird/android/buava/Optional;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRidePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePresenter.kt\nco/bird/android/app/feature/ride/presenter/RidePresenterImpl$onCreate$40\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4445:1\n1#2:4446\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$W0;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)Lco/bird/android/buava/Optional;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "LJ35$a;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;>;)",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ35$a;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, LJ35$a;->h()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "requirements met for ride context: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v2, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireBird;

    if-nez v2, :cond_0

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lco/bird/android/model/wire/WireBird;

    if-nez v2, :cond_0

    invoke-virtual {v0}, LJ35$a;->b()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    :cond_0
    const/4 p1, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, p1

    :goto_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, p1

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "setting map bird to Bird(id="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", code="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v0, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Li25$W0;->g:Li25;

    invoke-static {v0}, Li25;->access$getReservationManager$p(Li25;)LMK4;

    move-result-object v0

    invoke-interface {v0}, LMK4;->e()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/Reservation;

    const/4 v4, 0x1

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lco/bird/android/model/Reservation;->isExpired()Z

    move-result v5

    xor-int/2addr v5, v4

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    move-object v0, p1

    :goto_2
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lco/bird/android/model/Reservation;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    goto :goto_3

    :cond_4
    move-object v0, p1

    :goto_3
    if-eqz v2, :cond_6

    if-eqz v0, :cond_5

    invoke-virtual {v0, v2}, Lco/bird/android/model/wire/WireBird;->isSame(Lco/bird/android/model/wire/WireBird;)Z

    move-result v5

    if-ne v5, v4, :cond_5

    move v3, v4

    :cond_5
    if-eqz v3, :cond_6

    move-object v2, v0

    goto :goto_4

    :cond_6
    if-eqz v2, :cond_8

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->c()Z

    move-result v0

    xor-int/2addr v0, v4

    if-eqz v0, :cond_7

    move-object p1, v2

    :cond_7
    if-eqz p1, :cond_8

    iget-object v0, p0, Li25$W0;->g:Li25;

    invoke-static {v0}, Li25;->access$getRideMapStateManager$p(Li25;)LpU4;

    move-result-object v0

    invoke-interface {v0, p1, v4}, LpU4;->a(Lco/bird/android/model/wire/WireBird;Z)V

    :cond_8
    :goto_4
    sget-object p1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1, v2}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, Li25$W0;->a(Lkotlin/Triple;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method
