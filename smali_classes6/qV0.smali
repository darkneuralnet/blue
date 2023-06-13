.class public final enum LqV0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LqV0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:LqV0;

.field public static final enum d:LqV0;

.field public static final enum e:LqV0;

.field public static final enum f:LqV0;

.field public static final enum g:LqV0;

.field public static final enum h:LqV0;

.field public static final enum i:LqV0;

.field public static final enum j:LqV0;

.field public static final enum k:LqV0;

.field public static final enum l:LqV0;

.field public static final enum m:LqV0;

.field public static final synthetic n:[LqV0;


# instance fields
.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LqV0;

    const-class v1, Ljava/lang/Object;

    const-string v2, "OTHER"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LqV0;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, LqV0;->c:LqV0;

    new-instance v1, LqV0;

    const-string v2, "PURE_BARCODE"

    const/4 v4, 0x1

    const-class v5, Ljava/lang/Void;

    invoke-direct {v1, v2, v4, v5}, LqV0;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, LqV0;->d:LqV0;

    new-instance v2, LqV0;

    const-class v6, Ljava/util/List;

    const-string v7, "POSSIBLE_FORMATS"

    const/4 v8, 0x2

    invoke-direct {v2, v7, v8, v6}, LqV0;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v2, LqV0;->e:LqV0;

    new-instance v6, LqV0;

    const-string v7, "TRY_HARDER"

    const/4 v9, 0x3

    invoke-direct {v6, v7, v9, v5}, LqV0;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v6, LqV0;->f:LqV0;

    new-instance v7, LqV0;

    const-class v10, Ljava/lang/String;

    const-string v11, "CHARACTER_SET"

    const/4 v12, 0x4

    invoke-direct {v7, v11, v12, v10}, LqV0;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v7, LqV0;->g:LqV0;

    new-instance v10, LqV0;

    const-string v11, "ALLOWED_LENGTHS"

    const/4 v13, 0x5

    const-class v14, [I

    invoke-direct {v10, v11, v13, v14}, LqV0;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v10, LqV0;->h:LqV0;

    new-instance v11, LqV0;

    const-string v15, "ASSUME_CODE_39_CHECK_DIGIT"

    const/4 v13, 0x6

    invoke-direct {v11, v15, v13, v5}, LqV0;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v11, LqV0;->i:LqV0;

    new-instance v15, LqV0;

    const-string v13, "ASSUME_GS1"

    const/4 v12, 0x7

    invoke-direct {v15, v13, v12, v5}, LqV0;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v15, LqV0;->j:LqV0;

    new-instance v13, LqV0;

    const-string v12, "RETURN_CODABAR_START_END"

    const/16 v9, 0x8

    invoke-direct {v13, v12, v9, v5}, LqV0;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v13, LqV0;->k:LqV0;

    new-instance v5, LqV0;

    const-class v12, LgN4;

    const-string v9, "NEED_RESULT_POINT_CALLBACK"

    const/16 v8, 0x9

    invoke-direct {v5, v9, v8, v12}, LqV0;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v5, LqV0;->l:LqV0;

    new-instance v9, LqV0;

    const-string v12, "ALLOWED_EAN_EXTENSIONS"

    const/16 v8, 0xa

    invoke-direct {v9, v12, v8, v14}, LqV0;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v9, LqV0;->m:LqV0;

    const/16 v12, 0xb

    new-array v12, v12, [LqV0;

    aput-object v0, v12, v3

    aput-object v1, v12, v4

    const/4 v0, 0x2

    aput-object v2, v12, v0

    const/4 v0, 0x3

    aput-object v6, v12, v0

    const/4 v0, 0x4

    aput-object v7, v12, v0

    const/4 v0, 0x5

    aput-object v10, v12, v0

    const/4 v0, 0x6

    aput-object v11, v12, v0

    const/4 v0, 0x7

    aput-object v15, v12, v0

    const/16 v0, 0x8

    aput-object v13, v12, v0

    const/16 v0, 0x9

    aput-object v5, v12, v0

    aput-object v9, v12, v8

    sput-object v12, LqV0;->n:[LqV0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LqV0;->b:Ljava/lang/Class;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LqV0;
    .locals 1

    const-class v0, LqV0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LqV0;

    return-object p0
.end method

.method public static values()[LqV0;
    .locals 1

    sget-object v0, LqV0;->n:[LqV0;

    invoke-virtual {v0}, [LqV0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LqV0;

    return-object v0
.end method
