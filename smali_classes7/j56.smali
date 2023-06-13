.class public Lj56;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "InflateParams"
    }
.end annotation


# static fields
.field public static final a:Landroid/graphics/Typeface;

.field public static b:Landroid/graphics/Typeface;

.field public static c:I

.field public static d:Z

.field public static e:Z

.field public static f:Landroid/widget/Toast;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "sans-serif-condensed"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lj56;->a:Landroid/graphics/Typeface;

    sput-object v0, Lj56;->b:Landroid/graphics/Typeface;

    const/16 v0, 0x10

    sput v0, Lj56;->c:I

    const/4 v0, 0x1

    sput-boolean v0, Lj56;->d:Z

    sput-boolean v0, Lj56;->e:Z

    const/4 v0, 0x0

    sput-object v0, Lj56;->f:Landroid/widget/Toast;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;IIIZZ)Landroid/widget/Toast;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ShowToast"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p0, v0, p5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p5

    const-string v0, "layout_inflater"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    sget v1, LAk4;->toast_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    sget v1, LRg4;->toast_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    sget v2, LRg4;->toast_text:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz p7, :cond_0

    invoke-static {p0, p3}, Lk56;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget p3, LEg4;->toast_frame:I

    invoke-static {p0, p3}, Lk56;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    :goto_0
    invoke-static {v0, p0}, Lk56;->c(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    if-eqz p6, :cond_3

    if-eqz p2, :cond_2

    sget-boolean p0, Lj56;->d:Z

    if-eqz p0, :cond_1

    invoke-static {p2, p4}, Lk56;->e(Landroid/graphics/drawable/Drawable;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    :cond_1
    invoke-static {v1, p2}, Lk56;->c(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Avoid passing \'icon\' as null if \'withIcon\' is set to true"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    const/16 p0, 0x8

    invoke-virtual {v1, p0}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_1
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v2, p4}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object p0, Lj56;->b:Landroid/graphics/Typeface;

    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    sget p0, Lj56;->c:I

    int-to-float p0, p0

    const/4 p1, 0x2

    invoke-virtual {v2, p1, p0}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {p5, v0}, Landroid/widget/Toast;->setView(Landroid/view/View;)V

    sget-boolean p0, Lj56;->e:Z

    if-nez p0, :cond_5

    sget-object p0, Lj56;->f:Landroid/widget/Toast;

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Landroid/widget/Toast;->cancel()V

    :cond_4
    sput-object p5, Lj56;->f:Landroid/widget/Toast;

    :cond_5
    return-object p5
.end method

.method public static b(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lj56;->c(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/CharSequence;IZ)Landroid/widget/Toast;
    .locals 9

    sget v0, LEg4;->ic_clear_white_24dp:I

    invoke-static {p0, v0}, Lk56;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    sget v0, LAf4;->errorColor:I

    invoke-static {p0, v0}, Lk56;->a(Landroid/content/Context;I)I

    move-result v4

    sget v0, LAf4;->defaultTextColor:I

    invoke-static {p0, v0}, Lk56;->a(Landroid/content/Context;I)I

    move-result v5

    const/4 v8, 0x1

    move-object v1, p0

    move-object v2, p1

    move v6, p2

    move v7, p3

    invoke-static/range {v1 .. v8}, Lj56;->a(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;IIIZZ)Landroid/widget/Toast;

    move-result-object p0

    return-object p0
.end method
