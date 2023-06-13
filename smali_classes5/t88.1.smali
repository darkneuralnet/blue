.class public enum Lt88;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lt88;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum d:Lt88;

.field public static final enum e:Lt88;

.field public static final enum f:Lt88;

.field public static final enum g:Lt88;

.field public static final enum h:Lt88;

.field public static final enum i:Lt88;

.field public static final enum j:Lt88;

.field public static final enum k:Lt88;

.field public static final enum l:Lt88;

.field public static final enum m:Lt88;

.field public static final enum n:Lt88;

.field public static final enum o:Lt88;

.field public static final enum p:Lt88;

.field public static final enum q:Lt88;

.field public static final enum r:Lt88;

.field public static final enum s:Lt88;

.field public static final enum t:Lt88;

.field public static final enum u:Lt88;

.field public static final synthetic v:[Lt88;


# instance fields
.field public final b:Lya8;

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 22

    new-instance v0, Lt88;

    sget-object v1, Lya8;->f:Lya8;

    const-string v2, "DOUBLE"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v1, v4}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v0, Lt88;->d:Lt88;

    new-instance v1, Lt88;

    sget-object v2, Lya8;->e:Lya8;

    const-string v5, "FLOAT"

    const/4 v6, 0x5

    invoke-direct {v1, v5, v4, v2, v6}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v1, Lt88;->e:Lt88;

    new-instance v2, Lt88;

    sget-object v5, Lya8;->d:Lya8;

    const-string v7, "INT64"

    const/4 v8, 0x2

    invoke-direct {v2, v7, v8, v5, v3}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v2, Lt88;->f:Lt88;

    new-instance v7, Lt88;

    const-string v9, "UINT64"

    const/4 v10, 0x3

    invoke-direct {v7, v9, v10, v5, v3}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v7, Lt88;->g:Lt88;

    new-instance v9, Lt88;

    sget-object v11, Lya8;->c:Lya8;

    const-string v12, "INT32"

    const/4 v13, 0x4

    invoke-direct {v9, v12, v13, v11, v3}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v9, Lt88;->h:Lt88;

    new-instance v12, Lt88;

    const-string v14, "FIXED64"

    invoke-direct {v12, v14, v6, v5, v4}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v12, Lt88;->i:Lt88;

    new-instance v14, Lt88;

    const-string v15, "FIXED32"

    const/4 v13, 0x6

    invoke-direct {v14, v15, v13, v11, v6}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v14, Lt88;->j:Lt88;

    new-instance v15, Lt88;

    sget-object v13, Lya8;->g:Lya8;

    const-string v4, "BOOL"

    const/4 v6, 0x7

    invoke-direct {v15, v4, v6, v13, v3}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v15, Lt88;->k:Lt88;

    new-instance v4, Lo98;

    sget-object v13, Lya8;->h:Lya8;

    const-string v6, "STRING"

    const/16 v3, 0x8

    invoke-direct {v4, v6, v3, v13, v8}, Lo98;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v4, Lt88;->l:Lt88;

    new-instance v6, LY88;

    sget-object v13, Lya8;->k:Lya8;

    const-string v3, "GROUP"

    const/16 v8, 0x9

    invoke-direct {v6, v3, v8, v13, v10}, LY88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v6, Lt88;->m:Lt88;

    new-instance v3, LT98;

    const-string v8, "MESSAGE"

    const/16 v10, 0xa

    move-object/from16 v16, v6

    const/4 v6, 0x2

    invoke-direct {v3, v8, v10, v13, v6}, LT98;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v3, Lt88;->n:Lt88;

    new-instance v8, LD98;

    sget-object v13, Lya8;->i:Lya8;

    const-string v10, "BYTES"

    move-object/from16 v17, v3

    const/16 v3, 0xb

    invoke-direct {v8, v10, v3, v13, v6}, LD98;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v8, Lt88;->o:Lt88;

    new-instance v6, Lt88;

    const-string v10, "UINT32"

    const/16 v13, 0xc

    const/4 v3, 0x0

    invoke-direct {v6, v10, v13, v11, v3}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v6, Lt88;->p:Lt88;

    new-instance v10, Lt88;

    sget-object v13, Lya8;->j:Lya8;

    move-object/from16 v18, v6

    const-string v6, "ENUM"

    move-object/from16 v19, v8

    const/16 v8, 0xd

    invoke-direct {v10, v6, v8, v13, v3}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v10, Lt88;->q:Lt88;

    new-instance v3, Lt88;

    const-string v6, "SFIXED32"

    const/16 v13, 0xe

    const/4 v8, 0x5

    invoke-direct {v3, v6, v13, v11, v8}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v3, Lt88;->r:Lt88;

    new-instance v6, Lt88;

    const-string v8, "SFIXED64"

    const/16 v13, 0xf

    move-object/from16 v20, v3

    const/4 v3, 0x1

    invoke-direct {v6, v8, v13, v5, v3}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v6, Lt88;->s:Lt88;

    new-instance v3, Lt88;

    const-string v8, "SINT32"

    const/16 v13, 0x10

    move-object/from16 v21, v6

    const/4 v6, 0x0

    invoke-direct {v3, v8, v13, v11, v6}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v3, Lt88;->t:Lt88;

    new-instance v8, Lt88;

    const-string v11, "SINT64"

    const/16 v13, 0x11

    invoke-direct {v8, v11, v13, v5, v6}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    sput-object v8, Lt88;->u:Lt88;

    const/16 v5, 0x12

    new-array v5, v5, [Lt88;

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

    sput-object v5, Lt88;->v:[Lt88;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILya8;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lya8;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lt88;->b:Lya8;

    iput p4, p0, Lt88;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILya8;ILJ88;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lt88;-><init>(Ljava/lang/String;ILya8;I)V

    return-void
.end method

.method public static values()[Lt88;
    .locals 1

    sget-object v0, Lt88;->v:[Lt88;

    invoke-virtual {v0}, [Lt88;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt88;

    return-object v0
.end method


# virtual methods
.method public final a()Lya8;
    .locals 1

    iget-object v0, p0, Lt88;->b:Lya8;

    return-object v0
.end method
