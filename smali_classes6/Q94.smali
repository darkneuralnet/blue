.class public LQ94;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ94$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "LOd3<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "LHj6<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final c:LOd3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LOd3<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/util/Map;LOd3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "LOd3<",
            "*>;>;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "LHj6<",
            "*>;>;",
            "LOd3<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ94;->a:Ljava/util/Map;

    iput-object p2, p0, LQ94;->b:Ljava/util/Map;

    iput-object p3, p0, LQ94;->c:LOd3;

    return-void
.end method

.method public static a()LQ94$a;
    .locals 1

    new-instance v0, LQ94$a;

    invoke-direct {v0}, LQ94$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Object;Ljava/io/OutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, LO94;

    iget-object v1, p0, LQ94;->a:Ljava/util/Map;

    iget-object v2, p0, LQ94;->b:Ljava/util/Map;

    iget-object v3, p0, LQ94;->c:LOd3;

    invoke-direct {v0, p2, v1, v2, v3}, LO94;-><init>(Ljava/io/OutputStream;Ljava/util/Map;Ljava/util/Map;LOd3;)V

    invoke-virtual {v0, p1}, LO94;->s(Ljava/lang/Object;)LO94;

    return-void
.end method

.method public c(Ljava/lang/Object;)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1, v0}, LQ94;->b(Ljava/lang/Object;Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method
