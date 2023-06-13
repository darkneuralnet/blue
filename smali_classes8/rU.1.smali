.class public abstract LrU;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(JJI)J
    .locals 2

    ushr-long v0, p0, p4

    xor-long/2addr v0, p0

    and-long/2addr p2, v0

    shl-long v0, p2, p4

    xor-long/2addr p2, v0

    xor-long/2addr p0, p2

    return-wide p0
.end method
