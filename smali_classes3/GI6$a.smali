.class public final LGI6$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGI6;
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
        "LGI6$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lug2;",
        "b",
        "Lug2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LGI6;Landroid/view/View;)V",
        "zone-flight-sheet_release"
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
        "SMAP\nZoneFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneFlightSheetAdapter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapter$DetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,155:1\n18#2:156\n9#3,4:157\n*S KotlinDebug\n*F\n+ 1 ZoneFlightSheetAdapter.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapter$DetailViewHolder\n*L\n137#1:156\n137#1:157,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lug2;

.field public final synthetic c:LGI6;


# direct methods
.method public constructor <init>(LGI6;Landroid/view/View;)V
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

    iput-object p1, p0, LGI6$a;->c:LGI6;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lug2;->a(Landroid/view/View;)Lug2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LGI6$a;->b:Lug2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 7

    iget-object v0, p0, LGI6$a;->c:LGI6;

    invoke-static {v0}, LGI6;->access$getAdapterData(LGI6;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;

    if-eqz p1, :cond_5

    iget-object v0, p0, LGI6$a;->b:Lug2;

    iget-object v0, v0, Lug2;->d:Landroid/widget/ImageView;

    const-string v2, "binding.icon"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;->getIcon()Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v2, 0x1

    :goto_2
    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;->getIcon()Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v2, p0, LGI6$a;->b:Lug2;

    iget-object v2, v2, Lug2;->d:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v5

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v5, v6}, LHk0;->a(Lco/bird/android/model/constant/ClientIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v2, p0, LGI6$a;->b:Lug2;

    iget-object v2, v2, Lug2;->d:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ZoneFlightSheetIcon;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v2, p0, LGI6$a;->b:Lug2;

    iget-object v2, v2, Lug2;->d:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v0, v5}, LLm0;->a(Lco/bird/android/model/constant/ColoredIcon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, LGI6$a;->b:Lug2;

    iget-object v0, v0, Lug2;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    :cond_4
    :goto_3
    iget-object v0, p0, LGI6$a;->b:Lug2;

    iget-object v0, v0, Lug2;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LGI6$a;->b:Lug2;

    iget-object v0, v0, Lug2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;->getDetails()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LGI6$a;->b:Lug2;

    iget-object v0, v0, Lug2;->b:Landroid/widget/TextView;

    const-string v2, "binding.description"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ZoneDetail;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v3, v4, v1}, Ltu6;->setTextAndVisibility$default(Landroid/widget/TextView;Ljava/lang/CharSequence;IILjava/lang/Object;)V

    :cond_5
    return-void
.end method
