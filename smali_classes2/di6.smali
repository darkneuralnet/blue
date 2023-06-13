.class public final synthetic Ldi6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

.field public final synthetic c:Lio/reactivex/y;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;Lio/reactivex/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldi6;->b:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    iput-object p2, p0, Ldi6;->c:Lio/reactivex/y;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ldi6;->b:Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;

    iget-object v1, p0, Ldi6;->c:Lio/reactivex/y;

    invoke-static {v0, v1}, Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin$lifecycleObservable$1;->a(Lco/bird/android/app/feature/contractor/service/UserTrackerServicePlugin;Lio/reactivex/y;)V

    return-void
.end method
