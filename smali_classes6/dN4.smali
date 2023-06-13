.class public final enum LdN4;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LdN4;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:LdN4;

.field public static final enum c:LdN4;

.field public static final enum d:LdN4;

.field public static final enum e:LdN4;

.field public static final enum f:LdN4;

.field public static final enum g:LdN4;

.field public static final enum h:LdN4;

.field public static final enum i:LdN4;

.field public static final enum j:LdN4;

.field public static final enum k:LdN4;

.field public static final enum l:LdN4;

.field public static final synthetic m:[LdN4;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LdN4;

    const-string v1, "OTHER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LdN4;-><init>(Ljava/lang/String;I)V

    sput-object v0, LdN4;->b:LdN4;

    new-instance v1, LdN4;

    const-string v3, "ORIENTATION"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, LdN4;-><init>(Ljava/lang/String;I)V

    sput-object v1, LdN4;->c:LdN4;

    new-instance v3, LdN4;

    const-string v5, "BYTE_SEGMENTS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, LdN4;-><init>(Ljava/lang/String;I)V

    sput-object v3, LdN4;->d:LdN4;

    new-instance v5, LdN4;

    const-string v7, "ERROR_CORRECTION_LEVEL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, LdN4;-><init>(Ljava/lang/String;I)V

    sput-object v5, LdN4;->e:LdN4;

    new-instance v7, LdN4;

    const-string v9, "ISSUE_NUMBER"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, LdN4;-><init>(Ljava/lang/String;I)V

    sput-object v7, LdN4;->f:LdN4;

    new-instance v9, LdN4;

    const-string v11, "SUGGESTED_PRICE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, LdN4;-><init>(Ljava/lang/String;I)V

    sput-object v9, LdN4;->g:LdN4;

    new-instance v11, LdN4;

    const-string v13, "POSSIBLE_COUNTRY"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, LdN4;-><init>(Ljava/lang/String;I)V

    sput-object v11, LdN4;->h:LdN4;

    new-instance v13, LdN4;

    const-string v15, "UPC_EAN_EXTENSION"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, LdN4;-><init>(Ljava/lang/String;I)V

    sput-object v13, LdN4;->i:LdN4;

    new-instance v15, LdN4;

    const-string v14, "PDF417_EXTRA_METADATA"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, LdN4;-><init>(Ljava/lang/String;I)V

    sput-object v15, LdN4;->j:LdN4;

    new-instance v14, LdN4;

    const-string v12, "STRUCTURED_APPEND_SEQUENCE"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, LdN4;-><init>(Ljava/lang/String;I)V

    sput-object v14, LdN4;->k:LdN4;

    new-instance v12, LdN4;

    const-string v10, "STRUCTURED_APPEND_PARITY"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8}, LdN4;-><init>(Ljava/lang/String;I)V

    sput-object v12, LdN4;->l:LdN4;

    const/16 v10, 0xb

    new-array v10, v10, [LdN4;

    aput-object v0, v10, v2

    aput-object v1, v10, v4

    aput-object v3, v10, v6

    const/4 v0, 0x3

    aput-object v5, v10, v0

    const/4 v0, 0x4

    aput-object v7, v10, v0

    const/4 v0, 0x5

    aput-object v9, v10, v0

    const/4 v0, 0x6

    aput-object v11, v10, v0

    const/4 v0, 0x7

    aput-object v13, v10, v0

    const/16 v0, 0x8

    aput-object v15, v10, v0

    const/16 v0, 0x9

    aput-object v14, v10, v0

    aput-object v12, v10, v8

    sput-object v10, LdN4;->m:[LdN4;

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

.method public static valueOf(Ljava/lang/String;)LdN4;
    .locals 1

    const-class v0, LdN4;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LdN4;

    return-object p0
.end method

.method public static values()[LdN4;
    .locals 1

    sget-object v0, LdN4;->m:[LdN4;

    invoke-virtual {v0}, [LdN4;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LdN4;

    return-object v0
.end method
