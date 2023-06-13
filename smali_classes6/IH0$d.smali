.class public final LIH0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgy0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIH0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:LIH0$c;

.field public final b:LIH0$g;

.field public c:Ljava/lang/Boolean;

.field public d:Ljava/lang/Boolean;

.field public e:LK46;


# direct methods
.method public constructor <init>(LIH0$c;LIH0$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIH0$d;->a:LIH0$c;

    iput-object p2, p0, LIH0$d;->b:LIH0$g;

    return-void
.end method

.method public synthetic constructor <init>(LIH0$c;LIH0$g;LIH0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LIH0$d;-><init>(LIH0$c;LIH0$g;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Z)Lgy0$a;
    .locals 0

    invoke-virtual {p0, p1}, LIH0$d;->d(Z)LIH0$d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(LK46;)Lgy0$a;
    .locals 0

    invoke-virtual {p0, p1}, LIH0$d;->e(LK46;)LIH0$d;

    move-result-object p1

    return-object p1
.end method

.method public build()Lgy0;
    .locals 9

    iget-object v0, p0, LIH0$d;->c:Ljava/lang/Boolean;

    const-class v1, Ljava/lang/Boolean;

    invoke-static {v0, v1}, LyZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, LIH0$d;->d:Ljava/lang/Boolean;

    invoke-static {v0, v1}, LyZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, LIH0$d;->e:LK46;

    const-class v1, LK46;

    invoke-static {v0, v1}, LyZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, LIH0$e;

    iget-object v3, p0, LIH0$d;->a:LIH0$c;

    iget-object v4, p0, LIH0$d;->b:LIH0$g;

    iget-object v5, p0, LIH0$d;->c:Ljava/lang/Boolean;

    iget-object v6, p0, LIH0$d;->d:Ljava/lang/Boolean;

    iget-object v7, p0, LIH0$d;->e:LK46;

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, LIH0$e;-><init>(LIH0$c;LIH0$g;Ljava/lang/Boolean;Ljava/lang/Boolean;LK46;LIH0$a;)V

    return-object v0
.end method

.method public bridge synthetic c(Z)Lgy0$a;
    .locals 0

    invoke-virtual {p0, p1}, LIH0$d;->f(Z)LIH0$d;

    move-result-object p1

    return-object p1
.end method

.method public d(Z)LIH0$d;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, LyZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iput-object p1, p0, LIH0$d;->c:Ljava/lang/Boolean;

    return-object p0
.end method

.method public e(LK46;)LIH0$d;
    .locals 0

    invoke-static {p1}, LyZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LK46;

    iput-object p1, p0, LIH0$d;->e:LK46;

    return-object p0
.end method

.method public f(Z)LIH0$d;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, LyZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iput-object p1, p0, LIH0$d;->d:Ljava/lang/Boolean;

    return-object p0
.end method
