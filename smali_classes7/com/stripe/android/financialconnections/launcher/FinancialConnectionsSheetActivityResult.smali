.class public abstract Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Companion;,
        Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;,
        Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Canceled;,
        Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u0000 \u00062\u00020\u0001:\u0004\u0005\u0006\u0007\u0008B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0001\u0003\t\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;",
        "Landroid/os/Parcelable;",
        "()V",
        "toBundle",
        "Landroid/os/Bundle;",
        "Canceled",
        "Companion",
        "Completed",
        "Failed",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Canceled;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;",
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;",
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
.field public static final Companion:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Companion;

.field public static final EXTRA_RESULT:Ljava/lang/String; = "com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result"


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;->Companion:Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;-><init>()V

    return-void
.end method


# virtual methods
.method public final toBundle()Landroid/os/Bundle;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Ld70;->a([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
