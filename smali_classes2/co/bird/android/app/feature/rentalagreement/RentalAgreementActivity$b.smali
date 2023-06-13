.class public final Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$b;
.super Lg9;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "co/bird/android/app/feature/rentalagreement/RentalAgreementActivity$b",
        "Lg9;",
        "Lio/reactivex/c;",
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


# instance fields
.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Z

.field public final synthetic h:Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;[Ljava/lang/Object;)V
    .locals 8

    iput-object p2, p0, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$b;->f:Ljava/lang/String;

    iput-boolean p3, p0, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$b;->g:Z

    iput-object p4, p0, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$b;->h:Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;

    move-object v1, p5

    check-cast v1, [Lco/bird/android/model/AgreementRole;

    const/4 v2, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v7}, Lg9;-><init>([Lco/bird/android/model/AgreementRole;ZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic g(ZLco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$b;->h(ZLco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;Ljava/lang/String;)V

    return-void
.end method

.method public static final h(ZLco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;Ljava/lang/String;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object p0

    sget-object v0, Le13$b;->c:Le13$b;

    const/4 v1, 0x1

    new-array v1, v1, [Lkotlin/Pair;

    const-string v2, "co.bird.android.user_guest_id"

    invoke-static {v2, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-interface {p0, v0, v1}, Le13;->W0(Le13$b;[Lkotlin/Pair;)V

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object p0

    invoke-interface {p0}, Le13;->close()V

    return-void
.end method


# virtual methods
.method public a()Lio/reactivex/c;
    .locals 5

    iget-object v0, p0, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$b;->h:Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;

    invoke-virtual {v0}, Lco/bird/android/core/mvp/BaseActivity;->b0()Llh6;

    move-result-object v0

    invoke-interface {v0}, Llh6;->H()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object v0

    iget-boolean v1, p0, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$b;->g:Z

    iget-object v2, p0, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$b;->h:Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;

    iget-object v3, p0, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$b;->f:Ljava/lang/String;

    new-instance v4, Lux4;

    invoke-direct {v4, v1, v2, v3}, Lux4;-><init>(ZLco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "userManager\n          .a\u2026gator.close()\n          }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
