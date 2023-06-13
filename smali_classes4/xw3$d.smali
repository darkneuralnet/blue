.class public Lxw3$d;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxw3;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/OperatorTaskGroup;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lxw3;


# direct methods
.method public constructor <init>(Lxw3;LEb5;)V
    .locals 0

    iput-object p1, p0, Lxw3$d;->d:Lxw3;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `operator_task_group` (`title`,`tasks`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/OperatorTaskGroup;

    invoke-virtual {p0, p1, p2}, Lxw3$d;->p(LqV5;Lco/bird/android/model/persistence/OperatorTaskGroup;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/OperatorTaskGroup;)V
    .locals 2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorTaskGroup;->getTitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorTaskGroup;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    sget-object v0, Lvw3;->a:Lvw3;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/OperatorTaskGroup;->getTasks()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lvw3;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v0, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    return-void
.end method
