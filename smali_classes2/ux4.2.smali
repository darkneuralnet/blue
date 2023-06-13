.class public final synthetic Lux4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Z

.field public final synthetic c:Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ZLco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lux4;->b:Z

    iput-object p2, p0, Lux4;->c:Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;

    iput-object p3, p0, Lux4;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-boolean v0, p0, Lux4;->b:Z

    iget-object v1, p0, Lux4;->c:Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;

    iget-object v2, p0, Lux4;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$b;->g(ZLco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;Ljava/lang/String;)V

    return-void
.end method
