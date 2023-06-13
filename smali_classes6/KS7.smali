.class public final enum LKS7;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum c:LKS7;

.field public static final enum d:LKS7;

.field public static final enum e:LKS7;

.field public static final enum f:LKS7;

.field public static final enum g:LKS7;

.field public static final enum h:LKS7;

.field public static final enum i:LKS7;

.field public static final enum j:LKS7;

.field public static final enum k:LKS7;

.field public static final enum l:LKS7;

.field public static final enum m:LKS7;

.field public static final enum n:LKS7;

.field public static final enum o:LKS7;

.field public static final enum p:LKS7;

.field public static final enum q:LKS7;

.field public static final enum r:LKS7;

.field public static final enum s:LKS7;

.field public static final synthetic t:[LKS7;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 20

    new-instance v0, LKS7;

    const-string v1, "ok"

    const-string v2, "OK"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LKS7;->c:LKS7;

    new-instance v1, LKS7;

    const-string v2, "canceled"

    const-string v4, "CANCELLED"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LKS7;->d:LKS7;

    new-instance v2, LKS7;

    const-string v4, "unknown"

    const-string v6, "UNKNOWN"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, LKS7;->e:LKS7;

    new-instance v4, LKS7;

    const-string v6, "invalid argument"

    const-string v8, "INVALID_ARGUMENT"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, LKS7;->f:LKS7;

    new-instance v6, LKS7;

    const-string v8, "deadline exceeded"

    const-string v10, "DEADLINE_EXCEEDED"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, LKS7;->g:LKS7;

    new-instance v8, LKS7;

    const-string v10, "not found"

    const-string v12, "NOT_FOUND"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, LKS7;->h:LKS7;

    new-instance v10, LKS7;

    const-string v12, "already exists"

    const-string v14, "ALREADY_EXISTS"

    const/4 v15, 0x6

    invoke-direct {v10, v14, v15, v12}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, LKS7;->i:LKS7;

    new-instance v12, LKS7;

    const-string v14, "permission denied"

    const-string v15, "PERMISSION_DENIED"

    const/4 v13, 0x7

    invoke-direct {v12, v15, v13, v14}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, LKS7;->j:LKS7;

    new-instance v14, LKS7;

    const-string v15, "resource exhausted"

    const-string v13, "RESOURCE_EXHAUSTED"

    const/16 v11, 0x8

    invoke-direct {v14, v13, v11, v15}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v14, LKS7;->k:LKS7;

    new-instance v13, LKS7;

    const-string v15, "failed precondition"

    const-string v11, "FAILED_PRECONDITION"

    const/16 v9, 0x9

    invoke-direct {v13, v11, v9, v15}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, LKS7;->l:LKS7;

    new-instance v11, LKS7;

    const-string v15, "aborted"

    const-string v9, "ABORTED"

    const/16 v7, 0xa

    invoke-direct {v11, v9, v7, v15}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, LKS7;->m:LKS7;

    new-instance v9, LKS7;

    const-string v15, "out of range"

    const-string v7, "OUT_OF_RANGE"

    const/16 v5, 0xb

    invoke-direct {v9, v7, v5, v15}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, LKS7;->n:LKS7;

    new-instance v7, LKS7;

    const-string v15, "unimplemented"

    const-string v5, "UNIMPLEMENTED"

    const/16 v3, 0xc

    invoke-direct {v7, v5, v3, v15}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, LKS7;->o:LKS7;

    new-instance v5, LKS7;

    const-string v15, "internal"

    const-string v3, "INTERNAL"

    move-object/from16 v16, v7

    const/16 v7, 0xd

    invoke-direct {v5, v3, v7, v15}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, LKS7;->p:LKS7;

    new-instance v3, LKS7;

    const-string v15, "unavailable"

    const-string v7, "UNAVAILABLE"

    move-object/from16 v17, v5

    const/16 v5, 0xe

    invoke-direct {v3, v7, v5, v15}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, LKS7;->q:LKS7;

    new-instance v7, LKS7;

    const-string v15, "data loss"

    const-string v5, "DATA_LOSS"

    move-object/from16 v18, v3

    const/16 v3, 0xf

    invoke-direct {v7, v5, v3, v15}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, LKS7;->r:LKS7;

    new-instance v5, LKS7;

    const-string v15, "unauthenticated"

    const-string v3, "UNAUTHENTICATED"

    move-object/from16 v19, v7

    const/16 v7, 0x10

    invoke-direct {v5, v3, v7, v15}, LKS7;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, LKS7;->s:LKS7;

    const/16 v3, 0x11

    new-array v3, v3, [LKS7;

    const/4 v15, 0x0

    aput-object v0, v3, v15

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    const/4 v0, 0x3

    aput-object v4, v3, v0

    const/4 v0, 0x4

    aput-object v6, v3, v0

    const/4 v0, 0x5

    aput-object v8, v3, v0

    const/4 v0, 0x6

    aput-object v10, v3, v0

    const/4 v0, 0x7

    aput-object v12, v3, v0

    const/16 v0, 0x8

    aput-object v14, v3, v0

    const/16 v0, 0x9

    aput-object v13, v3, v0

    const/16 v0, 0xa

    aput-object v11, v3, v0

    const/16 v0, 0xb

    aput-object v9, v3, v0

    const/16 v0, 0xc

    aput-object v16, v3, v0

    const/16 v0, 0xd

    aput-object v17, v3, v0

    const/16 v0, 0xe

    aput-object v18, v3, v0

    const/16 v0, 0xf

    aput-object v19, v3, v0

    aput-object v5, v3, v7

    sput-object v3, LKS7;->t:[LKS7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LKS7;->b:Ljava/lang/String;

    return-void
.end method

.method public static values()[LKS7;
    .locals 1

    sget-object v0, LKS7;->t:[LKS7;

    invoke-virtual {v0}, [LKS7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LKS7;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LKS7;->b:Ljava/lang/String;

    return-object v0
.end method
