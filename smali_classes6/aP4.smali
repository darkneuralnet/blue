.class public LaP4;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(DDDDDDDD)Z
    .locals 0

    cmpl-double p0, p12, p0

    if-lez p0, :cond_0

    cmpg-double p0, p8, p4

    if-gez p0, :cond_0

    cmpl-double p0, p14, p2

    if-lez p0, :cond_0

    cmpg-double p0, p10, p6

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
