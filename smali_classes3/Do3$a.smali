.class public final LDo3$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDo3;
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
        "LDo3$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LSd2;",
        "b",
        "LSd2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LDo3;Landroid/view/View;)V",
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
        "SMAP\nOperatorOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$BillOfLadingViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n18#2:144\n9#3,4:145\n1#4:149\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$BillOfLadingViewHolder\n*L\n112#1:144\n112#1:145,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LSd2;

.field public final synthetic c:LDo3;


# direct methods
.method public constructor <init>(LDo3;Landroid/view/View;)V
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

    iput-object p1, p0, LDo3$a;->c:LDo3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LSd2;->a(Landroid/view/View;)LSd2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LDo3$a;->b:LSd2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, LDo3$a;->c:LDo3;

    invoke-static {v0}, LDo3;->access$getAdapterData(LDo3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/OperatorOrderView;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/OperatorOrderView;

    if-eqz p1, :cond_1

    iget-object v0, p0, LDo3$a;->b:LSd2;

    iget-object v0, v0, LSd2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getBolStatusText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorOrderView;->getBolStatusColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/nestedstructures/ThemedColors;->getLightMode()I

    move-result p1

    iget-object v0, p0, LDo3$a;->b:LSd2;

    iget-object v0, v0, LSd2;->b:Landroid/widget/TextView;

    const-string v1, "binding.bolStatus"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    return-void
.end method
