.class final Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$11;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/location/Address;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/location/Address;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$11;->this$0:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/location/Address;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$11;->invoke(Landroid/location/Address;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/location/Address;)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$11;->this$0:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;

    invoke-static {v1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->access$getCompleteAddress$p(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)LAG;

    move-result-object v1

    invoke-static/range {p1 .. p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, LDr4;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LAG;->accept(Ljava/lang/Object;)V

    iget-object v1, v0, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl$onResume$11;->this$0:Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;

    invoke-static {v1}, Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;->access$getUi$p(Lco/bird/android/app/feature/map/presenter/LocationSelectionPresenterImpl;)Lco/bird/android/app/feature/map/ui/LocationSelectionUi;

    move-result-object v1

    new-instance v15, Lco/bird/android/model/wire/WireLocation;

    invoke-virtual/range {p1 .. p1}, Landroid/location/Address;->getLatitude()D

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Landroid/location/Address;->getLongitude()D

    move-result-wide v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x1fc

    const/16 v16, 0x0

    move-object v2, v15

    move-object v0, v15

    move-object/from16 v15, v16

    invoke-direct/range {v2 .. v15}, Lco/bird/android/model/wire/WireLocation;-><init>(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2, v2}, Lco/bird/android/app/feature/map/ui/LocationSelectionUi;->setLocation(Lco/bird/android/model/wire/WireLocation;ZZ)V

    return-void
.end method
