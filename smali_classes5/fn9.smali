.class public final enum Lfn9;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum c:Lfn9;

.field public static final enum d:Lfn9;

.field public static final enum e:Lfn9;

.field public static final enum f:Lfn9;

.field public static final enum g:Lfn9;

.field public static final enum h:Lfn9;

.field public static final enum i:Lfn9;

.field public static final enum j:Lfn9;

.field public static final enum k:Lfn9;

.field public static final enum l:Lfn9;

.field public static final enum m:Lfn9;

.field public static final enum n:Lfn9;

.field public static final enum o:Lfn9;

.field public static final enum p:Lfn9;

.field public static final enum q:Lfn9;

.field public static final enum r:Lfn9;

.field public static final enum s:Lfn9;

.field public static final enum t:Lfn9;

.field public static final synthetic u:[Lfn9;


# instance fields
.field public final b:Lln9;


# direct methods
.method public static constructor <clinit>()V
    .locals 22

    new-instance v0, Lfn9;

    sget-object v1, Lln9;->f:Lln9;

    const-string v2, "DOUBLE"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v1, v4}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v0, Lfn9;->c:Lfn9;

    new-instance v1, Lfn9;

    sget-object v2, Lln9;->e:Lln9;

    const-string v5, "FLOAT"

    const/4 v6, 0x5

    invoke-direct {v1, v5, v4, v2, v6}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v1, Lfn9;->d:Lfn9;

    new-instance v2, Lfn9;

    sget-object v5, Lln9;->d:Lln9;

    const-string v7, "INT64"

    const/4 v8, 0x2

    invoke-direct {v2, v7, v8, v5, v3}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v2, Lfn9;->e:Lfn9;

    new-instance v7, Lfn9;

    const-string v9, "UINT64"

    const/4 v10, 0x3

    invoke-direct {v7, v9, v10, v5, v3}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v7, Lfn9;->f:Lfn9;

    new-instance v9, Lfn9;

    sget-object v11, Lln9;->c:Lln9;

    const-string v12, "INT32"

    const/4 v13, 0x4

    invoke-direct {v9, v12, v13, v11, v3}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v9, Lfn9;->g:Lfn9;

    new-instance v12, Lfn9;

    const-string v14, "FIXED64"

    invoke-direct {v12, v14, v6, v5, v4}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v12, Lfn9;->h:Lfn9;

    new-instance v14, Lfn9;

    const-string v15, "FIXED32"

    const/4 v13, 0x6

    invoke-direct {v14, v15, v13, v11, v6}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v14, Lfn9;->i:Lfn9;

    new-instance v15, Lfn9;

    sget-object v13, Lln9;->g:Lln9;

    const-string v4, "BOOL"

    const/4 v6, 0x7

    invoke-direct {v15, v4, v6, v13, v3}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v15, Lfn9;->j:Lfn9;

    new-instance v4, Lfn9;

    sget-object v13, Lln9;->h:Lln9;

    const-string v6, "STRING"

    const/16 v3, 0x8

    invoke-direct {v4, v6, v3, v13, v8}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v4, Lfn9;->k:Lfn9;

    new-instance v6, Lfn9;

    sget-object v13, Lln9;->k:Lln9;

    const-string v3, "GROUP"

    const/16 v8, 0x9

    invoke-direct {v6, v3, v8, v13, v10}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v6, Lfn9;->l:Lfn9;

    new-instance v3, Lfn9;

    const-string v8, "MESSAGE"

    const/16 v10, 0xa

    move-object/from16 v16, v6

    const/4 v6, 0x2

    invoke-direct {v3, v8, v10, v13, v6}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v3, Lfn9;->m:Lfn9;

    new-instance v8, Lfn9;

    sget-object v13, Lln9;->i:Lln9;

    const-string v10, "BYTES"

    move-object/from16 v17, v3

    const/16 v3, 0xb

    invoke-direct {v8, v10, v3, v13, v6}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v8, Lfn9;->n:Lfn9;

    new-instance v6, Lfn9;

    const-string v10, "UINT32"

    const/16 v13, 0xc

    const/4 v3, 0x0

    invoke-direct {v6, v10, v13, v11, v3}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v6, Lfn9;->o:Lfn9;

    new-instance v10, Lfn9;

    sget-object v13, Lln9;->j:Lln9;

    move-object/from16 v18, v6

    const-string v6, "ENUM"

    move-object/from16 v19, v8

    const/16 v8, 0xd

    invoke-direct {v10, v6, v8, v13, v3}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v10, Lfn9;->p:Lfn9;

    new-instance v3, Lfn9;

    const-string v6, "SFIXED32"

    const/16 v13, 0xe

    const/4 v8, 0x5

    invoke-direct {v3, v6, v13, v11, v8}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v3, Lfn9;->q:Lfn9;

    new-instance v6, Lfn9;

    const-string v8, "SFIXED64"

    const/16 v13, 0xf

    move-object/from16 v20, v3

    const/4 v3, 0x1

    invoke-direct {v6, v8, v13, v5, v3}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v6, Lfn9;->r:Lfn9;

    new-instance v3, Lfn9;

    const-string v8, "SINT32"

    const/16 v13, 0x10

    move-object/from16 v21, v6

    const/4 v6, 0x0

    invoke-direct {v3, v8, v13, v11, v6}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v3, Lfn9;->s:Lfn9;

    new-instance v8, Lfn9;

    const-string v11, "SINT64"

    const/16 v13, 0x11

    invoke-direct {v8, v11, v13, v5, v6}, Lfn9;-><init>(Ljava/lang/String;ILln9;I)V

    sput-object v8, Lfn9;->t:Lfn9;

    const/16 v5, 0x12

    new-array v5, v5, [Lfn9;

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

    sput-object v5, Lfn9;->u:[Lfn9;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILln9;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lfn9;->b:Lln9;

    return-void
.end method

.method public static values()[Lfn9;
    .locals 1

    sget-object v0, Lfn9;->u:[Lfn9;

    invoke-virtual {v0}, [Lfn9;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfn9;

    return-object v0
.end method


# virtual methods
.method public final a()Lln9;
    .locals 1

    iget-object v0, p0, Lfn9;->b:Lln9;

    return-object v0
.end method
