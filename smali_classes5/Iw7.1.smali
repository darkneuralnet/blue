.class public final enum LIw7;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum d:LIw7;

.field public static final enum e:LIw7;

.field public static final enum f:LIw7;

.field public static final enum g:LIw7;

.field public static final enum h:LIw7;

.field public static final enum i:LIw7;

.field public static final enum j:LIw7;

.field public static final enum k:LIw7;

.field public static final enum l:LIw7;

.field public static final enum m:LIw7;

.field public static final enum n:LIw7;

.field public static final enum o:LIw7;

.field public static final enum p:LIw7;

.field public static final enum q:LIw7;

.field public static final enum r:LIw7;

.field public static final enum s:LIw7;

.field public static final enum t:LIw7;

.field public static final enum u:LIw7;

.field public static final synthetic v:[LIw7;


# instance fields
.field public final b:LJw7;

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 22

    new-instance v0, LIw7;

    sget-object v1, LJw7;->f:LJw7;

    const-string v2, "DOUBLE"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v1, v4}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v0, LIw7;->d:LIw7;

    new-instance v1, LIw7;

    sget-object v2, LJw7;->e:LJw7;

    const-string v5, "FLOAT"

    const/4 v6, 0x5

    invoke-direct {v1, v5, v4, v2, v6}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v1, LIw7;->e:LIw7;

    new-instance v2, LIw7;

    sget-object v5, LJw7;->d:LJw7;

    const-string v7, "INT64"

    const/4 v8, 0x2

    invoke-direct {v2, v7, v8, v5, v3}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v2, LIw7;->f:LIw7;

    new-instance v7, LIw7;

    const-string v9, "UINT64"

    const/4 v10, 0x3

    invoke-direct {v7, v9, v10, v5, v3}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v7, LIw7;->g:LIw7;

    new-instance v9, LIw7;

    sget-object v11, LJw7;->c:LJw7;

    const-string v12, "INT32"

    const/4 v13, 0x4

    invoke-direct {v9, v12, v13, v11, v3}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v9, LIw7;->h:LIw7;

    new-instance v12, LIw7;

    const-string v14, "FIXED64"

    invoke-direct {v12, v14, v6, v5, v4}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v12, LIw7;->i:LIw7;

    new-instance v14, LIw7;

    const-string v15, "FIXED32"

    const/4 v13, 0x6

    invoke-direct {v14, v15, v13, v11, v6}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v14, LIw7;->j:LIw7;

    new-instance v15, LIw7;

    sget-object v13, LJw7;->g:LJw7;

    const-string v4, "BOOL"

    const/4 v6, 0x7

    invoke-direct {v15, v4, v6, v13, v3}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v15, LIw7;->k:LIw7;

    new-instance v4, LIw7;

    sget-object v13, LJw7;->h:LJw7;

    const-string v6, "STRING"

    const/16 v3, 0x8

    invoke-direct {v4, v6, v3, v13, v8}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v4, LIw7;->l:LIw7;

    new-instance v6, LIw7;

    sget-object v13, LJw7;->k:LJw7;

    const-string v3, "GROUP"

    const/16 v8, 0x9

    invoke-direct {v6, v3, v8, v13, v10}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v6, LIw7;->m:LIw7;

    new-instance v3, LIw7;

    const-string v8, "MESSAGE"

    const/16 v10, 0xa

    move-object/from16 v16, v6

    const/4 v6, 0x2

    invoke-direct {v3, v8, v10, v13, v6}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v3, LIw7;->n:LIw7;

    new-instance v8, LIw7;

    sget-object v13, LJw7;->i:LJw7;

    const-string v10, "BYTES"

    move-object/from16 v17, v3

    const/16 v3, 0xb

    invoke-direct {v8, v10, v3, v13, v6}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v8, LIw7;->o:LIw7;

    new-instance v6, LIw7;

    const-string v10, "UINT32"

    const/16 v13, 0xc

    const/4 v3, 0x0

    invoke-direct {v6, v10, v13, v11, v3}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v6, LIw7;->p:LIw7;

    new-instance v10, LIw7;

    sget-object v13, LJw7;->j:LJw7;

    move-object/from16 v18, v6

    const-string v6, "ENUM"

    move-object/from16 v19, v8

    const/16 v8, 0xd

    invoke-direct {v10, v6, v8, v13, v3}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v10, LIw7;->q:LIw7;

    new-instance v3, LIw7;

    const-string v6, "SFIXED32"

    const/16 v13, 0xe

    const/4 v8, 0x5

    invoke-direct {v3, v6, v13, v11, v8}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v3, LIw7;->r:LIw7;

    new-instance v6, LIw7;

    const-string v8, "SFIXED64"

    const/16 v13, 0xf

    move-object/from16 v20, v3

    const/4 v3, 0x1

    invoke-direct {v6, v8, v13, v5, v3}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v6, LIw7;->s:LIw7;

    new-instance v3, LIw7;

    const-string v8, "SINT32"

    const/16 v13, 0x10

    move-object/from16 v21, v6

    const/4 v6, 0x0

    invoke-direct {v3, v8, v13, v11, v6}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v3, LIw7;->t:LIw7;

    new-instance v8, LIw7;

    const-string v11, "SINT64"

    const/16 v13, 0x11

    invoke-direct {v8, v11, v13, v5, v6}, LIw7;-><init>(Ljava/lang/String;ILJw7;I)V

    sput-object v8, LIw7;->u:LIw7;

    const/16 v5, 0x12

    new-array v5, v5, [LIw7;

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

    sput-object v5, LIw7;->v:[LIw7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILJw7;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LIw7;->b:LJw7;

    iput p4, p0, LIw7;->c:I

    return-void
.end method

.method public static values()[LIw7;
    .locals 1

    sget-object v0, LIw7;->v:[LIw7;

    invoke-virtual {v0}, [LIw7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LIw7;

    return-object v0
.end method


# virtual methods
.method public final a()LJw7;
    .locals 1

    iget-object v0, p0, LIw7;->b:LJw7;

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, LIw7;->c:I

    return v0
.end method
