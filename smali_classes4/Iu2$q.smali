.class public final LIu2$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIu2;->i(Ljava/io/File;Lco/bird/android/model/constant/AssetManagerType;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/WireSignedUrl;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/api/response/WireSignedUrl;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/WireSignedUrl;",
        "wireSignedUrl",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/api/response/WireSignedUrl;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LIu2;

.field public final synthetic h:Ljava/io/File;


# direct methods
.method public constructor <init>(LIu2;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, LIu2$q;->g:LIu2;

    iput-object p2, p0, LIu2$q;->h:Ljava/io/File;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/api/response/WireSignedUrl;)Lco/bird/api/response/WireSignedUrl;
    .locals 0

    invoke-static {p0}, LIu2$q;->c(Lco/bird/api/response/WireSignedUrl;)Lco/bird/api/response/WireSignedUrl;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lco/bird/api/response/WireSignedUrl;)Lco/bird/api/response/WireSignedUrl;
    .locals 1

    const-string v0, "$wireSignedUrl"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/api/response/WireSignedUrl;)Lio/reactivex/K;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/WireSignedUrl;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/api/response/WireSignedUrl;",
            ">;"
        }
    .end annotation

    const-string v0, "wireSignedUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIu2$q;->g:LIu2;

    invoke-static {v0}, LIu2;->access$getS3Manager$p(LIu2;)Lgg5;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/api/response/WireSignedUrl;->getUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LIu2$q;->h:Ljava/io/File;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lgg5$a;->upload$default(Lgg5;Ljava/lang/String;Ljava/io/File;Lokhttp3/MediaType;ILjava/lang/Object;)Lio/reactivex/c;

    move-result-object v0

    new-instance v1, LKu2;

    invoke-direct {v1, p1}, LKu2;-><init>(Lco/bird/api/response/WireSignedUrl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/c;->i0(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/WireSignedUrl;

    invoke-virtual {p0, p1}, LIu2$q;->b(Lco/bird/api/response/WireSignedUrl;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
