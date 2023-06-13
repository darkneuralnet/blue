.class public LQc3$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQc3;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/NotificationGroup;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LQc3;


# direct methods
.method public constructor <init>(LQc3;LEb5;)V
    .locals 0

    iput-object p1, p0, LQc3$a;->d:LQc3;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `notification_groups` (`id`,`title`,`description`,`category`,`date`,`icon`) VALUES (?,?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/NotificationGroup;

    invoke-virtual {p0, p1, p2}, LQc3$a;->p(LqV5;Lco/bird/android/model/persistence/NotificationGroup;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/NotificationGroup;)V
    .locals 2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/NotificationGroup;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NotificationGroup;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NotificationGroup;->getTitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NotificationGroup;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NotificationGroup;->getDescription()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NotificationGroup;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NotificationGroup;->getCategory()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NotificationGroup;->getCategory()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    sget-object v0, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/NotificationGroup;->getDate()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_4
    sget-object v0, Lta3;->a:Lta3;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/NotificationGroup;->getIcon()Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;

    move-result-object p2

    invoke-static {p2}, Lta3;->b(Lco/bird/android/model/persistence/nestedstructures/OperatorNotificationIcon;)Ljava/lang/String;

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
