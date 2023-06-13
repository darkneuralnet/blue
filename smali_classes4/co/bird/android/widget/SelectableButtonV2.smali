.class public final Lco/bird/android/widget/SelectableButtonV2;
.super Landroidx/appcompat/widget/AppCompatButton;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008$\u0010%B\u001b\u0008\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010&\u00a2\u0006\u0004\u0008$\u0010(B#\u0008\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010)\u001a\u00020\u0002\u00a2\u0006\u0004\u0008$\u0010*J\u001a\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002J\u001a\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0008\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005R\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\u0011\u001a\u0004\u0008\u0017\u0010\u0013\"\u0004\u0008\u0018\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u0011\u001a\u0004\u0008\u001b\u0010\u0013\"\u0004\u0008\u001c\u0010\u0015R\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u0011\u001a\u0004\u0008\u001f\u0010\u0013\"\u0004\u0008 \u0010\u0015\u00a8\u0006+"
    }
    d2 = {
        "Lco/bird/android/widget/SelectableButtonV2;",
        "Landroidx/appcompat/widget/AppCompatButton;",
        "",
        "background",
        "color",
        "",
        "setSelectedBackgroundAndTextColor",
        "setDeselectedBackgroundAndTextColor",
        "d",
        "b",
        "",
        "Z",
        "c",
        "()Z",
        "setOptionSelected",
        "(Z)V",
        "isOptionSelected",
        "I",
        "getSelectedBackgroundResource",
        "()I",
        "setSelectedBackgroundResource",
        "(I)V",
        "selectedBackgroundResource",
        "getDeselectedBackgroundResource",
        "setDeselectedBackgroundResource",
        "deselectedBackgroundResource",
        "e",
        "getSelectedTextColor",
        "setSelectedTextColor",
        "selectedTextColor",
        "f",
        "getDeselectedTextColor",
        "setDeselectedTextColor",
        "deselectedTextColor",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;)V

    sget p1, LHg4;->button_pill_selector_enabled_black_no_ripple:I

    iput p1, p0, Lco/bird/android/widget/SelectableButtonV2;->c:I

    sget p1, LHg4;->button_pill_selector_no_color:I

    iput p1, p0, Lco/bird/android/widget/SelectableButtonV2;->d:I

    sget v0, LDf4;->white:I

    iput v0, p0, Lco/bird/android/widget/SelectableButtonV2;->e:I

    sget v0, LDf4;->black:I

    iput v0, p0, Lco/bird/android/widget/SelectableButtonV2;->f:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;->setBackgroundResource(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lco/bird/android/widget/SelectableButtonV2;->b:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget p1, LHg4;->button_pill_selector_enabled_black_no_ripple:I

    iput p1, p0, Lco/bird/android/widget/SelectableButtonV2;->c:I

    sget p1, LHg4;->button_pill_selector_no_color:I

    iput p1, p0, Lco/bird/android/widget/SelectableButtonV2;->d:I

    sget p2, LDf4;->white:I

    iput p2, p0, Lco/bird/android/widget/SelectableButtonV2;->e:I

    sget p2, LDf4;->black:I

    iput p2, p0, Lco/bird/android/widget/SelectableButtonV2;->f:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;->setBackgroundResource(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lco/bird/android/widget/SelectableButtonV2;->b:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget p1, LHg4;->button_pill_selector_enabled_black_no_ripple:I

    iput p1, p0, Lco/bird/android/widget/SelectableButtonV2;->c:I

    sget p1, LHg4;->button_pill_selector_no_color:I

    iput p1, p0, Lco/bird/android/widget/SelectableButtonV2;->d:I

    sget p2, LDf4;->white:I

    iput p2, p0, Lco/bird/android/widget/SelectableButtonV2;->e:I

    sget p2, LDf4;->black:I

    iput p2, p0, Lco/bird/android/widget/SelectableButtonV2;->f:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;->setBackgroundResource(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lco/bird/android/widget/SelectableButtonV2;->b:Z

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget v0, p0, Lco/bird/android/widget/SelectableButtonV2;->d:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatButton;->setBackgroundResource(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lco/bird/android/widget/SelectableButtonV2;->f:I

    invoke-static {v0, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lco/bird/android/widget/SelectableButtonV2;->b:Z

    return-void
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/SelectableButtonV2;->b:Z

    return v0
.end method

.method public final d()V
    .locals 2

    iget v0, p0, Lco/bird/android/widget/SelectableButtonV2;->c:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatButton;->setBackgroundResource(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lco/bird/android/widget/SelectableButtonV2;->e:I

    invoke-static {v0, v1}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lco/bird/android/widget/SelectableButtonV2;->b:Z

    return-void
.end method

.method public final setDeselectedBackgroundAndTextColor(II)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/SelectableButtonV2;->d:I

    iput p2, p0, Lco/bird/android/widget/SelectableButtonV2;->f:I

    return-void
.end method

.method public final setDeselectedBackgroundResource(I)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/SelectableButtonV2;->d:I

    return-void
.end method

.method public final setDeselectedTextColor(I)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/SelectableButtonV2;->f:I

    return-void
.end method

.method public final setOptionSelected(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/widget/SelectableButtonV2;->b:Z

    return-void
.end method

.method public final setSelectedBackgroundAndTextColor(II)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/SelectableButtonV2;->c:I

    iput p2, p0, Lco/bird/android/widget/SelectableButtonV2;->e:I

    return-void
.end method

.method public final setSelectedBackgroundResource(I)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/SelectableButtonV2;->c:I

    return-void
.end method

.method public final setSelectedTextColor(I)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/SelectableButtonV2;->e:I

    return-void
.end method
