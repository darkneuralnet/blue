.class public final LAY$q$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAY$q;->invoke(Lkotlin/Pair;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Vehicle;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/Vehicle;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:I

.field public final synthetic i:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic j:LAY;

.field public final synthetic k:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;ILkotlin/jvm/internal/Ref$IntRef;LAY;Lco/bird/android/model/wire/WireBird;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "LAY;",
            "Lco/bird/android/model/wire/WireBird;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LAY$q$a;->g:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput p2, p0, LAY$q$a;->h:I

    iput-object p3, p0, LAY$q$a;->i:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p4, p0, LAY$q$a;->j:LAY;

    iput-object p5, p0, LAY$q$a;->k:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Vehicle;)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, LAY$q$a;->g:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget v2, v0, LAY$q$a;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget-object v1, v0, LAY$q$a;->i:Lkotlin/jvm/internal/Ref$IntRef;

    iget v2, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget-object v1, v0, LAY$q$a;->j:LAY;

    invoke-static {v1}, LAY;->access$getRideCache$p(LAY;)LAY$g;

    move-result-object v1

    iget-object v2, v0, LAY$q$a;->k:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireRide;

    iget-object v2, v0, LAY$q$a;->j:LAY;

    invoke-static {v2}, LAY;->access$getAnalyticsManager$p(LAY;)LEa;

    move-result-object v2

    new-instance v15, LeY;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x0

    if-nez v3, :cond_1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getVehicleModel()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v8

    :goto_0
    if-nez v3, :cond_1

    const-string v3, "unknown"

    :cond_1
    move-object v9, v3

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v3

    move-object v10, v3

    goto :goto_1

    :cond_2
    move-object v10, v8

    :goto_1
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireRide;->isPrimaryRide()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v8

    :goto_2
    iget v3, v0, LAY$q$a;->h:I

    int-to-long v11, v3

    const-string v13, "client_track"

    const/4 v14, 0x7

    const/16 v16, 0x0

    move-object v3, v15

    move-object v8, v9

    move-object v9, v10

    move-object v10, v1

    move-object v1, v15

    move-object/from16 v15, v16

    invoke-direct/range {v3 .. v15}, LeY;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Vehicle;

    invoke-virtual {p0, p1}, LAY$q$a;->a(Lco/bird/android/model/Vehicle;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
