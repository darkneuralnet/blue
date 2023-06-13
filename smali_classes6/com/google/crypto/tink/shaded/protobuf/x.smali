.class public Lcom/google/crypto/tink/shaded/protobuf/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lcom/google/crypto/tink/shaded/protobuf/m;


# instance fields
.field public a:Lcom/google/crypto/tink/shaded/protobuf/g;

.field public b:Lcom/google/crypto/tink/shaded/protobuf/m;

.field public volatile c:Lcom/google/crypto/tink/shaded/protobuf/F;

.field public volatile d:Lcom/google/crypto/tink/shaded/protobuf/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/m;->b()Lcom/google/crypto/tink/shaded/protobuf/m;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/x;->e:Lcom/google/crypto/tink/shaded/protobuf/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/crypto/tink/shaded/protobuf/F;)V
    .locals 3

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->c:Lcom/google/crypto/tink/shaded/protobuf/F;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->c:Lcom/google/crypto/tink/shaded/protobuf/F;

    if-eqz v0, :cond_1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->a:Lcom/google/crypto/tink/shaded/protobuf/g;

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/crypto/tink/shaded/protobuf/F;->getParserForType()LWH3;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->a:Lcom/google/crypto/tink/shaded/protobuf/g;

    iget-object v2, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->b:Lcom/google/crypto/tink/shaded/protobuf/m;

    invoke-interface {v0, v1, v2}, LWH3;->a(Lcom/google/crypto/tink/shaded/protobuf/g;Lcom/google/crypto/tink/shaded/protobuf/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/F;

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->c:Lcom/google/crypto/tink/shaded/protobuf/F;

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->a:Lcom/google/crypto/tink/shaded/protobuf/g;

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->d:Lcom/google/crypto/tink/shaded/protobuf/g;

    goto :goto_0

    :cond_2
    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->c:Lcom/google/crypto/tink/shaded/protobuf/F;

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/g;->c:Lcom/google/crypto/tink/shaded/protobuf/g;

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->d:Lcom/google/crypto/tink/shaded/protobuf/g;
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->c:Lcom/google/crypto/tink/shaded/protobuf/F;

    sget-object p1, Lcom/google/crypto/tink/shaded/protobuf/g;->c:Lcom/google/crypto/tink/shaded/protobuf/g;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->d:Lcom/google/crypto/tink/shaded/protobuf/g;

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->d:Lcom/google/crypto/tink/shaded/protobuf/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->d:Lcom/google/crypto/tink/shaded/protobuf/g;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/g;->size()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->a:Lcom/google/crypto/tink/shaded/protobuf/g;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/g;->size()I

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->c:Lcom/google/crypto/tink/shaded/protobuf/F;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->c:Lcom/google/crypto/tink/shaded/protobuf/F;

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/F;->getSerializedSize()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public c(Lcom/google/crypto/tink/shaded/protobuf/F;)Lcom/google/crypto/tink/shaded/protobuf/F;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->a(Lcom/google/crypto/tink/shaded/protobuf/F;)V

    iget-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->c:Lcom/google/crypto/tink/shaded/protobuf/F;

    return-object p1
.end method

.method public d(Lcom/google/crypto/tink/shaded/protobuf/F;)Lcom/google/crypto/tink/shaded/protobuf/F;
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->c:Lcom/google/crypto/tink/shaded/protobuf/F;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->a:Lcom/google/crypto/tink/shaded/protobuf/g;

    iput-object v1, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->d:Lcom/google/crypto/tink/shaded/protobuf/g;

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->c:Lcom/google/crypto/tink/shaded/protobuf/F;

    return-object v0
.end method

.method public e()Lcom/google/crypto/tink/shaded/protobuf/g;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->d:Lcom/google/crypto/tink/shaded/protobuf/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->d:Lcom/google/crypto/tink/shaded/protobuf/g;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->a:Lcom/google/crypto/tink/shaded/protobuf/g;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->d:Lcom/google/crypto/tink/shaded/protobuf/g;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->d:Lcom/google/crypto/tink/shaded/protobuf/g;

    monitor-exit p0

    return-object v0

    :cond_2
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->c:Lcom/google/crypto/tink/shaded/protobuf/F;

    if-nez v0, :cond_3

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/g;->c:Lcom/google/crypto/tink/shaded/protobuf/g;

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->d:Lcom/google/crypto/tink/shaded/protobuf/g;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->c:Lcom/google/crypto/tink/shaded/protobuf/F;

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/F;->d()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object v0

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->d:Lcom/google/crypto/tink/shaded/protobuf/g;

    :goto_0
    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->d:Lcom/google/crypto/tink/shaded/protobuf/g;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/google/crypto/tink/shaded/protobuf/x;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/x;

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/x;->c:Lcom/google/crypto/tink/shaded/protobuf/F;

    iget-object v1, p1, Lcom/google/crypto/tink/shaded/protobuf/x;->c:Lcom/google/crypto/tink/shaded/protobuf/F;

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/x;->e()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->e()Lcom/google/crypto/tink/shaded/protobuf/g;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/g;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    if-eqz v0, :cond_4

    invoke-interface {v0}, LxT2;->getDefaultInstanceForType()Lcom/google/crypto/tink/shaded/protobuf/F;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/x;->c(Lcom/google/crypto/tink/shaded/protobuf/F;)Lcom/google/crypto/tink/shaded/protobuf/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    invoke-interface {v1}, LxT2;->getDefaultInstanceForType()Lcom/google/crypto/tink/shaded/protobuf/F;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/x;->c(Lcom/google/crypto/tink/shaded/protobuf/F;)Lcom/google/crypto/tink/shaded/protobuf/F;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
