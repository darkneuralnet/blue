.class public final LvN6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQN6;


# instance fields
.field public final synthetic a:Ljava/util/Set;

.field public final synthetic b:LVO6;

.field public final synthetic c:LmO6;


# direct methods
.method public constructor <init>(LmO6;Ljava/util/Set;LVO6;)V
    .locals 0

    iput-object p1, p0, LvN6;->c:LmO6;

    iput-object p2, p0, LvN6;->a:Ljava/util/Set;

    iput-object p3, p0, LvN6;->b:LVO6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/zip/ZipFile;Ljava/util/Set;)V
    .locals 3
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

    iget-object v0, p0, LvN6;->a:Ljava/util/Set;

    iget-object v1, p0, LvN6;->c:LmO6;

    iget-object v2, p0, LvN6;->b:LVO6;

    invoke-static {v1, p2, v2, p1}, LmO6;->d(LmO6;Ljava/util/Set;LVO6;Ljava/util/zip/ZipFile;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method
