.class public final enum LRs9;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LRs9;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum d:LRs9;

.field public static final enum e:LRs9;

.field public static final enum f:LRs9;

.field public static final enum g:LRs9;

.field public static final enum h:LRs9;

.field public static final enum i:LRs9;

.field public static final enum j:LRs9;

.field public static final enum k:LRs9;

.field public static final enum l:LRs9;

.field public static final enum m:LRs9;

.field public static final enum n:LRs9;

.field public static final enum o:LRs9;

.field public static final enum p:LRs9;

.field public static final enum q:LRs9;

.field public static final enum r:LRs9;

.field public static final enum s:LRs9;

.field public static final enum t:LRs9;

.field public static final enum u:LRs9;

.field public static final synthetic v:[LRs9;


# instance fields
.field public final b:LTs9;

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 22

    new-instance v0, LRs9;

    sget-object v1, LTs9;->f:LTs9;

    const-string v2, "DOUBLE"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v1, v4}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v0, LRs9;->d:LRs9;

    new-instance v1, LRs9;

    sget-object v2, LTs9;->e:LTs9;

    const-string v5, "FLOAT"

    const/4 v6, 0x5

    invoke-direct {v1, v5, v4, v2, v6}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v1, LRs9;->e:LRs9;

    new-instance v2, LRs9;

    sget-object v5, LTs9;->d:LTs9;

    const-string v7, "INT64"

    const/4 v8, 0x2

    invoke-direct {v2, v7, v8, v5, v3}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v2, LRs9;->f:LRs9;

    new-instance v7, LRs9;

    const-string v9, "UINT64"

    const/4 v10, 0x3

    invoke-direct {v7, v9, v10, v5, v3}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v7, LRs9;->g:LRs9;

    new-instance v9, LRs9;

    sget-object v11, LTs9;->c:LTs9;

    const-string v12, "INT32"

    const/4 v13, 0x4

    invoke-direct {v9, v12, v13, v11, v3}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v9, LRs9;->h:LRs9;

    new-instance v12, LRs9;

    const-string v14, "FIXED64"

    invoke-direct {v12, v14, v6, v5, v4}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v12, LRs9;->i:LRs9;

    new-instance v14, LRs9;

    const-string v15, "FIXED32"

    const/4 v13, 0x6

    invoke-direct {v14, v15, v13, v11, v6}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v14, LRs9;->j:LRs9;

    new-instance v15, LRs9;

    sget-object v13, LTs9;->g:LTs9;

    const-string v4, "BOOL"

    const/4 v6, 0x7

    invoke-direct {v15, v4, v6, v13, v3}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v15, LRs9;->k:LRs9;

    new-instance v4, LRs9;

    sget-object v13, LTs9;->h:LTs9;

    const-string v6, "STRING"

    const/16 v3, 0x8

    invoke-direct {v4, v6, v3, v13, v8}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v4, LRs9;->l:LRs9;

    new-instance v6, LRs9;

    sget-object v13, LTs9;->k:LTs9;

    const-string v3, "GROUP"

    const/16 v8, 0x9

    invoke-direct {v6, v3, v8, v13, v10}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v6, LRs9;->m:LRs9;

    new-instance v3, LRs9;

    const-string v8, "MESSAGE"

    const/16 v10, 0xa

    move-object/from16 v16, v6

    const/4 v6, 0x2

    invoke-direct {v3, v8, v10, v13, v6}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v3, LRs9;->n:LRs9;

    new-instance v8, LRs9;

    sget-object v13, LTs9;->i:LTs9;

    const-string v10, "BYTES"

    move-object/from16 v17, v3

    const/16 v3, 0xb

    invoke-direct {v8, v10, v3, v13, v6}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v8, LRs9;->o:LRs9;

    new-instance v6, LRs9;

    const-string v10, "UINT32"

    const/16 v13, 0xc

    const/4 v3, 0x0

    invoke-direct {v6, v10, v13, v11, v3}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v6, LRs9;->p:LRs9;

    new-instance v10, LRs9;

    sget-object v13, LTs9;->j:LTs9;

    move-object/from16 v18, v6

    const-string v6, "ENUM"

    move-object/from16 v19, v8

    const/16 v8, 0xd

    invoke-direct {v10, v6, v8, v13, v3}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v10, LRs9;->q:LRs9;

    new-instance v3, LRs9;

    const-string v6, "SFIXED32"

    const/16 v13, 0xe

    const/4 v8, 0x5

    invoke-direct {v3, v6, v13, v11, v8}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v3, LRs9;->r:LRs9;

    new-instance v6, LRs9;

    const-string v8, "SFIXED64"

    const/16 v13, 0xf

    move-object/from16 v20, v3

    const/4 v3, 0x1

    invoke-direct {v6, v8, v13, v5, v3}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v6, LRs9;->s:LRs9;

    new-instance v3, LRs9;

    const-string v8, "SINT32"

    const/16 v13, 0x10

    move-object/from16 v21, v6

    const/4 v6, 0x0

    invoke-direct {v3, v8, v13, v11, v6}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v3, LRs9;->t:LRs9;

    new-instance v8, LRs9;

    const-string v11, "SINT64"

    const/16 v13, 0x11

    invoke-direct {v8, v11, v13, v5, v6}, LRs9;-><init>(Ljava/lang/String;ILTs9;I)V

    sput-object v8, LRs9;->u:LRs9;

    const/16 v5, 0x12

    new-array v5, v5, [LRs9;

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

    sput-object v5, LRs9;->v:[LRs9;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILTs9;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTs9;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LRs9;->b:LTs9;

    iput p4, p0, LRs9;->c:I

    return-void
.end method

.method public static values()[LRs9;
    .locals 1

    sget-object v0, LRs9;->v:[LRs9;

    invoke-virtual {v0}, [LRs9;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LRs9;

    return-object v0
.end method


# virtual methods
.method public final a()LTs9;
    .locals 1

    iget-object v0, p0, LRs9;->b:LTs9;

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, LRs9;->c:I

    return v0
.end method
