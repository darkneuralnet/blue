.class public final LjP2$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjP2;->Q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/BirdRepair;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/BirdRepair;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/BirdRepair;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LjP2;


# direct methods
.method public constructor <init>(LjP2;)V
    .locals 0

    iput-object p1, p0, LjP2$d;->g:LjP2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/BirdRepair;)V
    .locals 5

    iget-object v0, p0, LjP2$d;->g:LjP2;

    invoke-static {v0}, LjP2;->access$getNavigator$p(LjP2;)Le13;

    move-result-object v0

    iget-object v1, p0, LjP2$d;->g:LjP2;

    invoke-static {v1}, LjP2;->access$getBird$p(LjP2;)Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string v1, "bird"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    iget-object v3, p0, LjP2$d;->g:LjP2;

    invoke-static {v3}, LjP2;->access$getLocation$p(LjP2;)Landroid/location/Location;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, "location"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v2

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/BirdRepair;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, LjP2$d;->g:LjP2;

    invoke-static {v4}, LjP2;->access$getInspectionPointList$p(LjP2;)Ljava/util/ArrayList;

    move-result-object v4

    if-nez v4, :cond_2

    const-string v4, "inspectionPointList"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v2, v4

    :goto_0
    invoke-interface {v0, v1, v3, p1, v2}, Le13;->l4(Lco/bird/android/model/wire/WireBird;Landroid/location/Location;Ljava/lang/String;Ljava/util/ArrayList;)V

    iget-object p1, p0, LjP2$d;->g:LjP2;

    invoke-static {p1}, LjP2;->access$getNavigator$p(LjP2;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/BirdRepair;

    invoke-virtual {p0, p1}, LjP2$d;->a(Lco/bird/android/model/BirdRepair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
