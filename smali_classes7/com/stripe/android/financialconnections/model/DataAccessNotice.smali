.class public final Lcom/stripe/android/financialconnections/model/DataAccessNotice;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;,
        Lcom/stripe/android/financialconnections/model/DataAccessNotice$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u0000 ;2\u00020\u0001:\u0002<;B?\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u00085\u00106Bc\u0008\u0017\u0012\u0006\u00107\u001a\u00020\u0019\u0012\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u00109\u001a\u0004\u0018\u000108\u00a2\u0006\u0004\u00085\u0010:J!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JI\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0011\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000b2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u000b2\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0019H\u00d6\u0001J\u0019\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0019H\u00d6\u0001R \u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010$\u0012\u0004\u0008\'\u0010(\u001a\u0004\u0008%\u0010&R \u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010)\u0012\u0004\u0008,\u0010(\u001a\u0004\u0008*\u0010+R\"\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010)\u0012\u0004\u0008.\u0010(\u001a\u0004\u0008-\u0010+R \u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010)\u0012\u0004\u00080\u0010(\u001a\u0004\u0008/\u0010+R \u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010)\u0012\u0004\u00082\u0010(\u001a\u0004\u00081\u0010+R\"\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010)\u0012\u0004\u00084\u0010(\u001a\u0004\u00083\u0010+\u00a8\u0006="
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "Landroid/os/Parcelable;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;",
        "component1",
        "",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "body",
        "title",
        "subtitle",
        "cta",
        "learnMore",
        "connectedAccountNotice",
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
        "Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;",
        "getBody",
        "()Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;",
        "getBody$annotations",
        "()V",
        "Ljava/lang/String;",
        "getTitle",
        "()Ljava/lang/String;",
        "getTitle$annotations",
        "getSubtitle",
        "getSubtitle$annotations",
        "getCta",
        "getCta$annotations",
        "getLearnMore",
        "getLearnMore$annotations",
        "getConnectedAccountNotice",
        "getConnectedAccountNotice$annotations",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbt5;)V",
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
            "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/DataAccessNotice$Companion;


# instance fields
.field private final body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

.field private final connectedAccountNotice:Ljava/lang/String;

.field private final cta:Ljava/lang/String;

.field private final learnMore:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/DataAccessNotice$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/DataAccessNotice$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->Companion:Lcom/stripe/android/financialconnections/model/DataAccessNotice$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/DataAccessNotice$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/DataAccessNotice$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbt5;)V
    .locals 1
    .param p2    # Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;
        .annotation runtime LVs5;
            value = "body"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "title"
        .end annotation

        .annotation runtime LWs5;
            with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "subtitle"
        .end annotation

        .annotation runtime LWs5;
            with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
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
    .param p6    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "learn_more"
        .end annotation

        .annotation runtime LWs5;
            with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "connected_account_notice"
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

    and-int/lit8 p8, p1, 0x1b

    const/16 v0, 0x1b

    if-eq v0, p8, :cond_0

    sget-object p8, Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;

    invoke-virtual {p8}, Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;->getDescriptor()LMs5;

    move-result-object p8

    invoke-static {p1, v0, p8}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    :goto_0
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->learnMore:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_2

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Ljava/lang/String;

    :goto_1
    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "learnMore"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->learnMore:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p7, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, p3

    :goto_0
    and-int/lit8 v0, p7, 0x20

    if-eqz v0, :cond_1

    move-object v8, v1

    goto :goto_1

    :cond_1
    move-object v8, p6

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;-><init>(Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    :cond_1
    move-object p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->learnMore:Ljava/lang/String;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Ljava/lang/String;

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->copy(Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/DataAccessNotice;

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

.method public static synthetic getConnectedAccountNotice$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "connected_account_notice"
    .end annotation

    .annotation runtime LWs5;
        with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
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

.method public static synthetic getLearnMore$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "learn_more"
    .end annotation

    .annotation runtime LWs5;
        with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getSubtitle$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "subtitle"
    .end annotation

    .annotation runtime LWs5;
        with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
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

.method public static final write$Self(Lcom/stripe/android/financialconnections/model/DataAccessNotice;LUt0;LMs5;)V
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody$$serializer;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v0, v1}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v4

    if-eqz v4, :cond_0

    :goto_0
    move v4, v3

    goto :goto_1

    :cond_0
    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    move v4, v2

    :goto_1
    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    const/4 v1, 0x3

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v4}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->learnMore:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, v4}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v4

    if-eqz v4, :cond_3

    :goto_2
    move v2, v3

    goto :goto_3

    :cond_3
    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Ljava/lang/String;

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    :goto_3
    if-eqz v2, :cond_5

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v0, p0}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->learnMore:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 8

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "learnMore"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;-><init>(Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->learnMore:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->learnMore:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getBody()Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    return-object v0
.end method

.method public final getConnectedAccountNotice()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Ljava/lang/String;

    return-object v0
.end method

.method public final getCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final getLearnMore()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->learnMore:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->learnMore:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->learnMore:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "DataAccessNotice(body="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", subtitle="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", cta="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", learnMore="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", connectedAccountNotice="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->learnMore:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
