.class public final enum Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
    with = Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Serializer;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Flow"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Companion;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Serializer;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u001b\u0008\u0087\u0001\u0018\u0000 \u001c2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u001c\u001dB\u0011\u0008\u0002\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;",
        "",
        "value",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "DIRECT",
        "DIRECT_WEBVIEW",
        "FINICITY_CONNECT_V2_FIX",
        "FINICITY_CONNECT_V2_LITE",
        "FINICITY_CONNECT_V2_OAUTH",
        "FINICITY_CONNECT_V2_OAUTH_REDIRECT",
        "FINICITY_CONNECT_V2_OAUTH_WEBVIEW",
        "MX_CONNECT",
        "MX_OAUTH",
        "MX_OAUTH_APP2APP",
        "MX_OAUTH_REDIRECT",
        "MX_OAUTH_WEBVIEW",
        "TESTMODE",
        "TESTMODE_OAUTH",
        "TESTMODE_OAUTH_WEBVIEW",
        "TRUELAYER_OAUTH",
        "TRUELAYER_OAUTH_HANDOFF",
        "TRUELAYER_OAUTH_WEBVIEW",
        "WELLS_FARGO",
        "WELLS_FARGO_WEBVIEW",
        "UNKNOWN",
        "Companion",
        "Serializer",
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

.field private static final $cachedSerializer$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "LKj2<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Companion;

.field public static final enum DIRECT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "direct"
    .end annotation
.end field

.field public static final enum DIRECT_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "direct_webview"
    .end annotation
.end field

.field public static final enum FINICITY_CONNECT_V2_FIX:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "finicity_connect_v2_fix"
    .end annotation
.end field

.field public static final enum FINICITY_CONNECT_V2_LITE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "finicity_connect_v2_lite"
    .end annotation
.end field

.field public static final enum FINICITY_CONNECT_V2_OAUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "finicity_connect_v2_oauth"
    .end annotation
.end field

.field public static final enum FINICITY_CONNECT_V2_OAUTH_REDIRECT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "finicity_connect_v2_oauth_redirect"
    .end annotation
.end field

.field public static final enum FINICITY_CONNECT_V2_OAUTH_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "finicity_connect_v2_oauth_webview"
    .end annotation
.end field

.field public static final enum MX_CONNECT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "mx_connect"
    .end annotation
.end field

.field public static final enum MX_OAUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "mx_oauth"
    .end annotation
.end field

.field public static final enum MX_OAUTH_APP2APP:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "mx_oauth_app_to_app"
    .end annotation
.end field

.field public static final enum MX_OAUTH_REDIRECT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "mx_oauth_redirect"
    .end annotation
.end field

.field public static final enum MX_OAUTH_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "mx_oauth_webview"
    .end annotation
.end field

.field public static final enum TESTMODE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "testmode"
    .end annotation
.end field

.field public static final enum TESTMODE_OAUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "testmode_oauth"
    .end annotation
.end field

.field public static final enum TESTMODE_OAUTH_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "testmode_oauth_webview"
    .end annotation
.end field

.field public static final enum TRUELAYER_OAUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "truelayer_oauth"
    .end annotation
.end field

.field public static final enum TRUELAYER_OAUTH_HANDOFF:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "truelayer_oauth_handoff"
    .end annotation
.end field

.field public static final enum TRUELAYER_OAUTH_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "truelayer_oauth_webview"
    .end annotation
.end field

.field public static final enum UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "unknown"
    .end annotation
.end field

.field public static final enum WELLS_FARGO:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "wells_fargo"
    .end annotation
.end field

.field public static final enum WELLS_FARGO_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .annotation runtime LVs5;
        value = "wells_fargo_webview"
    .end annotation
.end field


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .locals 3

    const/16 v0, 0x15

    new-array v0, v0, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->DIRECT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->DIRECT_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->FINICITY_CONNECT_V2_FIX:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->FINICITY_CONNECT_V2_LITE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->FINICITY_CONNECT_V2_OAUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->FINICITY_CONNECT_V2_OAUTH_REDIRECT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->FINICITY_CONNECT_V2_OAUTH_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->MX_CONNECT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->MX_OAUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->MX_OAUTH_APP2APP:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->MX_OAUTH_REDIRECT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->MX_OAUTH_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->TESTMODE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->TESTMODE_OAUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->TESTMODE_OAUTH_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->TRUELAYER_OAUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->TRUELAYER_OAUTH_HANDOFF:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->TRUELAYER_OAUTH_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->WELLS_FARGO:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->WELLS_FARGO_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/4 v1, 0x0

    const-string v2, "direct"

    const-string v3, "DIRECT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->DIRECT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/4 v1, 0x1

    const-string v2, "direct_webview"

    const-string v3, "DIRECT_WEBVIEW"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->DIRECT_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/4 v1, 0x2

    const-string v2, "finicity_connect_v2_fix"

    const-string v3, "FINICITY_CONNECT_V2_FIX"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->FINICITY_CONNECT_V2_FIX:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/4 v1, 0x3

    const-string v2, "finicity_connect_v2_lite"

    const-string v3, "FINICITY_CONNECT_V2_LITE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->FINICITY_CONNECT_V2_LITE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/4 v1, 0x4

    const-string v2, "finicity_connect_v2_oauth"

    const-string v3, "FINICITY_CONNECT_V2_OAUTH"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->FINICITY_CONNECT_V2_OAUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/4 v1, 0x5

    const-string v2, "finicity_connect_v2_oauth_redirect"

    const-string v3, "FINICITY_CONNECT_V2_OAUTH_REDIRECT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->FINICITY_CONNECT_V2_OAUTH_REDIRECT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/4 v1, 0x6

    const-string v2, "finicity_connect_v2_oauth_webview"

    const-string v3, "FINICITY_CONNECT_V2_OAUTH_WEBVIEW"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->FINICITY_CONNECT_V2_OAUTH_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/4 v1, 0x7

    const-string v2, "mx_connect"

    const-string v3, "MX_CONNECT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->MX_CONNECT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/16 v1, 0x8

    const-string v2, "mx_oauth"

    const-string v3, "MX_OAUTH"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->MX_OAUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/16 v1, 0x9

    const-string v2, "mx_oauth_app_to_app"

    const-string v3, "MX_OAUTH_APP2APP"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->MX_OAUTH_APP2APP:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/16 v1, 0xa

    const-string v2, "mx_oauth_redirect"

    const-string v3, "MX_OAUTH_REDIRECT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->MX_OAUTH_REDIRECT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/16 v1, 0xb

    const-string v2, "mx_oauth_webview"

    const-string v3, "MX_OAUTH_WEBVIEW"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->MX_OAUTH_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/16 v1, 0xc

    const-string v2, "testmode"

    const-string v3, "TESTMODE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->TESTMODE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/16 v1, 0xd

    const-string v2, "testmode_oauth"

    const-string v3, "TESTMODE_OAUTH"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->TESTMODE_OAUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/16 v1, 0xe

    const-string v2, "testmode_oauth_webview"

    const-string v3, "TESTMODE_OAUTH_WEBVIEW"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->TESTMODE_OAUTH_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/16 v1, 0xf

    const-string v2, "truelayer_oauth"

    const-string v3, "TRUELAYER_OAUTH"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->TRUELAYER_OAUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/16 v1, 0x10

    const-string v2, "truelayer_oauth_handoff"

    const-string v3, "TRUELAYER_OAUTH_HANDOFF"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->TRUELAYER_OAUTH_HANDOFF:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/16 v1, 0x11

    const-string v2, "truelayer_oauth_webview"

    const-string v3, "TRUELAYER_OAUTH_WEBVIEW"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->TRUELAYER_OAUTH_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/16 v1, 0x12

    const-string v2, "wells_fargo"

    const-string v3, "WELLS_FARGO"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->WELLS_FARGO:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/16 v1, 0x13

    const-string v2, "wells_fargo_webview"

    const-string v3, "WELLS_FARGO_WEBVIEW"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->WELLS_FARGO_WEBVIEW:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/16 v1, 0x14

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    invoke-static {}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->$values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->$VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Companion;

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Companion$$cachedSerializer$delegate$1;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Companion$$cachedSerializer$delegate$1;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->$cachedSerializer$delegate:Lkotlin/Lazy;

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

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->value:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->$VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;->value:Ljava/lang/String;

    return-object v0
.end method
