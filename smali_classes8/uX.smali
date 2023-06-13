.class public final synthetic LuX;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/bluetooth/le/ScanResult;)I
    .locals 0

    invoke-virtual {p0}, Landroid/bluetooth/le/ScanResult;->getSecondaryPhy()I

    move-result p0

    return p0
.end method
