.class public final LRe6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LYR4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;LYR4;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;->h:LYR4;

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;)V
    .locals 1

    iget-object v0, p0, LRe6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYR4;

    invoke-static {p1, v0}, LRe6;->b(Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;LYR4;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;

    invoke-virtual {p0, p1}, LRe6;->a(Lco/bird/android/imageupload/worker/UpdateRidePhotoWorker;)V

    return-void
.end method
