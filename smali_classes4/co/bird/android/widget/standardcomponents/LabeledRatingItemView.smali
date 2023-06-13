.class public final Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\r\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010+\u001a\u00020*\u00a2\u0006\u0004\u0008,\u0010-B\u0019\u0008\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008,\u0010.B!\u0008\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010/\u001a\u00020\u0002\u00a2\u0006\u0004\u0008,\u00100J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u001c\u0010\r\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\u0011\u001a\n \n*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u000cR(\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R$\u0010 \u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001b8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR$\u0010&\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020!8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R(\u0010)\u001a\u0004\u0018\u00010\u001b2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u001b8G@GX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\'\u0010\u001d\"\u0004\u0008(\u0010\u001f\u00a8\u00061"
    }
    d2 = {
        "Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "",
        "color",
        "",
        "setLabelTextColor",
        "Landroid/util/AttributeSet;",
        "attrs",
        "e",
        "Landroid/widget/TextView;",
        "kotlin.jvm.PlatformType",
        "b",
        "Landroid/widget/TextView;",
        "labelView",
        "Landroid/widget/RatingBar;",
        "c",
        "Landroid/widget/RatingBar;",
        "ratingBar",
        "d",
        "ratingValue",
        "",
        "value",
        "getLabel",
        "()Ljava/lang/CharSequence;",
        "setLabel",
        "(Ljava/lang/CharSequence;)V",
        "label",
        "Landroid/content/res/ColorStateList;",
        "getLabelTextColors",
        "()Landroid/content/res/ColorStateList;",
        "setLabelTextColors",
        "(Landroid/content/res/ColorStateList;)V",
        "labelTextColors",
        "",
        "getRating",
        "()F",
        "setRating",
        "(F)V",
        "rating",
        "getRatingTextColors",
        "setRatingTextColors",
        "ratingTextColors",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "defStyleAttrs",
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
.field public final b:Landroid/widget/TextView;

.field public final c:Landroid/widget/RatingBar;

.field public final d:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lmk4;->view_labeled_ride_rating:I

    const/4 v1, 0x1

    invoke-static {p1, v0, p0, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    sget p1, Lzi4;->label:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->b:Landroid/widget/TextView;

    sget p1, Lzi4;->ratingBar:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RatingBar;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->c:Landroid/widget/RatingBar;

    sget p1, Lzi4;->rating:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->d:Landroid/widget/TextView;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lmk4;->view_labeled_ride_rating:I

    const/4 v1, 0x1

    invoke-static {p1, v0, p0, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    sget p1, Lzi4;->label:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->b:Landroid/widget/TextView;

    sget p1, Lzi4;->ratingBar:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RatingBar;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->c:Landroid/widget/RatingBar;

    sget p1, Lzi4;->rating:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->d:Landroid/widget/TextView;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->e(Landroid/util/AttributeSet;)V

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

    sget p3, Lmk4;->view_labeled_ride_rating:I

    const/4 v0, 0x1

    invoke-static {p1, p3, p0, v0}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    sget p1, Lzi4;->label:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->b:Landroid/widget/TextView;

    sget p1, Lzi4;->ratingBar:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RatingBar;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->c:Landroid/widget/RatingBar;

    sget p1, Lzi4;->rating:I

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->d:Landroid/widget/TextView;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->e(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final e(Landroid/util/AttributeSet;)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, LLl4;->LabeledRatingItemView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string v0, "context.obtainStyledAttr\u2026le.LabeledRatingItemView)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, LLl4;->LabeledRatingItemView_ratingLabel:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->setLabel(Ljava/lang/CharSequence;)V

    sget v0, LLl4;->LabeledRatingItemView_rating:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->setRating(F)V

    sget v0, LLl4;->LabeledRatingItemView_ratingLabelTextColor:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->setLabelTextColors(Landroid/content/res/ColorStateList;)V

    :cond_0
    sget v0, LLl4;->LabeledRatingItemView_ratingColor:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->setRatingTextColors(Landroid/content/res/ColorStateList;)V

    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    iget-object p1, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->c:Landroid/widget/RatingBar;

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Landroid/widget/RatingBar;->setNumStars(I)V

    iget-object p1, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->c:Landroid/widget/RatingBar;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/widget/RatingBar;->setStepSize(F)V

    iget-object p1, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->c:Landroid/widget/RatingBar;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/RatingBar;->setIsIndicator(Z)V

    return-void
.end method

.method public final setLabel(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setLabelTextColor(I)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public final setLabelTextColors(Landroid/content/res/ColorStateList;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final setRating(F)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->c:Landroid/widget/RatingBar;

    invoke-virtual {v0, p1}, Landroid/widget/RatingBar;->setRating(F)V

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->d:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setRatingTextColors(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/LabeledRatingItemView;->c:Landroid/widget/RatingBar;

    invoke-virtual {v0, p1}, Landroid/view/View;->setForegroundTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method
