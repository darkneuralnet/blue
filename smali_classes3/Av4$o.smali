.class public final LAv4$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAv4;->V(LJv4;)V
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
        "Lco/bird/android/model/FileUploadReceipt;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Ljava/io/File;",
        "file",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/FileUploadReceipt;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Ljava/io/File;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LAv4;


# direct methods
.method public constructor <init>(LAv4;)V
    .locals 0

    iput-object p1, p0, LAv4$o;->g:LAv4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LAv4$o;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, LAv4$o;->d(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Ljava/io/File;)Lio/reactivex/K;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/FileUploadReceipt;",
            ">;"
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LAv4$o;->g:LAv4;

    invoke-static {v0}, LAv4;->access$getUploadManager$p(LAv4;)Lef6;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/constant/ContentKind;->PNG:Lco/bird/android/model/constant/ContentKind;

    sget-object v3, Lco/bird/android/model/constant/UploadKind;->DROP_PHOTOS:Lco/bird/android/model/constant/UploadKind;

    sget-object v4, Lco/bird/android/model/Folder;->DROP_PHOTOS:Lco/bird/android/model/Folder;

    invoke-interface {v1, p1, v2, v3, v4}, Lef6;->h(Ljava/io/File;Lco/bird/android/model/constant/ContentKind;Lco/bird/android/model/constant/UploadKind;Lco/bird/android/model/Folder;)Lio/reactivex/F;

    move-result-object v1

    invoke-static {v0, v1}, LAv4;->access$progress(LAv4;Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LAv4$o$a;

    iget-object v2, p0, LAv4$o;->g:LAv4;

    invoke-direct {v1, v2}, LAv4$o$a;-><init>(LAv4;)V

    new-instance v2, LFv4;

    invoke-direct {v2, v1}, LFv4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->v(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LAv4$o$b;

    iget-object v2, p0, LAv4$o;->g:LAv4;

    invoke-direct {v1, p1, v2}, LAv4$o$b;-><init>(Ljava/io/File;LAv4;)V

    new-instance p1, LGv4;

    invoke-direct {p1, v1}, LGv4;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->u(Lio/reactivex/functions/b;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, LAv4$o;->c(Ljava/io/File;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
