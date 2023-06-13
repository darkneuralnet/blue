.class public final Lv80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lu80;

.field public final b:Lu80;

.field public final c:Lu80;

.field public final d:Lu80;

.field public final e:Lu80;

.field public final f:Lu80;

.field public final g:Lu80;

.field public final h:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Luf4;->materialCalendarStyle:I

    const-class v1, Lcom/google/android/material/datepicker/b;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, LBM2;->d(Landroid/content/Context;ILjava/lang/String;)I

    move-result v0

    sget-object v1, LXl4;->MaterialCalendar:[I

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, LXl4;->MaterialCalendar_dayStyle:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-static {p1, v1}, Lu80;->a(Landroid/content/Context;I)Lu80;

    move-result-object v1

    iput-object v1, p0, Lv80;->a:Lu80;

    sget v1, LXl4;->MaterialCalendar_dayInvalidStyle:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-static {p1, v1}, Lu80;->a(Landroid/content/Context;I)Lu80;

    move-result-object v1

    iput-object v1, p0, Lv80;->g:Lu80;

    sget v1, LXl4;->MaterialCalendar_daySelectedStyle:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-static {p1, v1}, Lu80;->a(Landroid/content/Context;I)Lu80;

    move-result-object v1

    iput-object v1, p0, Lv80;->b:Lu80;

    sget v1, LXl4;->MaterialCalendar_dayTodayStyle:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-static {p1, v1}, Lu80;->a(Landroid/content/Context;I)Lu80;

    move-result-object v1

    iput-object v1, p0, Lv80;->c:Lu80;

    sget v1, LXl4;->MaterialCalendar_rangeFillColor:I

    invoke-static {p1, v0, v1}, LNM2;->b(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    sget v3, LXl4;->MaterialCalendar_yearStyle:I

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-static {p1, v3}, Lu80;->a(Landroid/content/Context;I)Lu80;

    move-result-object v3

    iput-object v3, p0, Lv80;->d:Lu80;

    sget v3, LXl4;->MaterialCalendar_yearSelectedStyle:I

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-static {p1, v3}, Lu80;->a(Landroid/content/Context;I)Lu80;

    move-result-object v3

    iput-object v3, p0, Lv80;->e:Lu80;

    sget v3, LXl4;->MaterialCalendar_yearTodayStyle:I

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    invoke-static {p1, v2}, Lu80;->a(Landroid/content/Context;I)Lu80;

    move-result-object p1

    iput-object p1, p0, Lv80;->f:Lu80;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lv80;->h:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
