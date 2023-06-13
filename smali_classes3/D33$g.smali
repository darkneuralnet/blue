.class public final LD33$g;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD33;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "g"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LD33$g;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Ldc2;",
        "b",
        "Ldc2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LD33;Landroid/view/View;)V",
        "nest-flight-sheet_release"
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
        "SMAP\nNestFlightSheetAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$DetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,463:1\n18#2:464\n9#3,4:465\n*S KotlinDebug\n*F\n+ 1 NestFlightSheetAdapter.kt\nco/bird/android/feature/nestflightsheet/adapters/NestFlightSheetAdapter$DetailViewHolder\n*L\n304#1:464\n304#1:465,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Ldc2;

.field public final synthetic c:LD33;


# direct methods
.method public constructor <init>(LD33;Landroid/view/View;)V
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

    iput-object p1, p0, LD33$g;->c:LD33;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Ldc2;->a(Landroid/view/View;)Ldc2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LD33$g;->b:Ldc2;

    iget-object p2, p2, Ldc2;->b:Landroid/widget/TextView;

    const-string v0, "binding.detail"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LD33$g$a;

    invoke-direct {v0, p1, p0}, LD33$g$a;-><init>(LD33;LD33$g;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 4

    iget-object v0, p0, LD33$g;->c:LD33;

    invoke-static {v0}, LD33;->access$getAdapterData(LD33;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/nestedstructures/FormattedFlightSheetDetail;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/FormattedFlightSheetDetail;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FormattedFlightSheetDetail;->getFormat()Lco/bird/android/model/constant/FlightSheetDetailFormat;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/FlightSheetDetailFormat;->ADDRESS:Lco/bird/android/model/constant/FlightSheetDetailFormat;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FormattedFlightSheetDetail;->getDetail()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FormattedFlightSheetDetail;->getDetail()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Landroid/text/style/UnderlineSpan;

    invoke-direct {v3}, Landroid/text/style/UnderlineSpan;-><init>()V

    invoke-static {v0, v2, v3}, LmS5;->n(Ljava/lang/CharSequence;Ljava/lang/String;Landroid/text/style/CharacterStyle;)Landroid/text/SpannableString;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FormattedFlightSheetDetail;->getDetail()Ljava/lang/String;

    move-result-object v0

    :goto_1
    iget-object v2, p0, LD33$g;->b:Ldc2;

    iget-object v2, v2, Ldc2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FormattedFlightSheetDetail;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LD33$g;->b:Ldc2;

    iget-object v2, v2, Ldc2;->b:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LD33$g;->b:Ldc2;

    iget-object v0, v0, Ldc2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/FormattedFlightSheetDetail;->getFormat()Lco/bird/android/model/constant/FlightSheetDetailFormat;

    move-result-object p1

    if-ne p1, v1, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    :cond_3
    return-void
.end method
