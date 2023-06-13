.class public final Lu02$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu02;
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
        "Lu02$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Ltc2;",
        "b",
        "Ltc2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lu02;Landroid/view/View;)V",
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
        "SMAP\nInboundScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanAdapter.kt\nco/bird/android/feature/transferorder/scanner/inbound/adapters/InboundScanAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,79:1\n18#2:80\n9#3,4:81\n*S KotlinDebug\n*F\n+ 1 InboundScanAdapter.kt\nco/bird/android/feature/transferorder/scanner/inbound/adapters/InboundScanAdapter$HeaderViewHolder\n*L\n58#1:80\n58#1:81,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Ltc2;

.field public final synthetic c:Lu02;


# direct methods
.method public constructor <init>(Lu02;Landroid/view/View;)V
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

    iput-object p1, p0, Lu02$a;->c:Lu02;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Ltc2;->a(Landroid/view/View;)Ltc2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lu02$a;->b:Ltc2;

    iget-object p2, p2, Ltc2;->b:Landroid/widget/Button;

    const-string v0, "binding.acceptDelivery"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu02$a$a;

    invoke-direct {v0, p1}, Lu02$a$a;-><init>(Lu02;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    iget-object v0, p0, Lu02$a;->c:Lu02;

    invoke-static {v0}, Lu02;->access$getAdapterData(Lu02;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lx02;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lx02;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lu02$a;->b:Ltc2;

    iget-object v0, v0, Ltc2;->b:Landroid/widget/Button;

    const-string v2, "binding.acceptDelivery"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx02;->d()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, Lu02$a;->b:Ltc2;

    iget-object v0, v0, Ltc2;->b:Landroid/widget/Button;

    invoke-virtual {p1}, Lx02;->c()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lu02$a;->b:Ltc2;

    iget-object v0, v0, Ltc2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lx02;->b()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method
