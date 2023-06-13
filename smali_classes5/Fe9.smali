.class public final LFe9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv29;

.field public final b:Lo19;

.field public final c:Ljf9;


# direct methods
.method public synthetic constructor <init>(Lre9;Lye9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lre9;->b(Lre9;)Lv29;

    move-result-object p2

    iput-object p2, p0, LFe9;->a:Lv29;

    invoke-static {p1}, Lre9;->a(Lre9;)Lo19;

    move-result-object p2

    iput-object p2, p0, LFe9;->b:Lo19;

    invoke-static {p1}, Lre9;->g(Lre9;)Ljf9;

    move-result-object p1

    iput-object p1, p0, LFe9;->c:Ljf9;

    return-void
.end method


# virtual methods
.method public final a()Lo19;
    .locals 1
    .annotation build LKY7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LFe9;->b:Lo19;

    return-object v0
.end method

.method public final b()Lv29;
    .locals 1
    .annotation build LKY7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LFe9;->a:Lv29;

    return-object v0
.end method

.method public final c()Ljf9;
    .locals 1
    .annotation build LKY7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LFe9;->c:Ljf9;

    return-object v0
.end method
