.class public final Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mAccentColor:Ljava/lang/String;

.field private final mCustomButtonTypeCustomization:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;",
            ">;"
        }
    .end annotation
.end field

.field private final mDefaultButtonTypeCustomizations:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;",
            "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;",
            ">;"
        }
    .end annotation
.end field

.field private mLabelCustomization:Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

.field private mTextBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

.field private mToolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization$1;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization$1;-><init>()V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mDefaultButtonTypeCustomizations:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mCustomButtonTypeCustomization:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;)V
    .locals 7

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;-><init>()V

    sget v0, Lvf4;->actionBarTheme:I

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getThemeContext(Landroid/app/Activity;I)Landroid/content/Context;

    move-result-object v0

    const v1, 0x1010433

    invoke-direct {p0, p1, v1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getThemeColor(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x1010434

    invoke-direct {p0, p1, v2}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getThemeColor(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x1010036

    invoke-direct {p0, v0, v3}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getThemeColor(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    const v3, 0x1010098

    invoke-direct {p0, p1, v3}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getThemeColor(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x1010435

    invoke-direct {p0, p1, v4}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getThemeColor(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x101009a

    invoke-direct {p0, p1, v5}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->getThemeColor(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object p1

    new-instance v5, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    invoke-direct {v5}, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;-><init>()V

    iput-object v5, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mToolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    new-instance v5, Lcom/stripe/android/stripe3ds2/init/ui/StripeLabelCustomization;

    invoke-direct {v5}, Lcom/stripe/android/stripe3ds2/init/ui/StripeLabelCustomization;-><init>()V

    iput-object v5, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mLabelCustomization:Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    new-instance v5, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;

    invoke-direct {v5}, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;-><init>()V

    iput-object v5, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mTextBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    if-eqz p1, :cond_0

    invoke-interface {v5, p1}, Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;->setHintTextColor(Ljava/lang/String;)V

    :cond_0
    new-instance p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;

    invoke-direct {p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;-><init>()V

    new-instance v5, Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;

    invoke-direct {v5}, Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;-><init>()V

    if-eqz v0, :cond_1

    iget-object v6, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mToolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    invoke-interface {v6, v0}, Lcom/stripe/android/stripe3ds2/init/ui/Customization;->setTextColor(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/stripe/android/stripe3ds2/init/ui/Customization;->setTextColor(Ljava/lang/String;)V

    :cond_1
    if-eqz v1, :cond_2

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mToolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    invoke-interface {v0, v1}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->setBackgroundColor(Ljava/lang/String;)V

    :cond_2
    if-eqz v2, :cond_3

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mToolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    invoke-interface {v0, v2}, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;->setStatusBarColor(Ljava/lang/String;)V

    :cond_3
    if-eqz v3, :cond_4

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mLabelCustomization:Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    invoke-interface {v0, v3}, Lcom/stripe/android/stripe3ds2/init/ui/Customization;->setTextColor(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mLabelCustomization:Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    invoke-interface {v0, v3}, Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;->setHeadingTextColor(Ljava/lang/String;)V

    invoke-interface {v5, v3}, Lcom/stripe/android/stripe3ds2/init/ui/Customization;->setTextColor(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mTextBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    invoke-interface {v0, v3}, Lcom/stripe/android/stripe3ds2/init/ui/Customization;->setTextColor(Ljava/lang/String;)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {p0, v4}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->setAccentColor(Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;-><init>()V

    invoke-interface {v0, v4}, Lcom/stripe/android/stripe3ds2/init/ui/Customization;->setTextColor(Ljava/lang/String;)V

    sget-object v1, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->RESEND:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {p0, v0, v1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->setButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)V

    invoke-interface {v5, v4}, Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;->setBackgroundColor(Ljava/lang/String;)V

    :cond_5
    sget-object v0, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->CANCEL:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {p0, p1, v0}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->setButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)V

    sget-object p1, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->NEXT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {p0, v5, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->setButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)V

    sget-object p1, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->CONTINUE:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {p0, v5, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->setButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)V

    sget-object p1, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->SUBMIT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {p0, v5, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->setButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)V

    sget-object p1, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->SELECT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {p0, v5, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->setButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)V

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mAccentColor:Ljava/lang/String;

    const-class v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mToolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    const-class v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeLabelCustomization;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mLabelCustomization:Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    const-class v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mTextBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mDefaultButtonTypeCustomizations:Ljava/util/Map;

    const-class v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;

    if-eqz v4, :cond_0

    iget-object v5, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mDefaultButtonTypeCustomizations:Ljava/util/Map;

    invoke-static {v3}, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->valueOf(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    move-result-object v3

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mCustomButtonTypeCustomization:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;

    if-eqz v2, :cond_2

    iget-object v3, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mCustomButtonTypeCustomization:Ljava/util/Map;

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public static createWithAppTheme(Landroid/app/Activity;)Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;
    .locals 1

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-direct {v0, p0}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method

.method private getThemeColor(Landroid/content/Context;I)Ljava/lang/String;
    .locals 3

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p2, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p2

    if-eqz p2, :cond_1

    iget p2, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz p2, :cond_0

    invoke-static {p1, p2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    goto :goto_0

    :cond_0
    iget p1, v0, Landroid/util/TypedValue;->data:I

    :goto_0
    invoke-static {p1}, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->colorIntToHex(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private getThemeContext(Landroid/app/Activity;I)Landroid/content/Context;
    .locals 3

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p2, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, LaB0;

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {p2, p1, v0}, LaB0;-><init>(Landroid/content/Context;I)V

    return-object p2

    :cond_0
    return-object p1
.end method

.method private typedEquals(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)Z
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mToolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    iget-object v1, p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mToolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    invoke-static {v0, v1}, Lcom/stripe/android/stripe3ds2/utils/ObjectUtils;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mAccentColor:Ljava/lang/String;

    iget-object v1, p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mAccentColor:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/stripe/android/stripe3ds2/utils/ObjectUtils;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mLabelCustomization:Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    iget-object v1, p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mLabelCustomization:Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    invoke-static {v0, v1}, Lcom/stripe/android/stripe3ds2/utils/ObjectUtils;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mTextBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    iget-object v1, p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mTextBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    invoke-static {v0, v1}, Lcom/stripe/android/stripe3ds2/utils/ObjectUtils;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mDefaultButtonTypeCustomizations:Ljava/util/Map;

    iget-object v1, p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mDefaultButtonTypeCustomizations:Ljava/util/Map;

    invoke-static {v0, v1}, Lcom/stripe/android/stripe3ds2/utils/ObjectUtils;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mCustomButtonTypeCustomization:Ljava/util/Map;

    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mCustomButtonTypeCustomization:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/stripe/android/stripe3ds2/utils/ObjectUtils;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->typedEquals(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public getAccentColor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mAccentColor:Ljava/lang/String;

    return-object v0
.end method

.method public getButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mDefaultButtonTypeCustomizations:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;

    return-object p1
.end method

.method public getButtonCustomization(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mCustomButtonTypeCustomization:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;

    return-object p1
.end method

.method public getLabelCustomization()Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mLabelCustomization:Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    return-object v0
.end method

.method public getTextBoxCustomization()Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mTextBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    return-object v0
.end method

.method public getToolbarCustomization()Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mToolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mToolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mAccentColor:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mLabelCustomization:Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mTextBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mDefaultButtonTypeCustomizations:Ljava/util/Map;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mCustomButtonTypeCustomization:Ljava/util/Map;

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/stripe/android/stripe3ds2/utils/ObjectUtils;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public setAccentColor(Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;->requireValidColor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mAccentColor:Ljava/lang/String;

    return-void
.end method

.method public setButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mDefaultButtonTypeCustomizations:Ljava/util/Map;

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mCustomButtonTypeCustomization:Ljava/util/Map;

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setLabelCustomization(Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mLabelCustomization:Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    return-void
.end method

.method public setTextBoxCustomization(Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mTextBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    return-void
.end method

.method public setToolbarCustomization(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mToolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mAccentColor:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mToolbarCustomization:Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    check-cast p2, Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mLabelCustomization:Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    check-cast p2, Lcom/stripe/android/stripe3ds2/init/ui/StripeLabelCustomization;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p2, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mTextBoxCustomization:Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    check-cast p2, Lcom/stripe/android/stripe3ds2/init/ui/StripeTextBoxCustomization;

    invoke-virtual {p1, p2, v0}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mDefaultButtonTypeCustomizations:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;

    invoke-virtual {p2, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->mCustomButtonTypeCustomization:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/stripe3ds2/init/ui/StripeButtonCustomization;

    invoke-virtual {p2, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    return-void
.end method
