.class public final synthetic Lj19;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lt19;

.field public final synthetic c:LVZ8;

.field public final synthetic d:LGF8;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lt19;LVZ8;LGF8;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj19;->b:Lt19;

    iput-object p2, p0, Lj19;->c:LVZ8;

    iput-object p3, p0, Lj19;->d:LGF8;

    iput-object p4, p0, Lj19;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lj19;->b:Lt19;

    iget-object v1, p0, Lj19;->c:LVZ8;

    iget-object v2, p0, Lj19;->d:LGF8;

    iget-object v3, p0, Lj19;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lt19;->b(LVZ8;LGF8;Ljava/lang/String;)V

    return-void
.end method
