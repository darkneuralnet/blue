.class public final LFn$z;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFn;->y(Z)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/location/Location;",
        "Lco/bird/android/model/DemandAreaAnalyticsInfo;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Landroid/location/Location;",
        "location",
        "Lco/bird/android/model/DemandAreaAnalyticsInfo;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Landroid/location/Location;)Lco/bird/android/model/DemandAreaAnalyticsInfo;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LFn;


# direct methods
.method public constructor <init>(LFn;)V
    .locals 0

    iput-object p1, p0, LFn$z;->g:LFn;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/location/Location;)Lco/bird/android/model/DemandAreaAnalyticsInfo;
    .locals 3

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/DemandAreaAnalyticsInfo;

    iget-object v1, p0, LFn$z;->g:LFn;

    invoke-static {v1, p1}, LFn;->access$getDemandLevel(LFn;Landroid/location/Location;)Lco/bird/android/buava/Optional;

    move-result-object v1

    iget-object v2, p0, LFn$z;->g:LFn;

    invoke-static {v2, p1}, LFn;->access$getDistanceToNearestDemandArea(LFn;Landroid/location/Location;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lco/bird/android/model/DemandAreaAnalyticsInfo;-><init>(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/location/Location;

    invoke-virtual {p0, p1}, LFn$z;->a(Landroid/location/Location;)Lco/bird/android/model/DemandAreaAnalyticsInfo;

    move-result-object p1

    return-object p1
.end method
