.class public final Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVX0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1;->b(Lio/reactivex/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "co/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1$1$1",
        "LVX0;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onStart",
        "onStop",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/y<",
            "Landroidx/lifecycle/f$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "Landroidx/lifecycle/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1$1$1;->b:Lio/reactivex/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStart(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onStart(LLifecycleOwner;)V

    iget-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1$1$1;->b:Lio/reactivex/y;

    sget-object v0, Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;

    invoke-interface {p1, v0}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public onStop(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onStop(LLifecycleOwner;)V

    iget-object p1, p0, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1$1$1;->b:Lio/reactivex/y;

    sget-object v0, Landroidx/lifecycle/f$a;->ON_STOP:Landroidx/lifecycle/f$a;

    invoke-interface {p1, v0}, Lio/reactivex/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method
