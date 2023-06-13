.class public final LMt5$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMt5;->c(Lco/bird/android/model/constant/ServiceCenterStatus;Lco/bird/android/model/persistence/Bird;Ljava/lang/String;Ljava/lang/String;LbH;Ljava/lang/Integer;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/User;",
        "Lio/reactivex/K<",
        "+",
        "LHM4<",
        "Lkotlin/Unit;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/model/User;",
        "user",
        "Lio/reactivex/K;",
        "LHM4;",
        "",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lco/bird/android/model/User;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/persistence/Bird;

.field public final synthetic h:LbH;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/Integer;

.field public final synthetic k:Lco/bird/android/model/constant/ServiceCenterStatus;

.field public final synthetic l:LMt5;

.field public final synthetic m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/Bird;LbH;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/ServiceCenterStatus;LMt5;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LMt5$b;->g:Lco/bird/android/model/persistence/Bird;

    iput-object p2, p0, LMt5$b;->h:LbH;

    iput-object p3, p0, LMt5$b;->i:Ljava/lang/String;

    iput-object p4, p0, LMt5$b;->j:Ljava/lang/Integer;

    iput-object p5, p0, LMt5$b;->k:Lco/bird/android/model/constant/ServiceCenterStatus;

    iput-object p6, p0, LMt5$b;->l:LMt5;

    iput-object p7, p0, LMt5$b;->m:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LMt5$b;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LMt5$b;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lco/bird/android/model/User;)Lio/reactivex/K;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/User;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "LHM4<",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "user"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/User;->getWarehouseId()Ljava/lang/String;

    move-result-object v6

    iget-object v1, v0, LMt5$b;->g:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Bird;->getNestId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    if-nez v6, :cond_0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "One of [nestId, warehouseId] must be non-null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lg46;->e(Ljava/lang/Throwable;)V

    :cond_0
    iget-object v1, v0, LMt5$b;->g:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v9

    iget-object v1, v0, LMt5$b;->h:LbH;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    sget-object v1, LXD5;->c:LXD5;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    iget-object v1, v0, LMt5$b;->g:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object v10

    new-instance v1, LbE5;

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    iget-object v13, v0, LMt5$b;->i:Ljava/lang/String;

    const/16 v16, 0x0

    iget-object v2, v0, LMt5$b;->j:Ljava/lang/Integer;

    const/16 v18, 0x0

    const/16 v19, 0x519

    const/16 v20, 0x0

    move-object v7, v1

    move-object/from16 v17, v2

    invoke-direct/range {v7 .. v20}, LbE5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, v0, LMt5$b;->k:Lco/bird/android/model/constant/ServiceCenterStatus;

    invoke-virtual {v2}, Lco/bird/android/model/constant/ServiceCenterStatus;->isHibernate()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, v0, LMt5$b;->k:Lco/bird/android/model/constant/ServiceCenterStatus;

    invoke-virtual {v2}, Lco/bird/android/model/constant/ServiceCenterStatus;->isHibernateCreateBatch()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    iget-object v2, v0, LMt5$b;->l:LMt5;

    invoke-static {v2}, LMt5;->access$getAnalyticsManager$p(LMt5;)LEa;

    move-result-object v2

    invoke-interface {v2, v1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    :cond_2
    iget-object v2, v0, LMt5$b;->l:LMt5;

    invoke-static {v2}, LMt5;->access$getClient$p(LMt5;)LBt5;

    move-result-object v9

    iget-object v2, v0, LMt5$b;->g:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v4

    iget-object v2, v0, LMt5$b;->g:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/Bird;->getNestId()Ljava/lang/String;

    move-result-object v5

    iget-object v2, v0, LMt5$b;->g:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v2}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object v7

    new-instance v10, Lco/bird/api/request/ServiceCenterEventBody;

    iget-object v3, v0, LMt5$b;->k:Lco/bird/android/model/constant/ServiceCenterStatus;

    iget-object v8, v0, LMt5$b;->m:Ljava/lang/String;

    move-object v2, v10

    invoke-direct/range {v2 .. v8}, Lco/bird/api/request/ServiceCenterEventBody;-><init>(Lco/bird/android/model/constant/ServiceCenterStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v9, v10}, LBt5;->c(Lco/bird/api/request/ServiceCenterEventBody;)Lio/reactivex/F;

    move-result-object v2

    new-instance v3, LMt5$b$a;

    iget-object v4, v0, LMt5$b;->k:Lco/bird/android/model/constant/ServiceCenterStatus;

    iget-object v5, v0, LMt5$b;->l:LMt5;

    invoke-direct {v3, v4, v5, v1}, LMt5$b$a;-><init>(Lco/bird/android/model/constant/ServiceCenterStatus;LMt5;LbE5;)V

    new-instance v4, LNt5;

    invoke-direct {v4, v3}, LNt5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v4}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v2

    new-instance v3, LMt5$b$b;

    iget-object v4, v0, LMt5$b;->k:Lco/bird/android/model/constant/ServiceCenterStatus;

    iget-object v5, v0, LMt5$b;->l:LMt5;

    invoke-direct {v3, v4, v5, v1}, LMt5$b$b;-><init>(Lco/bird/android/model/constant/ServiceCenterStatus;LMt5;LbE5;)V

    new-instance v1, LOt5;

    invoke-direct {v1, v3}, LOt5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v1}, Lio/reactivex/F;->t(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/User;

    invoke-virtual {p0, p1}, LMt5$b;->c(Lco/bird/android/model/User;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
