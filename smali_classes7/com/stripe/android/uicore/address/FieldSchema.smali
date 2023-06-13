.class public final Lcom/stripe/android/uicore/address/FieldSchema;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/address/FieldSchema$$serializer;,
        Lcom/stripe/android/uicore/address/FieldSchema$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 $2\u00020\u0001:\u0002%$B3\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0018\u0008\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\u0008\u0012\u0004\u0012\u00020\u0010`\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001d\u0010\u001eBO\u0008\u0017\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\t\u0012\u001c\u0008\u0001\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u0011\u0012\n\u0008\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010!\u00a2\u0006\u0004\u0008\u001d\u0010#J!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u0012\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\n\u0010\u000cR0\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\u0008\u0012\u0004\u0012\u00020\u0010`\u00118\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u0012\u0004\u0008\u0016\u0010\u000e\u001a\u0004\u0008\u0014\u0010\u0015R \u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u0012\u0004\u0008\u001c\u0010\u000e\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006&"
    }
    d2 = {
        "Lcom/stripe/android/uicore/address/FieldSchema;",
        "",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "",
        "isNumeric",
        "Z",
        "()Z",
        "isNumeric$annotations",
        "()V",
        "Ljava/util/ArrayList;",
        "",
        "Lkotlin/collections/ArrayList;",
        "examples",
        "Ljava/util/ArrayList;",
        "getExamples",
        "()Ljava/util/ArrayList;",
        "getExamples$annotations",
        "Lcom/stripe/android/uicore/address/NameType;",
        "nameType",
        "Lcom/stripe/android/uicore/address/NameType;",
        "getNameType",
        "()Lcom/stripe/android/uicore/address/NameType;",
        "getNameType$annotations",
        "<init>",
        "(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;)V",
        "",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(IZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;Lbt5;)V",
        "Companion",
        "$serializer",
        "stripe-ui-core_release"
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

.field public static final Companion:Lcom/stripe/android/uicore/address/FieldSchema$Companion;


# instance fields
.field private final examples:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final isNumeric:Z

.field private final nameType:Lcom/stripe/android/uicore/address/NameType;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/uicore/address/FieldSchema$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/address/FieldSchema$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldSchema;->Companion:Lcom/stripe/android/uicore/address/FieldSchema$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/address/FieldSchema;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(IZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;Lbt5;)V
    .locals 1
    .param p2    # Z
        .annotation runtime LVs5;
            value = "isNumeric"
        .end annotation
    .end param
    .param p3    # Ljava/util/ArrayList;
        .annotation runtime LVs5;
            value = "examples"
        .end annotation
    .end param
    .param p4    # Lcom/stripe/android/uicore/address/NameType;
        .annotation runtime LVs5;
            value = "nameType"
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

    and-int/lit8 p5, p1, 0x4

    const/4 v0, 0x4

    if-eq v0, p5, :cond_0

    sget-object p5, Lcom/stripe/android/uicore/address/FieldSchema$$serializer;->INSTANCE:Lcom/stripe/android/uicore/address/FieldSchema$$serializer;

    invoke-virtual {p5}, Lcom/stripe/android/uicore/address/FieldSchema$$serializer;->getDescriptor()LMs5;

    move-result-object p5

    invoke-static {p1, v0, p5}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p5, p1, 0x1

    if-nez p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    iput-boolean p2, p0, Lcom/stripe/android/uicore/address/FieldSchema;->isNumeric:Z

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_2

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/address/FieldSchema;->examples:Ljava/util/ArrayList;

    goto :goto_0

    :cond_2
    iput-object p3, p0, Lcom/stripe/android/uicore/address/FieldSchema;->examples:Ljava/util/ArrayList;

    :goto_0
    iput-object p4, p0, Lcom/stripe/android/uicore/address/FieldSchema;->nameType:Lcom/stripe/android/uicore/address/NameType;

    return-void
.end method

.method public constructor <init>(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/address/NameType;",
            ")V"
        }
    .end annotation

    const-string v0, "examples"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/stripe/android/uicore/address/FieldSchema;->isNumeric:Z

    iput-object p2, p0, Lcom/stripe/android/uicore/address/FieldSchema;->examples:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/stripe/android/uicore/address/FieldSchema;->nameType:Lcom/stripe/android/uicore/address/NameType;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/address/FieldSchema;-><init>(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;)V

    return-void
.end method

.method public static synthetic getExamples$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "examples"
    .end annotation

    return-void
.end method

.method public static synthetic getNameType$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "nameType"
    .end annotation

    return-void
.end method

.method public static synthetic isNumeric$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "isNumeric"
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/uicore/address/FieldSchema;LUt0;LMs5;)V
    .locals 4
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
    iget-boolean v1, p0, Lcom/stripe/android/uicore/address/FieldSchema;->isNumeric:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_1
    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lcom/stripe/android/uicore/address/FieldSchema;->isNumeric:Z

    invoke-interface {p1, p2, v0, v1}, LUt0;->v(LMs5;IZ)V

    :cond_2
    invoke-interface {p1, p2, v2}, LUt0;->s(LMs5;I)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_2
    move v0, v2

    goto :goto_3

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/uicore/address/FieldSchema;->examples:Ljava/util/ArrayList;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_3
    if-eqz v0, :cond_5

    new-instance v0, Lro;

    sget-object v1, LgS5;->a:LgS5;

    invoke-direct {v0, v1}, Lro;-><init>(LKj2;)V

    iget-object v1, p0, Lcom/stripe/android/uicore/address/FieldSchema;->examples:Ljava/util/ArrayList;

    invoke-interface {p1, p2, v2, v0, v1}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_5
    sget-object v0, Lcom/stripe/android/uicore/address/NameType;->Companion:Lcom/stripe/android/uicore/address/NameType$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/address/NameType$Companion;->serializer()LKj2;

    move-result-object v0

    iget-object p0, p0, Lcom/stripe/android/uicore/address/FieldSchema;->nameType:Lcom/stripe/android/uicore/address/NameType;

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1, v0, p0}, LUt0;->y(LMs5;ILet5;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getExamples()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/address/FieldSchema;->examples:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getNameType()Lcom/stripe/android/uicore/address/NameType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/address/FieldSchema;->nameType:Lcom/stripe/android/uicore/address/NameType;

    return-object v0
.end method

.method public final isNumeric()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/address/FieldSchema;->isNumeric:Z

    return v0
.end method
