.class public final Lcl8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final f:Lol8;


# instance fields
.field public b:Z

.field public c:[I

.field public d:[Lol8;

.field public e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lol8;

    invoke-direct {v0}, Lol8;-><init>()V

    sput-object v0, Lcl8;->f:Lol8;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lcl8;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcl8;->b:Z

    shl-int/lit8 p1, p1, 0x2

    const/4 v1, 0x4

    move v2, v1

    :goto_0
    const/16 v3, 0x20

    if-ge v2, v3, :cond_1

    const/4 v3, 0x1

    shl-int/2addr v3, v2

    add-int/lit8 v3, v3, -0xc

    if-gt p1, v3, :cond_0

    move p1, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    div-int/2addr p1, v1

    new-array v1, p1, [I

    iput-object v1, p0, Lcl8;->c:[I

    new-array p1, p1, [Lol8;

    iput-object p1, p0, Lcl8;->d:[Lol8;

    iput v0, p0, Lcl8;->e:I

    return-void
.end method


# virtual methods
.method public final synthetic clone()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    iget v0, p0, Lcl8;->e:I

    new-instance v1, Lcl8;

    invoke-direct {v1, v0}, Lcl8;-><init>(I)V

    iget-object v2, p0, Lcl8;->c:[I

    iget-object v3, v1, Lcl8;->c:[I

    const/4 v4, 0x0

    invoke-static {v2, v4, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    if-ge v4, v0, :cond_1

    iget-object v2, p0, Lcl8;->d:[Lol8;

    aget-object v2, v2, v4

    if-eqz v2, :cond_0

    iget-object v3, v1, Lcl8;->d:[Lol8;

    invoke-virtual {v2}, Lol8;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lol8;

    aput-object v2, v3, v4

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iput v0, v1, Lcl8;->e:I

    return-object v1
.end method

.method public final d()Z
    .locals 1

    iget v0, p0, Lcl8;->e:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e(I)Lol8;
    .locals 1

    iget-object v0, p0, Lcl8;->d:[Lol8;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcl8;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcl8;

    iget v1, p0, Lcl8;->e:I

    iget v3, p1, Lcl8;->e:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcl8;->c:[I

    iget-object v4, p1, Lcl8;->c:[I

    move v5, v2

    :goto_0
    if-ge v5, v1, :cond_4

    aget v6, v3, v5

    aget v7, v4, v5

    if-eq v6, v7, :cond_3

    move v1, v2

    goto :goto_1

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    move v1, v0

    :goto_1
    if-eqz v1, :cond_7

    iget-object v1, p0, Lcl8;->d:[Lol8;

    iget-object p1, p1, Lcl8;->d:[Lol8;

    iget v3, p0, Lcl8;->e:I

    move v4, v2

    :goto_2
    if-ge v4, v3, :cond_6

    aget-object v5, v1, v4

    aget-object v6, p1, v4

    invoke-virtual {v5, v6}, Lol8;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    move p1, v2

    goto :goto_3

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    move p1, v0

    :goto_3
    if-eqz p1, :cond_7

    return v0

    :cond_7
    return v2
.end method

.method public final hashCode()I
    .locals 3

    const/16 v0, 0x11

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lcl8;->e:I

    if-ge v1, v2, :cond_0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcl8;->c:[I

    aget v2, v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcl8;->d:[Lol8;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Lol8;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcl8;->e:I

    return v0
.end method
