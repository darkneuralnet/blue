.class public final enum Leb1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Leb1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Leb1;

.field public static final enum c:Leb1;

.field public static final enum d:Leb1;

.field public static final enum e:Leb1;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum f:Leb1;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum g:Leb1;

.field public static final enum h:Leb1;

.field public static final enum i:Leb1;

.field public static final enum j:Leb1;

.field public static final enum k:Leb1;

.field public static final enum l:Leb1;

.field public static final enum m:Leb1;

.field public static final synthetic n:[Leb1;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Leb1;

    const-string v1, "ERROR_CORRECTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Leb1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leb1;->b:Leb1;

    new-instance v1, Leb1;

    const-string v3, "CHARACTER_SET"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Leb1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Leb1;->c:Leb1;

    new-instance v3, Leb1;

    const-string v5, "DATA_MATRIX_SHAPE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Leb1;-><init>(Ljava/lang/String;I)V

    sput-object v3, Leb1;->d:Leb1;

    new-instance v5, Leb1;

    const-string v7, "MIN_SIZE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Leb1;-><init>(Ljava/lang/String;I)V

    sput-object v5, Leb1;->e:Leb1;

    new-instance v7, Leb1;

    const-string v9, "MAX_SIZE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Leb1;-><init>(Ljava/lang/String;I)V

    sput-object v7, Leb1;->f:Leb1;

    new-instance v9, Leb1;

    const-string v11, "MARGIN"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Leb1;-><init>(Ljava/lang/String;I)V

    sput-object v9, Leb1;->g:Leb1;

    new-instance v11, Leb1;

    const-string v13, "PDF417_COMPACT"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Leb1;-><init>(Ljava/lang/String;I)V

    sput-object v11, Leb1;->h:Leb1;

    new-instance v13, Leb1;

    const-string v15, "PDF417_COMPACTION"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Leb1;-><init>(Ljava/lang/String;I)V

    sput-object v13, Leb1;->i:Leb1;

    new-instance v15, Leb1;

    const-string v14, "PDF417_DIMENSIONS"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Leb1;-><init>(Ljava/lang/String;I)V

    sput-object v15, Leb1;->j:Leb1;

    new-instance v14, Leb1;

    const-string v12, "AZTEC_LAYERS"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Leb1;-><init>(Ljava/lang/String;I)V

    sput-object v14, Leb1;->k:Leb1;

    new-instance v12, Leb1;

    const-string v10, "QR_VERSION"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8}, Leb1;-><init>(Ljava/lang/String;I)V

    sput-object v12, Leb1;->l:Leb1;

    new-instance v10, Leb1;

    const-string v8, "GS1_FORMAT"

    const/16 v6, 0xb

    invoke-direct {v10, v8, v6}, Leb1;-><init>(Ljava/lang/String;I)V

    sput-object v10, Leb1;->m:Leb1;

    const/16 v8, 0xc

    new-array v8, v8, [Leb1;

    aput-object v0, v8, v2

    aput-object v1, v8, v4

    const/4 v0, 0x2

    aput-object v3, v8, v0

    const/4 v0, 0x3

    aput-object v5, v8, v0

    const/4 v0, 0x4

    aput-object v7, v8, v0

    const/4 v0, 0x5

    aput-object v9, v8, v0

    const/4 v0, 0x6

    aput-object v11, v8, v0

    const/4 v0, 0x7

    aput-object v13, v8, v0

    const/16 v0, 0x8

    aput-object v15, v8, v0

    const/16 v0, 0x9

    aput-object v14, v8, v0

    const/16 v0, 0xa

    aput-object v12, v8, v0

    aput-object v10, v8, v6

    sput-object v8, Leb1;->n:[Leb1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Leb1;
    .locals 1

    const-class v0, Leb1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leb1;

    return-object p0
.end method

.method public static values()[Leb1;
    .locals 1

    sget-object v0, Leb1;->n:[Leb1;

    invoke-virtual {v0}, [Leb1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leb1;

    return-object v0
.end method
