.class public final Lcom/stripe/android/financialconnections/model/ConsentPane;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/ConsentPane$$serializer;,
        Lcom/stripe/android/financialconnections/model/ConsentPane$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u0000 E2\u00020\u0001:\u0002FEBC\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0016\u001a\u00020\u000c\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\t\u00a2\u0006\u0004\u0008?\u0010@Bo\u0008\u0017\u0012\u0006\u0010A\u001a\u00020\u001d\u0012\n\u0008\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0001\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010C\u001a\u0004\u0018\u00010B\u00a2\u0006\u0004\u0008?\u0010DJ!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\r\u001a\u00020\u000cH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u000fH\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0011H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\tH\u00c6\u0003JQ\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0014\u001a\u00020\t2\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u001a\u001a\u00020\tH\u00c6\u0001J\t\u0010\u001c\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010\"\u001a\u00020!2\u0008\u0010 \u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010#\u001a\u00020\u001dH\u00d6\u0001J\u0019\u0010\'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001dH\u00d6\u0001R \u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010(\u0012\u0004\u0008+\u0010,\u001a\u0004\u0008)\u0010*R\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010(\u0012\u0004\u0008.\u0010,\u001a\u0004\u0008-\u0010*R \u0010\u0016\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010/\u0012\u0004\u00082\u0010,\u001a\u0004\u00080\u00101R \u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010(\u0012\u0004\u00084\u0010,\u001a\u0004\u00083\u0010*R \u0010\u0018\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0018\u00105\u0012\u0004\u00088\u0010,\u001a\u0004\u00086\u00107R \u0010\u0019\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0019\u00109\u0012\u0004\u0008<\u0010,\u001a\u0004\u0008:\u0010;R \u0010\u001a\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010(\u0012\u0004\u0008>\u0010,\u001a\u0004\u0008=\u0010*\u00a8\u0006G"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/ConsentPane;",
        "Landroid/os/Parcelable;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "",
        "component1",
        "component2",
        "Lcom/stripe/android/financialconnections/model/ConsentPaneBody;",
        "component3",
        "component4",
        "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "component5",
        "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;",
        "component6",
        "component7",
        "aboveCta",
        "belowCta",
        "body",
        "cta",
        "dataAccessNotice",
        "legalDetailsNotice",
        "title",
        "copy",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "writeToParcel",
        "Ljava/lang/String;",
        "getAboveCta",
        "()Ljava/lang/String;",
        "getAboveCta$annotations",
        "()V",
        "getBelowCta",
        "getBelowCta$annotations",
        "Lcom/stripe/android/financialconnections/model/ConsentPaneBody;",
        "getBody",
        "()Lcom/stripe/android/financialconnections/model/ConsentPaneBody;",
        "getBody$annotations",
        "getCta",
        "getCta$annotations",
        "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "getDataAccessNotice",
        "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "getDataAccessNotice$annotations",
        "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;",
        "getLegalDetailsNotice",
        "()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;",
        "getLegalDetailsNotice$annotations",
        "getTitle",
        "getTitle$annotations",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;Lbt5;)V",
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/ConsentPane;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/ConsentPane$Companion;


# instance fields
.field private final aboveCta:Ljava/lang/String;

.field private final belowCta:Ljava/lang/String;

.field private final body:Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

.field private final cta:Ljava/lang/String;

.field private final dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

.field private final legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

.field private final title:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/ConsentPane$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/ConsentPane$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/ConsentPane;->Companion:Lcom/stripe/android/financialconnections/model/ConsentPane$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/ConsentPane$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/ConsentPane$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/ConsentPane;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;Lbt5;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "above_cta"
        .end annotation

        .annotation runtime LWs5;
            with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "below_cta"
        .end annotation

        .annotation runtime LWs5;
            with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
        .end annotation
    .end param
    .param p4    # Lcom/stripe/android/financialconnections/model/ConsentPaneBody;
        .annotation runtime LVs5;
            value = "body"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "cta"
        .end annotation

        .annotation runtime LWs5;
            with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
        .end annotation
    .end param
    .param p6    # Lcom/stripe/android/financialconnections/model/DataAccessNotice;
        .annotation runtime LVs5;
            value = "data_access_notice"
        .end annotation
    .end param
    .param p7    # Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;
        .annotation runtime LVs5;
            value = "legal_details_notice"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "title"
        .end annotation

        .annotation runtime LWs5;
            with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
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

    and-int/lit8 p9, p1, 0x7d

    const/16 v0, 0x7d

    if-eq v0, p9, :cond_0

    sget-object p9, Lcom/stripe/android/financialconnections/model/ConsentPane$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ConsentPane$$serializer;

    invoke-virtual {p9}, Lcom/stripe/android/financialconnections/model/ConsentPane$$serializer;->getDescriptor()LMs5;

    move-result-object p9

    invoke-static {p1, v0, p9}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->aboveCta:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->belowCta:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->belowCta:Ljava/lang/String;

    :goto_0
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->body:Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->cta:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->title:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;)V
    .locals 1

    const-string v0, "aboveCta"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataAccessNotice"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "legalDetailsNotice"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->aboveCta:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->belowCta:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->body:Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->cta:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->title:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/financialconnections/model/ConsentPane;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/ConsentPane;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->aboveCta:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->belowCta:Ljava/lang/String;

    :cond_1
    move-object p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->body:Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->cta:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    :cond_5
    move-object v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-object p7, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->title:Ljava/lang/String;

    :cond_6
    move-object v4, p7

    move-object p2, p0

    move-object p3, p1

    move-object p4, p9

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    move-object p9, v4

    invoke-virtual/range {p2 .. p9}, Lcom/stripe/android/financialconnections/model/ConsentPane;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAboveCta$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "above_cta"
    .end annotation

    .annotation runtime LWs5;
        with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getBelowCta$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "below_cta"
    .end annotation

    .annotation runtime LWs5;
        with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getBody$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "body"
    .end annotation

    return-void
.end method

.method public static synthetic getCta$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "cta"
    .end annotation

    .annotation runtime LWs5;
        with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getDataAccessNotice$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "data_access_notice"
    .end annotation

    return-void
.end method

.method public static synthetic getLegalDetailsNotice$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "legal_details_notice"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "title"
    .end annotation

    .annotation runtime LWs5;
        with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/financialconnections/model/ConsentPane;LUt0;LMs5;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->aboveCta:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_0

    :goto_0
    move v2, v1

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->belowCta:Ljava/lang/String;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->belowCta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    sget-object v1, Lcom/stripe/android/financialconnections/model/ConsentPaneBody$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ConsentPaneBody$$serializer;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->body:Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->cta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v2}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    sget-object v1, Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    sget-object v1, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice$$serializer;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->aboveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->belowCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/model/ConsentPaneBody;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->body:Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-object v0
.end method

.method public final component6()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/ConsentPane;
    .locals 9

    const-string v0, "aboveCta"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataAccessNotice"

    move-object v6, p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "legalDetailsNotice"

    move-object v7, p6

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/ConsentPane;

    move-object v1, v0

    move-object v3, p2

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/financialconnections/model/ConsentPane;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/ConsentPaneBody;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/ConsentPane;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/ConsentPane;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->aboveCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/ConsentPane;->aboveCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->belowCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/ConsentPane;->belowCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->body:Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/ConsentPane;->body:Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->cta:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/ConsentPane;->cta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/ConsentPane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/ConsentPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->title:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/ConsentPane;->title:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAboveCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->aboveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getBelowCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->belowCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getBody()Lcom/stripe/android/financialconnections/model/ConsentPaneBody;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->body:Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    return-object v0
.end method

.method public final getCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final getDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-object v0
.end method

.method public final getLegalDetailsNotice()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->aboveCta:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->belowCta:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->body:Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/ConsentPaneBody;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->cta:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->aboveCta:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->belowCta:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->body:Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->cta:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->title:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "ConsentPane(aboveCta="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", belowCta="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", body="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cta="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", dataAccessNotice="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", legalDetailsNotice="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->aboveCta:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->belowCta:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->body:Lcom/stripe/android/financialconnections/model/ConsentPaneBody;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/ConsentPaneBody;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->cta:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/ConsentPane;->title:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
