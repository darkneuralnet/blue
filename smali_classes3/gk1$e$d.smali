.class public final Lgk1$e$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgk1$e;->f(Lco/bird/android/model/persistence/Announcement;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/FlightBannerNode;",
        ">;>;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/FlightBannerNode;",
        "list",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Lio/reactivex/u;"
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
        "SMAP\nFeatureAnnouncementModalPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureAnnouncementModalPresenter.kt\nco/bird/android/lib/announcement/FeatureAnnouncementModalPresenter$5$showStream$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,266:1\n1#2:267\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/persistence/Announcement;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/Announcement;)V
    .locals 0

    iput-object p1, p0, Lgk1$e$d;->g:Lco/bird/android/model/persistence/Announcement;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lio/reactivex/u;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/FlightBannerNode;",
            ">;>;)",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;",
            ">;"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/FlightBannerNode;

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/buava/Optional;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/FlightBannerNode;

    goto :goto_3

    :cond_3
    move-object p1, v1

    :goto_3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lco/bird/android/model/FlightBannerNode;->getBanner()Lco/bird/android/model/FlightBannerNode$FlightBanner;

    move-result-object v1

    :cond_4
    sget-object p1, Lco/bird/android/model/FlightBannerNode$FlightBanner;->ANNOUNCEMENT:Lco/bird/android/model/FlightBannerNode$FlightBanner;

    if-ne v1, p1, :cond_5

    new-instance p1, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;

    iget-object v0, p0, Lgk1$e$d;->g:Lco/bird/android/model/persistence/Announcement;

    const-string v1, "announcement"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse$Dismiss;-><init>(Lco/bird/android/model/persistence/Announcement;)V

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_4

    :cond_5
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_4
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lgk1$e$d;->a(Ljava/util/List;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
