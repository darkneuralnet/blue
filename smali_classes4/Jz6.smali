.class public final LJz6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAz6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0008\u001a\u00020\u0007*\u00020\u0006J\u0014\u0010\u000b\u001a\u00020\u0007*\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\tJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0002H\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0013R\'\u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00160\u00158VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u000f\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00160\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\"\u0010#\u001a\u0010\u0012\u000c\u0012\n  *\u0004\u0018\u00010\u00020\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006&"
    }
    d2 = {
        "LJz6;",
        "LAz6;",
        "",
        "name",
        "Lio/reactivex/c;",
        "b",
        "Lco/bird/android/model/LocalAsset;",
        "Lvz6;",
        "j",
        "LNz6;",
        "state",
        "k",
        "url",
        "g",
        "Landroid/content/Context;",
        "a",
        "Landroid/content/Context;",
        "context",
        "Lsu2;",
        "Lsu2;",
        "localAssetManager",
        "LZ84;",
        "",
        "c",
        "Lkotlin/Lazy;",
        "()LZ84;",
        "availableArchives",
        "La94;",
        "d",
        "La94;",
        "mutableWebArchives",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "e",
        "Lio/reactivex/subjects/d;",
        "refreshWebArchiveSubject",
        "<init>",
        "(Landroid/content/Context;Lsu2;)V",
        "web-archive_release"
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
        "SMAP\nWebArchiveManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebArchiveManagerImpl.kt\nco/bird/android/manager/web/WebArchiveManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,136:1\n237#2:137\n288#3,2:138\n11345#4:140\n11680#4,3:141\n*S KotlinDebug\n*F\n+ 1 WebArchiveManagerImpl.kt\nco/bird/android/manager/web/WebArchiveManagerImpl\n*L\n78#1:137\n83#1:138,2\n102#1:140\n102#1:141,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lsu2;

.field public final c:Lkotlin/Lazy;

.field public final d:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Ljava/util/List<",
            "Lvz6;",
            ">;>;"
        }
    .end annotation
.end field

.field public final e:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lsu2;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localAssetManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJz6;->a:Landroid/content/Context;

    iput-object p2, p0, LJz6;->b:Lsu2;

    new-instance p1, LJz6$b;

    invoke-direct {p1, p0}, LJz6$b;-><init>(LJz6;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LJz6;->c:Lkotlin/Lazy;

    sget-object p1, La94;->h:La94$a;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, p2, v0, v1, v0}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p1

    iput-object p1, p0, LJz6;->d:La94;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object p1

    const-string p2, "create<String>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LJz6;->e:Lio/reactivex/subjects/d;

    new-instance p2, LJz6$a;

    invoke-direct {p2, p0}, LJz6$a;-><init>(LJz6;)V

    new-instance v0, LBz6;

    invoke-direct {v0, p2}, LBz6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    const-string p2, "refreshWebArchiveSubject\u2026onErrorComplete()\n      }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string v0, "UNBOUND"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public static final synthetic access$getLocalAssetManager$p(LJz6;)Lsu2;
    .locals 0

    iget-object p0, p0, LJz6;->b:Lsu2;

    return-object p0
.end method

.method public static final synthetic access$getMutableWebArchives$p(LJz6;)La94;
    .locals 0

    iget-object p0, p0, LJz6;->d:La94;

    return-object p0
.end method

.method public static synthetic c(Lvz6;Lvz6;)I
    .locals 0

    invoke-static {p0, p1}, LJz6;->i(Lvz6;Lvz6;)I

    move-result p0

    return p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LJz6;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LJz6;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LJz6;->h(LJz6;Ljava/lang/String;)V

    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final h(LJz6;Ljava/lang/String;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJz6;->d:La94;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p0, p1, v1, v2, v1}, LJz6;->toWebArchive$default(LJz6;Ljava/lang/String;LNz6;ILjava/lang/Object;)Lvz6;

    move-result-object v1

    new-instance v2, LDz6;

    invoke-direct {v2}, LDz6;-><init>()V

    invoke-static {v0, v1, v2}, Lb94;->b(La94;Ljava/lang/Object;Ljava/util/Comparator;)V

    iget-object p0, p0, LJz6;->e:Lio/reactivex/subjects/d;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public static final i(Lvz6;Lvz6;)I
    .locals 0

    invoke-virtual {p0}, Lvz6;->e()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lvz6;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static synthetic toWebArchive$default(LJz6;Ljava/lang/String;LNz6;ILjava/lang/Object;)Lvz6;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    sget-object p2, LNz6;->e:LNz6;

    :cond_0
    invoke-virtual {p0, p1, p2}, LJz6;->k(Ljava/lang/String;LNz6;)Lvz6;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/util/List<",
            "Lvz6;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LJz6;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LCz6;

    invoke-direct {v0, p0, p1}, LCz6;-><init>(LJz6;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/c;->G(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "fromAction {\n      mutab\u2026ubject.onNext(name)\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "|"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "SHA-1"

    invoke-static {p2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p2

    sget-object v0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v0, "this as java.lang.String).getBytes(charset)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    const-string p2, "getInstance(\"SHA-1\")\n   \u2026digest(str.toByteArray())"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    array-length p2, p1

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(I)V

    array-length p2, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p2, :cond_0

    aget-byte v3, p1, v2

    sget-object v4, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    aput-object v3, v5, v1

    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const-string v4, "%02X"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "format(format, *args)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3e

    const/4 v8, 0x0

    invoke-static/range {v0 .. v8}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final j(Lco/bird/android/model/LocalAsset;)Lvz6;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvz6;

    invoke-virtual {p1}, Lco/bird/android/model/LocalAsset;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/LocalAsset;->getDownloadUrl()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    invoke-virtual {p0, v1, v2}, LJz6;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/LocalAsset;->getId()Ljava/lang/String;

    move-result-object v3

    sget-object v1, LGm;->c:LGm$a;

    invoke-virtual {p1}, Lco/bird/android/model/LocalAsset;->getMediaType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, LGm$a;->a(Ljava/lang/String;)LGm;

    move-result-object v1

    invoke-virtual {v1}, LGm;->c()Z

    move-result v4

    const/high16 v5, 0x42c80000    # 100.0f

    sget-object v6, LNz6;->b:LNz6;

    invoke-virtual {p1}, Lco/bird/android/model/LocalAsset;->getDownloadedAt()Lorg/joda/time/DateTime;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/LocalAsset;->getDownloadUrl()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/LocalAsset;->getFile()Ljava/io/File;

    move-result-object v11

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lvz6;-><init>(Ljava/lang/String;Ljava/lang/String;ZFLNz6;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/io/File;)V

    return-object v0
.end method

.method public final k(Ljava/lang/String;LNz6;)Lvz6;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvz6;

    const-string v2, ""

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v7

    const-string v1, "now()"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v1, v0

    move-object v3, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v11}, Lvz6;-><init>(Ljava/lang/String;Ljava/lang/String;ZFLNz6;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/io/File;)V

    return-object v0
.end method
