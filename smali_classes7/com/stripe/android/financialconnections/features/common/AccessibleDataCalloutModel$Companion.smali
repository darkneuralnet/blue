.class public final Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel$Companion;",
        "",
        "()V",
        "fromManifest",
        "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;",
        "manifest",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromManifest(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;
    .locals 7

    const-string v0, "manifest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/financialconnections/features/consent/ConsentTextBuilder;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/ConsentTextBuilder;

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/features/consent/ConsentTextBuilder;->getBusinessName(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->getPermissions()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isNetworkingUserFlow()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_0
    move v5, v1

    :goto_0
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isStripeDirect()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v4, v0

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    sget-object v0, Lcom/stripe/android/financialconnections/features/consent/FinancialConnectionsUrlResolver;->INSTANCE:Lcom/stripe/android/financialconnections/features/consent/FinancialConnectionsUrlResolver;

    invoke-virtual {v0, p1}, Lcom/stripe/android/financialconnections/features/consent/FinancialConnectionsUrlResolver;->getDataPolicyUrl(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Ljava/lang/String;

    move-result-object v6

    new-instance p1, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;-><init>(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;)V

    return-object p1
.end method
