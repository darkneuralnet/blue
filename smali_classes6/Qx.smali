.class public final enum LQx;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LQx;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LQx;

.field public static final enum c:LQx;

.field public static final enum d:LQx;

.field public static final enum e:LQx;

.field public static final enum f:LQx;

.field public static final enum g:LQx;

.field public static final enum h:LQx;

.field public static final enum i:LQx;

.field public static final enum j:LQx;

.field public static final enum k:LQx;

.field public static final enum l:LQx;

.field public static final enum m:LQx;

.field public static final enum n:LQx;

.field public static final enum o:LQx;

.field public static final enum p:LQx;

.field public static final enum q:LQx;

.field public static final enum r:LQx;

.field public static final synthetic s:[LQx;


# direct methods
.method public static constructor <clinit>()V
    .locals 20

    new-instance v0, LQx;

    const-string v1, "AZTEC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v0, LQx;->b:LQx;

    new-instance v1, LQx;

    const-string v3, "CODABAR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v1, LQx;->c:LQx;

    new-instance v3, LQx;

    const-string v5, "CODE_39"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v3, LQx;->d:LQx;

    new-instance v5, LQx;

    const-string v7, "CODE_93"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v5, LQx;->e:LQx;

    new-instance v7, LQx;

    const-string v9, "CODE_128"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v7, LQx;->f:LQx;

    new-instance v9, LQx;

    const-string v11, "DATA_MATRIX"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v9, LQx;->g:LQx;

    new-instance v11, LQx;

    const-string v13, "EAN_8"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v11, LQx;->h:LQx;

    new-instance v13, LQx;

    const-string v15, "EAN_13"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v13, LQx;->i:LQx;

    new-instance v15, LQx;

    const-string v14, "ITF"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v15, LQx;->j:LQx;

    new-instance v14, LQx;

    const-string v12, "MAXICODE"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v14, LQx;->k:LQx;

    new-instance v12, LQx;

    const-string v10, "PDF_417"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v12, LQx;->l:LQx;

    new-instance v10, LQx;

    const-string v8, "QR_CODE"

    const/16 v6, 0xb

    invoke-direct {v10, v8, v6}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v10, LQx;->m:LQx;

    new-instance v8, LQx;

    const-string v6, "RSS_14"

    const/16 v4, 0xc

    invoke-direct {v8, v6, v4}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v8, LQx;->n:LQx;

    new-instance v6, LQx;

    const-string v4, "RSS_EXPANDED"

    const/16 v2, 0xd

    invoke-direct {v6, v4, v2}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v6, LQx;->o:LQx;

    new-instance v4, LQx;

    const-string v2, "UPC_A"

    move-object/from16 v17, v6

    const/16 v6, 0xe

    invoke-direct {v4, v2, v6}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v4, LQx;->p:LQx;

    new-instance v2, LQx;

    const-string v6, "UPC_E"

    move-object/from16 v18, v4

    const/16 v4, 0xf

    invoke-direct {v2, v6, v4}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v2, LQx;->q:LQx;

    new-instance v6, LQx;

    const-string v4, "UPC_EAN_EXTENSION"

    move-object/from16 v19, v2

    const/16 v2, 0x10

    invoke-direct {v6, v4, v2}, LQx;-><init>(Ljava/lang/String;I)V

    sput-object v6, LQx;->r:LQx;

    const/16 v4, 0x11

    new-array v4, v4, [LQx;

    const/16 v16, 0x0

    aput-object v0, v4, v16

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v3, v4, v0

    const/4 v0, 0x3

    aput-object v5, v4, v0

    const/4 v0, 0x4

    aput-object v7, v4, v0

    const/4 v0, 0x5

    aput-object v9, v4, v0

    const/4 v0, 0x6

    aput-object v11, v4, v0

    const/4 v0, 0x7

    aput-object v13, v4, v0

    const/16 v0, 0x8

    aput-object v15, v4, v0

    const/16 v0, 0x9

    aput-object v14, v4, v0

    const/16 v0, 0xa

    aput-object v12, v4, v0

    const/16 v0, 0xb

    aput-object v10, v4, v0

    const/16 v0, 0xc

    aput-object v8, v4, v0

    const/16 v0, 0xd

    aput-object v17, v4, v0

    const/16 v0, 0xe

    aput-object v18, v4, v0

    const/16 v0, 0xf

    aput-object v19, v4, v0

    aput-object v6, v4, v2

    sput-object v4, LQx;->s:[LQx;

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

.method public static valueOf(Ljava/lang/String;)LQx;
    .locals 1

    const-class v0, LQx;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LQx;

    return-object p0
.end method

.method public static values()[LQx;
    .locals 1

    sget-object v0, LQx;->s:[LQx;

    invoke-virtual {v0}, [LQx;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LQx;

    return-object v0
.end method
