.class public final enum LRc7;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum d:LRc7;

.field public static final enum e:LRc7;

.field public static final enum f:LRc7;

.field public static final enum g:LRc7;

.field public static final enum h:LRc7;

.field public static final enum i:LRc7;

.field public static final enum j:LRc7;

.field public static final enum k:LRc7;

.field public static final enum l:LRc7;

.field public static final enum m:LRc7;

.field public static final enum n:LRc7;

.field public static final enum o:LRc7;

.field public static final enum p:LRc7;

.field public static final enum q:LRc7;

.field public static final enum r:LRc7;

.field public static final enum s:LRc7;

.field public static final enum t:LRc7;

.field public static final enum u:LRc7;

.field public static final synthetic v:[LRc7;


# instance fields
.field public final b:LSc7;

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 22

    new-instance v0, LRc7;

    sget-object v1, LSc7;->f:LSc7;

    const-string v2, "DOUBLE"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v1, v4}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v0, LRc7;->d:LRc7;

    new-instance v1, LRc7;

    sget-object v2, LSc7;->e:LSc7;

    const-string v5, "FLOAT"

    const/4 v6, 0x5

    invoke-direct {v1, v5, v4, v2, v6}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v1, LRc7;->e:LRc7;

    new-instance v2, LRc7;

    sget-object v5, LSc7;->d:LSc7;

    const-string v7, "INT64"

    const/4 v8, 0x2

    invoke-direct {v2, v7, v8, v5, v3}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v2, LRc7;->f:LRc7;

    new-instance v7, LRc7;

    const-string v9, "UINT64"

    const/4 v10, 0x3

    invoke-direct {v7, v9, v10, v5, v3}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v7, LRc7;->g:LRc7;

    new-instance v9, LRc7;

    sget-object v11, LSc7;->c:LSc7;

    const-string v12, "INT32"

    const/4 v13, 0x4

    invoke-direct {v9, v12, v13, v11, v3}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v9, LRc7;->h:LRc7;

    new-instance v12, LRc7;

    const-string v14, "FIXED64"

    invoke-direct {v12, v14, v6, v5, v4}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v12, LRc7;->i:LRc7;

    new-instance v14, LRc7;

    const-string v15, "FIXED32"

    const/4 v13, 0x6

    invoke-direct {v14, v15, v13, v11, v6}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v14, LRc7;->j:LRc7;

    new-instance v15, LRc7;

    sget-object v13, LSc7;->g:LSc7;

    const-string v4, "BOOL"

    const/4 v6, 0x7

    invoke-direct {v15, v4, v6, v13, v3}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v15, LRc7;->k:LRc7;

    new-instance v4, LRc7;

    sget-object v13, LSc7;->h:LSc7;

    const-string v6, "STRING"

    const/16 v3, 0x8

    invoke-direct {v4, v6, v3, v13, v8}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v4, LRc7;->l:LRc7;

    new-instance v6, LRc7;

    sget-object v13, LSc7;->k:LSc7;

    const-string v3, "GROUP"

    const/16 v8, 0x9

    invoke-direct {v6, v3, v8, v13, v10}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v6, LRc7;->m:LRc7;

    new-instance v3, LRc7;

    const-string v8, "MESSAGE"

    const/16 v10, 0xa

    move-object/from16 v16, v6

    const/4 v6, 0x2

    invoke-direct {v3, v8, v10, v13, v6}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v3, LRc7;->n:LRc7;

    new-instance v8, LRc7;

    sget-object v13, LSc7;->i:LSc7;

    const-string v10, "BYTES"

    move-object/from16 v17, v3

    const/16 v3, 0xb

    invoke-direct {v8, v10, v3, v13, v6}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v8, LRc7;->o:LRc7;

    new-instance v6, LRc7;

    const-string v10, "UINT32"

    const/16 v13, 0xc

    const/4 v3, 0x0

    invoke-direct {v6, v10, v13, v11, v3}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v6, LRc7;->p:LRc7;

    new-instance v10, LRc7;

    sget-object v13, LSc7;->j:LSc7;

    move-object/from16 v18, v6

    const-string v6, "ENUM"

    move-object/from16 v19, v8

    const/16 v8, 0xd

    invoke-direct {v10, v6, v8, v13, v3}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v10, LRc7;->q:LRc7;

    new-instance v3, LRc7;

    const-string v6, "SFIXED32"

    const/16 v13, 0xe

    const/4 v8, 0x5

    invoke-direct {v3, v6, v13, v11, v8}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v3, LRc7;->r:LRc7;

    new-instance v6, LRc7;

    const-string v8, "SFIXED64"

    const/16 v13, 0xf

    move-object/from16 v20, v3

    const/4 v3, 0x1

    invoke-direct {v6, v8, v13, v5, v3}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v6, LRc7;->s:LRc7;

    new-instance v3, LRc7;

    const-string v8, "SINT32"

    const/16 v13, 0x10

    move-object/from16 v21, v6

    const/4 v6, 0x0

    invoke-direct {v3, v8, v13, v11, v6}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v3, LRc7;->t:LRc7;

    new-instance v8, LRc7;

    const-string v11, "SINT64"

    const/16 v13, 0x11

    invoke-direct {v8, v11, v13, v5, v6}, LRc7;-><init>(Ljava/lang/String;ILSc7;I)V

    sput-object v8, LRc7;->u:LRc7;

    const/16 v5, 0x12

    new-array v5, v5, [LRc7;

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v7, v5, v0

    const/4 v0, 0x4

    aput-object v9, v5, v0

    const/4 v0, 0x5

    aput-object v12, v5, v0

    const/4 v0, 0x6

    aput-object v14, v5, v0

    const/4 v0, 0x7

    aput-object v15, v5, v0

    const/16 v0, 0x8

    aput-object v4, v5, v0

    const/16 v0, 0x9

    aput-object v16, v5, v0

    const/16 v0, 0xa

    aput-object v17, v5, v0

    const/16 v0, 0xb

    aput-object v19, v5, v0

    const/16 v0, 0xc

    aput-object v18, v5, v0

    const/16 v0, 0xd

    aput-object v10, v5, v0

    const/16 v0, 0xe

    aput-object v20, v5, v0

    const/16 v0, 0xf

    aput-object v21, v5, v0

    const/16 v0, 0x10

    aput-object v3, v5, v0

    aput-object v8, v5, v13

    sput-object v5, LRc7;->v:[LRc7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILSc7;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LRc7;->b:LSc7;

    iput p4, p0, LRc7;->c:I

    return-void
.end method

.method public static values()[LRc7;
    .locals 1

    sget-object v0, LRc7;->v:[LRc7;

    invoke-virtual {v0}, [LRc7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LRc7;

    return-object v0
.end method


# virtual methods
.method public final a()LSc7;
    .locals 1

    iget-object v0, p0, LRc7;->b:LSc7;

    return-object v0
.end method

.method public final y()I
    .locals 1

    iget v0, p0, LRc7;->c:I

    return v0
.end method
