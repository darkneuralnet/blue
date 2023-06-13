.class public final Laj$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LNk1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laj;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LMk1;)V
    .locals 1

    sget-object p1, LCk1$b;->h:LCk1$b;

    new-instance v0, Laj$a$a;

    invoke-direct {v0, p0}, Laj$a$a;-><init>(Laj$a;)V

    invoke-static {p1, v0}, LCk1;->a(LCk1$b;LCk1$a;)V

    sget-object p1, LCk1$b;->g:LCk1$b;

    new-instance v0, Laj$a$b;

    invoke-direct {v0, p0}, Laj$a$b;-><init>(Laj$a;)V

    invoke-static {p1, v0}, LCk1;->a(LCk1$b;LCk1$a;)V

    sget-object p1, LCk1$b;->i:LCk1$b;

    new-instance v0, Laj$a$c;

    invoke-direct {v0, p0}, Laj$a$c;-><init>(Laj$a;)V

    invoke-static {p1, v0}, LCk1;->a(LCk1$b;LCk1$a;)V

    sget-object p1, LCk1$b;->m:LCk1$b;

    new-instance v0, Laj$a$d;

    invoke-direct {v0, p0}, Laj$a$d;-><init>(Laj$a;)V

    invoke-static {p1, v0}, LCk1;->a(LCk1$b;LCk1$a;)V

    sget-object p1, LCk1$b;->p:LCk1$b;

    new-instance v0, Laj$a$e;

    invoke-direct {v0, p0}, Laj$a$e;-><init>(Laj$a;)V

    invoke-static {p1, v0}, LCk1;->a(LCk1$b;LCk1$a;)V

    return-void
.end method

.method public onError()V
    .locals 0

    return-void
.end method
