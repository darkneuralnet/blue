.class public LTc0$b;
.super LTc0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTc0;->c(Ljava/lang/String;LaD6;Z)LTc0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:LaD6;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Z


# direct methods
.method public constructor <init>(LaD6;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, LTc0$b;->c:LaD6;

    iput-object p2, p0, LTc0$b;->d:Ljava/lang/String;

    iput-boolean p3, p0, LTc0$b;->e:Z

    invoke-direct {p0}, LTc0;-><init>()V

    return-void
.end method


# virtual methods
.method public g()V
    .locals 4

    iget-object v0, p0, LTc0$b;->c:LaD6;

    invoke-virtual {v0}, LaD6;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->I()LIG6;

    move-result-object v1

    iget-object v2, p0, LTc0$b;->d:Ljava/lang/String;

    invoke-interface {v1, v2}, LIG6;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, LTc0$b;->c:LaD6;

    invoke-virtual {p0, v3, v2}, LTc0;->a(LaD6;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, LEb5;->g()V

    iget-boolean v0, p0, LTc0$b;->e:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LTc0$b;->c:LaD6;

    invoke-virtual {p0, v0}, LTc0;->f(LaD6;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, LEb5;->g()V

    throw v1
.end method
