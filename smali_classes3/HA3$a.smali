.class public final LHA3$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHA3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0015"
    }
    d2 = {
        "LHA3$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LLa2;",
        "b",
        "LLa2;",
        "binding",
        "",
        "value",
        "getButtonsEnabled",
        "()Z",
        "a",
        "(Z)V",
        "buttonsEnabled",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LHA3;Landroid/view/View;)V",
        "ownedbirds_release"
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
        "SMAP\nOwnedBirdDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$ActionsViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,348:1\n18#2:349\n9#3,4:350\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$ActionsViewHolder\n*L\n319#1:349\n319#1:350,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LLa2;

.field public final synthetic c:LHA3;


# direct methods
.method public constructor <init>(LHA3;Landroid/view/View;)V
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

    iput-object p1, p0, LHA3$a;->c:LHA3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LLa2;->a(Landroid/view/View;)LLa2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LHA3$a;->b:LLa2;

    iget-object v0, p2, LLa2;->h:Landroid/widget/Button;

    const-string v1, "binding.sleepWake"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LHA3$a$a;

    invoke-direct {v1, p1}, LHA3$a$a;-><init>(LHA3;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p2, LLa2;->b:Landroid/widget/Button;

    const-string v1, "binding.diagnostics"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LHA3$a$b;

    invoke-direct {v1, p1}, LHA3$a$b;-><init>(LHA3;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p2, LLa2;->c:Landroid/widget/Button;

    const-string v1, "binding.faq"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LHA3$a$c;

    invoke-direct {v1, p1}, LHA3$a$c;-><init>(LHA3;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p2, LLa2;->i:Landroid/widget/Button;

    const-string v1, "binding.unpair"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LHA3$a$d;

    invoke-direct {v1, p1}, LHA3$a$d;-><init>(LHA3;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p2, LLa2;->d:Landroid/widget/Button;

    const-string v1, "binding.pair"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LHA3$a$e;

    invoke-direct {v1, p1}, LHA3$a$e;-><init>(LHA3;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, p2, LLa2;->e:Landroid/widget/Button;

    const-string v0, "binding.reset"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LHA3$a$f;

    invoke-direct {v0, p1}, LHA3$a$f;-><init>(LHA3;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    invoke-static {p1, p0}, LHA3;->access$setActionsViewHolder$p(LHA3;LHA3$a;)V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    iget-object v0, p0, LHA3$a;->b:LLa2;

    iget-object v0, v0, LLa2;->h:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, LHA3$a;->b:LLa2;

    iget-object v0, v0, LLa2;->i:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, LHA3$a;->b:LLa2;

    iget-object v0, v0, LLa2;->d:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, LHA3$a;->b:LLa2;

    iget-object v0, v0, LLa2;->e:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public bind(I)V
    .locals 6

    iget-object v0, p0, LHA3$a;->c:LHA3;

    invoke-virtual {v0}, LHA3;->w()Z

    move-result v0

    invoke-virtual {p0, v0}, LHA3$a;->a(Z)V

    iget-object v0, p0, LHA3$a;->c:LHA3;

    invoke-static {v0}, LHA3;->access$getAdapterData(LHA3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LdH;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LdH;

    if-eqz p1, :cond_3

    iget-object v0, p0, LHA3$a;->b:LLa2;

    iget-object v0, v0, LLa2;->h:Landroid/widget/Button;

    const-string v2, "binding.sleepWake"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LdH;->b()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LHA3$a;->b:LLa2;

    iget-object v0, v0, LLa2;->h:Landroid/widget/Button;

    invoke-virtual {p1}, LdH;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LHA3$a;->b:LLa2;

    iget-object v0, v0, LLa2;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, LdH;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LHA3$a;->b:LLa2;

    iget-object v0, v0, LLa2;->b:Landroid/widget/Button;

    const-string v2, "binding.diagnostics"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LdH;->h()Z

    move-result v2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LHA3$a;->b:LLa2;

    iget-object v0, v0, LLa2;->c:Landroid/widget/Button;

    const-string v2, "binding.faq"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LdH;->f()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    goto :goto_2

    :cond_2
    :goto_1
    move v2, v5

    :goto_2
    xor-int/2addr v2, v5

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LHA3$a;->b:LLa2;

    iget-object v0, v0, LLa2;->i:Landroid/widget/Button;

    const-string v2, "binding.unpair"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LdH;->d()Z

    move-result v2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LHA3$a;->b:LLa2;

    iget-object v0, v0, LLa2;->d:Landroid/widget/Button;

    const-string v2, "binding.pair"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LdH;->c()Z

    move-result v2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LHA3$a;->b:LLa2;

    iget-object v0, v0, LLa2;->e:Landroid/widget/Button;

    const-string v2, "binding.reset"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LdH;->e()Z

    move-result p1

    invoke-static {v0, p1, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    :cond_3
    return-void
.end method
