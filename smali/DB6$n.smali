.class public final LDB6$n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDB6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "n"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    move v2, v1

    :goto_0
    const/16 v3, 0x100

    if-gt v2, v3, :cond_9

    and-int v3, p0, v2

    if-eqz v3, :cond_8

    if-eq v2, v1, :cond_7

    const/4 v3, 0x2

    if-eq v2, v3, :cond_6

    const/4 v3, 0x4

    if-eq v2, v3, :cond_5

    const/16 v3, 0x8

    if-eq v2, v3, :cond_4

    const/16 v3, 0x10

    if-eq v2, v3, :cond_3

    const/16 v3, 0x20

    if-eq v2, v3, :cond_2

    const/16 v3, 0x40

    if-eq v2, v3, :cond_1

    const/16 v3, 0x80

    if-eq v2, v3, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {}, LfC6;->a()I

    move-result v3

    goto :goto_1

    :cond_1
    invoke-static {}, LeC6;->a()I

    move-result v3

    goto :goto_1

    :cond_2
    invoke-static {}, LdC6;->a()I

    move-result v3

    goto :goto_1

    :cond_3
    invoke-static {}, LcC6;->a()I

    move-result v3

    goto :goto_1

    :cond_4
    invoke-static {}, LbC6;->a()I

    move-result v3

    goto :goto_1

    :cond_5
    invoke-static {}, LaC6;->a()I

    move-result v3

    goto :goto_1

    :cond_6
    invoke-static {}, LZB6;->a()I

    move-result v3

    goto :goto_1

    :cond_7
    invoke-static {}, LYB6;->a()I

    move-result v3

    :goto_1
    or-int/2addr v0, v3

    :cond_8
    :goto_2
    shl-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_9
    return v0
.end method
