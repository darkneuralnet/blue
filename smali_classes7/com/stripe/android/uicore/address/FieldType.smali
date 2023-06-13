.class public enum Lcom/stripe/android/uicore/address/FieldType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LWs5;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/address/FieldType$PostalCode;,
        Lcom/stripe/android/uicore/address/FieldType$SortingCode;,
        Lcom/stripe/android/uicore/address/FieldType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/uicore/address/FieldType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0087\u0001\u0018\u0000 \u00162\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B#\u0008\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0018\u0010\u0005\u001a\u00020\u0002H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0004j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001dj\u0002\u0008\u001e\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/stripe/android/uicore/address/FieldType;",
        "",
        "Lal2;",
        "capitalization-IUNYP9k",
        "()I",
        "capitalization",
        "",
        "serializedValue",
        "Ljava/lang/String;",
        "getSerializedValue",
        "()Ljava/lang/String;",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "identifierSpec",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getIdentifierSpec",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "",
        "defaultLabel",
        "I",
        "getDefaultLabel",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V",
        "Companion",
        "AddressLine1",
        "AddressLine2",
        "Locality",
        "DependentLocality",
        "PostalCode",
        "SortingCode",
        "AdministrativeArea",
        "Name",
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
.field private static final synthetic $VALUES:[Lcom/stripe/android/uicore/address/FieldType;

.field private static final $cachedSerializer$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "LKj2<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final enum AddressLine1:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime LVs5;
        value = "addressLine1"
    .end annotation
.end field

.field public static final enum AddressLine2:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime LVs5;
        value = "addressLine2"
    .end annotation
.end field

.field public static final enum AdministrativeArea:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime LVs5;
        value = "administrativeArea"
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/uicore/address/FieldType$Companion;

.field public static final enum DependentLocality:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime LVs5;
        value = "dependentLocality"
    .end annotation
.end field

.field public static final enum Locality:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime LVs5;
        value = "locality"
    .end annotation
.end field

.field public static final enum Name:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime LVs5;
        value = "name"
    .end annotation
.end field

.field public static final enum PostalCode:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime LVs5;
        value = "postalCode"
    .end annotation
.end field

.field public static final enum SortingCode:Lcom/stripe/android/uicore/address/FieldType;
    .annotation runtime LVs5;
        value = "sortingCode"
    .end annotation
.end field


# instance fields
.field private final defaultLabel:I

.field private final identifierSpec:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private final serializedValue:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/uicore/address/FieldType;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Lcom/stripe/android/uicore/address/FieldType;

    const/4 v1, 0x0

    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->AddressLine1:Lcom/stripe/android/uicore/address/FieldType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->AddressLine2:Lcom/stripe/android/uicore/address/FieldType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->Locality:Lcom/stripe/android/uicore/address/FieldType;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->DependentLocality:Lcom/stripe/android/uicore/address/FieldType;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->PostalCode:Lcom/stripe/android/uicore/address/FieldType;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->SortingCode:Lcom/stripe/android/uicore/address/FieldType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->AdministrativeArea:Lcom/stripe/android/uicore/address/FieldType;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->Name:Lcom/stripe/android/uicore/address/FieldType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 14

    new-instance v6, Lcom/stripe/android/uicore/address/FieldType;

    const-string v1, "AddressLine1"

    const/4 v2, 0x0

    const-string v3, "addressLine1"

    sget-object v7, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getLine1()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    sget v5, Lcom/stripe/android/uicore/R$string;->address_label_address_line1:I

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v6, Lcom/stripe/android/uicore/address/FieldType;->AddressLine1:Lcom/stripe/android/uicore/address/FieldType;

    new-instance v0, Lcom/stripe/android/uicore/address/FieldType;

    const-string v9, "AddressLine2"

    const/4 v10, 0x1

    const-string v11, "addressLine2"

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getLine2()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v12

    sget v13, Lcom/stripe/android/uicore/R$string;->address_label_address_line2:I

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->AddressLine2:Lcom/stripe/android/uicore/address/FieldType;

    new-instance v0, Lcom/stripe/android/uicore/address/FieldType;

    const-string v2, "Locality"

    const/4 v3, 0x2

    const-string v4, "locality"

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCity()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    sget v13, Lcom/stripe/android/uicore/R$string;->address_label_city:I

    move-object v1, v0

    move v6, v13

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->Locality:Lcom/stripe/android/uicore/address/FieldType;

    new-instance v0, Lcom/stripe/android/uicore/address/FieldType;

    const-string v9, "DependentLocality"

    const/4 v10, 0x3

    const-string v11, "dependentLocality"

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getDependentLocality()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v12

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->DependentLocality:Lcom/stripe/android/uicore/address/FieldType;

    new-instance v0, Lcom/stripe/android/uicore/address/FieldType$PostalCode;

    const-string v1, "PostalCode"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/address/FieldType$PostalCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->PostalCode:Lcom/stripe/android/uicore/address/FieldType;

    new-instance v0, Lcom/stripe/android/uicore/address/FieldType$SortingCode;

    const-string v1, "SortingCode"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/address/FieldType$SortingCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->SortingCode:Lcom/stripe/android/uicore/address/FieldType;

    new-instance v0, Lcom/stripe/android/uicore/address/FieldType;

    const-string v9, "AdministrativeArea"

    const/4 v10, 0x6

    const-string v11, "administrativeArea"

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getState()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v12

    sget-object v1, Lcom/stripe/android/uicore/address/NameType;->State:Lcom/stripe/android/uicore/address/NameType;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/address/NameType;->getStringResId()I

    move-result v13

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->AdministrativeArea:Lcom/stripe/android/uicore/address/FieldType;

    new-instance v0, Lcom/stripe/android/uicore/address/FieldType;

    const-string v2, "Name"

    const/4 v3, 0x7

    const-string v4, "name"

    invoke-virtual {v7}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getName()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    sget v6, Lcom/stripe/android/uicore/R$string;->address_label_full_name:I

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->Name:Lcom/stripe/android/uicore/address/FieldType;

    invoke-static {}, Lcom/stripe/android/uicore/address/FieldType;->$values()[Lcom/stripe/android/uicore/address/FieldType;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->$VALUES:[Lcom/stripe/android/uicore/address/FieldType;

    new-instance v0, Lcom/stripe/android/uicore/address/FieldType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/address/FieldType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->Companion:Lcom/stripe/android/uicore/address/FieldType$Companion;

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    sget-object v1, Lcom/stripe/android/uicore/address/FieldType$Companion$$cachedSerializer$delegate$1;->INSTANCE:Lcom/stripe/android/uicore/address/FieldType$Companion$$cachedSerializer$delegate$1;

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/uicore/address/FieldType;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/stripe/android/uicore/address/FieldType;->serializedValue:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/uicore/address/FieldType;->identifierSpec:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput p5, p0, Lcom/stripe/android/uicore/address/FieldType;->defaultLabel:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/uicore/address/FieldType;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V

    return-void
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/Lazy;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/address/FieldType;->$cachedSerializer$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/uicore/address/FieldType;
    .locals 1

    const-class v0, Lcom/stripe/android/uicore/address/FieldType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/address/FieldType;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/uicore/address/FieldType;
    .locals 1

    sget-object v0, Lcom/stripe/android/uicore/address/FieldType;->$VALUES:[Lcom/stripe/android/uicore/address/FieldType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/uicore/address/FieldType;

    return-object v0
.end method


# virtual methods
.method public capitalization-IUNYP9k()I
    .locals 1

    sget-object v0, Lal2;->a:Lal2$a;

    invoke-virtual {v0}, Lal2$a;->d()I

    move-result v0

    return v0
.end method

.method public final getDefaultLabel()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/address/FieldType;->defaultLabel:I

    return v0
.end method

.method public final getIdentifierSpec()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/address/FieldType;->identifierSpec:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final getSerializedValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/address/FieldType;->serializedValue:Ljava/lang/String;

    return-object v0
.end method
