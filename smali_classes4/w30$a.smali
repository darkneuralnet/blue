.class public final Lw30$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw30;->b(Lco/bird/android/model/BugReportAttachment;Ljava/io/File;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/io/File;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/api/response/BugReportUpdateFileResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Ljava/io/File;",
        "cachedFile",
        "Lio/reactivex/K;",
        "Lco/bird/api/response/BugReportUpdateFileResponse;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/io/File;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBugReportManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReportManagerImpl.kt\nco/bird/android/manager/bugreport/BugReportManagerImpl$uploadFile$2\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,103:1\n36#2:104\n*S KotlinDebug\n*F\n+ 1 BugReportManagerImpl.kt\nco/bird/android/manager/bugreport/BugReportManagerImpl$uploadFile$2\n*L\n87#1:104\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lw30;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lco/bird/android/model/BugReportAttachment;


# direct methods
.method public constructor <init>(Lw30;Ljava/lang/String;Lco/bird/android/model/BugReportAttachment;)V
    .locals 0

    iput-object p1, p0, Lw30$a;->g:Lw30;

    iput-object p2, p0, Lw30$a;->h:Ljava/lang/String;

    iput-object p3, p0, Lw30$a;->i:Lco/bird/android/model/BugReportAttachment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lw30$a;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/io/File;)Lio/reactivex/K;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/api/response/BugReportUpdateFileResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "cachedFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lw30$a;->g:Lw30;

    invoke-static {v0}, Lw30;->access$getUploadManager$p(Lw30;)Lef6;

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, p0, Lw30$a;->h:Ljava/lang/String;

    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v4

    const-string p1, "fromFile(this)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lef6$a;->putAssetUpload$default(Lef6;Ljava/util/Map;Ljava/lang/String;Landroid/net/Uri;ILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, Lco/bird/api/response/BugReportUpdateFileResponse;

    iget-object v1, p0, Lw30$a;->i:Lco/bird/android/model/BugReportAttachment;

    invoke-virtual {v1}, Lco/bird/android/model/BugReportAttachment;->getFileId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lco/bird/api/response/BugReportUpdateFileResponse;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lio/reactivex/c;->j0(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lw30$a$a;

    iget-object v1, p0, Lw30$a;->g:Lw30;

    invoke-direct {v0, v1}, Lw30$a$a;-><init>(Lw30;)V

    new-instance v1, Lv30;

    invoke-direct {v1, v0}, Lv30;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lw30$a;->b(Ljava/io/File;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
