.class public final Lqj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqj0$a;,
        Lqj0$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 #2\u00020\u0001:\u0002\u0008\rB\u0011\u0008\u0002\u0012\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\t\u00a8\u0006$"
    }
    d2 = {
        "Lqj0;",
        "Lokhttp3/Interceptor;",
        "Lokhttp3/Interceptor$Chain;",
        "chain",
        "Lokhttp3/Response;",
        "intercept",
        "",
        "",
        "a",
        "Ljava/util/Set;",
        "headersToRedact",
        "",
        "LQY;",
        "b",
        "Ljava/util/List;",
        "decoders",
        "Lmj0;",
        "c",
        "Lmj0;",
        "collector",
        "LbJ4;",
        "d",
        "LbJ4;",
        "requestProcessor",
        "LKM4;",
        "e",
        "LKM4;",
        "responseProcessor",
        "",
        "f",
        "skipPaths",
        "Lqj0$a;",
        "builder",
        "<init>",
        "(Lqj0$a;)V",
        "g",
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
        "SMAP\nChuckerInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChuckerInterceptor.kt\ncom/chuckerteam/chucker/api/ChuckerInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,198:1\n1747#2,3:199\n*S KotlinDebug\n*F\n+ 1 ChuckerInterceptor.kt\ncom/chuckerteam/chucker/api/ChuckerInterceptor\n*L\n74#1:199,3\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lqj0$b;

.field public static final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LZU3;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LQY;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lmj0;

.field public final d:LbJ4;

.field public final e:LKM4;

.field public final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqj0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqj0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lqj0;->g:Lqj0$b;

    sget-object v0, LZU3;->a:LZU3;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lqj0;->h:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lqj0$a;)V
    .locals 11

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lqj0$a;->i()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lqj0;->a:Ljava/util/Set;

    invoke-virtual {p1}, Lqj0$a;->h()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    sget-object v2, Lqj0;->h:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v8

    iput-object v8, p0, Lqj0;->b:Ljava/util/List;

    invoke-virtual {p1}, Lqj0$a;->e()Lmj0;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lmj0;

    invoke-virtual {p1}, Lqj0$a;->f()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Lmj0;-><init>(Landroid/content/Context;ZLKN4$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    move-object v9, v1

    iput-object v9, p0, Lqj0;->c:Lmj0;

    new-instance v10, LbJ4;

    invoke-virtual {p1}, Lqj0$a;->f()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Lqj0$a;->j()J

    move-result-wide v4

    move-object v1, v10

    move-object v3, v9

    move-object v6, v0

    move-object v7, v8

    invoke-direct/range {v1 .. v7}, LbJ4;-><init>(Landroid/content/Context;Lmj0;JLjava/util/Set;Ljava/util/List;)V

    iput-object v10, p0, Lqj0;->d:LbJ4;

    new-instance v10, LKM4;

    invoke-virtual {p1}, Lqj0$a;->d()Lc80;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Lpj0;

    invoke-direct {v1, p1}, Lpj0;-><init>(Lqj0$a;)V

    :cond_1
    move-object v3, v1

    invoke-virtual {p1}, Lqj0$a;->j()J

    move-result-wide v4

    invoke-virtual {p1}, Lqj0$a;->c()Z

    move-result v7

    move-object v1, v10

    move-object v2, v9

    move-object v6, v0

    invoke-direct/range {v1 .. v8}, LKM4;-><init>(Lmj0;Lc80;JLjava/util/Set;ZLjava/util/List;)V

    iput-object v10, p0, Lqj0;->e:LKM4;

    invoke-virtual {p1}, Lqj0$a;->k()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lqj0;->f:Ljava/util/Set;

    invoke-virtual {p1}, Lqj0$a;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ljj0;->a:Ljj0;

    invoke-virtual {p1}, Lqj0$a;->f()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljj0;->a(Landroid/content/Context;)V

    :cond_2
    return-void
.end method

.method public synthetic constructor <init>(Lqj0$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lqj0;-><init>(Lqj0$a;)V

    return-void
.end method

.method public static synthetic b(Lqj0$a;)Ljava/io/File;
    .locals 0

    invoke-static {p0}, Lqj0;->c(Lqj0$a;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lqj0$a;)Ljava/io/File;
    .locals 1

    const-string v0, "$builder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lqj0$a;->f()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    invoke-direct {v0}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;-><init>()V

    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v1

    sget-object v2, Ljj0;->a:Ljj0;

    invoke-virtual {v2}, Ljj0;->d()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    iget-object v2, p0, Lqj0;->f:Ljava/util/Set;

    instance-of v4, v2, Ljava/util/Collection;

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    move v2, v3

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v6

    invoke-virtual {v6}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v2, v5

    :goto_0
    if-nez v2, :cond_3

    move v3, v5

    :cond_3
    if-eqz v3, :cond_4

    iget-object v2, p0, Lqj0;->d:LbJ4;

    invoke-virtual {v2, v1, v0}, LbJ4;->c(Lokhttp3/Request;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V

    :cond_4
    :try_start_0
    invoke-interface {p1, v1}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_5

    iget-object v1, p0, Lqj0;->e:LKM4;

    invoke-virtual {v1, p1, v0}, LKM4;->f(Lokhttp3/Response;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)Lokhttp3/Response;

    move-result-object p1

    :cond_5
    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->setError(Ljava/lang/String;)V

    iget-object v1, p0, Lqj0;->c:Lmj0;

    invoke-virtual {v1, v0}, Lmj0;->e(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V

    throw p1
.end method
