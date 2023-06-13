.class public LaO1;
.super Ld;
.source "SourceFile"


# static fields
.field private static final serialVersionUID:J = 0x2L


# instance fields
.field public f:Ljava/util/UUID;

.field public g:I

.field public h:I

.field public i:I


# direct methods
.method public constructor <init>()V
    .locals 4

    const/16 v0, 0x19

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/16 v1, 0x4c

    const/16 v2, 0x1a

    const/16 v3, 0xff

    invoke-direct {p0, v2, v3, v0, v1}, LaO1;-><init>(II[BI)V

    return-void

    nop

    :array_0
    .array-data 1
        0x4ct
        0x0t
        0x2t
        0x15t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(II[BI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Ld;-><init>(II[BI)V

    invoke-virtual {p0, p3}, LaO1;->j([B)V

    return-void
.end method

.method public static i(II[BI)LaO1;
    .locals 2

    if-eqz p2, :cond_1

    array-length v0, p2

    const/16 v1, 0x19

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LaO1;

    invoke-direct {v0, p0, p1, p2, p3}, LaO1;-><init>(II[BI)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final e([B)I
    .locals 1

    const/16 v0, 0x14

    invoke-static {p1, v0}, LR70;->c([BI)I

    move-result p1

    return p1
.end method

.method public final f([B)I
    .locals 1

    const/16 v0, 0x16

    invoke-static {p1, v0}, LR70;->c([BI)I

    move-result p1

    return p1
.end method

.method public final g([B)I
    .locals 1

    const/16 v0, 0x18

    aget-byte p1, p1, v0

    return p1
.end method

.method public final h([B)Ljava/util/UUID;
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lpd6;->c([BIZ)Ljava/util/UUID;

    move-result-object p1

    return-object p1
.end method

.method public final j([B)V
    .locals 2

    if-eqz p1, :cond_0

    array-length v0, p1

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, LaO1;->h([B)Ljava/util/UUID;

    move-result-object v0

    iput-object v0, p0, LaO1;->f:Ljava/util/UUID;

    invoke-virtual {p0, p1}, LaO1;->e([B)I

    move-result v0

    iput v0, p0, LaO1;->g:I

    invoke-virtual {p0, p1}, LaO1;->f([B)I

    move-result v0

    iput v0, p0, LaO1;->h:I

    invoke-virtual {p0, p1}, LaO1;->g([B)I

    move-result p1

    iput p1, p0, LaO1;->i:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The byte sequence cannot be parsed as an iBeacon."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, LaO1;->f:Ljava/util/UUID;

    aput-object v2, v0, v1

    iget v1, p0, LaO1;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget v1, p0, LaO1;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget v1, p0, LaO1;->i:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "iBeacon(UUID=%s,Major=%d,Minor=%d,Power=%d)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
