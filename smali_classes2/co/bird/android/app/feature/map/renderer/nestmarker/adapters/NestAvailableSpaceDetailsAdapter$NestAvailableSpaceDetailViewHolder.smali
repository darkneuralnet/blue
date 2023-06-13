.class final Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter$NestAvailableSpaceDetailViewHolder;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "NestAvailableSpaceDetailViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter$NestAvailableSpaceDetailViewHolder;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lsd2;",
        "binding",
        "Lsd2;",
        "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;",
        "Landroid/graphics/drawable/Drawable;",
        "getDrawable",
        "(Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;)Landroid/graphics/drawable/Drawable;",
        "drawable",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;Landroid/view/View;)V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final binding:Lsd2;

.field final synthetic this$0:Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;Landroid/view/View;)V
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

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter$NestAvailableSpaceDetailViewHolder;->this$0:Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lsd2;->a(Landroid/view/View;)Lsd2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter$NestAvailableSpaceDetailViewHolder;->binding:Lsd2;

    return-void
.end method

.method private final getDrawable(Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;)Landroid/graphics/drawable/Drawable;
    .locals 2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, LLm0;->a(Lco/bird/android/model/constant/ColoredIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return-object v0
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter$NestAvailableSpaceDetailViewHolder;->this$0:Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;

    invoke-virtual {v0}, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter;->getAvailableSpaceDetails()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter$NestAvailableSpaceDetailViewHolder;->binding:Lsd2;

    iget-object v0, v0, Lsd2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;->getCount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter$NestAvailableSpaceDetailViewHolder;->binding:Lsd2;

    iget-object v0, v0, Lsd2;->c:Landroid/widget/ImageView;

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/nestmarker/adapters/NestAvailableSpaceDetailsAdapter$NestAvailableSpaceDetailViewHolder;->getDrawable(Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method
