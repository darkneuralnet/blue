.class public final Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;,
        Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u001fB\u0011\u0008\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aB\u0019\u0008\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001bB!\u0008\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u0019\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR*\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\u00a8\u0006 "
    }
    d2 = {
        "Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;",
        "Landroidx/appcompat/widget/AppCompatTextView;",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "g",
        "Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;",
        "value",
        "b",
        "Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;",
        "getArrowDirection",
        "()Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;",
        "setArrowDirection",
        "(Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;)V",
        "arrowDirection",
        "",
        "c",
        "Z",
        "f",
        "()Z",
        "setCollapsable",
        "(Z)V",
        "collapsable",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "a",
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
.field public b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

.field public c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    sget-object p1, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object p1, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->g(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attrs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object p1, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->g(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->c:Z

    return v0
.end method

.method public final g(Landroid/util/AttributeSet;)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, LLl4;->CollapsableHeaderView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string v0, "context.obtainStyledAttr\u2026le.CollapsableHeaderView)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, LLl4;->CollapsableHeaderView_collapsable:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->setCollapsable(Z)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final setArrowDirection(Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

    sget-object v0, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lrg4;->ic_filled_carrot_up:I

    invoke-static {p1, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lrg4;->ic_filled_carrot_down:I

    invoke-static {p1, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, v1, v1, p1, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setCollapsable(Z)V
    .locals 2

    iput-boolean p1, p0, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->c:Z

    if-eqz p1, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

    sget-object v1, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

    if-ne v0, v1, :cond_0

    sget-object p1, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;->c:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->setArrowDirection(Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;->b:Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/standardcomponents/CollapsableHeaderView;->setArrowDirection(Lco/bird/android/widget/standardcomponents/CollapsableHeaderView$a;)V

    :cond_1
    :goto_0
    return-void
.end method
