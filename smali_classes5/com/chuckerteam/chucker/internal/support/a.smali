.class public final Lcom/chuckerteam/chucker/internal/support/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/chuckerteam/chucker/internal/support/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\t\u001a\u00020\u0008H\u0002J\u0008\u0010\u000b\u001a\u00020\nH\u0002J\u0008\u0010\r\u001a\u00020\u000cH\u0002R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R#\u0010\u001e\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006!"
    }
    d2 = {
        "Lcom/chuckerteam/chucker/internal/support/a;",
        "",
        "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
        "transaction",
        "",
        "k",
        "g",
        "d",
        "",
        "e",
        "Lac3$a;",
        "f",
        "",
        "j",
        "Landroid/content/Context;",
        "a",
        "Landroid/content/Context;",
        "h",
        "()Landroid/content/Context;",
        "context",
        "Landroid/app/NotificationManager;",
        "b",
        "Landroid/app/NotificationManager;",
        "notificationManager",
        "Landroid/app/PendingIntent;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lkotlin/Lazy;",
        "i",
        "()Landroid/app/PendingIntent;",
        "transactionsScreenIntent",
        "<init>",
        "(Landroid/content/Context;)V",
        "com.github.ChuckerTeam.Chucker.library"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNotificationHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationHelper.kt\ncom/chuckerteam/chucker/internal/support/NotificationHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1855#2,2:149\n*S KotlinDebug\n*F\n+ 1 NotificationHelper.kt\ncom/chuckerteam/chucker/internal/support/NotificationHelper\n*L\n100#1:149,2\n*E\n"
    }
.end annotation


# static fields
.field public static final d:Lcom/chuckerteam/chucker/internal/support/a$a;

.field public static final e:Landroid/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<",
            "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/app/NotificationManager;

.field public final c:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/chuckerteam/chucker/internal/support/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/chuckerteam/chucker/internal/support/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/a;->d:Lcom/chuckerteam/chucker/internal/support/a$a;

    new-instance v0, Landroid/util/LongSparseArray;

    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/a;->e:Landroid/util/LongSparseArray;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/chuckerteam/chucker/internal/support/a;->f:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/chuckerteam/chucker/internal/support/a;->a:Landroid/content/Context;

    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lcom/chuckerteam/chucker/internal/support/a;->b:Landroid/app/NotificationManager;

    new-instance v1, Lcom/chuckerteam/chucker/internal/support/a$b;

    invoke-direct {v1, p0}, Lcom/chuckerteam/chucker/internal/support/a$b;-><init>(Lcom/chuckerteam/chucker/internal/support/a;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/chuckerteam/chucker/internal/support/a;->c:Lkotlin/Lazy;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_0

    invoke-static {}, Lia3;->a()V

    sget v1, Lal4;->chucker_network_notification_category:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    const-string v2, "chucker_transactions"

    invoke-static {v2, p1, v1}, Lha3;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, LRc3;->a(Landroid/app/NotificationManager;Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public static final synthetic a()Landroid/util/LongSparseArray;
    .locals 1

    sget-object v0, Lcom/chuckerteam/chucker/internal/support/a;->e:Landroid/util/LongSparseArray;

    return-object v0
.end method

.method public static final synthetic b()Ljava/util/HashSet;
    .locals 1

    sget-object v0, Lcom/chuckerteam/chucker/internal/support/a;->f:Ljava/util/HashSet;

    return-object v0
.end method

.method public static final synthetic c(Lcom/chuckerteam/chucker/internal/support/a;)I
    .locals 0

    invoke-virtual {p0}, Lcom/chuckerteam/chucker/internal/support/a;->j()I

    move-result p0

    return p0
.end method


# virtual methods
.method public final d(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V
    .locals 4

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getId()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/chuckerteam/chucker/internal/support/a;->e:Landroid/util/LongSparseArray;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/chuckerteam/chucker/internal/support/a;->f:Ljava/util/HashSet;

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p1}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    invoke-virtual {v0}, Landroid/util/LongSparseArray;->size()I

    move-result p1

    const/16 v1, 0xa

    if-le p1, v1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/util/LongSparseArray;->removeAt(I)V

    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/support/a;->b:Landroid/app/NotificationManager;

    invoke-virtual {v0}, Landroid/app/NotificationManager;->areNotificationsEnabled()Z

    move-result v0

    return v0
.end method

.method public final f()Lac3$a;
    .locals 5

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/support/a;->a:Landroid/content/Context;

    sget v1, Lal4;->chucker_clear:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(R.string.chucker_clear)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/support/a;->a:Landroid/content/Context;

    const-class v3, Lcom/chuckerteam/chucker/internal/support/ClearDatabaseJobIntentServiceReceiver;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v2, p0, Lcom/chuckerteam/chucker/internal/support/a;->a:Landroid/content/Context;

    const/high16 v3, 0x40000000    # 2.0f

    invoke-virtual {p0}, Lcom/chuckerteam/chucker/internal/support/a;->j()I

    move-result v4

    or-int/2addr v3, v4

    const/16 v4, 0xb

    invoke-static {v2, v4, v1, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    new-instance v2, Lac3$a;

    sget v3, Lug4;->chucker_ic_delete_white:I

    invoke-direct {v2, v3, v0, v1}, Lac3$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    return-object v2
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/support/a;->b:Landroid/app/NotificationManager;

    const/16 v1, 0x472

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    return-void
.end method

.method public final h()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/support/a;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final i()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/support/a;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    return-object v0
.end method

.method public final j()I
    .locals 1

    const/high16 v0, 0x4000000

    return v0
.end method

.method public final k(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V
    .locals 6

    const-string v0, "transaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/chuckerteam/chucker/internal/support/a;->d(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V

    sget-object p1, Lcom/chuckerteam/chucker/internal/ui/BaseChuckerActivity;->b:Lcom/chuckerteam/chucker/internal/ui/BaseChuckerActivity$a;

    invoke-virtual {p1}, Lcom/chuckerteam/chucker/internal/ui/BaseChuckerActivity$a;->a()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/chuckerteam/chucker/internal/support/a;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lac3$e;

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/support/a;->a:Landroid/content/Context;

    const-string v1, "chucker_transactions"

    invoke-direct {p1, v0, v1}, Lac3$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/chuckerteam/chucker/internal/support/a;->i()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {p1, v0}, Lac3$e;->k(Landroid/app/PendingIntent;)Lac3$e;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lac3$e;->u(Z)Lac3$e;

    move-result-object p1

    sget v1, Lug4;->chucker_ic_transaction_notification:I

    invoke-virtual {p1, v1}, Lac3$e;->B(I)Lac3$e;

    move-result-object p1

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/support/a;->a:Landroid/content/Context;

    sget v2, LGf4;->chucker_color_primary:I

    invoke-static {v1, v2}, LNA0;->c(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v1}, Lac3$e;->j(I)Lac3$e;

    move-result-object p1

    iget-object v1, p0, Lcom/chuckerteam/chucker/internal/support/a;->a:Landroid/content/Context;

    sget v2, Lal4;->chucker_http_notification_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lac3$e;->m(Ljava/lang/CharSequence;)Lac3$e;

    move-result-object p1

    invoke-virtual {p1, v0}, Lac3$e;->g(Z)Lac3$e;

    move-result-object p1

    invoke-virtual {p0}, Lcom/chuckerteam/chucker/internal/support/a;->f()Lac3$a;

    move-result-object v1

    invoke-virtual {p1, v1}, Lac3$e;->b(Lac3$a;)Lac3$e;

    move-result-object p1

    const-string v1, "Builder(context, TRANSAC\u2026tion(createClearAction())"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lac3$g;

    invoke-direct {v1}, Lac3$g;-><init>()V

    sget-object v2, Lcom/chuckerteam/chucker/internal/support/a;->e:Landroid/util/LongSparseArray;

    monitor-enter v2

    :try_start_0
    invoke-virtual {v2}, Landroid/util/LongSparseArray;->size()I

    move-result v3

    sub-int/2addr v3, v0

    const/4 v0, 0x0

    invoke-static {v3, v0}, Lkotlin/ranges/RangesKt;->downTo(II)Lkotlin/ranges/IntProgression;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v4, v3

    check-cast v4, Lkotlin/collections/IntIterator;

    invoke-virtual {v4}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v4

    sget-object v5, Lcom/chuckerteam/chucker/internal/support/a;->e:Landroid/util/LongSparseArray;

    invoke-virtual {v5, v4}, Landroid/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;

    if-eqz v4, :cond_1

    const/16 v5, 0xa

    if-ge v0, v5, :cond_1

    if-nez v0, :cond_0

    invoke-virtual {v4}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getNotificationText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Lac3$e;->l(Ljava/lang/CharSequence;)Lac3$e;

    :cond_0
    invoke-virtual {v4}, Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;->getNotificationText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lac3$g;->h(Ljava/lang/CharSequence;)Lac3$g;

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v1}, Lac3$e;->D(Lac3$i;)Lac3$e;

    sget-object v0, Lcom/chuckerteam/chucker/internal/support/a;->f:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lac3$e;->E(Ljava/lang/CharSequence;)Lac3$e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    iget-object v0, p0, Lcom/chuckerteam/chucker/internal/support/a;->b:Landroid/app/NotificationManager;

    const/16 v1, 0x472

    invoke-virtual {p1}, Lac3$e;->c()Landroid/app/Notification;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_3
    :goto_1
    return-void
.end method
