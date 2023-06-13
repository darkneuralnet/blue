.class public final Lcom/stripe/android/model/PersonTokenParams$Builder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/ObjectBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PersonTokenParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/ObjectBuilder<",
        "Lcom/stripe/android/model/PersonTokenParams;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\u001e\u001a\u00020\u0002H\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010 \u001a\u00020\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010!\u001a\u00020\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\"\u001a\u00020\u00002\u0008\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010#\u001a\u00020\u00002\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cJ\u0010\u0010$\u001a\u00020\u00002\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cJ\u0010\u0010%\u001a\u00020\u00002\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000cJ\u0010\u0010&\u001a\u00020\u00002\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000cJ\u0010\u0010\'\u001a\u00020\u00002\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000cJ\u0010\u0010(\u001a\u00020\u00002\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u000cJ\u0010\u0010)\u001a\u00020\u00002\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000cJ\u0010\u0010*\u001a\u00020\u00002\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000cJ\u0010\u0010+\u001a\u00020\u00002\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u000cJ\u0010\u0010,\u001a\u00020\u00002\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u000cJ\u001c\u0010-\u001a\u00020\u00002\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0017J\u0010\u0010.\u001a\u00020\u00002\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u000cJ\u0010\u0010/\u001a\u00020\u00002\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u00100\u001a\u00020\u00002\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u000cJ\u0010\u00101\u001a\u00020\u00002\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"
    }
    d2 = {
        "Lcom/stripe/android/model/PersonTokenParams$Builder;",
        "Lcom/stripe/android/ObjectBuilder;",
        "Lcom/stripe/android/model/PersonTokenParams;",
        "()V",
        "address",
        "Lcom/stripe/android/model/Address;",
        "addressKana",
        "Lcom/stripe/android/model/AddressJapanParams;",
        "addressKanji",
        "dateOfBirth",
        "Lcom/stripe/android/model/DateOfBirth;",
        "email",
        "",
        "firstName",
        "firstNameKana",
        "firstNameKanji",
        "gender",
        "idNumber",
        "lastName",
        "lastNameKana",
        "lastNameKanji",
        "maidenName",
        "metadata",
        "",
        "phone",
        "relationship",
        "Lcom/stripe/android/model/PersonTokenParams$Relationship;",
        "ssnLast4",
        "verification",
        "Lcom/stripe/android/model/PersonTokenParams$Verification;",
        "build",
        "setAddress",
        "setAddressKana",
        "setAddressKanji",
        "setDateOfBirth",
        "setEmail",
        "setFirstName",
        "setFirstNameKana",
        "setFirstNameKanji",
        "setGender",
        "setIdNumber",
        "setLastName",
        "setLastNameKana",
        "setLastNameKanji",
        "setMaidenName",
        "setMetadata",
        "setPhone",
        "setRelationship",
        "setSsnLast4",
        "setVerification",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private address:Lcom/stripe/android/model/Address;

.field private addressKana:Lcom/stripe/android/model/AddressJapanParams;

.field private addressKanji:Lcom/stripe/android/model/AddressJapanParams;

.field private dateOfBirth:Lcom/stripe/android/model/DateOfBirth;

.field private email:Ljava/lang/String;

.field private firstName:Ljava/lang/String;

.field private firstNameKana:Ljava/lang/String;

.field private firstNameKanji:Ljava/lang/String;

.field private gender:Ljava/lang/String;

.field private idNumber:Ljava/lang/String;

.field private lastName:Ljava/lang/String;

.field private lastNameKana:Ljava/lang/String;

.field private lastNameKanji:Ljava/lang/String;

.field private maidenName:Ljava/lang/String;

.field private metadata:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private phone:Ljava/lang/String;

.field private relationship:Lcom/stripe/android/model/PersonTokenParams$Relationship;

.field private ssnLast4:Ljava/lang/String;

.field private verification:Lcom/stripe/android/model/PersonTokenParams$Verification;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/model/PersonTokenParams;
    .locals 23

    move-object/from16 v0, p0

    new-instance v21, Lcom/stripe/android/model/PersonTokenParams;

    move-object/from16 v1, v21

    iget-object v2, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->address:Lcom/stripe/android/model/Address;

    iget-object v3, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->addressKana:Lcom/stripe/android/model/AddressJapanParams;

    iget-object v4, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->addressKanji:Lcom/stripe/android/model/AddressJapanParams;

    iget-object v5, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->dateOfBirth:Lcom/stripe/android/model/DateOfBirth;

    iget-object v6, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->email:Ljava/lang/String;

    iget-object v7, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->firstName:Ljava/lang/String;

    iget-object v8, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->firstNameKana:Ljava/lang/String;

    iget-object v9, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->firstNameKanji:Ljava/lang/String;

    iget-object v10, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->gender:Ljava/lang/String;

    iget-object v11, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->idNumber:Ljava/lang/String;

    iget-object v12, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->lastName:Ljava/lang/String;

    iget-object v13, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->lastNameKana:Ljava/lang/String;

    iget-object v14, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->lastNameKanji:Ljava/lang/String;

    iget-object v15, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->maidenName:Ljava/lang/String;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->metadata:Ljava/util/Map;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->phone:Ljava/lang/String;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->relationship:Lcom/stripe/android/model/PersonTokenParams$Relationship;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->ssnLast4:Ljava/lang/String;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/stripe/android/model/PersonTokenParams$Builder;->verification:Lcom/stripe/android/model/PersonTokenParams$Verification;

    move-object/from16 v20, v1

    move-object/from16 v1, v22

    invoke-direct/range {v1 .. v20}, Lcom/stripe/android/model/PersonTokenParams;-><init>(Lcom/stripe/android/model/Address;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/AddressJapanParams;Lcom/stripe/android/model/DateOfBirth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/model/PersonTokenParams$Relationship;Ljava/lang/String;Lcom/stripe/android/model/PersonTokenParams$Verification;)V

    return-object v21
.end method

.method public bridge synthetic build()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/model/PersonTokenParams$Builder;->build()Lcom/stripe/android/model/PersonTokenParams;

    move-result-object v0

    return-object v0
.end method

.method public final setAddress(Lcom/stripe/android/model/Address;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->address:Lcom/stripe/android/model/Address;

    return-object p0
.end method

.method public final setAddressKana(Lcom/stripe/android/model/AddressJapanParams;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->addressKana:Lcom/stripe/android/model/AddressJapanParams;

    return-object p0
.end method

.method public final setAddressKanji(Lcom/stripe/android/model/AddressJapanParams;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->addressKanji:Lcom/stripe/android/model/AddressJapanParams;

    return-object p0
.end method

.method public final setDateOfBirth(Lcom/stripe/android/model/DateOfBirth;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->dateOfBirth:Lcom/stripe/android/model/DateOfBirth;

    return-object p0
.end method

.method public final setEmail(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->email:Ljava/lang/String;

    return-object p0
.end method

.method public final setFirstName(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->firstName:Ljava/lang/String;

    return-object p0
.end method

.method public final setFirstNameKana(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->firstNameKana:Ljava/lang/String;

    return-object p0
.end method

.method public final setFirstNameKanji(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->firstNameKanji:Ljava/lang/String;

    return-object p0
.end method

.method public final setGender(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->gender:Ljava/lang/String;

    return-object p0
.end method

.method public final setIdNumber(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->idNumber:Ljava/lang/String;

    return-object p0
.end method

.method public final setLastName(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->lastName:Ljava/lang/String;

    return-object p0
.end method

.method public final setLastNameKana(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->lastNameKana:Ljava/lang/String;

    return-object p0
.end method

.method public final setLastNameKanji(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->lastNameKanji:Ljava/lang/String;

    return-object p0
.end method

.method public final setMaidenName(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->maidenName:Ljava/lang/String;

    return-object p0
.end method

.method public final setMetadata(Ljava/util/Map;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/model/PersonTokenParams$Builder;"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->metadata:Ljava/util/Map;

    return-object p0
.end method

.method public final setPhone(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->phone:Ljava/lang/String;

    return-object p0
.end method

.method public final setRelationship(Lcom/stripe/android/model/PersonTokenParams$Relationship;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->relationship:Lcom/stripe/android/model/PersonTokenParams$Relationship;

    return-object p0
.end method

.method public final setSsnLast4(Ljava/lang/String;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->ssnLast4:Ljava/lang/String;

    return-object p0
.end method

.method public final setVerification(Lcom/stripe/android/model/PersonTokenParams$Verification;)Lcom/stripe/android/model/PersonTokenParams$Builder;
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/model/PersonTokenParams$Builder;->verification:Lcom/stripe/android/model/PersonTokenParams$Verification;

    return-object p0
.end method
