.class public final Lxz6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQo;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016R\u0014\u0010\u000e\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "Lxz6;",
        "LQo;",
        "",
        "assetId",
        "Lio/reactivex/F;",
        "LHM4;",
        "Lco/bird/api/response/WireSignedUrl;",
        "a",
        "Ljava/io/File;",
        "file",
        "",
        "c",
        "Lyz6;",
        "Lyz6;",
        "webArchiveClient",
        "<init>",
        "(Lyz6;)V",
        "web-archive_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lyz6;


# direct methods
.method public constructor <init>(Lyz6;)V
    .locals 1

    const-string v0, "webArchiveClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxz6;->a:Lyz6;

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LHM4;
    .locals 0

    invoke-static {p0, p1}, Lxz6;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LHM4;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LHM4;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LHM4;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/api/response/WireSignedUrl;",
            ">;>;"
        }
    .end annotation

    const-string v0, "assetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lxz6;->a:Lyz6;

    invoke-interface {v0, p1}, Lyz6;->a(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lxz6$a;

    invoke-direct {v1, p1}, Lxz6$a;-><init>(Ljava/lang/String;)V

    new-instance p1, Lwz6;

    invoke-direct {p1, v1}, Lwz6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "assetId: String): Single\u2026 client lookup\"))\n      }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public c(Ljava/io/File;)Ljava/lang/Void;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lkotlin/NotImplementedError;

    const-string v0, "WebArchiveAssetManager does not currently support uploading assets"

    invoke-direct {p1, v0}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic createAsset(Ljava/io/File;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1}, Lxz6;->c(Ljava/io/File;)Ljava/lang/Void;

    move-result-object p1

    check-cast p1, Lio/reactivex/F;

    return-object p1
.end method
