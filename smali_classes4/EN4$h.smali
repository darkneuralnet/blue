.class public final LEN4$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEN4;->A(Landroid/graphics/Bitmap;Landroid/content/Intent;)V
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
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ljava/io/File;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "b",
        "(Ljava/io/File;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Landroid/content/Intent;

.field public final synthetic h:LEN4;


# direct methods
.method public constructor <init>(Landroid/content/Intent;LEN4;)V
    .locals 0

    iput-object p1, p0, LEN4$h;->g:Landroid/content/Intent;

    iput-object p2, p0, LEN4$h;->h:LEN4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/io/File;)V
    .locals 3

    iget-object v0, p0, LEN4$h;->g:Landroid/content/Intent;

    new-instance v1, Lco/bird/android/model/PhotoSavedModel;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const-string v2, "it.absolutePath"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LEN4$h;->h:LEN4;

    invoke-static {v2}, LEN4;->access$getSavePath$p(LEN4;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "savePath"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_0
    invoke-direct {v1, p1, v2}, Lco/bird/android/model/PhotoSavedModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "photo_saved_model"

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iget-object p1, p0, LEN4$h;->h:LEN4;

    invoke-static {p1}, LEN4;->access$getNavigator$p(LEN4;)Le13;

    move-result-object p1

    const/4 v0, -0x1

    iget-object v1, p0, LEN4$h;->g:Landroid/content/Intent;

    invoke-interface {p1, v0, v1}, Le13;->e4(ILandroid/content/Intent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, LEN4$h;->b(Ljava/io/File;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
