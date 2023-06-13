.class public enum LT19;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LT19;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum d:LT19;

.field public static final enum e:LT19;

.field public static final enum f:LT19;

.field public static final enum g:LT19;

.field public static final enum h:LT19;

.field public static final enum i:LT19;

.field public static final enum j:LT19;

.field public static final enum k:LT19;

.field public static final enum l:LT19;

.field public static final enum m:LT19;

.field public static final enum n:LT19;

.field public static final enum o:LT19;

.field public static final enum p:LT19;

.field public static final enum q:LT19;

.field public static final enum r:LT19;

.field public static final enum s:LT19;

.field public static final enum t:LT19;

.field public static final enum u:LT19;

.field public static final synthetic v:[LT19;


# instance fields
.field public final b:Lx29;

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 22

    new-instance v0, LT19;

    sget-object v1, Lx29;->f:Lx29;

    const-string v2, "DOUBLE"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v1, v4}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v0, LT19;->d:LT19;

    new-instance v1, LT19;

    sget-object v2, Lx29;->e:Lx29;

    const-string v5, "FLOAT"

    const/4 v6, 0x5

    invoke-direct {v1, v5, v4, v2, v6}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v1, LT19;->e:LT19;

    new-instance v2, LT19;

    sget-object v5, Lx29;->d:Lx29;

    const-string v7, "INT64"

    const/4 v8, 0x2

    invoke-direct {v2, v7, v8, v5, v3}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v2, LT19;->f:LT19;

    new-instance v7, LT19;

    const-string v9, "UINT64"

    const/4 v10, 0x3

    invoke-direct {v7, v9, v10, v5, v3}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v7, LT19;->g:LT19;

    new-instance v9, LT19;

    sget-object v11, Lx29;->c:Lx29;

    const-string v12, "INT32"

    const/4 v13, 0x4

    invoke-direct {v9, v12, v13, v11, v3}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v9, LT19;->h:LT19;

    new-instance v12, LT19;

    const-string v14, "FIXED64"

    invoke-direct {v12, v14, v6, v5, v4}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v12, LT19;->i:LT19;

    new-instance v14, LT19;

    const-string v15, "FIXED32"

    const/4 v13, 0x6

    invoke-direct {v14, v15, v13, v11, v6}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v14, LT19;->j:LT19;

    new-instance v15, LT19;

    sget-object v13, Lx29;->g:Lx29;

    const-string v4, "BOOL"

    const/4 v6, 0x7

    invoke-direct {v15, v4, v6, v13, v3}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v15, LT19;->k:LT19;

    new-instance v4, LJ19;

    sget-object v13, Lx29;->h:Lx29;

    const-string v6, "STRING"

    const/16 v3, 0x8

    invoke-direct {v4, v6, v3, v13, v8}, LJ19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v4, LT19;->l:LT19;

    new-instance v6, Ln29;

    sget-object v13, Lx29;->k:Lx29;

    const-string v3, "GROUP"

    const/16 v8, 0x9

    invoke-direct {v6, v3, v8, v13, v10}, Ln29;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v6, LT19;->m:LT19;

    new-instance v3, Ld29;

    const-string v8, "MESSAGE"

    const/16 v10, 0xa

    move-object/from16 v16, v6

    const/4 v6, 0x2

    invoke-direct {v3, v8, v10, v13, v6}, Ld29;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v3, LT19;->n:LT19;

    new-instance v8, LH29;

    sget-object v13, Lx29;->i:Lx29;

    const-string v10, "BYTES"

    move-object/from16 v17, v3

    const/16 v3, 0xb

    invoke-direct {v8, v10, v3, v13, v6}, LH29;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v8, LT19;->o:LT19;

    new-instance v6, LT19;

    const-string v10, "UINT32"

    const/16 v13, 0xc

    const/4 v3, 0x0

    invoke-direct {v6, v10, v13, v11, v3}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v6, LT19;->p:LT19;

    new-instance v10, LT19;

    sget-object v13, Lx29;->j:Lx29;

    move-object/from16 v18, v6

    const-string v6, "ENUM"

    move-object/from16 v19, v8

    const/16 v8, 0xd

    invoke-direct {v10, v6, v8, v13, v3}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v10, LT19;->q:LT19;

    new-instance v3, LT19;

    const-string v6, "SFIXED32"

    const/16 v13, 0xe

    const/4 v8, 0x5

    invoke-direct {v3, v6, v13, v11, v8}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v3, LT19;->r:LT19;

    new-instance v6, LT19;

    const-string v8, "SFIXED64"

    const/16 v13, 0xf

    move-object/from16 v20, v3

    const/4 v3, 0x1

    invoke-direct {v6, v8, v13, v5, v3}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v6, LT19;->s:LT19;

    new-instance v3, LT19;

    const-string v8, "SINT32"

    const/16 v13, 0x10

    move-object/from16 v21, v6

    const/4 v6, 0x0

    invoke-direct {v3, v8, v13, v11, v6}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v3, LT19;->t:LT19;

    new-instance v8, LT19;

    const-string v11, "SINT64"

    const/16 v13, 0x11

    invoke-direct {v8, v11, v13, v5, v6}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    sput-object v8, LT19;->u:LT19;

    const/16 v5, 0x12

    new-array v5, v5, [LT19;

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

    sput-object v5, LT19;->v:[LT19;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILx29;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx29;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LT19;->b:Lx29;

    iput p4, p0, LT19;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILx29;ILq19;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LT19;-><init>(Ljava/lang/String;ILx29;I)V

    return-void
.end method

.method public static values()[LT19;
    .locals 1

    sget-object v0, LT19;->v:[LT19;

    invoke-virtual {v0}, [LT19;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LT19;

    return-object v0
.end method


# virtual methods
.method public final a()Lx29;
    .locals 1

    iget-object v0, p0, LT19;->b:Lx29;

    return-object v0
.end method
