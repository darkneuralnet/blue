.class public final Lkf6$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkf6;->g([BLco/bird/android/model/constant/ContentKind;Lco/bird/android/model/constant/UploadKind;Lco/bird/android/model/Folder;Ljava/lang/String;)Lio/reactivex/F;
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
        "it",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/FileUploadReceipt;",
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


# instance fields
.field public final synthetic g:Lkf6;

.field public final synthetic h:Lco/bird/android/model/constant/ContentKind;

.field public final synthetic i:Lco/bird/android/model/constant/UploadKind;

.field public final synthetic j:Lco/bird/android/model/Folder;


# direct methods
.method public constructor <init>(Lkf6;Lco/bird/android/model/constant/ContentKind;Lco/bird/android/model/constant/UploadKind;Lco/bird/android/model/Folder;)V
    .locals 0

    iput-object p1, p0, Lkf6$c;->g:Lkf6;

    iput-object p2, p0, Lkf6$c;->h:Lco/bird/android/model/constant/ContentKind;

    iput-object p3, p0, Lkf6$c;->i:Lco/bird/android/model/constant/UploadKind;

    iput-object p4, p0, Lkf6$c;->j:Lco/bird/android/model/Folder;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/io/File;)Lio/reactivex/K;
    .locals 4
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

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkf6$c;->g:Lkf6;

    iget-object v1, p0, Lkf6$c;->h:Lco/bird/android/model/constant/ContentKind;

    iget-object v2, p0, Lkf6$c;->i:Lco/bird/android/model/constant/UploadKind;

    iget-object v3, p0, Lkf6$c;->j:Lco/bird/android/model/Folder;

    invoke-virtual {v0, p1, v1, v2, v3}, Lkf6;->h(Ljava/io/File;Lco/bird/android/model/constant/ContentKind;Lco/bird/android/model/constant/UploadKind;Lco/bird/android/model/Folder;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lkf6$c;->b(Ljava/io/File;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
