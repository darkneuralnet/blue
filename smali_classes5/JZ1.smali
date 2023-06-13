.class public LJZ1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJZ1$e;,
        LJZ1$c;,
        LJZ1$d;,
        LJZ1$b;
    }
.end annotation


# static fields
.field public static final s:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static t:LJZ1;

.field public static final u:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field public static final w:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/Object;

.field public final c:LNZ1;

.field public final d:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final e:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final f:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final g:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final h:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final i:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final j:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final k:Ljava/lang/reflect/Method;

.field public final l:Ljava/lang/reflect/Method;

.field public final m:Ljava/lang/reflect/Method;

.field public final n:Ljava/lang/reflect/Method;

.field public final o:Ljava/lang/reflect/Method;

.field public final p:Ljava/lang/reflect/Method;

.field public final q:Ljava/lang/reflect/Method;

.field public final r:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, LJZ1;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    sput-object v0, LJZ1;->t:LJZ1;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, LJZ1;->u:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, LJZ1;->v:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, LJZ1;->w:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;LNZ1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "LNZ1;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, v0, LJZ1;->r:Ljava/util/Set;

    move-object v1, p1

    iput-object v1, v0, LJZ1;->a:Landroid/content/Context;

    move-object v1, p2

    iput-object v1, v0, LJZ1;->b:Ljava/lang/Object;

    move-object v1, p3

    iput-object v1, v0, LJZ1;->d:Ljava/lang/Class;

    move-object v1, p4

    iput-object v1, v0, LJZ1;->e:Ljava/lang/Class;

    move-object v1, p5

    iput-object v1, v0, LJZ1;->f:Ljava/lang/Class;

    move-object v1, p6

    iput-object v1, v0, LJZ1;->g:Ljava/lang/Class;

    move-object v1, p7

    iput-object v1, v0, LJZ1;->h:Ljava/lang/Class;

    move-object v1, p8

    iput-object v1, v0, LJZ1;->i:Ljava/lang/Class;

    move-object v1, p9

    iput-object v1, v0, LJZ1;->j:Ljava/lang/Class;

    move-object v1, p10

    iput-object v1, v0, LJZ1;->k:Ljava/lang/reflect/Method;

    move-object v1, p11

    iput-object v1, v0, LJZ1;->l:Ljava/lang/reflect/Method;

    move-object v1, p12

    iput-object v1, v0, LJZ1;->m:Ljava/lang/reflect/Method;

    move-object v1, p13

    iput-object v1, v0, LJZ1;->n:Ljava/lang/reflect/Method;

    move-object/from16 v1, p14

    iput-object v1, v0, LJZ1;->o:Ljava/lang/reflect/Method;

    move-object/from16 v1, p15

    iput-object v1, v0, LJZ1;->p:Ljava/lang/reflect/Method;

    move-object/from16 v1, p16

    iput-object v1, v0, LJZ1;->q:Ljava/lang/reflect/Method;

    move-object/from16 v1, p17

    iput-object v1, v0, LJZ1;->c:LNZ1;

    return-void
.end method

.method public static synthetic a(LJZ1;)Ljava/util/Set;
    .locals 3

    const-class v0, LJZ1;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    iget-object p0, p0, LJZ1;->r:Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static synthetic b(LJZ1;Ljava/lang/String;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 2

    const-class v0, LJZ1;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, LJZ1;->n(Ljava/lang/String;Ljava/util/List;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(LJZ1;)Ljava/lang/Class;
    .locals 3

    const-class v0, LJZ1;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    iget-object p0, p0, LJZ1;->h:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static synthetic d(LJZ1;)Ljava/lang/reflect/Method;
    .locals 3

    const-class v0, LJZ1;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    iget-object p0, p0, LJZ1;->o:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static synthetic e(LJZ1;)Landroid/content/Context;
    .locals 3

    const-class v0, LJZ1;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    iget-object p0, p0, LJZ1;->a:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static synthetic f(LJZ1;)Ljava/lang/Class;
    .locals 3

    const-class v0, LJZ1;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    iget-object p0, p0, LJZ1;->g:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static synthetic g(LJZ1;)Ljava/lang/reflect/Method;
    .locals 3

    const-class v0, LJZ1;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    iget-object p0, p0, LJZ1;->n:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static h(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-class v0, LJZ1;

    invoke-static {v0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    const-string v1, "com.android.billingclient.api.BillingClient$Builder"

    invoke-static {v1}, LOZ1;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v3, "com.android.billingclient.api.PurchasesUpdatedListener"

    invoke-static {v3}, LOZ1;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    if-eqz v1, :cond_6

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const-string v4, "newBuilder"

    const/4 v5, 0x1

    new-array v6, v5, [Ljava/lang/Class;

    const-class v7, Landroid/content/Context;

    const/4 v8, 0x0

    aput-object v7, v6, v8

    invoke-static {p1, v4, v6}, LOZ1;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const-string v6, "enablePendingPurchases"

    new-array v7, v8, [Ljava/lang/Class;

    invoke-static {v1, v6, v7}, LOZ1;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const-string v7, "setListener"

    new-array v9, v5, [Ljava/lang/Class;

    aput-object v3, v9, v8

    invoke-static {v1, v7, v9}, LOZ1;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    const-string v9, "build"

    new-array v10, v8, [Ljava/lang/Class;

    invoke-static {v1, v9, v10}, LOZ1;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    if-eqz v4, :cond_6

    if-eqz v6, :cond_6

    if-eqz v7, :cond_6

    if-nez v9, :cond_2

    goto :goto_0

    :cond_2
    new-array v10, v5, [Ljava/lang/Object;

    aput-object p0, v10, v8

    invoke-static {p1, v4, v2, v10}, LOZ1;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_3

    return-object v2

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    new-array v4, v5, [Ljava/lang/Class;

    aput-object v3, v4, v8

    new-instance v3, LJZ1$d;

    invoke-direct {v3}, LJZ1$d;-><init>()V

    invoke-static {p1, v4, v3}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    new-array v3, v5, [Ljava/lang/Object;

    aput-object p1, v3, v8

    invoke-static {v1, v7, p0, v3}, LOZ1;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_4

    return-object v2

    :cond_4
    new-array p1, v8, [Ljava/lang/Object;

    invoke-static {v1, v6, p0, p1}, LOZ1;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_5

    return-object v2

    :cond_5
    new-array p1, v8, [Ljava/lang/Object;

    invoke-static {v1, v9, p0, p1}, LOZ1;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :cond_6
    :goto_0
    return-object v2

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method

.method public static i(Landroid/content/Context;)V
    .locals 22

    const-class v0, Ljava/lang/String;

    const-string v1, "getOriginalJson"

    const-class v2, LJZ1;

    invoke-static {v2}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, LNZ1;->b()LNZ1;

    move-result-object v21

    if-nez v21, :cond_1

    return-void

    :cond_1
    const-string v3, "com.android.billingclient.api.BillingClient"

    invoke-static {v3}, LOZ1;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const-string v3, "com.android.billingclient.api.Purchase"

    invoke-static {v3}, LOZ1;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const-string v3, "com.android.billingclient.api.Purchase$PurchasesResult"

    invoke-static {v3}, LOZ1;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const-string v3, "com.android.billingclient.api.SkuDetails"

    invoke-static {v3}, LOZ1;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const-string v3, "com.android.billingclient.api.PurchaseHistoryRecord"

    invoke-static {v3}, LOZ1;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    const-string v3, "com.android.billingclient.api.SkuDetailsResponseListener"

    invoke-static {v3}, LOZ1;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    const-string v3, "com.android.billingclient.api.PurchaseHistoryResponseListener"

    invoke-static {v3}, LOZ1;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v13

    if-eqz v7, :cond_5

    if-eqz v8, :cond_5

    if-eqz v9, :cond_5

    if-eqz v10, :cond_5

    if-eqz v12, :cond_5

    if-eqz v11, :cond_5

    if-nez v13, :cond_2

    goto :goto_0

    :cond_2
    const-string v3, "queryPurchases"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    invoke-static {v7, v3, v5}, LOZ1;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v14

    const-string v3, "getPurchasesList"

    new-array v5, v6, [Ljava/lang/Class;

    invoke-static {v8, v3, v5}, LOZ1;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v15

    new-array v3, v6, [Ljava/lang/Class;

    invoke-static {v9, v1, v3}, LOZ1;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v16

    new-array v3, v6, [Ljava/lang/Class;

    invoke-static {v10, v1, v3}, LOZ1;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v17

    new-array v3, v6, [Ljava/lang/Class;

    invoke-static {v11, v1, v3}, LOZ1;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v18

    const-string v1, "querySkuDetailsAsync"

    const/4 v3, 0x2

    new-array v5, v3, [Ljava/lang/Class;

    invoke-virtual/range {v21 .. v21}, LNZ1;->d()Ljava/lang/Class;

    move-result-object v19

    aput-object v19, v5, v6

    aput-object v12, v5, v4

    invoke-static {v7, v1, v5}, LOZ1;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v19

    const-string v1, "queryPurchaseHistoryAsync"

    new-array v3, v3, [Ljava/lang/Class;

    aput-object v0, v3, v6

    aput-object v13, v3, v4

    invoke-static {v7, v1, v3}, LOZ1;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v20

    if-eqz v14, :cond_5

    if-eqz v15, :cond_5

    if-eqz v16, :cond_5

    if-eqz v17, :cond_5

    if-eqz v18, :cond_5

    if-eqz v19, :cond_5

    if-nez v20, :cond_3

    goto :goto_0

    :cond_3
    move-object/from16 v0, p0

    invoke-static {v0, v7}, LJZ1;->h(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_4

    return-void

    :cond_4
    new-instance v1, LJZ1;

    move-object v4, v1

    move-object/from16 v5, p0

    invoke-direct/range {v4 .. v21}, LJZ1;-><init>(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;LNZ1;)V

    sput-object v1, LJZ1;->t:LJZ1;

    invoke-virtual {v1}, LJZ1;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, v2}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public static declared-synchronized j(Landroid/content/Context;)LJZ1;
    .locals 4

    const-class v0, LJZ1;

    monitor-enter v0

    :try_start_0
    const-class v1, LJZ1;

    invoke-static {v1}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v2

    :cond_0
    :try_start_1
    sget-object v1, LJZ1;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object p0, LJZ1;->t:LJZ1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p0

    :cond_1
    :try_start_2
    invoke-static {p0}, LJZ1;->i(Landroid/content/Context;)V

    const/4 p0, 0x1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object p0, LJZ1;->t:LJZ1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_3
    const-class v1, LJZ1;

    invoke-static {p0, v1}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v0

    return-object v2

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public k(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 8

    const-string v0, "productId"

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v1, p0, LJZ1;->d:Ljava/lang/Class;

    iget-object v2, p0, LJZ1;->k:Ljava/lang/reflect/Method;

    iget-object v3, p0, LJZ1;->b:Ljava/lang/Object;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "inapp"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v1, v2, v3, v4}, LOZ1;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LJZ1;->e:Ljava/lang/Class;

    iget-object v3, p0, LJZ1;->l:Ljava/lang/reflect/Method;

    new-array v4, v6, [Ljava/lang/Object;

    invoke-static {v2, v3, v1, v4}, LOZ1;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    return-void

    :cond_1
    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, LJZ1;->f:Ljava/lang/Class;

    iget-object v5, p0, LJZ1;->m:Ljava/lang/reflect/Method;

    new-array v7, v6, [Ljava/lang/Object;

    invoke-static {v4, v5, v3, v7}, LOZ1;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/String;

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    new-instance v4, Lorg/json/JSONObject;

    check-cast v3, Ljava/lang/String;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, LJZ1;->v:Ljava/util/Map;

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    invoke-virtual {p0, p1, v2, p2}, LJZ1;->n(Ljava/lang/String;Ljava/util/List;Ljava/lang/Runnable;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public l(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    new-instance v0, LJZ1$a;

    invoke-direct {v0, p0, p2}, LJZ1$a;-><init>(LJZ1;Ljava/lang/Runnable;)V

    invoke-virtual {p0, p1, v0}, LJZ1;->m(Ljava/lang/String;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public final m(Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 6

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, LJZ1;->j:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Class;

    iget-object v3, p0, LJZ1;->j:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    new-instance v3, LJZ1$c;

    invoke-direct {v3, p0, p2}, LJZ1$c;-><init>(LJZ1;Ljava/lang/Runnable;)V

    invoke-static {v0, v2, v3}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, LJZ1;->d:Ljava/lang/Class;

    iget-object v2, p0, LJZ1;->q:Ljava/lang/reflect/Method;

    iget-object v3, p0, LJZ1;->b:Ljava/lang/Object;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v4

    aput-object p2, v5, v1

    invoke-static {v0, v2, v3, v5}, LOZ1;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public final n(Ljava/lang/String;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, LJZ1;->i:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Class;

    iget-object v3, p0, LJZ1;->i:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    new-instance v3, LJZ1$e;

    invoke-direct {v3, p0, p3}, LJZ1$e;-><init>(LJZ1;Ljava/lang/Runnable;)V

    invoke-static {v0, v2, v3}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p3

    iget-object v0, p0, LJZ1;->c:LNZ1;

    invoke-virtual {v0, p1, p2}, LNZ1;->c(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, LJZ1;->d:Ljava/lang/Class;

    iget-object v0, p0, LJZ1;->p:Ljava/lang/reflect/Method;

    iget-object v2, p0, LJZ1;->b:Ljava/lang/Object;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v4

    aput-object p3, v3, v1

    invoke-static {p2, v0, v2, v3}, LOZ1;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method

.method public final o()V
    .locals 6

    invoke-static {p0}, LTD0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v0, "com.android.billingclient.api.BillingClientStateListener"

    invoke-static {v0}, LOZ1;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, LJZ1;->d:Ljava/lang/Class;

    const-string v2, "startConnection"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-static {v1, v2, v4}, LOZ1;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    if-nez v1, :cond_2

    return-void

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    new-array v4, v3, [Ljava/lang/Class;

    aput-object v0, v4, v5

    new-instance v0, LJZ1$b;

    invoke-direct {v0}, LJZ1$b;-><init>()V

    invoke-static {v2, v4, v0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, LJZ1;->d:Ljava/lang/Class;

    iget-object v4, p0, LJZ1;->b:Ljava/lang/Object;

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v0, v3, v5

    invoke-static {v2, v1, v4, v3}, LOZ1;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p0}, LTD0;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-void
.end method
