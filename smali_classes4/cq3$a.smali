.class public Lcq3$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcq3;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/OperatorOrderViewSection;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lcq3;


# direct methods
.method public constructor <init>(Lcq3;LEb5;)V
    .locals 0

    iput-object p1, p0, Lcq3$a;->d:Lcq3;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `operator_order_section` (`title`,`idx`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/OperatorOrderViewSection;

    invoke-virtual {p0, p1, p2}, Lcq3$a;->p(LqV5;Lco/bird/android/model/persistence/OperatorOrderViewSection;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/OperatorOrderViewSection;)V
    .locals 2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOrderViewSection;->getTitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOrderViewSection;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOrderViewSection;->getIdx()I

    move-result p2

    int-to-long v0, p2

    const/4 p2, 0x2

    invoke-interface {p1, p2, v0, v1}, LoV5;->S0(IJ)V

    return-void
.end method
