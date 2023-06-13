.class public abstract Lno/nordicsemi/android/ble/a;
.super Lno/nordicsemi/android/ble/B0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lno/nordicsemi/android/ble/B0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public u:Lno/nordicsemi/android/ble/u0;

.field public v:I


# virtual methods
.method public L()Lno/nordicsemi/android/ble/u0;
    .locals 1

    iget-object v0, p0, Lno/nordicsemi/android/ble/a;->u:Lno/nordicsemi/android/ble/u0;

    return-object v0
.end method

.method public M()Z
    .locals 2

    iget v0, p0, Lno/nordicsemi/android/ble/a;->v:I

    const v1, -0x1e23f

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public N()Z
    .locals 2

    iget v0, p0, Lno/nordicsemi/android/ble/a;->v:I

    const v1, -0x1e240

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
