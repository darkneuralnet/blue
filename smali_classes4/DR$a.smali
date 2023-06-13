.class public LDR$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDR;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/BirdRatingHistory;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LDR;


# direct methods
.method public constructor <init>(LDR;LEb5;)V
    .locals 0

    iput-object p1, p0, LDR$a;->d:LDR;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `bird_rating_history` (`bird_id`,`bird_code`,`rating_average`,`ratings`,`tags`) VALUES (?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/BirdRatingHistory;

    invoke-virtual {p0, p1, p2}, LDR$a;->p(LqV5;Lco/bird/android/model/persistence/BirdRatingHistory;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/BirdRatingHistory;)V
    .locals 3

    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdRatingHistory;->getBirdId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdRatingHistory;->getBirdId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdRatingHistory;->getBirdCode()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdRatingHistory;->getBirdCode()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    const/4 v0, 0x3

    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdRatingHistory;->getRatingAverage()D

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, LoV5;->M1(ID)V

    sget-object v0, LBR;->a:LBR;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdRatingHistory;->getRatings()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LBR;->c(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdRatingHistory;->getTags()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, LBR;->d(Ljava/util/List;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x5

    if-nez p2, :cond_3

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v0, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    return-void
.end method
