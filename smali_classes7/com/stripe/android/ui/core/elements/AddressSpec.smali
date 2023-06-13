.class public final Lcom/stripe/android/ui/core/elements/AddressSpec;
.super Lcom/stripe/android/ui/core/elements/FormItemSpec;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;,
        Lcom/stripe/android/ui/core/elements/AddressSpec$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 @2\u00020\u0001:\u0002A@BE\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\n\u0012\u000e\u0008\u0002\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0013\u0012\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0013\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0017\u0012\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u0019\u00a2\u0006\u0004\u0008:\u0010;BU\u0008\u0017\u0012\u0006\u0010<\u001a\u00020\"\u0012\n\u0008\u0001\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\u0010\u0008\u0001\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013\u0012\u0010\u0008\u0001\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u0012\u0008\u0008\u0001\u0010\u001e\u001a\u00020\u0017\u0012\u0008\u0010>\u001a\u0004\u0018\u00010=\u00a2\u0006\u0004\u0008:\u0010?J!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001J<\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\tJ\t\u0010\u0012\u001a\u00020\nH\u00c6\u0003J\u000f\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0013H\u00c6\u0003J\u000f\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0013H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0017H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0019H\u00c6\u0003JG\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u001b\u001a\u00020\n2\u000e\u0008\u0002\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00132\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00132\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u0019H\u00c6\u0001J\t\u0010!\u001a\u00020\u000bH\u00d6\u0001J\t\u0010#\u001a\u00020\"H\u00d6\u0001J\u0013\u0010&\u001a\u00020\u00172\u0008\u0010%\u001a\u0004\u0018\u00010$H\u00d6\u0003R \u0010\u001b\u001a\u00020\n8\u0016X\u0097\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\'\u0012\u0004\u0008*\u0010+\u001a\u0004\u0008(\u0010)R&\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00138\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010,\u0012\u0004\u0008/\u0010+\u001a\u0004\u0008-\u0010.R&\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00138\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010,\u0012\u0004\u00081\u0010+\u001a\u0004\u00080\u0010.R \u0010\u001e\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001e\u00102\u0012\u0004\u00085\u0010+\u001a\u0004\u00083\u00104R \u0010\u001f\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001f\u00106\u0012\u0004\u00089\u0010+\u001a\u0004\u00087\u00108\u00a8\u0006B"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/AddressSpec;",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "",
        "initialValues",
        "Lcom/stripe/android/uicore/address/AddressRepository;",
        "addressRepository",
        "shippingValues",
        "Lcom/stripe/android/uicore/elements/SectionElement;",
        "transform",
        "component1",
        "",
        "component2",
        "Lcom/stripe/android/ui/core/elements/DisplayField;",
        "component3",
        "",
        "component4",
        "Lcom/stripe/android/uicore/elements/AddressType;",
        "component5",
        "apiPath",
        "allowedCountryCodes",
        "displayFields",
        "showLabel",
        "type",
        "copy",
        "toString",
        "",
        "hashCode",
        "",
        "other",
        "equals",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getApiPath",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getApiPath$annotations",
        "()V",
        "Ljava/util/Set;",
        "getAllowedCountryCodes",
        "()Ljava/util/Set;",
        "getAllowedCountryCodes$annotations",
        "getDisplayFields",
        "getDisplayFields$annotations",
        "Z",
        "getShowLabel",
        "()Z",
        "getShowLabel$annotations",
        "Lcom/stripe/android/uicore/elements/AddressType;",
        "getType",
        "()Lcom/stripe/android/uicore/elements/AddressType;",
        "getType$annotations",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressType;)V",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLbt5;)V",
        "Companion",
        "$serializer",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/ui/core/elements/AddressSpec$Companion;


# instance fields
.field private final allowedCountryCodes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private final displayFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/ui/core/elements/DisplayField;",
            ">;"
        }
    .end annotation
.end field

.field private final showLabel:Z

.field private final type:Lcom/stripe/android/uicore/elements/AddressType;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/ui/core/elements/AddressSpec$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/AddressSpec$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->Companion:Lcom/stripe/android/ui/core/elements/AddressSpec$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/ui/core/elements/AddressSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLbt5;)V
    .locals 1
    .param p2    # Lcom/stripe/android/uicore/elements/IdentifierSpec;
        .annotation runtime LVs5;
            value = "api_path"
        .end annotation
    .end param
    .param p3    # Ljava/util/Set;
        .annotation runtime LVs5;
            value = "allowed_country_codes"
        .end annotation
    .end param
    .param p4    # Ljava/util/Set;
        .annotation runtime LVs5;
            value = "display_fields"
        .end annotation
    .end param
    .param p5    # Z
        .annotation runtime LVs5;
            value = "show_label"
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

    and-int/lit8 p6, p1, 0x0

    if-eqz p6, :cond_0

    sget-object p6, Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;

    invoke-virtual {p6}, Lcom/stripe/android/ui/core/elements/AddressSpec$$serializer;->getDescriptor()LMs5;

    move-result-object p6

    const/4 v0, 0x0

    invoke-static {p1, v0, p6}, LzW3;->b(IILMs5;)V

    :cond_0
    const/4 p6, 0x0

    invoke-direct {p0, p6}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_1

    sget-object p2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v0, "billing_details[address]"

    invoke-virtual {p2, v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p2

    :cond_1
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_2

    invoke-static {}, Lcom/stripe/android/uicore/elements/BillingSpecKt;->getSupportedBillingCountries()Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    goto :goto_0

    :cond_2
    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_3

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    goto :goto_1

    :cond_3
    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    :goto_1
    and-int/lit8 p1, p1, 0x8

    const/4 p2, 0x1

    if-nez p1, :cond_4

    iput-boolean p2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    goto :goto_2

    :cond_4
    iput-boolean p5, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    :goto_2
    new-instance p1, Lcom/stripe/android/uicore/elements/AddressType$Normal;

    invoke-direct {p1, p6, p2, p6}, Lcom/stripe/android/uicore/elements/AddressType$Normal;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lcom/stripe/android/uicore/elements/AddressType;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/ui/core/elements/DisplayField;",
            ">;Z",
            "Lcom/stripe/android/uicore/elements/AddressType;",
            ")V"
        }
    .end annotation

    const-string v0, "apiPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowedCountryCodes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayFields"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    iput-boolean p4, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    iput-object p5, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lcom/stripe/android/uicore/elements/AddressType;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string p7, "billing_details[address]"

    invoke-virtual {p1, p7}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    invoke-static {}, Lcom/stripe/android/uicore/elements/BillingSpecKt;->getSupportedBillingCountries()Ljava/util/Set;

    move-result-object p2

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p3

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    const/4 p3, 0x1

    if-eqz p2, :cond_3

    move v1, p3

    goto :goto_0

    :cond_3
    move v1, p4

    :goto_0
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    new-instance p5, Lcom/stripe/android/uicore/elements/AddressType$Normal;

    const/4 p2, 0x0

    invoke-direct {p5, p2, p3, p2}, Lcom/stripe/android/uicore/elements/AddressType$Normal;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move p6, v1

    move-object p7, v2

    invoke-direct/range {p2 .. p7}, Lcom/stripe/android/ui/core/elements/AddressSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressType;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/ui/core/elements/AddressSpec;Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressType;ILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/AddressSpec;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lcom/stripe/android/uicore/elements/AddressType;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/ui/core/elements/AddressSpec;->copy(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressType;)Lcom/stripe/android/ui/core/elements/AddressSpec;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAllowedCountryCodes$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "allowed_country_codes"
    .end annotation

    return-void
.end method

.method public static synthetic getApiPath$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "api_path"
    .end annotation

    return-void
.end method

.method public static synthetic getDisplayFields$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "display_fields"
    .end annotation

    return-void
.end method

.method public static synthetic getShowLabel$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "show_label"
    .end annotation

    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/ui/core/elements/AddressSpec;LUt0;LMs5;)V
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v4, "billing_details[address]"

    invoke-virtual {v3, v4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_1
    if-eqz v1, :cond_2

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->INSTANCE:Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-interface {p1, p2, v0, v1, v3}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    invoke-interface {p1, p2, v2}, LUt0;->s(LMs5;I)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_2
    move v1, v2

    goto :goto_3

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    invoke-static {}, Lcom/stripe/android/uicore/elements/BillingSpecKt;->getSupportedBillingCountries()Ljava/util/Set;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    move v1, v0

    :goto_3
    if-eqz v1, :cond_5

    new-instance v1, LSr2;

    sget-object v3, LgS5;->a:LgS5;

    invoke-direct {v1, v3}, LSr2;-><init>(LKj2;)V

    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    invoke-interface {p1, p2, v2, v1, v3}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_6

    :goto_4
    move v3, v2

    goto :goto_5

    :cond_6
    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    move v3, v0

    :goto_5
    if-eqz v3, :cond_8

    new-instance v3, LSr2;

    sget-object v4, Lcom/stripe/android/ui/core/elements/DisplayField;->Companion:Lcom/stripe/android/ui/core/elements/DisplayField$Companion;

    invoke-virtual {v4}, Lcom/stripe/android/ui/core/elements/DisplayField$Companion;->serializer()LKj2;

    move-result-object v4

    invoke-direct {v3, v4}, LSr2;-><init>(LKj2;)V

    iget-object v4, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    invoke-interface {p1, p2, v1, v3, v4}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_8
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_9

    :goto_6
    move v0, v2

    goto :goto_7

    :cond_9
    iget-boolean v3, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    if-eq v3, v2, :cond_a

    goto :goto_6

    :cond_a
    :goto_7
    if-eqz v0, :cond_b

    iget-boolean p0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    invoke-interface {p1, p2, v1, p0}, LUt0;->v(LMs5;IZ)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    return-object v0
.end method

.method public final component2()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    return-object v0
.end method

.method public final component3()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/ui/core/elements/DisplayField;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    return v0
.end method

.method public final component5()Lcom/stripe/android/uicore/elements/AddressType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lcom/stripe/android/uicore/elements/AddressType;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressType;)Lcom/stripe/android/ui/core/elements/AddressSpec;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/ui/core/elements/DisplayField;",
            ">;Z",
            "Lcom/stripe/android/uicore/elements/AddressType;",
            ")",
            "Lcom/stripe/android/ui/core/elements/AddressSpec;"
        }
    .end annotation

    const-string v0, "apiPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowedCountryCodes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayFields"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/ui/core/elements/AddressSpec;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/ui/core/elements/AddressSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLcom/stripe/android/uicore/elements/AddressType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/ui/core/elements/AddressSpec;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/ui/core/elements/AddressSpec;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    iget-boolean v3, p1, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lcom/stripe/android/uicore/elements/AddressType;

    iget-object p1, p1, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lcom/stripe/android/uicore/elements/AddressType;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAllowedCountryCodes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    return-object v0
.end method

.method public getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final getDisplayFields()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/stripe/android/ui/core/elements/DisplayField;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    return-object v0
.end method

.method public final getShowLabel()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    return v0
.end method

.method public final getType()Lcom/stripe/android/uicore/elements/AddressType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lcom/stripe/android/uicore/elements/AddressType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lcom/stripe/android/uicore/elements/AddressType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    iget-boolean v3, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    iget-object v4, p0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lcom/stripe/android/uicore/elements/AddressType;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AddressSpec(apiPath="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", allowedCountryCodes="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", displayFields="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showLabel="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final transform(Ljava/util/Map;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Map;)Lcom/stripe/android/uicore/elements/SectionElement;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/SectionElement;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move-object/from16 v9, p3

    const-string v1, "initialValues"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "addressRepository"

    move-object/from16 v3, p2

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->showLabel:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    sget v1, Lcom/stripe/android/ui/core/R$string;->billing_details:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v13, v1

    goto :goto_0

    :cond_0
    move-object v13, v2

    :goto_0
    iget-object v1, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    const/4 v14, 0x1

    if-ne v1, v14, :cond_1

    iget-object v1, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->displayFields:Ljava/util/Set;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    sget-object v5, Lcom/stripe/android/ui/core/elements/DisplayField;->Country:Lcom/stripe/android/ui/core/elements/DisplayField;

    if-ne v1, v5, :cond_1

    new-instance v1, Lcom/stripe/android/uicore/elements/CountryElement;

    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v3, "billing_details[address][country]"

    invoke-virtual {v2, v3}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/uicore/elements/DropdownFieldController;

    new-instance v5, Lcom/stripe/android/uicore/elements/CountryConfig;

    iget-object v15, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x3e

    const/16 v22, 0x0

    move-object v14, v5

    invoke-direct/range {v14 .. v22}, Lcom/stripe/android/uicore/elements/CountryConfig;-><init>(Ljava/util/Set;Ljava/util/Locale;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v3, v5, v4}, Lcom/stripe/android/uicore/elements/DropdownFieldController;-><init>(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;)V

    invoke-direct {v1, v2, v3}, Lcom/stripe/android/uicore/elements/CountryElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/DropdownFieldController;)V

    invoke-virtual {v0, v1, v13}, Lcom/stripe/android/ui/core/elements/FormItemSpec;->createSectionElement$payments_ui_core_release(Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v1

    goto :goto_2

    :cond_1
    if-eqz v9, :cond_2

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getSameAsShipping()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_2

    invoke-static {v5}, Lkotlin/text/StringsKt;->toBooleanStrictOrNull(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    new-instance v5, Lcom/stripe/android/uicore/elements/SameAsShippingElement;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getSameAsShipping()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    new-instance v6, Lcom/stripe/android/uicore/elements/SameAsShippingController;

    invoke-direct {v6, v2}, Lcom/stripe/android/uicore/elements/SameAsShippingController;-><init>(Z)V

    invoke-direct {v5, v1, v6}, Lcom/stripe/android/uicore/elements/SameAsShippingElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/SameAsShippingController;)V

    move-object v15, v5

    goto :goto_1

    :cond_2
    move-object v15, v2

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/ui/core/elements/AddressSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    iget-object v6, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->allowedCountryCodes:Ljava/util/Set;

    iget-object v5, v0, Lcom/stripe/android/ui/core/elements/AddressSpec;->type:Lcom/stripe/android/uicore/elements/AddressType;

    new-instance v16, Lcom/stripe/android/uicore/elements/AddressElement;

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x120

    const/4 v12, 0x0

    move-object/from16 v1, v16

    move-object/from16 v3, p2

    move-object/from16 v4, p1

    move-object v8, v15

    move-object/from16 v9, p3

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/uicore/elements/AddressElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressType;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/stripe/android/uicore/elements/SectionFieldElement;

    const/4 v2, 0x0

    aput-object v16, v1, v2

    aput-object v15, v1, v14

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1, v13}, Lcom/stripe/android/ui/core/elements/FormItemSpec;->createSectionElement$payments_ui_core_release(Ljava/util/List;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v1

    :goto_2
    return-object v1
.end method
