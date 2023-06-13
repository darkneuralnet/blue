.class public final LF35$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF35;->x(LG35;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireRideReportItem;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRideReportItem;",
        "kotlin.jvm.PlatformType",
        "rideReportItem",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireRideReportItem;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LF35;


# direct methods
.method public constructor <init>(LF35;)V
    .locals 0

    iput-object p1, p0, LF35$i;->g:LF35;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireRideReportItem;)V
    .locals 4

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideReportItem;->getImageAsset()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideReportItem;->getImageTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideReportItem;->getImageCaption()Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    iget-object p1, p0, LF35$i;->g:LF35;

    invoke-static {p1}, LF35;->access$getNavigator$p(LF35;)Le13;

    move-result-object p1

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLegacyAsset;->getMedia()Lco/bird/android/model/wire/WireAssetMedia;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v0, v2, v3, v1}, Le13$a;->goToLightbox$default(Le13;Ljava/util/List;IILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    if-eqz p1, :cond_1

    iget-object v0, p0, LF35$i;->g:LF35;

    new-instance v2, LF35$i$a;

    invoke-direct {v2, v1, p1}, LF35$i$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lf1;->i(Lkotlin/jvm/functions/Function1;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireRideReportItem;

    invoke-virtual {p0, p1}, LF35$i;->a(Lco/bird/android/model/wire/WireRideReportItem;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
