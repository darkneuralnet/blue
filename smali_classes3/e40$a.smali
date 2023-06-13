.class public final Le40$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le40;
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
        "Le40$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LNd2;",
        "b",
        "LNd2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Le40;Landroid/view/View;)V",
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
        "SMAP\nBulkBirdDetailAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkBirdDetailAdapter.kt\nco/bird/android/feature/bulkscanner/scan/adapters/BulkBirdDetailAdapter$BirdDetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,70:1\n18#2:71\n9#3,4:72\n*S KotlinDebug\n*F\n+ 1 BulkBirdDetailAdapter.kt\nco/bird/android/feature/bulkscanner/scan/adapters/BulkBirdDetailAdapter$BirdDetailViewHolder\n*L\n52#1:71\n52#1:72,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LNd2;

.field public final synthetic c:Le40;


# direct methods
.method public constructor <init>(Le40;Landroid/view/View;)V
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

    iput-object p1, p0, Le40$a;->c:Le40;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LNd2;->a(Landroid/view/View;)LNd2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Le40$a;->b:LNd2;

    invoke-virtual {p2}, LNd2;->b()Landroidx/cardview/widget/CardView;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le40$a$a;

    invoke-direct {v0, p1, p0}, Le40$a$a;-><init>(Le40;Le40$a;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    iget-object v0, p0, Le40$a;->c:Le40;

    invoke-static {v0}, Le40;->access$getAdapterData(Le40;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LdL;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LdL;

    if-eqz p1, :cond_2

    iget-object v0, p0, Le40$a;->b:LNd2;

    iget-object v0, v0, LNd2;->b:Landroid/widget/TextView;

    sget-object v1, Lxx1;->a:Lxx1;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, LdL;->b()I

    move-result v3

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v3, v4}, Lxx1;->a(Landroid/content/Context;IZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Le40$a;->b:LNd2;

    iget-object v0, v0, LNd2;->c:Lco/bird/android/widget/BatteryView;

    invoke-virtual {p1}, LdL;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lco/bird/android/widget/BatteryView;->setPercent(I)V

    iget-object v0, p0, Le40$a;->b:LNd2;

    iget-object v0, v0, LNd2;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, LdL;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Le40$a;->b:LNd2;

    iget-object v0, v0, LNd2;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, LdL;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, LdL;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/2addr v0, v4

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LdL;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Le40$a;->b:LNd2;

    iget-object v0, v0, LNd2;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LDf4;->white:I

    invoke-static {v1, v2}, LNA0;->c(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Le40$a;->b:LNd2;

    iget-object v0, v0, LNd2;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, LdL;->e()I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Le40$a;->b:LNd2;

    iget-object v0, v0, LNd2;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, LdL;->e()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_2
    :goto_1
    return-void
.end method
