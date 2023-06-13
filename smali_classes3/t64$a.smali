.class public final Lt64$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt64;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lt64$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lsc2;",
        "b",
        "Lsc2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lt64;Landroid/view/View;)V",
        "co.bird.android.feature.transfer-order"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nProcessContainerOrderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessContainerOrderAdapter.kt\nco/bird/android/feature/transferorder/container/processing/adapters/ProcessContainerOrderAdapter$ImageUploadViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n18#2:84\n9#3,4:85\n1855#4,2:89\n*S KotlinDebug\n*F\n+ 1 ProcessContainerOrderAdapter.kt\nco/bird/android/feature/transferorder/container/processing/adapters/ProcessContainerOrderAdapter$ImageUploadViewHolder\n*L\n65#1:84\n65#1:85,4\n66#1:89,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lsc2;

.field public final synthetic c:Lt64;


# direct methods
.method public constructor <init>(Lt64;Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lt64$a;->c:Lt64;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lsc2;->a(Landroid/view/View;)Lsc2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lt64$a;->b:Lsc2;

    iget-object v0, p2, Lsc2;->c:Lco/bird/android/imageupload/ImageUploadBar;

    const-string v1, "binding.imageUploadBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lt64$a$a;

    invoke-direct {v1, p1}, Lt64$a$a;-><init>(Lt64;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, p2, Lsc2;->c:Lco/bird/android/imageupload/ImageUploadBar;

    new-instance v0, Lt64$a$b;

    invoke-direct {v0, p1}, Lt64$a$b;-><init>(Lt64;)V

    invoke-virtual {p2, v0}, Lco/bird/android/imageupload/ImageUploadBar;->setPhotoChangedListener(Lco/bird/android/imageupload/ImageUploadBar$a;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    iget-object v0, p0, Lt64$a;->c:Lt64;

    invoke-static {v0}, Lt64;->access$getAdapterData(Lt64;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lmf6;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lmf6;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lmf6;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lt64$a;->b:Lsc2;

    iget-object v2, v2, Lsc2;->c:Lco/bird/android/imageupload/ImageUploadBar;

    invoke-virtual {v2, v1}, Lco/bird/android/imageupload/ImageUploadBar;->s(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lt64$a;->b:Lsc2;

    iget-object v0, v0, Lsc2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lmf6;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lt64$a;->b:Lsc2;

    iget-object v0, v0, Lsc2;->e:Landroid/widget/ImageView;

    const-string v1, "binding.statusIconFailure"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lmf6;->d()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, Lt64$a;->b:Lsc2;

    iget-object v0, v0, Lsc2;->f:Landroid/widget/ImageView;

    const-string v1, "binding.statusIconSuccess"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lmf6;->d()Z

    move-result p1

    invoke-static {v0, p1, v2}, Ltu6;->s(Landroid/view/View;ZI)V

    :cond_2
    return-void
.end method
