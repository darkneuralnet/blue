.class public LEW0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcD1$l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEW0;->onAdd()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LEW0;


# direct methods
.method public constructor <init>(LEW0;)V
    .locals 0

    iput-object p1, p0, LEW0$a;->a:LEW0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(LfM2;)Z
    .locals 2

    iget-object v0, p0, LEW0$a;->a:LEW0;

    invoke-static {v0}, LEW0;->g(LEW0;)LGl0$d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LEW0$a;->a:LEW0;

    invoke-static {v0}, LEW0;->g(LEW0;)LGl0$d;

    move-result-object v0

    iget-object v1, p0, LEW0$a;->a:LEW0;

    invoke-static {v1}, LEW0;->j(LEW0;)LEW0$g;

    move-result-object v1

    invoke-virtual {v1, p1}, LEW0$g;->b(LfM2;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LEl0;

    invoke-interface {v0, p1}, LGl0$d;->a(LEl0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
