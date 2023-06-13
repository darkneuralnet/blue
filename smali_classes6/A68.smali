.class public abstract LA68;
.super LvC7;
.source "SourceFile"

# interfaces
.implements LGe8;


# direct methods
.method public static d5(Landroid/os/IBinder;)LGe8;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.core.integrity.protocol.IIntegrityService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, LGe8;

    if-eqz v1, :cond_1

    check-cast v0, LGe8;

    return-object v0

    :cond_1
    new-instance v0, LpY7;

    invoke-direct {v0, p0}, LpY7;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
