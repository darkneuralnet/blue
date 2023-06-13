.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;
.super Landroidx/fragment/app/Fragment;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008P\u0010QJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000fH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J+\u0010\u001b\u001a\u00020\u00042\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ2\u0010\"\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00122\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001e2\u0008\u0008\u0002\u0010 \u001a\u00020\u00192\u0008\u0008\u0002\u0010!\u001a\u00020\u0019H\u0002J\u0012\u0010$\u001a\u00020\u00042\u0008\u0010#\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\'\u001a\u00020\u00042\u0008\u0010&\u001a\u0004\u0018\u00010%H\u0016J$\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0008\u0010+\u001a\u0004\u0018\u00010*2\u0008\u0010&\u001a\u0004\u0018\u00010%H\u0016J\u0008\u0010.\u001a\u00020\u0004H\u0016R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00086\u00101\u001a\u0004\u00087\u00108R\u001b\u0010<\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008:\u00101\u001a\u0004\u0008;\u00108R\u001d\u0010A\u001a\u0004\u0018\u00010=8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008>\u00101\u001a\u0004\u0008?\u0010@R\u001b\u0010E\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008B\u00101\u001a\u0004\u0008C\u0010DR\u001d\u0010J\u001a\u0004\u0018\u00010F8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008G\u00101\u001a\u0004\u0008H\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008L\u00101\u001a\u0004\u0008M\u0010N\u00a8\u0006R"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;",
        "Landroidx/fragment/app/Fragment;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;",
        "screenState",
        "",
        "handleScreenStateChanged",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;",
        "NameAndEmailCollectionScreen",
        "(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;LEt0;I)V",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;",
        "MandateCollectionScreen",
        "(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;LEt0;I)V",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;",
        "VerifyWithMicrodepositsScreen",
        "(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;LEt0;I)V",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;",
        "SavedAccountScreen",
        "(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;LEt0;I)V",
        "",
        "name",
        "email",
        "NameAndEmailForm",
        "(Ljava/lang/String;Ljava/lang/String;LEt0;I)V",
        "bankName",
        "last4",
        "",
        "saveForFutureUsage",
        "AccountDetailsForm",
        "(Ljava/lang/String;Ljava/lang/String;ZLEt0;I)V",
        "text",
        "Lkotlin/Function0;",
        "onClick",
        "shouldShowProcessingWhenClicked",
        "enabled",
        "updatePrimaryButton",
        "mandateText",
        "updateMandateText",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "onCreateView",
        "onDetach",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "formArgs$delegate",
        "Lkotlin/Lazy;",
        "getFormArgs",
        "()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "formArgs",
        "Landroidx/lifecycle/u$b;",
        "paymentSheetViewModelFactory$delegate",
        "getPaymentSheetViewModelFactory",
        "()Landroidx/lifecycle/u$b;",
        "paymentSheetViewModelFactory",
        "paymentOptionsViewModelFactory$delegate",
        "getPaymentOptionsViewModelFactory",
        "paymentOptionsViewModelFactory",
        "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "sheetViewModel$delegate",
        "getSheetViewModel",
        "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;",
        "sheetViewModel",
        "completePayment$delegate",
        "getCompletePayment",
        "()Z",
        "completePayment",
        "Lcom/stripe/android/paymentsheet/model/ClientSecret;",
        "clientSecret$delegate",
        "getClientSecret",
        "()Lcom/stripe/android/paymentsheet/model/ClientSecret;",
        "clientSecret",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;",
        "viewModel$delegate",
        "getViewModel",
        "()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;",
        "viewModel",
        "<init>",
        "()V",
        "paymentsheet_release"
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
        "SMAP\nUSBankAccountFormFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,486:1\n172#2,9:487\n74#3,6:496\n80#3:528\n84#3:533\n74#3,6:534\n80#3:566\n84#3:571\n74#3,6:572\n80#3:604\n84#3:609\n74#3,6:610\n80#3:642\n84#3:647\n74#3,6:648\n80#3:680\n84#3:762\n74#3,6:770\n80#3:802\n84#3:809\n75#4:502\n76#4,11:504\n89#4:532\n75#4:540\n76#4,11:542\n89#4:570\n75#4:578\n76#4,11:580\n89#4:608\n75#4:616\n76#4,11:618\n89#4:646\n75#4:654\n76#4,11:656\n75#4:688\n76#4,11:690\n89#4:718\n75#4:726\n76#4,11:728\n89#4:756\n89#4:761\n75#4:776\n76#4,11:778\n89#4:808\n76#5:503\n76#5:541\n76#5:579\n76#5:617\n76#5:655\n76#5:689\n76#5:727\n76#5:777\n460#6,13:515\n473#6,3:529\n460#6,13:553\n473#6,3:567\n460#6,13:591\n473#6,3:605\n460#6,13:629\n473#6,3:643\n460#6,13:667\n460#6,13:701\n473#6,3:715\n460#6,13:739\n473#6,3:753\n473#6,3:758\n460#6,13:789\n473#6,3:805\n36#6:810\n154#7:681\n154#7:682\n154#7:720\n154#7:769\n154#7:803\n154#7:804\n68#8,5:683\n73#8:714\n77#8:719\n68#8,5:721\n73#8:752\n77#8:757\n1057#9,6:763\n1057#9,6:811\n1#10:817\n*S KotlinDebug\n*F\n+ 1 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment\n*L\n121#1:487,9\n257#1:496,6\n257#1:528\n257#1:533\n266#1:534,6\n266#1:566\n266#1:571\n280#1:572,6\n280#1:604\n280#1:609\n294#1:610,6\n294#1:642\n294#1:647\n310#1:648,6\n310#1:680\n310#1:762\n356#1:770,6\n356#1:802\n356#1:809\n257#1:502\n257#1:504,11\n257#1:532\n266#1:540\n266#1:542,11\n266#1:570\n280#1:578\n280#1:580,11\n280#1:608\n294#1:616\n294#1:618,11\n294#1:646\n310#1:654\n310#1:656,11\n315#1:688\n315#1:690,11\n315#1:718\n329#1:726\n329#1:728,11\n329#1:756\n310#1:761\n356#1:776\n356#1:778,11\n356#1:808\n257#1:503\n266#1:541\n280#1:579\n294#1:617\n310#1:655\n315#1:689\n329#1:727\n356#1:777\n257#1:515,13\n257#1:529,3\n266#1:553,13\n266#1:567,3\n280#1:591,13\n280#1:605,3\n294#1:629,13\n294#1:643,3\n310#1:667,13\n315#1:701,13\n315#1:715,3\n329#1:739,13\n329#1:753,3\n310#1:758,3\n356#1:789,13\n356#1:805,3\n432#1:810\n313#1:681\n318#1:682\n332#1:720\n359#1:769\n363#1:803\n408#1:804\n315#1:683,5\n315#1:714\n315#1:719\n329#1:721,5\n329#1:752\n329#1:757\n352#1:763,6\n432#1:811,6\n*E\n"
    }
.end annotation


# instance fields
.field private final clientSecret$delegate:Lkotlin/Lazy;

.field private final completePayment$delegate:Lkotlin/Lazy;

.field private final formArgs$delegate:Lkotlin/Lazy;

.field private final paymentOptionsViewModelFactory$delegate:Lkotlin/Lazy;

.field private final paymentSheetViewModelFactory$delegate:Lkotlin/Lazy;

.field private final sheetViewModel$delegate:Lkotlin/Lazy;

.field private final viewModel$delegate:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$formArgs$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$formArgs$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->formArgs$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$paymentSheetViewModelFactory$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$paymentSheetViewModelFactory$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->paymentSheetViewModelFactory$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$paymentOptionsViewModelFactory$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$paymentOptionsViewModelFactory$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->paymentOptionsViewModelFactory$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$sheetViewModel$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$sheetViewModel$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->sheetViewModel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$completePayment$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$completePayment$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->completePayment$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$clientSecret$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$clientSecret$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->clientSecret$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$viewModel$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$viewModel$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)V

    const-class v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$special$$inlined$activityViewModels$default$1;

    invoke-direct {v2, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$special$$inlined$activityViewModels$default$2;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$special$$inlined$activityViewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/fragment/app/Fragment;)V

    invoke-static {p0, v1, v2, v3, v0}, LGy1;->b(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->viewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final AccountDetailsForm(Ljava/lang/String;Ljava/lang/String;ZLEt0;I)V
    .locals 23

    const v0, -0x17114911

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LEt0;->u(I)LEt0;

    move-result-object v11

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.AccountDetailsForm (USBankAccountFormFragment.kt:346)"

    move/from16 v12, p5

    invoke-static {v0, v12, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    goto :goto_0

    :cond_0
    move/from16 v12, p5

    :goto_0
    invoke-interface {v11}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v10, LEt0;->a:LEt0$a;

    invoke-virtual {v10}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    const/4 v7, 0x0

    if-ne v0, v1, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v1, 0x2

    invoke-static {v0, v7, v1, v7}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v0

    invoke-interface {v11, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1
    move-object v13, v0

    check-cast v13, LEX2;

    sget-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon;->Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon$Companion;

    move-object/from16 v14, p1

    invoke-virtual {v0, v14}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/TransformToBankIcon$Companion;->invoke(Ljava/lang/String;)I

    move-result v8

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getViewModel()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->getProcessing()LtP5;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    const/16 v5, 0x38

    const/4 v6, 0x2

    move-object v4, v11

    invoke-static/range {v1 .. v6}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v1

    sget-object v15, LgV2;->b0:LgV2$a;

    const/4 v0, 0x0

    const/4 v9, 0x1

    invoke-static {v15, v0, v9, v7}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v2, 0x8

    int-to-float v6, v2

    invoke-static {v6}, Lk61;->g(F)F

    move-result v20

    const/16 v21, 0x7

    const/16 v22, 0x0

    invoke-static/range {v16 .. v22}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v2

    const v3, -0x1cd0f17e

    invoke-interface {v11, v3}, LEt0;->F(I)V

    sget-object v3, Llo;->a:Llo;

    invoke-virtual {v3}, Llo;->g()Llo$l;

    move-result-object v3

    sget-object v4, LK9;->a:LK9$a;

    invoke-virtual {v4}, LK9$a;->j()LK9$b;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v3, v4, v11, v5}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v3

    const v4, -0x4ee9b9da

    invoke-interface {v11, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {v11, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v0

    invoke-interface {v11, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v7

    invoke-interface {v11, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJq6;

    sget-object v17, LBt0;->M:LBt0$a;

    invoke-virtual/range {v17 .. v17}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-interface {v11}, LEt0;->v()Llm;

    move-result-object v5

    instance-of v5, v5, Llm;

    if-nez v5, :cond_2

    invoke-static {}, Lyt0;->c()V

    :cond_2
    invoke-interface {v11}, LEt0;->h()V

    invoke-interface {v11}, LEt0;->t()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v11, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_3
    invoke-interface {v11}, LEt0;->e()V

    :goto_1
    invoke-interface {v11}, LEt0;->L()V

    invoke-static {v11}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v5

    invoke-virtual/range {v17 .. v17}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v5, v3, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v5, v4, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v5, v0, v3}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v5, v7, v0}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v11}, LEt0;->q()V

    invoke-static {v11}, LMB5;->b(LEt0;)LEt0;

    move-result-object v0

    invoke-static {v0}, LMB5;->a(LEt0;)LMB5;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v0, v11, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {v11, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {v11, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, 0x22de0e65

    invoke-interface {v11, v0}, LEt0;->F(I)V

    sget v0, Lcom/stripe/android/paymentsheet/R$string;->title_bank_account:I

    const/4 v5, 0x0

    invoke-static {v0, v11, v5}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6}, Lk61;->g(F)F

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v7, 0x0

    invoke-static {v15, v3, v2, v4, v7}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object v2

    const/16 v9, 0x30

    invoke-static {v0, v2, v11, v9, v5}, Lcom/stripe/android/uicore/elements/H6TextKt;->H6Text(Ljava/lang/String;LgV2;LEt0;II)V

    invoke-static {v15, v3, v4, v7}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v7

    const/4 v9, 0x0

    const-wide/16 v16, 0x0

    const/16 v19, 0x0

    new-instance v4, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1;

    move-object v0, v4

    move-object v2, v13

    move v3, v8

    move-object v8, v4

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1;-><init>(LsP5;LEX2;ILjava/lang/String;Ljava/lang/String;)V

    const v0, 0x3a3768cb

    const/4 v5, 0x1

    invoke-static {v11, v0, v5, v8}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v8, 0x6006

    const/16 v18, 0xe

    move-object v1, v7

    move v2, v9

    move-wide/from16 v3, v16

    move v9, v5

    move-object/from16 v5, v19

    move/from16 v16, v6

    move-object v6, v0

    move-object v7, v11

    move v0, v9

    move/from16 v9, v18

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/uicore/elements/SectionUIKt;->SectionCard-T042LqI(LgV2;ZJLeZ;Lkotlin/jvm/functions/Function2;LEt0;II)V

    const v1, -0x5aca5506

    invoke-interface {v11, v1}, LEt0;->F(I)V

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getShowCheckbox()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getViewModel()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->getSaveForFutureUseElement()Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->getController()Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;

    move-result-object v3

    move/from16 v9, p3

    invoke-virtual {v3, v9}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;->onValueChange(Z)V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const/4 v3, 0x0

    invoke-static/range {v16 .. v16}, Lk61;->g(F)F

    move-result v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v21, 0x0

    move/from16 v16, v3

    invoke-static/range {v15 .. v21}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v3

    sget v4, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;->$stable:I

    shl-int/lit8 v4, v4, 0x3

    or-int/lit16 v5, v4, 0x186

    const/4 v6, 0x0

    move-object v4, v11

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseElementUIKt;->SaveForFutureUseElementUI(ZLcom/stripe/android/ui/core/elements/SaveForFutureUseElement;LgV2;LEt0;II)V

    goto :goto_2

    :cond_4
    move/from16 v9, p3

    :goto_2
    invoke-interface {v11}, LEt0;->Q()V

    invoke-interface {v11}, LEt0;->Q()V

    invoke-interface {v11}, LEt0;->Q()V

    invoke-interface {v11}, LEt0;->Q()V

    invoke-interface {v11}, LEt0;->f()V

    invoke-interface {v11}, LEt0;->Q()V

    invoke-interface {v11}, LEt0;->Q()V

    if-nez p2, :cond_5

    move-object/from16 v15, p0

    goto :goto_3

    :cond_5
    sget v1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_remove_bank_account_title:I

    const/4 v2, 0x0

    invoke-static {v1, v11, v2}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    sget v1, Lcom/stripe/android/paymentsheet/R$string;->bank_account_ending_in:I

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p2, v0, v2

    const/16 v4, 0x40

    invoke-static {v1, v0, v11, v4}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/stripe/android/paymentsheet/R$string;->remove:I

    invoke-static {v1, v11, v2}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v4

    sget v1, Lcom/stripe/android/paymentsheet/R$string;->cancel:I

    invoke-static {v1, v11, v2}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$2$1;

    move-object/from16 v15, p0

    invoke-direct {v6, v13, v15}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$2$1;-><init>(LEX2;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)V

    const v1, 0x44faf204

    invoke-interface {v11, v1}, LEt0;->F(I)V

    invoke-interface {v11, v13}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v11}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_6

    invoke-virtual {v10}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_7

    :cond_6
    new-instance v2, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$2$2$1;

    invoke-direct {v2, v13}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$2$2$1;-><init>(LEX2;)V

    invoke-interface {v11, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_7
    invoke-interface {v11}, LEt0;->Q()V

    move-object v7, v2

    check-cast v7, Lkotlin/jvm/functions/Function0;

    const/4 v10, 0x6

    const/16 v16, 0x0

    move-object v1, v13

    move-object v2, v3

    move-object v3, v0

    move-object v8, v11

    move v9, v10

    move/from16 v10, v16

    invoke-static/range {v1 .. v10}, Lcom/stripe/android/ui/core/elements/SimpleDialogElementUIKt;->SimpleDialogElementUI(LEX2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V

    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    invoke-interface {v11}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_9

    goto :goto_4

    :cond_9
    new-instance v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$3;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$3;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Ljava/lang/String;Ljava/lang/String;ZI)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method

.method private final MandateCollectionScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;LEt0;I)V
    .locals 9

    const v0, -0x34e102c

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.MandateCollectionScreen (USBankAccountFormFragment.kt:262)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LgV2;->b0:LgV2$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    const v1, -0x1cd0f17e

    invoke-interface {p2, v1}, LEt0;->F(I)V

    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->g()Llo$l;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->j()LK9$b;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, p2, v3}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {p2, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {p2, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {p2, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {p2, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {p2}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface {p2}, LEt0;->h()V

    invoke-interface {p2}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {p2, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface {p2}, LEt0;->e()V

    :goto_0
    invoke-interface {p2}, LEt0;->L()V

    invoke-static {p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual {v6}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v1, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p2}, LEt0;->q()V

    invoke-static {p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, p2, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {p2, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {p2, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, 0xad871e

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;->getEmail()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x200

    invoke-direct {p0, v0, v1, p2, v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->NameAndEmailForm(Ljava/lang/String;Ljava/lang/String;LEt0;I)V

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->getInstitutionName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->getLast4()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;->getSaveForFutureUsage()Z

    move-result v4

    const/16 v6, 0x1000

    move-object v1, p0

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->AccountDetailsForm(Ljava/lang/String;Ljava/lang/String;ZLEt0;I)V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->f()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_4

    goto :goto_1

    :cond_4
    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$MandateCollectionScreen$2;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$MandateCollectionScreen$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method private final NameAndEmailCollectionScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;LEt0;I)V
    .locals 9

    const v0, -0x1313b358

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.NameAndEmailCollectionScreen (USBankAccountFormFragment.kt:253)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LgV2;->b0:LgV2$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    const v1, -0x1cd0f17e

    invoke-interface {p2, v1}, LEt0;->F(I)V

    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->g()Llo$l;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->j()LK9$b;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, p2, v3}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {p2, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {p2, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {p2, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {p2, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {p2}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface {p2}, LEt0;->h()V

    invoke-interface {p2}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {p2, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface {p2}, LEt0;->e()V

    :goto_0
    invoke-interface {p2}, LEt0;->L()V

    invoke-static {p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual {v6}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v1, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p2}, LEt0;->q()V

    invoke-static {p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, p2, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {p2, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {p2, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, 0x62b2cf72

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;->getEmail()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x200

    invoke-direct {p0, v0, v1, p2, v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->NameAndEmailForm(Ljava/lang/String;Ljava/lang/String;LEt0;I)V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->f()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_4

    goto :goto_1

    :cond_4
    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$NameAndEmailCollectionScreen$2;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$NameAndEmailCollectionScreen$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method private final NameAndEmailForm(Ljava/lang/String;Ljava/lang/String;LEt0;I)V
    .locals 26

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p4

    const v3, -0x7d0c5d70

    move-object/from16 v4, p3

    invoke-interface {v4, v3}, LEt0;->u(I)LEt0;

    move-result-object v13

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.NameAndEmailForm (USBankAccountFormFragment.kt:304)"

    invoke-static {v3, v2, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getViewModel()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->getProcessing()LtP5;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v6, 0x0

    const/16 v8, 0x38

    const/4 v9, 0x2

    move-object v7, v13

    invoke-static/range {v4 .. v9}, LGM5;->a(LEu1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;LEt0;II)LsP5;

    move-result-object v3

    sget-object v14, LgV2;->b0:LgV2$a;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x0

    invoke-static {v14, v15, v12, v11}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    const v5, -0x1cd0f17e

    invoke-interface {v13, v5}, LEt0;->F(I)V

    sget-object v5, Llo;->a:Llo;

    invoke-virtual {v5}, Llo;->g()Llo$l;

    move-result-object v5

    sget-object v16, LK9;->a:LK9$a;

    invoke-virtual/range {v16 .. v16}, LK9$a;->j()LK9$b;

    move-result-object v6

    const/4 v10, 0x0

    invoke-static {v5, v6, v13, v10}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v5

    const v9, -0x4ee9b9da

    invoke-interface {v13, v9}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v13, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v7

    invoke-interface {v13, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v8

    invoke-interface {v13, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LJq6;

    sget-object v17, LBt0;->M:LBt0$a;

    invoke-virtual/range {v17 .. v17}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface {v13}, LEt0;->v()Llm;

    move-result-object v11

    instance-of v11, v11, Llm;

    if-nez v11, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface {v13}, LEt0;->h()V

    invoke-interface {v13}, LEt0;->t()Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v13, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface {v13}, LEt0;->e()V

    :goto_0
    invoke-interface {v13}, LEt0;->L()V

    invoke-static {v13}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual/range {v17 .. v17}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v9, v5, v11}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v6, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v7, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v8, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v13}, LEt0;->q()V

    invoke-static {v13}, LMB5;->b(LEt0;)LEt0;

    move-result-object v5

    invoke-static {v5}, LMB5;->a(LEt0;)LMB5;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v5, v13, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v11, 0x7ab4aae9

    invoke-interface {v13, v11}, LEt0;->F(I)V

    const v4, -0x455f09d5

    invoke-interface {v13, v4}, LEt0;->F(I)V

    sget-object v4, LQm0;->a:LQm0;

    const v4, -0x12f24a7a

    invoke-interface {v13, v4}, LEt0;->F(I)V

    sget v4, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_pay_with_bank_title:I

    invoke-static {v4, v13, v10}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v9

    const/4 v5, 0x0

    const/16 v4, 0x10

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v6

    const/4 v7, 0x0

    const/16 v4, 0x8

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v8

    const/16 v19, 0x5

    const/16 v20, 0x0

    move-object v4, v14

    move-object v11, v9

    move/from16 v9, v19

    move v12, v10

    move-object/from16 v10, v20

    invoke-static/range {v4 .. v10}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v4

    const/16 v5, 0x30

    invoke-static {v11, v4, v13, v5, v12}, Lcom/stripe/android/uicore/elements/H6TextKt;->H6Text(Ljava/lang/String;LgV2;LEt0;II)V

    const/4 v4, 0x1

    const/4 v11, 0x0

    invoke-static {v14, v15, v4, v11}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v5

    int-to-float v10, v12

    invoke-static {v10}, Lk61;->g(F)F

    move-result v4

    invoke-static {v5, v4}, LND3;->i(LgV2;F)LgV2;

    move-result-object v4

    invoke-virtual/range {v16 .. v16}, LK9$a;->f()LK9;

    move-result-object v5

    const v9, 0x2bb5b5d7

    invoke-interface {v13, v9}, LEt0;->F(I)V

    const/4 v8, 0x6

    invoke-static {v5, v12, v13, v8}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v5

    const v7, -0x4ee9b9da

    invoke-interface {v13, v7}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v13, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v7

    invoke-interface {v13, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v8

    invoke-interface {v13, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LJq6;

    invoke-virtual/range {v17 .. v17}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface {v13}, LEt0;->v()Llm;

    move-result-object v11

    instance-of v11, v11, Llm;

    if-nez v11, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {v13}, LEt0;->h()V

    invoke-interface {v13}, LEt0;->t()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v13, v9}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface {v13}, LEt0;->e()V

    :goto_1
    invoke-interface {v13}, LEt0;->L()V

    invoke-static {v13}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v9

    invoke-virtual/range {v17 .. v17}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v9, v5, v11}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v6, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v7, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v9, v8, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v13}, LEt0;->q()V

    invoke-static {v13}, LMB5;->b(LEt0;)LEt0;

    move-result-object v5

    invoke-static {v5}, LMB5;->a(LEt0;)LMB5;

    move-result-object v5

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v5, v13, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v11, 0x7ab4aae9

    invoke-interface {v13, v11}, LEt0;->F(I)V

    const v9, -0x7f65a980

    invoke-interface {v13, v9}, LEt0;->F(I)V

    sget-object v4, Lf10;->a:Lf10;

    const v4, -0x707d56f4

    invoke-interface {v13, v4}, LEt0;->F(I)V

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getViewModel()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->getNameController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v4

    invoke-interface {v4, v0}, Lcom/stripe/android/uicore/elements/InputController;->onRawValueChange(Ljava/lang/String;)V

    sget-object v21, LFY1;->b:LFY1$a;

    invoke-virtual/range {v21 .. v21}, LFY1$a;->d()I

    move-result v5

    invoke-interface {v3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    const/16 v22, 0x1

    xor-int/lit8 v6, v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x8

    const/16 v25, 0x38

    move-object/from16 v9, v23

    move/from16 v18, v10

    move-object v10, v13

    move/from16 v11, v24

    move/from16 v0, v22

    move/from16 v12, v25

    invoke-static/range {v4 .. v12}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextFieldSection-uGujYS0(Lcom/stripe/android/uicore/elements/TextFieldController;IZLgV2;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->f()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    const/4 v4, 0x0

    invoke-static {v14, v15, v0, v4}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v4

    invoke-static/range {v18 .. v18}, Lk61;->g(F)F

    move-result v5

    invoke-static {v4, v5}, LND3;->i(LgV2;F)LgV2;

    move-result-object v4

    invoke-virtual/range {v16 .. v16}, LK9$a;->f()LK9;

    move-result-object v5

    const v6, 0x2bb5b5d7

    invoke-interface {v13, v6}, LEt0;->F(I)V

    const/4 v6, 0x0

    const/4 v7, 0x6

    invoke-static {v5, v6, v13, v7}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v5

    const v7, -0x4ee9b9da

    invoke-interface {v13, v7}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v7

    invoke-interface {v13, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v8

    invoke-interface {v13, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v9

    invoke-interface {v13, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJq6;

    invoke-virtual/range {v17 .. v17}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v10

    invoke-static {v4}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v4

    invoke-interface {v13}, LEt0;->v()Llm;

    move-result-object v11

    instance-of v11, v11, Llm;

    if-nez v11, :cond_5

    invoke-static {}, Lyt0;->c()V

    :cond_5
    invoke-interface {v13}, LEt0;->h()V

    invoke-interface {v13}, LEt0;->t()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v13, v10}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_2

    :cond_6
    invoke-interface {v13}, LEt0;->e()V

    :goto_2
    invoke-interface {v13}, LEt0;->L()V

    invoke-static {v13}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v10

    invoke-virtual/range {v17 .. v17}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v10, v5, v11}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v10, v7, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v10, v8, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v17 .. v17}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v5

    invoke-static {v10, v9, v5}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v13}, LEt0;->q()V

    invoke-static {v13}, LMB5;->b(LEt0;)LEt0;

    move-result-object v5

    invoke-static {v5}, LMB5;->a(LEt0;)LMB5;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v5, v13, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v4, 0x7ab4aae9

    invoke-interface {v13, v4}, LEt0;->F(I)V

    const v4, -0x7f65a980

    invoke-interface {v13, v4}, LEt0;->F(I)V

    const v4, 0x4c90ae83    # 7.5854872E7f

    invoke-interface {v13, v4}, LEt0;->F(I)V

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getViewModel()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->getEmailController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v4

    if-nez v1, :cond_7

    const-string v5, ""

    goto :goto_3

    :cond_7
    move-object v5, v1

    :goto_3
    invoke-interface {v4, v5}, Lcom/stripe/android/uicore/elements/InputController;->onRawValueChange(Ljava/lang/String;)V

    invoke-virtual/range {v21 .. v21}, LFY1$a;->b()I

    move-result v5

    invoke-interface {v3}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    xor-int/lit8 v6, v3, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v11, 0x8

    const/16 v12, 0x38

    move-object v10, v13

    invoke-static/range {v4 .. v12}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextFieldSection-uGujYS0(Lcom/stripe/android/uicore/elements/TextFieldController;IZLgV2;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;LEt0;II)V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->f()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->f()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-interface {v13}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    invoke-interface {v13}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_9

    move-object/from16 v4, p0

    goto :goto_4

    :cond_9
    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$NameAndEmailForm$2;

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    invoke-direct {v3, v4, v5, v1, v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$NameAndEmailForm$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-interface {v0, v3}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method

.method private final SavedAccountScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;LEt0;I)V
    .locals 9

    const v0, -0x42a3bed8

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.SavedAccountScreen (USBankAccountFormFragment.kt:290)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LgV2;->b0:LgV2$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    const v1, -0x1cd0f17e

    invoke-interface {p2, v1}, LEt0;->F(I)V

    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->g()Llo$l;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->j()LK9$b;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, p2, v3}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {p2, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {p2, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {p2, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {p2, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {p2}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface {p2}, LEt0;->h()V

    invoke-interface {p2}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {p2, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface {p2}, LEt0;->e()V

    :goto_0
    invoke-interface {p2}, LEt0;->L()V

    invoke-static {p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual {v6}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v1, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p2}, LEt0;->q()V

    invoke-static {p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, p2, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {p2, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {p2, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, -0x697b730e

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;->getEmail()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x200

    invoke-direct {p0, v0, v1, p2, v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->NameAndEmailForm(Ljava/lang/String;Ljava/lang/String;LEt0;I)V

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;->getBankName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;->getLast4()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;->getSaveForFutureUsage()Z

    move-result v4

    const/16 v6, 0x1000

    move-object v1, p0

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->AccountDetailsForm(Ljava/lang/String;Ljava/lang/String;ZLEt0;I)V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->f()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_4

    goto :goto_1

    :cond_4
    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$SavedAccountScreen$2;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$SavedAccountScreen$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method private final VerifyWithMicrodepositsScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;LEt0;I)V
    .locals 9

    const v0, 0x565f7c6c

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.VerifyWithMicrodepositsScreen (USBankAccountFormFragment.kt:276)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LgV2;->b0:LgV2$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v0

    const v1, -0x1cd0f17e

    invoke-interface {p2, v1}, LEt0;->F(I)V

    sget-object v1, Llo;->a:Llo;

    invoke-virtual {v1}, Llo;->g()Llo$l;

    move-result-object v1

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->j()LK9$b;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v2, p2, v3}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v1

    const v2, -0x4ee9b9da

    invoke-interface {p2, v2}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v2

    invoke-interface {p2, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {p2, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {p2, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {p2}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface {p2}, LEt0;->h()V

    invoke-interface {p2}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {p2, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface {p2}, LEt0;->e()V

    :goto_0
    invoke-interface {p2}, LEt0;->L()V

    invoke-static {p2}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual {v6}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v1, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v2, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v4, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v7, v5, v1}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p2}, LEt0;->q()V

    invoke-static {p2}, LMB5;->b(LEt0;)LEt0;

    move-result-object v1

    invoke-static {v1}, LMB5;->a(LEt0;)LMB5;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, p2, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v0, 0x7ab4aae9

    invoke-interface {p2, v0}, LEt0;->F(I)V

    const v0, -0x455f09d5

    invoke-interface {p2, v0}, LEt0;->F(I)V

    sget-object v0, LQm0;->a:LQm0;

    const v0, 0x749074b6

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;->getEmail()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x200

    invoke-direct {p0, v0, v1, p2, v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->NameAndEmailForm(Ljava/lang/String;Ljava/lang/String;LEt0;I)V

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/BankAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/BankAccount;->getBankName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;->getPaymentAccount()Lcom/stripe/android/financialconnections/model/BankAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/BankAccount;->getLast4()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;->getSaveForFutureUsage()Z

    move-result v4

    const/16 v6, 0x1000

    move-object v1, p0

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->AccountDetailsForm(Ljava/lang/String;Ljava/lang/String;ZLEt0;I)V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->f()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-interface {p2}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_4

    goto :goto_1

    :cond_4
    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$VerifyWithMicrodepositsScreen$2;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$VerifyWithMicrodepositsScreen$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_1
    return-void
.end method

.method public static final synthetic access$AccountDetailsForm(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Ljava/lang/String;Ljava/lang/String;ZLEt0;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->AccountDetailsForm(Ljava/lang/String;Ljava/lang/String;ZLEt0;I)V

    return-void
.end method

.method public static final synthetic access$MandateCollectionScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;LEt0;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->MandateCollectionScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$MandateCollection;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$NameAndEmailCollectionScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;LEt0;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->NameAndEmailCollectionScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$NameAndEmailForm(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Ljava/lang/String;Ljava/lang/String;LEt0;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->NameAndEmailForm(Ljava/lang/String;Ljava/lang/String;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$SavedAccountScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;LEt0;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->SavedAccountScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$SavedAccount;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$VerifyWithMicrodepositsScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;LEt0;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->VerifyWithMicrodepositsScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;LEt0;I)V

    return-void
.end method

.method public static final synthetic access$getClientSecret(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)Lcom/stripe/android/paymentsheet/model/ClientSecret;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getClientSecret()Lcom/stripe/android/paymentsheet/model/ClientSecret;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCompletePayment(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)Z
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getCompletePayment()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getFormArgs(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPaymentOptionsViewModelFactory(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)Landroidx/lifecycle/u$b;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getPaymentOptionsViewModelFactory()Landroidx/lifecycle/u$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPaymentSheetViewModelFactory(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)Landroidx/lifecycle/u$b;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getPaymentSheetViewModelFactory()Landroidx/lifecycle/u$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getSheetViewModel(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getSheetViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getViewModel(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getViewModel()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleScreenStateChanged(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->handleScreenStateChanged(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;)V

    return-void
.end method

.method public static final synthetic access$updateMandateText(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->updateMandateText(Ljava/lang/String;)V

    return-void
.end method

.method private final getClientSecret()Lcom/stripe/android/paymentsheet/model/ClientSecret;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->clientSecret$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/model/ClientSecret;

    return-object v0
.end method

.method private final getCompletePayment()Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->completePayment$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final getFormArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->formArgs$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    return-object v0
.end method

.method private final getPaymentOptionsViewModelFactory()Landroidx/lifecycle/u$b;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->paymentOptionsViewModelFactory$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/u$b;

    return-object v0
.end method

.method private final getPaymentSheetViewModelFactory()Landroidx/lifecycle/u$b;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->paymentSheetViewModelFactory$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/u$b;

    return-object v0
.end method

.method private final getSheetViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->sheetViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    return-object v0
.end method

.method private final getViewModel()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->viewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    return-object v0
.end method

.method private final handleScreenStateChanged(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;)V
    .locals 4

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getSheetViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;->getError()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->onError(Ljava/lang/Integer;)V

    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$NameAndEmailCollection;

    const/4 v1, 0x1

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getCompletePayment()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    move v2, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getViewModel()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->getRequiredFields()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_3
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;->getPrimaryButtonText()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$handleScreenStateChanged$1;

    invoke-direct {v3, p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$handleScreenStateChanged$1;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;)V

    invoke-direct {p0, v0, v3, v2, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->updatePrimaryButton(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZ)V

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState;->getMandateText()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->updateMandateText(Ljava/lang/String;)V

    return-void
.end method

.method private final updateMandateText(Ljava/lang/String;)V
    .locals 4

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getViewModel()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->getCurrentScreenState()LtP5;

    move-result-object v0

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormScreenState$VerifyWithMicrodeposits;

    if-eqz v0, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_microdeposit:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getViewModel()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->formattedMerchantName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    const-string v1, "if (viewModel.currentScr\u2026         \"\"\n            }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\n                "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n                \n                "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n            "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/StringsKt;->trimIndent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    const/4 p1, 0x0

    :cond_2
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getSheetViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updateBelowButtonText(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method private final updatePrimaryButton(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;ZZ)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getSheetViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updatePrimaryButtonState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V

    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getSheetViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v7, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;

    move-object v1, v7

    move-object v2, p1

    move v3, p4

    move-object v4, p0

    move v5, p3

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;-><init>(Ljava/lang/String;ZLcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;ZLkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0, v7}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->updateCustomPrimaryButtonUiState(Lkotlin/jvm/functions/Function1;)V

    :cond_1
    return-void
.end method

.method public static synthetic updatePrimaryButton$default(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x1

    if-eqz p6, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move p4, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->updatePrimaryButton(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZ)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getViewModel()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->registerFragment(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Landroidx/compose/ui/platform/ComposeView;

    invoke-virtual {p1}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string p1, "inflater.context"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    const/4 p3, -0x1

    invoke-direct {p1, p3, p3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {p0}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v0

    const/4 v1, 0x0

    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$1;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$1;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-static {p0}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    new-instance v9, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$2;

    invoke-direct {v9, p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lkotlin/coroutines/Continuation;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-static {p0}, LGq2;->a(LLifecycleOwner;)Lzq2;

    move-result-object v0

    new-instance v3, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$3;

    invoke-direct {v3, p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$3;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lkotlin/coroutines/Continuation;)V

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    new-instance p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4;

    invoke-direct {p1, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$onCreateView$1$4;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)V

    const p3, -0x14bad2c4    # -2.38372E26f

    const/4 v0, 0x1

    invoke-static {p3, v0, p1}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lkotlin/jvm/functions/Function2;)V

    return-object p2
.end method

.method public onDetach()V
    .locals 1

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getSheetViewModel()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;->resetUSBankPrimaryButton()V

    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->getViewModel()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->onDestroy()V

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDetach()V

    return-void
.end method
