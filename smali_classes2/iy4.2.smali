.class public final Liy4;
.super LxE;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Liy4$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\u0012"
    }
    d2 = {
        "Liy4;",
        "LxE;",
        "Lco/bird/android/model/DeliveryWindow;",
        "window",
        "",
        "Pl",
        "Lio/reactivex/Observable;",
        "doneClicks",
        "LIC2;",
        "b",
        "LIC2;",
        "binding",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LIC2;)V",
        "c",
        "a",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final c:Liy4$a;

.field public static final d:I

.field public static final e:Lorg/joda/time/format/DateTimeFormatter;

.field public static final f:Lorg/joda/time/format/DateTimeFormatter;


# instance fields
.field public final b:LIC2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Liy4$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Liy4$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Liy4;->c:Liy4$a;

    const/16 v0, 0x8

    sput v0, Liy4;->d:I

    const-string v0, "-S"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forStyle(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Liy4;->e:Lorg/joda/time/format/DateTimeFormatter;

    const-string v0, "L-"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forStyle(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Liy4;->f:Lorg/joda/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LIC2;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, Liy4;->b:LIC2;

    return-void
.end method


# virtual methods
.method public final Pl(Lco/bird/android/model/DeliveryWindow;)V
    .locals 8

    const-string v0, "window"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Liy4;->f:Lorg/joda/time/format/DateTimeFormatter;

    invoke-virtual {p1}, Lco/bird/android/model/DeliveryWindow;->getStart()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Liy4;->e:Lorg/joda/time/format/DateTimeFormatter;

    invoke-virtual {p1}, Lco/bird/android/model/DeliveryWindow;->getStart()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lco/bird/android/model/DeliveryWindow;->getEnd()Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Liy4;->b:LIC2;

    iget-object v3, v3, LIC2;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v4

    sget v5, Lnl4;->long_term_rental_pickup_confirmed_message:I

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v0, 0x1

    aput-object v2, v6, v0

    const/4 v0, 0x2

    aput-object v1, v6, v0

    const/4 v0, 0x3

    invoke-virtual {p1}, Lco/bird/android/model/DeliveryWindow;->getAddress()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v6, v0

    invoke-virtual {v4, v5, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final doneClicks()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Liy4;->b:LIC2;

    iget-object v0, v0, LIC2;->b:Lco/bird/android/widget/CallToActionLayout;

    invoke-virtual {v0}, Lco/bird/android/widget/CallToActionLayout;->b()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
