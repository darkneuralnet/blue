.class public final synthetic Lpp6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO80$c;


# instance fields
.field public final synthetic a:Lrp6;

.field public final synthetic b:Landroidx/camera/core/o;

.field public final synthetic c:Lr46;

.field public final synthetic d:Lyp6;

.field public final synthetic e:LFP2;


# direct methods
.method public synthetic constructor <init>(Lrp6;Landroidx/camera/core/o;Lr46;Lyp6;LFP2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp6;->a:Lrp6;

    iput-object p2, p0, Lpp6;->b:Landroidx/camera/core/o;

    iput-object p3, p0, Lpp6;->c:Lr46;

    iput-object p4, p0, Lpp6;->d:Lyp6;

    iput-object p5, p0, Lpp6;->e:LFP2;

    return-void
.end method


# virtual methods
.method public final a(LO80$a;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lpp6;->a:Lrp6;

    iget-object v1, p0, Lpp6;->b:Landroidx/camera/core/o;

    iget-object v2, p0, Lpp6;->c:Lr46;

    iget-object v3, p0, Lpp6;->d:Lyp6;

    iget-object v4, p0, Lpp6;->e:LFP2;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lrp6;->d(Lrp6;Landroidx/camera/core/o;Lr46;Lyp6;LFP2;LO80$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
