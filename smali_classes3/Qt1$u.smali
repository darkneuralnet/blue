.class public final LQt1$u;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQt1;->s0(Ljava/lang/String;Lorg/joda/time/DateTime;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/QuickCaptureStateResponse;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/constant/QuickCaptureState;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/api/response/QuickCaptureStateResponse;",
        "stateResponse",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/constant/QuickCaptureState;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/QuickCaptureStateResponse;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LQt1;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lorg/joda/time/DateTime;


# direct methods
.method public constructor <init>(LQt1;Ljava/lang/String;Lorg/joda/time/DateTime;)V
    .locals 0

    iput-object p1, p0, LQt1$u;->g:LQt1;

    iput-object p2, p0, LQt1$u;->h:Ljava/lang/String;

    iput-object p3, p0, LQt1$u;->i:Lorg/joda/time/DateTime;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/QuickCaptureStateResponse;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/QuickCaptureStateResponse;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/constant/QuickCaptureState;",
            ">;"
        }
    .end annotation

    const-string v0, "stateResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQt1$u;->g:LQt1;

    invoke-static {v0}, LQt1;->access$getQuickCaptureState$p(LQt1;)Lio/reactivex/subjects/d;

    move-result-object v0

    iget-object v1, p0, LQt1$u;->h:Ljava/lang/String;

    invoke-virtual {p1}, Lco/bird/api/response/QuickCaptureStateResponse;->getState()Lco/bird/android/model/constant/QuickCaptureState;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, LQt1$u;->g:LQt1;

    invoke-static {v0}, LQt1;->access$getQuickCaptureTimeout$p(LQt1;)Lio/reactivex/subjects/d;

    move-result-object v0

    iget-object v1, p0, LQt1$u;->h:Ljava/lang/String;

    iget-object v2, p0, LQt1$u;->i:Lorg/joda/time/DateTime;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/api/response/QuickCaptureStateResponse;->getState()Lco/bird/android/model/constant/QuickCaptureState;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/QuickCaptureState;->READY:Lco/bird/android/model/constant/QuickCaptureState;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lco/bird/api/response/QuickCaptureStateResponse;->getState()Lco/bird/android/model/constant/QuickCaptureState;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, Lnd4;

    invoke-virtual {p1}, Lco/bird/api/response/QuickCaptureStateResponse;->getState()Lco/bird/android/model/constant/QuickCaptureState;

    move-result-object p1

    invoke-direct {v0, p1}, Lnd4;-><init>(Lco/bird/android/model/constant/QuickCaptureState;)V

    invoke-static {v0}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/QuickCaptureStateResponse;

    invoke-virtual {p0, p1}, LQt1$u;->a(Lco/bird/api/response/QuickCaptureStateResponse;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
