.class public final LED0$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LED0;->d()Lio/reactivex/Observable;
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
        "Lco/bird/android/model/wire/WireCouponDisplayView;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireCouponDisplayView;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "Lco/bird/android/model/wire/WireCouponDisplayView;",
        "couponsDisplayViews",
        "Lco/bird/android/buava/Optional;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Lco/bird/android/buava/Optional;"
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
        "SMAP\nCouponDisplayBannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponDisplayBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/CouponDisplayBannerPresenterImpl$couponToDisplay$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n288#2,2:83\n*S KotlinDebug\n*F\n+ 1 CouponDisplayBannerPresenter.kt\nco/bird/android/app/feature/banners/presenter/CouponDisplayBannerPresenterImpl$couponToDisplay$1\n*L\n75#1:83,2\n*E\n"
    }
.end annotation


# static fields
.field public static final g:LED0$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LED0$a;

    invoke-direct {v0}, LED0$a;-><init>()V

    sput-object v0, LED0$a;->g:LED0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lco/bird/android/buava/Optional;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireCouponDisplayView;",
            ">;)",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireCouponDisplayView;",
            ">;"
        }
    .end annotation

    const-string v0, "couponsDisplayViews"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lco/bird/android/model/wire/WireCouponDisplayView;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireCouponDisplayView;->getTag()Lco/bird/android/model/constant/CouponDisplayTag;

    move-result-object v3

    sget-object v4, Lco/bird/android/model/constant/CouponDisplayTag;->APPLIES_TO_NEXT_RIDE:Lco/bird/android/model/constant/CouponDisplayTag;

    if-ne v3, v4, :cond_1

    invoke-static {v2}, Lco/bird/android/model/wire/WireCouponDisplayViewKt;->expired(Lco/bird/android/model/wire/WireCouponDisplayView;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_0

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LED0$a;->a(Ljava/util/List;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method
