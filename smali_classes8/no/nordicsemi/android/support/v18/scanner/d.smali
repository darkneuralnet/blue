.class public Lno/nordicsemi/android/support/v18/scanner/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<W:",
        "Lno/nordicsemi/android/support/v18/scanner/a$a;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "TW;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/d;->a:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public a(Lno/nordicsemi/android/support/v18/scanner/a$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TW;)V"
        }
    .end annotation

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/d;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b()V
    .locals 5

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iget-object v1, p0, Lno/nordicsemi/android/support/v18/scanner/d;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lno/nordicsemi/android/support/v18/scanner/a$a;

    iget-object v3, v2, Lno/nordicsemi/android/support/v18/scanner/a$a;->h:Ljj5;

    instance-of v4, v3, LQh6;

    if-eqz v4, :cond_0

    check-cast v3, LQh6;

    invoke-virtual {v3}, LQh6;->e()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lno/nordicsemi/android/support/v18/scanner/a$a;

    iget-object v2, p0, Lno/nordicsemi/android/support/v18/scanner/d;->a:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-void
.end method

.method public c(Ljj5;)Z
    .locals 4

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/d;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lno/nordicsemi/android/support/v18/scanner/a$a;

    iget-object v1, v1, Lno/nordicsemi/android/support/v18/scanner/a$a;->h:Ljj5;

    const/4 v2, 0x1

    if-ne v1, p1, :cond_1

    return v2

    :cond_1
    instance-of v3, v1, LQh6;

    if-eqz v3, :cond_0

    check-cast v1, LQh6;

    invoke-virtual {v1}, LQh6;->d()Ljj5;

    move-result-object v1

    if-ne v1, p1, :cond_0

    return v2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public d(Ljj5;)Lno/nordicsemi/android/support/v18/scanner/a$a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj5;",
            ")TW;"
        }
    .end annotation

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/d;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lno/nordicsemi/android/support/v18/scanner/a$a;

    iget-object v2, v1, Lno/nordicsemi/android/support/v18/scanner/a$a;->h:Ljj5;

    if-ne v2, p1, :cond_1

    return-object v1

    :cond_1
    instance-of v3, v2, LQh6;

    if-eqz v3, :cond_0

    check-cast v2, LQh6;

    invoke-virtual {v2}, LQh6;->d()Ljj5;

    move-result-object v2

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public e(Ljj5;)Lno/nordicsemi/android/support/v18/scanner/a$a;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj5;",
            ")TW;"
        }
    .end annotation

    iget-object v0, p0, Lno/nordicsemi/android/support/v18/scanner/d;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lno/nordicsemi/android/support/v18/scanner/a$a;

    iget-object v2, v1, Lno/nordicsemi/android/support/v18/scanner/a$a;->h:Ljj5;

    if-ne v2, p1, :cond_1

    return-object v1

    :cond_1
    instance-of v3, v2, LQh6;

    if-eqz v3, :cond_0

    check-cast v2, LQh6;

    invoke-virtual {v2}, LQh6;->d()Ljj5;

    move-result-object v2

    if-ne v2, p1, :cond_0

    iget-object p1, p0, Lno/nordicsemi/android/support/v18/scanner/d;->a:Ljava/util/Set;

    invoke-interface {p1, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-object v1

    :cond_2
    invoke-virtual {p0}, Lno/nordicsemi/android/support/v18/scanner/d;->b()V

    const/4 p1, 0x0

    return-object p1
.end method
