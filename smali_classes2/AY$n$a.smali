.class public final LAY$n$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAY$n;->c(Lkotlin/Pair;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/request/BluetoothTrackBody;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/request/BluetoothTrackBody;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/api/request/BluetoothTrackBody;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LAY;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(LAY;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, LAY$n$a;->g:LAY;

    iput-object p2, p0, LAY$n$a;->h:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/request/BluetoothTrackBody;)V
    .locals 3

    iget-object p1, p0, LAY$n$a;->g:LAY;

    invoke-static {p1}, LAY;->access$getCurrentlyTracked$p(LAY;)Lio/reactivex/subjects/a;

    move-result-object v0

    iget-object v1, p0, LAY$n$a;->h:Lco/bird/android/model/wire/WireBird;

    const/4 v2, 0x1

    invoke-static {p1, v0, v1, v2}, LAY;->access$trackVehicle(LAY;Lio/reactivex/subjects/a;Lco/bird/android/model/wire/WireBird;Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/request/BluetoothTrackBody;

    invoke-virtual {p0, p1}, LAY$n$a;->a(Lco/bird/api/request/BluetoothTrackBody;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
