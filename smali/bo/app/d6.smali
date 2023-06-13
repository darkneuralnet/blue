.class public abstract Lbo/app/d6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbo/app/t2;


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private final a:J

.field private final b:J

.field private c:Lbo/app/u1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lbo/app/d6;

    invoke-static {v0}, Lk20;->n(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbo/app/d6;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LoT0;->h()J

    move-result-wide v0

    iput-wide v0, p0, Lbo/app/d6;->b:J

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    iput-wide v0, p0, Lbo/app/d6;->a:J

    return-void
.end method

.method public constructor <init>(Lbo/app/u1;)V
    .locals 0

    invoke-direct {p0}, Lbo/app/d6;-><init>()V

    iput-object p1, p0, Lbo/app/d6;->c:Lbo/app/u1;

    return-void
.end method


# virtual methods
.method public a()Lbo/app/u1;
    .locals 1

    iget-object v0, p0, Lbo/app/d6;->c:Lbo/app/u1;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-static {p1}, LjS5;->g(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {p1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    const-string v3, "_"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object p1, v0, v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    sget-object v2, Lbo/app/d6;->d:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected error decoding Base64 encoded campaign Id "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1, v0}, Lk20;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lbo/app/d6;->a:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lbo/app/d6;->b:J

    return-wide v0
.end method
