.class public final Lv29;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Long;

.field public final b:LV39;

.field public final c:Ljava/lang/Boolean;

.field public final d:Ljava/lang/Boolean;

.field public final e:Ljava/lang/Boolean;


# direct methods
.method public synthetic constructor <init>(Lb29;Ll29;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lb29;->k(Lb29;)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, p0, Lv29;->a:Ljava/lang/Long;

    invoke-static {p1}, Lb29;->g(Lb29;)LV39;

    move-result-object p2

    iput-object p2, p0, Lv29;->b:LV39;

    invoke-static {p1}, Lb29;->j(Lb29;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lv29;->c:Ljava/lang/Boolean;

    invoke-static {p1}, Lb29;->h(Lb29;)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lv29;->d:Ljava/lang/Boolean;

    invoke-static {p1}, Lb29;->i(Lb29;)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lv29;->e:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a()LV39;
    .locals 1
    .annotation build LKY7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, Lv29;->b:LV39;

    return-object v0
.end method

.method public final b()Ljava/lang/Boolean;
    .locals 1
    .annotation build LKY7;
        zza = 0x4
    .end annotation

    iget-object v0, p0, Lv29;->d:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final c()Ljava/lang/Boolean;
    .locals 1
    .annotation build LKY7;
        zza = 0x5
    .end annotation

    iget-object v0, p0, Lv29;->e:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final d()Ljava/lang/Boolean;
    .locals 1
    .annotation build LKY7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, Lv29;->c:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final e()Ljava/lang/Long;
    .locals 1
    .annotation build LKY7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lv29;->a:Ljava/lang/Long;

    return-object v0
.end method
