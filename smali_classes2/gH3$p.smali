.class public final LgH3$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LgH3;->R()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LgH3;


# direct methods
.method public constructor <init>(LgH3;)V
    .locals 0

    iput-object p1, p0, LgH3$p;->g:LgH3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LgH3$p;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 7

    iget-object p1, p0, LgH3$p;->g:LgH3;

    invoke-static {p1}, LgH3;->access$getRideManager$p(LgH3;)LYR4;

    move-result-object p1

    invoke-interface {p1}, LYR4;->r()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getParkingConfig()Lco/bird/android/model/wire/configs/ParkingConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/ParkingConfig;->getParkingIncentiveValue()J

    move-result-wide v0

    iget-object p1, p0, LgH3$p;->g:LgH3;

    invoke-static {p1}, LgH3;->access$getRideManager$p(LgH3;)LYR4;

    move-result-object p1

    invoke-interface {p1}, LYR4;->r()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p1

    iget-object v2, p0, LgH3$p;->g:LgH3;

    invoke-static {v2}, LgH3;->access$getParkingUi$p(LgH3;)LRH3;

    move-result-object v2

    invoke-interface {v2, v0, v1, p1}, LRH3;->Ga(JLjava/util/Currency;)V

    iget-object p1, p0, LgH3$p;->g:LgH3;

    invoke-static {p1}, LgH3;->access$getParkingUi$p(LgH3;)LRH3;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LRH3;->ng(Z)V

    iget-object p1, p0, LgH3$p;->g:LgH3;

    invoke-static {p1}, LgH3;->access$getAppPreference$p(LgH3;)Lgl;

    move-result-object p1

    invoke-virtual {p1}, Lgl;->v2()V

    iget-object p1, p0, LgH3$p;->g:LgH3;

    invoke-static {p1}, LgH3;->access$getAnalyticsManager$p(LgH3;)LEa;

    move-result-object p1

    new-instance v6, LgG3;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LgG3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v6}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method
