.class public final Lcom/google/android/gms/wallet/button/PayButton;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public b:Lcom/google/android/gms/wallet/button/ButtonOptions$a;

.field public final c:LAe8;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/wallet/button/PayButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/wallet/button/PayButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {}, Lcom/google/android/gms/wallet/button/ButtonOptions;->F()Lcom/google/android/gms/wallet/button/ButtonOptions$a;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/gms/wallet/button/PayButton;->b:Lcom/google/android/gms/wallet/button/ButtonOptions$a;

    sget-object v0, LWl4;->PayButtonAttributes:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, LWl4;->PayButtonAttributes_buttonTheme:I

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/high16 v2, 0x42c80000    # 100.0f

    invoke-static {v0, v2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    float-to-int v1, v1

    sget v2, LWl4;->PayButtonAttributes_cornerRadius:I

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    iget-object p1, p3, Lcom/google/android/gms/wallet/button/ButtonOptions$a;->a:Lcom/google/android/gms/wallet/button/ButtonOptions;

    iput p2, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;->c:I

    iput v1, p1, Lcom/google/android/gms/wallet/button/ButtonOptions;->d:I

    invoke-virtual {p3, v0}, Lcom/google/android/gms/wallet/button/ButtonOptions$a;->a(I)Lcom/google/android/gms/wallet/button/ButtonOptions$a;

    new-instance p1, LAe8;

    invoke-direct {p1}, LAe8;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wallet/button/PayButton;->c:LAe8;

    return-void
.end method
