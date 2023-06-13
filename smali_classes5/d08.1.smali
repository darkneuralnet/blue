.class public final Ld08;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Ljava/util/Map;

.field public final c:LOd3;


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/util/Map;LOd3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld08;->a:Ljava/util/Map;

    iput-object p2, p0, Ld08;->b:Ljava/util/Map;

    iput-object p3, p0, Ld08;->c:LOd3;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)[B
    .locals 5

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    new-instance v1, LnZ7;

    iget-object v2, p0, Ld08;->a:Ljava/util/Map;

    iget-object v3, p0, Ld08;->b:Ljava/util/Map;

    iget-object v4, p0, Ld08;->c:LOd3;

    invoke-direct {v1, v0, v2, v3, v4}, LnZ7;-><init>(Ljava/io/OutputStream;Ljava/util/Map;Ljava/util/Map;LOd3;)V

    invoke-virtual {v1, p1}, LnZ7;->j(Ljava/lang/Object;)LnZ7;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method
