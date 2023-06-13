.class public final Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;,
        Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u0000 H2\u00020\u0001:\u0002IHBW\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008B\u0010CBw\u0008\u0017\u0012\u0006\u0010D\u001a\u00020\u0012\u0012\u0008\u0008\u0001\u0010\u0016\u001a\u00020\t\u0012\n\u0008\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0001\u0010\u0018\u001a\u00020\t\u0012\n\u0008\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010F\u001a\u0004\u0018\u00010E\u00a2\u0006\u0004\u0008B\u0010GJ!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J\t\u0010\n\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\r\u001a\u00020\tH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003Jh\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0016\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u000b2\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\t\u0010 \u001a\u00020\u000bH\u00d6\u0001J\t\u0010!\u001a\u00020\u0012H\u00d6\u0001J\u0013\u0010$\u001a\u00020\t2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010%\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010)\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0012H\u00d6\u0001R \u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010*\u0012\u0004\u0008-\u0010.\u001a\u0004\u0008+\u0010,R \u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010/\u0012\u0004\u00082\u0010.\u001a\u0004\u00080\u00101R \u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010*\u0012\u0004\u00084\u0010.\u001a\u0004\u00083\u0010,R \u0010\u0019\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010/\u0012\u0004\u00086\u0010.\u001a\u0004\u00085\u00101R\"\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001a\u00107\u0012\u0004\u0008:\u0010.\u001a\u0004\u00088\u00109R\"\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001b\u00107\u0012\u0004\u0008<\u0010.\u001a\u0004\u0008;\u00109R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010=\u0012\u0004\u0008?\u0010.\u001a\u0004\u0008>\u0010\u0014R\"\u0010\u001d\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010/\u0012\u0004\u0008A\u0010.\u001a\u0004\u0008@\u00101\u00a8\u0006J"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
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
        "",
        "component2",
        "component3",
        "component4",
        "Lcom/stripe/android/financialconnections/model/Image;",
        "component5",
        "component6",
        "",
        "component7",
        "()Ljava/lang/Integer;",
        "component8",
        "featured",
        "id",
        "mobileHandoffCapable",
        "name",
        "icon",
        "logo",
        "featuredOrder",
        "url",
        "copy",
        "(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
        "toString",
        "hashCode",
        "",
        "other",
        "equals",
        "describeContents",
        "Landroid/os/Parcel;",
        "parcel",
        "flags",
        "writeToParcel",
        "Z",
        "getFeatured",
        "()Z",
        "getFeatured$annotations",
        "()V",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "getId$annotations",
        "getMobileHandoffCapable",
        "getMobileHandoffCapable$annotations",
        "getName",
        "getName$annotations",
        "Lcom/stripe/android/financialconnections/model/Image;",
        "getIcon",
        "()Lcom/stripe/android/financialconnections/model/Image;",
        "getIcon$annotations",
        "getLogo",
        "getLogo$annotations",
        "Ljava/lang/Integer;",
        "getFeaturedOrder",
        "getFeaturedOrder$annotations",
        "getUrl",
        "getUrl$annotations",
        "<init>",
        "(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(IZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;Lbt5;)V",
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
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$Companion;


# instance fields
.field private final featured:Z

.field private final featuredOrder:Ljava/lang/Integer;

.field private final icon:Lcom/stripe/android/financialconnections/model/Image;

.field private final id:Ljava/lang/String;

.field private final logo:Lcom/stripe/android/financialconnections/model/Image;

.field private final mobileHandoffCapable:Z

.field private final name:Ljava/lang/String;

.field private final url:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$Creator;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(IZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;Lbt5;)V
    .locals 1
    .param p2    # Z
        .annotation runtime LVs5;
            value = "featured"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "id"
        .end annotation
    .end param
    .param p4    # Z
        .annotation runtime LVs5;
            value = "mobile_handoff_capable"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "name"
        .end annotation
    .end param
    .param p6    # Lcom/stripe/android/financialconnections/model/Image;
        .annotation runtime LVs5;
            value = "icon"
        .end annotation
    .end param
    .param p7    # Lcom/stripe/android/financialconnections/model/Image;
        .annotation runtime LVs5;
            value = "logo"
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation runtime LVs5;
            value = "featured_order"
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime LVs5;
            value = "url"
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

    sget-object p10, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;

    invoke-virtual {p10}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution$$serializer;->getDescriptor()LMs5;

    move-result-object p10

    invoke-static {p1, v0, p10}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featured:Z

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->id:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->mobileHandoffCapable:Z

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->name:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->icon:Lcom/stripe/android/financialconnections/model/Image;

    goto :goto_0

    :cond_1
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->icon:Lcom/stripe/android/financialconnections/model/Image;

    :goto_0
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->logo:Lcom/stripe/android/financialconnections/model/Image;

    goto :goto_1

    :cond_2
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->logo:Lcom/stripe/android/financialconnections/model/Image;

    :goto_1
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featuredOrder:Ljava/lang/Integer;

    goto :goto_2

    :cond_3
    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featuredOrder:Ljava/lang/Integer;

    :goto_2
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->url:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p9, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->url:Ljava/lang/String;

    :goto_3
    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featured:Z

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->id:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->mobileHandoffCapable:Z

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->name:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->icon:Lcom/stripe/android/financialconnections/model/Image;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->logo:Lcom/stripe/android/financialconnections/model/Image;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featuredOrder:Ljava/lang/Integer;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->url:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    move v4, p1

    move-object v5, p2

    move v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v3 .. v11}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 9

    move-object v0, p0

    move/from16 v1, p9

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featured:Z

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->id:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->mobileHandoffCapable:Z

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->name:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->icon:Lcom/stripe/android/financialconnections/model/Image;

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->logo:Lcom/stripe/android/financialconnections/model/Image;

    goto :goto_5

    :cond_5
    move-object v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featuredOrder:Ljava/lang/Integer;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->url:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p8

    :goto_7
    move p1, v2

    move-object p2, v3

    move p3, v4

    move-object p4, v5

    move-object p5, v6

    move-object p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v1

    invoke-virtual/range {p0 .. p8}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->copy(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getFeatured$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "featured"
    .end annotation

    return-void
.end method

.method public static synthetic getFeaturedOrder$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "featured_order"
    .end annotation

    return-void
.end method

.method public static synthetic getIcon$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "icon"
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

.method public static synthetic getLogo$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "logo"
    .end annotation

    return-void
.end method

.method public static synthetic getMobileHandoffCapable$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "mobile_handoff_capable"
    .end annotation

    return-void
.end method

.method public static synthetic getName$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "name"
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

.method public static final write$Self(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;LUt0;LMs5;)V
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featured:Z

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, LUt0;->v(LMs5;IZ)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->id:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0}, LUt0;->w(LMs5;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->mobileHandoffCapable:Z

    invoke-interface {p1, p2, v0, v3}, LUt0;->v(LMs5;IZ)V

    const/4 v0, 0x3

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v3}, LUt0;->w(LMs5;ILjava/lang/String;)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_0

    :goto_0
    move v3, v2

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->icon:Lcom/stripe/android/financialconnections/model/Image;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_1
    if-eqz v3, :cond_2

    sget-object v3, Lcom/stripe/android/financialconnections/model/Image$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Image$$serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->icon:Lcom/stripe/android/financialconnections/model/Image;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_2
    move v3, v2

    goto :goto_3

    :cond_3
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->logo:Lcom/stripe/android/financialconnections/model/Image;

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    move v3, v1

    :goto_3
    if-eqz v3, :cond_5

    sget-object v3, Lcom/stripe/android/financialconnections/model/Image$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Image$$serializer;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->logo:Lcom/stripe/android/financialconnections/model/Image;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_6

    :goto_4
    move v3, v2

    goto :goto_5

    :cond_6
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featuredOrder:Ljava/lang/Integer;

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    move v3, v1

    :goto_5
    if-eqz v3, :cond_8

    sget-object v3, LF52;->a:LF52;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featuredOrder:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v3, v4}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_8
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_9

    :goto_6
    move v1, v2

    goto :goto_7

    :cond_9
    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->url:Ljava/lang/String;

    if-eqz v3, :cond_a

    goto :goto_6

    :cond_a
    :goto_7
    if-eqz v1, :cond_b

    sget-object v1, LgS5;->a:LgS5;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->url:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featured:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->mobileHandoffCapable:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/financialconnections/model/Image;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->icon:Lcom/stripe/android/financialconnections/model/Image;

    return-object v0
.end method

.method public final component6()Lcom/stripe/android/financialconnections/model/Image;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->logo:Lcom/stripe/android/financialconnections/model/Image;

    return-object v0
.end method

.method public final component7()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featuredOrder:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;
    .locals 10

    const-string v0, "id"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object v5, p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-object v1, v0

    move v2, p1

    move v4, p3

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featured:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featured:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->mobileHandoffCapable:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->mobileHandoffCapable:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->icon:Lcom/stripe/android/financialconnections/model/Image;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->icon:Lcom/stripe/android/financialconnections/model/Image;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->logo:Lcom/stripe/android/financialconnections/model/Image;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->logo:Lcom/stripe/android/financialconnections/model/Image;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featuredOrder:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featuredOrder:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->url:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->url:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getFeatured()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featured:Z

    return v0
.end method

.method public final getFeaturedOrder()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featuredOrder:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getIcon()Lcom/stripe/android/financialconnections/model/Image;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->icon:Lcom/stripe/android/financialconnections/model/Image;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLogo()Lcom/stripe/android/financialconnections/model/Image;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->logo:Lcom/stripe/android/financialconnections/model/Image;

    return-object v0
.end method

.method public final getMobileHandoffCapable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->mobileHandoffCapable:Z

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featured:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->id:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->mobileHandoffCapable:Z

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->icon:Lcom/stripe/android/financialconnections/model/Image;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/Image;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->logo:Lcom/stripe/android/financialconnections/model/Image;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/Image;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featuredOrder:Ljava/lang/Integer;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->url:Ljava/lang/String;

    if-nez v1, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featured:Z

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->id:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->mobileHandoffCapable:Z

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->name:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->icon:Lcom/stripe/android/financialconnections/model/Image;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->logo:Lcom/stripe/android/financialconnections/model/Image;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featuredOrder:Ljava/lang/Integer;

    iget-object v7, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->url:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "FinancialConnectionsInstitution(featured="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mobileHandoffCapable="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", logo="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", featuredOrder="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", url="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featured:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->mobileHandoffCapable:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->icon:Lcom/stripe/android/financialconnections/model/Image;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/Image;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->logo:Lcom/stripe/android/financialconnections/model/Image;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/Image;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->featuredOrder:Ljava/lang/Integer;

    if-nez p2, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_2
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->url:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
