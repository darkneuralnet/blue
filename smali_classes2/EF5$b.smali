.class public final LEF5$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LEF5;
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
        "LEF5$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lbe2;",
        "b",
        "Lbe2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LEF5;Landroid/view/View;)V",
        "app_birdRelease"
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
        "SMAP\nSmartlockAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockAdapter.kt\nco/bird/android/app/feature/physicallock/smartlock/adapter/SmartlockAdapter$ItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n18#2:64\n9#3,4:65\n1#4:69\n*S KotlinDebug\n*F\n+ 1 SmartlockAdapter.kt\nco/bird/android/app/feature/physicallock/smartlock/adapter/SmartlockAdapter$ItemViewHolder\n*L\n51#1:64\n51#1:65,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lbe2;

.field public final synthetic c:LEF5;


# direct methods
.method public constructor <init>(LEF5;Landroid/view/View;)V
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

    iput-object p1, p0, LEF5$b;->c:LEF5;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lbe2;->a(Landroid/view/View;)Lbe2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LEF5$b;->b:Lbe2;

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 7

    iget-object v0, p0, LEF5$b;->c:LEF5;

    invoke-static {v0}, LEF5;->access$getAdapterData(LEF5;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LYL5;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LYL5;

    if-eqz p1, :cond_5

    iget-object v0, p0, LEF5$b;->b:Lbe2;

    iget-object v0, v0, Lbe2;->g:Landroid/widget/TextView;

    invoke-virtual {p1}, LYL5;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LEF5$b;->b:Lbe2;

    iget-object v0, v0, Lbe2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, LYL5;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, LYL5;->c()Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "binding.image"

    if-eqz v0, :cond_1

    iget-object v3, p0, LEF5$b;->b:Lbe2;

    iget-object v3, v3, Lbe2;->d:Landroid/widget/ImageView;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    iget-object v0, p0, LEF5$b;->b:Lbe2;

    iget-object v0, v0, Lbe2;->f:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    const-string v3, "binding.progressCircle"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYL5;->c()Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_2

    move v3, v4

    goto :goto_1

    :cond_2
    move v3, v5

    :goto_1
    const/4 v6, 0x2

    invoke-static {v0, v3, v5, v6, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LEF5$b;->b:Lbe2;

    iget-object v0, v0, Lbe2;->d:Landroid/widget/ImageView;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYL5;->c()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_3

    move v2, v4

    goto :goto_2

    :cond_3
    move v2, v5

    :goto_2
    invoke-static {v0, v2, v5, v6, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LEF5$b;->b:Lbe2;

    iget-object v0, v0, Lbe2;->e:Landroid/widget/TextView;

    invoke-virtual {p1}, LYL5;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LEF5$b;->b:Lbe2;

    iget-object v0, v0, Lbe2;->e:Landroid/widget/TextView;

    const-string v2, "binding.metadata"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYL5;->d()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    move v4, v5

    :goto_3
    invoke-static {v0, v4, v5, v6, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_5
    return-void
.end method
