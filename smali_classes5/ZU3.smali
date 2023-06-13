.class public final LZU3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQY;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000f\u001a\u0004\u0018\u00010\u0006*\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u00a8\u0006\u0012"
    }
    d2 = {
        "LZU3;",
        "LQY;",
        "Lokhttp3/Request;",
        "request",
        "LM70;",
        "body",
        "",
        "a",
        "Lokhttp3/Response;",
        "response",
        "b",
        "Lokhttp3/Headers;",
        "headers",
        "Lokhttp3/MediaType;",
        "contentType",
        "c",
        "<init>",
        "()V",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LZU3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LZU3;

    invoke-direct {v0}, LZU3;-><init>()V

    sput-object v0, LZU3;->a:LZU3;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lokhttp3/Request;LM70;)Ljava/lang/String;
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    move-result-object v0

    invoke-virtual {p1}, Lokhttp3/Request;->body()Lokhttp3/RequestBody;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lokhttp3/RequestBody;->contentType()Lokhttp3/MediaType;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p2, v0, p1}, LZU3;->c(LM70;Lokhttp3/Headers;Lokhttp3/MediaType;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Lokhttp3/Response;LM70;)Ljava/lang/String;
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v0

    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p2, v0, p1}, LZU3;->c(LM70;Lokhttp3/Headers;Lokhttp3/MediaType;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final c(LM70;Lokhttp3/Headers;Lokhttp3/MediaType;)Ljava/lang/String;
    .locals 1

    invoke-static {p2}, LNe3;->e(Lokhttp3/Headers;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    invoke-static {p1}, LPe3;->c(LM70;)Z

    move-result p2

    if-eqz p2, :cond_2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    invoke-static {p3, v0, p2, v0}, Lokhttp3/MediaType;->charset$default(Lokhttp3/MediaType;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/nio/charset/Charset;

    move-result-object p2

    if-nez p2, :cond_1

    :cond_0
    sget-object p2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    :cond_1
    invoke-virtual {p1, p2}, LM70;->u(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method
