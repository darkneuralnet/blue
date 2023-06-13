.class public final Lco/bird/android/model/RentalPlan;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u0008\n\u0002\u0008\u001a\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00cf\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0008\u0012\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000f\u0012\u0010\u0008\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u001bJ\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000fH\u00c6\u0003J\t\u0010;\u001a\u00020\u0008H\u00c6\u0003J\u000f\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000fH\u00c6\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\t\u0010D\u001a\u00020\u0008H\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00d3\u0001\u0010J\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00082\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000f2\u0010\u0008\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010K\u001a\u000203H\u00d6\u0001J\u0013\u0010L\u001a\u00020\u00082\u0008\u0010M\u001a\u0004\u0018\u00010NH\u00d6\u0003J\t\u0010O\u001a\u000203H\u00d6\u0001J\t\u0010P\u001a\u00020\u0003H\u00d6\u0001J\u000e\u0010Q\u001a\u00020\u00052\u0006\u0010R\u001a\u00020\u0008J\u0019\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u000203H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001dR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001dR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010&R\u001c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010&R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010&R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010&R\u001c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010)R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010)R\u0016\u0010\u0010\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010 R\u0019\u00102\u001a\u0004\u0018\u0001038F\u00a2\u0006\u000c\u0012\u0004\u00084\u00105\u001a\u0004\u00086\u00107R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010&\u00a8\u0006X"
    }
    d2 = {
        "Lco/bird/android/model/RentalPlan;",
        "Landroid/os/Parcelable;",
        "id",
        "",
        "baseCost",
        "",
        "baseTaxCost",
        "birdCare",
        "",
        "birdCareCost",
        "birdCareTaxCost",
        "currency",
        "descriptionLabel",
        "incentiveLabel",
        "includedItems",
        "",
        "recurring",
        "deliveryWindows",
        "Lco/bird/android/model/DeliveryWindow;",
        "notes",
        "Lco/bird/android/model/RentalNote;",
        "kind",
        "Lco/bird/android/model/constant/RentalKind;",
        "birdModel",
        "Lco/bird/android/model/constant/BirdModel;",
        "birdModelDisplayName",
        "specsLink",
        "(Ljava/lang/String;JJZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lco/bird/android/model/constant/RentalKind;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;)V",
        "getBaseCost",
        "()J",
        "getBaseTaxCost",
        "getBirdCare",
        "()Z",
        "getBirdCareCost",
        "getBirdCareTaxCost",
        "getBirdModel",
        "()Lco/bird/android/model/constant/BirdModel;",
        "getBirdModelDisplayName",
        "()Ljava/lang/String;",
        "getCurrency",
        "getDeliveryWindows",
        "()Ljava/util/List;",
        "getDescriptionLabel",
        "getId",
        "getIncentiveLabel",
        "getIncludedItems",
        "getKind",
        "()Lco/bird/android/model/constant/RentalKind;",
        "getNotes",
        "getRecurring",
        "shortestOnDemandEstimate",
        "",
        "getShortestOnDemandEstimate$annotations",
        "()V",
        "getShortestOnDemandEstimate",
        "()Ljava/lang/Integer;",
        "getSpecsLink",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "totalCost",
        "includeBirdCare",
        "writeToParcel",
        "",
        "parcel",
        "Landroid/os/Parcel;",
        "flags",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRentals.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rentals.kt\nco/bird/android/model/RentalPlan\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n1789#2,3:267\n*S KotlinDebug\n*F\n+ 1 Rentals.kt\nco/bird/android/model/RentalPlan\n*L\n138#1:267,3\n*E\n"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lco/bird/android/model/RentalPlan;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final baseCost:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "base_cost"
    .end annotation

    .annotation runtime Lft5;
        value = "base_cost"
    .end annotation
.end field

.field private final baseTaxCost:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "base_tax_cost"
    .end annotation

    .annotation runtime Lft5;
        value = "base_tax_cost"
    .end annotation
.end field

.field private final birdCare:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bird_care"
    .end annotation

    .annotation runtime Lft5;
        value = "bird_care"
    .end annotation
.end field

.field private final birdCareCost:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bird_care_cost"
    .end annotation

    .annotation runtime Lft5;
        value = "bird_care_cost"
    .end annotation
.end field

.field private final birdCareTaxCost:J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bird_care_tax_cost"
    .end annotation

    .annotation runtime Lft5;
        value = "bird_care_tax_cost"
    .end annotation
.end field

.field private final birdModel:Lco/bird/android/model/constant/BirdModel;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bird_model"
    .end annotation

    .annotation runtime Lft5;
        value = "bird_model"
    .end annotation
.end field

.field private final birdModelDisplayName:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bird_model_description"
    .end annotation

    .annotation runtime Lft5;
        value = "bird_model_description"
    .end annotation
.end field

.field private final currency:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "currency"
    .end annotation

    .annotation runtime Lft5;
        value = "currency"
    .end annotation
.end field

.field private final deliveryWindows:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "delivery_windows"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/DeliveryWindow;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "delivery_windows"
    .end annotation
.end field

.field private final descriptionLabel:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "description_label"
    .end annotation

    .annotation runtime Lft5;
        value = "description_label"
    .end annotation
.end field

.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "id"
    .end annotation

    .annotation runtime Lft5;
        value = "id"
    .end annotation
.end field

.field private final incentiveLabel:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "incentive_label"
    .end annotation

    .annotation runtime Lft5;
        value = "incentive_label"
    .end annotation
.end field

.field private final includedItems:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "included_items"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "included_items"
    .end annotation
.end field

.field private final kind:Lco/bird/android/model/constant/RentalKind;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "kind"
    .end annotation

    .annotation runtime Lft5;
        value = "kind"
    .end annotation
.end field

.field private final notes:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "plan_notes"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/RentalNote;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "plan_notes"
    .end annotation
.end field

.field private final recurring:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "recurring"
    .end annotation

    .annotation runtime Lft5;
        value = "recurring"
    .end annotation
.end field

.field private final specsLink:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "specs_link"
    .end annotation

    .annotation runtime Lft5;
        value = "specs_link"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/model/RentalPlan$Creator;

    invoke-direct {v0}, Lco/bird/android/model/RentalPlan$Creator;-><init>()V

    sput-object v0, Lco/bird/android/model/RentalPlan;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 24

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v22, 0x1ffff

    const/16 v23, 0x0

    invoke-direct/range {v0 .. v23}, Lco/bird/android/model/RentalPlan;-><init>(Ljava/lang/String;JJZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lco/bird/android/model/constant/RentalKind;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JJZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lco/bird/android/model/constant/RentalKind;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJZJJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/util/List<",
            "Lco/bird/android/model/DeliveryWindow;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/RentalNote;",
            ">;",
            "Lco/bird/android/model/constant/RentalKind;",
            "Lco/bird/android/model/constant/BirdModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p11

    move-object/from16 v3, p14

    move-object/from16 v4, p16

    const-string v5, "id"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "currency"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "includedItems"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "deliveryWindows"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lco/bird/android/model/RentalPlan;->id:Ljava/lang/String;

    move-wide v5, p2

    iput-wide v5, v0, Lco/bird/android/model/RentalPlan;->baseCost:J

    move-wide v5, p4

    iput-wide v5, v0, Lco/bird/android/model/RentalPlan;->baseTaxCost:J

    move v1, p6

    iput-boolean v1, v0, Lco/bird/android/model/RentalPlan;->birdCare:Z

    move-wide v5, p7

    iput-wide v5, v0, Lco/bird/android/model/RentalPlan;->birdCareCost:J

    move-wide/from16 v5, p9

    iput-wide v5, v0, Lco/bird/android/model/RentalPlan;->birdCareTaxCost:J

    iput-object v2, v0, Lco/bird/android/model/RentalPlan;->currency:Ljava/lang/String;

    move-object/from16 v1, p12

    iput-object v1, v0, Lco/bird/android/model/RentalPlan;->descriptionLabel:Ljava/lang/String;

    move-object/from16 v1, p13

    iput-object v1, v0, Lco/bird/android/model/RentalPlan;->incentiveLabel:Ljava/lang/String;

    iput-object v3, v0, Lco/bird/android/model/RentalPlan;->includedItems:Ljava/util/List;

    move/from16 v1, p15

    iput-boolean v1, v0, Lco/bird/android/model/RentalPlan;->recurring:Z

    iput-object v4, v0, Lco/bird/android/model/RentalPlan;->deliveryWindows:Ljava/util/List;

    move-object/from16 v1, p17

    iput-object v1, v0, Lco/bird/android/model/RentalPlan;->notes:Ljava/util/List;

    move-object/from16 v1, p18

    iput-object v1, v0, Lco/bird/android/model/RentalPlan;->kind:Lco/bird/android/model/constant/RentalKind;

    move-object/from16 v1, p19

    iput-object v1, v0, Lco/bird/android/model/RentalPlan;->birdModel:Lco/bird/android/model/constant/BirdModel;

    move-object/from16 v1, p20

    iput-object v1, v0, Lco/bird/android/model/RentalPlan;->birdModelDisplayName:Ljava/lang/String;

    move-object/from16 v1, p21

    iput-object v1, v0, Lco/bird/android/model/RentalPlan;->specsLink:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JJZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lco/bird/android/model/constant/RentalKind;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p22

    and-int/lit8 v1, v0, 0x1

    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    const-wide/16 v4, 0x0

    if-eqz v3, :cond_1

    move-wide v6, v4

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    move-wide v8, v4

    goto :goto_2

    :cond_2
    move-wide/from16 v8, p4

    :goto_2
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    move/from16 v3, p6

    :goto_3
    and-int/lit8 v11, v0, 0x10

    if-eqz v11, :cond_4

    move-wide v11, v4

    goto :goto_4

    :cond_4
    move-wide/from16 v11, p7

    :goto_4
    and-int/lit8 v13, v0, 0x20

    if-eqz v13, :cond_5

    goto :goto_5

    :cond_5
    move-wide/from16 v4, p9

    :goto_5
    and-int/lit8 v13, v0, 0x40

    if-eqz v13, :cond_6

    goto :goto_6

    :cond_6
    move-object/from16 v2, p11

    :goto_6
    and-int/lit16 v13, v0, 0x80

    if-eqz v13, :cond_7

    const/4 v13, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v13, p12

    :goto_7
    and-int/lit16 v15, v0, 0x100

    if-eqz v15, :cond_8

    const/4 v15, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v15, p13

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v10

    goto :goto_9

    :cond_9
    move-object/from16 v10, p14

    :goto_9
    and-int/lit16 v14, v0, 0x400

    if-eqz v14, :cond_a

    const/4 v14, 0x0

    goto :goto_a

    :cond_a
    move/from16 v14, p15

    :goto_a
    move/from16 p23, v14

    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v14

    goto :goto_b

    :cond_b
    move-object/from16 v14, p16

    :goto_b
    move-object/from16 v16, v14

    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v14, p17

    :goto_c
    move-object/from16 v17, v14

    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_d

    const/4 v14, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v14, p18

    :goto_d
    move-object/from16 v18, v14

    and-int/lit16 v14, v0, 0x4000

    if-eqz v14, :cond_e

    const/4 v14, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v14, p19

    :goto_e
    const v19, 0x8000

    and-int v19, v0, v19

    if-eqz v19, :cond_f

    const/16 v19, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v19, p20

    :goto_f
    const/high16 v20, 0x10000

    and-int v0, v0, v20

    if-eqz v0, :cond_10

    const/4 v0, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v0, p21

    :goto_10
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-wide/from16 p3, v6

    move-wide/from16 p5, v8

    move/from16 p7, v3

    move-wide/from16 p8, v11

    move-wide/from16 p10, v4

    move-object/from16 p12, v2

    move-object/from16 p13, v13

    move-object/from16 p14, v15

    move-object/from16 p15, v10

    move/from16 p16, p23

    move-object/from16 p17, v16

    move-object/from16 p18, v17

    move-object/from16 p19, v18

    move-object/from16 p20, v14

    move-object/from16 p21, v19

    move-object/from16 p22, v0

    invoke-direct/range {p1 .. p22}, Lco/bird/android/model/RentalPlan;-><init>(Ljava/lang/String;JJZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lco/bird/android/model/constant/RentalKind;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/RentalPlan;Ljava/lang/String;JJZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lco/bird/android/model/constant/RentalKind;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/RentalPlan;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p22

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/RentalPlan;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lco/bird/android/model/RentalPlan;->baseCost:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-wide v5, v0, Lco/bird/android/model/RentalPlan;->baseTaxCost:J

    goto :goto_2

    :cond_2
    move-wide/from16 v5, p4

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget-boolean v7, v0, Lco/bird/android/model/RentalPlan;->birdCare:Z

    goto :goto_3

    :cond_3
    move/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget-wide v8, v0, Lco/bird/android/model/RentalPlan;->birdCareCost:J

    goto :goto_4

    :cond_4
    move-wide/from16 v8, p7

    :goto_4
    and-int/lit8 v10, v1, 0x20

    if-eqz v10, :cond_5

    iget-wide v10, v0, Lco/bird/android/model/RentalPlan;->birdCareTaxCost:J

    goto :goto_5

    :cond_5
    move-wide/from16 v10, p9

    :goto_5
    and-int/lit8 v12, v1, 0x40

    if-eqz v12, :cond_6

    iget-object v12, v0, Lco/bird/android/model/RentalPlan;->currency:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v12, p11

    :goto_6
    and-int/lit16 v13, v1, 0x80

    if-eqz v13, :cond_7

    iget-object v13, v0, Lco/bird/android/model/RentalPlan;->descriptionLabel:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v13, p12

    :goto_7
    and-int/lit16 v14, v1, 0x100

    if-eqz v14, :cond_8

    iget-object v14, v0, Lco/bird/android/model/RentalPlan;->incentiveLabel:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v14, p13

    :goto_8
    and-int/lit16 v15, v1, 0x200

    if-eqz v15, :cond_9

    iget-object v15, v0, Lco/bird/android/model/RentalPlan;->includedItems:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v15, p14

    :goto_9
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x400

    if-eqz v15, :cond_a

    iget-boolean v15, v0, Lco/bird/android/model/RentalPlan;->recurring:Z

    goto :goto_a

    :cond_a
    move/from16 v15, p15

    :goto_a
    move/from16 p15, v15

    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget-object v15, v0, Lco/bird/android/model/RentalPlan;->deliveryWindows:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 v15, p16

    :goto_b
    move-object/from16 p16, v15

    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lco/bird/android/model/RentalPlan;->notes:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p17

    :goto_c
    move-object/from16 p17, v15

    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lco/bird/android/model/RentalPlan;->kind:Lco/bird/android/model/constant/RentalKind;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p18

    :goto_d
    move-object/from16 p18, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lco/bird/android/model/RentalPlan;->birdModel:Lco/bird/android/model/constant/BirdModel;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p19

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p19, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lco/bird/android/model/RentalPlan;->birdModelDisplayName:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p20

    :goto_f
    const/high16 v16, 0x10000

    and-int v1, v1, v16

    if-eqz v1, :cond_10

    iget-object v1, v0, Lco/bird/android/model/RentalPlan;->specsLink:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p21

    :goto_10
    move-object/from16 p1, v2

    move-wide/from16 p2, v3

    move-wide/from16 p4, v5

    move/from16 p6, v7

    move-wide/from16 p7, v8

    move-wide/from16 p9, v10

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p20, v15

    move-object/from16 p21, v1

    invoke-virtual/range {p0 .. p21}, Lco/bird/android/model/RentalPlan;->copy(Ljava/lang/String;JJZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lco/bird/android/model/constant/RentalKind;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/RentalPlan;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getShortestOnDemandEstimate$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->includedItems:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/RentalPlan;->recurring:Z

    return v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/DeliveryWindow;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->deliveryWindows:Ljava/util/List;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/RentalNote;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->notes:Ljava/util/List;

    return-object v0
.end method

.method public final component14()Lco/bird/android/model/constant/RentalKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->kind:Lco/bird/android/model/constant/RentalKind;

    return-object v0
.end method

.method public final component15()Lco/bird/android/model/constant/BirdModel;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->birdModel:Lco/bird/android/model/constant/BirdModel;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->birdModelDisplayName:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->specsLink:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/RentalPlan;->baseCost:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/RentalPlan;->baseTaxCost:J

    return-wide v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/RentalPlan;->birdCare:Z

    return v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/RentalPlan;->birdCareCost:J

    return-wide v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/RentalPlan;->birdCareTaxCost:J

    return-wide v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->descriptionLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->incentiveLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;JJZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lco/bird/android/model/constant/RentalKind;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/RentalPlan;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JJZJJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/util/List<",
            "Lco/bird/android/model/DeliveryWindow;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/RentalNote;",
            ">;",
            "Lco/bird/android/model/constant/RentalKind;",
            "Lco/bird/android/model/constant/BirdModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lco/bird/android/model/RentalPlan;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    move-wide/from16 v4, p4

    move/from16 v6, p6

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    const-string v0, "id"

    move-object/from16 v22, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    move-object/from16 v1, p11

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "includedItems"

    move-object/from16 v1, p14

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deliveryWindows"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v23, Lco/bird/android/model/RentalPlan;

    move-object/from16 v0, v23

    move-object/from16 v1, v22

    invoke-direct/range {v0 .. v21}, Lco/bird/android/model/RentalPlan;-><init>(Ljava/lang/String;JJZJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lco/bird/android/model/constant/RentalKind;Lco/bird/android/model/constant/BirdModel;Ljava/lang/String;Ljava/lang/String;)V

    return-object v23
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/RentalPlan;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/RentalPlan;

    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->id:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/RentalPlan;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/bird/android/model/RentalPlan;->baseCost:J

    iget-wide v5, p1, Lco/bird/android/model/RentalPlan;->baseCost:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/bird/android/model/RentalPlan;->baseTaxCost:J

    iget-wide v5, p1, Lco/bird/android/model/RentalPlan;->baseTaxCost:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/android/model/RentalPlan;->birdCare:Z

    iget-boolean v3, p1, Lco/bird/android/model/RentalPlan;->birdCare:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lco/bird/android/model/RentalPlan;->birdCareCost:J

    iget-wide v5, p1, Lco/bird/android/model/RentalPlan;->birdCareCost:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lco/bird/android/model/RentalPlan;->birdCareTaxCost:J

    iget-wide v5, p1, Lco/bird/android/model/RentalPlan;->birdCareTaxCost:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/RentalPlan;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->descriptionLabel:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/RentalPlan;->descriptionLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->incentiveLabel:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/RentalPlan;->incentiveLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->includedItems:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/RentalPlan;->includedItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lco/bird/android/model/RentalPlan;->recurring:Z

    iget-boolean v3, p1, Lco/bird/android/model/RentalPlan;->recurring:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->deliveryWindows:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/RentalPlan;->deliveryWindows:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->notes:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/RentalPlan;->notes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->kind:Lco/bird/android/model/constant/RentalKind;

    iget-object v3, p1, Lco/bird/android/model/RentalPlan;->kind:Lco/bird/android/model/constant/RentalKind;

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->birdModel:Lco/bird/android/model/constant/BirdModel;

    iget-object v3, p1, Lco/bird/android/model/RentalPlan;->birdModel:Lco/bird/android/model/constant/BirdModel;

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->birdModelDisplayName:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/RentalPlan;->birdModelDisplayName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->specsLink:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/RentalPlan;->specsLink:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final getBaseCost()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/RentalPlan;->baseCost:J

    return-wide v0
.end method

.method public final getBaseTaxCost()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/RentalPlan;->baseTaxCost:J

    return-wide v0
.end method

.method public final getBirdCare()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/RentalPlan;->birdCare:Z

    return v0
.end method

.method public final getBirdCareCost()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/RentalPlan;->birdCareCost:J

    return-wide v0
.end method

.method public final getBirdCareTaxCost()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/RentalPlan;->birdCareTaxCost:J

    return-wide v0
.end method

.method public final getBirdModel()Lco/bird/android/model/constant/BirdModel;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->birdModel:Lco/bird/android/model/constant/BirdModel;

    return-object v0
.end method

.method public final getBirdModelDisplayName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->birdModelDisplayName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeliveryWindows()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/DeliveryWindow;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->deliveryWindows:Ljava/util/List;

    return-object v0
.end method

.method public final getDescriptionLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->descriptionLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getIncentiveLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->incentiveLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getIncludedItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->includedItems:Ljava/util/List;

    return-object v0
.end method

.method public final getKind()Lco/bird/android/model/constant/RentalKind;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->kind:Lco/bird/android/model/constant/RentalKind;

    return-object v0
.end method

.method public final getNotes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/RentalNote;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->notes:Ljava/util/List;

    return-object v0
.end method

.method public final getRecurring()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/RentalPlan;->recurring:Z

    return v0
.end method

.method public final getShortestOnDemandEstimate()Ljava/lang/Integer;
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->deliveryWindows:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/DeliveryWindow;

    if-nez v1, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/DeliveryWindow;->getOnDemandEstimatedTime()Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lco/bird/android/model/DeliveryWindow;->getOnDemandEstimatedTime()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2}, Lco/bird/android/model/DeliveryWindow;->getOnDemandEstimatedTime()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-le v3, v4, :cond_0

    invoke-virtual {v2}, Lco/bird/android/model/DeliveryWindow;->getOnDemandEstimatedTime()Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public final getSpecsLink()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->specsLink:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/RentalPlan;->baseCost:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/RentalPlan;->baseTaxCost:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/RentalPlan;->birdCare:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lco/bird/android/model/RentalPlan;->birdCareCost:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lco/bird/android/model/RentalPlan;->birdCareTaxCost:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->currency:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->descriptionLabel:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v1, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->incentiveLabel:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v3

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->includedItems:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/RentalPlan;->recurring:Z

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    move v2, v1

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->deliveryWindows:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->notes:Ljava/util/List;

    if-nez v1, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->kind:Lco/bird/android/model/constant/RentalKind;

    if-nez v1, :cond_5

    move v1, v3

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->birdModel:Lco/bird/android/model/constant/BirdModel;

    if-nez v1, :cond_6

    move v1, v3

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->birdModelDisplayName:Ljava/lang/String;

    if-nez v1, :cond_7

    move v1, v3

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/RentalPlan;->specsLink:Ljava/lang/String;

    if-nez v1, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/model/RentalPlan;->id:Ljava/lang/String;

    iget-wide v2, v0, Lco/bird/android/model/RentalPlan;->baseCost:J

    iget-wide v4, v0, Lco/bird/android/model/RentalPlan;->baseTaxCost:J

    iget-boolean v6, v0, Lco/bird/android/model/RentalPlan;->birdCare:Z

    iget-wide v7, v0, Lco/bird/android/model/RentalPlan;->birdCareCost:J

    iget-wide v9, v0, Lco/bird/android/model/RentalPlan;->birdCareTaxCost:J

    iget-object v11, v0, Lco/bird/android/model/RentalPlan;->currency:Ljava/lang/String;

    iget-object v12, v0, Lco/bird/android/model/RentalPlan;->descriptionLabel:Ljava/lang/String;

    iget-object v13, v0, Lco/bird/android/model/RentalPlan;->incentiveLabel:Ljava/lang/String;

    iget-object v14, v0, Lco/bird/android/model/RentalPlan;->includedItems:Ljava/util/List;

    iget-boolean v15, v0, Lco/bird/android/model/RentalPlan;->recurring:Z

    move/from16 v16, v15

    iget-object v15, v0, Lco/bird/android/model/RentalPlan;->deliveryWindows:Ljava/util/List;

    move-object/from16 v17, v15

    iget-object v15, v0, Lco/bird/android/model/RentalPlan;->notes:Ljava/util/List;

    move-object/from16 v18, v15

    iget-object v15, v0, Lco/bird/android/model/RentalPlan;->kind:Lco/bird/android/model/constant/RentalKind;

    move-object/from16 v19, v15

    iget-object v15, v0, Lco/bird/android/model/RentalPlan;->birdModel:Lco/bird/android/model/constant/BirdModel;

    move-object/from16 v20, v15

    iget-object v15, v0, Lco/bird/android/model/RentalPlan;->birdModelDisplayName:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lco/bird/android/model/RentalPlan;->specsLink:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v22, v15

    const-string v15, "RentalPlan(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", baseCost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", baseTaxCost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", birdCare="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", birdCareCost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", birdCareTaxCost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", currency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", descriptionLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", incentiveLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", includedItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", recurring="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", deliveryWindows="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", notes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", kind="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", birdModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", birdModelDisplayName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", specsLink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final totalCost(Z)J
    .locals 6

    iget-wide v0, p0, Lco/bird/android/model/RentalPlan;->baseCost:J

    iget-wide v2, p0, Lco/bird/android/model/RentalPlan;->baseTaxCost:J

    add-long/2addr v0, v2

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/RentalPlan;->birdCare:Z

    if-eqz p1, :cond_0

    iget-wide v2, p0, Lco/bird/android/model/RentalPlan;->birdCareCost:J

    iget-wide v4, p0, Lco/bird/android/model/RentalPlan;->birdCareTaxCost:J

    add-long/2addr v2, v4

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    add-long/2addr v0, v2

    return-wide v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lco/bird/android/model/RentalPlan;->baseCost:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lco/bird/android/model/RentalPlan;->baseTaxCost:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-boolean v0, p0, Lco/bird/android/model/RentalPlan;->birdCare:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v0, p0, Lco/bird/android/model/RentalPlan;->birdCareCost:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v0, p0, Lco/bird/android/model/RentalPlan;->birdCareTaxCost:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->currency:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->descriptionLabel:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->incentiveLabel:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->includedItems:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-boolean v0, p0, Lco/bird/android/model/RentalPlan;->recurring:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->deliveryWindows:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/DeliveryWindow;

    invoke-virtual {v1, p1, p2}, Lco/bird/android/model/DeliveryWindow;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/model/RentalPlan;->notes:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/RentalNote;

    invoke-virtual {v3, p1, p2}, Lco/bird/android/model/RentalNote;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_2
    :goto_2
    iget-object p2, p0, Lco/bird/android/model/RentalPlan;->kind:Lco/bird/android/model/constant/RentalKind;

    if-nez p2, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_3
    iget-object p2, p0, Lco/bird/android/model/RentalPlan;->birdModel:Lco/bird/android/model/constant/BirdModel;

    if-nez p2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_4
    iget-object p2, p0, Lco/bird/android/model/RentalPlan;->birdModelDisplayName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lco/bird/android/model/RentalPlan;->specsLink:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
