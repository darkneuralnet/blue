.class public final LIT4$F$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIT4$F;->invoke(Ljava/lang/Throwable;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireRide;",
        "Lco/bird/android/model/CompleteRideResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRide;",
        "ride",
        "Lco/bird/android/model/CompleteRideResponse;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireRide;)Lco/bird/android/model/CompleteRideResponse;"
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

.field public final synthetic h:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(LIT4;Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, LIT4$F$e;->g:LIT4;

    iput-object p2, p0, LIT4$F$e;->h:Ljava/lang/Throwable;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireRide;)Lco/bird/android/model/CompleteRideResponse;
    .locals 2

    const-string v0, "ride"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIT4$F$e;->g:LIT4;

    iget-object v1, p0, LIT4$F$e;->h:Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, LIT4;->access$generateCompletedRideErrorResponse(LIT4;Ljava/lang/Throwable;Lco/bird/android/model/wire/WireRide;)Lco/bird/android/model/CompleteRideResponse;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireRide;

    invoke-virtual {p0, p1}, LIT4$F$e;->a(Lco/bird/android/model/wire/WireRide;)Lco/bird/android/model/CompleteRideResponse;

    move-result-object p1

    return-object p1
.end method
