.class public final Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final caBrandZone:Lcom/stripe/android/stripe3ds2/views/BrandZoneView;

.field public final caChallengeZone:Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

.field public final caInformationZone:Lcom/stripe/android/stripe3ds2/views/InformationZoneView;

.field private final rootView:Landroid/widget/ScrollView;


# direct methods
.method private constructor <init>(Landroid/widget/ScrollView;Lcom/stripe/android/stripe3ds2/views/BrandZoneView;Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;Lcom/stripe/android/stripe3ds2/views/InformationZoneView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;->rootView:Landroid/widget/ScrollView;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;->caBrandZone:Lcom/stripe/android/stripe3ds2/views/BrandZoneView;

    iput-object p3, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;->caChallengeZone:Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    iput-object p4, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;->caInformationZone:Lcom/stripe/android/stripe3ds2/views/InformationZoneView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;
    .locals 4

    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->ca_brand_zone:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/stripe3ds2/views/BrandZoneView;

    if-eqz v1, :cond_0

    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->ca_challenge_zone:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    if-eqz v2, :cond_0

    sget v0, Lcom/stripe/android/stripe3ds2/R$id;->ca_information_zone:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;

    if-eqz v3, :cond_0

    new-instance v0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;

    check-cast p0, Landroid/widget/ScrollView;

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;-><init>(Landroid/widget/ScrollView;Lcom/stripe/android/stripe3ds2/views/BrandZoneView;Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;Lcom/stripe/android/stripe3ds2/views/InformationZoneView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;
    .locals 2

    sget v0, Lcom/stripe/android/stripe3ds2/R$layout;->stripe_challenge_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;->bind(Landroid/view/View;)Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;->getRoot()Landroid/widget/ScrollView;

    move-result-object v0

    return-object v0
.end method

.method public getRoot()Landroid/widget/ScrollView;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;->rootView:Landroid/widget/ScrollView;

    return-object v0
.end method
