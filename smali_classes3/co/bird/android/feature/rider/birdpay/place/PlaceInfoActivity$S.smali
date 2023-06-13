.class public final Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$S;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity;->R0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "kotlin.jvm.PlatformType",
        "site",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireMerchantSite;)V"
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
        "SMAP\nPlaceInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$setupViewModel$7\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,375:1\n260#2:376\n*S KotlinDebug\n*F\n+ 1 PlaceInfoActivity.kt\nco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$setupViewModel$7\n*L\n139#1:376\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity;

.field public final synthetic h:Lco/bird/android/model/Trigger;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity;Lco/bird/android/model/Trigger;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$S;->g:Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity;

    iput-object p2, p0, Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$S;->h:Lco/bird/android/model/Trigger;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireMerchantSite;)V
    .locals 12

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$S;->g:Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity;

    invoke-virtual {v0}, Lco/bird/android/core/mvp/BaseActivity;->F()LEa;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getMerchant()Lco/bird/android/model/wire/WireMerchantDescription;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireMerchantDescription;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getId()Ljava/lang/String;

    move-result-object v8

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$S;->g:Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity;

    invoke-static {p1}, Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity;->access$getBinding$p(Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity;)LN4;

    move-result-object p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v1

    :cond_0
    iget-object p1, p1, LN4;->A:Landroid/widget/Button;

    const-string v2, "binding.secondaryActionButton"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    move v9, p1

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$S;->h:Lco/bird/android/model/Trigger;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v1, "this as java.lang.String).toLowerCase()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p1

    goto :goto_1

    :cond_2
    move-object v6, v1

    :goto_1
    new-instance p1, LoO;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x7

    const/4 v11, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v11}, LoO;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, p1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireMerchantSite;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/place/PlaceInfoActivity$S;->a(Lco/bird/android/model/wire/WireMerchantSite;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
