.class public final LY39;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:LG59;

.field public final c:Ljava/lang/Boolean;

.field public final d:Ljava/lang/Boolean;

.field public final e:Ljava/lang/Boolean;


# direct methods
.method public synthetic constructor <init>(LG39;LP39;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LG39;->k(LG39;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, LY39;->a:Ljava/lang/Long;

    invoke-static {p1}, LG39;->g(LG39;)LG59;

    move-result-object p2

    iput-object p2, p0, LY39;->b:LG59;

    invoke-static {p1}, LG39;->j(LG39;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LY39;->c:Ljava/lang/Boolean;

    invoke-static {p1}, LG39;->h(LG39;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, LY39;->d:Ljava/lang/Boolean;

    invoke-static {p1}, LG39;->i(LG39;)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, LY39;->e:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a()LG59;
    .locals 1
    .annotation build LD18;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LY39;->b:LG59;

    return-object v0
.end method

.method public final b()Ljava/lang/Boolean;
    .locals 1
    .annotation build LD18;
        zza = 0x4
    .end annotation

    iget-object v0, p0, LY39;->d:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final c()Ljava/lang/Boolean;
    .locals 1
    .annotation build LD18;
        zza = 0x5
    .end annotation

    iget-object v0, p0, LY39;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final d()Ljava/lang/Boolean;
    .locals 1
    .annotation build LD18;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LY39;->c:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final e()Ljava/lang/Long;
    .locals 1
    .annotation build LD18;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LY39;->a:Ljava/lang/Long;

    return-object v0
.end method
