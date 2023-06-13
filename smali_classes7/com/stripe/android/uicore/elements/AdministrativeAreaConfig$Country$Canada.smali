.class public final Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;
.super Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Canada"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0008\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\u0002\u0010\u0008J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001b\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u00c6\u0003J/\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u001a\u0008\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0007H\u00d6\u0001R&\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;",
        "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;",
        "label",
        "",
        "administrativeAreas",
        "",
        "Lkotlin/Pair;",
        "",
        "(ILjava/util/List;)V",
        "getAdministrativeAreas",
        "()Ljava/util/List;",
        "getLabel",
        "()I",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "stripe-ui-core_release"
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
.field private final administrativeAreas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final label:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "administrativeAreas"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;-><init>(ILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->label:I

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->administrativeAreas:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    sget p1, Lcom/stripe/android/uicore/R$string;->address_label_province:I

    :cond_0
    const/4 p4, 0x2

    and-int/2addr p3, p4

    if-eqz p3, :cond_1

    const/16 p2, 0xd

    new-array p2, p2, [Lkotlin/Pair;

    new-instance p3, Lkotlin/Pair;

    const-string v0, "AB"

    const-string v1, "Alberta"

    invoke-direct {p3, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    aput-object p3, p2, v0

    new-instance p3, Lkotlin/Pair;

    const-string v0, "BC"

    const-string v1, "British Columbia"

    invoke-direct {p3, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x1

    aput-object p3, p2, v0

    new-instance p3, Lkotlin/Pair;

    const-string v0, "MB"

    const-string v1, "Manitoba"

    invoke-direct {p3, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "NB"

    const-string v0, "New Brunswick"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p4, 0x3

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "NL"

    const-string v0, "Newfoundland and Labrador"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p4, 0x4

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "NT"

    const-string v0, "Northwest Territories"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p4, 0x5

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "NS"

    const-string v0, "Nova Scotia"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p4, 0x6

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "NU"

    const-string v0, "Nunavut"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p4, 0x7

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "ON"

    const-string v0, "Ontario"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x8

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "PE"

    const-string v0, "Prince Edward Island"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x9

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "QC"

    const-string v0, "Quebec"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0xa

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "SK"

    const-string v0, "Saskatchewan"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0xb

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "YT"

    const-string v0, "Yukon"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0xc

    aput-object p3, p2, p4

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;ILjava/util/List;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->getLabel()I

    move-result p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->getAdministrativeAreas()Ljava/util/List;

    move-result-object p2

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->copy(ILjava/util/List;)Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->getLabel()I

    move-result v0

    return v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->getAdministrativeAreas()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final copy(ILjava/util/List;)Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;"
        }
    .end annotation

    const-string v0, "administrativeAreas"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;-><init>(ILjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->getLabel()I

    move-result v1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->getLabel()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->getAdministrativeAreas()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->getAdministrativeAreas()Ljava/util/List;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getAdministrativeAreas()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->administrativeAreas:Ljava/util/List;

    return-object v0
.end method

.method public getLabel()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->label:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->getLabel()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->getAdministrativeAreas()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->getLabel()I

    move-result v0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$Canada;->getAdministrativeAreas()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Canada(label="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", administrativeAreas="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
