.class public final enum LQS8;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LqP7;


# static fields
.field public static final enum c:LQS8;

.field public static final enum d:LQS8;

.field public static final enum e:LQS8;

.field public static final enum f:LQS8;

.field public static final enum g:LQS8;

.field public static final enum h:LQS8;

.field public static final enum i:LQS8;

.field public static final enum j:LQS8;

.field public static final enum k:LQS8;

.field public static final enum l:LQS8;

.field public static final synthetic m:[LQS8;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LQS8;

    const-string v1, "UNKNOWN_FORMAT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LQS8;-><init>(Ljava/lang/String;II)V

    sput-object v0, LQS8;->c:LQS8;

    new-instance v1, LQS8;

    const-string v3, "NV16"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LQS8;-><init>(Ljava/lang/String;II)V

    sput-object v1, LQS8;->d:LQS8;

    new-instance v3, LQS8;

    const-string v5, "NV21"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LQS8;-><init>(Ljava/lang/String;II)V

    sput-object v3, LQS8;->e:LQS8;

    new-instance v5, LQS8;

    const-string v7, "YV12"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, LQS8;-><init>(Ljava/lang/String;II)V

    sput-object v5, LQS8;->f:LQS8;

    new-instance v7, LQS8;

    const-string v9, "YUV_420_888"

    const/4 v10, 0x4

    const/4 v11, 0x7

    invoke-direct {v7, v9, v10, v11}, LQS8;-><init>(Ljava/lang/String;II)V

    sput-object v7, LQS8;->g:LQS8;

    new-instance v9, LQS8;

    const-string v12, "JPEG"

    const/4 v13, 0x5

    const/16 v14, 0x8

    invoke-direct {v9, v12, v13, v14}, LQS8;-><init>(Ljava/lang/String;II)V

    sput-object v9, LQS8;->h:LQS8;

    new-instance v12, LQS8;

    const-string v15, "BITMAP"

    const/4 v8, 0x6

    invoke-direct {v12, v15, v8, v10}, LQS8;-><init>(Ljava/lang/String;II)V

    sput-object v12, LQS8;->i:LQS8;

    new-instance v15, LQS8;

    const-string v10, "CM_SAMPLE_BUFFER_REF"

    invoke-direct {v15, v10, v11, v13}, LQS8;-><init>(Ljava/lang/String;II)V

    sput-object v15, LQS8;->j:LQS8;

    new-instance v10, LQS8;

    const-string v11, "UI_IMAGE"

    invoke-direct {v10, v11, v14, v8}, LQS8;-><init>(Ljava/lang/String;II)V

    sput-object v10, LQS8;->k:LQS8;

    new-instance v11, LQS8;

    const-string v14, "CV_PIXEL_BUFFER_REF"

    const/16 v8, 0x9

    invoke-direct {v11, v14, v8, v8}, LQS8;-><init>(Ljava/lang/String;II)V

    sput-object v11, LQS8;->l:LQS8;

    const/16 v14, 0xa

    new-array v14, v14, [LQS8;

    aput-object v0, v14, v2

    aput-object v1, v14, v4

    aput-object v3, v14, v6

    const/4 v0, 0x3

    aput-object v5, v14, v0

    const/4 v0, 0x4

    aput-object v7, v14, v0

    aput-object v9, v14, v13

    const/4 v0, 0x6

    aput-object v12, v14, v0

    const/4 v0, 0x7

    aput-object v15, v14, v0

    const/16 v0, 0x8

    aput-object v10, v14, v0

    aput-object v11, v14, v8

    sput-object v14, LQS8;->m:[LQS8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LQS8;->b:I

    return-void
.end method

.method public static values()[LQS8;
    .locals 1

    sget-object v0, LQS8;->m:[LQS8;

    invoke-virtual {v0}, [LQS8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LQS8;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, LQS8;->b:I

    return v0
.end method
