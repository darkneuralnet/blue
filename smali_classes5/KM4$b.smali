.class public final LKM4$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVH4$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKM4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u000e\u0010\u000c\u001a\u0004\u0018\u00010\u000b*\u00020\u0002H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "LKM4$b;",
        "LVH4$a;",
        "Ljava/io/File;",
        "file",
        "",
        "sourceByteCount",
        "",
        "a",
        "Ljava/io/IOException;",
        "exception",
        "b",
        "Li30;",
        "c",
        "Lokhttp3/Response;",
        "Lokhttp3/Response;",
        "response",
        "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
        "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
        "transaction",
        "<init>",
        "(LKM4;Lokhttp3/Response;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V",
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
        "SMAP\nResponseProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseProcessor.kt\ncom/chuckerteam/chucker/internal/support/ResponseProcessor$ResponseReportingSinkCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lokhttp3/Response;

.field public final b:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

.field public final synthetic c:LKM4;


# direct methods
.method public constructor <init>(LKM4;Lokhttp3/Response;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Response;",
            "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
            ")V"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transaction"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LKM4$b;->c:LKM4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LKM4$b;->a:Lokhttp3/Response;

    iput-object p3, p0, LKM4$b;->b:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;J)V
    .locals 4

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LKM4$b;->c(Ljava/io/File;)Li30;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LKM4$b;->c:LKM4;

    iget-object v2, p0, LKM4$b;->a:Lokhttp3/Response;

    iget-object v3, p0, LKM4$b;->b:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    invoke-static {v1, v2, v0, v3}, LKM4;->b(LKM4;Lokhttp3/Response;Li30;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V

    :cond_0
    iget-object v0, p0, LKM4$b;->b:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->setResponsePayloadSize(Ljava/lang/Long;)V

    iget-object p2, p0, LKM4$b;->c:LKM4;

    invoke-static {p2}, LKM4;->a(LKM4;)Lmj0;

    move-result-object p2

    iget-object p3, p0, LKM4$b;->b:Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    invoke-virtual {p2, p3}, Lmj0;->e(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    :cond_1
    return-void
.end method

.method public b(Ljava/io/File;Ljava/io/IOException;)V
    .locals 1

    const-string p1, "exception"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LEx2;->a:LEx2$a;

    const-string v0, "Failed to read response payload"

    invoke-virtual {p1, v0, p2}, LEx2$a;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final c(Ljava/io/File;)Li30;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1}, LOe3;->k(Ljava/io/File;)LAN5;

    move-result-object p1

    iget-object v1, p0, LKM4$b;->a:Lokhttp3/Response;

    invoke-virtual {v1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v1

    invoke-static {p1, v1}, LNe3;->i(LAN5;Lokhttp3/Headers;)LAN5;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v1, Li30;

    invoke-direct {v1}, Li30;-><init>()V

    invoke-virtual {v1, p1}, Li30;->R2(LAN5;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p1, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-static {p1, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    sget-object v1, LEx2;->a:LEx2$a;

    const-string v2, "Response payload couldn\'t be processed"

    invoke-virtual {v1, v2, p1}, LEx2$a;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object v0
.end method
