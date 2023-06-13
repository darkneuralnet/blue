.class public final Lf08;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LDV7;

.field public final c:Ljava/util/concurrent/ExecutorService;

.field public final d:LCI7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LCI7<",
            "LOu9;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;LDV7;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf08;->a:Landroid/content/Context;

    iput-object p2, p0, Lf08;->b:LDV7;

    sget-object p1, LxX7;->b:Ljava/util/concurrent/ExecutorService;

    iput-object p1, p0, Lf08;->c:Ljava/util/concurrent/ExecutorService;

    new-instance p2, LCI7;

    invoke-static {}, LxX7;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, LOu9;->x()LOu9;

    move-result-object v1

    invoke-direct {p2, v0, p1, v1}, LCI7;-><init>(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;LEm9;)V

    iput-object p2, p0, Lf08;->d:LCI7;

    return-void
.end method
