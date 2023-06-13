.class public final Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/ObjectBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder$WhenMappings;,
        Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/ObjectBuilder<",
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 \u001e2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0003B\u000f\u0008\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\u0008\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0008\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;",
        "Lcom/stripe/android/ObjectBuilder;",
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;",
        "()V",
        "activity",
        "Landroid/app/Activity;",
        "(Landroid/app/Activity;)V",
        "uiCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;",
        "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V",
        "build",
        "getUiButtonType",
        "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;",
        "buttonType",
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$ButtonType;",
        "setAccentColor",
        "hexColor",
        "",
        "setButtonCustomization",
        "buttonCustomization",
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;",
        "setLabelCustomization",
        "labelCustomization",
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;",
        "setTextBoxCustomization",
        "textBoxCustomization",
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;",
        "setToolbarCustomization",
        "toolbarCustomization",
        "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;",
        "Companion",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder$Companion;


# instance fields
.field private final uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;->Companion:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;-><init>()V

    invoke-direct {p0, v0}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;-><init>(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V

    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;)V
    .locals 1

    invoke-static {p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->createWithAppTheme(Landroid/app/Activity;)Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    move-result-object p1

    const-string v0, "createWithAppTheme(activity)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;-><init>(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;-><init>(Landroid/app/Activity;)V

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    return-void
.end method

.method public static final createWithAppTheme(Landroid/app/Activity;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;->Companion:Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder$Companion;->createWithAppTheme(Landroid/app/Activity;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;

    move-result-object p0

    return-object p0
.end method

.method private final getUiButtonType(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$ButtonType;)Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->SELECT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    goto :goto_0

    :pswitch_1
    sget-object p1, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->RESEND:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    goto :goto_0

    :pswitch_2
    sget-object p1, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->CANCEL:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    goto :goto_0

    :pswitch_3
    sget-object p1, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->NEXT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    goto :goto_0

    :pswitch_4
    sget-object p1, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->CONTINUE:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    goto :goto_0

    :pswitch_5
    sget-object p1, Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;->SUBMIT:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public build()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;
    .locals 2

    new-instance v0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;

    iget-object v1, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-direct {v0, v1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;-><init>(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V

    return-object v0
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;->build()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;

    move-result-object v0

    return-object v0
.end method

.method public final setAccentColor(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const-string v0, "hexColor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->setAccentColor(Ljava/lang/String;)V

    return-object p0
.end method

.method public final setButtonCustomization(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$ButtonType;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const-string v0, "buttonCustomization"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {p1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;->getButtonCustomization$payments_core_release()Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;

    move-result-object p1

    invoke-direct {p0, p2}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;->getUiButtonType(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$ButtonType;)Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->setButtonCustomization(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;)V

    return-object p0
.end method

.method public final setLabelCustomization(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const-string v0, "labelCustomization"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {p1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;->getLabelCustomization$payments_core_release()Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->setLabelCustomization(Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V

    return-object p0
.end method

.method public final setTextBoxCustomization(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const-string v0, "textBoxCustomization"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {p1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;->getTextBoxCustomization$payments_core_release()Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->setTextBoxCustomization(Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;)V

    return-object p0
.end method

.method public final setToolbarCustomization(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const-string v0, "toolbarCustomization"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;

    invoke-virtual {p1}, Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;->getToolbarCustomization$payments_core_release()Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;->setToolbarCustomization(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)V

    return-object p0
.end method
