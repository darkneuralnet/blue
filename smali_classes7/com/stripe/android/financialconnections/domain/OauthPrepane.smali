.class public final Lcom/stripe/android/financialconnections/domain/OauthPrepane;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/domain/OauthPrepane$$serializer;,
        Lcom/stripe/android/financialconnections/domain/OauthPrepane$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001f\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u0000 G2\u00020\u0001:\u0002HGBC\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u00a2\u0006\u0004\u0008A\u0010BBc\u0008\u0017\u0012\u0006\u0010C\u001a\u00020\u001d\u0012\n\u0008\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0001\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010E\u001a\u0004\u0018\u00010D\u00a2\u0006\u0004\u0008A\u0010FJ!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0013H\u00c6\u0003JK\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0015\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000b2\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0013H\u00c6\u0001J\t\u0010\u001c\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010\"\u001a\u00020!2\u0008\u0010 \u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010#\u001a\u00020\u001dH\u00d6\u0001J\u0019\u0010\'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001dH\u00d6\u0001R \u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010(\u0012\u0004\u0008+\u0010,\u001a\u0004\u0008)\u0010*R \u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010-\u0012\u0004\u00080\u0010,\u001a\u0004\u0008.\u0010/R\"\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0017\u00101\u0012\u0004\u00084\u0010,\u001a\u0004\u00082\u00103R\"\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0018\u00105\u0012\u0004\u00088\u0010,\u001a\u0004\u00086\u00107R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0019\u00109\u0012\u0004\u0008<\u0010,\u001a\u0004\u0008:\u0010;R \u0010\u001a\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010=\u0012\u0004\u0008@\u0010,\u001a\u0004\u0008>\u0010?\u00a8\u0006I"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/OauthPrepane;",
        "Landroid/os/Parcelable;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "Lcom/stripe/android/financialconnections/domain/Body;",
        "component1",
        "Lcom/stripe/android/financialconnections/domain/Cta;",
        "component2",
        "Lcom/stripe/android/financialconnections/model/Image;",
        "component3",
        "Lcom/stripe/android/financialconnections/domain/PartnerNotice;",
        "component4",
        "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "component5",
        "",
        "component6",
        "body",
        "cta",
        "institutionIcon",
        "partnerNotice",
        "dataAccessNotice",
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
        "Lcom/stripe/android/financialconnections/domain/Body;",
        "getBody",
        "()Lcom/stripe/android/financialconnections/domain/Body;",
        "getBody$annotations",
        "()V",
        "Lcom/stripe/android/financialconnections/domain/Cta;",
        "getCta",
        "()Lcom/stripe/android/financialconnections/domain/Cta;",
        "getCta$annotations",
        "Lcom/stripe/android/financialconnections/model/Image;",
        "getInstitutionIcon",
        "()Lcom/stripe/android/financialconnections/model/Image;",
        "getInstitutionIcon$annotations",
        "Lcom/stripe/android/financialconnections/domain/PartnerNotice;",
        "getPartnerNotice",
        "()Lcom/stripe/android/financialconnections/domain/PartnerNotice;",
        "getPartnerNotice$annotations",
        "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "getDataAccessNotice",
        "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "getDataAccessNotice$annotations",
        "Ljava/lang/String;",
        "getTitle",
        "()Ljava/lang/String;",
        "getTitle$annotations",
        "<init>",
        "(Lcom/stripe/android/financialconnections/domain/Body;Lcom/stripe/android/financialconnections/domain/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILcom/stripe/android/financialconnections/domain/Body;Lcom/stripe/android/financialconnections/domain/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lbt5;)V",
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
            "Lcom/stripe/android/financialconnections/domain/OauthPrepane;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/domain/OauthPrepane$Companion;


# instance fields
.field private final body:Lcom/stripe/android/financialconnections/domain/Body;

.field private final cta:Lcom/stripe/android/financialconnections/domain/Cta;

.field private final dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

.field private final institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

.field private final partnerNotice:Lcom/stripe/android/financialconnections/domain/PartnerNotice;

.field private final title:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/domain/OauthPrepane$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/domain/OauthPrepane$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->Companion:Lcom/stripe/android/financialconnections/domain/OauthPrepane$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/domain/OauthPrepane$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/domain/OauthPrepane$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/financialconnections/domain/Body;Lcom/stripe/android/financialconnections/domain/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Lbt5;)V
    .locals 1
    .param p2    # Lcom/stripe/android/financialconnections/domain/Body;
        .annotation runtime LVs5;
            value = "body"
        .end annotation
    .end param
    .param p3    # Lcom/stripe/android/financialconnections/domain/Cta;
        .annotation runtime LVs5;
            value = "cta"
        .end annotation
    .end param
    .param p4    # Lcom/stripe/android/financialconnections/model/Image;
        .annotation runtime LVs5;
            value = "institution_icon"
        .end annotation
    .end param
    .param p5    # Lcom/stripe/android/financialconnections/domain/PartnerNotice;
        .annotation runtime LVs5;
            value = "partner_notice"
        .end annotation
    .end param
    .param p6    # Lcom/stripe/android/financialconnections/model/DataAccessNotice;
        .annotation runtime LVs5;
            value = "data_access_notice"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
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

    and-int/lit8 p8, p1, 0x23

    const/16 v0, 0x23

    if-eq v0, p8, :cond_0

    sget-object p8, Lcom/stripe/android/financialconnections/domain/OauthPrepane$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/domain/OauthPrepane$$serializer;

    invoke-virtual {p8}, Lcom/stripe/android/financialconnections/domain/OauthPrepane$$serializer;->getDescriptor()LMs5;

    move-result-object p8

    invoke-static {p1, v0, p8}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->body:Lcom/stripe/android/financialconnections/domain/Body;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/domain/Cta;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    :goto_1
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    :goto_2
    iput-object p7, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->title:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/domain/Body;Lcom/stripe/android/financialconnections/domain/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;)V
    .locals 1

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->body:Lcom/stripe/android/financialconnections/domain/Body;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/domain/Cta;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->title:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/domain/Body;Lcom/stripe/android/financialconnections/domain/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p7, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, p3

    :goto_0
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object v6, p4

    :goto_1
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_2

    move-object v7, v1

    goto :goto_2

    :cond_2
    move-object v7, p5

    :goto_2
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v8, p6

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/financialconnections/domain/OauthPrepane;-><init>(Lcom/stripe/android/financialconnections/domain/Body;Lcom/stripe/android/financialconnections/domain/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/domain/OauthPrepane;Lcom/stripe/android/financialconnections/domain/Body;Lcom/stripe/android/financialconnections/domain/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/domain/OauthPrepane;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->body:Lcom/stripe/android/financialconnections/domain/Body;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/domain/Cta;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->title:Ljava/lang/String;

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->copy(Lcom/stripe/android/financialconnections/domain/Body;Lcom/stripe/android/financialconnections/domain/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;)Lcom/stripe/android/financialconnections/domain/OauthPrepane;

    move-result-object p0

    return-object p0
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

    return-void
.end method

.method public static synthetic getDataAccessNotice$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "data_access_notice"
    .end annotation

    return-void
.end method

.method public static synthetic getInstitutionIcon$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "institution_icon"
    .end annotation

    return-void
.end method

.method public static synthetic getPartnerNotice$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "partner_notice"
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

.method public static final write$Self(Lcom/stripe/android/financialconnections/domain/OauthPrepane;LUt0;LMs5;)V
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/financialconnections/domain/Body$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/domain/Body$$serializer;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->body:Lcom/stripe/android/financialconnections/domain/Body;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    sget-object v0, Lcom/stripe/android/financialconnections/domain/Cta$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/domain/Cta$$serializer;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/domain/Cta;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v0, v1}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    move v1, v3

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_1
    if-eqz v1, :cond_2

    sget-object v1, Lcom/stripe/android/financialconnections/model/Image$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Image$$serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    invoke-interface {p1, p2, v0, v1, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_2
    move v1, v3

    goto :goto_3

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    move v1, v2

    :goto_3
    if-eqz v1, :cond_5

    sget-object v1, Lcom/stripe/android/financialconnections/domain/PartnerNotice$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/domain/PartnerNotice$$serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    invoke-interface {p1, p2, v0, v1, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_4
    move v2, v3

    goto :goto_5

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_5
    if-eqz v2, :cond_8

    sget-object v1, Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    invoke-interface {p1, p2, v0, v1, v2}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_8
    sget-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->title:Ljava/lang/String;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/domain/Body;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->body:Lcom/stripe/android/financialconnections/domain/Body;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/domain/Cta;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/domain/Cta;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/model/Image;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/domain/PartnerNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/domain/Body;Lcom/stripe/android/financialconnections/domain/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;)Lcom/stripe/android/financialconnections/domain/OauthPrepane;
    .locals 8

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/financialconnections/domain/OauthPrepane;-><init>(Lcom/stripe/android/financialconnections/domain/Body;Lcom/stripe/android/financialconnections/domain/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/domain/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/domain/OauthPrepane;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/domain/OauthPrepane;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->body:Lcom/stripe/android/financialconnections/domain/Body;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->body:Lcom/stripe/android/financialconnections/domain/Body;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/domain/Cta;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/domain/Cta;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->title:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->title:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getBody()Lcom/stripe/android/financialconnections/domain/Body;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->body:Lcom/stripe/android/financialconnections/domain/Body;

    return-object v0
.end method

.method public final getCta()Lcom/stripe/android/financialconnections/domain/Cta;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/domain/Cta;

    return-object v0
.end method

.method public final getDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-object v0
.end method

.method public final getInstitutionIcon()Lcom/stripe/android/financialconnections/model/Image;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    return-object v0
.end method

.method public final getPartnerNotice()Lcom/stripe/android/financialconnections/domain/PartnerNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->body:Lcom/stripe/android/financialconnections/domain/Body;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/domain/Body;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/domain/Cta;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/domain/Cta;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/Image;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/domain/PartnerNotice;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->body:Lcom/stripe/android/financialconnections/domain/Body;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/domain/Cta;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->title:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "OauthPrepane(body="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cta="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", institutionIcon="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", partnerNotice="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dataAccessNotice="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->body:Lcom/stripe/android/financialconnections/domain/Body;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/domain/Body;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/domain/Cta;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/domain/Cta;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/Image;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/domain/PartnerNotice;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/domain/PartnerNotice;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object p2, p0, Lcom/stripe/android/financialconnections/domain/OauthPrepane;->title:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
