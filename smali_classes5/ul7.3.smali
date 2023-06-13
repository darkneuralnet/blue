.class public final Lul7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LEm7;

.field public final b:LWk7;

.field public final c:LBm7;

.field public final d:Ldz9;


# direct methods
.method public synthetic constructor <init>(LXk7;LYk7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LXk7;->i(LXk7;)LEm7;

    move-result-object p2

    iput-object p2, p0, Lul7;->a:LEm7;

    invoke-static {p1}, LXk7;->b(LXk7;)LWk7;

    move-result-object p2

    iput-object p2, p0, Lul7;->b:LWk7;

    invoke-static {p1}, LXk7;->h(LXk7;)LBm7;

    move-result-object p2

    iput-object p2, p0, Lul7;->c:LBm7;

    invoke-static {p1}, LXk7;->a(LXk7;)Ldz9;

    move-result-object p1

    iput-object p1, p0, Lul7;->d:Ldz9;

    return-void
.end method


# virtual methods
.method public final a()Ldz9;
    .locals 1
    .annotation build Lt29;
        zza = 0x39
    .end annotation

    iget-object v0, p0, Lul7;->d:Ldz9;

    return-object v0
.end method

.method public final b()LWk7;
    .locals 1
    .annotation build Lt29;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lul7;->b:LWk7;

    return-object v0
.end method

.method public final c()LBm7;
    .locals 1
    .annotation build Lt29;
        zza = 0x2a
    .end annotation

    iget-object v0, p0, Lul7;->c:LBm7;

    return-object v0
.end method

.method public final d()LEm7;
    .locals 1
    .annotation build Lt29;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lul7;->a:LEm7;

    return-object v0
.end method
