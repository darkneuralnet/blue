.class public final enum Lbz9;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LZ19;


# static fields
.field public static final enum c:Lbz9;

.field public static final enum d:Lbz9;

.field public static final enum e:Lbz9;

.field public static final enum f:Lbz9;

.field public static final enum g:Lbz9;

.field public static final enum h:Lbz9;

.field public static final enum i:Lbz9;

.field public static final enum j:Lbz9;

.field public static final enum k:Lbz9;

.field public static final enum l:Lbz9;

.field public static final synthetic m:[Lbz9;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lbz9;

    const-string v1, "UNKNOWN_ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lbz9;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lbz9;->c:Lbz9;

    new-instance v1, Lbz9;

    const-string v3, "NO_CONNECTION"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lbz9;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lbz9;->d:Lbz9;

    new-instance v3, Lbz9;

    const-string v5, "RPC_ERROR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lbz9;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lbz9;->e:Lbz9;

    new-instance v5, Lbz9;

    const-string v7, "RPC_RETURNED_MALFORMED_RESULT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lbz9;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lbz9;->f:Lbz9;

    new-instance v7, Lbz9;

    const-string v9, "RPC_EXPONENTIAL_BACKOFF_FAILED"

    const/4 v10, 0x4

    const/4 v11, 0x5

    invoke-direct {v7, v9, v10, v11}, Lbz9;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lbz9;->g:Lbz9;

    new-instance v9, Lbz9;

    const-string v12, "RPC_CLIENT_ERROR"

    const/4 v13, 0x6

    invoke-direct {v9, v12, v11, v13}, Lbz9;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lbz9;->h:Lbz9;

    new-instance v12, Lbz9;

    const-string v14, "DIRECTORY_CREATION_FAILED"

    const/16 v15, 0xa

    invoke-direct {v12, v14, v13, v15}, Lbz9;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lbz9;->i:Lbz9;

    new-instance v14, Lbz9;

    const/16 v13, 0xb

    const-string v11, "FILE_WRITE_FAILED"

    const/4 v10, 0x7

    invoke-direct {v14, v11, v10, v13}, Lbz9;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lbz9;->j:Lbz9;

    new-instance v11, Lbz9;

    const/16 v13, 0xc

    const-string v10, "FILE_READ_FAILED"

    const/16 v8, 0x8

    invoke-direct {v11, v10, v8, v13}, Lbz9;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lbz9;->k:Lbz9;

    new-instance v10, Lbz9;

    const/16 v13, 0xd

    const-string v8, "FILE_READ_RETURNED_MALFORMED_DATA"

    const/16 v6, 0x9

    invoke-direct {v10, v8, v6, v13}, Lbz9;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lbz9;->l:Lbz9;

    new-array v8, v15, [Lbz9;

    aput-object v0, v8, v2

    aput-object v1, v8, v4

    const/4 v0, 0x2

    aput-object v3, v8, v0

    const/4 v0, 0x3

    aput-object v5, v8, v0

    const/4 v0, 0x4

    aput-object v7, v8, v0

    const/4 v0, 0x5

    aput-object v9, v8, v0

    const/4 v0, 0x6

    aput-object v12, v8, v0

    const/4 v0, 0x7

    aput-object v14, v8, v0

    const/16 v0, 0x8

    aput-object v11, v8, v0

    aput-object v10, v8, v6

    sput-object v8, Lbz9;->m:[Lbz9;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lbz9;->b:I

    return-void
.end method

.method public static values()[Lbz9;
    .locals 1

    sget-object v0, Lbz9;->m:[Lbz9;

    invoke-virtual {v0}, [Lbz9;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbz9;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lbz9;->b:I

    return v0
.end method
