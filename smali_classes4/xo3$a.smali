.class public Lxo3$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxo3;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/OperatorOptionFilter;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lxo3;


# direct methods
.method public constructor <init>(Lxo3;LEb5;)V
    .locals 0

    iput-object p1, p0, Lxo3$a;->d:Lxo3;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `operator_option_filters` (`id`,`kind`,`ordinal_num`,`type`,`label`,`options`,`logic_operator`,`icon`,`icon_color`,`colored_icon`,`icon_background_color`) VALUES (?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/OperatorOptionFilter;

    invoke-virtual {p0, p1, p2}, Lxo3$a;->p(LqV5;Lco/bird/android/model/persistence/OperatorOptionFilter;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/OperatorOptionFilter;)V
    .locals 3

    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    sget-object v0, LXk3;->a:LXk3;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getKind()Lco/bird/android/model/constant/OperatorMapKind;

    move-result-object v0

    invoke-static {v0}, LXk3;->c(Lco/bird/android/model/constant/OperatorMapKind;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOrdinal()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x3

    invoke-interface {p1, v2, v0, v1}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getType()Lco/bird/android/model/constant/OperatorFilterType;

    move-result-object v0

    invoke-static {v0}, LXk3;->b(Lco/bird/android/model/constant/OperatorFilterType;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLabel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getOptions()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LXk3;->d(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLogicOperator()Lco/bird/android/model/constant/FilterLogicToggleOption;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_5

    :cond_5
    iget-object v0, p0, Lxo3$a;->d:Lxo3;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getLogicOperator()Lco/bird/android/model/constant/FilterLogicToggleOption;

    move-result-object v2

    invoke-static {v0, v2}, Lxo3;->j(Lxo3;Lco/bird/android/model/constant/FilterLogicToggleOption;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_5
    sget-object v0, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->j(Lco/bird/android/model/constant/ClientIcon;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_6

    :cond_6
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_6
    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->n(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_7

    :cond_7
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_7
    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_8

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_8

    :cond_8
    iget-object v0, p0, Lxo3$a;->d:Lxo3;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getColoredIcon()Lco/bird/android/model/constant/ColoredIcon;

    move-result-object v2

    invoke-static {v0, v2}, Lxo3;->h(Lxo3;Lco/bird/android/model/constant/ColoredIcon;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_8
    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorOptionFilter;->getIconBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object p2

    invoke-static {p2}, Lco/bird/android/persistence/common/impl/Converters;->n(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0xb

    if-nez p2, :cond_9

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_9

    :cond_9
    invoke-interface {p1, v0, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_9
    return-void
.end method
