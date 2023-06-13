.class public final enum Laz9;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LZ19;


# static fields
.field public static final enum c:Laz9;

.field public static final enum d:Laz9;

.field public static final enum e:Laz9;

.field public static final enum f:Laz9;

.field public static final enum g:Laz9;

.field public static final enum h:Laz9;

.field public static final enum i:Laz9;

.field public static final synthetic j:[Laz9;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    new-instance v0, Laz9;

    const-string v1, "DELEGATE_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Laz9;-><init>(Ljava/lang/String;II)V

    sput-object v0, Laz9;->c:Laz9;

    new-instance v1, Laz9;

    const-string v3, "NNAPI"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Laz9;-><init>(Ljava/lang/String;II)V

    sput-object v1, Laz9;->d:Laz9;

    new-instance v3, Laz9;

    const-string v5, "GPU"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Laz9;-><init>(Ljava/lang/String;II)V

    sput-object v3, Laz9;->e:Laz9;

    new-instance v5, Laz9;

    const-string v7, "HEXAGON"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Laz9;-><init>(Ljava/lang/String;II)V

    sput-object v5, Laz9;->f:Laz9;

    new-instance v7, Laz9;

    const-string v9, "EDGETPU"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Laz9;-><init>(Ljava/lang/String;II)V

    sput-object v7, Laz9;->g:Laz9;

    new-instance v9, Laz9;

    const-string v11, "EDGETPU_CORAL"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Laz9;-><init>(Ljava/lang/String;II)V

    sput-object v9, Laz9;->h:Laz9;

    new-instance v11, Laz9;

    const-string v13, "XNNPACK"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, Laz9;-><init>(Ljava/lang/String;II)V

    sput-object v11, Laz9;->i:Laz9;

    const/4 v13, 0x7

    new-array v13, v13, [Laz9;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Laz9;->j:[Laz9;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Laz9;->b:I

    return-void
.end method

.method public static values()[Laz9;
    .locals 1

    sget-object v0, Laz9;->j:[Laz9;

    invoke-virtual {v0}, [Laz9;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laz9;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Laz9;->b:I

    return v0
.end method
