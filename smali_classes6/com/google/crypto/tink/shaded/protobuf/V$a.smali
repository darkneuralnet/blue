.class public final enum Lcom/google/crypto/tink/shaded/protobuf/V$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/crypto/tink/shaded/protobuf/V$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lcom/google/crypto/tink/shaded/protobuf/V$a;

.field public static final enum c:Lcom/google/crypto/tink/shaded/protobuf/V$a;

.field public static final synthetic d:[Lcom/google/crypto/tink/shaded/protobuf/V$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/V$a;

    const-string v1, "ASCENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/V$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/V$a;->b:Lcom/google/crypto/tink/shaded/protobuf/V$a;

    new-instance v1, Lcom/google/crypto/tink/shaded/protobuf/V$a;

    const-string v3, "DESCENDING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/V$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/crypto/tink/shaded/protobuf/V$a;->c:Lcom/google/crypto/tink/shaded/protobuf/V$a;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/crypto/tink/shaded/protobuf/V$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/google/crypto/tink/shaded/protobuf/V$a;->d:[Lcom/google/crypto/tink/shaded/protobuf/V$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/crypto/tink/shaded/protobuf/V$a;
    .locals 1

    const-class v0, Lcom/google/crypto/tink/shaded/protobuf/V$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/V$a;

    return-object p0
.end method

.method public static values()[Lcom/google/crypto/tink/shaded/protobuf/V$a;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/V$a;->d:[Lcom/google/crypto/tink/shaded/protobuf/V$a;

    invoke-virtual {v0}, [Lcom/google/crypto/tink/shaded/protobuf/V$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/crypto/tink/shaded/protobuf/V$a;

    return-object v0
.end method
