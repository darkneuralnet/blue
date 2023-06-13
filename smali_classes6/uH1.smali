.class public final enum LuH1;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/v$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LuH1;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/v$c;"
    }
.end annotation


# static fields
.field public static final enum c:LuH1;

.field public static final enum d:LuH1;

.field public static final enum e:LuH1;

.field public static final enum f:LuH1;

.field public static final enum g:LuH1;

.field public static final enum h:LuH1;

.field public static final enum i:LuH1;

.field public static final j:Lcom/google/crypto/tink/shaded/protobuf/v$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/v$d<",
            "LuH1;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic k:[LuH1;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, LuH1;

    const-string v1, "UNKNOWN_HASH"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LuH1;-><init>(Ljava/lang/String;II)V

    sput-object v0, LuH1;->c:LuH1;

    new-instance v1, LuH1;

    const-string v3, "SHA1"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, LuH1;-><init>(Ljava/lang/String;II)V

    sput-object v1, LuH1;->d:LuH1;

    new-instance v3, LuH1;

    const-string v5, "SHA384"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, LuH1;-><init>(Ljava/lang/String;II)V

    sput-object v3, LuH1;->e:LuH1;

    new-instance v5, LuH1;

    const-string v7, "SHA256"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, LuH1;-><init>(Ljava/lang/String;II)V

    sput-object v5, LuH1;->f:LuH1;

    new-instance v7, LuH1;

    const-string v9, "SHA512"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, LuH1;-><init>(Ljava/lang/String;II)V

    sput-object v7, LuH1;->g:LuH1;

    new-instance v9, LuH1;

    const-string v11, "SHA224"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, LuH1;-><init>(Ljava/lang/String;II)V

    sput-object v9, LuH1;->h:LuH1;

    new-instance v11, LuH1;

    const/4 v13, -0x1

    const-string v14, "UNRECOGNIZED"

    const/4 v15, 0x6

    invoke-direct {v11, v14, v15, v13}, LuH1;-><init>(Ljava/lang/String;II)V

    sput-object v11, LuH1;->i:LuH1;

    const/4 v13, 0x7

    new-array v13, v13, [LuH1;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v15

    sput-object v13, LuH1;->k:[LuH1;

    new-instance v0, LuH1$a;

    invoke-direct {v0}, LuH1$a;-><init>()V

    sput-object v0, LuH1;->j:Lcom/google/crypto/tink/shaded/protobuf/v$d;

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

    iput p3, p0, LuH1;->b:I

    return-void
.end method

.method public static a(I)LuH1;
    .locals 1

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LuH1;->h:LuH1;

    return-object p0

    :cond_1
    sget-object p0, LuH1;->g:LuH1;

    return-object p0

    :cond_2
    sget-object p0, LuH1;->f:LuH1;

    return-object p0

    :cond_3
    sget-object p0, LuH1;->e:LuH1;

    return-object p0

    :cond_4
    sget-object p0, LuH1;->d:LuH1;

    return-object p0

    :cond_5
    sget-object p0, LuH1;->c:LuH1;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LuH1;
    .locals 1

    const-class v0, LuH1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LuH1;

    return-object p0
.end method

.method public static values()[LuH1;
    .locals 1

    sget-object v0, LuH1;->k:[LuH1;

    invoke-virtual {v0}, [LuH1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LuH1;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    sget-object v0, LuH1;->i:LuH1;

    if-eq p0, v0, :cond_0

    iget v0, p0, LuH1;->b:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
