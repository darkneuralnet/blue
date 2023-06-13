.class public final LUh5$p;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUh5;->b(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/ArrayList<",
        "Lco/bird/android/model/BirdInspectionPoint;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u000520\u0010\u0004\u001a,\u0012\u0004\u0012\u00020\u0001 \u0003*\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u00020\u0000j\u0008\u0012\u0004\u0012\u00020\u0001`\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Ljava/util/ArrayList;",
        "Lco/bird/android/model/BirdInspectionPoint;",
        "Lkotlin/collections/ArrayList;",
        "kotlin.jvm.PlatformType",
        "inspectionPointsList",
        "",
        "a",
        "(Ljava/util/ArrayList;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LUh5;


# direct methods
.method public constructor <init>(LUh5;)V
    .locals 0

    iput-object p1, p0, LUh5$p;->g:LUh5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lco/bird/android/model/BirdInspectionPoint;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LUh5$p;->g:LUh5;

    invoke-virtual {v0}, LUh5;->X()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v0, p0, LUh5$p;->g:LUh5;

    invoke-static {v0}, LUh5;->access$getNavigator$p(LUh5;)Le13;

    move-result-object v1

    invoke-virtual {v0}, LUh5;->W()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    sget-object v3, Lco/bird/android/model/MechanicPhotoMode;->INSPECTION:Lco/bird/android/model/MechanicPhotoMode;

    invoke-virtual {v0}, LUh5;->Y()Landroid/location/Location;

    move-result-object v5

    const-string v6, "inspectionPointsList"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    move-object v6, p1

    invoke-interface/range {v1 .. v7}, Le13;->B1(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/MechanicPhotoMode;Ljava/lang/String;Landroid/location/Location;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-static {v0}, LUh5;->access$getNavigator$p(LUh5;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, LUh5$p;->a(Ljava/util/ArrayList;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
