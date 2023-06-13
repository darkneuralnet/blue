.class public final Li25$n2$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25$n2;->invoke(Ljava/lang/Boolean;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "+",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/ScanlessRideItem;",
        ">;>;",
        "Lcom/google/android/gms/maps/model/LatLngBounds;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062 \u0010\u0005\u001a\u001c\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "kotlin.jvm.PlatformType",
        "",
        "Lco/bird/android/model/ScanlessRideItem;",
        "it",
        "Lcom/google/android/gms/maps/model/LatLngBounds;",
        "a",
        "(Lkotlin/Pair;)Lcom/google/android/gms/maps/model/LatLngBounds;"
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


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$n2$b;->g:Li25;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;)Lcom/google/android/gms/maps/model/LatLngBounds;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            "+",
            "Ljava/util/List<",
            "Lco/bird/android/model/ScanlessRideItem;",
            ">;>;)",
            "Lcom/google/android/gms/maps/model/LatLngBounds;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Li25$n2$b;->g:Li25;

    invoke-static {p1}, Li25;->access$getMapUi$p(Li25;)LG95;

    move-result-object p1

    invoke-interface {p1}, Lco/bird/android/app/feature/map/ui/MapUi;->latLngBounds()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Li25$n2$b;->a(Lkotlin/Pair;)Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object p1

    return-object p1
.end method
