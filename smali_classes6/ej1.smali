.class public Lej1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lej1;->a:I

    iput-object p2, p0, Lej1;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    const-string v0, "FaceContour"

    invoke-static {v0}, Ldv9;->a(Ljava/lang/String;)LHt9;

    move-result-object v0

    const-string v1, "type"

    iget v2, p0, Lej1;->a:I

    invoke-virtual {v0, v1, v2}, LHt9;->b(Ljava/lang/String;I)LHt9;

    iget-object v1, p0, Lej1;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "points"

    invoke-virtual {v0, v2, v1}, LHt9;->c(Ljava/lang/String;Ljava/lang/Object;)LHt9;

    invoke-virtual {v0}, LHt9;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
