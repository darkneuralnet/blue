.class public LF74;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B

.field public static final b:[B

.field public static final c:[B

.field public static final d:[B

.field public static final e:[B

.field public static final f:[B

.field public static final g:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, LF74;->a:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_1

    sput-object v1, LF74;->b:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_2

    sput-object v1, LF74;->c:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_3

    sput-object v1, LF74;->d:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_4

    sput-object v1, LF74;->e:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_5

    sput-object v1, LF74;->f:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_6

    sput-object v0, LF74;->g:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x30t
        0x31t
        0x35t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x30t
        0x31t
        0x30t
        0x0t
    .end array-data

    :array_2
    .array-data 1
        0x30t
        0x30t
        0x39t
        0x0t
    .end array-data

    :array_3
    .array-data 1
        0x30t
        0x30t
        0x35t
        0x0t
    .end array-data

    :array_4
    .array-data 1
        0x30t
        0x30t
        0x31t
        0x0t
    .end array-data

    :array_5
    .array-data 1
        0x30t
        0x30t
        0x31t
        0x0t
    .end array-data

    :array_6
    .array-data 1
        0x30t
        0x30t
        0x32t
        0x0t
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)Ljava/lang/String;
    .locals 2

    sget-object v0, LF74;->e:[B

    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    const-string v1, ":"

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, LF74;->d:[B

    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    if-eqz p0, :cond_1

    return-object v1

    :cond_1
    const-string p0, "!"

    return-object p0
.end method
