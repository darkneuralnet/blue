.class public final Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010Z\u001a\u00020Y\u0012\n\u0008\u0002\u0010\\\u001a\u0004\u0018\u00010[\u0012\u0008\u0008\u0002\u0010^\u001a\u00020]\u00a2\u0006\u0004\u0008_\u0010`J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008J\u0010\u0010\u000e\u001a\u00020\u00042\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cR$\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001cR\u0011\u0010#\u001a\u00020 8F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"R\u0011\u0010%\u001a\u00020 8F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010\"R\u0011\u0010&\u001a\u00020 8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\"R\u0011\u0010*\u001a\u00020\'8F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)R\u0011\u0010.\u001a\u00020+8F\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010-R\u0011\u00100\u001a\u00020 8F\u00a2\u0006\u0006\u001a\u0004\u0008/\u0010\"R\u0011\u00104\u001a\u0002018F\u00a2\u0006\u0006\u001a\u0004\u00082\u00103R\u0011\u00106\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\u00085\u0010\u001cR\u0011\u0010:\u001a\u0002078F\u00a2\u0006\u0006\u001a\u0004\u00088\u00109R\u0011\u0010>\u001a\u00020;8F\u00a2\u0006\u0006\u001a\u0004\u0008<\u0010=R\u0011\u0010B\u001a\u00020?8F\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010AR\u0011\u0010D\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010CR\u0011\u0010F\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008E\u0010\u001cR\u0011\u0010H\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008G\u0010\u001cR\u0011\u0010J\u001a\u00020 8F\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010\"R\u0011\u0010L\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010CR\u0011\u0010N\u001a\u00020+8F\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010-R\u0011\u0010P\u001a\u00020;8F\u00a2\u0006\u0006\u001a\u0004\u0008O\u0010=R\u0011\u0010R\u001a\u00020;8F\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010=R\u0011\u0010V\u001a\u00020S8F\u00a2\u0006\u0006\u001a\u0004\u0008T\u0010UR\u0011\u0010X\u001a\u00020 8F\u00a2\u0006\u0006\u001a\u0004\u0008W\u0010\"\u00a8\u0006a"
    }
    d2 = {
        "Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;",
        "Landroid/widget/LinearLayout;",
        "",
        "rideDistance",
        "",
        "setDistance",
        "Lco/bird/android/model/wire/WireRide;",
        "_ride",
        "",
        "useBilledMinutes",
        "hideTime",
        "setDuration",
        "Lco/bird/android/model/wire/WireRideTransaction;",
        "transaction",
        "setSinglePrice",
        "b",
        "Lco/bird/android/model/wire/WireRide;",
        "getRide",
        "()Lco/bird/android/model/wire/WireRide;",
        "setRide",
        "(Lco/bird/android/model/wire/WireRide;)V",
        "ride",
        "Lwt6;",
        "c",
        "Lwt6;",
        "binding",
        "Landroid/widget/RelativeLayout;",
        "v",
        "()Landroid/widget/RelativeLayout;",
        "rideReportSection",
        "j",
        "durationSection",
        "Landroid/widget/TextView;",
        "i",
        "()Landroid/widget/TextView;",
        "duration",
        "h",
        "distance",
        "cost",
        "Landroid/view/View;",
        "q",
        "()Landroid/view/View;",
        "partnerSection",
        "Landroid/widget/ImageView;",
        "o",
        "()Landroid/widget/ImageView;",
        "partnerIcon",
        "p",
        "partnerName",
        "Landroid/widget/RatingBar;",
        "r",
        "()Landroid/widget/RatingBar;",
        "rating",
        "s",
        "ratingSection",
        "Lco/bird/android/app/feature/ridedetail/widget/ReceiptLayout;",
        "t",
        "()Lco/bird/android/app/feature/ridedetail/widget/ReceiptLayout;",
        "receiptSection",
        "Landroid/widget/Button;",
        "k",
        "()Landroid/widget/Button;",
        "getHelp",
        "Lco/bird/android/app/feature/ridedetail/widget/ContactLayout;",
        "a",
        "()Lco/bird/android/app/feature/ridedetail/widget/ContactLayout;",
        "contacts",
        "()Landroid/widget/LinearLayout;",
        "contactsSection",
        "d",
        "costSection",
        "m",
        "parkingPhotoSection",
        "n",
        "parkingPhotoStatus",
        "u",
        "reviewResultContainer",
        "w",
        "thumbImage",
        "e",
        "disputeButton",
        "l",
        "invoiceButton",
        "Landroidx/cardview/widget/CardView;",
        "g",
        "()Landroidx/cardview/widget/CardView;",
        "disputeStatusContainer",
        "f",
        "disputeStatus",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public b:Lco/bird/android/model/wire/WireRide;

.field public final c:Lwt6;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {p1}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    invoke-static {p2, p0}, Lwt6;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lwt6;

    move-result-object p2

    const-string p3, "inflate(context.layoutInflater, this)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget p2, LDf4;->birdWhite:I

    invoke-static {p1, p2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final a()Lco/bird/android/app/feature/ridedetail/widget/ContactLayout;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->c:Lco/bird/android/app/feature/ridedetail/widget/ContactLayout;

    const-string v1, "binding.contacts"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b()Landroid/widget/LinearLayout;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->d:Landroid/widget/LinearLayout;

    const-string v1, "binding.contactsSection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()Landroid/widget/TextView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->e:Landroid/widget/TextView;

    const-string v1, "binding.cost"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final d()Landroid/widget/RelativeLayout;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->g:Landroid/widget/RelativeLayout;

    const-string v1, "binding.costSection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final e()Landroid/widget/Button;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->h:Landroid/widget/Button;

    const-string v1, "binding.disputeButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final f()Landroid/widget/TextView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->i:Landroid/widget/TextView;

    const-string v1, "binding.disputeStatus"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final g()Landroidx/cardview/widget/CardView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->j:Landroidx/cardview/widget/CardView;

    const-string v1, "binding.disputeStatusContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final h()Landroid/widget/TextView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->k:Landroid/widget/TextView;

    const-string v1, "binding.distance"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final i()Landroid/widget/TextView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->o:Landroid/widget/TextView;

    const-string v1, "binding.duration"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final j()Landroid/widget/RelativeLayout;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->q:Landroid/widget/RelativeLayout;

    const-string v1, "binding.durationSection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final k()Landroid/widget/Button;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->r:Landroid/widget/Button;

    const-string v1, "binding.getHelp"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final l()Landroid/widget/Button;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->G:Landroid/widget/Button;

    const-string v1, "binding.sendInvoiceButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final m()Landroid/widget/RelativeLayout;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->t:Landroid/widget/RelativeLayout;

    const-string v1, "binding.parkingPhotoSection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final n()Landroid/widget/TextView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->u:Landroid/widget/TextView;

    const-string v1, "binding.parkingPhotoStatus"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final o()Landroid/widget/ImageView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->v:Landroid/widget/ImageView;

    const-string v1, "binding.partnerIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final p()Landroid/widget/TextView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->w:Landroid/widget/TextView;

    const-string v1, "binding.partnerName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final q()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->x:Landroid/widget/RelativeLayout;

    const-string v1, "binding.partnerSection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final r()Landroid/widget/RatingBar;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->y:Landroid/widget/RatingBar;

    const-string v1, "binding.rating"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final s()Landroid/widget/RelativeLayout;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->A:Landroid/widget/RelativeLayout;

    const-string v1, "binding.ratingSection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final setDistance(D)V
    .locals 10

    invoke-virtual {p0}, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->h()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lxx1;->a:Lxx1;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-wide v3, p1

    invoke-static/range {v1 .. v9}, Lxx1;->distance$default(Lxx1;Landroid/content/Context;DDZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setDuration(Lco/bird/android/model/wire/WireRide;ZZ)V
    .locals 6

    const-string v0, "_ride"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->b:Lco/bird/android/model/wire/WireRide;

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->j()Landroid/widget/RelativeLayout;

    move-result-object p1

    invoke-static {p1}, Ltu6;->l(Landroid/view/View;)V

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getBilledMinutes()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {p0}, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->i()Landroid/widget/TextView;

    move-result-object p2

    sget-object v0, Lxx1;->a:Lxx1;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string p3, "context"

    invoke-static {v1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lxx1;->durationMinute$default(Lxx1;Landroid/content/Context;IZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_3

    invoke-virtual {p0}, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->i()Landroid/widget/TextView;

    move-result-object p2

    sget-object p3, Lxx1;->a:Lxx1;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->durationSeconds()I

    move-result p1

    invoke-virtual {p3, p1}, Lxx1;->j(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->i()Landroid/widget/TextView;

    move-result-object p2

    sget-object p3, Lxx1;->a:Lxx1;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->durationSeconds()I

    move-result p1

    invoke-virtual {p3, p1}, Lxx1;->j(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final setRide(Lco/bird/android/model/wire/WireRide;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->b:Lco/bird/android/model/wire/WireRide;

    return-void
.end method

.method public final setSinglePrice(Lco/bird/android/model/wire/WireRideTransaction;)V
    .locals 8

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lxx1;->a:Lxx1;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideTransaction;->getAmount()J

    move-result-wide v2

    const/4 v4, -0x1

    int-to-long v4, v4

    mul-long/2addr v2, v4

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRideTransaction;->getCurrency()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lxx1;->currency$default(Lxx1;JLjava/util/Currency;LUx1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->b:Lco/bird/android/model/wire/WireRide;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lxx1;->a:Lxx1;

    const-wide/16 v2, 0x0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireRide;->getCurrency()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lxx1;->currency$default(Lxx1;JLjava/util/Currency;LUx1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final t()Lco/bird/android/app/feature/ridedetail/widget/ReceiptLayout;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->B:Lco/bird/android/app/feature/ridedetail/widget/ReceiptLayout;

    const-string v1, "binding.receiptSection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final u()Landroid/widget/LinearLayout;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->C:Landroid/widget/LinearLayout;

    const-string v1, "binding.reviewResultContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final v()Landroid/widget/RelativeLayout;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->F:Landroid/widget/RelativeLayout;

    const-string v1, "binding.rideReportSection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final w()Landroid/widget/ImageView;
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/ridedetail/widget/RideSummaryWithReceiptView;->c:Lwt6;

    iget-object v0, v0, Lwt6;->I:Landroid/widget/ImageView;

    const-string v1, "binding.thumbImage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
