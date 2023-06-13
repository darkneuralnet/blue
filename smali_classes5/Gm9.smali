.class public final synthetic LGm9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Len9;

.field public final synthetic c:LRl9;

.field public final synthetic d:LO59;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Len9;LRl9;LO59;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGm9;->b:Len9;

    iput-object p2, p0, LGm9;->c:LRl9;

    iput-object p3, p0, LGm9;->d:LO59;

    iput-object p4, p0, LGm9;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LGm9;->b:Len9;

    iget-object v1, p0, LGm9;->c:LRl9;

    iget-object v2, p0, LGm9;->d:LO59;

    iget-object v3, p0, LGm9;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Len9;->c(LRl9;LO59;Ljava/lang/String;)V

    return-void
.end method
