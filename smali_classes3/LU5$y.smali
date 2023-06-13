.class public final LLU5$y;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLU5;->O(LNU5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "Landroid/location/Location;",
        "Lco/bird/api/response/OperatorMapNestResponse;",
        "Lkotlin/Triple<",
        "+",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "+",
        "Landroid/location/Location;",
        "+",
        "Lco/bird/api/response/OperatorMapNestResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lcom/google/android/gms/maps/model/LatLng;",
        "pinLocation",
        "Landroid/location/Location;",
        "userLocation",
        "Lco/bird/api/response/OperatorMapNestResponse;",
        "response",
        "Lkotlin/Triple;",
        "a",
        "(Lcom/google/android/gms/maps/model/LatLng;Landroid/location/Location;Lco/bird/api/response/OperatorMapNestResponse;)Lkotlin/Triple;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LLU5$y;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LLU5$y;

    invoke-direct {v0}, LLU5$y;-><init>()V

    sput-object v0, LLU5$y;->g:LLU5$y;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/maps/model/LatLng;Landroid/location/Location;Lco/bird/api/response/OperatorMapNestResponse;)Lkotlin/Triple;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/model/LatLng;",
            "Landroid/location/Location;",
            "Lco/bird/api/response/OperatorMapNestResponse;",
            ")",
            "Lkotlin/Triple<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            "Landroid/location/Location;",
            "Lco/bird/api/response/OperatorMapNestResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "pinLocation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userLocation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/Triple;

    invoke-direct {v0, p1, p2, p3}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/maps/model/LatLng;

    check-cast p2, Landroid/location/Location;

    check-cast p3, Lco/bird/api/response/OperatorMapNestResponse;

    invoke-virtual {p0, p1, p2, p3}, LLU5$y;->a(Lcom/google/android/gms/maps/model/LatLng;Landroid/location/Location;Lco/bird/api/response/OperatorMapNestResponse;)Lkotlin/Triple;

    move-result-object p1

    return-object p1
.end method
