.class public final Lcom/chuckerteam/chucker/internal/data/entity/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008B\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u00101\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u00107\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010>\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010B\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010H\u001a\u00020\u0006\u0012\u0008\u0010K\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008R\u0010SJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\t\u0010\t\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\u00062\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\u0015\u001a\u0004\u0008\u001b\u0010\u0017\"\u0004\u0008\u001c\u0010\u0019R$\u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R$\u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008%\u0010\u001f\u001a\u0004\u0008&\u0010!\"\u0004\u0008\'\u0010#R$\u0010+\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008)\u0010\u001f\u001a\u0004\u0008)\u0010!\"\u0004\u0008*\u0010#R$\u0010.\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u001f\u001a\u0004\u0008,\u0010!\"\u0004\u0008-\u0010#R$\u00101\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008&\u0010\u001f\u001a\u0004\u0008/\u0010!\"\u0004\u00080\u0010#R$\u00107\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u00102\u001a\u0004\u00083\u00104\"\u0004\u00085\u00106R$\u0010:\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u00083\u0010\u0015\u001a\u0004\u00088\u0010\u0017\"\u0004\u00089\u0010\u0019R$\u0010>\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008;\u0010\u0015\u001a\u0004\u0008<\u0010\u0017\"\u0004\u0008=\u0010\u0019R$\u0010B\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008?\u0010\u001f\u001a\u0004\u0008@\u0010!\"\u0004\u0008A\u0010#R\"\u0010H\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008C\u0010D\u001a\u0004\u0008\u001e\u0010E\"\u0004\u0008F\u0010GR$\u0010K\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008I\u0010\u001f\u001a\u0004\u0008%\u0010!\"\u0004\u0008J\u0010#R\u0011\u0010L\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010ER\u0011\u0010O\u001a\u00020M8F\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010NR\u0013\u0010P\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010!R\u0011\u0010Q\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010!\u00a8\u0006T"
    }
    d2 = {
        "Lcom/chuckerteam/chucker/internal/data/entity/a;",
        "",
        "",
        "bytes",
        "",
        "a",
        "",
        "encode",
        "c",
        "toString",
        "",
        "hashCode",
        "other",
        "equals",
        "J",
        "g",
        "()J",
        "setId",
        "(J)V",
        "id",
        "b",
        "Ljava/lang/Long;",
        "i",
        "()Ljava/lang/Long;",
        "setRequestDate",
        "(Ljava/lang/Long;)V",
        "requestDate",
        "getTookMs",
        "setTookMs",
        "tookMs",
        "d",
        "Ljava/lang/String;",
        "getProtocol",
        "()Ljava/lang/String;",
        "setProtocol",
        "(Ljava/lang/String;)V",
        "protocol",
        "e",
        "h",
        "setMethod",
        "method",
        "f",
        "setHost",
        "host",
        "getPath",
        "setPath",
        "path",
        "getScheme",
        "setScheme",
        "scheme",
        "Ljava/lang/Integer;",
        "j",
        "()Ljava/lang/Integer;",
        "setResponseCode",
        "(Ljava/lang/Integer;)V",
        "responseCode",
        "getRequestPayloadSize",
        "setRequestPayloadSize",
        "requestPayloadSize",
        "k",
        "getResponsePayloadSize",
        "setResponsePayloadSize",
        "responsePayloadSize",
        "l",
        "getError",
        "setError",
        "error",
        "m",
        "Z",
        "()Z",
        "setGraphQlDetected",
        "(Z)V",
        "graphQlDetected",
        "n",
        "setGraphQlOperationName",
        "graphQlOperationName",
        "isSsl",
        "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;",
        "()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;",
        "status",
        "durationString",
        "totalSizeString",
        "<init>",
        "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;)V",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHttpTransactionTuple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpTransactionTuple.kt\ncom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"
    }
.end annotation


# instance fields
.field public a:J

.field public b:Ljava/lang/Long;

.field public c:Ljava/lang/Long;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/Integer;

.field public j:Ljava/lang/Long;

.field public k:Ljava/lang/Long;

.field public l:Ljava/lang/String;

.field public m:Z

.field public n:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->a:J

    iput-object p3, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->b:Ljava/lang/Long;

    iput-object p4, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->c:Ljava/lang/Long;

    iput-object p5, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->e:Ljava/lang/String;

    iput-object p7, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->f:Ljava/lang/String;

    iput-object p8, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->g:Ljava/lang/String;

    iput-object p9, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->h:Ljava/lang/String;

    iput-object p10, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->i:Ljava/lang/Integer;

    iput-object p11, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->j:Ljava/lang/Long;

    iput-object p12, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->k:Ljava/lang/Long;

    iput-object p13, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->l:Ljava/lang/String;

    iput-boolean p14, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->m:Z

    iput-object p15, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->n:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(J)Ljava/lang/String;
    .locals 2

    sget-object v0, Lvx1;->a:Lvx1;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Lvx1;->a(JZ)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final b()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->c:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " ms"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final c(Z)Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->g:Ljava/lang/String;

    const-string v1, ""

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "https://www.example.com"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lokhttp3/HttpUrl;->Companion:Lokhttp3/HttpUrl$Companion;

    invoke-virtual {v2, v0}, Lokhttp3/HttpUrl$Companion;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    sget-object v1, Lwx1;->f:Lwx1$a;

    invoke-virtual {v1, v0, p1}, Lwx1$a;->c(Lokhttp3/HttpUrl;Z)Lwx1;

    move-result-object p1

    invoke-virtual {p1}, Lwx1;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->m:Z

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->n:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/chuckerteam/chucker/internal/data/entity/a;

    iget-wide v3, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->a:J

    iget-wide v5, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;->a:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->b:Ljava/lang/Long;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;->b:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->c:Ljava/lang/Long;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;->c:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->e:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;->e:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->f:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->g:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->h:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->i:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;->i:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->j:Ljava/lang/Long;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;->j:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->k:Ljava/lang/Long;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;->k:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->l:Ljava/lang/String;

    iget-object v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;->l:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->m:Z

    iget-boolean v3, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;->m:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->n:Ljava/lang/String;

    iget-object p1, p1, Lcom/chuckerteam/chucker/internal/data/entity/a;->n:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final g()J
    .locals 2

    iget-wide v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->a:J

    return-wide v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->e:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->b:Ljava/lang/Long;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->c:Ljava/lang/Long;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->d:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->e:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->f:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->g:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->h:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->i:Ljava/lang/Integer;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->j:Ljava/lang/Long;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->k:Ljava/lang/Long;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_9

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->l:Ljava/lang/String;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->m:Z

    if-eqz v1, :cond_b

    const/4 v1, 0x1

    :cond_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->n:Ljava/lang/String;

    if-nez v1, :cond_c

    goto :goto_b

    :cond_c
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    return v0
.end method

.method public final i()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->b:Ljava/lang/Long;

    return-object v0
.end method

.method public final j()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method public final k()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->l:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;->d:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->i:Ljava/lang/Integer;

    if-nez v0, :cond_1

    sget-object v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;->b:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;->c:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$a;

    :goto_0
    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->j:Ljava/lang/Long;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    :goto_0
    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->k:Ljava/lang/Long;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    :cond_1
    add-long/2addr v3, v1

    invoke-virtual {p0, v3, v4}, Lcom/chuckerteam/chucker/internal/data/entity/a;->a(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final m()Z
    .locals 3

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/data/entity/a;->h:Ljava/lang/String;

    const-string v1, "https"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/chuckerteam/chucker/internal/data/entity/a;->a:J

    iget-object v3, v0, Lcom/chuckerteam/chucker/internal/data/entity/a;->b:Ljava/lang/Long;

    iget-object v4, v0, Lcom/chuckerteam/chucker/internal/data/entity/a;->c:Ljava/lang/Long;

    iget-object v5, v0, Lcom/chuckerteam/chucker/internal/data/entity/a;->d:Ljava/lang/String;

    iget-object v6, v0, Lcom/chuckerteam/chucker/internal/data/entity/a;->e:Ljava/lang/String;

    iget-object v7, v0, Lcom/chuckerteam/chucker/internal/data/entity/a;->f:Ljava/lang/String;

    iget-object v8, v0, Lcom/chuckerteam/chucker/internal/data/entity/a;->g:Ljava/lang/String;

    iget-object v9, v0, Lcom/chuckerteam/chucker/internal/data/entity/a;->h:Ljava/lang/String;

    iget-object v10, v0, Lcom/chuckerteam/chucker/internal/data/entity/a;->i:Ljava/lang/Integer;

    iget-object v11, v0, Lcom/chuckerteam/chucker/internal/data/entity/a;->j:Ljava/lang/Long;

    iget-object v12, v0, Lcom/chuckerteam/chucker/internal/data/entity/a;->k:Ljava/lang/Long;

    iget-object v13, v0, Lcom/chuckerteam/chucker/internal/data/entity/a;->l:Ljava/lang/String;

    iget-boolean v14, v0, Lcom/chuckerteam/chucker/internal/data/entity/a;->m:Z

    iget-object v15, v0, Lcom/chuckerteam/chucker/internal/data/entity/a;->n:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v16, v15

    const-string v15, "HttpTransactionTuple(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", requestDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tookMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", host="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", path="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", scheme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", responseCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", requestPayloadSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", responsePayloadSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", graphQlDetected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", graphQlOperationName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
