.class public final Lsu3$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsu3;->a0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/BirdLocations;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/BirdLocations;",
        "kotlin.jvm.PlatformType",
        "locations",
        "",
        "a",
        "(Lco/bird/android/model/BirdLocations;)V"
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
        "SMAP\nOperatorSupplementMapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSupplementMapPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorSupplementMapPresenterImpl$loadRadarLocation$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,421:1\n288#2,2:422\n*S KotlinDebug\n*F\n+ 1 OperatorSupplementMapPresenter.kt\nco/bird/android/app/feature/operator/presenter/OperatorSupplementMapPresenterImpl$loadRadarLocation$2\n*L\n336#1:422,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lsu3;


# direct methods
.method public constructor <init>(Lsu3;)V
    .locals 0

    iput-object p1, p0, Lsu3$n;->g:Lsu3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/BirdLocations;)V
    .locals 3

    invoke-virtual {p1}, Lco/bird/android/model/BirdLocations;->getLocations()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lco/bird/android/model/BirdLocation;

    invoke-virtual {v1}, Lco/bird/android/model/BirdLocation;->getSource()Lco/bird/android/model/constant/BirdLocationSource;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/constant/BirdLocationSource;->EU_TAG:Lco/bird/android/model/constant/BirdLocationSource;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    check-cast v0, Lco/bird/android/model/BirdLocation;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lsu3$n;->g:Lsu3;

    const-string v0, "039"

    invoke-static {p1, v0}, Lsu3;->access$updateInfoBannerToShowRecoveryTool(Lsu3;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/BirdLocations;

    invoke-virtual {p0, p1}, Lsu3$n;->a(Lco/bird/android/model/BirdLocations;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
