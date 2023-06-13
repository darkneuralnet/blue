.class public LlM2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LlM2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LfM2;",
            ">;"
        }
    .end annotation
.end field

.field public b:LcD1$h;

.field public c:LcD1$l;

.field public d:LcD1$m;

.field public e:LcD1$b;

.field public final synthetic f:LlM2;


# direct methods
.method public constructor <init>(LlM2;)V
    .locals 0

    iput-object p1, p0, LlM2$a;->f:LlM2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, LlM2$a;->a:Ljava/util/Set;

    return-void
.end method

.method public static bridge synthetic a(LlM2$a;)LcD1$b;
    .locals 0

    iget-object p0, p0, LlM2$a;->e:LcD1$b;

    return-object p0
.end method

.method public static bridge synthetic b(LlM2$a;)LcD1$h;
    .locals 0

    iget-object p0, p0, LlM2$a;->b:LcD1$h;

    return-object p0
.end method

.method public static bridge synthetic c(LlM2$a;)LcD1$l;
    .locals 0

    iget-object p0, p0, LlM2$a;->c:LcD1$l;

    return-object p0
.end method

.method public static bridge synthetic d(LlM2$a;)LcD1$m;
    .locals 0

    iget-object p0, p0, LlM2$a;->d:LcD1$m;

    return-object p0
.end method


# virtual methods
.method public e(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;
    .locals 1

    iget-object v0, p0, LlM2$a;->f:LlM2;

    invoke-static {v0}, LlM2;->d(LlM2;)LcD1;

    move-result-object v0

    invoke-virtual {v0, p1}, LcD1;->c(Lcom/google/android/gms/maps/model/MarkerOptions;)LfM2;

    move-result-object p1

    iget-object v0, p0, LlM2$a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LlM2$a;->f:LlM2;

    invoke-static {v0}, LlM2;->a(LlM2;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public f()V
    .locals 3

    iget-object v0, p0, LlM2$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LfM2;

    invoke-virtual {v1}, LfM2;->f()V

    iget-object v2, p0, LlM2$a;->f:LlM2;

    invoke-static {v2}, LlM2;->a(LlM2;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LlM2$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public g(LfM2;)Z
    .locals 1

    iget-object v0, p0, LlM2$a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LlM2$a;->f:LlM2;

    invoke-static {v0}, LlM2;->a(LlM2;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LfM2;->f()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public h(LcD1$h;)V
    .locals 0

    iput-object p1, p0, LlM2$a;->b:LcD1$h;

    return-void
.end method

.method public i(LcD1$l;)V
    .locals 0

    iput-object p1, p0, LlM2$a;->c:LcD1$l;

    return-void
.end method
