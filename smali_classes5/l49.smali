.class public final Ll49;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LX29;

.field public final b:LcW8;

.field public final c:Ljava/lang/Long;

.field public final d:Lbw7;


# direct methods
.method public synthetic constructor <init>(LU39;Ld49;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LU39;->c(LU39;)LX29;

    move-result-object p2

    iput-object p2, p0, Ll49;->a:LX29;

    invoke-static {p1}, LU39;->b(LU39;)LcW8;

    move-result-object p2

    iput-object p2, p0, Ll49;->b:LcW8;

    invoke-static {p1}, LU39;->i(LU39;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, Ll49;->c:Ljava/lang/Long;

    invoke-static {p1}, LU39;->a(LU39;)Lbw7;

    move-result-object p1

    iput-object p1, p0, Ll49;->d:Lbw7;

    return-void
.end method


# virtual methods
.method public final a()Lbw7;
    .locals 1
    .annotation build LfR7;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Ll49;->d:Lbw7;

    return-object v0
.end method

.method public final b()LcW8;
    .locals 1
    .annotation build LfR7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Ll49;->b:LcW8;

    return-object v0
.end method

.method public final c()LX29;
    .locals 1
    .annotation build LfR7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Ll49;->a:LX29;

    return-object v0
.end method

.method public final d()Ljava/lang/Long;
    .locals 1
    .annotation build LfR7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Ll49;->c:Ljava/lang/Long;

    return-object v0
.end method
