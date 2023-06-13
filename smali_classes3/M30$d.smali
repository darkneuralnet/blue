.class public final LM30$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM30;->t(Ljava/io/File;Ljava/io/File;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "LM30$a;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "LM30$a;",
        "attachmentData",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Ljava/util/List;)Lio/reactivex/h;"
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
        "SMAP\nBugReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReportPresenter.kt\nco/bird/android/lib/shaketoreport/BugReportPresenter$onCreate$11\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1549#2:197\n1620#2,3:198\n*S KotlinDebug\n*F\n+ 1 BugReportPresenter.kt\nco/bird/android/lib/shaketoreport/BugReportPresenter$onCreate$11\n*L\n109#1:197\n109#1:198,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LM30;


# direct methods
.method public constructor <init>(LM30;)V
    .locals 0

    iput-object p1, p0, LM30$d;->g:LM30;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LM30;Ljava/io/File;Z)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1, p2}, LM30$d;->e(LM30;Ljava/io/File;Z)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LM30$d;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final e(LM30;Ljava/io/File;Z)Lio/reactivex/h;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, LM30;->access$deleteAfterUploadIfNeeded(LM30;Ljava/io/File;Z)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/util/List;)Lio/reactivex/h;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LM30$a;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "attachmentData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, LM30$d;->g:LM30;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LM30$a;

    invoke-virtual {v2}, LM30$a;->a()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2}, LM30$a;->b()Lokhttp3/MediaType;

    invoke-virtual {v2}, LM30$a;->c()Lco/bird/android/model/BugReportAttachment;

    move-result-object v4

    invoke-virtual {v2}, LM30$a;->d()Z

    move-result v2

    if-eqz v4, :cond_0

    invoke-static {v0}, LM30;->access$getBugReportManager$p(LM30;)Lr30;

    move-result-object v5

    invoke-interface {v5, v4, v3}, Lr30;->b(Lco/bird/android/model/BugReportAttachment;Ljava/io/File;)Lio/reactivex/F;

    move-result-object v5

    invoke-virtual {v5}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v5

    const-wide/16 v6, 0x1

    invoke-virtual {v5, v6, v7}, Lio/reactivex/c;->U(J)Lio/reactivex/c;

    move-result-object v5

    new-instance v6, LM30$d$a;

    invoke-direct {v6, v4}, LM30$d$a;-><init>(Lco/bird/android/model/BugReportAttachment;)V

    new-instance v4, LO30;

    invoke-direct {v4, v6}, LO30;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v5, v4}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v4

    invoke-virtual {v4}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v4

    new-instance v5, LP30;

    invoke-direct {v5, v0, v3, v2}, LP30;-><init>(LM30;Ljava/io/File;Z)V

    invoke-static {v5}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object v4

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_1

    invoke-static {v0, v3, v2}, LM30;->access$deleteAfterUploadIfNeeded(LM30;Ljava/io/File;Z)Lio/reactivex/c;

    move-result-object v4

    :cond_1
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v1}, Lio/reactivex/c;->L(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LM30$d;->c(Ljava/util/List;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
