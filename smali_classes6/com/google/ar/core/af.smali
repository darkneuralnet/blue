.class final enum Lcom/google/ar/core/af;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lcom/google/ar/core/af;

.field public static final enum b:Lcom/google/ar/core/af;

.field public static final enum c:Lcom/google/ar/core/af;

.field public static final enum d:Lcom/google/ar/core/af;

.field public static final enum e:Lcom/google/ar/core/af;

.field public static final enum f:Lcom/google/ar/core/af;

.field public static final enum g:Lcom/google/ar/core/af;

.field public static final enum h:Lcom/google/ar/core/af;

.field public static final enum i:Lcom/google/ar/core/af;

.field private static final synthetic k:[Lcom/google/ar/core/af;


# instance fields
.field final j:I

.field private final l:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lcom/google/ar/core/af;

    const v1, 0x41520100

    const-class v2, Lcom/google/ar/core/Trackable;

    const-string v3, "BASE_TRACKABLE"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/google/ar/core/af;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v0, Lcom/google/ar/core/af;->a:Lcom/google/ar/core/af;

    new-instance v1, Lcom/google/ar/core/af;

    const/4 v2, -0x1

    const/4 v3, 0x0

    const-string v5, "UNKNOWN_TO_JAVA"

    const/4 v6, 0x1

    invoke-direct {v1, v5, v6, v2, v3}, Lcom/google/ar/core/af;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v1, Lcom/google/ar/core/af;->b:Lcom/google/ar/core/af;

    new-instance v2, Lcom/google/ar/core/af;

    const v3, 0x41520101

    const-class v5, Lcom/google/ar/core/Plane;

    const-string v7, "PLANE"

    const/4 v8, 0x2

    invoke-direct {v2, v7, v8, v3, v5}, Lcom/google/ar/core/af;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v2, Lcom/google/ar/core/af;->c:Lcom/google/ar/core/af;

    new-instance v3, Lcom/google/ar/core/af;

    const v5, 0x41520102

    const-class v7, Lcom/google/ar/core/Point;

    const-string v9, "POINT"

    const/4 v10, 0x3

    invoke-direct {v3, v9, v10, v5, v7}, Lcom/google/ar/core/af;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v3, Lcom/google/ar/core/af;->d:Lcom/google/ar/core/af;

    new-instance v5, Lcom/google/ar/core/af;

    const v7, 0x41520104

    const-class v9, Lcom/google/ar/core/AugmentedImage;

    const-string v11, "AUGMENTED_IMAGE"

    const/4 v12, 0x4

    invoke-direct {v5, v11, v12, v7, v9}, Lcom/google/ar/core/af;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v5, Lcom/google/ar/core/af;->e:Lcom/google/ar/core/af;

    new-instance v7, Lcom/google/ar/core/af;

    const v9, 0x41520105

    const-class v11, Lcom/google/ar/core/AugmentedFace;

    const-string v13, "FACE"

    const/4 v14, 0x5

    invoke-direct {v7, v13, v14, v9, v11}, Lcom/google/ar/core/af;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v7, Lcom/google/ar/core/af;->f:Lcom/google/ar/core/af;

    new-instance v9, Lcom/google/ar/core/af;

    const v11, 0x41520109

    const-class v13, Lcom/google/ar/core/Earth;

    const-string v15, "EARTH"

    const/4 v14, 0x6

    invoke-direct {v9, v15, v14, v11, v13}, Lcom/google/ar/core/af;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v9, Lcom/google/ar/core/af;->g:Lcom/google/ar/core/af;

    new-instance v11, Lcom/google/ar/core/af;

    const v13, 0x41520111

    const-class v15, Lcom/google/ar/core/DepthPoint;

    const-string v14, "DEPTH_POINT"

    const/4 v12, 0x7

    invoke-direct {v11, v14, v12, v13, v15}, Lcom/google/ar/core/af;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v11, Lcom/google/ar/core/af;->h:Lcom/google/ar/core/af;

    new-instance v13, Lcom/google/ar/core/af;

    const v14, 0x41520112

    const-class v15, Lcom/google/ar/core/InstantPlacementPoint;

    const-string v12, "INSTANT_PLACEMENT_POINT"

    const/16 v10, 0x8

    invoke-direct {v13, v12, v10, v14, v15}, Lcom/google/ar/core/af;-><init>(Ljava/lang/String;IILjava/lang/Class;)V

    sput-object v13, Lcom/google/ar/core/af;->i:Lcom/google/ar/core/af;

    const/16 v12, 0x9

    new-array v12, v12, [Lcom/google/ar/core/af;

    aput-object v0, v12, v4

    aput-object v1, v12, v6

    aput-object v2, v12, v8

    const/4 v0, 0x3

    aput-object v3, v12, v0

    const/4 v0, 0x4

    aput-object v5, v12, v0

    const/4 v0, 0x5

    aput-object v7, v12, v0

    const/4 v0, 0x6

    aput-object v9, v12, v0

    const/4 v0, 0x7

    aput-object v11, v12, v0

    aput-object v13, v12, v10

    sput-object v12, Lcom/google/ar/core/af;->k:[Lcom/google/ar/core/af;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/ar/core/af;->j:I

    iput-object p4, p0, Lcom/google/ar/core/af;->l:Ljava/lang/Class;

    return-void
.end method

.method public static a(Ljava/lang/Class;)Lcom/google/ar/core/af;
    .locals 5

    invoke-static {}, Lcom/google/ar/core/af;->values()[Lcom/google/ar/core/af;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    iget-object v4, v3, Lcom/google/ar/core/af;->l:Ljava/lang/Class;

    if-eqz v4, :cond_1

    invoke-virtual {v4, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    return-object v3

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    sget-object p0, Lcom/google/ar/core/af;->b:Lcom/google/ar/core/af;

    return-object p0
.end method

.method public static values()[Lcom/google/ar/core/af;
    .locals 1

    sget-object v0, Lcom/google/ar/core/af;->k:[Lcom/google/ar/core/af;

    invoke-virtual {v0}, [Lcom/google/ar/core/af;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/ar/core/af;

    return-object v0
.end method
