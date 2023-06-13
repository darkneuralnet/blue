.class public final Lco/bird/android/widget/standardcomponents/CheckableItemView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Checkable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/standardcomponents/CheckableItemView$a;,
        Lco/bird/android/widget/standardcomponents/CheckableItemView$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\r\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0002L\u001cB\u0011\u0008\u0016\u0012\u0006\u0010F\u001a\u00020E\u00a2\u0006\u0004\u0008G\u0010HB\u0019\u0008\u0016\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008G\u0010IB!\u0008\u0016\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010J\u001a\u00020\u000b\u00a2\u0006\u0004\u0008G\u0010KJ\u0008\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0008\u0010\u0008\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0014J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0017J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\"\u0010+\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010&\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R(\u00102\u001a\u0004\u0018\u00010,2\u0008\u0010-\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008.\u0010/\"\u0004\u00080\u00101R(\u00105\u001a\u0004\u0018\u00010,2\u0008\u0010-\u001a\u0004\u0018\u00010,8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00083\u0010/\"\u0004\u00084\u00101R(\u0010;\u001a\u0004\u0018\u0001062\u0008\u0010-\u001a\u0004\u0018\u0001068F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00087\u00108\"\u0004\u00089\u0010:R(\u0010A\u001a\u0004\u0018\u00010<2\u0008\u0010-\u001a\u0004\u0018\u00010<8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010@R(\u0010D\u001a\u0004\u0018\u0001062\u0008\u0010-\u001a\u0004\u0018\u0001068F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008B\u00108\"\u0004\u0008C\u0010:\u00a8\u0006M"
    }
    d2 = {
        "Lco/bird/android/widget/standardcomponents/CheckableItemView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Landroid/widget/Checkable;",
        "",
        "isChecked",
        "checked",
        "",
        "setChecked",
        "toggle",
        "enabled",
        "setEnabled",
        "",
        "extraSpace",
        "",
        "onCreateDrawableState",
        "Landroid/view/MotionEvent;",
        "event",
        "onTouchEvent",
        "Lqi0;",
        "viewModel",
        "e",
        "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;",
        "listener",
        "setOnCheckChangedListener",
        "Landroid/util/AttributeSet;",
        "attrs",
        "f",
        "LXp6;",
        "b",
        "LXp6;",
        "binding",
        "LZj0;",
        "c",
        "LZj0;",
        "detector",
        "d",
        "Lco/bird/android/widget/standardcomponents/CheckableItemView$b;",
        "checkedChangeListener",
        "Z",
        "getCanUncheck",
        "()Z",
        "setCanUncheck",
        "(Z)V",
        "canUncheck",
        "",
        "value",
        "getTitle",
        "()Ljava/lang/CharSequence;",
        "setTitle",
        "(Ljava/lang/CharSequence;)V",
        "title",
        "getDetails",
        "setDetails",
        "details",
        "Landroid/content/res/ColorStateList;",
        "getTitleColor",
        "()Landroid/content/res/ColorStateList;",
        "setTitleColor",
        "(Landroid/content/res/ColorStateList;)V",
        "titleColor",
        "Landroid/graphics/drawable/Drawable;",
        "getButtonDrawable",
        "()Landroid/graphics/drawable/Drawable;",
        "setButtonDrawable",
        "(Landroid/graphics/drawable/Drawable;)V",
        "buttonDrawable",
        "getButtonTintList",
        "setButtonTintList",
        "buttonTintList",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "defStyleAttr",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCheckableItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckableItemView.kt\nco/bird/android/widget/standardcomponents/CheckableItemView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"
    }
.end annotation


# static fields
.field public static final f:Lco/bird/android/widget/standardcomponents/CheckableItemView$a;

.field public static final g:[I


# instance fields
.field public final b:LXp6;

.field public final c:LZj0;

.field public d:Lco/bird/android/widget/standardcomponents/CheckableItemView$b;

.field public e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco/bird/android/widget/standardcomponents/CheckableItemView$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/widget/standardcomponents/CheckableItemView$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->f:Lco/bird/android/widget/standardcomponents/CheckableItemView$a;

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x10100a0

    aput v2, v0, v1

    sput-object v0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->g:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, LXp6;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)LXp6;

    move-result-object p1

    const-string v1, "inflate(context.layoutInflater, this)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->b:LXp6;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, LXf4;->activity_vertical_margin:I

    invoke-static {p1, v1}, LfB0;->h(Landroid/content/Context;I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p1

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, LXf4;->activity_vertical_margin:I

    invoke-static {v1, v2}, LfB0;->h(Landroid/content/Context;I)I

    move-result v1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    :goto_1
    const/4 v2, 0x0

    invoke-virtual {p0, v2, p1, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v1, LHg4;->ripple_white:I

    invoke-static {p1, v1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v1, LDf4;->work_order_item_background_state_list:I

    invoke-static {p1, v1}, LNA0;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {p0, p1}, Lbq6;->B0(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    new-instance p1, LZj0;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v1}, LZj0;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->c:LZj0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->e:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, LXp6;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)LXp6;

    move-result-object p1

    const-string v1, "inflate(context.layoutInflater, this)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->b:LXp6;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, LXf4;->activity_vertical_margin:I

    invoke-static {p1, v1}, LfB0;->h(Landroid/content/Context;I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p1

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, LXf4;->activity_vertical_margin:I

    invoke-static {v1, v2}, LfB0;->h(Landroid/content/Context;I)I

    move-result v1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    :goto_1
    const/4 v2, 0x0

    invoke-virtual {p0, v2, p1, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v1, LHg4;->ripple_white:I

    invoke-static {p1, v1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v1, LDf4;->work_order_item_background_state_list:I

    invoke-static {p1, v1}, LNA0;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {p0, p1}, Lbq6;->B0(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    new-instance p1, LZj0;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v1}, LZj0;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->c:LZj0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->e:Z

    invoke-virtual {p0, p2}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->f(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, LXp6;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)LXp6;

    move-result-object p1

    const-string p3, "inflate(context.layoutInflater, this)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->b:LXp6;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget p3, LXf4;->activity_vertical_margin:I

    invoke-static {p1, p3}, LfB0;->h(Landroid/content/Context;I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p1

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, LXf4;->activity_vertical_margin:I

    invoke-static {p3, v1}, LfB0;->h(Landroid/content/Context;I)I

    move-result p3

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    :goto_1
    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1, v1, p3}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p3, LHg4;->ripple_white:I

    invoke-static {p1, p3}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p3, LDf4;->work_order_item_background_state_list:I

    invoke-static {p1, p3}, LNA0;->d(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {p0, p1}, Lbq6;->B0(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    new-instance p1, LZj0;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p3}, LZj0;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->c:LZj0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->e:Z

    invoke-virtual {p0, p2}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->f(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final e(Lqi0;)V
    .locals 1

    const-string v0, "viewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lqi0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lqi0;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setDetails(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lqi0;->a()Z

    move-result v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setChecked(Z)V

    invoke-virtual {p1}, Lqi0;->c()Z

    move-result p1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setEnabled(Z)V

    return-void
.end method

.method public final f(Landroid/util/AttributeSet;)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, LLl4;->CheckableItemView:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string v0, "context.theme.obtainStyl\u2026temView,\n      0, 0\n    )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, LLl4;->CheckableItemView_android_checked:I

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setChecked(Z)V

    sget v0, LLl4;->CheckableItemView_android_title:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setTitle(Ljava/lang/CharSequence;)V

    sget v0, LLl4;->CheckableItemView_android_description:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setDetails(Ljava/lang/CharSequence;)V

    sget v0, LLl4;->CheckableItemView_android_button:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, LHg4;->checkbox_work_order_item:I

    invoke-static {v0, v1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_0
    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    sget v0, LLl4;->CheckableItemView_buttonTint:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    sget v0, LLl4;->CheckableItemView_titleColor:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setTitleColor(Landroid/content/res/ColorStateList;)V

    sget v0, LLl4;->CheckableItemView_canUncheck:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->e:Z

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public isChecked()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->b:LXp6;

    iget-object v0, v0, LXp6;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    return v0
.end method

.method public onCreateDrawableState(I)[I
    .locals 1

    add-int/lit8 p1, p1, 0x1

    invoke-super {p0, p1}, Landroid/view/View;->onCreateDrawableState(I)[I

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->g:[I

    invoke-static {p1, v0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    :cond_0
    const-string v0, "drawableState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->drawableHotspotChanged(FF)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setPressed(Z)V

    :goto_0
    iget-boolean v0, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->e:Z

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->c:LZj0;

    invoke-virtual {v0, p1}, LZj0;->a(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->toggle()V

    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    :cond_3
    return v1
.end method

.method public final setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->b:LXp6;

    iget-object v0, v0, LXp6;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->b:LXp6;

    iget-object v0, v0, LXp6;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final setCanUncheck(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->e:Z

    return-void
.end method

.method public setChecked(Z)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->b:LXp6;

    iget-object v0, v0, LXp6;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->d:Lco/bird/android/widget/standardcomponents/CheckableItemView$b;

    if-eqz v0, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->isChecked()Z

    move-result v1

    invoke-interface {v0, p0, v1}, Lco/bird/android/widget/standardcomponents/CheckableItemView$b;->a(Lco/bird/android/widget/standardcomponents/CheckableItemView;Z)V

    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setSelected(Z)V

    return-void
.end method

.method public final setDetails(Ljava/lang/CharSequence;)V
    .locals 4

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->b:LXp6;

    iget-object v0, v0, LXp6;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->b:LXp6;

    iget-object v0, v0, LXp6;->c:Landroid/widget/TextView;

    const-string v1, "binding.details"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v1

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v2

    :goto_1
    xor-int/2addr p1, v2

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, p1, v1, v2, v3}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->b:LXp6;

    iget-object v0, v0, LXp6;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->b:LXp6;

    iget-object v0, v0, LXp6;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    return-void
.end method

.method public final setOnCheckChangedListener(Lco/bird/android/widget/standardcomponents/CheckableItemView$b;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->d:Lco/bird/android/widget/standardcomponents/CheckableItemView$b;

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->b:LXp6;

    iget-object v0, v0, LXp6;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTitleColor(Landroid/content/res/ColorStateList;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/CheckableItemView;->b:LXp6;

    iget-object v0, v0, LXp6;->d:Landroid/widget/TextView;

    const-string v1, "binding.title"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public toggle()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->isChecked()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setChecked(Z)V

    return-void
.end method
