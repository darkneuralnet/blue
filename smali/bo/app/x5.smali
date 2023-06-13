.class public final Lbo/app/x5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {}
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u0008R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u0012\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0005\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006X\u0087D\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\u0004\u0012\u0004\u0008\u000b\u0010\u0008\u001a\u0004\u0008\n\u0010\u0006R \u0010\u000c\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u0004\u0012\u0004\u0008\u000e\u0010\u0008\u001a\u0004\u0008\r\u0010\u0006R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087D\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u0012\u0004\u0008\u0014\u0010\u0008\u001a\u0004\u0008\u0012\u0010\u0013R \u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00158FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0019\u0010\u0008\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001c"
    }
    d2 = {
        "Lbo/app/x5;",
        "",
        "",
        "cpuAvailableCount",
        "I",
        "b",
        "()I",
        "getCpuAvailableCount$annotations",
        "()V",
        "corePoolSize",
        "a",
        "getCorePoolSize$annotations",
        "maximumPoolSize",
        "d",
        "getMaximumPoolSize$annotations",
        "",
        "keepAliveSeconds",
        "J",
        "c",
        "()J",
        "getKeepAliveSeconds$annotations",
        "Ljava/util/concurrent/BlockingQueue;",
        "Ljava/lang/Runnable;",
        "e",
        "()Ljava/util/concurrent/BlockingQueue;",
        "getWorkQueue$annotations",
        "workQueue",
        "<init>",
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
.field public static final a:Lbo/app/x5;

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbo/app/x5;

    invoke-direct {v0}, Lbo/app/x5;-><init>()V

    sput-object v0, Lbo/app/x5;->a:Lbo/app/x5;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Lbo/app/x5;->b:I

    const/4 v1, 0x2

    sput v1, Lbo/app/x5;->c:I

    add-int/lit8 v0, v0, -0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    sput v0, Lbo/app/x5;->d:I

    const-wide/16 v0, 0x1

    sput-wide v0, Lbo/app/x5;->e:J

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()I
    .locals 1

    sget v0, Lbo/app/x5;->c:I

    return v0
.end method

.method public static final b()I
    .locals 1

    sget v0, Lbo/app/x5;->b:I

    return v0
.end method

.method public static final c()J
    .locals 2

    sget-wide v0, Lbo/app/x5;->e:J

    return-wide v0
.end method

.method public static final d()I
    .locals 1

    sget v0, Lbo/app/x5;->d:I

    return v0
.end method

.method public static final e()Ljava/util/concurrent/BlockingQueue;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    return-object v0
.end method
