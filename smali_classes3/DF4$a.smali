.class public final LDF4$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDF4;
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
        "LDF4$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LRe2;",
        "b",
        "LRe2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LDF4;Landroid/view/View;)V",
        "repair_release"
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
        "SMAP\nRepairV3OverviewQuickLinkAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3OverviewQuickLinkAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewQuickLinkAdapter$QuickLinkViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,59:1\n18#2:60\n9#3,4:61\n*S KotlinDebug\n*F\n+ 1 RepairV3OverviewQuickLinkAdapter.kt\nco/bird/android/feature/repair/v3/overview/adapters/RepairV3OverviewQuickLinkAdapter$QuickLinkViewHolder\n*L\n52#1:60\n52#1:61,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LRe2;

.field public final synthetic c:LDF4;


# direct methods
.method public constructor <init>(LDF4;Landroid/view/View;)V
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

    iput-object p1, p0, LDF4$a;->c:LDF4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LRe2;->a(Landroid/view/View;)LRe2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LDF4$a;->b:LRe2;

    invoke-virtual {p2}, LRe2;->b()Landroid/widget/LinearLayout;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LDF4$a$a;

    invoke-direct {v0, p0, p1}, LDF4$a$a;-><init>(LDF4$a;LDF4;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, LDF4$a;->c:LDF4;

    invoke-static {v0}, LDF4;->access$getAdapterData(LDF4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lpd4;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lpd4;

    if-eqz p1, :cond_1

    iget-object v0, p0, LDF4$a;->b:LRe2;

    iget-object v0, v0, LRe2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Lpd4;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LDF4$a;->b:LRe2;

    iget-object v0, v0, LRe2;->b:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lpd4;->d()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method
