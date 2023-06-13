.class public final Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;->r()Lio/reactivex/F;
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
        "Landroidx/work/c$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireRide;",
        "it",
        "Landroidx/work/c$a;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/WireRide;)Landroidx/work/c$a;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker$b;

    invoke-direct {v0}, Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker$b;-><init>()V

    sput-object v0, Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker$b;->g:Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireRide;)Landroidx/work/c$a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/work/c$a;->c()Landroidx/work/c$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireRide;

    invoke-virtual {p0, p1}, Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker$b;->a(Lco/bird/android/model/wire/WireRide;)Landroidx/work/c$a;

    move-result-object p1

    return-object p1
.end method
