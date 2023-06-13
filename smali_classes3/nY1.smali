.class public final LnY1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/imageupload/worker/ImageUploadWorker;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lef6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b(Lco/bird/android/imageupload/worker/ImageUploadWorker;Lef6;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/imageupload/worker/ImageUploadWorker;->h:Lef6;

    return-void
.end method


# virtual methods
.method public a(Lco/bird/android/imageupload/worker/ImageUploadWorker;)V
    .locals 1

    iget-object v0, p0, LnY1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lef6;

    invoke-static {p1, v0}, LnY1;->b(Lco/bird/android/imageupload/worker/ImageUploadWorker;Lef6;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/imageupload/worker/ImageUploadWorker;

    invoke-virtual {p0, p1}, LnY1;->a(Lco/bird/android/imageupload/worker/ImageUploadWorker;)V

    return-void
.end method
