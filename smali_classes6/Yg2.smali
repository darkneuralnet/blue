.class public final LYg2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lbh2;

.field public final b:LIy;

.field public final c:LIy;

.field public final d:LIy;

.field public final e:LIy;


# direct methods
.method public constructor <init>(Lbh2;LIy;LIy;LIy;LIy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYg2;->a:Lbh2;

    iput-object p2, p0, LYg2;->b:LIy;

    iput-object p3, p0, LYg2;->c:LIy;

    if-eqz p4, :cond_0

    iput-object p4, p0, LYg2;->d:LIy;

    iput-object p5, p0, LYg2;->e:LIy;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The cipher text must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()LIy;
    .locals 1

    iget-object v0, p0, LYg2;->e:LIy;

    return-object v0
.end method

.method public b()LIy;
    .locals 1

    iget-object v0, p0, LYg2;->d:LIy;

    return-object v0
.end method

.method public c()LIy;
    .locals 1

    iget-object v0, p0, LYg2;->b:LIy;

    return-object v0
.end method

.method public d()Lbh2;
    .locals 1

    iget-object v0, p0, LYg2;->a:Lbh2;

    return-object v0
.end method

.method public e()LIy;
    .locals 1

    iget-object v0, p0, LYg2;->c:LIy;

    return-object v0
.end method
