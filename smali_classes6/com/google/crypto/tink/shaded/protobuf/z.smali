.class public abstract Lcom/google/crypto/tink/shaded/protobuf/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/z$c;,
        Lcom/google/crypto/tink/shaded/protobuf/z$b;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/crypto/tink/shaded/protobuf/z;

.field public static final b:Lcom/google/crypto/tink/shaded/protobuf/z;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/z$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/z$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/z$a;)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/z;->a:Lcom/google/crypto/tink/shaded/protobuf/z;

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/z$c;

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/z$c;-><init>(Lcom/google/crypto/tink/shaded/protobuf/z$a;)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/z;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/z$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/crypto/tink/shaded/protobuf/z;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z;->a:Lcom/google/crypto/tink/shaded/protobuf/z;

    return-object v0
.end method

.method public static b()Lcom/google/crypto/tink/shaded/protobuf/z;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/z;

    return-object v0
.end method


# virtual methods
.method public abstract c(Ljava/lang/Object;J)V
.end method

.method public abstract d(Ljava/lang/Object;Ljava/lang/Object;J)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "J)V"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/Object;J)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "J)",
            "Ljava/util/List<",
            "T",
            "L;",
            ">;"
        }
    .end annotation
.end method
