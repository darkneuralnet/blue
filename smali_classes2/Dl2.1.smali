.class public LDl2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z = false

.field public static b:Z = false

.field public static c:Z = true

.field public static d:Z = true

.field public static e:[Ljava/lang/String;

.field public static f:[J

.field public static g:I

.field public static h:I

.field public static i:LYD2;

.field public static j:LXD2;

.field public static volatile k:LF73;

.field public static volatile l:Ly73;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 4

    sget-boolean v0, LDl2;->b:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v0, LDl2;->g:I

    const/16 v1, 0x14

    if-ne v0, v1, :cond_1

    sget p0, LDl2;->h:I

    add-int/lit8 p0, p0, 0x1

    sput p0, LDl2;->h:I

    return-void

    :cond_1
    sget-object v1, LDl2;->e:[Ljava/lang/String;

    aput-object p0, v1, v0

    sget-object v1, LDl2;->f:[J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    aput-wide v2, v1, v0

    invoke-static {p0}, Le66;->a(Ljava/lang/String;)V

    sget p0, LDl2;->g:I

    add-int/lit8 p0, p0, 0x1

    sput p0, LDl2;->g:I

    return-void
.end method

.method public static b(Ljava/lang/String;)F
    .locals 4

    sget v0, LDl2;->h:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    sput v0, LDl2;->h:I

    return v1

    :cond_0
    sget-boolean v0, LDl2;->b:Z

    if-nez v0, :cond_1

    return v1

    :cond_1
    sget v0, LDl2;->g:I

    add-int/lit8 v0, v0, -0x1

    sput v0, LDl2;->g:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    sget-object v1, LDl2;->e:[Ljava/lang/String;

    aget-object v0, v1, v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Le66;->b()V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sget-object p0, LDl2;->f:[J

    sget v2, LDl2;->g:I

    aget-wide v2, p0, v2

    sub-long/2addr v0, v2

    long-to-float p0, v0

    const v0, 0x49742400    # 1000000.0f

    div-float/2addr p0, v0

    return p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unbalanced trace call "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ". Expected "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, LDl2;->e:[Ljava/lang/String;

    sget v2, LDl2;->g:I

    aget-object p0, p0, v2

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Can\'t end trace section. There are none."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c()Z
    .locals 1

    sget-boolean v0, LDl2;->d:Z

    return v0
.end method

.method public static d(Landroid/content/Context;)Ly73;
    .locals 3

    sget-boolean v0, LDl2;->c:Z

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sget-object v0, LDl2;->l:Ly73;

    if-nez v0, :cond_3

    const-class v1, Ly73;

    monitor-enter v1

    :try_start_0
    sget-object v0, LDl2;->l:Ly73;

    if-nez v0, :cond_2

    new-instance v0, Ly73;

    sget-object v2, LDl2;->j:LXD2;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v2, LDl2$a;

    invoke-direct {v2, p0}, LDl2$a;-><init>(Landroid/content/Context;)V

    :goto_0
    invoke-direct {v0, v2}, Ly73;-><init>(LXD2;)V

    sput-object v0, LDl2;->l:Ly73;

    :cond_2
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception p0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_3
    :goto_1
    return-object v0
.end method

.method public static e(Landroid/content/Context;)LF73;
    .locals 3

    sget-object v0, LDl2;->k:LF73;

    if-nez v0, :cond_2

    const-class v1, LF73;

    monitor-enter v1

    :try_start_0
    sget-object v0, LDl2;->k:LF73;

    if-nez v0, :cond_1

    new-instance v0, LF73;

    invoke-static {p0}, LDl2;->d(Landroid/content/Context;)Ly73;

    move-result-object p0

    sget-object v2, LDl2;->i:LYD2;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, LYX0;

    invoke-direct {v2}, LYX0;-><init>()V

    :goto_0
    invoke-direct {v0, p0, v2}, LF73;-><init>(Ly73;LYD2;)V

    sput-object v0, LDl2;->k:LF73;

    :cond_1
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception p0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    :goto_1
    return-object v0
.end method
