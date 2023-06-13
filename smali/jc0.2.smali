.class public abstract Ljc0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljc0$b;,
        Ljc0$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljc0$b;)Ljc0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ljc0;->b(Ljc0$b;Ljc0$a;)Ljc0;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljc0$b;Ljc0$a;)Ljc0;
    .locals 1

    new-instance v0, Lnt;

    invoke-direct {v0, p0, p1}, Lnt;-><init>(Ljc0$b;Ljc0$a;)V

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljc0$a;
.end method

.method public abstract d()Ljc0$b;
.end method
