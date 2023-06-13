.class public final Lyl1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001aA\u0010\u000c\u001a\u00020\u000b*\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "Ljava/io/File;",
        "LZC6;",
        "workManager",
        "Ljava/lang/Class;",
        "Landroidx/work/c;",
        "workerClass",
        "Landroidx/work/b;",
        "inputData",
        "Lco/bird/android/model/Folder;",
        "destFolder",
        "",
        "a",
        "([Ljava/io/File;LZC6;Ljava/lang/Class;Landroidx/work/b;Lco/bird/android/model/Folder;)V",
        "image-upload_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFile+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 File+.kt\nco/bird/android/imageupload/File_Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,39:1\n11335#2:40\n11670#2,3:41\n*S KotlinDebug\n*F\n+ 1 File+.kt\nco/bird/android/imageupload/File_Kt\n*L\n23#1:40\n23#1:41,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a([Ljava/io/File;LZC6;Ljava/lang/Class;Landroidx/work/b;Lco/bird/android/model/Folder;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/io/File;",
            "LZC6;",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/c;",
            ">;",
            "Landroidx/work/b;",
            "Lco/bird/android/model/Folder;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destFolder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    new-instance v4, LFh3$a;

    const-class v5, Lco/bird/android/imageupload/worker/ImageUploadWorker;

    invoke-direct {v4, v5}, LFh3$a;-><init>(Ljava/lang/Class;)V

    new-instance v5, Llz0$a;

    invoke-direct {v5}, Llz0$a;-><init>()V

    sget-object v6, LS73;->c:LS73;

    invoke-virtual {v5, v6}, Llz0$a;->b(LS73;)Llz0$a;

    move-result-object v5

    invoke-virtual {v5}, Llz0$a;->a()Llz0;

    move-result-object v5

    invoke-virtual {v4, v5}, LEG6$a;->h(Llz0;)LEG6$a;

    move-result-object v4

    check-cast v4, LFh3$a;

    sget-object v5, Lco/bird/android/imageupload/worker/ImageUploadWorker;->i:Lco/bird/android/imageupload/worker/ImageUploadWorker$a;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    const-string v6, "it.absolutePath"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, Lco/bird/android/model/Folder;->path()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v3, v6}, Lco/bird/android/imageupload/worker/ImageUploadWorker$a;->a(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/b;

    move-result-object v3

    invoke-virtual {v4, v3}, LEG6$a;->k(Landroidx/work/b;)LEG6$a;

    move-result-object v3

    check-cast v3, LFh3$a;

    invoke-virtual {v3}, LEG6$a;->a()LEG6;

    move-result-object v3

    check-cast v3, LFh3;

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, LFh3$a;

    invoke-direct {p0, p2}, LFh3$a;-><init>(Ljava/lang/Class;)V

    const-class p2, Landroidx/work/ArrayCreatingInputMerger;

    invoke-virtual {p0, p2}, LFh3$a;->n(Ljava/lang/Class;)LFh3$a;

    move-result-object p0

    new-instance p2, Llz0$a;

    invoke-direct {p2}, Llz0$a;-><init>()V

    sget-object p4, LS73;->c:LS73;

    invoke-virtual {p2, p4}, Llz0$a;->b(LS73;)Llz0$a;

    move-result-object p2

    invoke-virtual {p2}, Llz0$a;->a()Llz0;

    move-result-object p2

    invoke-virtual {p0, p2}, LEG6$a;->h(Llz0;)LEG6$a;

    move-result-object p0

    check-cast p0, LFh3$a;

    invoke-virtual {p0, p3}, LEG6$a;->k(Landroidx/work/b;)LEG6$a;

    move-result-object p0

    check-cast p0, LFh3$a;

    invoke-virtual {p0}, LEG6$a;->a()LEG6;

    move-result-object p0

    check-cast p0, LFh3;

    invoke-virtual {p1, v0}, LZC6;->a(Ljava/util/List;)LIC6;

    move-result-object p1

    invoke-virtual {p1, p0}, LIC6;->b(LFh3;)LIC6;

    move-result-object p0

    invoke-virtual {p0}, LIC6;->a()LXh3;

    return-void
.end method
