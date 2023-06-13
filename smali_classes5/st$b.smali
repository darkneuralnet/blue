.class public final Lst$b;
.super LIk0$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lst;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:LIk0$b;

.field public b:Lcc;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LIk0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LIk0;
    .locals 4

    new-instance v0, Lst;

    iget-object v1, p0, Lst$b;->a:LIk0$b;

    iget-object v2, p0, Lst$b;->b:Lcc;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lst;-><init>(LIk0$b;Lcc;Lst$a;)V

    return-object v0
.end method

.method public b(Lcc;)LIk0$a;
    .locals 0

    iput-object p1, p0, Lst$b;->b:Lcc;

    return-object p0
.end method

.method public c(LIk0$b;)LIk0$a;
    .locals 0

    iput-object p1, p0, Lst$b;->a:LIk0$b;

    return-object p0
.end method
