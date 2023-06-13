.class public final LLK$f0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLK;->h2(Lio/reactivex/Observable;ZLKY;LbE5;Ljava/lang/Integer;)Lio/reactivex/Observable;
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
        "SMAP\nBirdBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl$logDeepSleepEvents$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,969:1\n1#2:970\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LKY;

.field public final synthetic h:LbE5;

.field public final synthetic i:Z

.field public final synthetic j:LLK;


# direct methods
.method public constructor <init>(LKY;LbE5;ZLLK;)V
    .locals 0

    iput-object p1, p0, LLK$f0;->g:LKY;

    iput-object p2, p0, LLK$f0;->h:LbE5;

    iput-boolean p3, p0, LLK$f0;->i:Z

    iput-object p4, p0, LLK$f0;->j:LLK;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/disposables/c;)V
    .locals 2

    iget-object p1, p0, LLK$f0;->g:LKY;

    if-eqz p1, :cond_0

    iget-boolean v0, p0, LLK$f0;->i:Z

    iget-object v1, p0, LLK$f0;->j:LLK;

    if-nez v0, :cond_0

    invoke-static {v1}, LLK;->access$getAnalyticsManager$p(LLK;)LEa;

    move-result-object v0

    invoke-interface {v0, p1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_0
    iget-object p1, p0, LLK$f0;->h:LbE5;

    if-eqz p1, :cond_1

    iget-boolean v0, p0, LLK$f0;->i:Z

    iget-object v1, p0, LLK$f0;->j:LLK;

    if-eqz v0, :cond_1

    invoke-static {v1}, LLK;->access$getAnalyticsManager$p(LLK;)LEa;

    move-result-object v0

    invoke-interface {v0, p1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/disposables/c;

    invoke-virtual {p0, p1}, LLK$f0;->a(Lio/reactivex/disposables/c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
