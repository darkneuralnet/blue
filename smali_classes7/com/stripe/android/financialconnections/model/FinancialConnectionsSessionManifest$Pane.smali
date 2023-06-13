.class public final enum Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
    with = Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Pane"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Companion;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0016\u0008\u0087\u0001\u0018\u0000 \u00172\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0017\u0018B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "",
        "value",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "ACCOUNT_PICKER",
        "ATTACH_LINKED_PAYMENT_ACCOUNT",
        "AUTH_OPTIONS",
        "CONSENT",
        "INSTITUTION_PICKER",
        "LINK_CONSENT",
        "LINK_LOGIN",
        "MANUAL_ENTRY",
        "MANUAL_ENTRY_SUCCESS",
        "NETWORKING_LINK_LOGIN_WARMUP",
        "NETWORKING_LINK_SIGNUP_PANE",
        "NETWORKING_LINK_VERIFICATION",
        "PARTNER_AUTH",
        "SUCCESS",
        "UNEXPECTED_ERROR",
        "RESET",
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

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

.field public static final enum ACCOUNT_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "account_picker"
    .end annotation
.end field

.field public static final enum ATTACH_LINKED_PAYMENT_ACCOUNT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "attach_linked_payment_account"
    .end annotation
.end field

.field public static final enum AUTH_OPTIONS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "auth_options"
    .end annotation
.end field

.field public static final enum CONSENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "consent"
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Companion;

.field public static final enum INSTITUTION_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "institution_picker"
    .end annotation
.end field

.field public static final enum LINK_CONSENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "link_consent"
    .end annotation
.end field

.field public static final enum LINK_LOGIN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "link_login"
    .end annotation
.end field

.field public static final enum MANUAL_ENTRY:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "manual_entry"
    .end annotation
.end field

.field public static final enum MANUAL_ENTRY_SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "manual_entry_success"
    .end annotation
.end field

.field public static final enum NETWORKING_LINK_LOGIN_WARMUP:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "networking_link_login_warmup"
    .end annotation
.end field

.field public static final enum NETWORKING_LINK_SIGNUP_PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "networking_link_signup_pane"
    .end annotation
.end field

.field public static final enum NETWORKING_LINK_VERIFICATION:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "networking_link_verification"
    .end annotation
.end field

.field public static final enum PARTNER_AUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "partner_auth"
    .end annotation
.end field

.field public static final enum RESET:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "reset"
    .end annotation
.end field

.field public static final enum SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "success"
    .end annotation
.end field

.field public static final enum UNEXPECTED_ERROR:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .annotation runtime LVs5;
        value = "unexpected_error"
    .end annotation
.end field


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 3

    const/16 v0, 0x10

    new-array v0, v0, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ACCOUNT_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ATTACH_LINKED_PAYMENT_ACCOUNT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->AUTH_OPTIONS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->CONSENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->INSTITUTION_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->LINK_CONSENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->LINK_LOGIN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->MANUAL_ENTRY:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->MANUAL_ENTRY_SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_LOGIN_WARMUP:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_SIGNUP_PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_VERIFICATION:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->PARTNER_AUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->UNEXPECTED_ERROR:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->RESET:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v1, 0x0

    const-string v2, "account_picker"

    const-string v3, "ACCOUNT_PICKER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ACCOUNT_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v1, 0x1

    const-string v2, "attach_linked_payment_account"

    const-string v3, "ATTACH_LINKED_PAYMENT_ACCOUNT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->ATTACH_LINKED_PAYMENT_ACCOUNT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v1, 0x2

    const-string v2, "auth_options"

    const-string v3, "AUTH_OPTIONS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->AUTH_OPTIONS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v1, 0x3

    const-string v2, "consent"

    const-string v3, "CONSENT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->CONSENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v1, 0x4

    const-string v2, "institution_picker"

    const-string v3, "INSTITUTION_PICKER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->INSTITUTION_PICKER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v1, 0x5

    const-string v2, "link_consent"

    const-string v3, "LINK_CONSENT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->LINK_CONSENT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v1, 0x6

    const-string v2, "link_login"

    const-string v3, "LINK_LOGIN"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->LINK_LOGIN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v1, 0x7

    const-string v2, "manual_entry"

    const-string v3, "MANUAL_ENTRY"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->MANUAL_ENTRY:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/16 v1, 0x8

    const-string v2, "manual_entry_success"

    const-string v3, "MANUAL_ENTRY_SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->MANUAL_ENTRY_SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/16 v1, 0x9

    const-string v2, "networking_link_login_warmup"

    const-string v3, "NETWORKING_LINK_LOGIN_WARMUP"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_LOGIN_WARMUP:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/16 v1, 0xa

    const-string v2, "networking_link_signup_pane"

    const-string v3, "NETWORKING_LINK_SIGNUP_PANE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_SIGNUP_PANE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/16 v1, 0xb

    const-string v2, "networking_link_verification"

    const-string v3, "NETWORKING_LINK_VERIFICATION"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->NETWORKING_LINK_VERIFICATION:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/16 v1, 0xc

    const-string v2, "partner_auth"

    const-string v3, "PARTNER_AUTH"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->PARTNER_AUTH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/16 v1, 0xd

    const-string v2, "success"

    const-string v3, "SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->SUCCESS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/16 v1, 0xe

    const-string v2, "unexpected_error"

    const-string v3, "UNEXPECTED_ERROR"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->UNEXPECTED_ERROR:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/16 v1, 0xf

    const-string v2, "reset"

    const-string v3, "RESET"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->RESET:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-static {}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->$values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->$VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Companion;

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Companion$$cachedSerializer$delegate$1;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Companion$$cachedSerializer$delegate$1;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->$cachedSerializer$delegate:Lkotlin/Lazy;

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

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->value:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->$VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;->value:Ljava/lang/String;

    return-object v0
.end method
