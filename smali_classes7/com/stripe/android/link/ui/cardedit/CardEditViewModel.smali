.class public final Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001:\u0001OB?\u0008\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\'\u001a\u00020&\u0012\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0)\u00a2\u0006\u0004\u0008M\u0010NJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008*\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\nH\u0007J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eJ\u001a\u0010\u0013\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0008J\u0016\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000eR\u0017\u0010\u0019\u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u001a\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103R\u001b\u00106\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107R\u001a\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u000e088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u001d\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u000e0;8\u0006\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008<\u0010>R\u001d\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u000e0?8\u0006\u00a2\u0006\u000c\n\u0004\u0008@\u0010A\u001a\u0004\u0008@\u0010BR\u001f\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C088\u0006\u00a2\u0006\u000c\n\u0004\u0008D\u0010:\u001a\u0004\u0008E\u0010FR\u001c\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010:R\u001f\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0;8\u0006\u00a2\u0006\u000c\n\u0004\u0008I\u0010=\u001a\u0004\u0008J\u0010>R\u001a\u0010K\u001a\u0008\u0012\u0004\u0012\u00020\u000e088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010:R\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000e0;8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010=\u001a\u0004\u0008L\u0010>\u00a8\u0006P"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;",
        "LOr6;",
        "",
        "clearError",
        "",
        "error",
        "onError",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "",
        "buildInitialFormValues",
        "paymentDetailsId",
        "initWithPaymentDetailsId",
        "",
        "checked",
        "setAsDefault",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "formValues",
        "updateCard",
        "Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;",
        "result",
        "userInitiated",
        "dismiss",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "linkAccount",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "getLinkAccount",
        "()Lcom/stripe/android/link/model/LinkAccount;",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "Lcom/stripe/android/link/model/Navigator;",
        "navigator",
        "Lcom/stripe/android/link/model/Navigator;",
        "Lcom/stripe/android/core/Logger;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "args",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "LY94;",
        "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
        "formControllerProvider",
        "LY94;",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "paymentDetails",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "getPaymentDetails",
        "()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "setPaymentDetails",
        "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V",
        "isDefault$delegate",
        "Lkotlin/Lazy;",
        "isDefault",
        "()Z",
        "LGX2;",
        "_isProcessing",
        "LGX2;",
        "LtP5;",
        "isProcessing",
        "LtP5;",
        "()LtP5;",
        "LEu1;",
        "isEnabled",
        "LEu1;",
        "()LEu1;",
        "Lcom/stripe/android/ui/core/FormController;",
        "formController",
        "getFormController",
        "()LGX2;",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "_errorMessage",
        "errorMessage",
        "getErrorMessage",
        "_setAsDefault",
        "getSetAsDefault",
        "<init>",
        "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/LinkActivityContract$Args;LY94;)V",
        "Factory",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCardEditViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardEditViewModel.kt\ncom/stripe/android/link/ui/cardedit/CardEditViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n47#2:176\n49#2:180\n50#3:177\n55#3:179\n106#4:178\n1#5:181\n*S KotlinDebug\n*F\n+ 1 CardEditViewModel.kt\ncom/stripe/android/link/ui/cardedit/CardEditViewModel\n*L\n49#1:176\n49#1:180\n49#1:177\n49#1:179\n49#1:178\n*E\n"
    }
.end annotation


# instance fields
.field private final _errorMessage:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            ">;"
        }
    .end annotation
.end field

.field private final _isProcessing:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _setAsDefault:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final args:Lcom/stripe/android/link/LinkActivityContract$Args;

.field private final errorMessage:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            ">;"
        }
    .end annotation
.end field

.field private final formController:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lcom/stripe/android/ui/core/FormController;",
            ">;"
        }
    .end annotation
.end field

.field private final formControllerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;"
        }
    .end annotation
.end field

.field private final isDefault$delegate:Lkotlin/Lazy;

.field private final isEnabled:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isProcessing:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final linkAccount:Lcom/stripe/android/link/model/LinkAccount;

.field private final linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final navigator:Lcom/stripe/android/link/model/Navigator;

.field public paymentDetails:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

.field private final setAsDefault:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/model/Navigator;Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/LinkActivityContract$Args;LY94;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/model/LinkAccount;",
            "Lcom/stripe/android/link/account/LinkAccountManager;",
            "Lcom/stripe/android/link/model/Navigator;",
            "Lcom/stripe/android/core/Logger;",
            "Lcom/stripe/android/link/LinkActivityContract$Args;",
            "LY94<",
            "Lcom/stripe/android/ui/core/injection/FormControllerSubcomponent$Builder;",
            ">;)V"
        }
    .end annotation

    const-string v0, "linkAccount"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formControllerProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    iput-object p2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object p3, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    iput-object p4, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->logger:Lcom/stripe/android/core/Logger;

    iput-object p5, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->args:Lcom/stripe/android/link/LinkActivityContract$Args;

    iput-object p6, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->formControllerProvider:LY94;

    new-instance p1, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$isDefault$2;

    invoke-direct {p1, p0}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$isDefault$2;-><init>(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->isDefault$delegate:Lkotlin/Lazy;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->_isProcessing:LGX2;

    iput-object p2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->isProcessing:LtP5;

    new-instance p3, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$special$$inlined$map$1;

    invoke-direct {p3, p2}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$special$$inlined$map$1;-><init>(LEu1;)V

    iput-object p3, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->isEnabled:LEu1;

    const/4 p2, 0x0

    invoke-static {p2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->formController:LGX2;

    invoke-static {p2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->_errorMessage:LGX2;

    iput-object p2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->errorMessage:LtP5;

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->_setAsDefault:LGX2;

    iput-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->setAsDefault:LtP5;

    return-void
.end method

.method public static final synthetic access$buildInitialFormValues(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;Lcom/stripe/android/model/ConsumerPaymentDetails$Card;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->buildInitialFormValues(Lcom/stripe/android/model/ConsumerPaymentDetails$Card;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getArgs$p(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;)Lcom/stripe/android/link/LinkActivityContract$Args;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->args:Lcom/stripe/android/link/LinkActivityContract$Args;

    return-object p0
.end method

.method public static final synthetic access$getFormControllerProvider$p(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;)LY94;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->formControllerProvider:LY94;

    return-object p0
.end method

.method public static final synthetic access$getLinkAccountManager$p(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;)Lcom/stripe/android/link/account/LinkAccountManager;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    return-object p0
.end method

.method public static final synthetic access$get_isProcessing$p(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;)LGX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->_isProcessing:LGX2;

    return-object p0
.end method

.method public static final synthetic access$onError(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method private final buildInitialFormValues(Lcom/stripe/android/model/ConsumerPaymentDetails$Card;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;",
            ")",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x4

    new-array v0, v0, [Lkotlin/Pair;

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardNumber()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getLast4()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u2022\u2022\u2022\u2022 "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardBrand()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getBrand()Lcom/stripe/android/model/CardBrand;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/model/CardBrand;->getCode()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v0, v3

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardExpMonth()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getExpiryMonth()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x30

    const/4 v5, 0x2

    invoke-static {v3, v5, v4}, Lkotlin/text/StringsKt;->padStart(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v0, v5

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardExpYear()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getExpiryYear()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v0, v3

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getBillingAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getCountryCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    :cond_1
    invoke-static {v0, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getBillingAddress()Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;->getPostalCode()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPostalCode()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_2
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    :cond_3
    invoke-static {v0, p1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final clearError()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->_errorMessage:LGX2;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final onError(Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {p1}, Lcom/stripe/android/link/ui/ErrorMessageKt;->getErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "Error: "

    invoke-interface {v1, v2, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->_isProcessing:LGX2;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->_errorMessage:LGX2;

    invoke-interface {p1, v0}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final dismiss(Lcom/stripe/android/link/ui/wallet/PaymentDetailsResult;Z)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    const-string v1, "PaymentDetailsResult"

    invoke-virtual {v0, v1, p1}, Lcom/stripe/android/link/model/Navigator;->setResult(Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Unit;

    iget-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->navigator:Lcom/stripe/android/link/model/Navigator;

    invoke-virtual {p1, p2}, Lcom/stripe/android/link/model/Navigator;->onBack(Z)V

    return-void
.end method

.method public final getErrorMessage()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->errorMessage:LtP5;

    return-object v0
.end method

.method public final getFormController()LGX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGX2<",
            "Lcom/stripe/android/ui/core/FormController;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->formController:LGX2;

    return-object v0
.end method

.method public final getLinkAccount()Lcom/stripe/android/link/model/LinkAccount;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->linkAccount:Lcom/stripe/android/link/model/LinkAccount;

    return-object v0
.end method

.method public final getPaymentDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->paymentDetails:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "paymentDetails"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSetAsDefault()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->setAsDefault:LtP5;

    return-object v0
.end method

.method public final initWithPaymentDetailsId(Ljava/lang/String;)V
    .locals 7

    const-string v0, "paymentDetailsId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$initWithPaymentDetailsId$1;-><init>(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public final isDefault()Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->isDefault$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final isEnabled()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->isEnabled:LEu1;

    return-object v0
.end method

.method public final isProcessing()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->isProcessing:LtP5;

    return-object v0
.end method

.method public final setAsDefault(Z)V
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->_setAsDefault:LGX2;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setPaymentDetails(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->paymentDetails:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    return-void
.end method

.method public final updateCard(Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;)V"
        }
    .end annotation

    const-string v0, "formValues"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->clearError()V

    iget-object v0, p0, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;->_isProcessing:LGX2;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    sget-object v0, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter;->Companion:Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;

    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;->transformToPaymentMethodCreateParams(Ljava/util/Map;Ljava/lang/String;Z)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object p1

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$updateCard$1;-><init>(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
