.class public final Lcom/stripe/android/uicore/address/CountryAddressSchema;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/address/CountryAddressSchema$$serializer;,
        Lcom/stripe/android/uicore/address/CountryAddressSchema$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 #2\u00020\u0001:\u0002$#B%\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dB=\u0008\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0010\u0012\n\u0008\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008\u001c\u0010\"J!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u00c7\u0001R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u0012\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000c\u0010\rR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u0012\u0004\u0008\u0015\u0010\u000f\u001a\u0004\u0008\u0013\u0010\u0014R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u0012\u0004\u0008\u001b\u0010\u000f\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006%"
    }
    d2 = {
        "Lcom/stripe/android/uicore/address/CountryAddressSchema;",
        "",
        "self",
        "LUt0;",
        "output",
        "LMs5;",
        "serialDesc",
        "",
        "write$Self",
        "Lcom/stripe/android/uicore/address/FieldType;",
        "type",
        "Lcom/stripe/android/uicore/address/FieldType;",
        "getType",
        "()Lcom/stripe/android/uicore/address/FieldType;",
        "getType$annotations",
        "()V",
        "",
        "required",
        "Z",
        "getRequired",
        "()Z",
        "getRequired$annotations",
        "Lcom/stripe/android/uicore/address/FieldSchema;",
        "schema",
        "Lcom/stripe/android/uicore/address/FieldSchema;",
        "getSchema",
        "()Lcom/stripe/android/uicore/address/FieldSchema;",
        "getSchema$annotations",
        "<init>",
        "(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V",
        "",
        "seen1",
        "Lbt5;",
        "serializationConstructorMarker",
        "(ILcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;Lbt5;)V",
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

.field public static final Companion:Lcom/stripe/android/uicore/address/CountryAddressSchema$Companion;


# instance fields
.field private final required:Z

.field private final schema:Lcom/stripe/android/uicore/address/FieldSchema;

.field private final type:Lcom/stripe/android/uicore/address/FieldType;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/uicore/address/CountryAddressSchema$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/address/CountryAddressSchema$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->Companion:Lcom/stripe/android/uicore/address/CountryAddressSchema$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;Lbt5;)V
    .locals 1
    .param p2    # Lcom/stripe/android/uicore/address/FieldType;
        .annotation runtime LVs5;
            value = "type"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime LVs5;
            value = "required"
        .end annotation
    .end param
    .param p4    # Lcom/stripe/android/uicore/address/FieldSchema;
        .annotation runtime LVs5;
            value = "schema"
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

    and-int/lit8 p5, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p5, :cond_0

    sget-object p5, Lcom/stripe/android/uicore/address/CountryAddressSchema$$serializer;->INSTANCE:Lcom/stripe/android/uicore/address/CountryAddressSchema$$serializer;

    invoke-virtual {p5}, Lcom/stripe/android/uicore/address/CountryAddressSchema$$serializer;->getDescriptor()LMs5;

    move-result-object p5

    invoke-static {p1, v0, p5}, LzW3;->b(IILMs5;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->type:Lcom/stripe/android/uicore/address/FieldType;

    iput-boolean p3, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->required:Z

    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->type:Lcom/stripe/android/uicore/address/FieldType;

    iput-boolean p2, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->required:Z

    iput-object p3, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    return-void
.end method

.method public static synthetic getRequired$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "required"
    .end annotation

    return-void
.end method

.method public static synthetic getSchema$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "schema"
    .end annotation

    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0
    .annotation runtime LVs5;
        value = "type"
    .end annotation

    return-void
.end method

.method public static final write$Self(Lcom/stripe/android/uicore/address/CountryAddressSchema;LUt0;LMs5;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "self"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serialDesc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/uicore/address/FieldType;->Companion:Lcom/stripe/android/uicore/address/FieldType$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/address/FieldType$Companion;->serializer()LKj2;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->type:Lcom/stripe/android/uicore/address/FieldType;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->required:Z

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1, v0}, LUt0;->v(LMs5;IZ)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, LUt0;->s(LMs5;I)Z

    move-result v3

    if-eqz v3, :cond_0

    :goto_0
    move v2, v1

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    sget-object v1, Lcom/stripe/android/uicore/address/FieldSchema$$serializer;->INSTANCE:Lcom/stripe/android/uicore/address/FieldSchema$$serializer;

    iget-object p0, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    invoke-interface {p1, p2, v0, v1, p0}, LUt0;->E(LMs5;ILet5;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final getRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->required:Z

    return v0
.end method

.method public final getSchema()Lcom/stripe/android/uicore/address/FieldSchema;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    return-object v0
.end method

.method public final getType()Lcom/stripe/android/uicore/address/FieldType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->type:Lcom/stripe/android/uicore/address/FieldType;

    return-object v0
.end method
