.class public final enum LEB;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LEB;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LEB;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final enum c:LEB;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final enum d:LEB;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final enum e:LEB;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end field

.field public static final enum f:LEB;

.field public static final enum g:LEB;

.field public static final synthetic h:[LEB;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    new-instance v0, LEB;

    const-string v1, "FACE_DETECTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LEB;-><init>(Ljava/lang/String;I)V

    sput-object v0, LEB;->f:LEB;

    new-instance v1, LEB;

    const-string v3, "SMART_REPLY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LEB;-><init>(Ljava/lang/String;I)V

    sput-object v1, LEB;->g:LEB;

    new-instance v3, LEB;

    const-string v5, "TRANSLATE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LEB;-><init>(Ljava/lang/String;I)V

    sput-object v3, LEB;->b:LEB;

    new-instance v5, LEB;

    const-string v7, "ENTITY_EXTRACTION"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, LEB;-><init>(Ljava/lang/String;I)V

    sput-object v5, LEB;->c:LEB;

    new-instance v7, LEB;

    const-string v9, "TOXICITY_DETECTION"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, LEB;-><init>(Ljava/lang/String;I)V

    sput-object v7, LEB;->d:LEB;

    new-instance v9, LEB;

    const-string v11, "IMAGE_CAPTIONING"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, LEB;-><init>(Ljava/lang/String;I)V

    sput-object v9, LEB;->e:LEB;

    const/4 v11, 0x6

    new-array v11, v11, [LEB;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, LEB;->h:[LEB;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[LEB;
    .locals 1

    sget-object v0, LEB;->h:[LEB;

    invoke-virtual {v0}, [LEB;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LEB;

    return-object v0
.end method
