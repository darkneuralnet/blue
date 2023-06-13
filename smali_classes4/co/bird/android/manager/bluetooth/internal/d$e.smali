.class public final Lco/bird/android/manager/bluetooth/internal/d$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/bluetooth/internal/d;->j(Lco/bird/android/model/Vehicle;)Lio/reactivex/F;
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
        "Lco/bird/android/model/Vehicle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "it",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/Vehicle;


# direct methods
.method public constructor <init>(Lco/bird/android/model/Vehicle;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$e;->g:Lco/bird/android/model/Vehicle;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->getAuthenticated()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$e;->g:Lco/bird/android/model/Vehicle;

    return-object p1

    :cond_0
    new-instance v6, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v1, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->h:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/Vehicle;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Vehicle;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$e;->a(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle;

    move-result-object p1

    return-object p1
.end method
