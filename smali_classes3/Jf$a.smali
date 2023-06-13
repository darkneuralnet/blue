.class public final LJf$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJf;
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
        "LJf$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LOa2;",
        "b",
        "LOa2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LJf;Landroid/view/View;)V",
        "announcement_release"
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
        "SMAP\nAnnouncementAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementAdapter.kt\nco/bird/android/lib/announcement/adapter/AnnouncementAdapter$AnnouncementViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,67:1\n18#2:68\n9#3,4:69\n41#4:73\n237#5:74\n*S KotlinDebug\n*F\n+ 1 AnnouncementAdapter.kt\nco/bird/android/lib/announcement/adapter/AnnouncementAdapter$AnnouncementViewHolder\n*L\n53#1:68\n53#1:69,4\n60#1:73\n60#1:74\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LOa2;

.field public final synthetic c:LJf;


# direct methods
.method public constructor <init>(LJf;Landroid/view/View;)V
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

    iput-object p1, p0, LJf$a;->c:LJf;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LOa2;->a(Landroid/view/View;)LOa2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LJf$a;->b:LOa2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 9

    iget-object v0, p0, LJf$a;->c:LJf;

    invoke-static {v0}, LJf;->access$getAdapterData(LJf;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lig;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lig;

    if-eqz p1, :cond_2

    iget-object v0, p0, LJf$a;->c:LJf;

    iget-object v2, p0, LJf$a;->b:LOa2;

    iget-object v2, v2, LOa2;->b:Landroid/widget/TextView;

    const-string v3, "binding.birdUnlockingText"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lig;->b()Ljava/lang/CharSequence;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5, v1}, Ltu6;->setTextAndVisibility$default(Landroid/widget/TextView;Ljava/lang/CharSequence;IILjava/lang/Object;)V

    iget-object v2, p0, LJf$a;->b:LOa2;

    iget-object v2, v2, LOa2;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lig;->c()Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LJf$a;->b:LOa2;

    iget-object v2, v2, LOa2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lig;->c()Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lig;->c()Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;->getTitleAsset()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v0}, LJf;->access$getAssetManager$p(LJf;)LTo2;

    move-result-object v2

    iget-object p1, p0, LJf$a;->b:LOa2;

    iget-object v4, p1, LOa2;->c:Lco/bird/android/widget/ClampToRatioImageView;

    const-string p1, "binding.image"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, LTo2$a;->drawable$default(LTo2;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Landroid/widget/ImageView;IIILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p1

    const-string v2, "assetManager.drawable(as\u2026       .onErrorComplete()"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LJf;->access$getRecyclerView$p(LJf;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "recyclerView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    invoke-static {v1}, Lcom/uber/autodispose/android/ViewScopeProvider;->a(Landroid/view/View;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    const-string v1, "ViewScopeProvider.from(this)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    :cond_2
    return-void
.end method
