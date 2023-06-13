.class public final LVa6$d;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVa6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LVa6$d;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lbg2;",
        "b",
        "Lbg2;",
        "viewBinding",
        "",
        "c",
        "Z",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LVa6;Landroid/view/View;)V",
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
        "SMAP\nTweaksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$TextTweakViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,247:1\n18#2:248\n9#3,4:249\n*S KotlinDebug\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$TextTweakViewHolder\n*L\n131#1:248\n131#1:249,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lbg2;

.field public c:Z

.field public final synthetic d:LVa6;


# direct methods
.method public constructor <init>(LVa6;Landroid/view/View;)V
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

    iput-object p1, p0, LVa6$d;->d:LVa6;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lbg2;->a(Landroid/view/View;)Lbg2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LVa6$d;->b:Lbg2;

    iget-object v0, p2, Lbg2;->b:Landroidx/appcompat/widget/AppCompatCheckBox;

    const-string v1, "viewBinding.checkBox"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LVa6$d$a;

    invoke-direct {v1, p0, p1}, LVa6$d$a;-><init>(LVa6$d;LVa6;)V

    invoke-static {v0, v1}, LMs2;->h(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    iget-object p2, p2, Lbg2;->c:Landroid/widget/Button;

    const-string v0, "viewBinding.editButton"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LVa6$d$b;

    invoke-direct {v0, p1, p0}, LVa6$d$b;-><init>(LVa6;LVa6$d;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic a(LVa6$d;)Z
    .locals 0

    iget-boolean p0, p0, LVa6$d;->c:Z

    return p0
.end method

.method public static final synthetic b(LVa6$d;)Lbg2;
    .locals 0

    iget-object p0, p0, LVa6$d;->b:Lbg2;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, LVa6$d;->c:Z

    iget-object v1, p0, LVa6$d;->d:LVa6;

    invoke-static {v1}, LVa6;->access$getAdapterData(LVa6;)LE6;

    move-result-object v1

    invoke-virtual {v1}, LE6;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, LL26;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LL26;

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, LVa6$d;->b:Lbg2;

    iget-object v1, v1, Lbg2;->b:Landroidx/appcompat/widget/AppCompatCheckBox;

    invoke-virtual {p1}, LL26;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LmS5;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, LVa6$d;->b:Lbg2;

    iget-object v1, v1, Lbg2;->b:Landroidx/appcompat/widget/AppCompatCheckBox;

    invoke-virtual {p1}, LL26;->getValue()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move v0, v3

    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    iget-object v0, p0, LVa6$d;->d:LVa6;

    iget-object v1, p0, LVa6$d;->b:Lbg2;

    iget-object v1, v1, Lbg2;->b:Landroidx/appcompat/widget/AppCompatCheckBox;

    const-string v2, "viewBinding.checkBox"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, LVa6;->access$updateTextColor(LVa6;Landroid/widget/CheckBox;)V

    iget-object v0, p0, LVa6$d;->b:Lbg2;

    iget-object v0, v0, Lbg2;->c:Landroid/widget/Button;

    invoke-virtual {p1}, LL26;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v1, p0, LVa6$d;->d:LVa6;

    invoke-static {v1, p1}, LVa6;->access$getValueString(LVa6;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    const-string p1, "Use Config"

    :goto_2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iput-boolean v3, p0, LVa6$d;->c:Z

    return-void
.end method
