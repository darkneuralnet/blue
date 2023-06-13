.class public final LhN6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQN6;


# instance fields
.field public final synthetic a:LVO6;

.field public final synthetic b:Ljava/util/Set;

.field public final synthetic c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic d:LmO6;


# direct methods
.method public constructor <init>(LmO6;LVO6;Ljava/util/Set;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    iput-object p1, p0, LhN6;->d:LmO6;

    iput-object p2, p0, LhN6;->a:LVO6;

    iput-object p3, p0, LhN6;->b:Ljava/util/Set;

    iput-object p4, p0, LhN6;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/zip/ZipFile;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/zip/ZipFile;",
            "Ljava/util/Set<",
            "LjO6;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object p1, p0, LhN6;->d:LmO6;

    iget-object v0, p0, LhN6;->a:LVO6;

    new-instance v1, LTM6;

    invoke-direct {v1, p0}, LTM6;-><init>(LhN6;)V

    invoke-static {p1, v0, p2, v1}, LmO6;->c(LmO6;LVO6;Ljava/util/Set;LZN6;)V

    return-void
.end method
