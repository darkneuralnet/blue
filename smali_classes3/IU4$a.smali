.class public final LIU4$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIU4;->onBannerShown()V
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRidePassBannerPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassBannerPresenterImpl.kt\nco/bird/android/feature/ridepass/view/RidePassBannerPresenterImpl$onBannerShown$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1747#2,3:83\n*S KotlinDebug\n*F\n+ 1 RidePassBannerPresenterImpl.kt\nco/bird/android/feature/ridepass/view/RidePassBannerPresenterImpl$onBannerShown$2\n*L\n63#1:83,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LIU4;

.field public final synthetic i:Lco/bird/android/model/persistence/RidePassView;


# direct methods
.method public constructor <init>(Ljava/util/List;LIU4;Lco/bird/android/model/persistence/RidePassView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/RidePassView;",
            ">;",
            "LIU4;",
            "Lco/bird/android/model/persistence/RidePassView;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LIU4$a;->g:Ljava/util/List;

    iput-object p2, p0, LIU4$a;->h:LIU4;

    iput-object p3, p0, LIU4$a;->i:Lco/bird/android/model/persistence/RidePassView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LIU4$a;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 12

    iget-object p1, p0, LIU4$a;->g:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->isIneligible()Z

    move-result v0

    if-eqz v0, :cond_1

    move v2, v1

    :cond_2
    :goto_0
    if-eqz v2, :cond_4

    iget-object p1, p0, LIU4$a;->h:LIU4;

    invoke-static {p1}, LIU4;->access$getAnalyticsManager$p(LIU4;)LEa;

    move-result-object p1

    new-instance v0, LUU4;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v2, p0, LIU4$a;->i:Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/RidePassView;->getUserRidePassId()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    const-string v2, ""

    :cond_3
    move-object v6, v2

    iget-object v2, p0, LIU4$a;->i:Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/RidePassView;->getLinkCode()Ljava/lang/String;

    move-result-object v7

    const-string v8, "banner"

    const-string v9, "transfer"

    const/4 v10, 0x7

    const/4 v11, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, LUU4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, LIU4$a;->h:LIU4;

    invoke-static {p1}, LIU4;->access$getAnalyticsManager$p(LIU4;)LEa;

    move-result-object p1

    new-instance v0, LyV4;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v2, p0, LIU4$a;->i:Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/RidePassView;->getLinkCode()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, LyV4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :goto_1
    iget-object p1, p0, LIU4$a;->h:LIU4;

    invoke-static {p1}, LIU4;->access$getReactiveConfig$p(LIU4;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRidePass()Lco/bird/android/model/wire/configs/RidePassConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RidePassConfig;->getEnabledV2()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, LIU4$a;->h:LIU4;

    invoke-static {p1}, LIU4;->access$getNavigator$p(LIU4;)Le13;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0, v1, v0}, Le13$a;->goToRidePassV4$default(Le13;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_2

    :cond_5
    iget-object p1, p0, LIU4$a;->h:LIU4;

    invoke-static {p1}, LIU4;->access$getReactiveConfig$p(LIU4;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRidePass()Lco/bird/android/model/wire/configs/RidePassConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RidePassConfig;->getEnabled()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, LIU4$a;->h:LIU4;

    invoke-static {p1}, LIU4;->access$getNavigator$p(LIU4;)Le13;

    move-result-object p1

    iget-object v0, p0, LIU4$a;->i:Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/RidePassView;->getLinkCode()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Le13;->o2(Ljava/lang/String;)V

    :cond_6
    :goto_2
    return-void
.end method
