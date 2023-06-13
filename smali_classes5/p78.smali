.class public final Lp78;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LP58;

.field public final b:Ljava/lang/Integer;

.field public final c:Ls19;


# direct methods
.method public synthetic constructor <init>(LV48;La78;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LV48;->d(LV48;)LP58;

    move-result-object p2

    iput-object p2, p0, Lp78;->a:LP58;

    invoke-static {p1}, LV48;->g(LV48;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, Lp78;->b:Ljava/lang/Integer;

    invoke-static {p1}, LV48;->f(LV48;)Ls19;

    move-result-object p1

    iput-object p1, p0, Lp78;->c:Ls19;

    return-void
.end method


# virtual methods
.method public final a()LP58;
    .locals 1
    .annotation build LD18;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lp78;->a:LP58;

    return-object v0
.end method

.method public final b()Ls19;
    .locals 1
    .annotation build LD18;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lp78;->c:Ls19;

    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1
    .annotation build LD18;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lp78;->b:Ljava/lang/Integer;

    return-object v0
.end method
