.class public final Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;",
        "",
        "activity",
        "Landroidx/fragment/app/FragmentActivity;",
        "(Landroidx/fragment/app/FragmentActivity;)V",
        "customize",
        "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;",
        "toolbarCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;",
        "cancelButtonCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;",
        "Companion",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;


# instance fields
.field private final activity:Landroidx/fragment/app/FragmentActivity;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->Companion:Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->activity:Landroidx/fragment/app/FragmentActivity;

    return-void
.end method

.method public static synthetic customize$default(Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;ILjava/lang/Object;)Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->customize(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final customize(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->activity:Landroidx/fragment/app/FragmentActivity;

    instance-of v1, v0, Landroidx/appcompat/app/AppCompatActivity;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/appcompat/app/AppCompatActivity;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroidx/appcompat/app/AppCompatActivity;->getSupportActionBar()Landroidx/appcompat/app/ActionBar;

    move-result-object v1

    if-nez v1, :cond_1

    goto/16 :goto_5

    :cond_1
    new-instance v4, LaB0;

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->activity:Landroidx/fragment/app/FragmentActivity;

    sget v3, Lcom/stripe/android/stripe3ds2/R$style;->Stripe3DS2ActionBarButton:I

    invoke-direct {v4, v2, v3}, LaB0;-><init>(Landroid/content/Context;I)V

    new-instance v2, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/android/material/button/MaterialButton;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v2, p2}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;->setButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V

    new-instance p2, Landroidx/appcompat/app/ActionBar$LayoutParams;

    const v4, 0x800015

    const/4 v5, -0x2

    invoke-direct {p2, v5, v5, v4}, Landroidx/appcompat/app/ActionBar$LayoutParams;-><init>(III)V

    invoke-virtual {v1, v2, p2}, Landroidx/appcompat/app/ActionBar;->t(Landroid/view/View;Landroidx/appcompat/app/ActionBar$LayoutParams;)V

    const/4 p2, 0x1

    invoke-virtual {v1, p2}, Landroidx/appcompat/app/ActionBar;->w(Z)V

    if-eqz p1, :cond_9

    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->getButtonText()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    move v4, v3

    goto :goto_2

    :cond_3
    :goto_1
    move v4, p2

    :goto_2
    if-nez v4, :cond_4

    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->getButtonText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_4
    sget v4, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_hzv_cancel_label:I

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(I)V

    :goto_3
    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->getBackgroundColor()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5

    new-instance v5, Landroid/graphics/drawable/ColorDrawable;

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-direct {v5, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v5}, Landroidx/appcompat/app/ActionBar;->s(Landroid/graphics/drawable/Drawable;)V

    sget-object v4, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->Companion:Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;

    invoke-virtual {v4, v0, p1}, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer$Companion;->customizeStatusBar(Landroidx/appcompat/app/AppCompatActivity;Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)V

    :cond_5
    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->getHeaderText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    move v3, p2

    :cond_7
    if-nez v3, :cond_8

    invoke-interface {p1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->getHeaderText()Ljava/lang/String;

    move-result-object p2

    const-string v0, "{\n                toolba\u2026.headerText\n            }"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->activity:Landroidx/fragment/app/FragmentActivity;

    sget v0, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_hzv_header_label:I

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string v0, "{\n                activi\u2026ader_label)\n            }"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_4
    sget-object v0, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->INSTANCE:Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/views/HeaderZoneCustomizer;->activity:Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0, v3, p2, p1}, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->buildStyledText(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/Customization;)Landroid/text/SpannableString;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroidx/appcompat/app/ActionBar;->E(Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_9
    sget p1, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_hzv_header_label:I

    invoke-virtual {v1, p1}, Landroidx/appcompat/app/ActionBar;->D(I)V

    sget p1, Lcom/stripe/android/stripe3ds2/R$string;->stripe_3ds2_hzv_cancel_label:I

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(I)V

    :cond_a
    :goto_5
    return-object v2
.end method
