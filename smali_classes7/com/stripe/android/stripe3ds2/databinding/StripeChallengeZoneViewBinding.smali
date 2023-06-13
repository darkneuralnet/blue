.class public final Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final czvEntryView:Landroid/widget/FrameLayout;

.field public final czvHeader:Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;

.field public final czvInfo:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

.field public final czvResendButton:Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

.field public final czvSubmitButton:Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

.field public final czvWhitelistNoButton:Landroid/widget/RadioButton;

.field public final czvWhitelistRadioGroup:Landroid/widget/RadioGroup;

.field public final czvWhitelistYesButton:Landroid/widget/RadioButton;

.field public final czvWhitelistingLabel:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroid/widget/FrameLayout;Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;Landroid/widget/RadioButton;Landroid/widget/RadioGroup;Landroid/widget/RadioButton;Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;->rootView:Landroid/view/View;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;->czvEntryView:Landroid/widget/FrameLayout;

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;->czvHeader:Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;

    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;->czvInfo:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    iput-object p5, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;->czvResendButton:Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

    iput-object p6, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;->czvSubmitButton:Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

    iput-object p7, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;->czvWhitelistNoButton:Landroid/widget/RadioButton;

    iput-object p8, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;->czvWhitelistRadioGroup:Landroid/widget/RadioGroup;

    iput-object p9, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;->czvWhitelistYesButton:Landroid/widget/RadioButton;

    iput-object p10, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;->czvWhitelistingLabel:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;
    .locals 13

    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->czv_entry_view:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/FrameLayout;

    if-eqz v4, :cond_0

    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->czv_header:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;

    if-eqz v5, :cond_0

    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->czv_info:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    if-eqz v6, :cond_0

    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->czv_resend_button:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

    if-eqz v7, :cond_0

    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->czv_submit_button:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

    if-eqz v8, :cond_0

    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->czv_whitelist_no_button:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/RadioButton;

    if-eqz v9, :cond_0

    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->czv_whitelist_radio_group:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/RadioGroup;

    if-eqz v10, :cond_0

    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->czv_whitelist_yes_button:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Landroid/widget/RadioButton;

    if-eqz v11, :cond_0

    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->czv_whitelisting_label:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    if-eqz v12, :cond_0

    new-instance v0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v12}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;-><init>(Landroid/view/View;Landroid/widget/FrameLayout;Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;Landroid/widget/RadioButton;Landroid/widget/RadioGroup;Landroid/widget/RadioButton;Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lcom/stripe/android/stripe3ds2/R$layout;->stripe_challenge_zone_view:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;->bind(Landroid/view/View;)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeZoneViewBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
