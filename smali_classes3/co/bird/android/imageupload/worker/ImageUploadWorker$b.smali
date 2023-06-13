.class public final Lco/bird/android/imageupload/worker/ImageUploadWorker$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/imageupload/worker/ImageUploadWorker;->r()Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/FileUploadReceipt;",
        "Landroidx/work/c$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/FileUploadReceipt;",
        "<name for destructuring parameter 0>",
        "Landroidx/work/c$a;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/FileUploadReceipt;)Landroidx/work/c$a;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/imageupload/worker/ImageUploadWorker;


# direct methods
.method public constructor <init>(Lco/bird/android/imageupload/worker/ImageUploadWorker;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/imageupload/worker/ImageUploadWorker$b;->g:Lco/bird/android/imageupload/worker/ImageUploadWorker;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/FileUploadReceipt;)Landroidx/work/c$a;
    .locals 1

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/FileUploadReceipt;->component2()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/imageupload/worker/ImageUploadWorker$b;->g:Lco/bird/android/imageupload/worker/ImageUploadWorker;

    invoke-static {v0, p1}, Lco/bird/android/imageupload/worker/ImageUploadWorker;->access$createResultData(Lco/bird/android/imageupload/worker/ImageUploadWorker;Ljava/lang/String;)Landroidx/work/b;

    move-result-object p1

    invoke-static {p1}, Landroidx/work/c$a;->d(Landroidx/work/b;)Landroidx/work/c$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/FileUploadReceipt;

    invoke-virtual {p0, p1}, Lco/bird/android/imageupload/worker/ImageUploadWorker$b;->a(Lco/bird/android/model/FileUploadReceipt;)Landroidx/work/c$a;

    move-result-object p1

    return-object p1
.end method
