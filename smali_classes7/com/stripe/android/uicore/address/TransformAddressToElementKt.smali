.class public final Lcom/stripe/android/uicore/address/TransformAddressToElementKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/address/TransformAddressToElementKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007\u001a \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0002*\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\u0014\u0010\t\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002\u001aI\u0010\u0018\u001a\u00020\u0015*\u00020\n2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a9\u0010\u001c\u001a\u00020\u0019*\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001a\u001c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00022\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0002H\u0002\u001a\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0015H\u0002\u001a\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u001a\u001c\u0010%\u001a\u00020\u00112\u0008\u0010$\u001a\u0004\u0018\u00010#H\u0002\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008%\u0010&\"\u0014\u0010(\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006*"
    }
    d2 = {
        "Ljava/io/InputStream;",
        "inputStream",
        "",
        "Lcom/stripe/android/uicore/address/CountryAddressSchema;",
        "parseAddressesSchema",
        "",
        "countryCode",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "transformToElementList",
        "getJsonStringFromInputStream",
        "Lcom/stripe/android/uicore/address/FieldType;",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "identifierSpec",
        "",
        "label",
        "Lal2;",
        "capitalization",
        "Lcl2;",
        "keyboardType",
        "",
        "showOptionalLabel",
        "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;",
        "toElement-96KqDgQ",
        "(Lcom/stripe/android/uicore/address/FieldType;Lcom/stripe/android/uicore/elements/IdentifierSpec;IIILjava/lang/String;Z)Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;",
        "toElement",
        "Lcom/stripe/android/uicore/elements/TextFieldConfig;",
        "toConfig-25FCGzQ",
        "(Lcom/stripe/android/uicore/address/FieldType;IIILjava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldConfig;",
        "toConfig",
        "countryAddressElements",
        "combineCityAndPostal",
        "element1",
        "element2",
        "isPostalNextToCity",
        "isCityOrPostal",
        "Lcom/stripe/android/uicore/address/FieldSchema;",
        "fieldSchema",
        "getKeyboard",
        "(Lcom/stripe/android/uicore/address/FieldSchema;)I",
        "Lbi2;",
        "format",
        "Lbi2;",
        "stripe-ui-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTransformAddressToElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformAddressToElement.kt\ncom/stripe/android/uicore/address/TransformAddressToElementKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n819#2:361\n847#2,2:362\n1603#2,9:364\n1855#2:373\n1856#2:375\n1612#2:376\n1804#2,4:378\n1#3:374\n1#3:377\n*S KotlinDebug\n*F\n+ 1 TransformAddressToElement.kt\ncom/stripe/android/uicore/address/TransformAddressToElementKt\n*L\n229#1:361\n229#1:362,2\n233#1:364,9\n233#1:373\n233#1:375\n233#1:376\n322#1:378,4\n233#1:374\n*E\n"
    }
.end annotation


# static fields
.field private static final format:Lbi2;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Lcom/stripe/android/uicore/address/TransformAddressToElementKt$format$1;->INSTANCE:Lcom/stripe/android/uicore/address/TransformAddressToElementKt$format$1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LJi2;->b(Lbi2;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lbi2;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/address/TransformAddressToElementKt;->format:Lbi2;

    return-void
.end method

.method private static final combineCityAndPostal(Ljava/util/List;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;"
        }
    .end annotation

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-gez v3, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v4, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_1

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    invoke-static {v6, v7}, Lcom/stripe/android/uicore/address/TransformAddressToElementKt;->isPostalNextToCity(Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v4, 0x2

    new-array v4, v4, [Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    aput-object v3, v4, v2

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    const/4 v6, 0x1

    aput-object v3, v4, v6

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v1, Ljava/util/Collection;

    new-instance v4, Lcom/stripe/android/uicore/elements/RowElement;

    sget-object v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v7

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "row_"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    new-instance v7, Lcom/stripe/android/uicore/elements/RowController;

    invoke-direct {v7, v3}, Lcom/stripe/android/uicore/elements/RowController;-><init>(Ljava/util/List;)V

    invoke-direct {v4, v6, v3, v7}, Lcom/stripe/android/uicore/elements/RowElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Lcom/stripe/android/uicore/elements/RowController;)V

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lcom/stripe/android/uicore/elements/RowElement;

    if-eqz v3, :cond_2

    check-cast v1, Ljava/util/Collection;

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_1

    :cond_2
    check-cast v1, Ljava/util/Collection;

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :goto_1
    move v3, v5

    goto/16 :goto_0

    :cond_3
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->filterNotNull(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final getJsonStringFromInputStream(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, p0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    instance-of p0, v2, Ljava/io/BufferedReader;

    if-eqz p0, :cond_0

    check-cast v2, Ljava/io/BufferedReader;

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/io/BufferedReader;

    const/16 v1, 0x2000

    invoke-direct {p0, v2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    move-object v2, p0

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    if-eqz v2, :cond_2

    :try_start_0
    invoke-static {v2}, Lkotlin/io/TextStreamsKt;->readText(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v2, p0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    move-object p0, v0

    :goto_1
    invoke-static {v2, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object p0
.end method

.method private static final getKeyboard(Lcom/stripe/android/uicore/address/FieldSchema;)I
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/address/FieldSchema;->isNumeric()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_0

    move v0, v1

    :cond_0
    if-eqz v0, :cond_1

    sget-object p0, Lcl2;->b:Lcl2$a;

    invoke-virtual {p0}, Lcl2$a;->e()I

    move-result p0

    goto :goto_0

    :cond_1
    sget-object p0, Lcl2;->b:Lcl2$a;

    invoke-virtual {p0}, Lcl2$a;->h()I

    move-result p0

    :goto_0
    return p0
.end method

.method private static final isCityOrPostal(Lcom/stripe/android/uicore/elements/IdentifierSpec;)Z
    .locals 2

    sget-object v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPostalCode()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCity()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static final isPostalNextToCity(Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/uicore/address/TransformAddressToElementKt;->isCityOrPostal(Lcom/stripe/android/uicore/elements/IdentifierSpec;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/uicore/address/TransformAddressToElementKt;->isCityOrPostal(Lcom/stripe/android/uicore/elements/IdentifierSpec;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final parseAddressesSchema(Ljava/io/InputStream;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/address/CountryAddressSchema;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lcom/stripe/android/uicore/address/TransformAddressToElementKt;->getJsonStringFromInputStream(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Lcom/stripe/android/uicore/address/TransformAddressToElementKt;->format:Lbi2;

    sget-object v1, Lcom/stripe/android/uicore/address/CountryAddressSchema;->Companion:Lcom/stripe/android/uicore/address/CountryAddressSchema$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/address/CountryAddressSchema$Companion;->serializer()LKj2;

    move-result-object v1

    invoke-static {v1}, Lb40;->g(LKj2;)LKj2;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Lbi2;->b(LE01;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private static final toConfig-25FCGzQ(Lcom/stripe/android/uicore/address/FieldType;IIILjava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldConfig;
    .locals 17

    sget-object v0, Lcom/stripe/android/uicore/address/TransformAddressToElementKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/stripe/android/uicore/elements/PostalCodeConfig;

    const/4 v6, 0x0

    const/16 v8, 0x8

    const/4 v9, 0x0

    move-object v2, v0

    move/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v7, p4

    invoke-direct/range {v2 .. v9}, Lcom/stripe/android/uicore/elements/PostalCodeConfig;-><init>(IIILGX2;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v14, 0x0

    const/16 v15, 0x8

    const/16 v16, 0x0

    move-object v10, v0

    move/from16 v12, p2

    move/from16 v13, p3

    invoke-direct/range {v10 .. v16}, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;-><init>(Ljava/lang/Integer;IILGX2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    return-object v0
.end method

.method private static final toElement-96KqDgQ(Lcom/stripe/android/uicore/address/FieldType;Lcom/stripe/android/uicore/elements/IdentifierSpec;IIILjava/lang/String;Z)Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;
    .locals 8

    new-instance v0, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    new-instance v7, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    invoke-static {p0, p2, p3, p4, p5}, Lcom/stripe/android/uicore/address/TransformAddressToElementKt;->toConfig-25FCGzQ(Lcom/stripe/android/uicore/address/FieldType;IIILjava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldConfig;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v7

    move v3, p6

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, p1, v7}, Lcom/stripe/android/uicore/elements/SimpleTextElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    sget-object p2, Lcom/stripe/android/uicore/address/TransformAddressToElementKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x1

    if-ne p0, p2, :cond_2

    const-string p0, "CA"

    const-string p2, "US"

    filled-new-array {p0, p2}, [Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p3, p5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p5, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    const/4 p3, 0x3

    const/4 p4, 0x0

    const/4 p6, 0x0

    if-eqz p0, :cond_0

    new-instance p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;

    invoke-direct {p0, p4, p6, p3, p6}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;

    invoke-direct {p0, p4, p6, p3, p6}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    new-instance v0, Lcom/stripe/android/uicore/elements/AdministrativeAreaElement;

    new-instance p2, Lcom/stripe/android/uicore/elements/DropdownFieldController;

    new-instance p3, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;

    invoke-direct {p3, p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig;-><init>(Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;)V

    const/4 p0, 0x2

    invoke-direct {p2, p3, p6, p0, p6}, Lcom/stripe/android/uicore/elements/DropdownFieldController;-><init>(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/uicore/elements/AdministrativeAreaElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/DropdownFieldController;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static final transformToElementList(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/address/CountryAddressSchema;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "countryCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getType()Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/uicore/address/FieldType;->SortingCode:Lcom/stripe/android/uicore/address/FieldType;

    if-eq v4, v5, :cond_2

    invoke-virtual {v3}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getType()Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v3

    sget-object v4, Lcom/stripe/android/uicore/address/FieldType;->DependentLocality:Lcom/stripe/android/uicore/address/FieldType;

    if-ne v3, v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :cond_2
    :goto_1
    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getType()Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v1}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getType()Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/uicore/address/FieldType;->getIdentifierSpec()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    invoke-virtual {v1}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getSchema()Lcom/stripe/android/uicore/address/FieldSchema;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lcom/stripe/android/uicore/address/FieldSchema;->getNameType()Lcom/stripe/android/uicore/address/NameType;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lcom/stripe/android/uicore/address/NameType;->getStringResId()I

    move-result v5

    goto :goto_3

    :cond_5
    invoke-virtual {v1}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getType()Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/uicore/address/FieldType;->getDefaultLabel()I

    move-result v5

    :goto_3
    invoke-virtual {v1}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getType()Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/uicore/address/FieldType;->capitalization-IUNYP9k()I

    move-result v6

    invoke-virtual {v1}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getSchema()Lcom/stripe/android/uicore/address/FieldSchema;

    move-result-object v7

    invoke-static {v7}, Lcom/stripe/android/uicore/address/TransformAddressToElementKt;->getKeyboard(Lcom/stripe/android/uicore/address/FieldSchema;)I

    move-result v7

    invoke-virtual {v1}, Lcom/stripe/android/uicore/address/CountryAddressSchema;->getRequired()Z

    move-result v1

    xor-int/lit8 v9, v1, 0x1

    move-object v8, p1

    invoke-static/range {v3 .. v9}, Lcom/stripe/android/uicore/address/TransformAddressToElementKt;->toElement-96KqDgQ(Lcom/stripe/android/uicore/address/FieldType;Lcom/stripe/android/uicore/elements/IdentifierSpec;IIILjava/lang/String;Z)Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    move-result-object v1

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    if-eqz v1, :cond_4

    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    invoke-static {p0}, Lcom/stripe/android/uicore/address/TransformAddressToElementKt;->combineCityAndPostal(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
