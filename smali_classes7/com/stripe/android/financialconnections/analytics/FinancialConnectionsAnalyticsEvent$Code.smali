.class public final enum Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Code"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;",
        "",
        "code",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCode$financial_connections_release",
        "()Ljava/lang/String;",
        "toString",
        "SheetPresented",
        "SheetClosed",
        "SheetFailed",
        "Companion",
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

.field private static final Companion:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code$Companion;

.field private static final PREFIX:Ljava/lang/String; = "stripe_android.connections"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum SheetClosed:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

.field public static final enum SheetFailed:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

.field public static final enum SheetPresented:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;


# instance fields
.field private final code:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->SheetPresented:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->SheetClosed:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->SheetFailed:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    const/4 v1, 0x0

    const-string v2, "sheet.presented"

    const-string v3, "SheetPresented"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->SheetPresented:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    const/4 v1, 0x1

    const-string v2, "sheet.closed"

    const-string v3, "SheetClosed"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->SheetClosed:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    const/4 v1, 0x2

    const-string v2, "sheet.failed"

    const-string v3, "SheetFailed"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->SheetFailed:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    invoke-static {}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->$values()[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->$VALUES:[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->Companion:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->code:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->$VALUES:[Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;

    return-object v0
.end method


# virtual methods
.method public final getCode$financial_connections_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->code:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Code;->code:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stripe_android.connections."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
