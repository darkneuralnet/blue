.class public final Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\r\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010)\u001a\u00020(\u00a2\u0006\u0004\u0008*\u0010+B\u0019\u0008\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008*\u0010,B!\u0008\u0016\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010-\u001a\u00020\u0002\u00a2\u0006\u0004\u0008*\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u000bR(\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR$\u0010$\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00028F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R(\u0010\'\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008%\u0010\u001c\"\u0004\u0008&\u0010\u001e\u00a8\u0006/"
    }
    d2 = {
        "Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;",
        "Landroid/widget/LinearLayout;",
        "",
        "drawableRes",
        "",
        "setTaskImageResource",
        "Landroid/util/AttributeSet;",
        "attrs",
        "a",
        "Landroid/widget/TextView;",
        "b",
        "Landroid/widget/TextView;",
        "codeText",
        "Lco/bird/android/widget/BatteryView;",
        "c",
        "Lco/bird/android/widget/BatteryView;",
        "batteryView",
        "d",
        "batteryText",
        "Landroid/widget/ImageView;",
        "e",
        "Landroid/widget/ImageView;",
        "taskImage",
        "f",
        "taskText",
        "",
        "value",
        "getCode",
        "()Ljava/lang/CharSequence;",
        "setCode",
        "(Ljava/lang/CharSequence;)V",
        "code",
        "getBatteryPercentLevel",
        "()I",
        "setBatteryPercentLevel",
        "(I)V",
        "batteryPercentLevel",
        "getTaskLabel",
        "setTaskLabel",
        "taskLabel",
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

.field public final c:Lco/bird/android/widget/BatteryView;

.field public final d:Landroid/widget/TextView;

.field public final e:Landroid/widget/ImageView;

.field public final f:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lmk4;->view_vehicle_detail:I

    const/4 v1, 0x1

    invoke-static {p1, v0, p0, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    sget p1, Lzi4;->codeText:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->b:Landroid/widget/TextView;

    sget p1, Lzi4;->batteryView:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lco/bird/android/widget/BatteryView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->c:Lco/bird/android/widget/BatteryView;

    sget p1, Lzi4;->battery:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->d:Landroid/widget/TextView;

    sget p1, Lzi4;->taskImage:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->e:Landroid/widget/ImageView;

    sget p1, Lzi4;->taskText:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->f:Landroid/widget/TextView;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lmk4;->view_vehicle_detail:I

    const/4 v1, 0x1

    invoke-static {p1, v0, p0, v1}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    sget p1, Lzi4;->codeText:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->b:Landroid/widget/TextView;

    sget p1, Lzi4;->batteryView:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lco/bird/android/widget/BatteryView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->c:Lco/bird/android/widget/BatteryView;

    sget p1, Lzi4;->battery:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->d:Landroid/widget/TextView;

    sget p1, Lzi4;->taskImage:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->e:Landroid/widget/ImageView;

    sget p1, Lzi4;->taskText:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->f:Landroid/widget/TextView;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->a(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget p3, Lmk4;->view_vehicle_detail:I

    const/4 v0, 0x1

    invoke-static {p1, p3, p0, v0}, LfB0;->u(Landroid/content/Context;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    sget p1, Lzi4;->codeText:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->b:Landroid/widget/TextView;

    sget p1, Lzi4;->batteryView:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lco/bird/android/widget/BatteryView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->c:Lco/bird/android/widget/BatteryView;

    sget p1, Lzi4;->battery:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->d:Landroid/widget/TextView;

    sget p1, Lzi4;->taskImage:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->e:Landroid/widget/ImageView;

    sget p1, Lzi4;->taskText:I

    invoke-static {p0, p1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->f:Landroid/widget/TextView;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->a(Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/util/AttributeSet;)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, LLl4;->VehicleDetailItemView:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string v0, "context.obtainStyledAttr\u2026le.VehicleDetailItemView)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, LLl4;->VehicleDetailItemView_code:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->setCode(Ljava/lang/CharSequence;)V

    sget v0, LLl4;->VehicleDetailItemView_batteryLevel:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    new-instance v2, Lkotlin/ranges/IntRange;

    const/16 v3, 0x64

    invoke-direct {v2, v1, v3}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceIn(ILkotlin/ranges/ClosedRange;)I

    move-result v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->setBatteryPercentLevel(I)V

    sget v0, LLl4;->VehicleDetailItemView_taskText:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->setTaskLabel(Ljava/lang/CharSequence;)V

    sget v0, LLl4;->VehicleDetailItemView_taskImage:I

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->e:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final setBatteryPercentLevel(I)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->c:Lco/bird/android/widget/BatteryView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/BatteryView;->setPercent(I)V

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->d:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setCode(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTaskImageResource(I)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public final setTaskLabel(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/standardcomponents/VehicleDetailItemView;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
