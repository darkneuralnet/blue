.class public final LIT4$t$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4$t;->b(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;
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


# instance fields
.field public final synthetic g:LIT4;

.field public final synthetic h:Lco/bird/android/model/wire/WireRide;

.field public final synthetic i:Z

.field public final synthetic j:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(LIT4;Lco/bird/android/model/wire/WireRide;ZLco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, LIT4$t$a;->g:LIT4;

    iput-object p2, p0, LIT4$t$a;->h:Lco/bird/android/model/wire/WireRide;

    iput-boolean p3, p0, LIT4$t$a;->i:Z

    iput-object p4, p0, LIT4$t$a;->j:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/disposables/c;)V
    .locals 3

    iget-object p1, p0, LIT4$t$a;->g:LIT4;

    iget-object v0, p0, LIT4$t$a;->h:Lco/bird/android/model/wire/WireRide;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getId()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, LIT4$t$a;->i:Z

    if-eqz v1, :cond_0

    sget-object v1, Lco/bird/android/model/RideState$Status;->LOCKED:Lco/bird/android/model/RideState$Status;

    goto :goto_0

    :cond_0
    sget-object v1, Lco/bird/android/model/RideState$Status;->UNLOCKED:Lco/bird/android/model/RideState$Status;

    :goto_0
    iget-object v2, p0, LIT4$t$a;->j:Lco/bird/android/model/wire/WireBird;

    invoke-static {p1, v0, v1, v2}, LIT4;->access$resetRideStateUpdateStateWithStatus(LIT4;Ljava/lang/String;Lco/bird/android/model/RideState$Status;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/disposables/c;

    invoke-virtual {p0, p1}, LIT4$t$a;->a(Lio/reactivex/disposables/c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
