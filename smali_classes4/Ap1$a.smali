.class public LAp1$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAp1;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/FleetReport;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LAp1;


# direct methods
.method public constructor <init>(LAp1;LEb5;)V
    .locals 0

    iput-object p1, p0, LAp1$a;->d:LAp1;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `fleet_reports` (`period`,`subheading`,`scoreboards`,`sections`,`fleet_id`,`page`) VALUES (?,?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/FleetReport;

    invoke-virtual {p0, p1, p2}, LAp1$a;->p(LqV5;Lco/bird/android/model/persistence/FleetReport;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/FleetReport;)V
    .locals 2

    sget-object v0, Lyp1;->a:Lyp1;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetReport;->getPeriod()Lco/bird/android/model/persistence/FleetReportPeriod;

    move-result-object v0

    invoke-static {v0}, Lyp1;->j(Lco/bird/android/model/persistence/FleetReportPeriod;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetReport;->getSubheading()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetReport;->getSubheading()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetReport;->getScoreboards()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lyp1;->g(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetReport;->getSections()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lyp1;->e(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetReport;->getFleetId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetReport;->getFleetId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetReport;->getPage()Lco/bird/android/model/constant/FleetReportPage;

    move-result-object p2

    invoke-static {p2}, Lyp1;->i(Lco/bird/android/model/constant/FleetReportPage;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x6

    if-nez p2, :cond_5

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_5

    :cond_5
    invoke-interface {p1, v0, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_5
    return-void
.end method
