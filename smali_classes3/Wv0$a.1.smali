.class public final LWv0$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWv0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LWv0$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LWf2;",
        "b",
        "LWf2;",
        "binding",
        "",
        "c",
        "Ljava/lang/String;",
        "tutorialId",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LWv0;Landroid/view/View;)V",
        "co.bird.android.feature.configurabletutorial"
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
        "SMAP\nConfigurableTutorialGroupAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialGroupAdapter.kt\nco/bird/android/feature/configurabletutorial/group/adapters/ConfigurableTutorialGroupAdapter$TutorialCardViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,52:1\n18#2:53\n9#3,4:54\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialGroupAdapter.kt\nco/bird/android/feature/configurabletutorial/group/adapters/ConfigurableTutorialGroupAdapter$TutorialCardViewHolder\n*L\n40#1:53\n40#1:54,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LWf2;

.field public c:Ljava/lang/String;

.field public final synthetic d:LWv0;


# direct methods
.method public constructor <init>(LWv0;Landroid/view/View;)V
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

    iput-object p1, p0, LWv0$a;->d:LWv0;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LWf2;->a(Landroid/view/View;)LWf2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LWv0$a;->b:LWf2;

    invoke-virtual {p2}, LWf2;->b()Landroidx/cardview/widget/CardView;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWv0$a$a;

    invoke-direct {v0, p0, p1}, LWv0$a$a;-><init>(LWv0$a;LWv0;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(LWv0$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LWv0$a;->c:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    iget-object v0, p0, LWv0$a;->d:LWv0;

    invoke-static {v0}, LWv0;->access$getAdapterData(LWv0;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/Tutorial;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/Tutorial;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Tutorial;->getId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LWv0$a;->c:Ljava/lang/String;

    iget-object v0, p0, LWv0$a;->b:LWf2;

    iget-object v0, v0, LWf2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Tutorial;->getMenuTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Tutorial;->getMenuAsset()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, LWv0$a;->b:LWf2;

    iget-object v0, v0, LWf2;->b:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/bumptech/glide/a;->u(Landroid/view/View;)LUI4;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;->getMedia()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object p1

    iget-object v0, p0, LWv0$a;->b:LWf2;

    iget-object v0, v0, LWf2;->b:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    move-result-object v1

    :cond_1
    if-nez v1, :cond_2

    iget-object p1, p0, LWv0$a;->b:LWf2;

    iget-object p1, p1, LWf2;->b:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lrg4;->ic_rectangle:I

    invoke-static {v0, v1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    return-void
.end method
