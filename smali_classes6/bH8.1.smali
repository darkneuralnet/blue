.class public final LbH8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LbH8;

.field public final b:LJf7;

.field public final c:LJf7;

.field public final d:LJf7;

.field public final e:LJf7;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;LwA8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, LbH8;->a:LbH8;

    invoke-static {p1}, LCy9;->a(Ljava/lang/Object;)LCx9;

    move-result-object p1

    iput-object p1, p0, LbH8;->b:LJf7;

    invoke-static {}, Ls99;->a()Lsd9;

    move-result-object p2

    invoke-static {p2}, Lyw9;->a(LJf7;)LJf7;

    move-result-object p2

    iput-object p2, p0, LbH8;->c:LJf7;

    new-instance v0, LVt9;

    invoke-direct {v0, p1, p2}, LVt9;-><init>(LJf7;LJf7;)V

    invoke-static {v0}, Lyw9;->a(LJf7;)LJf7;

    move-result-object p1

    iput-object p1, p0, LbH8;->d:LJf7;

    new-instance p2, LS49;

    invoke-direct {p2, p1}, LS49;-><init>(LJf7;)V

    invoke-static {p2}, Lyw9;->a(LJf7;)LJf7;

    move-result-object p1

    iput-object p1, p0, LbH8;->e:LJf7;

    return-void
.end method


# virtual methods
.method public final a()LS52;
    .locals 1

    iget-object v0, p0, LbH8;->e:LJf7;

    invoke-interface {v0}, LJf7;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS52;

    return-object v0
.end method
