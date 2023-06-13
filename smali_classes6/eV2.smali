.class public final enum LeV2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LeV2;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LeV2;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final enum c:LeV2;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final enum d:LeV2;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final enum e:LeV2;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final enum f:LeV2;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final enum g:LeV2;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final enum h:LeV2;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final enum i:LeV2;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final enum j:LeV2;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final synthetic k:[LeV2;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LeV2;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LeV2;-><init>(Ljava/lang/String;I)V

    sput-object v0, LeV2;->b:LeV2;

    new-instance v1, LeV2;

    const-string v3, "BASE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LeV2;-><init>(Ljava/lang/String;I)V

    sput-object v1, LeV2;->c:LeV2;

    new-instance v3, LeV2;

    const-string v5, "TRANSLATE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LeV2;-><init>(Ljava/lang/String;I)V

    sput-object v3, LeV2;->d:LeV2;

    new-instance v5, LeV2;

    const-string v7, "ENTITY_EXTRACTION"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, LeV2;-><init>(Ljava/lang/String;I)V

    sput-object v5, LeV2;->e:LeV2;

    new-instance v7, LeV2;

    const-string v9, "CUSTOM"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, LeV2;-><init>(Ljava/lang/String;I)V

    sput-object v7, LeV2;->f:LeV2;

    new-instance v9, LeV2;

    const-string v11, "DIGITAL_INK"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, LeV2;-><init>(Ljava/lang/String;I)V

    sput-object v9, LeV2;->g:LeV2;

    new-instance v11, LeV2;

    const-string v13, "DIGITAL_INK_SEGMENTATION"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, LeV2;-><init>(Ljava/lang/String;I)V

    sput-object v11, LeV2;->h:LeV2;

    new-instance v13, LeV2;

    const-string v15, "TOXICITY_DETECTION"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, LeV2;-><init>(Ljava/lang/String;I)V

    sput-object v13, LeV2;->i:LeV2;

    new-instance v15, LeV2;

    const-string v14, "IMAGE_CAPTIONING"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, LeV2;-><init>(Ljava/lang/String;I)V

    sput-object v15, LeV2;->j:LeV2;

    const/16 v14, 0x9

    new-array v14, v14, [LeV2;

    aput-object v0, v14, v2

    aput-object v1, v14, v4

    aput-object v3, v14, v6

    aput-object v5, v14, v8

    aput-object v7, v14, v10

    const/4 v0, 0x5

    aput-object v9, v14, v0

    const/4 v0, 0x6

    aput-object v11, v14, v0

    const/4 v0, 0x7

    aput-object v13, v14, v0

    aput-object v15, v14, v12

    sput-object v14, LeV2;->k:[LeV2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[LeV2;
    .locals 1

    sget-object v0, LeV2;->k:[LeV2;

    invoke-virtual {v0}, [LeV2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LeV2;

    return-object v0
.end method
