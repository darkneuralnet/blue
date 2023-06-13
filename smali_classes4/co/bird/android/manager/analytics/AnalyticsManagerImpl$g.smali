.class public final Lco/bird/android/manager/analytics/AnalyticsManagerImpl$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->B1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lde5$a;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lde5$a;",
        "state",
        "",
        "a",
        "(Lde5$a;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/analytics/AnalyticsManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$g;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lde5$a;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/analytics/BluetoothState;

    invoke-static {p1}, Lco/bird/android/model/analytics/RxBleState_Kt;->toSimpleState(Lde5$a;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lco/bird/android/model/analytics/BluetoothState;-><init>(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$g;->g:Lco/bird/android/manager/analytics/AnalyticsManagerImpl;

    invoke-virtual {p1, v0}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl;->x(Lco/bird/android/model/analytics/PersistentPropertyEntry;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde5$a;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/analytics/AnalyticsManagerImpl$g;->a(Lde5$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
