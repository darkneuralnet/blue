.class public final LM30$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM30$c;->b(Lkotlin/Triple;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/BugReportNewResponse;",
        "Ljava/util/List<",
        "+",
        "LM30$a;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/api/response/BugReportNewResponse;",
        "response",
        "",
        "LM30$a;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/BugReportNewResponse;)Ljava/util/List;"
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
        "SMAP\nBugReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReportPresenter.kt\nco/bird/android/lib/shaketoreport/BugReportPresenter$onCreate$10$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1549#2:197\n1620#2,3:198\n*S KotlinDebug\n*F\n+ 1 BugReportPresenter.kt\nco/bird/android/lib/shaketoreport/BugReportPresenter$onCreate$10$2\n*L\n101#1:197\n101#1:198,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/io/File;

.field public final synthetic h:Ljava/io/File;

.field public final synthetic i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/io/File;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/io/File;",
            "Ljava/util/List<",
            "+",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LM30$c$a;->g:Ljava/io/File;

    iput-object p2, p0, LM30$c$a;->h:Ljava/io/File;

    iput-object p3, p0, LM30$c$a;->i:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/BugReportNewResponse;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/BugReportNewResponse;",
            ")",
            "Ljava/util/List<",
            "LM30$a;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "submit report response: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x2

    new-array v0, v0, [LM30$a;

    new-instance v2, LM30$a;

    iget-object v3, p0, LM30$c$a;->g:Ljava/io/File;

    const-string v4, "harFile"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    const-string v6, "application/json"

    invoke-virtual {v5, v6}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v5

    iget-object v6, p0, LM30$c$a;->g:Ljava/io/File;

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v6}, LQ30;->access$attachmentForFile(Lco/bird/api/response/BugReportNewResponse;Ljava/io/File;)Lco/bird/android/model/BugReportAttachment;

    move-result-object v4

    const/4 v6, 0x1

    invoke-direct {v2, v3, v5, v4, v6}, LM30$a;-><init>(Ljava/io/File;Lokhttp3/MediaType;Lco/bird/android/model/BugReportAttachment;Z)V

    aput-object v2, v0, v1

    iget-object v8, p0, LM30$c$a;->h:Ljava/io/File;

    if-eqz v8, :cond_0

    new-instance v2, LM30$a;

    invoke-static {v8}, LQ30;->access$mediaType(Ljava/io/File;)Lokhttp3/MediaType;

    move-result-object v9

    iget-object v3, p0, LM30$c$a;->h:Ljava/io/File;

    invoke-static {p1, v3}, LQ30;->access$attachmentForFile(Lco/bird/api/response/BugReportNewResponse;Ljava/io/File;)Lco/bird/android/model/BugReportAttachment;

    move-result-object v10

    const/4 v11, 0x0

    const/16 v12, 0x8

    const/4 v13, 0x0

    move-object v7, v2

    invoke-direct/range {v7 .. v13}, LM30$a;-><init>(Ljava/io/File;Lokhttp3/MediaType;Lco/bird/android/model/BugReportAttachment;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    aput-object v2, v0, v6

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iget-object v2, p0, LM30$c$a;->i:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/io/File;

    new-instance v5, LM30$a;

    invoke-static {v4}, LQ30;->access$mediaType(Ljava/io/File;)Lokhttp3/MediaType;

    move-result-object v6

    invoke-static {p1, v4}, LQ30;->access$attachmentForFile(Lco/bird/api/response/BugReportNewResponse;Ljava/io/File;)Lco/bird/android/model/BugReportAttachment;

    move-result-object v7

    invoke-direct {v5, v4, v6, v7, v1}, LM30$a;-><init>(Ljava/io/File;Lokhttp3/MediaType;Lco/bird/android/model/BugReportAttachment;Z)V

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/BugReportNewResponse;

    invoke-virtual {p0, p1}, LM30$c$a;->a(Lco/bird/api/response/BugReportNewResponse;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
