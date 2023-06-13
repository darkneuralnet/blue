.class public final LYf;
.super LxE;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006J\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006J\u0016\u0010\u000c\u001a\u00020\u0004*\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001bR\u0016\u0010!\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006$"
    }
    d2 = {
        "LYf;",
        "LxE;",
        "Lco/bird/android/model/persistence/Announcement;",
        "announcement",
        "",
        "Ql",
        "Lio/reactivex/Observable;",
        "W4",
        "Pl",
        "Landroid/widget/ImageView;",
        "Lco/bird/android/model/persistence/nestedstructures/AssetMedia;",
        "media",
        "Rl",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "b",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "getActivity",
        "()Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Landroid/view/View;",
        "c",
        "Landroid/view/View;",
        "banner",
        "d",
        "closeButton",
        "Landroid/widget/TextView;",
        "e",
        "Landroid/widget/TextView;",
        "titleText",
        "f",
        "bodyText",
        "g",
        "Landroid/widget/ImageView;",
        "iconView",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/core/mvp/BaseActivity;

.field public final c:Landroid/view/View;

.field public final d:Landroid/view/View;

.field public final e:Landroid/widget/TextView;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/widget/ImageView;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "banner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p1, p0, LYf;->b:Lco/bird/android/core/mvp/BaseActivity;

    iput-object p2, p0, LYf;->c:Landroid/view/View;

    sget p1, Lzi4;->closeButton:I

    invoke-static {p2, p1}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, LYf;->d:Landroid/view/View;

    sget p1, Lzi4;->title:I

    invoke-static {p2, p1}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, LYf;->e:Landroid/widget/TextView;

    sget p1, Lzi4;->body:I

    invoke-static {p2, p1}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, LYf;->f:Landroid/widget/TextView;

    sget p1, Lzi4;->icon:I

    invoke-static {p2, p1}, Ltu6;->m(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, LYf;->g:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final Pl()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYf;->d:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, Lio/reactivex/Observable;->never()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "never()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method

.method public final Ql(Lco/bird/android/model/persistence/Announcement;)V
    .locals 4

    const-string v0, "announcement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYf;->e:Landroid/widget/TextView;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/persistence/Announcement;->getAuxiliaryTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object v0, p0, LYf;->f:Landroid/widget/TextView;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/persistence/Announcement;->getAuxiliaryBody()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    iget-object v0, p0, LYf;->g:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Announcement;->getAuxiliaryAsset()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;->getMedia()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    invoke-virtual {p0, v0, v2}, LYf;->Rl(Landroid/widget/ImageView;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;)V

    :cond_3
    iget-object v0, p0, LYf;->g:Landroid/widget/ImageView;

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Announcement;->getAuxiliaryAsset()Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;->getMedia()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object p1

    goto :goto_3

    :cond_4
    move-object p1, v1

    :goto_3
    const/4 v2, 0x0

    if-eqz p1, :cond_5

    const/4 p1, 0x1

    goto :goto_4

    :cond_5
    move p1, v2

    :goto_4
    const/4 v3, 0x2

    invoke-static {v0, p1, v2, v3, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_6
    return-void
.end method

.method public final Rl(Landroid/widget/ImageView;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    invoke-static {p1}, Lcom/bumptech/glide/a;->u(Landroid/view/View;)LUI4;

    move-result-object v0

    invoke-virtual {p2}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, LUI4;->k(Ljava/lang/String;)LrI4;

    move-result-object p2

    invoke-virtual {p2, p1}, LrI4;->R0(Landroid/widget/ImageView;)LIt6;

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_1
    return-void
.end method

.method public final W4()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYf;->c:Landroid/view/View;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Llf5;->clicksThrottle$default(Landroid/view/View;JILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getActivity()Landroidx/appcompat/app/AppCompatActivity;
    .locals 1

    invoke-virtual {p0}, LYf;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    return-object v0
.end method

.method public getActivity()Lco/bird/android/core/mvp/BaseActivity;
    .locals 1

    iget-object v0, p0, LYf;->b:Lco/bird/android/core/mvp/BaseActivity;

    return-object v0
.end method
