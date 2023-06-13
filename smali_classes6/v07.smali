.class public final enum Lv07;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum c:Lv07;

.field public static final enum d:Lv07;

.field public static final enum e:Lv07;

.field public static final enum f:Lv07;

.field public static final enum g:Lv07;

.field public static final enum h:Lv07;

.field public static final enum i:Lv07;

.field public static final enum j:Lv07;

.field public static final enum k:Lv07;

.field public static final enum l:Lv07;

.field public static final enum m:Lv07;

.field public static final enum n:Lv07;

.field public static final enum o:Lv07;

.field public static final enum p:Lv07;

.field public static final enum q:Lv07;

.field public static final enum r:Lv07;

.field public static final enum s:Lv07;

.field public static final synthetic t:[Lv07;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 20

    new-instance v0, Lv07;

    const-string v1, "OK"

    const/4 v2, 0x0

    const-string v3, "ok"

    invoke-direct {v0, v1, v2, v3}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lv07;->c:Lv07;

    new-instance v1, Lv07;

    const-string v3, "CANCELLED"

    const/4 v4, 0x1

    const-string v5, "canceled"

    invoke-direct {v1, v3, v4, v5}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lv07;->d:Lv07;

    new-instance v3, Lv07;

    const-string v5, "UNKNOWN"

    const/4 v6, 0x2

    const-string v7, "unknown"

    invoke-direct {v3, v5, v6, v7}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lv07;->e:Lv07;

    new-instance v5, Lv07;

    const-string v7, "INVALID_ARGUMENT"

    const/4 v8, 0x3

    const-string v9, "invalid argument"

    invoke-direct {v5, v7, v8, v9}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lv07;->f:Lv07;

    new-instance v7, Lv07;

    const-string v9, "DEADLINE_EXCEEDED"

    const/4 v10, 0x4

    const-string v11, "deadline exceeded"

    invoke-direct {v7, v9, v10, v11}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lv07;->g:Lv07;

    new-instance v9, Lv07;

    const-string v11, "NOT_FOUND"

    const/4 v12, 0x5

    const-string v13, "not found"

    invoke-direct {v9, v11, v12, v13}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lv07;->h:Lv07;

    new-instance v11, Lv07;

    const-string v13, "ALREADY_EXISTS"

    const/4 v14, 0x6

    const-string v15, "already exists"

    invoke-direct {v11, v13, v14, v15}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lv07;->i:Lv07;

    new-instance v13, Lv07;

    const-string v15, "PERMISSION_DENIED"

    const/4 v14, 0x7

    const-string v12, "permission denied"

    invoke-direct {v13, v15, v14, v12}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lv07;->j:Lv07;

    new-instance v12, Lv07;

    const-string v15, "RESOURCE_EXHAUSTED"

    const/16 v14, 0x8

    const-string v10, "resource exhausted"

    invoke-direct {v12, v15, v14, v10}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lv07;->k:Lv07;

    new-instance v10, Lv07;

    const-string v15, "FAILED_PRECONDITION"

    const/16 v14, 0x9

    const-string v8, "failed precondition"

    invoke-direct {v10, v15, v14, v8}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lv07;->l:Lv07;

    new-instance v8, Lv07;

    const-string v15, "ABORTED"

    const/16 v14, 0xa

    const-string v6, "aborted"

    invoke-direct {v8, v15, v14, v6}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lv07;->m:Lv07;

    new-instance v6, Lv07;

    const-string v15, "OUT_OF_RANGE"

    const/16 v14, 0xb

    const-string v4, "out of range"

    invoke-direct {v6, v15, v14, v4}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lv07;->n:Lv07;

    new-instance v4, Lv07;

    const-string v15, "UNIMPLEMENTED"

    const/16 v14, 0xc

    const-string v2, "unimplemented"

    invoke-direct {v4, v15, v14, v2}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lv07;->o:Lv07;

    new-instance v2, Lv07;

    const-string v15, "INTERNAL"

    const/16 v14, 0xd

    move-object/from16 v16, v4

    const-string v4, "internal"

    invoke-direct {v2, v15, v14, v4}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lv07;->p:Lv07;

    new-instance v4, Lv07;

    const-string v15, "UNAVAILABLE"

    const/16 v14, 0xe

    move-object/from16 v17, v2

    const-string v2, "unavailable"

    invoke-direct {v4, v15, v14, v2}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lv07;->q:Lv07;

    new-instance v2, Lv07;

    const-string v15, "DATA_LOSS"

    const/16 v14, 0xf

    move-object/from16 v18, v4

    const-string v4, "data loss"

    invoke-direct {v2, v15, v14, v4}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lv07;->r:Lv07;

    new-instance v4, Lv07;

    const-string v15, "UNAUTHENTICATED"

    const/16 v14, 0x10

    move-object/from16 v19, v2

    const-string v2, "unauthenticated"

    invoke-direct {v4, v15, v14, v2}, Lv07;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lv07;->s:Lv07;

    const/16 v2, 0x11

    new-array v2, v2, [Lv07;

    const/4 v15, 0x0

    aput-object v0, v2, v15

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v3, v2, v0

    const/4 v0, 0x3

    aput-object v5, v2, v0

    const/4 v0, 0x4

    aput-object v7, v2, v0

    const/4 v0, 0x5

    aput-object v9, v2, v0

    const/4 v0, 0x6

    aput-object v11, v2, v0

    const/4 v0, 0x7

    aput-object v13, v2, v0

    const/16 v0, 0x8

    aput-object v12, v2, v0

    const/16 v0, 0x9

    aput-object v10, v2, v0

    const/16 v0, 0xa

    aput-object v8, v2, v0

    const/16 v0, 0xb

    aput-object v6, v2, v0

    const/16 v0, 0xc

    aput-object v16, v2, v0

    const/16 v0, 0xd

    aput-object v17, v2, v0

    const/16 v0, 0xe

    aput-object v18, v2, v0

    const/16 v0, 0xf

    aput-object v19, v2, v0

    aput-object v4, v2, v14

    sput-object v2, Lv07;->t:[Lv07;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lv07;->b:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lv07;
    .locals 1

    sget-object v0, Lv07;->t:[Lv07;

    invoke-virtual {v0}, [Lv07;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv07;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv07;->b:Ljava/lang/String;

    return-object v0
.end method
