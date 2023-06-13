.class public abstract LOG8;
.super LUB7;
.source "SourceFile"

# interfaces
.implements LsN8;


# direct methods
.method public static c5(Landroid/os/IBinder;)LsN8;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, LsN8;

    if-eqz v1, :cond_1

    check-cast v0, LsN8;

    return-object v0

    :cond_1
    new-instance v0, LkA8;

    invoke-direct {v0, p0}, LkA8;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
