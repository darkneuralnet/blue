.class public abstract LYJ6;
.super LlO6;
.source "SourceFile"

# interfaces
.implements LaK6;


# direct methods
.method public static d5(Landroid/os/IBinder;)LaK6;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.core.inappreview.protocol.IInAppReviewService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, LaK6;

    if-eqz v1, :cond_1

    check-cast v0, LaK6;

    return-object v0

    :cond_1
    new-instance v0, LXJ6;

    invoke-direct {v0, p0}, LXJ6;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
