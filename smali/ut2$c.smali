.class public Lut2$c;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lut2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final c:Landroidx/lifecycle/u$b;


# instance fields
.field public a:LLN5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LLN5<",
            "Lut2$a;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lut2$c$a;

    invoke-direct {v0}, Lut2$c$a;-><init>()V

    sput-object v0, Lut2$c;->c:Landroidx/lifecycle/u$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LOr6;-><init>()V

    new-instance v0, LLN5;

    invoke-direct {v0}, LLN5;-><init>()V

    iput-object v0, p0, Lut2$c;->a:LLN5;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lut2$c;->b:Z

    return-void
.end method

.method public static g(LWr6;)Lut2$c;
    .locals 2

    new-instance v0, Landroidx/lifecycle/u;

    sget-object v1, Lut2$c;->c:Landroidx/lifecycle/u$b;

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/u;-><init>(LWr6;Landroidx/lifecycle/u$b;)V

    const-class p0, Lut2$c;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/u;->a(Ljava/lang/Class;)LOr6;

    move-result-object p0

    check-cast p0, Lut2$c;

    return-object p0
.end method


# virtual methods
.method public e(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lut2$c;->a:LLN5;

    invoke-virtual {v0}, LLN5;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Loaders:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "    "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lut2$c;->a:LLN5;

    invoke-virtual {v2}, LLN5;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lut2$c;->a:LLN5;

    invoke-virtual {v2, v1}, LLN5;->t(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lut2$a;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v3, p0, Lut2$c;->a:LLN5;

    invoke-virtual {v3, v1}, LLN5;->o(I)I

    move-result v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Lut2$a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v2, v0, p2, p3, p4}, Lut2$a;->c(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lut2$c;->b:Z

    return-void
.end method

.method public h(I)Lut2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I)",
            "Lut2$a<",
            "TD;>;"
        }
    .end annotation

    iget-object v0, p0, Lut2$c;->a:LLN5;

    invoke-virtual {v0, p1}, LLN5;->k(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lut2$a;

    return-object p1
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lut2$c;->b:Z

    return v0
.end method

.method public j()V
    .locals 3

    iget-object v0, p0, Lut2$c;->a:LLN5;

    invoke-virtual {v0}, LLN5;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lut2$c;->a:LLN5;

    invoke-virtual {v2, v1}, LLN5;->t(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lut2$a;

    invoke-virtual {v2}, Lut2$a;->e()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k(ILut2$a;)V
    .locals 1

    iget-object v0, p0, Lut2$c;->a:LLN5;

    invoke-virtual {v0, p1, p2}, LLN5;->p(ILjava/lang/Object;)V

    return-void
.end method

.method public l()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lut2$c;->b:Z

    return-void
.end method

.method public onCleared()V
    .locals 4

    invoke-super {p0}, LOr6;->onCleared()V

    iget-object v0, p0, Lut2$c;->a:LLN5;

    invoke-virtual {v0}, LLN5;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lut2$c;->a:LLN5;

    invoke-virtual {v2, v1}, LLN5;->t(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lut2$a;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lut2$a;->b(Z)Lst2;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lut2$c;->a:LLN5;

    invoke-virtual {v0}, LLN5;->e()V

    return-void
.end method
