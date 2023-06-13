.class public final Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;
.super Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "US"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0008\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\u0002\u0010\u0008J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001b\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u00c6\u0003J/\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u001a\u0008\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0007H\u00d6\u0001R&\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;",
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

    invoke-direct {p0, v2, v0, v1, v0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    iput p1, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->label:I

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->administrativeAreas:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    sget p1, Lcom/stripe/android/uicore/R$string;->address_label_state:I

    :cond_0
    const/4 p4, 0x2

    and-int/2addr p3, p4

    if-eqz p3, :cond_1

    const/16 p2, 0x3e

    new-array p2, p2, [Lkotlin/Pair;

    new-instance p3, Lkotlin/Pair;

    const-string v0, "AL"

    const-string v1, "Alabama"

    invoke-direct {p3, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    aput-object p3, p2, v0

    new-instance p3, Lkotlin/Pair;

    const-string v0, "AK"

    const-string v1, "Alaska"

    invoke-direct {p3, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x1

    aput-object p3, p2, v0

    new-instance p3, Lkotlin/Pair;

    const-string v0, "AS"

    const-string v1, "American Samoa"

    invoke-direct {p3, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "AZ"

    const-string v0, "Arizona"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p4, 0x3

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "AR"

    const-string v0, "Arkansas"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p4, 0x4

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "AA"

    const-string v0, "Armed Forces (AA)"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p4, 0x5

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "AE"

    const-string v0, "Armed Forces (AE)"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p4, 0x6

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "AP"

    const-string v0, "Armed Forces (AP)"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p4, 0x7

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "CA"

    const-string v0, "California"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x8

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "CO"

    const-string v0, "Colorado"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x9

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "CT"

    const-string v0, "Connecticut"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0xa

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "DE"

    const-string v0, "Delaware"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0xb

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "DC"

    const-string v0, "District of Columbia"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0xc

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "FL"

    const-string v0, "Florida"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0xd

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "GA"

    const-string v0, "Georgia"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0xe

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "GU"

    const-string v0, "Guam"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0xf

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "HI"

    const-string v0, "Hawaii"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x10

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "ID"

    const-string v0, "Idaho"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x11

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "IL"

    const-string v0, "Illinois"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x12

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "IN"

    const-string v0, "Indiana"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x13

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "IA"

    const-string v0, "Iowa"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x14

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "KS"

    const-string v0, "Kansas"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x15

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "KY"

    const-string v0, "Kentucky"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x16

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "LA"

    const-string v0, "Louisiana"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x17

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "ME"

    const-string v0, "Maine"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x18

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "MH"

    const-string v0, "Marshal Islands"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x19

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "MD"

    const-string v0, "Maryland"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x1a

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "MA"

    const-string v0, "Massachusetts"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x1b

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "MI"

    const-string v0, "Michigan"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x1c

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "FM"

    const-string v0, "Micronesia"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x1d

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "MN"

    const-string v0, "Minnesota"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x1e

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "MS"

    const-string v0, "Mississippi"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x1f

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "MO"

    const-string v0, "Missouri"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x20

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "MT"

    const-string v0, "Montana"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x21

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "NE"

    const-string v0, "Nebraska"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x22

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "NV"

    const-string v0, "Nevada"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x23

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "NH"

    const-string v0, "New Hampshire"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x24

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "NJ"

    const-string v0, "New Jersey"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x25

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "NM"

    const-string v0, "New Mexico"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x26

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "NY"

    const-string v0, "New York"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x27

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "NC"

    const-string v0, "North Carolina"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x28

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "ND"

    const-string v0, "North Dakota"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x29

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "MP"

    const-string v0, "Northern Mariana Islands"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x2a

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "OH"

    const-string v0, "Ohio"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x2b

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "OK"

    const-string v0, "Oklahoma"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x2c

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "OR"

    const-string v0, "Oregon"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x2d

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "PW"

    const-string v0, "Palau"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x2e

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "PA"

    const-string v0, "Pennsylvania"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x2f

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "PR"

    const-string v0, "Puerto Rico"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x30

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "RI"

    const-string v0, "Rhode Island"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x31

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "SC"

    const-string v0, "South Carolina"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x32

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "SD"

    const-string v0, "South Dakota"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x33

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "TN"

    const-string v0, "Tennessee"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x34

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "TX"

    const-string v0, "Texas"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x35

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "UT"

    const-string v0, "Utah"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x36

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "VT"

    const-string v0, "Vermont"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x37

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "VI"

    const-string v0, "Virgin Islands"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x38

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "VA"

    const-string v0, "Virginia"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x39

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "WA"

    const-string v0, "Washington"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x3a

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "WV"

    const-string v0, "West Virginia"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x3b

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "WI"

    const-string v0, "Wisconsin"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x3c

    aput-object p3, p2, p4

    new-instance p3, Lkotlin/Pair;

    const-string p4, "WY"

    const-string v0, "Wyoming"

    invoke-direct {p3, p4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p4, 0x3d

    aput-object p3, p2, p4

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;ILjava/util/List;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->getLabel()I

    move-result p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->getAdministrativeAreas()Ljava/util/List;

    move-result-object p2

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->copy(ILjava/util/List;)Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->getLabel()I

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

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->getAdministrativeAreas()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final copy(ILjava/util/List;)Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;"
        }
    .end annotation

    const-string v0, "administrativeAreas"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;-><init>(ILjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->getLabel()I

    move-result v1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->getLabel()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->getAdministrativeAreas()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->getAdministrativeAreas()Ljava/util/List;

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

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->administrativeAreas:Ljava/util/List;

    return-object v0
.end method

.method public getLabel()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->label:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->getLabel()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->getAdministrativeAreas()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->getLabel()I

    move-result v0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AdministrativeAreaConfig$Country$US;->getAdministrativeAreas()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "US(label="

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
