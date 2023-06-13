.class public final LBm7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:LvU8;

.field public final c:LvU8;

.field public final d:LvU8;

.field public final e:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Lym7;LAm7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lym7;->k(Lym7;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, LBm7;->a:Ljava/lang/Long;

    invoke-static {p1}, Lym7;->a(Lym7;)LvU8;

    move-result-object p2

    iput-object p2, p0, LBm7;->b:LvU8;

    invoke-static {p1}, Lym7;->b(Lym7;)LvU8;

    move-result-object p2

    iput-object p2, p0, LBm7;->c:LvU8;

    invoke-static {p1}, Lym7;->c(Lym7;)LvU8;

    move-result-object p2

    iput-object p2, p0, LBm7;->d:LvU8;

    invoke-static {p1}, Lym7;->j(Lym7;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LBm7;->e:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a()LvU8;
    .locals 1
    .annotation build Lt29;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LBm7;->b:LvU8;

    return-object v0
.end method

.method public final b()LvU8;
    .locals 1
    .annotation build Lt29;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LBm7;->c:LvU8;

    return-object v0
.end method

.method public final c()LvU8;
    .locals 1
    .annotation build Lt29;
        zza = 0x4
    .end annotation

    iget-object v0, p0, LBm7;->d:LvU8;

    return-object v0
.end method

.method public final d()Ljava/lang/Integer;
    .locals 1
    .annotation build Lt29;
        zza = 0x5
    .end annotation

    iget-object v0, p0, LBm7;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public final e()Ljava/lang/Long;
    .locals 1
    .annotation build Lt29;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LBm7;->a:Ljava/lang/Long;

    return-object v0
.end method
