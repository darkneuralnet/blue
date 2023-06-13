.class public final enum LeA3;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/v$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LeA3;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/v$c;"
    }
.end annotation


# static fields
.field public static final enum c:LeA3;

.field public static final enum d:LeA3;

.field public static final enum e:LeA3;

.field public static final enum f:LeA3;

.field public static final enum g:LeA3;

.field public static final enum h:LeA3;

.field public static final i:Lcom/google/crypto/tink/shaded/protobuf/v$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v$d<",
            "LeA3;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic j:[LeA3;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    new-instance v0, LeA3;

    const-string v1, "UNKNOWN_PREFIX"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LeA3;-><init>(Ljava/lang/String;II)V

    sput-object v0, LeA3;->c:LeA3;

    new-instance v1, LeA3;

    const-string v3, "TINK"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LeA3;-><init>(Ljava/lang/String;II)V

    sput-object v1, LeA3;->d:LeA3;

    new-instance v3, LeA3;

    const-string v5, "LEGACY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LeA3;-><init>(Ljava/lang/String;II)V

    sput-object v3, LeA3;->e:LeA3;

    new-instance v5, LeA3;

    const-string v7, "RAW"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, LeA3;-><init>(Ljava/lang/String;II)V

    sput-object v5, LeA3;->f:LeA3;

    new-instance v7, LeA3;

    const-string v9, "CRUNCHY"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, LeA3;-><init>(Ljava/lang/String;II)V

    sput-object v7, LeA3;->g:LeA3;

    new-instance v9, LeA3;

    const/4 v11, -0x1

    const-string v12, "UNRECOGNIZED"

    const/4 v13, 0x5

    invoke-direct {v9, v12, v13, v11}, LeA3;-><init>(Ljava/lang/String;II)V

    sput-object v9, LeA3;->h:LeA3;

    const/4 v11, 0x6

    new-array v11, v11, [LeA3;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v13

    sput-object v11, LeA3;->j:[LeA3;

    new-instance v0, LeA3$a;

    invoke-direct {v0}, LeA3$a;-><init>()V

    sput-object v0, LeA3;->i:Lcom/google/crypto/tink/shaded/protobuf/v$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LeA3;->b:I

    return-void
.end method

.method public static a(I)LeA3;
    .locals 1

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LeA3;->g:LeA3;

    return-object p0

    :cond_1
    sget-object p0, LeA3;->f:LeA3;

    return-object p0

    :cond_2
    sget-object p0, LeA3;->e:LeA3;

    return-object p0

    :cond_3
    sget-object p0, LeA3;->d:LeA3;

    return-object p0

    :cond_4
    sget-object p0, LeA3;->c:LeA3;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LeA3;
    .locals 1

    const-class v0, LeA3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LeA3;

    return-object p0
.end method

.method public static values()[LeA3;
    .locals 1

    sget-object v0, LeA3;->j:[LeA3;

    invoke-virtual {v0}, [LeA3;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LeA3;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    sget-object v0, LeA3;->h:LeA3;

    if-eq p0, v0, :cond_0

    iget v0, p0, LeA3;->b:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
