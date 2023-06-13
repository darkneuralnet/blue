.class public final Lxo3;
.super Lwo3;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/OperatorOptionFilter;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Lwo3;-><init>()V

    iput-object p1, p0, Lxo3;->a:LEb5;

    new-instance v0, Lxo3$a;

    invoke-direct {v0, p0, p1}, Lxo3$a;-><init>(Lxo3;LEb5;)V

    iput-object v0, p0, Lxo3;->b:Lcf1;

    new-instance v0, Lxo3$b;

    invoke-direct {v0, p0, p1}, Lxo3$b;-><init>(Lxo3;LEb5;)V

    iput-object v0, p0, Lxo3;->c:Lgz5;

    return-void
.end method

.method public static bridge synthetic e(Lxo3;)LEb5;
    .locals 0

    iget-object p0, p0, Lxo3;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic f(Lxo3;)Lcf1;
    .locals 0

    iget-object p0, p0, Lxo3;->b:Lcf1;

    return-object p0
.end method

.method public static bridge synthetic g(Lxo3;)Lgz5;
    .locals 0

    iget-object p0, p0, Lxo3;->c:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic h(Lxo3;Lco/bird/android/model/constant/ColoredIcon;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lxo3;->l(Lco/bird/android/model/constant/ColoredIcon;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic i(Lxo3;Ljava/lang/String;)Lco/bird/android/model/constant/ColoredIcon;
    .locals 0

    invoke-virtual {p0, p1}, Lxo3;->m(Ljava/lang/String;)Lco/bird/android/model/constant/ColoredIcon;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic j(Lxo3;Lco/bird/android/model/constant/FilterLogicToggleOption;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lxo3;->n(Lco/bird/android/model/constant/FilterLogicToggleOption;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic k(Lxo3;Ljava/lang/String;)Lco/bird/android/model/constant/FilterLogicToggleOption;
    .locals 0

    invoke-virtual {p0, p1}, Lxo3;->o(Ljava/lang/String;)Lco/bird/android/model/constant/FilterLogicToggleOption;

    move-result-object p0

    return-object p0
.end method

.method public static p()Ljava/util/List;
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
.method public a()Lio/reactivex/c;
    .locals 1

    new-instance v0, Lxo3$d;

    invoke-direct {v0, p0}, Lxo3$d;-><init>(Lxo3;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/util/List;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorOptionFilter;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, Lxo3$c;

    invoke-direct {v0, p0, p1}, Lxo3$c;-><init>(Lxo3;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public c()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorOptionFilter;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `operator_option_filters`.`id` AS `id`, `operator_option_filters`.`kind` AS `kind`, `operator_option_filters`.`ordinal_num` AS `ordinal_num`, `operator_option_filters`.`type` AS `type`, `operator_option_filters`.`label` AS `label`, `operator_option_filters`.`options` AS `options`, `operator_option_filters`.`logic_operator` AS `logic_operator`, `operator_option_filters`.`icon` AS `icon`, `operator_option_filters`.`icon_color` AS `icon_color`, `operator_option_filters`.`colored_icon` AS `colored_icon`, `operator_option_filters`.`icon_background_color` AS `icon_background_color` FROM operator_option_filters"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, Lxo3;->a:LEb5;

    const-string v3, "operator_option_filters"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lxo3$e;

    invoke-direct {v4, p0, v0}, Lxo3$e;-><init>(Lxo3;LHb5;)V

    invoke-static {v2, v1, v3, v4}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/util/List;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, Lxo3$f;

    invoke-direct {v0, p0, p1}, Lxo3$f;-><init>(Lxo3;Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public final l(Lco/bird/android/model/constant/ColoredIcon;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, Lxo3$g;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    const-string p1, "UNKNOWN"

    return-object p1

    :cond_1
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

    :cond_2
    const-string p1, "IC_STAR_EMOJI_SILVER"

    return-object p1

    :cond_3
    const-string p1, "IC_STAR_EMOJI_GOLD"

    return-object p1

    :cond_4
    const-string p1, "IC_STAR_EMOJI_BLUE"

    return-object p1

    :cond_5
    const-string p1, "IC_SCOOTER"

    return-object p1
.end method

.method public final m(Ljava/lang/String;)Lco/bird/android/model/constant/ColoredIcon;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "UNKNOWN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_1
    const-string v0, "IC_STAR_EMOJI_GOLD"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_2
    const-string v0, "IC_STAR_EMOJI_BLUE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "IC_SCOOTER"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_4
    const-string v0, "IC_STAR_EMOJI_SILVER"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
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
    sget-object p1, Lco/bird/android/model/constant/ColoredIcon;->UNKNOWN:Lco/bird/android/model/constant/ColoredIcon;

    return-object p1

    :pswitch_1
    sget-object p1, Lco/bird/android/model/constant/ColoredIcon;->IC_STAR_EMOJI_GOLD:Lco/bird/android/model/constant/ColoredIcon;

    return-object p1

    :pswitch_2
    sget-object p1, Lco/bird/android/model/constant/ColoredIcon;->IC_STAR_EMOJI_BLUE:Lco/bird/android/model/constant/ColoredIcon;

    return-object p1

    :pswitch_3
    sget-object p1, Lco/bird/android/model/constant/ColoredIcon;->IC_SCOOTER:Lco/bird/android/model/constant/ColoredIcon;

    return-object p1

    :pswitch_4
    sget-object p1, Lco/bird/android/model/constant/ColoredIcon;->IC_STAR_EMOJI_SILVER:Lco/bird/android/model/constant/ColoredIcon;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x6941b9d2 -> :sswitch_4
        -0x5f1db454 -> :sswitch_3
        -0x4f860445 -> :sswitch_2
        -0x4f83b43f -> :sswitch_1
        0x19d1382a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lco/bird/android/model/constant/FilterLogicToggleOption;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, Lxo3$g;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    const-string p1, "UNKNOWN"

    return-object p1

    :cond_1
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

    :cond_2
    const-string p1, "OR"

    return-object p1

    :cond_3
    const-string p1, "AND"

    return-object p1
.end method

.method public final o(Ljava/lang/String;)Lco/bird/android/model/constant/FilterLogicToggleOption;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "UNKNOWN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_1
    const-string v0, "AND"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "OR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
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
    sget-object p1, Lco/bird/android/model/constant/FilterLogicToggleOption;->UNKNOWN:Lco/bird/android/model/constant/FilterLogicToggleOption;

    return-object p1

    :pswitch_1
    sget-object p1, Lco/bird/android/model/constant/FilterLogicToggleOption;->AND:Lco/bird/android/model/constant/FilterLogicToggleOption;

    return-object p1

    :pswitch_2
    sget-object p1, Lco/bird/android/model/constant/FilterLogicToggleOption;->OR:Lco/bird/android/model/constant/FilterLogicToggleOption;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x9e3 -> :sswitch_2
        0xfdb7 -> :sswitch_1
        0x19d1382a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
