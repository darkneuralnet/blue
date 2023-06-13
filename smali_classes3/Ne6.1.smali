.class public final LNe6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/imageupload/worker/UpdatePhotosWorker;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LKp0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lco/bird/android/imageupload/worker/UpdatePhotosWorker;LKp0;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/imageupload/worker/UpdatePhotosWorker;->h:LKp0;

    return-void
.end method


# virtual methods
.method public b(Lco/bird/android/imageupload/worker/UpdatePhotosWorker;)V
    .locals 1

    iget-object v0, p0, LNe6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LKp0;

    invoke-static {p1, v0}, LNe6;->a(Lco/bird/android/imageupload/worker/UpdatePhotosWorker;LKp0;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/imageupload/worker/UpdatePhotosWorker;

    invoke-virtual {p0, p1}, LNe6;->b(Lco/bird/android/imageupload/worker/UpdatePhotosWorker;)V

    return-void
.end method
