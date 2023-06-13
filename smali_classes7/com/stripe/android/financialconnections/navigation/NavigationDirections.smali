.class public final Lcom/stripe/android/financialconnections/navigation/NavigationDirections;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/navigation/NavigationDirections$ManualEntrySuccess;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0006\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/navigation/NavigationDirections;",
        "",
        "()V",
        "Default",
        "Lcom/stripe/android/financialconnections/navigation/NavigationCommand;",
        "getDefault",
        "()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;",
        "accountPicker",
        "getAccountPicker",
        "attachLinkedPaymentAccount",
        "getAttachLinkedPaymentAccount",
        "consent",
        "getConsent",
        "institutionPicker",
        "getInstitutionPicker",
        "manualEntry",
        "getManualEntry",
        "partnerAuth",
        "getPartnerAuth",
        "reset",
        "getReset",
        "success",
        "getSuccess",
        "ManualEntrySuccess",
        "financial-connections_release"
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
.field private static final Default:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

.field private static final accountPicker:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

.field private static final attachLinkedPaymentAccount:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

.field private static final consent:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

.field private static final institutionPicker:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

.field private static final manualEntry:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

.field private static final partnerAuth:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

.field private static final reset:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

.field private static final success:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->INSTANCE:Lcom/stripe/android/financialconnections/navigation/NavigationDirections;

    new-instance v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$institutionPicker$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$institutionPicker$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->institutionPicker:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    new-instance v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$consent$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$consent$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->consent:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    new-instance v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$partnerAuth$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$partnerAuth$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->partnerAuth:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    new-instance v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$accountPicker$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$accountPicker$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->accountPicker:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    new-instance v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$success$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$success$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->success:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    new-instance v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$manualEntry$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$manualEntry$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->manualEntry:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    new-instance v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$attachLinkedPaymentAccount$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$attachLinkedPaymentAccount$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->attachLinkedPaymentAccount:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    new-instance v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$reset$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$reset$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->reset:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    new-instance v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$Default$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/navigation/NavigationDirections$Default$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->Default:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAccountPicker()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->accountPicker:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    return-object v0
.end method

.method public final getAttachLinkedPaymentAccount()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->attachLinkedPaymentAccount:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    return-object v0
.end method

.method public final getConsent()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->consent:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    return-object v0
.end method

.method public final getDefault()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->Default:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    return-object v0
.end method

.method public final getInstitutionPicker()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->institutionPicker:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    return-object v0
.end method

.method public final getManualEntry()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->manualEntry:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    return-object v0
.end method

.method public final getPartnerAuth()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->partnerAuth:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    return-object v0
.end method

.method public final getReset()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->reset:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    return-object v0
.end method

.method public final getSuccess()Lcom/stripe/android/financialconnections/navigation/NavigationCommand;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/navigation/NavigationDirections;->success:Lcom/stripe/android/financialconnections/navigation/NavigationCommand;

    return-object v0
.end method
