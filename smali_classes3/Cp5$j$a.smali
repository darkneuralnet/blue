.class public final LCp5$j$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCp5$j;->c(Lkotlin/Pair;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/net/Uri;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/api/response/WireSignedUrl;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Landroid/net/Uri;",
        "photo",
        "Lio/reactivex/K;",
        "Lco/bird/api/response/WireSignedUrl;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Landroid/net/Uri;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LCp5;


# direct methods
.method public constructor <init>(LCp5;)V
    .locals 0

    iput-object p1, p0, LCp5$j$a;->g:LCp5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/net/Uri;)Lio/reactivex/K;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/api/response/WireSignedUrl;",
            ">;"
        }
    .end annotation

    const-string v0, "photo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LCp5$j$a;->g:LCp5;

    invoke-static {v0}, LCp5;->access$getLocalAssetManager$p(LCp5;)Lsu2;

    move-result-object v0

    invoke-static {p1}, LFp5;->access$file(Landroid/net/Uri;)Ljava/io/File;

    move-result-object p1

    sget-object v1, Lco/bird/android/model/constant/AssetManagerType;->REPAIR:Lco/bird/android/model/constant/AssetManagerType;

    invoke-interface {v0, p1, v1}, Lsu2;->i(Ljava/io/File;Lco/bird/android/model/constant/AssetManagerType;)Lio/reactivex/F;

    move-result-object p1

    iget-object v0, p0, LCp5$j$a;->g:LCp5;

    invoke-static {v0}, LCp5;->access$getUi$p(LCp5;)LIp5;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, LsD;->progress$default(Lio/reactivex/F;LS74;IILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, LCp5$j$a;->a(Landroid/net/Uri;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
