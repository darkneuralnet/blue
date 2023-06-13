.class public LSS5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "InlinedApi"
    }
.end annotation


# static fields
.field public static final a:[I

.field public static final b:[I

.field public static final c:[I

.field public static final d:[I

.field public static final e:[I

.field public static final f:[I

.field public static final g:[I

.field public static final h:[I

.field public static final i:[I

.field public static final j:[I

.field public static final k:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, LSS5;->a:[I

    const/4 v0, 0x3

    new-array v1, v0, [I

    fill-array-data v1, :array_1

    sput-object v1, LSS5;->b:[I

    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_2

    sput-object v1, LSS5;->c:[I

    const/4 v1, 0x1

    new-array v2, v1, [I

    const v3, 0x10104cf

    const/4 v4, 0x0

    aput v3, v2, v4

    sput-object v2, LSS5;->d:[I

    new-array v2, v1, [I

    const v3, 0x101047c

    aput v3, v2, v4

    sput-object v2, LSS5;->e:[I

    new-array v2, v1, [I

    const v3, 0x10103e1

    aput v3, v2, v4

    sput-object v2, LSS5;->f:[I

    const/4 v2, 0x2

    new-array v2, v2, [I

    fill-array-data v2, :array_3

    sput-object v2, LSS5;->g:[I

    new-array v2, v1, [I

    const v3, 0x1010430

    aput v3, v2, v4

    sput-object v2, LSS5;->h:[I

    new-array v2, v1, [I

    const v3, 0x10103e0

    aput v3, v2, v4

    sput-object v2, LSS5;->i:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_4

    sput-object v0, LSS5;->j:[I

    new-array v0, v1, [I

    const v1, 0x10104ca

    aput v1, v0, v4

    sput-object v0, LSS5;->k:[I

    return-void

    :array_0
    .array-data 4
        0x101002f
        0x10103dc
        0x1010441
        0x1010442
        0x101044d
        0x101044e
    .end array-data

    :array_1
    .array-data 4
        0x10103dd
        0x10103de
        0x10103df
    .end array-data

    :array_2
    .array-data 4
        0x1010141
        0x1010198
        0x10103e2
        0x101044f
    .end array-data

    :array_3
    .array-data 4
        0x10104bc
        0x10104bd
    .end array-data

    :array_4
    .array-data 4
        0x101047d
        0x101047e
        0x101047f
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
