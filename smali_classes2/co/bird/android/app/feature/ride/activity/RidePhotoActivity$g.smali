.class public final Lco/bird/android/app/feature/ride/activity/RidePhotoActivity$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/ride/activity/RidePhotoActivity;->onCreate(Landroid/os/Bundle;)V
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
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRide;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireRide;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/ride/activity/RidePhotoActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/ride/activity/RidePhotoActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/ride/activity/RidePhotoActivity$g;->g:Lco/bird/android/app/feature/ride/activity/RidePhotoActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireRide;)V
    .locals 8

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RidePhotoActivity$g;->g:Lco/bird/android/app/feature/ride/activity/RidePhotoActivity;

    invoke-virtual {v0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v1

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RidePhotoActivity$g;->g:Lco/bird/android/app/feature/ride/activity/RidePhotoActivity;

    invoke-static {v0}, Lco/bird/android/app/feature/ride/activity/RidePhotoActivity;->access$getRideDetail$p(Lco/bird/android/app/feature/ride/activity/RidePhotoActivity;)Lco/bird/android/model/wire/WireRideDetail;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "rideDetail"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Le13$a;->goToRideSummary$default(Le13;Lco/bird/android/model/wire/WireRideDetail;ZZLjava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/feature/ride/activity/RidePhotoActivity$g;->g:Lco/bird/android/app/feature/ride/activity/RidePhotoActivity;

    invoke-virtual {v0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->close()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ride photo: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireRide;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/ride/activity/RidePhotoActivity$g;->a(Lco/bird/android/model/wire/WireRide;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
