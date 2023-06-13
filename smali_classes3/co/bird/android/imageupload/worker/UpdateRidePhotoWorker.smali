.class public final Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;
.super Landroidx/work/RxWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\"\u0010\u000c\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;",
        "Landroidx/work/RxWorker;",
        "Lio/reactivex/F;",
        "Landroidx/work/c$a;",
        "r",
        "LYR4;",
        "h",
        "LYR4;",
        "y",
        "()LYR4;",
        "setRideManager",
        "(LYR4;)V",
        "rideManager",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "i",
        "a",
        "image-upload_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final i:Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker$a;


# instance fields
.field public h:LYR4;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;->i:Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/RxWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroidx/work/c;->b()Landroid/content/Context;

    move-result-object p2

    const-string v0, "applicationContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type co.bird.android.imageupload.worker.UpdateRidePhotoWorkerComponent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LQe6;

    invoke-interface {p1, p0}, LQe6;->v3(Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;)V

    return-void
.end method

.method public static synthetic u(Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;Ljava/lang/Throwable;)Landroidx/work/c$a;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;->x(Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;Ljava/lang/Throwable;)Landroidx/work/c$a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroidx/work/c$a;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;->w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroidx/work/c$a;

    move-result-object p0

    return-object p0
.end method

.method public static final w(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroidx/work/c$a;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/work/c$a;

    return-object p0
.end method

.method public static final x(Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;Ljava/lang/Throwable;)Landroidx/work/c$a;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/work/c;->h()I

    move-result p0

    const/16 p1, 0xc

    if-lt p0, p1, :cond_0

    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/work/c$a;->b()Landroidx/work/c$a;

    move-result-object p0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public r()Lio/reactivex/F;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Landroidx/work/c$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/work/c;->g()Landroidx/work/b;

    move-result-object v0

    const-string v1, "RIDE_ID"

    invoke-virtual {v0, v1}, Landroidx/work/b;->j(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/work/c;->g()Landroidx/work/b;

    move-result-object v1

    const-string v2, "UPLOADED_IMAGE_URL"

    invoke-virtual {v1, v2}, Landroidx/work/b;->j(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    array-length v4, v0

    if-nez v4, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    move v4, v3

    goto :goto_2

    :cond_2
    :goto_1
    move v4, v2

    :goto_2
    if-nez v4, :cond_7

    if-eqz v1, :cond_5

    array-length v4, v1

    if-nez v4, :cond_3

    move v4, v2

    goto :goto_3

    :cond_3
    move v4, v3

    :goto_3
    if-eqz v4, :cond_4

    goto :goto_4

    :cond_4
    move v2, v3

    :cond_5
    :goto_4
    if-eqz v2, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {p0}, Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;->y()LYR4;

    move-result-object v2

    aget-object v0, v0, v3

    const-string v4, "rideId[0]"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    aget-object v1, v1, v3

    const-string v3, "imageUrl[0]"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v0, v1}, LYR4;->e0(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lio/reactivex/F;->T(J)Lio/reactivex/F;

    move-result-object v0

    sget-object v1, Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker$b;->g:Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker$b;

    new-instance v2, LOe6;

    invoke-direct {v2, v1}, LOe6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LPe6;

    invoke-direct {v1, p0}, LPe6;-><init>(Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;)V

    invoke-virtual {v0, v1}, Lio/reactivex/F;->Q(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "rideManager.updateRidePh\u2026retry()\n        }\n      }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_7
    :goto_5
    invoke-static {}, Landroidx/work/c$a;->a()Landroidx/work/c$a;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "just(Result.failure())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final y()LYR4;
    .locals 1

    iget-object v0, p0, Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;->h:LYR4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "rideManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
