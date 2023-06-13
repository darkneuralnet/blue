.class public Loy5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LzA0;


# instance fields
.field public final a:Z

.field public final b:Landroid/graphics/Path$FillType;

.field public final c:Ljava/lang/String;

.field public final d:Lpe;

.field public final e:Lse;

.field public final f:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLandroid/graphics/Path$FillType;Lpe;Lse;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loy5;->c:Ljava/lang/String;

    iput-boolean p2, p0, Loy5;->a:Z

    iput-object p3, p0, Loy5;->b:Landroid/graphics/Path$FillType;

    iput-object p4, p0, Loy5;->d:Lpe;

    iput-object p5, p0, Loy5;->e:Lse;

    iput-boolean p6, p0, Loy5;->f:Z

    return-void
.end method


# virtual methods
.method public a(LRD2;LrD2;LqB;)LVz0;
    .locals 0

    new-instance p2, LAl1;

    invoke-direct {p2, p1, p3, p0}, LAl1;-><init>(LRD2;LqB;Loy5;)V

    return-object p2
.end method

.method public b()Lpe;
    .locals 1

    iget-object v0, p0, Loy5;->d:Lpe;

    return-object v0
.end method

.method public c()Landroid/graphics/Path$FillType;
    .locals 1

    iget-object v0, p0, Loy5;->b:Landroid/graphics/Path$FillType;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Loy5;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lse;
    .locals 1

    iget-object v0, p0, Loy5;->e:Lse;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Loy5;->f:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ShapeFill{color=, fillEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Loy5;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
