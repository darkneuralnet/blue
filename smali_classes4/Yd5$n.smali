.class public final LYd5$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYd5;->t0(Lio/reactivex/c;ZLKY;LbE5;Ljava/lang/Integer;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/disposables/c;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/disposables/c;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lio/reactivex/disposables/c;)V"
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
        "SMAP\nRxBleBirdBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxBleBirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/vehicle/RxBleBirdBluetoothManagerImpl$logDeepSleepEvents$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LKY;

.field public final synthetic h:LbE5;

.field public final synthetic i:Z

.field public final synthetic j:LYd5;


# direct methods
.method public constructor <init>(LKY;LbE5;ZLYd5;)V
    .locals 0

    iput-object p1, p0, LYd5$n;->g:LKY;

    iput-object p2, p0, LYd5$n;->h:LbE5;

    iput-boolean p3, p0, LYd5$n;->i:Z

    iput-object p4, p0, LYd5$n;->j:LYd5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/disposables/c;)V
    .locals 2

    iget-object p1, p0, LYd5$n;->g:LKY;

    if-eqz p1, :cond_0

    iget-boolean v0, p0, LYd5$n;->i:Z

    iget-object v1, p0, LYd5$n;->j:LYd5;

    if-nez v0, :cond_0

    invoke-static {v1}, LYd5;->access$getAnalyticsManager$p(LYd5;)LEa;

    move-result-object v0

    invoke-interface {v0, p1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_0
    iget-object p1, p0, LYd5$n;->h:LbE5;

    if-eqz p1, :cond_1

    iget-boolean v0, p0, LYd5$n;->i:Z

    iget-object v1, p0, LYd5$n;->j:LYd5;

    if-eqz v0, :cond_1

    invoke-static {v1}, LYd5;->access$getAnalyticsManager$p(LYd5;)LEa;

    move-result-object v0

    invoke-interface {v0, p1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/disposables/c;

    invoke-virtual {p0, p1}, LYd5$n;->a(Lio/reactivex/disposables/c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
