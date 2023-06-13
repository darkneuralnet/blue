.class public final enum Lyk2;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyk2;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lyk2;

.field public static final enum d:Lyk2;

.field public static final enum e:Lyk2;

.field public static final enum f:Lyk2;

.field public static final enum g:Lyk2;

.field public static final enum h:Lyk2;

.field public static final enum i:Lyk2;

.field public static final enum j:Lyk2;

.field public static final synthetic k:[Lyk2;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lyk2;

    const-string v1, "sign"

    const-string v2, "SIGN"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lyk2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lyk2;->c:Lyk2;

    new-instance v1, Lyk2;

    const-string v2, "verify"

    const-string v4, "VERIFY"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lyk2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lyk2;->d:Lyk2;

    new-instance v2, Lyk2;

    const-string v4, "encrypt"

    const-string v6, "ENCRYPT"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lyk2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lyk2;->e:Lyk2;

    new-instance v4, Lyk2;

    const-string v6, "decrypt"

    const-string v8, "DECRYPT"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Lyk2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lyk2;->f:Lyk2;

    new-instance v6, Lyk2;

    const-string v8, "wrapKey"

    const-string v10, "WRAP_KEY"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, Lyk2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lyk2;->g:Lyk2;

    new-instance v8, Lyk2;

    const-string v10, "unwrapKey"

    const-string v12, "UNWRAP_KEY"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, Lyk2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lyk2;->h:Lyk2;

    new-instance v10, Lyk2;

    const-string v12, "deriveKey"

    const-string v14, "DERIVE_KEY"

    const/4 v15, 0x6

    invoke-direct {v10, v14, v15, v12}, Lyk2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lyk2;->i:Lyk2;

    new-instance v12, Lyk2;

    const-string v14, "deriveBits"

    const-string v15, "DERIVE_BITS"

    const/4 v13, 0x7

    invoke-direct {v12, v15, v13, v14}, Lyk2;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lyk2;->j:Lyk2;

    const/16 v14, 0x8

    new-array v14, v14, [Lyk2;

    aput-object v0, v14, v3

    aput-object v1, v14, v5

    aput-object v2, v14, v7

    aput-object v4, v14, v9

    aput-object v6, v14, v11

    const/4 v0, 0x5

    aput-object v8, v14, v0

    const/4 v0, 0x6

    aput-object v10, v14, v0

    aput-object v12, v14, v13

    sput-object v14, Lyk2;->k:[Lyk2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    if-eqz p3, :cond_0

    iput-object p3, p0, Lyk2;->b:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The key operation identifier must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Ljava/util/List;)Ljava/util/Set;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set<",
            "Lyk2;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lyk2;->values()[Lyk2;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    if-ge v6, v4, :cond_3

    aget-object v7, v3, v6

    invoke-virtual {v7}, Lyk2;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    move-object v7, v0

    :goto_2
    if-eqz v7, :cond_4

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance p0, Ljava/text/ParseException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid JWK operation: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v5}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    :cond_5
    return-object v1
.end method

.method public static valueOf(Ljava/lang/String;)Lyk2;
    .locals 1

    const-class v0, Lyk2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyk2;

    return-object p0
.end method

.method public static values()[Lyk2;
    .locals 1

    sget-object v0, Lyk2;->k:[Lyk2;

    invoke-virtual {v0}, [Lyk2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyk2;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyk2;->b:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lyk2;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
