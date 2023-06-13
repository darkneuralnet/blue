.class public final LQb8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lob8;

.field public final b:Ljava/lang/Integer;

.field public final c:La09;


# direct methods
.method public synthetic constructor <init>(Lxa8;LOb8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lxa8;->d(Lxa8;)Lob8;

    move-result-object p2

    iput-object p2, p0, LQb8;->a:Lob8;

    invoke-static {p1}, Lxa8;->g(Lxa8;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p0, LQb8;->b:Ljava/lang/Integer;

    invoke-static {p1}, Lxa8;->f(Lxa8;)La09;

    move-result-object p1

    iput-object p1, p0, LQb8;->c:La09;

    return-void
.end method


# virtual methods
.method public final a()Lob8;
    .locals 1
    .annotation build LKY7;
        zza = 0x1
    .end annotation

    iget-object v0, p0, LQb8;->a:Lob8;

    return-object v0
.end method

.method public final b()La09;
    .locals 1
    .annotation build LKY7;
        zza = 0x3
    .end annotation

    iget-object v0, p0, LQb8;->c:La09;

    return-object v0
.end method

.method public final c()Ljava/lang/Integer;
    .locals 1
    .annotation build LKY7;
        zza = 0x2
    .end annotation

    iget-object v0, p0, LQb8;->b:Ljava/lang/Integer;

    return-object v0
.end method
