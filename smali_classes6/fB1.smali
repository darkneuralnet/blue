.class public LfB1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lad;


# instance fields
.field public final a:Ljava/lang/Runtime;

.field public final b:Landroid/app/ActivityManager;

.field public final c:Landroid/app/ActivityManager$MemoryInfo;

.field public final d:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lad;->e()Lad;

    move-result-object v0

    sput-object v0, LfB1;->e:Lad;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-direct {p0, v0, p1}, LfB1;-><init>(Ljava/lang/Runtime;Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runtime;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfB1;->a:Ljava/lang/Runtime;

    iput-object p2, p0, LfB1;->d:Landroid/content/Context;

    const-string p1, "activity"

    invoke-virtual {p2, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/ActivityManager;

    iput-object p1, p0, LfB1;->b:Landroid/app/ActivityManager;

    new-instance p2, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {p2}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    iput-object p2, p0, LfB1;->c:Landroid/app/ActivityManager$MemoryInfo;

    invoke-virtual {p1, p2}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 3

    sget-object v0, LhR5;->g:LhR5;

    iget-object v1, p0, LfB1;->c:Landroid/app/ActivityManager$MemoryInfo;

    iget-wide v1, v1, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    invoke-virtual {v0, v1, v2}, LhR5;->a(J)J

    move-result-wide v0

    invoke-static {v0, v1}, LQi6;->c(J)I

    move-result v0

    return v0
.end method

.method public b()I
    .locals 3

    sget-object v0, LhR5;->g:LhR5;

    iget-object v1, p0, LfB1;->a:Ljava/lang/Runtime;

    invoke-virtual {v1}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LhR5;->a(J)J

    move-result-wide v0

    invoke-static {v0, v1}, LQi6;->c(J)I

    move-result v0

    return v0
.end method

.method public c()I
    .locals 3

    sget-object v0, LhR5;->e:LhR5;

    iget-object v1, p0, LfB1;->b:Landroid/app/ActivityManager;

    invoke-virtual {v1}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, LhR5;->a(J)J

    move-result-wide v0

    invoke-static {v0, v1}, LQi6;->c(J)I

    move-result v0

    return v0
.end method
