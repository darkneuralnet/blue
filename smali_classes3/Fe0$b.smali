.class public final LFe0$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFe0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LFe0$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Ltf2;",
        "b",
        "Ltf2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LFe0;Landroid/view/View;)V",
        "bulk-scanner_release"
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
        "SMAP\nCaptureBulkScannerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerAdapter.kt\nco/bird/android/feature/bulkscanner/scan/capture/adapters/CaptureBulkScannerAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,114:1\n18#2:115\n9#3,4:116\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerAdapter.kt\nco/bird/android/feature/bulkscanner/scan/capture/adapters/CaptureBulkScannerAdapter$HeaderViewHolder\n*L\n66#1:115\n66#1:116,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Ltf2;

.field public final synthetic c:LFe0;


# direct methods
.method public constructor <init>(LFe0;Landroid/view/View;)V
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

    iput-object p1, p0, LFe0$b;->c:LFe0;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Ltf2;->a(Landroid/view/View;)Ltf2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LFe0$b;->b:Ltf2;

    iget-object p2, p2, Ltf2;->b:Landroid/widget/Button;

    const-string v0, "binding.button"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LFe0$b$a;

    invoke-direct {v0, p1}, LFe0$b$a;-><init>(LFe0;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 4

    iget-object v0, p0, LFe0$b;->c:LFe0;

    invoke-static {v0}, LFe0;->access$getAdapterData(LFe0;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_3

    iget-object v0, p0, LFe0$b;->c:LFe0;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v1, p0, LFe0$b;->b:Ltf2;

    iget-object v1, v1, Ltf2;->c:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, LFe0$b;->b:Ltf2;

    iget-object v1, v1, Ltf2;->b:Landroid/widget/Button;

    if-lez p1, :cond_1

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lnl4;->capture_button_title:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lnl4;->bulk_scan_awaiting_scan_uppercase:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, LFe0$b;->b:Ltf2;

    iget-object v1, v1, Ltf2;->b:Landroid/widget/Button;

    if-lez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    invoke-virtual {v1, p1}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {v0}, LFe0;->w()LYP3;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "header"

    invoke-virtual {p1, v1, v0}, LYP3;->c(Ljava/lang/CharSequence;Landroid/view/View;)V

    :cond_3
    return-void
.end method
