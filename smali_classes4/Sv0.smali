.class public final LSv0;
.super LRv0;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/Tutorial;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lbf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbf1<",
            "Lco/bird/android/model/persistence/TutorialUpdate;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LRv0;-><init>()V

    iput-object p1, p0, LSv0;->a:LEb5;

    new-instance v0, LSv0$f;

    invoke-direct {v0, p0, p1}, LSv0$f;-><init>(LSv0;LEb5;)V

    iput-object v0, p0, LSv0;->b:Lcf1;

    new-instance v0, LSv0$g;

    invoke-direct {v0, p0, p1}, LSv0$g;-><init>(LSv0;LEb5;)V

    iput-object v0, p0, LSv0;->c:Lbf1;

    new-instance v0, LSv0$h;

    invoke-direct {v0, p0, p1}, LSv0$h;-><init>(LSv0;LEb5;)V

    iput-object v0, p0, LSv0;->d:Lgz5;

    return-void
.end method

.method public static bridge synthetic j(LSv0;)LEb5;
    .locals 0

    iget-object p0, p0, LSv0;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic k(LSv0;)Lcf1;
    .locals 0

    iget-object p0, p0, LSv0;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic l(LSv0;)Lgz5;
    .locals 0

    iget-object p0, p0, LSv0;->d:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic m(LSv0;)Lbf1;
    .locals 0

    iget-object p0, p0, LSv0;->c:Lbf1;

    return-object p0
.end method

.method public static bridge synthetic n(LSv0;Lco/bird/android/model/constant/ConfigurableTutorialContext;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, LSv0;->p(Lco/bird/android/model/constant/ConfigurableTutorialContext;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic o(LSv0;Ljava/lang/String;)Lco/bird/android/model/constant/ConfigurableTutorialContext;
    .locals 0

    invoke-virtual {p0, p1}, LSv0;->q(Ljava/lang/String;)Lco/bird/android/model/constant/ConfigurableTutorialContext;

    move-result-object p0

    return-object p0
.end method

.method public static r()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public varargs a([Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LSv0$d;

    invoke-direct {v0, p0, p1}, LSv0$d;-><init>(LSv0;[Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public b(Lco/bird/android/model/constant/ConfigurableTutorialContext;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/ConfigurableTutorialContext;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Tutorial;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM configurable_tutorial WHERE context = ? ORDER BY skippable"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LSv0;->p(Lco/bird/android/model/constant/ConfigurableTutorialContext;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    new-instance p1, LSv0$l;

    invoke-direct {p1, p0, v0}, LSv0$l;-><init>(LSv0;LHb5;)V

    invoke-static {p1}, LZe5;->e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public c(Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/ConfigurableTutorialContext;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Tutorial;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM configurable_tutorial WHERE context = ? AND (instr(bird_models, ?) OR trim(bird_models) = \'[]\') ORDER BY skippable"

    const/4 v1, 0x2

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    invoke-virtual {v0, v2}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LSv0;->p(Lco/bird/android/model/constant/ConfigurableTutorialContext;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    if-nez p2, :cond_1

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1, p2}, LHb5;->G0(ILjava/lang/String;)V

    :goto_1
    new-instance p1, LSv0$a;

    invoke-direct {p1, p0, v0}, LSv0$a;-><init>(LSv0;LHb5;)V

    invoke-static {p1}, LZe5;->e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public d(Lco/bird/android/model/constant/ConfigurableTutorialContext;Ljava/lang/String;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/ConfigurableTutorialContext;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Tutorial;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM configurable_tutorial WHERE context = ? AND (instr(bird_models, ?) OR trim(bird_models) = \'[]\')  AND seen_count < view_count ORDER BY skippable"

    const/4 v1, 0x2

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    invoke-virtual {v0, v2}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LSv0;->p(Lco/bird/android/model/constant/ConfigurableTutorialContext;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    if-nez p2, :cond_1

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1, p2}, LHb5;->G0(ILjava/lang/String;)V

    :goto_1
    new-instance p1, LSv0$b;

    invoke-direct {p1, p0, v0}, LSv0$b;-><init>(LSv0;LHb5;)V

    invoke-static {p1}, LZe5;->e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public e(Lco/bird/android/model/constant/ConfigurableTutorialContext;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/constant/ConfigurableTutorialContext;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Tutorial;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT * FROM configurable_tutorial WHERE context = ? AND seen_count < view_count ORDER BY skippable"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LSv0;->p(Lco/bird/android/model/constant/ConfigurableTutorialContext;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    new-instance p1, LSv0$m;

    invoke-direct {p1, p0, v0}, LSv0$m;-><init>(LSv0;LHb5;)V

    invoke-static {p1}, LZe5;->e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public varargs f([Ljava/lang/String;)Lio/reactivex/F;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Tutorial;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, LiS5;->b()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "SELECT * FROM configurable_tutorial WHERE id in ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-static {v0, v1}, LiS5;->a(Ljava/lang/StringBuilder;I)V

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    add-int/2addr v1, v2

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    array-length v1, p1

    const/4 v3, 0x1

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v4, p1, v2

    if-nez v4, :cond_0

    invoke-virtual {v0, v3}, LHb5;->m1(I)V

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v3, v4}, LHb5;->G0(ILjava/lang/String;)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, LSv0$c;

    invoke-direct {p1, p0, v0}, LSv0$c;-><init>(LSv0;LHb5;)V

    invoke-static {p1}, LZe5;->e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/String;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LSv0$k;

    invoke-direct {v0, p0, p1}, LSv0$k;-><init>(LSv0;Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/util/List;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Tutorial;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, LSv0$i;

    invoke-direct {v0, p0, p1}, LSv0$i;-><init>(LSv0;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/util/List;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/TutorialUpdate;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, LSv0$j;

    invoke-direct {v0, p0, p1}, LSv0$j;-><init>(LSv0;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final p(Lco/bird/android/model/constant/ConfigurableTutorialContext;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, LSv0$e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t convert enum to string, unknown enum value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const-string p1, "UNKNOWN"

    return-object p1

    :pswitch_1
    const-string p1, "QUIZ"

    return-object p1

    :pswitch_2
    const-string p1, "GOOGLE_AR_PARKING_RESOLUTION"

    return-object p1

    :pswitch_3
    const-string p1, "AR_NEST_SETUP"

    return-object p1

    :pswitch_4
    const-string p1, "RIDE_END"

    return-object p1

    :pswitch_5
    const-string p1, "RIDE_START"

    return-object p1

    :pswitch_6
    const-string p1, "RIDER_ONBOARDING"

    return-object p1

    :pswitch_7
    const-string p1, "HELMET_UNLOCK"

    return-object p1

    :pswitch_8
    const-string p1, "HELMET_LOCK"

    return-object p1

    :pswitch_9
    const-string p1, "CABLE_UNLOCK"

    return-object p1

    :pswitch_a
    const-string p1, "CABLE_LOCK"

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/String;)Lco/bird/android/model/constant/ConfigurableTutorialContext;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "AR_NEST_SETUP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v1, 0xa

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "UNKNOWN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v1, 0x9

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "HELMET_UNLOCK"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v1, 0x8

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "RIDE_START"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x7

    goto :goto_0

    :sswitch_4
    const-string v0, "CABLE_UNLOCK"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x6

    goto :goto_0

    :sswitch_5
    const-string v0, "QUIZ"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_6
    const-string v0, "RIDER_ONBOARDING"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_7
    const-string v0, "GOOGLE_AR_PARKING_RESOLUTION"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_8
    const-string v0, "RIDE_END"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_9
    const-string v0, "HELMET_LOCK"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_a
    const-string v0, "CABLE_LOCK"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t convert value to enum, unknown value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p1, Lco/bird/android/model/constant/ConfigurableTutorialContext;->AR_NEST_SETUP:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    return-object p1

    :pswitch_1
    sget-object p1, Lco/bird/android/model/constant/ConfigurableTutorialContext;->UNKNOWN:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    return-object p1

    :pswitch_2
    sget-object p1, Lco/bird/android/model/constant/ConfigurableTutorialContext;->HELMET_UNLOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    return-object p1

    :pswitch_3
    sget-object p1, Lco/bird/android/model/constant/ConfigurableTutorialContext;->RIDE_START:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    return-object p1

    :pswitch_4
    sget-object p1, Lco/bird/android/model/constant/ConfigurableTutorialContext;->CABLE_UNLOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    return-object p1

    :pswitch_5
    sget-object p1, Lco/bird/android/model/constant/ConfigurableTutorialContext;->QUIZ:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    return-object p1

    :pswitch_6
    sget-object p1, Lco/bird/android/model/constant/ConfigurableTutorialContext;->RIDER_ONBOARDING:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    return-object p1

    :pswitch_7
    sget-object p1, Lco/bird/android/model/constant/ConfigurableTutorialContext;->GOOGLE_AR_PARKING_RESOLUTION:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    return-object p1

    :pswitch_8
    sget-object p1, Lco/bird/android/model/constant/ConfigurableTutorialContext;->RIDE_END:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    return-object p1

    :pswitch_9
    sget-object p1, Lco/bird/android/model/constant/ConfigurableTutorialContext;->HELMET_LOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    return-object p1

    :pswitch_a
    sget-object p1, Lco/bird/android/model/constant/ConfigurableTutorialContext;->CABLE_LOCK:Lco/bird/android/model/constant/ConfigurableTutorialContext;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x73e333f3 -> :sswitch_a
        -0x2e134643 -> :sswitch_9
        -0x2c369f0c -> :sswitch_8
        -0x269e3b05 -> :sswitch_7
        -0x189e2e0 -> :sswitch_6
        0x261a55 -> :sswitch_5
        0x76bb1a6 -> :sswitch_4
        0x7bcf63b -> :sswitch_3
        0x18f6f356 -> :sswitch_2
        0x19d1382a -> :sswitch_1
        0x5c37fa84 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
