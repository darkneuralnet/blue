.class public final LC49;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LGg9;

.field public final b:Le49;

.field public final c:LM39;

.field public final d:LFe9;

.field public final e:Lje9;

.field public final f:LQb8;


# direct methods
.method public synthetic constructor <init>(Lm49;Lu49;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lm49;->m(Lm49;)LGg9;

    move-result-object p2

    iput-object p2, p0, LC49;->a:LGg9;

    invoke-static {p1}, Lm49;->c(Lm49;)Le49;

    move-result-object p2

    iput-object p2, p0, LC49;->b:Le49;

    invoke-static {p1}, Lm49;->b(Lm49;)LM39;

    move-result-object p2

    iput-object p2, p0, LC49;->c:LM39;

    invoke-static {p1}, Lm49;->l(Lm49;)LFe9;

    move-result-object p2

    iput-object p2, p0, LC49;->d:LFe9;

    invoke-static {p1}, Lm49;->k(Lm49;)Lje9;

    move-result-object p2

    iput-object p2, p0, LC49;->e:Lje9;

    invoke-static {p1}, Lm49;->a(Lm49;)LQb8;

    move-result-object p1

    iput-object p1, p0, LC49;->f:LQb8;

    return-void
.end method


# virtual methods
.method public final a()LQb8;
    .locals 1
    .annotation build LKY7;
        zza = 0x24
    .end annotation

    iget-object v0, p0, LC49;->f:LQb8;

    return-object v0
.end method

.method public final b()LM39;
    .locals 1
    .annotation build LKY7;
        zza = 0x3d
    .end annotation

    iget-object v0, p0, LC49;->c:LM39;

    return-object v0
.end method

.method public final c()Le49;
    .locals 1
    .annotation build LKY7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LC49;->b:Le49;

    return-object v0
.end method

.method public final d()Lje9;
    .locals 1
    .annotation build LKY7;
        zza = 0x4f
    .end annotation

    iget-object v0, p0, LC49;->e:Lje9;

    return-object v0
.end method

.method public final e()LFe9;
    .locals 1
    .annotation build LKY7;
        zza = 0x6
    .end annotation

    iget-object v0, p0, LC49;->d:LFe9;

    return-object v0
.end method

.method public final f()LGg9;
    .locals 1
    .annotation build LKY7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LC49;->a:LGg9;

    return-object v0
.end method
