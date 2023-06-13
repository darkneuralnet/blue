.class public final LVa6$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVa6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LVa6$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lag2;",
        "b",
        "Lag2;",
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
        "SMAP\nTweaksAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$EnumTweakViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,247:1\n18#2:248\n9#3,4:249\n*S KotlinDebug\n*F\n+ 1 TweaksAdapter.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapter$EnumTweakViewHolder\n*L\n202#1:248\n202#1:249,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lag2;

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

    iput-object p1, p0, LVa6$b;->d:LVa6;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lag2;->a(Landroid/view/View;)Lag2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LVa6$b;->b:Lag2;

    iget-object v0, p2, Lag2;->b:Landroidx/appcompat/widget/AppCompatCheckBox;

    const-string v1, "viewBinding.checkBox"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LVa6$b$a;

    invoke-direct {v1, p0, p1}, LVa6$b$a;-><init>(LVa6$b;LVa6;)V

    invoke-static {v0, v1}, LMs2;->h(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    iget-object p2, p2, Lag2;->c:Landroidx/appcompat/widget/AppCompatSpinner;

    new-instance v0, LVa6$b$b;

    invoke-direct {v0, p0, p1}, LVa6$b$b;-><init>(LVa6$b;LVa6;)V

    invoke-virtual {p2, v0}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method public static final synthetic a(LVa6$b;)Z
    .locals 0

    iget-boolean p0, p0, LVa6$b;->c:Z

    return p0
.end method

.method public static final synthetic b(LVa6$b;)Lag2;
    .locals 0

    iget-object p0, p0, LVa6$b;->b:Lag2;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, LVa6$b;->c:Z

    iget-object v1, p0, LVa6$b;->d:LVa6;

    invoke-static {v1}, LVa6;->access$getAdapterData(LVa6;)LE6;

    move-result-object v1

    invoke-virtual {v1}, LE6;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lof1;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lof1;

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, LVa6$b;->b:Lag2;

    iget-object v1, v1, Lag2;->b:Landroidx/appcompat/widget/AppCompatCheckBox;

    invoke-virtual {p1}, Lof1;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LmS5;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, LVa6$b;->b:Lag2;

    iget-object v1, v1, Lag2;->b:Landroidx/appcompat/widget/AppCompatCheckBox;

    invoke-virtual {p1}, Lof1;->getValue()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    xor-int/2addr v2, v0

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    iget-object v1, p0, LVa6$b;->d:LVa6;

    iget-object v2, p0, LVa6$b;->b:Lag2;

    iget-object v2, v2, Lag2;->b:Landroidx/appcompat/widget/AppCompatCheckBox;

    const-string v3, "viewBinding.checkBox"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, LVa6;->access$updateTextColor(LVa6;Landroid/widget/CheckBox;)V

    iget-object v1, p0, LVa6$b;->b:Lag2;

    iget-object v2, v1, Lag2;->c:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v1, v1, Lag2;->b:Landroidx/appcompat/widget/AppCompatCheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    invoke-virtual {v2, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v1, p0, LVa6$b;->b:Lag2;

    iget-object v1, v1, Lag2;->c:Landroidx/appcompat/widget/AppCompatSpinner;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Lof1;->d()Ljava/util/List;

    move-result-object v3

    new-instance v4, LVa6$b$c;

    invoke-direct {v4, v2, v3}, LVa6$b$c;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v1, v4}, Landroidx/appcompat/widget/AppCompatSpinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    iget-object v1, p0, LVa6$b;->b:Lag2;

    iget-object v1, v1, Lag2;->c:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {p1}, Lof1;->f()I

    move-result p1

    add-int/2addr p1, v0

    invoke-virtual {v1, p1}, Landroid/widget/AdapterView;->setSelection(I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LVa6$b;->c:Z

    return-void
.end method
