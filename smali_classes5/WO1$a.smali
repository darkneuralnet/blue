.class public abstract LWO1$a;
.super LHB7;
.source "SourceFile"

# interfaces
.implements LWO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWO1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.dynamic.IObjectWrapper"

    invoke-direct {p0, v0}, LHB7;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static c5(Landroid/os/IBinder;)LWO1;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.dynamic.IObjectWrapper"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, LWO1;

    if-eqz v1, :cond_1

    check-cast v0, LWO1;

    return-object v0

    :cond_1
    new-instance v0, LuC7;

    invoke-direct {v0, p0}, LuC7;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
