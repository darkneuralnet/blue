.class public final Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Companion;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWN2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LWN2<",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Companion;",
        "LWN2;",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;",
        "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;",
        "LPr6;",
        "viewModelContext",
        "state",
        "create",
        "",
        "SEARCH_DEBOUNCE_MS",
        "J",
        "<init>",
        "()V",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic create(LPr6;LAN2;)LRN2;
    .locals 0

    check-cast p2, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Companion;->create(LPr6;Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;

    move-result-object p1

    return-object p1
.end method

.method public create(LPr6;Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;
    .locals 1

    const-string v0, "viewModelContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LPr6;->a()Landroidx/activity/ComponentActivity;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;->getViewModel()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;->getActivityRetainedComponent()Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;->getInstitutionPickerBuilder()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerSubcomponent$Builder;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerSubcomponent$Builder;->initialState(Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerSubcomponent$Builder;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerSubcomponent$Builder;->build()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerSubcomponent;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerSubcomponent;->getViewModel()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic initialState(LPr6;)LAN2;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Companion;->initialState(LPr6;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    move-result-object p1

    return-object p1
.end method

.method public initialState(LPr6;)Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;
    .locals 0

    invoke-static {p0, p1}, LWN2$a;->a(LWN2;LPr6;)LAN2;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerState;

    return-object p1
.end method
