.class public final Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;,
        Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u000f\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;",
        "",
        "financialConnectionsSheetLauncher",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;",
        "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;)V",
        "present",
        "",
        "configuration",
        "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;",
        "Companion",
        "Configuration",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Companion;


# instance fields
.field private final financialConnectionsSheetLauncher:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;->Companion:Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;)V
    .locals 1

    const-string v0, "financialConnectionsSheetLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;->financialConnectionsSheetLauncher:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;

    return-void
.end method


# virtual methods
.method public final present(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V
    .locals 1

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;->financialConnectionsSheetLauncher:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;

    invoke-interface {v0, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;->present(Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V

    return-void
.end method
