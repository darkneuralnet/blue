.class public LB41$d;
.super LB41;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB41;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LB41;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public c(LZS0;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public d(ZLZS0;Lfb1;)Z
    .locals 0

    sget-object p1, LZS0;->e:LZS0;

    if-eq p2, p1, :cond_0

    sget-object p1, LZS0;->f:LZS0;

    if-eq p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
