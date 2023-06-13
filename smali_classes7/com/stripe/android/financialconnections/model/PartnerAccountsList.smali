.class public final Lcom/stripe/android/financialconnections/model/PartnerAccountsList;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/PartnerAccountsList$$serializer;,
        Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u00082\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u0000 H2\u00020\u0001:\u0002IHB]\u0012\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u001a\u001a\u00020\u000c\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008B\u0010CB\u007f\u0008\u0017\u0012\u0006\u0010D\u001a\u00020\u0012\u0012\u0010\u0008\u0001\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u000c\u0012\n\u0008\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\n\u0008\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010 \u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010F\u001a\u0004\u0018\u00010E\u00a2\u0006\u0004\u0008B\u0010GJ!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\u000f\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010\r\u001a\u00020\u000cH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0010H\u00c6\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0014Jn\u0010!\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00102\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\t\u0010#\u001a\u00020\u0010H\u00d6\u0001J\t\u0010$\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010&\u001a\u00020\u000c2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R&\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\'\u0012\u0004\u0008*\u0010+\u001a\u0004\u0008(\u0010)R \u0010\u001a\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010,\u0012\u0004\u0008/\u0010+\u001a\u0004\u0008-\u0010.R \u0010\u001b\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001b\u00100\u0012\u0004\u00083\u0010+\u001a\u0004\u00081\u00102R \u0010\u001c\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001c\u00104\u0012\u0004\u00087\u0010+\u001a\u0004\u00085\u00106R\"\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001d\u00108\u0012\u0004\u0008:\u0010+\u001a\u0004\u00089\u0010\u0014R\"\u0010\u001e\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010;\u0012\u0004\u0008=\u0010+\u001a\u0004\u0008<\u0010\u0016R\"\u0010\u001f\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010;\u0012\u0004\u0008?\u0010+\u001a\u0004\u0008>\u0010\u0016R\"\u0010 \u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008 \u00108\u0012\u0004\u0008A\u0010+\u001a\u0004\u0008@\u0010\u0014\u00a8\u0006J"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
        "",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "",
        "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
        "component1",
        "",
        "component2",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "component3",
        "",
        "component4",
        "",
        "component5",
        "()Ljava/lang/Integer;",
        "component6",
        "()Ljava/lang/Boolean;",
        "component7",
        "component8",
        "data",
        "hasMore",
        "nextPane",
        "url",
        "count",
        "repairAuthorizationEnabled",
        "skipAccountSelection",
        "totalCount",
        "copy",
        "(Ljava/util/List;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/model/PartnerAccountsList;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "Ljava/util/List;",
        "getData",
        "()Ljava/util/List;",
        "getData$annotations",
        "()V",
        "Z",
        "getHasMore",
        "()Z",
        "getHasMore$annotations",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getNextPane",
        "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
        "getNextPane$annotations",
        "Ljava/lang/String;",
        "getUrl",
        "()Ljava/lang/String;",
        "getUrl$annotations",
        "Ljava/lang/Integer;",
        "getCount",
        "getCount$annotations",
        "Ljava/lang/Boolean;",
        "getRepairAuthorizationEnabled",
        "getRepairAuthorizationEnabled$annotations",
        "getSkipAccountSelection",
        "getSkipAccountSelection$annotations",
        "getTotalCount",
        "getTotalCount$annotations",
        "<init>",
        "(Ljava/util/List;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILjava/util/List;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lbt5;)V",
        "Companion",
        "$serializer",
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
.field public static final Companion:Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;


# instance fields
.field private final count:Ljava/lang/Integer;

.field private final data:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;"
        }
    .end annotation
.end field

.field private final hasMore:Z

.field private final nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

.field private final repairAuthorizationEnabled:Ljava/lang/Boolean;

.field private final skipAccountSelection:Ljava/lang/Boolean;

.field private final totalCount:Ljava/lang/Integer;

.field private final url:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->Companion:Lcom/stripe/android/financialconnections/model/PartnerAccountsList$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lbt5;)V
    .locals 1
    .param p2    # Ljava/util/List;
        .annotation runtime LVs5;
            value = "data"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime LVs5;
            value = "has_more"
        .end annotation
    .end param
    .param p4    # Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
        .annotation runtime LVs5;
            value = "next_pane"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "url"
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation runtime LVs5;
            value = "count"
        .end annotation
    .end param
    .param p7    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "repair_authorization_enabled"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Boolean;
        .annotation runtime LVs5;
            value = "skip_account_selection"
        .end annotation
    .end param
    .param p9    # Ljava/lang/Integer;
        .annotation runtime LVs5;
            value = "total_count"
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

    and-int/lit8 p10, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p10, :cond_0

    sget-object p10, Lcom/stripe/android/financialconnections/model/PartnerAccountsList$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/PartnerAccountsList$$serializer;

    invoke-virtual {p10}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList$$serializer;->getDescriptor()LMs5;

    move-result-object p10

    invoke-static {p1, v0, p10}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->data:Ljava/util/List;

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->hasMore:Z

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->url:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->count:Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->count:Ljava/lang/Integer;

    :goto_0
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->repairAuthorizationEnabled:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->repairAuthorizationEnabled:Ljava/lang/Boolean;

    :goto_1
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->skipAccountSelection:Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->skipAccountSelection:Ljava/lang/Boolean;

    :goto_2
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->totalCount:Ljava/lang/Integer;

    goto :goto_3

    :cond_4
    iput-object p9, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->totalCount:Ljava/lang/Integer;

    :goto_3
    return-void
.end method

.method public constructor <init>(Ljava/util/List;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;Z",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextPane"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->data:Ljava/util/List;

    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->hasMore:Z

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->url:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->count:Ljava/lang/Integer;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->repairAuthorizationEnabled:Ljava/lang/Boolean;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->skipAccountSelection:Ljava/lang/Boolean;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->totalCount:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object/from16 v8, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    move-object v9, v2

    goto :goto_1

    :cond_1
    move-object/from16 v9, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    move-object v10, v2

    goto :goto_2

    :cond_2
    move-object/from16 v10, p7

    :goto_2
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_3

    move-object v11, v2

    goto :goto_3

    :cond_3
    move-object/from16 v11, p8

    :goto_3
    move-object v3, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v3 .. v11}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;-><init>(Ljava/util/List;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/PartnerAccountsList;Ljava/util/List;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/PartnerAccountsList;
    .locals 9

    move-object v0, p0

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->data:Ljava/util/List;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->hasMore:Z

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->url:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->count:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->repairAuthorizationEnabled:Ljava/lang/Boolean;

    goto :goto_5

    :cond_5
    move-object v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->skipAccountSelection:Ljava/lang/Boolean;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->totalCount:Ljava/lang/Integer;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p8

    :goto_7
    move-object p1, v2

    move p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object p5, v6

    move-object p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v1

    invoke-virtual/range {p0 .. p8}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->copy(Ljava/util/List;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getCount$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "count"
    .end annotation

    return-void
.end method

.method public static synthetic getData$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "data"
    .end annotation

    return-void
.end method

.method public static synthetic getHasMore$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "has_more"
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

.method public static synthetic getRepairAuthorizationEnabled$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "repair_authorization_enabled"
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

.method public static synthetic getTotalCount$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "total_count"
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

.method public static final write$Self(Lcom/stripe/android/financialconnections/model/PartnerAccountsList;LUt0;LMs5;)V
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lro;

    sget-object v1, Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/PartnerAccount$$serializer;

    invoke-direct {v0, v1}, Lro;-><init>(LKj2;)V

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->data:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->hasMore:Z

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1, v0}, LUt0;->v(LMs5;IZ)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane$Serializer;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    const/4 v4, 0x2

    invoke-interface {p1, p2, v4, v0, v3}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    const/4 v0, 0x3

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->url:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3}, LUt0;->w(LMs5;ILjava/lang/String;)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_0

    :goto_0
    move v3, v1

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->count:Ljava/lang/Integer;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_1
    if-eqz v3, :cond_2

    sget-object v3, LF52;->a:LF52;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->count:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_2
    move v3, v1

    goto :goto_3

    :cond_3
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->repairAuthorizationEnabled:Ljava/lang/Boolean;

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    move v3, v2

    :goto_3
    if-eqz v3, :cond_5

    sget-object v3, LYY;->a:LYY;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->repairAuthorizationEnabled:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_6

    :goto_4
    move v3, v1

    goto :goto_5

    :cond_6
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->skipAccountSelection:Ljava/lang/Boolean;

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    move v3, v2

    :goto_5
    if-eqz v3, :cond_8

    sget-object v3, LYY;->a:LYY;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->skipAccountSelection:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_8
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_9

    :goto_6
    move v2, v1

    goto :goto_7

    :cond_9
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->totalCount:Ljava/lang/Integer;

    if-eqz v3, :cond_a

    goto :goto_6

    :cond_a
    :goto_7
    if-eqz v2, :cond_b

    sget-object v1, LF52;->a:LF52;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->totalCount:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, p0}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->data:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->hasMore:Z

    return v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->count:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->repairAuthorizationEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->skipAccountSelection:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->totalCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/util/List;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/model/PartnerAccountsList;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;Z",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;"
        }
    .end annotation

    const-string v0, "data"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextPane"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    move-object v1, v0

    move v3, p2

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;-><init>(Ljava/util/List;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->data:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->data:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->hasMore:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->hasMore:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->count:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->count:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->repairAuthorizationEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->repairAuthorizationEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->skipAccountSelection:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->skipAccountSelection:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->totalCount:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->totalCount:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->count:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->data:Ljava/util/List;

    return-object v0
.end method

.method public final getHasMore()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->hasMore:Z

    return v0
.end method

.method public final getNextPane()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    return-object v0
.end method

.method public final getRepairAuthorizationEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->repairAuthorizationEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getSkipAccountSelection()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->skipAccountSelection:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getTotalCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->totalCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->data:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->hasMore:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->url:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->count:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->repairAuthorizationEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->skipAccountSelection:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->totalCount:Ljava/lang/Integer;

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->data:Ljava/util/List;

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->hasMore:Z

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->nextPane:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->url:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->count:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->repairAuthorizationEnabled:Ljava/lang/Boolean;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->skipAccountSelection:Ljava/lang/Boolean;

    iget-object v7, p0, Lcom/stripe/android/financialconnections/model/PartnerAccountsList;->totalCount:Ljava/lang/Integer;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "PartnerAccountsList(data="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hasMore="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", nextPane="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", url="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", count="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", repairAuthorizationEnabled="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", skipAccountSelection="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", totalCount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
