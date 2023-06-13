.class public final Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsUrls$Disconnect;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsUrls;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Disconnect"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsUrls$Disconnect;",
        "",
        "()V",
        "dashboard",
        "",
        "email",
        "link",
        "supportEndUser",
        "supportMerchantUser",
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
.field public static final $stable:I = 0x0

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsUrls$Disconnect;

.field public static final dashboard:Ljava/lang/String; = "https://dashboard.stripe.com/settings/linked-accounts"

.field public static final email:Ljava/lang/String; = "ttps://support.stripe.com/contact"

.field public static final link:Ljava/lang/String; = "https://support.link.co/questions/connecting-your-bank-account#how-do-i-disconnect-my-connected-bank-account"

.field public static final supportEndUser:Ljava/lang/String; = "https://support.stripe.com/user/how-do-i-disconnect-my-linked-financial-account"

.field public static final supportMerchantUser:Ljava/lang/String; = "https://support.stripe.com/how-to-disconnect-a-linked-financial-account"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsUrls$Disconnect;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsUrls$Disconnect;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsUrls$Disconnect;->INSTANCE:Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsUrls$Disconnect;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
