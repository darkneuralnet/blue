.class public final Lco/bird/android/model/persistence/RidePassView;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u000b\n\u0002\u0008:\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00b7\u0002\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0008\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001d\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010$\u00a2\u0006\u0002\u0010&J\u0010\u0010V\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00108J\t\u0010W\u001a\u00020\u0005H\u00c6\u0003J\t\u0010X\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u000b\u0010^\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u0005H\u00c6\u0003J\t\u0010a\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010d\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001dH\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010 H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010$H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010$H\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010k\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00108J\u0010\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00108J\t\u0010n\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00cc\u0002\u0010q\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00052\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00052\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001d2\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010$H\u00c6\u0001\u00a2\u0006\u0002\u0010rJ\u0013\u0010s\u001a\u00020=2\u0008\u0010t\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010u\u001a\u00020\u0016H\u00d6\u0001J\t\u0010v\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010(R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010(R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010(R\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010(R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010(R\u0016\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010(R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001d8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010(R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010(R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010-R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010(R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00109\u001a\u0004\u00087\u00108R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010;R\u0011\u0010<\u001a\u00020=8F\u00a2\u0006\u0006\u001a\u0004\u0008<\u0010>R\u0011\u0010?\u001a\u00020=8F\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010>R\u0011\u0010@\u001a\u00020=8F\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010>R\u0011\u0010A\u001a\u00020=8F\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010>R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u0010(R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010(R\u0011\u0010D\u001a\u00020=8F\u00a2\u0006\u0006\u001a\u0004\u0008E\u0010>R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00109\u001a\u0004\u0008F\u00108R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010HR\u001a\u0010\u0008\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00109\u001a\u0004\u0008I\u00108R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\u0008J\u0010KR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u0010NR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008O\u0010PR\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Q\u0010(R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008R\u0010(R\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008S\u0010TR\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008U\u0010(\u00a8\u0006w"
    }
    d2 = {
        "Lco/bird/android/model/persistence/RidePassView;",
        "",
        "id",
        "",
        "linkCode",
        "",
        "userRidePassId",
        "price",
        "priceTax",
        "previousPrice",
        "currency",
        "bannerImageUrl",
        "bannerAction",
        "title",
        "zendeskArticleId",
        "confirmationToast",
        "label",
        "status",
        "Lco/bird/android/model/constant/RidePassViewStatus;",
        "ineligibleReason",
        "Lco/bird/android/model/constant/RidePassViewIneligibleReason;",
        "remainingDeviceTransferCount",
        "",
        "cancelArticleId",
        "footer",
        "detailBody",
        "detailImageUrl",
        "detailAction",
        "detailBodyList",
        "",
        "detailFooter",
        "subscriptionPlan",
        "Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;",
        "userSubscription",
        "Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;",
        "createdAt",
        "Lorg/joda/time/DateTime;",
        "expiresAt",
        "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RidePassViewStatus;Lco/bird/android/model/constant/RidePassViewIneligibleReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V",
        "getBannerAction",
        "()Ljava/lang/String;",
        "getBannerImageUrl",
        "getCancelArticleId",
        "getConfirmationToast",
        "getCreatedAt",
        "()Lorg/joda/time/DateTime;",
        "getCurrency",
        "getDetailAction",
        "getDetailBody",
        "getDetailBodyList",
        "()Ljava/util/List;",
        "getDetailFooter",
        "getDetailImageUrl",
        "getExpiresAt",
        "getFooter",
        "getId",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getIneligibleReason",
        "()Lco/bird/android/model/constant/RidePassViewIneligibleReason;",
        "isActive",
        "",
        "()Z",
        "isAvailable",
        "isIneligible",
        "isPurchased",
        "getLabel",
        "getLinkCode",
        "needsDeviceTransfer",
        "getNeedsDeviceTransfer",
        "getPreviousPrice",
        "getPrice",
        "()J",
        "getPriceTax",
        "getRemainingDeviceTransferCount",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getStatus",
        "()Lco/bird/android/model/constant/RidePassViewStatus;",
        "getSubscriptionPlan",
        "()Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;",
        "getTitle",
        "getUserRidePassId",
        "getUserSubscription",
        "()Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;",
        "getZendeskArticleId",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component2",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RidePassViewStatus;Lco/bird/android/model/constant/RidePassViewIneligibleReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/RidePassView;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "model-persistence_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final bannerAction:Ljava/lang/String;

.field private final bannerImageUrl:Ljava/lang/String;

.field private final cancelArticleId:Ljava/lang/String;

.field private final confirmationToast:Ljava/lang/String;

.field private final createdAt:Lorg/joda/time/DateTime;

.field private final currency:Ljava/lang/String;

.field private final detailAction:Ljava/lang/String;

.field private final detailBody:Ljava/lang/String;

.field private final detailBodyList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final detailFooter:Ljava/lang/String;

.field private final detailImageUrl:Ljava/lang/String;

.field private final expiresAt:Lorg/joda/time/DateTime;

.field private final footer:Ljava/lang/String;

.field private final id:Ljava/lang/Long;

.field private final ineligibleReason:Lco/bird/android/model/constant/RidePassViewIneligibleReason;

.field private final label:Ljava/lang/String;

.field private final linkCode:Ljava/lang/String;

.field private final previousPrice:Ljava/lang/Long;

.field private final price:J

.field private final priceTax:Ljava/lang/Long;

.field private final remainingDeviceTransferCount:Ljava/lang/Integer;

.field private final status:Lco/bird/android/model/constant/RidePassViewStatus;

.field private final subscriptionPlan:Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;

.field private final title:Ljava/lang/String;

.field private final userRidePassId:Ljava/lang/String;

.field private final userSubscription:Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;

.field private final zendeskArticleId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RidePassViewStatus;Lco/bird/android/model/constant/RidePassViewIneligibleReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/RidePassViewStatus;",
            "Lco/bird/android/model/constant/RidePassViewIneligibleReason;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;",
            "Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p2

    move-object/from16 v2, p8

    move-object/from16 v3, p11

    move-object/from16 v4, p12

    move-object/from16 v5, p20

    const-string v6, "linkCode"

    invoke-static {p2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "currency"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "title"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "zendeskArticleId"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "detailBody"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v6, p1

    iput-object v6, v0, Lco/bird/android/model/persistence/RidePassView;->id:Ljava/lang/Long;

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->linkCode:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->userRidePassId:Ljava/lang/String;

    move-wide v6, p4

    iput-wide v6, v0, Lco/bird/android/model/persistence/RidePassView;->price:J

    move-object v1, p6

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->priceTax:Ljava/lang/Long;

    move-object v1, p7

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->previousPrice:Ljava/lang/Long;

    iput-object v2, v0, Lco/bird/android/model/persistence/RidePassView;->currency:Ljava/lang/String;

    move-object/from16 v1, p9

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->bannerImageUrl:Ljava/lang/String;

    move-object/from16 v1, p10

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->bannerAction:Ljava/lang/String;

    iput-object v3, v0, Lco/bird/android/model/persistence/RidePassView;->title:Ljava/lang/String;

    iput-object v4, v0, Lco/bird/android/model/persistence/RidePassView;->zendeskArticleId:Ljava/lang/String;

    move-object/from16 v1, p13

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->confirmationToast:Ljava/lang/String;

    move-object/from16 v1, p14

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->label:Ljava/lang/String;

    move-object/from16 v1, p15

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->status:Lco/bird/android/model/constant/RidePassViewStatus;

    move-object/from16 v1, p16

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->ineligibleReason:Lco/bird/android/model/constant/RidePassViewIneligibleReason;

    move-object/from16 v1, p17

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->remainingDeviceTransferCount:Ljava/lang/Integer;

    move-object/from16 v1, p18

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->cancelArticleId:Ljava/lang/String;

    move-object/from16 v1, p19

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->footer:Ljava/lang/String;

    iput-object v5, v0, Lco/bird/android/model/persistence/RidePassView;->detailBody:Ljava/lang/String;

    move-object/from16 v1, p21

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->detailImageUrl:Ljava/lang/String;

    move-object/from16 v1, p22

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->detailAction:Ljava/lang/String;

    move-object/from16 v1, p23

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->detailBodyList:Ljava/util/List;

    move-object/from16 v1, p24

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->detailFooter:Ljava/lang/String;

    move-object/from16 v1, p25

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->subscriptionPlan:Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;

    move-object/from16 v1, p26

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->userSubscription:Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;

    move-object/from16 v1, p27

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->createdAt:Lorg/joda/time/DateTime;

    move-object/from16 v1, p28

    iput-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->expiresAt:Lorg/joda/time/DateTime;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RidePassViewStatus;Lco/bird/android/model/constant/RidePassViewIneligibleReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 32

    move/from16 v0, p29

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move-object v12, v2

    goto :goto_4

    :cond_4
    move-object/from16 v12, p9

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move-object v13, v2

    goto :goto_5

    :cond_5
    move-object/from16 v13, p10

    :goto_5
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_6

    move-object/from16 v16, v2

    goto :goto_6

    :cond_6
    move-object/from16 v16, p13

    :goto_6
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_7

    move-object/from16 v17, v2

    goto :goto_7

    :cond_7
    move-object/from16 v17, p14

    :goto_7
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_8

    move-object/from16 v18, v2

    goto :goto_8

    :cond_8
    move-object/from16 v18, p15

    :goto_8
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_9

    move-object/from16 v19, v2

    goto :goto_9

    :cond_9
    move-object/from16 v19, p16

    :goto_9
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_a

    move-object/from16 v20, v2

    goto :goto_a

    :cond_a
    move-object/from16 v20, p17

    :goto_a
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    move-object/from16 v21, v2

    goto :goto_b

    :cond_b
    move-object/from16 v21, p18

    :goto_b
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    move-object/from16 v22, v2

    goto :goto_c

    :cond_c
    move-object/from16 v22, p19

    :goto_c
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v24, v2

    goto :goto_d

    :cond_d
    move-object/from16 v24, p21

    :goto_d
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v25, v2

    goto :goto_e

    :cond_e
    move-object/from16 v25, p22

    :goto_e
    const/high16 v1, 0x200000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move-object/from16 v26, v2

    goto :goto_f

    :cond_f
    move-object/from16 v26, p23

    :goto_f
    const/high16 v1, 0x400000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move-object/from16 v27, v2

    goto :goto_10

    :cond_10
    move-object/from16 v27, p24

    :goto_10
    const/high16 v1, 0x800000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    move-object/from16 v28, v2

    goto :goto_11

    :cond_11
    move-object/from16 v28, p25

    :goto_11
    const/high16 v1, 0x1000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_12

    move-object/from16 v29, v2

    goto :goto_12

    :cond_12
    move-object/from16 v29, p26

    :goto_12
    const/high16 v1, 0x2000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_13

    move-object/from16 v30, v2

    goto :goto_13

    :cond_13
    move-object/from16 v30, p27

    :goto_13
    const/high16 v1, 0x4000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_14

    move-object/from16 v31, v2

    goto :goto_14

    :cond_14
    move-object/from16 v31, p28

    :goto_14
    move-object/from16 v3, p0

    move-object/from16 v5, p2

    move-wide/from16 v7, p4

    move-object/from16 v11, p8

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move-object/from16 v23, p20

    invoke-direct/range {v3 .. v31}, Lco/bird/android/model/persistence/RidePassView;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RidePassViewStatus;Lco/bird/android/model/constant/RidePassViewIneligibleReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/RidePassView;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RidePassViewStatus;Lco/bird/android/model/constant/RidePassViewIneligibleReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lco/bird/android/model/persistence/RidePassView;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p29

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/bird/android/model/persistence/RidePassView;->id:Ljava/lang/Long;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/bird/android/model/persistence/RidePassView;->linkCode:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/bird/android/model/persistence/RidePassView;->userRidePassId:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-wide v5, v0, Lco/bird/android/model/persistence/RidePassView;->price:J

    goto :goto_3

    :cond_3
    move-wide/from16 v5, p4

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lco/bird/android/model/persistence/RidePassView;->priceTax:Ljava/lang/Long;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lco/bird/android/model/persistence/RidePassView;->previousPrice:Ljava/lang/Long;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lco/bird/android/model/persistence/RidePassView;->currency:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget-object v10, v0, Lco/bird/android/model/persistence/RidePassView;->bannerImageUrl:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v1, 0x100

    if-eqz v11, :cond_8

    iget-object v11, v0, Lco/bird/android/model/persistence/RidePassView;->bannerAction:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lco/bird/android/model/persistence/RidePassView;->title:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lco/bird/android/model/persistence/RidePassView;->zendeskArticleId:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-object v14, v0, Lco/bird/android/model/persistence/RidePassView;->confirmationToast:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->label:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p14

    :goto_c
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->status:Lco/bird/android/model/constant/RidePassViewStatus;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p15

    :goto_d
    move-object/from16 p15, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->ineligibleReason:Lco/bird/android/model/constant/RidePassViewIneligibleReason;

    goto :goto_e

    :cond_e
    move-object/from16 v15, p16

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-object/from16 p16, v15

    if-eqz v16, :cond_f

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->remainingDeviceTransferCount:Ljava/lang/Integer;

    goto :goto_f

    :cond_f
    move-object/from16 v15, p17

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-object/from16 p17, v15

    if-eqz v16, :cond_10

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->cancelArticleId:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v15, p18

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-object/from16 p18, v15

    if-eqz v16, :cond_11

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->footer:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p19

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-object/from16 p19, v15

    if-eqz v16, :cond_12

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->detailBody:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v15, p20

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-object/from16 p20, v15

    if-eqz v16, :cond_13

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->detailImageUrl:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p21

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-object/from16 p21, v15

    if-eqz v16, :cond_14

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->detailAction:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v15, p22

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, v1, v16

    move-object/from16 p22, v15

    if-eqz v16, :cond_15

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->detailBodyList:Ljava/util/List;

    goto :goto_15

    :cond_15
    move-object/from16 v15, p23

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, v1, v16

    move-object/from16 p23, v15

    if-eqz v16, :cond_16

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->detailFooter:Ljava/lang/String;

    goto :goto_16

    :cond_16
    move-object/from16 v15, p24

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, v1, v16

    move-object/from16 p24, v15

    if-eqz v16, :cond_17

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->subscriptionPlan:Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;

    goto :goto_17

    :cond_17
    move-object/from16 v15, p25

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, v1, v16

    move-object/from16 p25, v15

    if-eqz v16, :cond_18

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->userSubscription:Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;

    goto :goto_18

    :cond_18
    move-object/from16 v15, p26

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, v1, v16

    move-object/from16 p26, v15

    if-eqz v16, :cond_19

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->createdAt:Lorg/joda/time/DateTime;

    goto :goto_19

    :cond_19
    move-object/from16 v15, p27

    :goto_19
    const/high16 v16, 0x4000000

    and-int v1, v1, v16

    if-eqz v1, :cond_1a

    iget-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->expiresAt:Lorg/joda/time/DateTime;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p28

    :goto_1a
    move-object/from16 p1, v2

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-wide/from16 p4, v5

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p27, v15

    move-object/from16 p28, v1

    invoke-virtual/range {p0 .. p28}, Lco/bird/android/model/persistence/RidePassView;->copy(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RidePassViewStatus;Lco/bird/android/model/constant/RidePassViewIneligibleReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/RidePassView;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->id:Ljava/lang/Long;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->zendeskArticleId:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->confirmationToast:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Lco/bird/android/model/constant/RidePassViewStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->status:Lco/bird/android/model/constant/RidePassViewStatus;

    return-object v0
.end method

.method public final component15()Lco/bird/android/model/constant/RidePassViewIneligibleReason;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->ineligibleReason:Lco/bird/android/model/constant/RidePassViewIneligibleReason;

    return-object v0
.end method

.method public final component16()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->remainingDeviceTransferCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->cancelArticleId:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->footer:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->detailBody:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->linkCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->detailImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->detailAction:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->detailBodyList:Ljava/util/List;

    return-object v0
.end method

.method public final component23()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->detailFooter:Ljava/lang/String;

    return-object v0
.end method

.method public final component24()Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->subscriptionPlan:Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;

    return-object v0
.end method

.method public final component25()Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->userSubscription:Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;

    return-object v0
.end method

.method public final component26()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->createdAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component27()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->expiresAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->userRidePassId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/persistence/RidePassView;->price:J

    return-wide v0
.end method

.method public final component5()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->priceTax:Ljava/lang/Long;

    return-object v0
.end method

.method public final component6()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->previousPrice:Ljava/lang/Long;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->bannerImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->bannerAction:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RidePassViewStatus;Lco/bird/android/model/constant/RidePassViewIneligibleReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/RidePassView;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/constant/RidePassViewStatus;",
            "Lco/bird/android/model/constant/RidePassViewIneligibleReason;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;",
            "Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;",
            "Lorg/joda/time/DateTime;",
            "Lorg/joda/time/DateTime;",
            ")",
            "Lco/bird/android/model/persistence/RidePassView;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-wide/from16 v4, p4

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move-object/from16 v23, p23

    move-object/from16 v24, p24

    move-object/from16 v25, p25

    move-object/from16 v26, p26

    move-object/from16 v27, p27

    move-object/from16 v28, p28

    const-string v0, "linkCode"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currency"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v1, p11

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zendeskArticleId"

    move-object/from16 v1, p12

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailBody"

    move-object/from16 v1, p20

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v29, Lco/bird/android/model/persistence/RidePassView;

    move-object/from16 v0, v29

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v28}, Lco/bird/android/model/persistence/RidePassView;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/RidePassViewStatus;Lco/bird/android/model/constant/RidePassViewIneligibleReason;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V

    return-object v29
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/RidePassView;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/RidePassView;

    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->id:Ljava/lang/Long;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->id:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->linkCode:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->linkCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->userRidePassId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->userRidePassId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lco/bird/android/model/persistence/RidePassView;->price:J

    iget-wide v5, p1, Lco/bird/android/model/persistence/RidePassView;->price:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->priceTax:Ljava/lang/Long;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->priceTax:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->previousPrice:Ljava/lang/Long;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->previousPrice:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->bannerImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->bannerImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->bannerAction:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->bannerAction:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->title:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->zendeskArticleId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->zendeskArticleId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->confirmationToast:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->confirmationToast:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->label:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->label:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->status:Lco/bird/android/model/constant/RidePassViewStatus;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->status:Lco/bird/android/model/constant/RidePassViewStatus;

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->ineligibleReason:Lco/bird/android/model/constant/RidePassViewIneligibleReason;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->ineligibleReason:Lco/bird/android/model/constant/RidePassViewIneligibleReason;

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->remainingDeviceTransferCount:Ljava/lang/Integer;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->remainingDeviceTransferCount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->cancelArticleId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->cancelArticleId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->footer:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->footer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->detailBody:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->detailBody:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->detailImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->detailImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->detailAction:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->detailAction:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->detailBodyList:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->detailBodyList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->detailFooter:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->detailFooter:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->subscriptionPlan:Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->subscriptionPlan:Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->userSubscription:Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->userSubscription:Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->createdAt:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/android/model/persistence/RidePassView;->createdAt:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lco/bird/android/model/persistence/RidePassView;->expiresAt:Lorg/joda/time/DateTime;

    iget-object p1, p1, Lco/bird/android/model/persistence/RidePassView;->expiresAt:Lorg/joda/time/DateTime;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1c

    return v2

    :cond_1c
    return v0
.end method

.method public final getBannerAction()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->bannerAction:Ljava/lang/String;

    return-object v0
.end method

.method public final getBannerImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->bannerImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCancelArticleId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->cancelArticleId:Ljava/lang/String;

    return-object v0
.end method

.method public final getConfirmationToast()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->confirmationToast:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->createdAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getDetailAction()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->detailAction:Ljava/lang/String;

    return-object v0
.end method

.method public final getDetailBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->detailBody:Ljava/lang/String;

    return-object v0
.end method

.method public final getDetailBodyList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->detailBodyList:Ljava/util/List;

    return-object v0
.end method

.method public final getDetailFooter()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->detailFooter:Ljava/lang/String;

    return-object v0
.end method

.method public final getDetailImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->detailImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpiresAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->expiresAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getFooter()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->footer:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->id:Ljava/lang/Long;

    return-object v0
.end method

.method public final getIneligibleReason()Lco/bird/android/model/constant/RidePassViewIneligibleReason;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->ineligibleReason:Lco/bird/android/model/constant/RidePassViewIneligibleReason;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->linkCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getNeedsDeviceTransfer()Z
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/RidePassView;->isIneligible()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->ineligibleReason:Lco/bird/android/model/constant/RidePassViewIneligibleReason;

    sget-object v1, Lco/bird/android/model/constant/RidePassViewIneligibleReason;->INELIGIBLE_DEVICE:Lco/bird/android/model/constant/RidePassViewIneligibleReason;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getPreviousPrice()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->previousPrice:Ljava/lang/Long;

    return-object v0
.end method

.method public final getPrice()J
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/persistence/RidePassView;->price:J

    return-wide v0
.end method

.method public final getPriceTax()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->priceTax:Ljava/lang/Long;

    return-object v0
.end method

.method public final getRemainingDeviceTransferCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->remainingDeviceTransferCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getStatus()Lco/bird/android/model/constant/RidePassViewStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->status:Lco/bird/android/model/constant/RidePassViewStatus;

    return-object v0
.end method

.method public final getSubscriptionPlan()Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->subscriptionPlan:Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserRidePassId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->userRidePassId:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserSubscription()Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->userSubscription:Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;

    return-object v0
.end method

.method public final getZendeskArticleId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->zendeskArticleId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->id:Ljava/lang/Long;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->linkCode:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->userRidePassId:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lco/bird/android/model/persistence/RidePassView;->price:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->priceTax:Ljava/lang/Long;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->previousPrice:Ljava/lang/Long;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->currency:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->bannerImageUrl:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->bannerAction:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->title:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->zendeskArticleId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->confirmationToast:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->label:Ljava/lang/String;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->status:Lco/bird/android/model/constant/RidePassViewStatus;

    if-nez v2, :cond_8

    move v2, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->ineligibleReason:Lco/bird/android/model/constant/RidePassViewIneligibleReason;

    if-nez v2, :cond_9

    move v2, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->remainingDeviceTransferCount:Ljava/lang/Integer;

    if-nez v2, :cond_a

    move v2, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->cancelArticleId:Ljava/lang/String;

    if-nez v2, :cond_b

    move v2, v1

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->footer:Ljava/lang/String;

    if-nez v2, :cond_c

    move v2, v1

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->detailBody:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->detailImageUrl:Ljava/lang/String;

    if-nez v2, :cond_d

    move v2, v1

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->detailAction:Ljava/lang/String;

    if-nez v2, :cond_e

    move v2, v1

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->detailBodyList:Ljava/util/List;

    if-nez v2, :cond_f

    move v2, v1

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->detailFooter:Ljava/lang/String;

    if-nez v2, :cond_10

    move v2, v1

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->subscriptionPlan:Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;

    if-nez v2, :cond_11

    move v2, v1

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;->hashCode()I

    move-result v2

    :goto_11
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->userSubscription:Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;

    if-nez v2, :cond_12

    move v2, v1

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;->hashCode()I

    move-result v2

    :goto_12
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->createdAt:Lorg/joda/time/DateTime;

    if-nez v2, :cond_13

    move v2, v1

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v2

    :goto_13
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/persistence/RidePassView;->expiresAt:Lorg/joda/time/DateTime;

    if-nez v2, :cond_14

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_14
    add-int/2addr v0, v1

    return v0
.end method

.method public final isActive()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->status:Lco/bird/android/model/constant/RidePassViewStatus;

    sget-object v1, Lco/bird/android/model/constant/RidePassViewStatus;->ACTIVE:Lco/bird/android/model/constant/RidePassViewStatus;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isAvailable()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->status:Lco/bird/android/model/constant/RidePassViewStatus;

    sget-object v1, Lco/bird/android/model/constant/RidePassViewStatus;->AVAILABLE:Lco/bird/android/model/constant/RidePassViewStatus;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isIneligible()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/RidePassView;->status:Lco/bird/android/model/constant/RidePassViewStatus;

    sget-object v1, Lco/bird/android/model/constant/RidePassViewStatus;->INELIGIBLE:Lco/bird/android/model/constant/RidePassViewStatus;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isPurchased()Z
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/RidePassView;->isActive()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/model/persistence/RidePassView;->isIneligible()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 30

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/model/persistence/RidePassView;->id:Ljava/lang/Long;

    iget-object v2, v0, Lco/bird/android/model/persistence/RidePassView;->linkCode:Ljava/lang/String;

    iget-object v3, v0, Lco/bird/android/model/persistence/RidePassView;->userRidePassId:Ljava/lang/String;

    iget-wide v4, v0, Lco/bird/android/model/persistence/RidePassView;->price:J

    iget-object v6, v0, Lco/bird/android/model/persistence/RidePassView;->priceTax:Ljava/lang/Long;

    iget-object v7, v0, Lco/bird/android/model/persistence/RidePassView;->previousPrice:Ljava/lang/Long;

    iget-object v8, v0, Lco/bird/android/model/persistence/RidePassView;->currency:Ljava/lang/String;

    iget-object v9, v0, Lco/bird/android/model/persistence/RidePassView;->bannerImageUrl:Ljava/lang/String;

    iget-object v10, v0, Lco/bird/android/model/persistence/RidePassView;->bannerAction:Ljava/lang/String;

    iget-object v11, v0, Lco/bird/android/model/persistence/RidePassView;->title:Ljava/lang/String;

    iget-object v12, v0, Lco/bird/android/model/persistence/RidePassView;->zendeskArticleId:Ljava/lang/String;

    iget-object v13, v0, Lco/bird/android/model/persistence/RidePassView;->confirmationToast:Ljava/lang/String;

    iget-object v14, v0, Lco/bird/android/model/persistence/RidePassView;->label:Ljava/lang/String;

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->status:Lco/bird/android/model/constant/RidePassViewStatus;

    move-object/from16 v16, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->ineligibleReason:Lco/bird/android/model/constant/RidePassViewIneligibleReason;

    move-object/from16 v17, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->remainingDeviceTransferCount:Ljava/lang/Integer;

    move-object/from16 v18, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->cancelArticleId:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->footer:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->detailBody:Ljava/lang/String;

    move-object/from16 v21, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->detailImageUrl:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->detailAction:Ljava/lang/String;

    move-object/from16 v23, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->detailBodyList:Ljava/util/List;

    move-object/from16 v24, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->detailFooter:Ljava/lang/String;

    move-object/from16 v25, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->subscriptionPlan:Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;

    move-object/from16 v26, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->userSubscription:Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;

    move-object/from16 v27, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->createdAt:Lorg/joda/time/DateTime;

    move-object/from16 v28, v15

    iget-object v15, v0, Lco/bird/android/model/persistence/RidePassView;->expiresAt:Lorg/joda/time/DateTime;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v29, v15

    const-string v15, "RidePassView(id="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", linkCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", userRidePassId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", price="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", priceTax="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", previousPrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bannerImageUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bannerAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", zendeskArticleId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", confirmationToast="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", label="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ineligibleReason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", remainingDeviceTransferCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cancelArticleId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", footer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", detailBody="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", detailImageUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", detailAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", detailBodyList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", detailFooter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", subscriptionPlan="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", userSubscription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", expiresAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
