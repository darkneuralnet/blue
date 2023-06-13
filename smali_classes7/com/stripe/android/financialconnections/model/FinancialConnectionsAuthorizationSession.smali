.class public final Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$$serializer;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008%\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0081\u0008\u0018\u0000 U2\u00020\u0001:\u0003VUWBw\u0012\u0006\u0010\u0019\u001a\u00020\u000c\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008O\u0010PB\u0093\u0001\u0008\u0017\u0012\u0006\u0010Q\u001a\u00020&\u0012\n\u0008\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010 \u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0001\u0010\"\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010S\u001a\u0004\u0018\u00010R\u00a2\u0006\u0004\u0008O\u0010TJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c2\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u00c7\u0001J\t\u0010\r\u001a\u00020\u000cH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0004J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0004J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0004J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u0084\u0001\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u000e2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\t\u0010%\u001a\u00020\u000cH\u00d6\u0001J\t\u0010\'\u001a\u00020&H\u00d6\u0001J\u0013\u0010*\u001a\u00020\u00022\u0008\u0010)\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010+\u001a\u00020&H\u00d6\u0001J\u0019\u0010/\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020&H\u00d6\u0001R \u0010\u0019\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0019\u00100\u0012\u0004\u00083\u00104\u001a\u0004\u00081\u00102R \u0010\u001a\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001a\u00105\u0012\u0004\u00088\u00104\u001a\u0004\u00086\u00107R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001b\u00109\u0012\u0004\u0008<\u00104\u001a\u0004\u0008:\u0010;R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010=\u0012\u0004\u0008?\u00104\u001a\u0004\u0008>\u0010\u0004R\"\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010=\u0012\u0004\u0008A\u00104\u001a\u0004\u0008@\u0010\u0004R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010=\u0012\u0004\u0008C\u00104\u001a\u0004\u0008B\u0010\u0004R\"\u0010\u001f\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001f\u00100\u0012\u0004\u0008E\u00104\u001a\u0004\u0008D\u00102R\"\u0010 \u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008 \u00100\u0012\u0004\u0008G\u00104\u001a\u0004\u0008F\u00102R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010=\u0012\u0004\u0008H\u00104R\"\u0010\"\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\"\u0010I\u0012\u0004\u0008L\u00104\u001a\u0004\u0008J\u0010KR\u0011\u0010M\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010N\u00a8\u0006X"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "Landroid/os/Parcelable;",
        "",
        "component9",
        "()Ljava/lang/Boolean;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "",
        "component1",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "component2",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "Lcom/stripe/android/financialconnections/domain/Display;",
        "component10",
        "id",
        "nextPane",
        "flow",
        "institutionSkipAccountSelection",
        "showPartnerDisclosure",
        "skipAccountSelection",
        "url",
        "urlQrCode",
        "_isOAuth",
        "display",
        "copy",
        "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "equals",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "writeToParcel",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "getId$annotations",
        "()V",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getNextPane",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getNextPane$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;",
        "getFlow",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;",
        "getFlow$annotations",
        "Ljava/lang/Boolean;",
        "getInstitutionSkipAccountSelection",
        "getInstitutionSkipAccountSelection$annotations",
        "getShowPartnerDisclosure",
        "getShowPartnerDisclosure$annotations",
        "getSkipAccountSelection",
        "getSkipAccountSelection$annotations",
        "getUrl",
        "getUrl$annotations",
        "getUrlQrCode",
        "getUrlQrCode$annotations",
        "get_isOAuth$annotations",
        "Lcom/stripe/android/financialconnections/domain/Display;",
        "getDisplay",
        "()Lcom/stripe/android/financialconnections/domain/Display;",
        "getDisplay$annotations",
        "isOAuth",
        "()Z",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;Lbt5;)V",
        "Companion",
        "$serializer",
        "Flow",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;


# instance fields
.field private final _isOAuth:Ljava/lang/Boolean;

.field private final display:Lcom/stripe/android/financialconnections/domain/Display;

.field private final flow:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

.field private final id:Ljava/lang/String;

.field private final institutionSkipAccountSelection:Ljava/lang/Boolean;

.field private final nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

.field private final showPartnerDisclosure:Ljava/lang/Boolean;

.field private final skipAccountSelection:Ljava/lang/Boolean;

.field private final url:Ljava/lang/String;

.field private final urlQrCode:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;Lbt5;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "id"
        .end annotation
    .end param
    .param p3    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
        .annotation runtime LVs5;
            value = "next_pane"
        .end annotation
    .end param
    .param p4    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
        .annotation runtime LVs5;
            value = "flow"
        .end annotation
    .end param
    .param p5    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "institution_skip_account_selection"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "show_partner_disclosure"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "skip_account_selection"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "url"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "url_qr_code"
        .end annotation
    .end param
    .param p10    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "is_oauth"
        .end annotation
    .end param
    .param p11    # Lcom/stripe/android/financialconnections/domain/Display;
        .annotation runtime LVs5;
            value = "display"
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "This synthesized declaration should not be used directly"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = ""
            imports = {}
        .end subannotation
    .end annotation

    and-int/lit8 p12, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p12, :cond_0

    sget-object p12, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$$serializer;

    invoke-virtual {p12}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$$serializer;->getDescriptor()LMs5;

    move-result-object p12

    invoke-static {p1, v0, p12}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->flow:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->flow:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->institutionSkipAccountSelection:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->institutionSkipAccountSelection:Ljava/lang/Boolean;

    :goto_1
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->showPartnerDisclosure:Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->showPartnerDisclosure:Ljava/lang/Boolean;

    :goto_2
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->skipAccountSelection:Ljava/lang/Boolean;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->skipAccountSelection:Ljava/lang/Boolean;

    :goto_3
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->url:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->url:Ljava/lang/String;

    :goto_4
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->urlQrCode:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->urlQrCode:Ljava/lang/String;

    :goto_5
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_7

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->_isOAuth:Ljava/lang/Boolean;

    goto :goto_6

    :cond_7
    iput-object p10, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->_isOAuth:Ljava/lang/Boolean;

    :goto_6
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_8

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->display:Lcom/stripe/android/financialconnections/domain/Display;

    goto :goto_7

    :cond_8
    iput-object p11, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->display:Lcom/stripe/android/financialconnections/domain/Display;

    :goto_7
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextPane"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->id:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->flow:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->institutionSkipAccountSelection:Ljava/lang/Boolean;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->showPartnerDisclosure:Ljava/lang/Boolean;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->skipAccountSelection:Ljava/lang/Boolean;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->url:Ljava/lang/String;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->urlQrCode:Ljava/lang/String;

    iput-object p9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->_isOAuth:Ljava/lang/Boolean;

    iput-object p10, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->display:Lcom/stripe/android/financialconnections/domain/Display;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v10, v2

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v11, v2

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object v12, v1

    goto :goto_6

    :cond_6
    move-object/from16 v12, p9

    :goto_6
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_7

    move-object v13, v2

    goto :goto_7

    :cond_7
    move-object/from16 v13, p10

    :goto_7
    move-object v3, p0

    move-object v4, p1

    move-object/from16 v5, p2

    invoke-direct/range {v3 .. v13}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;)V

    return-void
.end method

.method private final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->_isOAuth:Ljava/lang/Boolean;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->flow:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->institutionSkipAccountSelection:Ljava/lang/Boolean;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->showPartnerDisclosure:Ljava/lang/Boolean;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->skipAccountSelection:Ljava/lang/Boolean;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->url:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->urlQrCode:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->_isOAuth:Ljava/lang/Boolean;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->display:Lcom/stripe/android/financialconnections/domain/Display;

    goto :goto_9

    :cond_9
    move-object/from16 v1, p10

    :goto_9
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->copy(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getDisplay$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "display"
    .end annotation

    return-void
.end method

.method public static synthetic getFlow$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "flow"
    .end annotation

    return-void
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "id"
    .end annotation

    return-void
.end method

.method public static synthetic getInstitutionSkipAccountSelection$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "institution_skip_account_selection"
    .end annotation

    return-void
.end method

.method public static synthetic getNextPane$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "next_pane"
    .end annotation

    return-void
.end method

.method public static synthetic getShowPartnerDisclosure$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "show_partner_disclosure"
    .end annotation

    return-void
.end method

.method public static synthetic getSkipAccountSelection$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "skip_account_selection"
    .end annotation

    return-void
.end method

.method public static synthetic getUrl$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "url"
    .end annotation

    return-void
.end method

.method public static synthetic getUrlQrCode$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "url_qr_code"
    .end annotation

    return-void
.end method

.method private static synthetic get_isOAuth$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "is_oauth"
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;LUt0;LMs5;)V
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->id:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, LUt0;->w(LMs5;ILjava/lang/String;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v0, v2}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    move v2, v3

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->flow:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_1
    if-eqz v2, :cond_2

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->flow:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_2
    move v2, v3

    goto :goto_3

    :cond_3
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->institutionSkipAccountSelection:Ljava/lang/Boolean;

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    move v2, v1

    :goto_3
    if-eqz v2, :cond_5

    sget-object v2, LYY;->a:LYY;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->institutionSkipAccountSelection:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_6

    :goto_4
    move v2, v3

    goto :goto_5

    :cond_6
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->showPartnerDisclosure:Ljava/lang/Boolean;

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    move v2, v1

    :goto_5
    if-eqz v2, :cond_8

    sget-object v2, LYY;->a:LYY;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->showPartnerDisclosure:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_8
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_9

    :goto_6
    move v2, v3

    goto :goto_7

    :cond_9
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->skipAccountSelection:Ljava/lang/Boolean;

    if-eqz v2, :cond_a

    goto :goto_6

    :cond_a
    move v2, v1

    :goto_7
    if-eqz v2, :cond_b

    sget-object v2, LYY;->a:LYY;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->skipAccountSelection:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_c

    :goto_8
    move v2, v3

    goto :goto_9

    :cond_c
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->url:Ljava/lang/String;

    if-eqz v2, :cond_d

    goto :goto_8

    :cond_d
    move v2, v1

    :goto_9
    if-eqz v2, :cond_e

    sget-object v2, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->url:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_e
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_f

    :goto_a
    move v2, v3

    goto :goto_b

    :cond_f
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->urlQrCode:Ljava/lang/String;

    if-eqz v2, :cond_10

    goto :goto_a

    :cond_10
    move v2, v1

    :goto_b
    if-eqz v2, :cond_11

    sget-object v2, LgS5;->a:LgS5;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->urlQrCode:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_11
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_12

    :goto_c
    move v2, v3

    goto :goto_d

    :cond_12
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->_isOAuth:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_c

    :cond_13
    move v2, v1

    :goto_d
    if-eqz v2, :cond_14

    sget-object v2, LYY;->a:LYY;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->_isOAuth:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v2, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_14
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v2

    if-eqz v2, :cond_15

    :goto_e
    move v1, v3

    goto :goto_f

    :cond_15
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->display:Lcom/stripe/android/financialconnections/domain/Display;

    if-eqz v2, :cond_16

    goto :goto_e

    :cond_16
    :goto_f
    if-eqz v1, :cond_17

    sget-object v1, Lcom/stripe/android/financialconnections/domain/Display$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/domain/Display$$serializer;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->display:Lcom/stripe/android/financialconnections/domain/Display;

    invoke-interface {p1, p2, v0, v1, p0}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_17
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lcom/stripe/android/financialconnections/domain/Display;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->display:Lcom/stripe/android/financialconnections/domain/Display;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->flow:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    return-object v0
.end method

.method public final component4()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->institutionSkipAccountSelection:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component5()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->showPartnerDisclosure:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->skipAccountSelection:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->urlQrCode:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;
    .locals 12

    const-string v0, "id"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextPane"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    move-object v1, v0

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/domain/Display;)V

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->flow:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->flow:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->institutionSkipAccountSelection:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->institutionSkipAccountSelection:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->showPartnerDisclosure:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->showPartnerDisclosure:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->skipAccountSelection:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->skipAccountSelection:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->urlQrCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->urlQrCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->_isOAuth:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->_isOAuth:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->display:Lcom/stripe/android/financialconnections/domain/Display;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->display:Lcom/stripe/android/financialconnections/domain/Display;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getDisplay()Lcom/stripe/android/financialconnections/domain/Display;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->display:Lcom/stripe/android/financialconnections/domain/Display;

    return-object v0
.end method

.method public final getFlow()Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->flow:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInstitutionSkipAccountSelection()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->institutionSkipAccountSelection:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final getShowPartnerDisclosure()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->showPartnerDisclosure:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getSkipAccountSelection()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->skipAccountSelection:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final getUrlQrCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->urlQrCode:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->flow:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->institutionSkipAccountSelection:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->showPartnerDisclosure:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->skipAccountSelection:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->url:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->urlQrCode:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->_isOAuth:Ljava/lang/Boolean;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->display:Lcom/stripe/android/financialconnections/domain/Display;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/domain/Display;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    return v0
.end method

.method public final isOAuth()Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->_isOAuth:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->flow:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->institutionSkipAccountSelection:Ljava/lang/Boolean;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->showPartnerDisclosure:Ljava/lang/Boolean;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->skipAccountSelection:Ljava/lang/Boolean;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->url:Ljava/lang/String;

    iget-object v7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->urlQrCode:Ljava/lang/String;

    iget-object v8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->_isOAuth:Ljava/lang/Boolean;

    iget-object v9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->display:Lcom/stripe/android/financialconnections/domain/Display;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "FinancialConnectionsAuthorizationSession(id="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", nextPane="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", flow="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", institutionSkipAccountSelection="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showPartnerDisclosure="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", skipAccountSelection="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", url="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", urlQrCode="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", _isOAuth="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", display="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->flow:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->institutionSkipAccountSelection:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->showPartnerDisclosure:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_2
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->skipAccountSelection:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_3
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->url:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->urlQrCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->_isOAuth:Ljava/lang/Boolean;

    if-nez v0, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_4
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;->display:Lcom/stripe/android/financialconnections/domain/Display;

    if-nez v0, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/domain/Display;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_5
    return-void
.end method
