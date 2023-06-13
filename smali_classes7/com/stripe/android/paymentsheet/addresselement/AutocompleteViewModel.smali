.class public final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;
.super Lie;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;,
        Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;,
        Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Companion;,
        Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 C2\u00020\u0001:\u0004DCEFB;\u0008\u0007\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010@\u001a\u00020?\u00a2\u0006\u0004\u0008A\u0010BJ\u0014\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\"\u0010!\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010 0\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u001a\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010\"R3\u0010&\u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010%0\u001f8\u0006X\u0087\u0004\u00f8\u0001\u0000\u00a2\u0006\u0012\n\u0004\u0008&\u0010\"\u0012\u0004\u0008)\u0010*\u001a\u0004\u0008\'\u0010(R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0017\u0010/\u001a\u00020.8\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R\u001a\u00105\u001a\u0008\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u001f\u0010<\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010 038F\u00a2\u0006\u0006\u001a\u0004\u0008:\u0010;R\u0017\u0010>\u001a\u0008\u0012\u0004\u0012\u00020#038F\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010;\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006G"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;",
        "Lie;",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
        "addressDetails",
        "",
        "setResultAndGoBack",
        "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;",
        "prediction",
        "selectPrediction",
        "onBackPressed",
        "onEnterAddressManually",
        "clearQuery",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
        "args",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
        "getArgs",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
        "navigator",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
        "getNavigator",
        "()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
        "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;",
        "placesClient",
        "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;",
        "autocompleteArgs",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;",
        "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;",
        "LGX2;",
        "",
        "_predictions",
        "LGX2;",
        "",
        "_loading",
        "Lkotlin/Result;",
        "addressResult",
        "getAddressResult",
        "()LGX2;",
        "getAddressResult$annotations",
        "()V",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;",
        "config",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "textFieldController",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "getTextFieldController",
        "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "LtP5;",
        "",
        "queryFlow",
        "LtP5;",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;",
        "debouncer",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;",
        "getPredictions",
        "()LtP5;",
        "predictions",
        "getLoading",
        "loading",
        "Landroid/app/Application;",
        "application",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;Landroid/app/Application;)V",
        "Companion",
        "Args",
        "Debouncer",
        "Factory",
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
        "SMAP\nAutocompleteViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocompleteViewModel.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,247:1\n47#2:248\n49#2:252\n50#3:249\n55#3:251\n106#4:250\n*S KotlinDebug\n*F\n+ 1 AutocompleteViewModel.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel\n*L\n63#1:248\n63#1:252\n63#1:249\n63#1:251\n63#1:250\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Companion;

.field public static final MAX_DISPLAYED_RESULTS:I = 0x4

.field public static final MIN_CHARS_AUTOCOMPLETE:I = 0x3

.field public static final SEARCH_DEBOUNCE_MS:J = 0x3e8L


# instance fields
.field private final _loading:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _predictions:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;",
            ">;>;"
        }
    .end annotation
.end field

.field private final addressResult:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Lkotlin/Result<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
            ">;>;"
        }
    .end annotation
.end field

.field private final args:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

.field private final autocompleteArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;

.field private final config:Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

.field private final debouncer:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;

.field private final eventReporter:Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;

.field private final navigator:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

.field private final placesClient:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

.field private final queryFlow:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final textFieldController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->Companion:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;Landroid/app/Application;)V
    .locals 7

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autocompleteArgs"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "application"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p6}, Lie;-><init>(Landroid/app/Application;)V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->args:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->navigator:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->placesClient:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->autocompleteArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->eventReporter:Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;

    const/4 p1, 0x0

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_predictions:LGX2;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p2}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_loading:LGX2;

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->addressResult:LGX2;

    new-instance p2, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    sget p3, Lcom/stripe/android/paymentsheet/R$string;->address_label_address:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v4

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;-><init>(Ljava/lang/Integer;IILGX2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->config:Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    new-instance p3, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p3

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->textFieldController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    invoke-virtual {p3}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getFieldValue()LEu1;

    move-result-object p2

    new-instance p3, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$special$$inlined$map$1;

    invoke-direct {p3, p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$special$$inlined$map$1;-><init>(LEu1;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object p2

    sget-object v0, Ljz5;->a:Ljz5$a;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x3

    invoke-static/range {v0 .. v6}, Ljz5$a;->b(Ljz5$a;JJILjava/lang/Object;)Ljz5;

    move-result-object p6

    const-string v0, ""

    invoke-static {p3, p2, p6, v0}, LVu1;->O(LEu1;LZC0;Ljz5;Ljava/lang/Object;)LtP5;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->queryFlow:LtP5;

    new-instance p3, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;

    invoke-direct {p3}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;-><init>()V

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->debouncer:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object p6

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)V

    invoke-virtual {p3, p6, p2, v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;->startWatching(LZC0;LtP5;Lkotlin/jvm/functions/Function1;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2;

    invoke-direct {v4, p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    invoke-virtual {p4}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;->getCountry()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p5, p1}, Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;->onShow(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static final synthetic access$getAutocompleteArgs$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->autocompleteArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;

    return-object p0
.end method

.method public static final synthetic access$getConfig$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->config:Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    return-object p0
.end method

.method public static final synthetic access$getPlacesClient$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->placesClient:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    return-object p0
.end method

.method public static final synthetic access$getQueryFlow$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)LtP5;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->queryFlow:LtP5;

    return-object p0
.end method

.method public static final synthetic access$get_loading$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)LGX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_loading:LGX2;

    return-object p0
.end method

.method public static final synthetic access$get_predictions$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)LGX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_predictions:LGX2;

    return-object p0
.end method

.method public static synthetic getAddressResult$annotations()V
    .locals 0

    return-void
.end method

.method private final setResultAndGoBack(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V
    .locals 2

    const-string v0, "AddressDetails"

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->navigator:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    invoke-virtual {v1, v0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->setResult(Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Unit;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->addressResult:LGX2;

    invoke-interface {p1}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlin/Result;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_1

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->navigator:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    invoke-virtual {v1, v0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->setResult(Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Unit;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->navigator:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->setResult(Ljava/lang/String;Ljava/lang/Object;)Lkotlin/Unit;

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->navigator:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->onBack()Lkotlin/Unit;

    return-void
.end method

.method public static synthetic setResultAndGoBack$default(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->setResultAndGoBack(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    return-void
.end method


# virtual methods
.method public final clearQuery()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->textFieldController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->onRawValueChange(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_predictions:LGX2;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final getAddressResult()LGX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGX2<",
            "Lkotlin/Result<",
            "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->addressResult:LGX2;

    return-object v0
.end method

.method public final getArgs()Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->args:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;

    return-object v0
.end method

.method public final getLoading()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_loading:LGX2;

    return-object v0
.end method

.method public final getNavigator()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->navigator:Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    return-object v0
.end method

.method public final getPredictions()LtP5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_predictions:LGX2;

    return-object v0
.end method

.method public final getTextFieldController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->textFieldController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    return-object v0
.end method

.method public final onBackPressed()V
    .locals 13

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->queryFlow:LtP5;

    invoke-interface {v0}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    const/4 v2, 0x0

    new-instance v12, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->queryFlow:LtP5;

    invoke-interface {v1}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x3b

    const/4 v11, 0x0

    move-object v3, v12

    invoke-direct/range {v3 .. v11}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v6, 0xd

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->setResultAndGoBack(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    return-void
.end method

.method public final onEnterAddressManually()V
    .locals 18

    move-object/from16 v0, p0

    new-instance v8, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    const/4 v10, 0x0

    const/4 v11, 0x0

    iget-object v1, v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->queryFlow:LtP5;

    invoke-interface {v1}, LtP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Ljava/lang/String;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x3b

    const/16 v17, 0x0

    move-object v9, v3

    invoke-direct/range {v9 .. v17}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xd

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;-><init>(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v8}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->setResultAndGoBack(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V

    return-void
.end method

.method public final selectPrediction(Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;)V
    .locals 7

    const-string v0, "prediction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LTr6;->a(LOr6;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
