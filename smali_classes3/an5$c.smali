.class public final Lan5$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lan5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lan5$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/imageupload/ImageUploadBar;",
        "b",
        "Lco/bird/android/imageupload/ImageUploadBar;",
        "imageBar",
        "",
        "c",
        "Z",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lan5;Landroid/view/View;)V",
        "co.bird.android.feature.scrap"
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
        "SMAP\nScrapAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$ImageBarViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n18#2:191\n9#3,4:192\n1855#4,2:196\n*S KotlinDebug\n*F\n+ 1 ScrapAdapter.kt\nco/bird/android/feature/scrap/adapters/ScrapAdapter$ImageBarViewHolder\n*L\n124#1:191\n124#1:192,4\n124#1:196,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/imageupload/ImageUploadBar;

.field public c:Z

.field public final synthetic d:Lan5;


# direct methods
.method public constructor <init>(Lan5;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lan5$c;->d:Lan5;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Lco/bird/android/imageupload/ImageUploadBar;

    iput-object p2, p0, Lan5$c;->b:Lco/bird/android/imageupload/ImageUploadBar;

    new-instance v0, Lan5$c$a;

    invoke-direct {v0, p1}, Lan5$c$a;-><init>(Lan5;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lan5$c$b;

    invoke-direct {v0, p0, p1}, Lan5$c$b;-><init>(Lan5$c;Lan5;)V

    invoke-virtual {p2, v0}, Lco/bird/android/imageupload/ImageUploadBar;->setPhotoChangedListener(Lco/bird/android/imageupload/ImageUploadBar$a;)V

    return-void
.end method

.method public static final synthetic a(Lan5$c;)Z
    .locals 0

    iget-boolean p0, p0, Lan5$c;->c:Z

    return p0
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lan5$c;->c:Z

    iget-object v0, p0, Lan5$c;->d:Lan5;

    invoke-static {v0}, Lan5;->access$getAdapterData(Lan5;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lan5$c;->b:Lco/bird/android/imageupload/ImageUploadBar;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lco/bird/android/imageupload/ImageUploadBar;->r(Landroid/net/Uri;)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lan5$c;->c:Z

    return-void
.end method
