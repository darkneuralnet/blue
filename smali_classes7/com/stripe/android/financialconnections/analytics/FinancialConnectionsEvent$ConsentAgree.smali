.class public final Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ConsentAgree;
.super Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ConsentAgree"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ConsentAgree;",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;",
        "()V",
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

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ConsentAgree;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ConsentAgree;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ConsentAgree;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ConsentAgree;->INSTANCE:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ConsentAgree;

    return-void
.end method

.method private constructor <init>()V
    .locals 6

    const-string v1, "click.agree"

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->CONSENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v2, "pane"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;-><init>(Ljava/lang/String;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
