.class public final LDT1$c;
.super Lh0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDT1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LDT1$c;",
        "Lh0;",
        "",
        "position",
        "",
        "bind",
        "Lnd2;",
        "f",
        "Lnd2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LDT1;Landroid/view/View;)V",
        "co.bird.android.feature.identification"
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
        "SMAP\nIdentificationManualEntryFormAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$IdentificationSelectorViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n18#2:239\n9#3,4:240\n1#4:244\n*S KotlinDebug\n*F\n+ 1 IdentificationManualEntryFormAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationManualEntryFormAdapter$IdentificationSelectorViewHolder\n*L\n124#1:239\n124#1:240,4\n*E\n"
    }
.end annotation


# instance fields
.field public final f:Lnd2;

.field public final synthetic g:LDT1;


# direct methods
.method public constructor <init>(LDT1;Landroid/view/View;)V
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

    iput-object p1, p0, LDT1$c;->g:LDT1;

    invoke-direct {p0, p2}, Lh0;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lnd2;->a(Landroid/view/View;)Lnd2;

    move-result-object v0

    const-string v1, "bind(view)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LDT1$c;->f:Lnd2;

    new-instance v0, LDT1$c$a;

    invoke-direct {v0, p1, p0}, LDT1$c$a;-><init>(LDT1;LDT1$c;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 7

    invoke-super {p0, p1}, Lh0;->bind(I)V

    iget-object v0, p0, LDT1$c;->g:LDT1;

    invoke-static {v0}, LDT1;->access$getAdapterData(LDT1;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LnU1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LnU1;

    if-eqz p1, :cond_5

    iget-object v0, p0, LDT1$c;->f:Lnd2;

    iget-object v0, v0, Lnd2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, LnU1;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LDT1$c;->f:Lnd2;

    iget-object v0, v0, Lnd2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, LnU1;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LDT1$c;->f:Lnd2;

    iget-object v0, v0, Lnd2;->c:Landroid/widget/TextView;

    const-string v2, "binding.messageView"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LnU1;->d()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v4

    goto :goto_2

    :cond_2
    :goto_1
    move v2, v3

    :goto_2
    xor-int/2addr v2, v3

    const/4 v5, 0x2

    invoke-static {v0, v2, v4, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-virtual {p1}, LnU1;->b()Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "binding.endIconView"

    if-eqz v0, :cond_3

    iget-object v6, p0, LDT1$c;->f:Lnd2;

    iget-object v6, v6, Lnd2;->b:Landroid/widget/ImageView;

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_3
    iget-object v0, p0, LDT1$c;->f:Lnd2;

    iget-object v0, v0, Lnd2;->b:Landroid/widget/ImageView;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LnU1;->b()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    move v3, v4

    :goto_3
    invoke-static {v0, v3, v4, v5, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_5
    return-void
.end method
