.class public final Lbo/app/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbo/app/f0$c;,
        Lbo/app/f0$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008#\u0010$J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0005\u001a\u00020\u0006H\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0008\u0010\u0011\u001a\u00020\u0006H\u0007J\u0008\u0010\u0012\u001a\u00020\u0006H\u0007J\u0006\u0010\u0013\u001a\u00020\u0006J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0007H\u0007R\"\u0010\u0015\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u000b\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R*\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001d\"\u0004\u0008\u0005\u0010\u001e\u00a8\u0006%"
    }
    d2 = {
        "Lbo/app/f0;",
        "",
        "",
        "initialDelayMs",
        "Lzh2;",
        "a",
        "",
        "Lbo/app/g2;",
        "eventPublisher",
        "",
        "throwable",
        "b",
        "Landroid/net/NetworkCapabilities;",
        "networkCapabilities",
        "",
        "e",
        "f",
        "c",
        "d",
        "g",
        "eventManager",
        "currentIntervalMs",
        "J",
        "()J",
        "setCurrentIntervalMs$android_sdk_base_release",
        "(J)V",
        "value",
        "isSyncPolicyDisabled",
        "Z",
        "()Z",
        "(Z)V",
        "Landroid/content/Context;",
        "context",
        "Lbo/app/e0;",
        "dataSyncConfigurationProvider",
        "<init>",
        "(Landroid/content/Context;Lbo/app/g2;Lbo/app/e0;)V",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final n:Lbo/app/f0$c;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lbo/app/e0;

.field private c:Landroid/content/BroadcastReceiver;

.field private d:Landroid/net/ConnectivityManager$NetworkCallback;

.field private final e:Lbo/app/e1;

.field private f:Lbo/app/i5;

.field private g:J

.field private volatile h:Z

.field private final i:Landroid/net/ConnectivityManager;

.field private j:Lbo/app/o3;

.field private k:Lzh2;

.field private l:I

.field private m:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbo/app/f0$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbo/app/f0$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbo/app/f0;->n:Lbo/app/f0$c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lbo/app/g2;Lbo/app/e0;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventPublisher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataSyncConfigurationProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo/app/f0;->a:Landroid/content/Context;

    iput-object p3, p0, Lbo/app/f0;->b:Lbo/app/e0;

    new-instance p3, Lbo/app/e1;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-int v0, v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {p3, v0, v3, v1, v2}, Lbo/app/e1;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p3, p0, Lbo/app/f0;->e:Lbo/app/e1;

    sget-object p3, Lbo/app/i5;->c:Lbo/app/i5;

    iput-object p3, p0, Lbo/app/f0;->f:Lbo/app/i5;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lbo/app/f0;->g:J

    const-string p3, "connectivity"

    invoke-virtual {p1, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    check-cast p1, Landroid/net/ConnectivityManager;

    iput-object p1, p0, Lbo/app/f0;->i:Landroid/net/ConnectivityManager;

    sget-object p1, Lbo/app/o3;->b:Lbo/app/o3;

    iput-object p1, p0, Lbo/app/f0;->j:Lbo/app/o3;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1e

    if-lt p1, p3, :cond_0

    new-instance p1, Lbo/app/f0$a;

    invoke-direct {p1, p0}, Lbo/app/f0$a;-><init>(Lbo/app/f0;)V

    iput-object p1, p0, Lbo/app/f0;->d:Landroid/net/ConnectivityManager$NetworkCallback;

    goto :goto_0

    :cond_0
    new-instance p1, Lbo/app/f0$b;

    invoke-direct {p1, p0, p2}, Lbo/app/f0$b;-><init>(Lbo/app/f0;Lbo/app/g2;)V

    iput-object p1, p0, Lbo/app/f0;->c:Landroid/content/BroadcastReceiver;

    :goto_0
    invoke-virtual {p0, p2}, Lbo/app/f0;->a(Lbo/app/g2;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic a(Lbo/app/f0;)Landroid/net/ConnectivityManager;
    .locals 0

    iget-object p0, p0, Lbo/app/f0;->i:Landroid/net/ConnectivityManager;

    return-object p0
.end method

.method private final a(J)Lzh2;
    .locals 18

    move-object/from16 v8, p0

    move-wide/from16 v9, p1

    iget-wide v0, v8, Lbo/app/f0;->g:J

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    const/4 v11, 0x0

    if-ltz v0, :cond_0

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->f:Lk20$a;

    new-instance v5, Lbo/app/f0$g;

    invoke-direct {v5, v9, v10, v8}, Lbo/app/f0$g;-><init>(JLbo/app/f0;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    sget-object v12, LZ10;->b:LZ10;

    new-instance v15, Lbo/app/f0$h;

    invoke-direct {v15, v8, v9, v10, v11}, Lbo/app/f0$h;-><init>(Lbo/app/f0;JLkotlin/coroutines/Continuation;)V

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x3

    const/16 v17, 0x0

    invoke-static/range {v12 .. v17}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    move-result-object v11

    goto :goto_0

    :cond_0
    iget-object v0, v8, Lbo/app/f0;->a:Landroid/content/Context;

    invoke-static {v0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    invoke-virtual {v0}, Lcom/appboy/Appboy;->requestImmediateDataFlush()V

    sget-object v0, Lk20;->a:Lk20;

    new-instance v5, Lbo/app/f0$i;

    invoke-direct {v5, v8}, Lbo/app/f0$i;-><init>(Lbo/app/f0;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    return-object v11
.end method

.method private final a()V
    .locals 3

    iget-object v0, p0, Lbo/app/f0;->k:Lzh2;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lzh2$a;->a(Lzh2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :goto_0
    iput-object v1, p0, Lbo/app/f0;->k:Lzh2;

    return-void
.end method

.method private final a(Landroid/net/NetworkCapabilities;)V
    .locals 0

    invoke-static {p1}, Lbo/app/v;->a(Landroid/net/NetworkCapabilities;)Lbo/app/o3;

    move-result-object p1

    iput-object p1, p0, Lbo/app/f0;->j:Lbo/app/o3;

    invoke-virtual {p0}, Lbo/app/f0;->c()V

    return-void
.end method

.method public static final synthetic a(Lbo/app/f0;Landroid/net/NetworkCapabilities;)V
    .locals 0

    invoke-direct {p0, p1}, Lbo/app/f0;->a(Landroid/net/NetworkCapabilities;)V

    return-void
.end method

.method private static final a(Lbo/app/f0;Lbo/app/c5;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lbo/app/c5;->a()Lbo/app/n2;

    move-result-object p1

    instance-of p1, p1, Lbo/app/t4;

    if-eqz p1, :cond_0

    iget p1, p0, Lbo/app/f0;->l:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lbo/app/f0;->l:I

    invoke-virtual {p0}, Lbo/app/f0;->c()V

    :cond_0
    return-void
.end method

.method public static final synthetic a(Lbo/app/f0;Lbo/app/g2;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lbo/app/f0;->a(Lbo/app/g2;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final a(Lbo/app/f0;Lbo/app/h5;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lbo/app/i5;->b:Lbo/app/i5;

    iput-object p1, p0, Lbo/app/f0;->f:Lbo/app/i5;

    const/4 p1, 0x0

    iput p1, p0, Lbo/app/f0;->l:I

    invoke-virtual {p0}, Lbo/app/f0;->c()V

    return-void
.end method

.method private static final a(Lbo/app/f0;Lbo/app/j5;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lbo/app/i5;->c:Lbo/app/i5;

    iput-object p1, p0, Lbo/app/f0;->f:Lbo/app/i5;

    invoke-virtual {p0}, Lbo/app/f0;->c()V

    return-void
.end method

.method public static final synthetic a(Lbo/app/f0;Lbo/app/o3;)V
    .locals 0

    iput-object p1, p0, Lbo/app/f0;->j:Lbo/app/o3;

    return-void
.end method

.method private static final a(Lbo/app/f0;Lbo/app/p4;)V
    .locals 8

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk20;->a:Lk20;

    sget-object v5, Lbo/app/f0$e;->b:Lbo/app/f0$e;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-wide v0, p0, Lbo/app/f0;->g:J

    iget-object p1, p0, Lbo/app/f0;->e:Lbo/app/e1;

    long-to-int v2, v0

    invoke-virtual {p1, v2}, Lbo/app/e1;->a(I)I

    move-result p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lbo/app/f0;->b(J)V

    return-void
.end method

.method private static final a(Lbo/app/f0;Lbo/app/q4;)V
    .locals 8

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lbo/app/f0;->e:Lbo/app/e1;

    invoke-virtual {p1}, Lbo/app/e1;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbo/app/f0;->e:Lbo/app/e1;

    invoke-virtual {p1}, Lbo/app/e1;->c()V

    sget-object v0, Lk20;->a:Lk20;

    new-instance v5, Lbo/app/f0$f;

    invoke-direct {v5, p0}, Lbo/app/f0$f;-><init>(Lbo/app/f0;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-wide v0, p0, Lbo/app/f0;->g:J

    invoke-direct {p0, v0, v1}, Lbo/app/f0;->b(J)V

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Lbo/app/f0;->l:I

    return-void
.end method

.method private final a(Lbo/app/g2;Ljava/lang/Throwable;)V
    .locals 8

    :try_start_0
    const-class v0, Ljava/lang/Throwable;

    invoke-interface {p1, p2, v0}, Lbo/app/g2;->a(Ljava/lang/Object;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v3, p1

    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->e:Lk20$a;

    sget-object v5, Lbo/app/f0$j;->b:Lbo/app/f0$j;

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final synthetic b(Lbo/app/f0;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lbo/app/f0;->a:Landroid/content/Context;

    return-object p0
.end method

.method private final b(J)V
    .locals 9

    invoke-direct {p0}, Lbo/app/f0;->a()V

    iget-wide v0, p0, Lbo/app/f0;->g:J

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    sget-object v1, Lk20;->a:Lk20;

    new-instance v6, Lbo/app/f0$m;

    invoke-direct {v6, p1, p2}, Lbo/app/f0$m;-><init>(J)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lbo/app/f0;->a(J)Lzh2;

    move-result-object p1

    iput-object p1, p0, Lbo/app/f0;->k:Lzh2;

    :cond_0
    return-void
.end method

.method public static synthetic b(Lbo/app/f0;Lbo/app/p4;)V
    .locals 0

    invoke-static {p0, p1}, Lbo/app/f0;->a(Lbo/app/f0;Lbo/app/p4;)V

    return-void
.end method

.method public static final synthetic c(Lbo/app/f0;)Lbo/app/o3;
    .locals 0

    iget-object p0, p0, Lbo/app/f0;->j:Lbo/app/o3;

    return-object p0
.end method

.method public static synthetic c(Lbo/app/f0;Lbo/app/q4;)V
    .locals 0

    invoke-static {p0, p1}, Lbo/app/f0;->a(Lbo/app/f0;Lbo/app/q4;)V

    return-void
.end method

.method public static final synthetic d(Lbo/app/f0;)Lbo/app/i5;
    .locals 0

    iget-object p0, p0, Lbo/app/f0;->f:Lbo/app/i5;

    return-object p0
.end method

.method public static synthetic d(Lbo/app/f0;Lbo/app/j5;)V
    .locals 0

    invoke-static {p0, p1}, Lbo/app/f0;->a(Lbo/app/f0;Lbo/app/j5;)V

    return-void
.end method

.method public static synthetic e(Lbo/app/f0;Lbo/app/h5;)V
    .locals 0

    invoke-static {p0, p1}, Lbo/app/f0;->a(Lbo/app/f0;Lbo/app/h5;)V

    return-void
.end method

.method public static synthetic f(Lbo/app/f0;Lbo/app/c5;)V
    .locals 0

    invoke-static {p0, p1}, Lbo/app/f0;->a(Lbo/app/f0;Lbo/app/c5;)V

    return-void
.end method


# virtual methods
.method public final a(Lbo/app/g2;)V
    .locals 2

    const-string v0, "eventManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LpN6;

    invoke-direct {v0, p0}, LpN6;-><init>(Lbo/app/f0;)V

    const-class v1, Lbo/app/h5;

    invoke-interface {p1, v0, v1}, Lbo/app/g2;->b(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)Z

    new-instance v0, LqN6;

    invoke-direct {v0, p0}, LqN6;-><init>(Lbo/app/f0;)V

    const-class v1, Lbo/app/j5;

    invoke-interface {p1, v0, v1}, Lbo/app/g2;->b(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)Z

    new-instance v0, LrN6;

    invoke-direct {v0, p0}, LrN6;-><init>(Lbo/app/f0;)V

    const-class v1, Lbo/app/p4;

    invoke-interface {p1, v0, v1}, Lbo/app/g2;->b(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)Z

    new-instance v0, LsN6;

    invoke-direct {v0, p0}, LsN6;-><init>(Lbo/app/f0;)V

    const-class v1, Lbo/app/q4;

    invoke-interface {p1, v0, v1}, Lbo/app/g2;->b(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)Z

    new-instance v0, LtN6;

    invoke-direct {v0, p0}, LtN6;-><init>(Lbo/app/f0;)V

    const-class v1, Lbo/app/c5;

    invoke-interface {p1, v0, v1}, Lbo/app/g2;->b(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)Z

    return-void
.end method

.method public final declared-synchronized a(Z)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lbo/app/f0;->m:Z

    invoke-virtual {p0}, Lbo/app/f0;->c()V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbo/app/f0;->f()Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lbo/app/f0;->e()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lbo/app/f0;->g:J

    return-wide v0
.end method

.method public final c()V
    .locals 14

    iget-wide v0, p0, Lbo/app/f0;->g:J

    iget-object v2, p0, Lbo/app/f0;->f:Lbo/app/i5;

    sget-object v3, Lbo/app/i5;->c:Lbo/app/i5;

    const-wide/16 v4, -0x1

    if-eq v2, v3, :cond_5

    iget-boolean v2, p0, Lbo/app/f0;->m:Z

    if-nez v2, :cond_5

    iget v2, p0, Lbo/app/f0;->l:I

    const/16 v3, 0x32

    if-lt v2, v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lbo/app/f0;->j:Lbo/app/o3;

    sget-object v3, Lbo/app/f0$d;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_4

    const/4 v3, 0x2

    if-eq v2, v3, :cond_3

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_1

    iget-object v2, p0, Lbo/app/f0;->b:Lbo/app/e0;

    invoke-virtual {v2}, Lbo/app/e0;->b()J

    move-result-wide v2

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    iget-object v2, p0, Lbo/app/f0;->b:Lbo/app/e0;

    invoke-virtual {v2}, Lbo/app/e0;->c()J

    move-result-wide v2

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lbo/app/f0;->b:Lbo/app/e0;

    invoke-virtual {v2}, Lbo/app/e0;->a()J

    move-result-wide v2

    goto :goto_0

    :cond_4
    move-wide v2, v4

    :goto_0
    iput-wide v2, p0, Lbo/app/f0;->g:J

    cmp-long v4, v2, v4

    if-eqz v4, :cond_6

    const-wide/16 v4, 0x3e8

    cmp-long v2, v2, v4

    if-gez v2, :cond_6

    sget-object v6, Lk20;->a:Lk20;

    sget-object v8, Lk20$a;->g:Lk20$a;

    new-instance v11, Lbo/app/f0$k;

    invoke-direct {v11, p0}, Lbo/app/f0$k;-><init>(Lbo/app/f0;)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v7, p0

    invoke-static/range {v6 .. v13}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iput-wide v4, p0, Lbo/app/f0;->g:J

    goto :goto_2

    :cond_5
    :goto_1
    iput-wide v4, p0, Lbo/app/f0;->g:J

    :cond_6
    :goto_2
    iget-wide v2, p0, Lbo/app/f0;->g:J

    cmp-long v2, v0, v2

    if-eqz v2, :cond_7

    sget-object v3, Lk20;->a:Lk20;

    new-instance v8, Lbo/app/f0$l;

    invoke-direct {v8, v0, v1, p0}, Lbo/app/f0$l;-><init>(JLbo/app/f0;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v4, p0

    invoke-static/range {v3 .. v10}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    iget-wide v0, p0, Lbo/app/f0;->g:J

    invoke-direct {p0, v0, v1}, Lbo/app/f0;->b(J)V

    :cond_7
    return-void
.end method

.method public final d()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lbo/app/f0;->i:Landroid/net/ConnectivityManager;

    iget-object v1, p0, Lbo/app/f0;->d:Landroid/net/ConnectivityManager$NetworkCallback;

    if-nez v1, :cond_0

    const-string v1, "connectivityNetworkCallback"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    iget-object v0, p0, Lbo/app/f0;->i:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v0

    iget-object v1, p0, Lbo/app/f0;->i:Landroid/net/ConnectivityManager;

    invoke-virtual {v1, v0}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    invoke-direct {p0, v0}, Lbo/app/f0;->a(Landroid/net/NetworkCapabilities;)V

    :cond_1
    return-void
.end method

.method public final declared-synchronized e()Z
    .locals 9

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lbo/app/f0;->h:Z

    if-eqz v0, :cond_0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v6, Lbo/app/f0$n;->b:Lbo/app/f0$n;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_1
    sget-object v1, Lk20;->a:Lk20;

    sget-object v6, Lbo/app/f0$o;->b:Lbo/app/f0$o;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lbo/app/f0;->d()V

    iget-wide v0, p0, Lbo/app/f0;->g:J

    invoke-direct {p0, v0, v1}, Lbo/app/f0;->b(J)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbo/app/f0;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized f()Z
    .locals 10

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lbo/app/f0;->h:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v2, Lk20;->a:Lk20;

    sget-object v7, Lbo/app/f0$p;->b:Lbo/app/f0$p;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x7

    const/4 v9, 0x0

    move-object v3, p0

    invoke-static/range {v2 .. v9}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    sget-object v2, Lk20;->a:Lk20;

    sget-object v7, Lbo/app/f0$q;->b:Lbo/app/f0$q;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x7

    const/4 v9, 0x0

    move-object v3, p0

    invoke-static/range {v2 .. v9}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-direct {p0}, Lbo/app/f0;->a()V

    invoke-virtual {p0}, Lbo/app/f0;->g()V

    iput-boolean v1, p0, Lbo/app/f0;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final g()V
    .locals 9

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lbo/app/f0;->i:Landroid/net/ConnectivityManager;

    iget-object v1, p0, Lbo/app/f0;->d:Landroid/net/ConnectivityManager$NetworkCallback;

    if-nez v1, :cond_0

    const-string v1, "connectivityNetworkCallback"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lbo/app/f0;->a:Landroid/content/Context;

    iget-object v1, p0, Lbo/app/f0;->c:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v4, v0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->e:Lk20$a;

    sget-object v6, Lbo/app/f0$r;->b:Lbo/app/f0$r;

    const/4 v5, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
