.class public abstract LBM7;
.super LDL7;
.source "SourceFile"

# interfaces
.implements LQM7;


# direct methods
.method public static d5(Landroid/os/IBinder;)LQM7;
    .locals 2

    const-string v0, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, LQM7;

    if-eqz v1, :cond_0

    check-cast v0, LQM7;

    return-object v0

    :cond_0
    new-instance v0, LkM7;

    invoke-direct {v0, p0}, LkM7;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
