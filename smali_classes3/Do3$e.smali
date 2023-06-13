.class public final LDo3$e;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDo3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LDo3$e;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LXd2;",
        "b",
        "LXd2;",
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
        "SMAP\nOperatorOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$InstructionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,143:1\n18#2:144\n9#3,4:145\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$InstructionViewHolder\n*L\n135#1:144\n135#1:145,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LXd2;

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

    iput-object p1, p0, LDo3$e;->c:LDo3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LXd2;->a(Landroid/view/View;)LXd2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LDo3$e;->b:LXd2;

    return-void
.end method

.method public static synthetic a(LDo3$e;)V
    .locals 0

    invoke-static {p0}, LDo3$e;->b(LDo3$e;)V

    return-void
.end method

.method public static final b(LDo3$e;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LDo3$e;->b:LXd2;

    invoke-virtual {p0}, LXd2;->b()Landroid/widget/TextView;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, LDo3$e;->b:LXd2;

    invoke-virtual {v0}, LXd2;->b()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, LDo3$e;->c:LDo3;

    invoke-static {v1}, LDo3;->access$getAdapterData(LDo3;)LE6;

    move-result-object v1

    invoke-virtual {v1, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LDo3$e;->b:LXd2;

    invoke-virtual {p1}, LXd2;->b()Landroid/widget/TextView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    iget-object p1, p0, LDo3$e;->b:LXd2;

    invoke-virtual {p1}, LXd2;->b()Landroid/widget/TextView;

    move-result-object p1

    new-instance v0, LEo3;

    invoke-direct {v0, p0}, LEo3;-><init>(LDo3$e;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
