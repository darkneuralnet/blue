.class public final LiX7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LDV7;

.field public final b:Ljava/util/concurrent/ExecutorService;

.field public final c:LCI7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LCI7<",
            "LIu9;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LDV7;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiX7;->a:LDV7;

    sget-object p1, LxX7;->b:Ljava/util/concurrent/ExecutorService;

    iput-object p1, p0, LiX7;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v0, LCI7;

    invoke-static {}, LxX7;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, LIu9;->x()LIu9;

    move-result-object v2

    invoke-direct {v0, v1, p1, v2}, LCI7;-><init>(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;LEm9;)V

    iput-object v0, p0, LiX7;->c:LCI7;

    return-void
.end method
