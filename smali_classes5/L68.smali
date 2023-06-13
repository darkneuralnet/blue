.class public abstract LL68;
.super LPC7;
.source "SourceFile"

# interfaces
.implements LSe8;


# direct methods
.method public static c5(Landroid/os/IBinder;)LSe8;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, LSe8;

    if-eqz v1, :cond_1

    check-cast v0, LSe8;

    return-object v0

    :cond_1
    new-instance v0, LEY7;

    invoke-direct {v0, p0}, LEY7;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
