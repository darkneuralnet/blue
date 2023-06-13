.class public final LE00$d;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE00;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0016"
    }
    d2 = {
        "LE00$d;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Ldb2;",
        "b",
        "Ldb2;",
        "binding",
        "Lco/bird/android/model/Point;",
        "c",
        "Lco/bird/android/model/Point;",
        "point",
        "",
        "d",
        "Ljava/lang/String;",
        "url",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LE00;Landroid/view/View;)V",
        "flight-sheet_release"
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
        "SMAP\nBountyFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyTextViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,265:1\n18#2:266\n9#3,4:267\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetAdapter.kt\nco/bird/android/flightsheet/BountyFlightSheetAdapter$BountyTextViewHolder\n*L\n154#1:266\n154#1:267,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Ldb2;

.field public c:Lco/bird/android/model/Point;

.field public d:Ljava/lang/String;

.field public final synthetic e:LE00;


# direct methods
.method public constructor <init>(LE00;Landroid/view/View;)V
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

    iput-object p1, p0, LE00$d;->e:LE00;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Ldb2;->a(Landroid/view/View;)Ldb2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LE00$d;->b:Ldb2;

    iget-object v0, p2, Ldb2;->c:Landroid/widget/ImageView;

    const-string v1, "binding.directions"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LE00$d$a;

    invoke-direct {v1, p0, p1}, LE00$d$a;-><init>(LE00$d;LE00;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2}, Ldb2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "binding.root"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LE00$d$b;

    invoke-direct {v1, p0, p1}, LE00$d$b;-><init>(LE00$d;LE00;)V

    invoke-static {v0, v1}, LMs2;->r(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, p2, Ldb2;->b:Landroid/widget/TextView;

    const-string v0, "binding.body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LE00$d$c;

    invoke-direct {v0, p0, p1}, LE00$d$c;-><init>(LE00$d;LE00;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(LE00$d;)Lco/bird/android/model/Point;
    .locals 0

    iget-object p0, p0, LE00$d;->c:Lco/bird/android/model/Point;

    return-object p0
.end method

.method public static final synthetic b(LE00$d;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, LE00$d;->d:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 9

    iget-object v0, p0, LE00$d;->e:LE00;

    invoke-static {v0}, LE00;->access$getAdapterData(LE00;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object v0

    invoke-virtual {v0}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    check-cast v0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;

    if-eqz v0, :cond_8

    iget-object v1, p0, LE00$d;->e:LE00;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;->getAction()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;

    move-result-object v3

    instance-of v4, v3, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$Navigate;

    if-eqz v4, :cond_1

    check-cast v3, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$Navigate;

    goto :goto_1

    :cond_1
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$Navigate;->getNavigationLocation()Lco/bird/android/model/Point;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v2

    :goto_2
    iput-object v3, p0, LE00$d;->c:Lco/bird/android/model/Point;

    iput-object v2, p0, LE00$d;->d:Ljava/lang/String;

    iget-object v3, p0, LE00$d;->b:Ldb2;

    iget-object v3, v3, Ldb2;->d:Landroid/widget/TextView;

    const-string v4, "binding.title"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;->getTitle()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v3, v4, v5, v6, v2}, Ltu6;->setTextAndVisibility$default(Landroid/widget/TextView;Ljava/lang/CharSequence;IILjava/lang/Object;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;->getAutoDetectLinks()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;->getBody()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_6

    sget-object v3, LZK3;->c:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;->getBody()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    const-string v4, ""

    :cond_3
    invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v3, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, LE00$d;->d:Ljava/lang/String;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;->getBody()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    iget-object v4, p0, LE00$d;->d:Ljava/lang/String;

    new-instance v7, Landroid/text/style/URLSpan;

    iget-object v8, p0, LE00$d;->d:Ljava/lang/String;

    invoke-direct {v7, v8}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v4, v7}, LmS5;->n(Ljava/lang/CharSequence;Ljava/lang/String;Landroid/text/style/CharacterStyle;)Landroid/text/SpannableString;

    move-result-object v3

    goto :goto_3

    :cond_4
    move-object v3, v2

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;->getBody()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;->getBody()Ljava/lang/String;

    move-result-object v3

    :goto_3
    iget-object v4, p0, LE00$d;->b:Ldb2;

    iget-object v4, v4, Ldb2;->b:Landroid/widget/TextView;

    const-string v7, "binding.body"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v3, v5, v6, v2}, Ltu6;->setTextAndVisibility$default(Landroid/widget/TextView;Ljava/lang/CharSequence;IILjava/lang/Object;)V

    iget-object v3, p0, LE00$d;->b:Ldb2;

    iget-object v3, v3, Ldb2;->c:Landroid/widget/ImageView;

    const-string v4, "binding.directions"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;->getAction()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction;

    move-result-object v0

    instance-of v0, v0, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetAction$Navigate;

    invoke-static {v3, v0, v5, v6, v2}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_8

    invoke-virtual {v1}, LE00;->w()Lco/bird/android/bottomsheet/BaseBottomSheet;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v2, "itemView"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "status"

    invoke-virtual {p1, v2, v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->n(Ljava/lang/CharSequence;Landroid/view/View;)V

    :cond_7
    invoke-virtual {v1}, LE00;->w()Lco/bird/android/bottomsheet/BaseBottomSheet;

    move-result-object p1

    if-eqz p1, :cond_8

    const/16 v0, 0x10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ltd3;->b(Ljava/lang/Number;)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->m(I)V

    :cond_8
    return-void
.end method
