.class public final Lc83;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LZ73;

.field public static final b:LZ73;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lc83;->c()LZ73;

    move-result-object v0

    sput-object v0, Lc83;->a:LZ73;

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/J;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/J;-><init>()V

    sput-object v0, Lc83;->b:LZ73;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LZ73;
    .locals 1

    sget-object v0, Lc83;->a:LZ73;

    return-object v0
.end method

.method public static b()LZ73;
    .locals 1

    sget-object v0, Lc83;->b:LZ73;

    return-object v0
.end method

.method public static c()LZ73;
    .locals 3

    :try_start_0
    const-string v0, "com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ73;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method
