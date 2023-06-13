.class public Ltd6;
.super Ld;
.source "SourceFile"


# static fields
.field public static final k:Ljava/util/regex/Pattern;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public f:I

.field public g:Ljava/lang/String;

.field public h:I

.field public i:I

.field public j:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "^[0-9A-Fa-f]{32}$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ltd6;->k:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/16 v0, 0x19

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/16 v1, 0x19a

    const/16 v2, 0x1a

    const/16 v3, 0xff

    invoke-direct {p0, v2, v3, v0, v1}, Ltd6;-><init>(II[BI)V

    return-void

    nop

    :array_0
    .array-data 1
        -0x66t
        0x1t
        0x3t
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
        0x0t
    .end array-data
.end method

.method public constructor <init>(II[BI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Ld;-><init>(II[BI)V

    invoke-virtual {p0, p3}, Ltd6;->m([B)V

    return-void
.end method

.method public static j(II[BI)Ltd6;
    .locals 2

    if-eqz p2, :cond_1

    array-length v0, p2

    const/16 v1, 0x16

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ltd6;

    invoke-direct {v0, p0, p1, p2, p3}, Ltd6;-><init>(II[BI)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final e([B)I
    .locals 1

    const/16 v0, 0x15

    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xff

    return p1
.end method

.method public final f([B)I
    .locals 1

    const/16 v0, 0x14

    aget-byte p1, p1, v0

    return p1
.end method

.method public final g([B)I
    .locals 1

    const/16 v0, 0x13

    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xff

    return p1
.end method

.method public final h([B)Ljava/lang/String;
    .locals 15

    const/16 v0, 0x10

    new-array v1, v0, [Ljava/lang/Object;

    const/16 v2, 0x12

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v2, 0x11

    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x2

    aput-object v0, v1, v2

    const/16 v0, 0xf

    aget-byte v2, p1, v0

    and-int/lit16 v2, v2, 0xff

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/16 v2, 0xe

    aget-byte v4, p1, v2

    and-int/lit16 v4, v4, 0xff

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x4

    aput-object v4, v1, v5

    const/16 v4, 0xd

    aget-byte v6, p1, v4

    and-int/lit16 v6, v6, 0xff

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x5

    aput-object v6, v1, v7

    const/16 v6, 0xc

    aget-byte v8, p1, v6

    and-int/lit16 v8, v8, 0xff

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x6

    aput-object v8, v1, v9

    const/16 v8, 0xb

    aget-byte v10, p1, v8

    and-int/lit16 v10, v10, 0xff

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v11, 0x7

    aput-object v10, v1, v11

    const/16 v10, 0xa

    aget-byte v12, p1, v10

    and-int/lit16 v12, v12, 0xff

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/16 v13, 0x8

    aput-object v12, v1, v13

    const/16 v12, 0x9

    aget-byte v14, p1, v12

    and-int/lit16 v14, v14, 0xff

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v1, v12

    aget-byte v12, p1, v13

    and-int/lit16 v12, v12, 0xff

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v1, v10

    aget-byte v10, p1, v11

    and-int/lit16 v10, v10, 0xff

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v1, v8

    aget-byte v8, p1, v9

    and-int/lit16 v8, v8, 0xff

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v1, v6

    aget-byte v6, p1, v7

    and-int/lit16 v6, v6, 0xff

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v4

    aget-byte v4, p1, v5

    and-int/lit16 v4, v4, 0xff

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    aget-byte v2, p1, v3

    and-int/lit16 v2, v2, 0xff

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v1, v0

    const-string v0, "%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X%02X"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final i([B)I
    .locals 1

    const/4 v0, 0x2

    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xff

    return p1
.end method

.method public k()I
    .locals 1

    iget v0, p0, Ltd6;->h:I

    and-int/lit8 v0, v0, 0xf

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x2800

    return v0

    :pswitch_0
    const/16 v0, 0x1400

    return v0

    :pswitch_1
    const/16 v0, 0xa00

    return v0

    :pswitch_2
    const/16 v0, 0x500

    return v0

    :pswitch_3
    const/16 v0, 0x280

    return v0

    :pswitch_4
    const/16 v0, 0x140

    return v0

    :pswitch_5
    const/16 v0, 0xa0

    return v0

    :pswitch_6
    const/16 v0, 0x50

    return v0

    :pswitch_7
    const/16 v0, 0x28

    return v0

    :pswitch_8
    const/16 v0, 0x14

    return v0

    :pswitch_9
    const/16 v0, 0xa

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public l()Z
    .locals 1

    iget v0, p0, Ltd6;->h:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final m([B)V
    .locals 2

    if-eqz p1, :cond_0

    array-length v0, p1

    const/16 v1, 0x16

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, Ltd6;->i([B)I

    move-result v0

    iput v0, p0, Ltd6;->f:I

    invoke-virtual {p0, p1}, Ltd6;->h([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltd6;->g:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ltd6;->g([B)I

    move-result v0

    iput v0, p0, Ltd6;->h:I

    invoke-virtual {p0, p1}, Ltd6;->f([B)I

    move-result v0

    iput v0, p0, Ltd6;->i:I

    invoke-virtual {p0, p1}, Ltd6;->e([B)I

    move-result p1

    iput p1, p0, Ltd6;->j:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The byte sequence cannot be parsed as a ucode."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Ltd6;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    iget-object v2, p0, Ltd6;->g:Ljava/lang/String;

    aput-object v2, v0, v1

    iget v1, p0, Ltd6;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-virtual {p0}, Ltd6;->l()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-virtual {p0}, Ltd6;->k()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget v1, p0, Ltd6;->i:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget v1, p0, Ltd6;->j:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "ucode(Version=%d,Ucode=%s,Status=%d,BatteryLow=%s,Interval=%d,Power=%d,Count=%d)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
