.class public abstract LM68;
.super LDB7;
.source "SourceFile"

# interfaces
.implements LTe8;


# direct methods
.method public static c5(Landroid/os/IBinder;)LTe8;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.auth.IAuthManagerService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, LTe8;

    if-eqz v1, :cond_1

    check-cast v0, LTe8;

    return-object v0

    :cond_1
    new-instance v0, LFY7;

    invoke-direct {v0, p0}, LFY7;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
