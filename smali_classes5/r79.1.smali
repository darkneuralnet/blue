.class public final Lr79;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:Lbw7;

.field public final c:Lbw7;

.field public final d:Lbw7;

.field public final e:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(LV69;Lj79;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LV69;->k(LV69;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, Lr79;->a:Ljava/lang/Long;

    invoke-static {p1}, LV69;->a(LV69;)Lbw7;

    move-result-object p2

    iput-object p2, p0, Lr79;->b:Lbw7;

    invoke-static {p1}, LV69;->b(LV69;)Lbw7;

    move-result-object p2

    iput-object p2, p0, Lr79;->c:Lbw7;

    invoke-static {p1}, LV69;->c(LV69;)Lbw7;

    move-result-object p2

    iput-object p2, p0, Lr79;->d:Lbw7;

    invoke-static {p1}, LV69;->j(LV69;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lr79;->e:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()Lbw7;
    .locals 1
    .annotation build LfR7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lr79;->b:Lbw7;

    return-object v0
.end method

.method public final b()Lbw7;
    .locals 1
    .annotation build LfR7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lr79;->c:Lbw7;

    return-object v0
.end method

.method public final c()Lbw7;
    .locals 1
    .annotation build LfR7;
        zza = 0x4
    .end annotation

    iget-object v0, p0, Lr79;->d:Lbw7;

    return-object v0
.end method

.method public final d()Ljava/lang/Integer;
    .locals 1
    .annotation build LfR7;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Lr79;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public final e()Ljava/lang/Long;
    .locals 1
    .annotation build LfR7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lr79;->a:Ljava/lang/Long;

    return-object v0
.end method
