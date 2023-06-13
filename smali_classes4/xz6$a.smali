.class public final Lxz6$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxz6;->a(Ljava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LwC6;",
        "LHM4<",
        "Lco/bird/api/response/WireSignedUrl;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LwC6;",
        "response",
        "LHM4;",
        "Lco/bird/api/response/WireSignedUrl;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LwC6;)LHM4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lxz6$a;->g:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LwC6;)LHM4;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwC6;",
            ")",
            "LHM4<",
            "Lco/bird/api/response/WireSignedUrl;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LwC6;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lxz6$a;->g:Ljava/lang/String;

    new-instance v10, Lco/bird/api/response/WireSignedUrl;

    new-instance v11, Lco/bird/android/model/wire/WireAsset;

    const-wide/16 v3, 0x0

    invoke-virtual {p1}, LwC6;->b()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x1a

    const/4 v9, 0x0

    move-object v1, v11

    invoke-direct/range {v1 .. v9}, Lco/bird/android/model/wire/WireAsset;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v10, v11, v0}, Lco/bird/api/response/WireSignedUrl;-><init>(Lco/bird/android/model/wire/WireAsset;Ljava/lang/String;)V

    invoke-static {v10}, LHM4;->j(Ljava/lang/Object;)LHM4;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, Lokhttp3/ResponseBody;->Companion:Lokhttp3/ResponseBody$Companion;

    const/4 v0, 0x0

    const-string v1, "No url returned for given assetId from web archive client lookup"

    invoke-virtual {p1, v0, v1}, Lokhttp3/ResponseBody$Companion;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;

    move-result-object p1

    const/16 v0, 0x194

    invoke-static {v0, p1}, LHM4;->c(ILokhttp3/ResponseBody;)LHM4;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LwC6;

    invoke-virtual {p0, p1}, Lxz6$a;->a(LwC6;)LHM4;

    move-result-object p1

    return-object p1
.end method
