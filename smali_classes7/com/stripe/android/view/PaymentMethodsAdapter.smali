.class public final Lcom/stripe/android/view/PaymentMethodsAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;,
        Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;,
        Lcom/stripe/android/view/PaymentMethodsAdapter$WhenMappings;,
        Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder;,
        Lcom/stripe/android/view/PaymentMethodsAdapter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 d2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0004defgBI\u0012\u0006\u0010`\u001a\u00020_\u0012\u000e\u0008\u0002\u00104\u001a\u0008\u0012\u0004\u0012\u0002030\u0016\u0012\n\u0008\u0002\u0010a\u001a\u0004\u0018\u00010=\u0012\u0008\u0008\u0002\u00106\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u00108\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u00109\u001a\u00020\u0005\u00a2\u0006\u0004\u0008b\u0010cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001d\u0010\u001b\u001a\u00020\u00082\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016H\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0008\u0010\u001c\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u00020\u00082\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0017\u0010$\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\"\u0010#J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0003H\u0016J\u0017\u0010*\u001a\u00020\u00082\u0006\u0010\'\u001a\u00020\u0017H\u0000\u00a2\u0006\u0004\u0008(\u0010)J\u0017\u0010,\u001a\u00020\u00082\u0006\u0010\'\u001a\u00020\u0017H\u0000\u00a2\u0006\u0004\u0008+\u0010)J\u0017\u0010/\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008-\u0010.J\u0019\u00102\u001a\u0004\u0018\u00010\u00032\u0006\u0010\'\u001a\u00020\u0017H\u0000\u00a2\u0006\u0004\u00080\u00101R\u001a\u00104\u001a\u0008\u0012\u0004\u0012\u0002030\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0014\u00106\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0014\u00108\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00107R\u0014\u00109\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00089\u00107R \u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170:8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u00105\u001a\u0004\u0008;\u0010<R$\u0010>\u001a\u0004\u0018\u00010=8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008>\u0010?\u001a\u0004\u0008@\u0010A\"\u0004\u0008B\u0010CR$\u0010E\u001a\u0004\u0018\u00010D8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010JR\u0014\u0010K\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u001a\u0010O\u001a\u0008\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u001d\u0010R\u001a\u0008\u0012\u0004\u0012\u00020N0Q8\u0006\u00a2\u0006\u000c\n\u0004\u0008R\u0010S\u001a\u0004\u0008T\u0010UR\u001a\u0010V\u001a\u00020N8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008V\u0010W\u001a\u0004\u0008X\u0010YR\u001a\u0010Z\u001a\u00020N8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008Z\u0010W\u001a\u0004\u0008[\u0010YR\u0016\u0010^\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\\\u0010]\u00a8\u0006h"
    }
    d2 = {
        "Lcom/stripe/android/view/PaymentMethodsAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$h;",
        "Landroidx/recyclerview/widget/RecyclerView$D;",
        "",
        "position",
        "",
        "isGooglePayPosition",
        "isPaymentMethodsPosition",
        "",
        "updateSelectedPaymentMethod",
        "Landroid/view/ViewGroup;",
        "parent",
        "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;",
        "createAddCardPaymentMethodViewHolder",
        "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;",
        "createAddFpxPaymentMethodViewHolder",
        "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;",
        "createPaymentMethodViewHolder",
        "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;",
        "createGooglePayViewHolder",
        "getPaymentMethodIndex",
        "getAddableTypesPosition",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paymentMethods",
        "setPaymentMethods$payments_core_release",
        "(Ljava/util/List;)V",
        "setPaymentMethods",
        "getItemCount",
        "getItemViewType",
        "",
        "getItemId",
        "holder",
        "onBindViewHolder",
        "onPositionClicked$payments_core_release",
        "(I)V",
        "onPositionClicked",
        "viewType",
        "onCreateViewHolder",
        "paymentMethod",
        "deletePaymentMethod$payments_core_release",
        "(Lcom/stripe/android/model/PaymentMethod;)V",
        "deletePaymentMethod",
        "resetPaymentMethod$payments_core_release",
        "resetPaymentMethod",
        "getPaymentMethodAtPosition$payments_core_release",
        "(I)Lcom/stripe/android/model/PaymentMethod;",
        "getPaymentMethodAtPosition",
        "getPosition$payments_core_release",
        "(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/Integer;",
        "getPosition",
        "Lcom/stripe/android/model/PaymentMethod$Type;",
        "addableTypes",
        "Ljava/util/List;",
        "shouldShowGooglePay",
        "Z",
        "useGooglePay",
        "canDeletePaymentMethods",
        "",
        "getPaymentMethods$payments_core_release",
        "()Ljava/util/List;",
        "",
        "selectedPaymentMethodId",
        "Ljava/lang/String;",
        "getSelectedPaymentMethodId$payments_core_release",
        "()Ljava/lang/String;",
        "setSelectedPaymentMethodId$payments_core_release",
        "(Ljava/lang/String;)V",
        "Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;",
        "listener",
        "Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;",
        "getListener$payments_core_release",
        "()Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;",
        "setListener$payments_core_release",
        "(Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;)V",
        "googlePayCount",
        "I",
        "LuX2;",
        "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;",
        "_addPaymentMethodArgs",
        "LuX2;",
        "Landroidx/lifecycle/LiveData;",
        "addPaymentMethodArgs",
        "Landroidx/lifecycle/LiveData;",
        "getAddPaymentMethodArgs",
        "()Landroidx/lifecycle/LiveData;",
        "addCardArgs",
        "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;",
        "getAddCardArgs$payments_core_release",
        "()Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;",
        "addFpxArgs",
        "getAddFpxArgs$payments_core_release",
        "getSelectedPaymentMethod$payments_core_release",
        "()Lcom/stripe/android/model/PaymentMethod;",
        "selectedPaymentMethod",
        "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;",
        "intentArgs",
        "initiallySelectedPaymentMethodId",
        "<init>",
        "(Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;Ljava/util/List;Ljava/lang/String;ZZZ)V",
        "Companion",
        "Listener",
        "ViewHolder",
        "ViewType",
        "payments-core_release"
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
        "SMAP\nPaymentMethodsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsAdapter.kt\ncom/stripe/android/view/PaymentMethodsAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,387:1\n1#2:388\n288#3,2:389\n350#3,7:391\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsAdapter.kt\ncom/stripe/android/view/PaymentMethodsAdapter\n*L\n37#1:389,2\n165#1:391,7\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/view/PaymentMethodsAdapter$Companion;

.field private static final GOOGLE_PAY_ITEM_ID:J


# instance fields
.field private final _addPaymentMethodArgs:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final addCardArgs:Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;

.field private final addFpxArgs:Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;

.field private final addPaymentMethodArgs:Landroidx/lifecycle/LiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;",
            ">;"
        }
    .end annotation
.end field

.field private final addableTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod$Type;",
            ">;"
        }
    .end annotation
.end field

.field private final canDeletePaymentMethods:Z

.field private final googlePayCount:I

.field private listener:Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;

.field private final paymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private selectedPaymentMethodId:Ljava/lang/String;

.field private final shouldShowGooglePay:Z

.field private final useGooglePay:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsAdapter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/PaymentMethodsAdapter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/PaymentMethodsAdapter;->Companion:Lcom/stripe/android/view/PaymentMethodsAdapter$Companion;

    const v0, -0x7aa6eedc

    int-to-long v0, v0

    sput-wide v0, Lcom/stripe/android/view/PaymentMethodsAdapter;->GOOGLE_PAY_ITEM_ID:J

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;Ljava/util/List;Ljava/lang/String;ZZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/PaymentMethod$Type;",
            ">;",
            "Ljava/lang/String;",
            "ZZZ)V"
        }
    .end annotation

    const-string v0, "intentArgs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addableTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->addableTypes:Ljava/util/List;

    iput-boolean p4, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->shouldShowGooglePay:Z

    iput-boolean p5, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->useGooglePay:Z

    iput-boolean p6, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->canDeletePaymentMethods:Z

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->paymentMethods:Ljava/util/List;

    iput-object p3, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->selectedPaymentMethodId:Ljava/lang/String;

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    if-eqz p4, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    :goto_1
    iput p3, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->googlePayCount:I

    new-instance p3, LuX2;

    invoke-direct {p3}, LuX2;-><init>()V

    iput-object p3, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->_addPaymentMethodArgs:LuX2;

    iput-object p3, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->addPaymentMethodArgs:Landroidx/lifecycle/LiveData;

    new-instance p3, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;

    invoke-direct {p3}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;->getBillingAddressFields$payments_core_release()Lcom/stripe/android/view/BillingAddressFields;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;->setBillingAddressFields(Lcom/stripe/android/view/BillingAddressFields;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;->setShouldAttachToCustomer(Z)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;

    move-result-object p3

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;->isPaymentSessionActive$payments_core_release()Z

    move-result p4

    invoke-virtual {p3, p4}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;->setIsPaymentSessionActive$payments_core_release(Z)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;

    move-result-object p3

    sget-object p4, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {p3, p4}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;->setPaymentMethodType(Lcom/stripe/android/model/PaymentMethod$Type;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;

    move-result-object p3

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;->getAddPaymentMethodFooterLayoutId()I

    move-result p4

    invoke-virtual {p3, p4}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;->setAddPaymentMethodFooter(I)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;

    move-result-object p3

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;->getPaymentConfiguration$payments_core_release()Lcom/stripe/android/PaymentConfiguration;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;->setPaymentConfiguration(Lcom/stripe/android/PaymentConfiguration;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;

    move-result-object p3

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;->getWindowFlags$payments_core_release()Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;->setWindowFlags(Ljava/lang/Integer;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;

    move-result-object p3

    invoke-virtual {p3}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;->build()Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->addCardArgs:Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;

    new-instance p3, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;

    invoke-direct {p3}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;->isPaymentSessionActive$payments_core_release()Z

    move-result p4

    invoke-virtual {p3, p4}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;->setIsPaymentSessionActive$payments_core_release(Z)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;

    move-result-object p3

    sget-object p4, Lcom/stripe/android/model/PaymentMethod$Type;->Fpx:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {p3, p4}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;->setPaymentMethodType(Lcom/stripe/android/model/PaymentMethod$Type;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;

    move-result-object p3

    invoke-virtual {p1}, Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;->getPaymentConfiguration$payments_core_release()Lcom/stripe/android/PaymentConfiguration;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;->setPaymentConfiguration(Lcom/stripe/android/PaymentConfiguration;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;->build()Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->addFpxArgs:Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$h;->setHasStableIds(Z)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;Ljava/util/List;Ljava/lang/String;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    sget-object p2, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p7, 0x8

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    move v4, p3

    goto :goto_0

    :cond_2
    move v4, p4

    :goto_0
    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_3

    move v5, p3

    goto :goto_1

    :cond_3
    move v5, p5

    :goto_1
    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_4

    const/4 p6, 0x1

    :cond_4
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/view/PaymentMethodsAdapter;-><init>(Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;Ljava/util/List;Ljava/lang/String;ZZZ)V

    return-void
.end method

.method public static final synthetic access$getGOOGLE_PAY_ITEM_ID$cp()J
    .locals 2

    sget-wide v0, Lcom/stripe/android/view/PaymentMethodsAdapter;->GOOGLE_PAY_ITEM_ID:J

    return-wide v0
.end method

.method private final createAddCardPaymentMethodViewHolder(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;
    .locals 3

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "parent.context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object v0
.end method

.method private final createAddFpxPaymentMethodViewHolder(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;
    .locals 3

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "parent.context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object v0
.end method

.method private final createGooglePayViewHolder(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;
    .locals 3

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "parent.context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    return-object v0
.end method

.method private final createPaymentMethodViewHolder(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;
    .locals 3

    new-instance v0, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;

    invoke-direct {v0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;-><init>(Landroid/view/ViewGroup;)V

    iget-boolean v1, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->canDeletePaymentMethods:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v2, Lcom/stripe/android/R$string;->delete_payment_method:I

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-instance v2, LvO3;

    invoke-direct {v2, p0, v0}, LvO3;-><init>(Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;)V

    invoke-static {v1, p1, v2}, Lbq6;->c(Landroid/view/View;Ljava/lang/CharSequence;Lu2;)I

    :cond_0
    return-object v0
.end method

.method private static final createPaymentMethodViewHolder$lambda$8(Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;Landroid/view/View;Lu2$a;)Z
    .locals 0

    const-string p3, "this$0"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$viewHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "<anonymous parameter 0>"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->listener:Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getBindingAdapterPosition()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->getPaymentMethodAtPosition$payments_core_release(I)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;->onDeletePaymentMethodAction(Lcom/stripe/android/model/PaymentMethod;)V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private final getAddableTypesPosition(I)I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->paymentMethods:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr p1, v0

    iget v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->googlePayCount:I

    sub-int/2addr p1, v0

    return p1
.end method

.method private final getPaymentMethodIndex(I)I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->googlePayCount:I

    sub-int/2addr p1, v0

    return p1
.end method

.method private final isGooglePayPosition(I)Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->shouldShowGooglePay:Z

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final isPaymentMethodsPosition(I)Z
    .locals 4

    iget-boolean v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->shouldShowGooglePay:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lkotlin/ranges/IntRange;

    iget-object v3, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->paymentMethods:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v0, v1, v3}, Lkotlin/ranges/IntRange;-><init>(II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->paymentMethods:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v2, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v3

    invoke-virtual {v0}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v0

    if-gt p1, v0, :cond_1

    if-gt v3, p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    return v1
.end method

.method public static synthetic o(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->onBindViewHolder$lambda$4(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroid/view/View;)V

    return-void
.end method

.method private static final onBindViewHolder$lambda$3(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroidx/recyclerview/widget/RecyclerView$D;Landroid/view/View;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$holder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getBindingAdapterPosition()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->onPositionClicked$payments_core_release(I)V

    return-void
.end method

.method private static final onBindViewHolder$lambda$4(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->selectedPaymentMethodId:Ljava/lang/String;

    iget-object p0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->listener:Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;->onGooglePayClick()V

    :cond_0
    return-void
.end method

.method private static final onBindViewHolder$lambda$5(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->_addPaymentMethodArgs:LuX2;

    iget-object p0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->addCardArgs:Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;

    invoke-virtual {p1, p0}, LuX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onBindViewHolder$lambda$6(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroid/view/View;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->_addPaymentMethodArgs:LuX2;

    iget-object p0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->addFpxArgs:Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;

    invoke-virtual {p1, p0}, LuX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic p(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroidx/recyclerview/widget/RecyclerView$D;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/PaymentMethodsAdapter;->onBindViewHolder$lambda$3(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroidx/recyclerview/widget/RecyclerView$D;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic q(Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;Landroid/view/View;Lu2$a;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/view/PaymentMethodsAdapter;->createPaymentMethodViewHolder$lambda$8(Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;Landroid/view/View;Lu2$a;)Z

    move-result p0

    return p0
.end method

.method public static synthetic r(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->onBindViewHolder$lambda$6(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic t(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->onBindViewHolder$lambda$5(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroid/view/View;)V

    return-void
.end method

.method private final updateSelectedPaymentMethod(I)V
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->paymentMethods:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/model/PaymentMethod;

    iget-object v2, v2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->selectedPaymentMethodId:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_1
    if-eq v1, p1, :cond_3

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(I)V

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->paymentMethods:Ljava/util/List;

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    iput-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->selectedPaymentMethodId:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(I)V

    return-void
.end method


# virtual methods
.method public final synthetic deletePaymentMethod$payments_core_release(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 2

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->getPosition$payments_core_release(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->paymentMethods:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemRemoved(I)V

    :cond_0
    return-void
.end method

.method public final getAddCardArgs$payments_core_release()Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->addCardArgs:Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;

    return-object v0
.end method

.method public final getAddFpxArgs$payments_core_release()Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->addFpxArgs:Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;

    return-object v0
.end method

.method public final getAddPaymentMethodArgs()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->addPaymentMethodArgs:Landroidx/lifecycle/LiveData;

    return-object v0
.end method

.method public getItemCount()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->paymentMethods:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->addableTypes:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->googlePayCount:I

    add-int/2addr v0, v1

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->isGooglePayPosition(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-wide v0, Lcom/stripe/android/view/PaymentMethodsAdapter;->GOOGLE_PAY_ITEM_ID:J

    goto :goto_1

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->isPaymentMethodsPosition(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->getPaymentMethodAtPosition$payments_core_release(I)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethod;->hashCode()I

    move-result p1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->addableTypes:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->getAddableTypesPosition(I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    :goto_0
    int-to-long v0, p1

    :goto_1
    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 3

    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->isGooglePayPosition(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;->GooglePay:Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->isPaymentMethodsPosition(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->getPaymentMethodAtPosition$payments_core_release(I)Lcom/stripe/android/model/PaymentMethod;

    move-result-object v0

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    if-ne v1, v0, :cond_1

    sget-object p1, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;->Card:Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->getItemViewType(I)I

    move-result p1

    :goto_0
    return p1

    :cond_2
    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->addableTypes:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->getAddableTypesPosition(I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/PaymentMethod$Type;

    sget-object v0, Lcom/stripe/android/view/PaymentMethodsAdapter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    sget-object p1, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;->AddFpx:Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported PaymentMethod type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    sget-object p1, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;->AddCard:Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    :goto_1
    return p1
.end method

.method public final getListener$payments_core_release()Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->listener:Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;

    return-object v0
.end method

.method public final synthetic getPaymentMethodAtPosition$payments_core_release(I)Lcom/stripe/android/model/PaymentMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->paymentMethods:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->getPaymentMethodIndex(I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/PaymentMethod;

    return-object p1
.end method

.method public final getPaymentMethods$payments_core_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->paymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final getPosition$payments_core_release(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->paymentMethods:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->googlePayCount:I

    add-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_2
    return-object v1
.end method

.method public final getSelectedPaymentMethod$payments_core_release()Lcom/stripe/android/model/PaymentMethod;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->selectedPaymentMethodId:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->paymentMethods:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/stripe/android/model/PaymentMethod;

    iget-object v4, v4, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v1, v3

    :cond_1
    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    :cond_2
    return-object v1
.end method

.method public final getSelectedPaymentMethodId$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->selectedPaymentMethodId:Ljava/lang/String;

    return-object v0
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 2

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lcom/stripe/android/view/PaymentMethodsAdapter;->getPaymentMethodAtPosition$payments_core_release(I)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p2

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;

    invoke-virtual {v0, p2}, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;->setPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V

    iget-object p2, p2, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->selectedPaymentMethodId:Ljava/lang/String;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v0, p2}, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;->setSelected(Z)V

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    new-instance v0, LwO3;

    invoke-direct {v0, p0, p1}, LwO3;-><init>(Lcom/stripe/android/view/PaymentMethodsAdapter;Landroidx/recyclerview/widget/RecyclerView$D;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;

    if-eqz p2, :cond_1

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    new-instance v0, LxO3;

    invoke-direct {v0, p0}, LxO3;-><init>(Lcom/stripe/android/view/PaymentMethodsAdapter;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    check-cast p1, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;

    iget-boolean p2, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->useGooglePay:Z

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;->bind(Z)V

    goto :goto_0

    :cond_1
    instance-of p2, p1, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;

    if-eqz p2, :cond_2

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    new-instance p2, LyO3;

    invoke-direct {p2, p0}, LyO3;-><init>(Lcom/stripe/android/view/PaymentMethodsAdapter;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_2
    instance-of p2, p1, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;

    if-eqz p2, :cond_3

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    new-instance p2, LzO3;

    invoke-direct {p2, p0}, LzO3;-><init>(Lcom/stripe/android/view/PaymentMethodsAdapter;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;->values()[Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;

    move-result-object v0

    aget-object p2, v0, p2

    sget-object v0, Lcom/stripe/android/view/PaymentMethodsAdapter$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->createGooglePayViewHolder(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->createAddFpxPaymentMethodViewHolder(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->createAddCardPaymentMethodViewHolder(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->createPaymentMethodViewHolder(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final synthetic onPositionClicked$payments_core_release(I)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->updateSelectedPaymentMethod(I)V

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->listener:Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->getPaymentMethodAtPosition$payments_core_release(I)Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;->onPaymentMethodClick(Lcom/stripe/android/model/PaymentMethod;)V

    :cond_0
    return-void
.end method

.method public final synthetic resetPaymentMethod$payments_core_release(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->getPosition$payments_core_release(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyItemChanged(I)V

    :cond_0
    return-void
.end method

.method public final setListener$payments_core_release(Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->listener:Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;

    return-void
.end method

.method public final synthetic setPaymentMethods$payments_core_release(Ljava/util/List;)V
    .locals 1

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->paymentMethods:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->paymentMethods:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    return-void
.end method

.method public final setSelectedPaymentMethodId$payments_core_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/PaymentMethodsAdapter;->selectedPaymentMethodId:Ljava/lang/String;

    return-void
.end method
