.class public Lwy0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwy0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:Z

.field public c:LK46;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lwy0$a;->a:Z

    iput-boolean v0, p0, Lwy0$a;->b:Z

    new-instance v0, LK46;

    const-wide/16 v1, 0x1e

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v0, v1, v2, v3}, LK46;-><init>(JLjava/util/concurrent/TimeUnit;)V

    iput-object v0, p0, Lwy0$a;->c:LK46;

    return-void
.end method


# virtual methods
.method public a()Lwy0;
    .locals 4

    new-instance v0, Lwy0;

    iget-boolean v1, p0, Lwy0$a;->a:Z

    iget-boolean v2, p0, Lwy0$a;->b:Z

    iget-object v3, p0, Lwy0$a;->c:LK46;

    invoke-direct {v0, v1, v2, v3}, Lwy0;-><init>(ZZLK46;)V

    return-object v0
.end method

.method public b(Z)Lwy0$a;
    .locals 0

    iput-boolean p1, p0, Lwy0$a;->a:Z

    return-object p0
.end method

.method public c(LK46;)Lwy0$a;
    .locals 0

    iput-object p1, p0, Lwy0$a;->c:LK46;

    return-object p0
.end method

.method public d(Z)Lwy0$a;
    .locals 0

    iput-boolean p1, p0, Lwy0$a;->b:Z

    return-object p0
.end method
