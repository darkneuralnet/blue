.class public final Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->A(JLjava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/location/Location;",
        "Lio/reactivex/B<",
        "+",
        "LTk5;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Landroid/location/Location;",
        "it",
        "Lio/reactivex/B;",
        "LTk5;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Landroid/location/Location;)Lio/reactivex/B;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$c;->g:Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;

    iput-object p2, p0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$c;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroid/location/Location;)Lio/reactivex/B;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "LTk5;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$c;->g:Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;

    invoke-virtual {p1}, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker;->x()LMD;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    iget-object v3, p0, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$c;->h:Ljava/lang/String;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LMD$a;->scanBleDevices$default(LMD;IZLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/location/Location;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/bluetooth/job/HeadlessSweepWorker$c;->invoke(Landroid/location/Location;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
