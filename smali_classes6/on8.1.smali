.class public final Lon8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/concurrent/Executor;

.field public b:LP78;

.field public final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "LDu8;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LEv8;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LEv8;->a:LEv8;

    iput-object v0, p0, Lon8;->d:LEv8;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lon8;->c:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a()Lcn8;
    .locals 8

    new-instance v7, Lcn8;

    iget-object v1, p0, Lon8;->a:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lon8;->b:LP78;

    iget-object v3, p0, Lon8;->d:LEv8;

    iget-object v4, p0, Lon8;->c:Ljava/util/HashMap;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcn8;-><init>(Ljava/util/concurrent/Executor;LP78;LEv8;Ljava/util/Map;Ltw8;[B)V

    return-object v7
.end method

.method public final b(LDu8;)Lon8;
    .locals 3

    iget-object v0, p0, Lon8;->c:Ljava/util/HashMap;

    const-string v1, "singleproc"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v2, "There is already a factory registered for the ID %s"

    invoke-static {v0, v2, v1}, LyK8;->g(ZLjava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lon8;->c:Ljava/util/HashMap;

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final c(Ljava/util/concurrent/Executor;)Lon8;
    .locals 0

    iput-object p1, p0, Lon8;->a:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public final d(LP78;)Lon8;
    .locals 0

    iput-object p1, p0, Lon8;->b:LP78;

    return-object p0
.end method
