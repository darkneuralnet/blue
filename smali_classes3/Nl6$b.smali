.class public final LNl6$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNl6;
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
        "LNl6$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lxf2;",
        "b",
        "Lxf2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LNl6;Landroid/view/View;)V",
        "co.bird.android.feature.complaintresolution"
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
        "SMAP\nVehicleInvolvedScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleInvolvedScanAdapter.kt\nco/bird/android/feature/complaintresolution/scanner/adapters/VehicleInvolvedScanAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,64:1\n18#2:65\n9#3,4:66\n*S KotlinDebug\n*F\n+ 1 VehicleInvolvedScanAdapter.kt\nco/bird/android/feature/complaintresolution/scanner/adapters/VehicleInvolvedScanAdapter$HeaderViewHolder\n*L\n46#1:65\n46#1:66,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lxf2;

.field public final synthetic c:LNl6;


# direct methods
.method public constructor <init>(LNl6;Landroid/view/View;)V
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

    iput-object p1, p0, LNl6$b;->c:LNl6;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lxf2;->a(Landroid/view/View;)Lxf2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LNl6$b;->b:Lxf2;

    iget-object p2, p2, Lxf2;->c:Landroid/widget/Button;

    const-string v0, "binding.done"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LNl6$b$a;

    invoke-direct {v0, p1}, LNl6$b$a;-><init>(LNl6;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, LNl6$b;->b:Lxf2;

    iget-object v0, v0, Lxf2;->b:Landroid/widget/TextView;

    iget-object v1, p0, LNl6$b;->c:LNl6;

    invoke-static {v1}, LNl6;->access$getAdapterData(LNl6;)LE6;

    move-result-object v1

    invoke-virtual {v1, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LNl6$b;->c:LNl6;

    invoke-virtual {p1}, LNl6;->v()LYP3;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "header"

    invoke-virtual {p1, v1, v0}, LYP3;->c(Ljava/lang/CharSequence;Landroid/view/View;)V

    :cond_1
    return-void
.end method
