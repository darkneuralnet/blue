.class public LPM2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljy5$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPM2;-><init>(LPM2$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LPM2;


# direct methods
.method public constructor <init>(LPM2;)V
    .locals 0

    iput-object p1, p0, LPM2$a;->a:LPM2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lvy5;Landroid/graphics/Matrix;I)V
    .locals 3

    iget-object v0, p0, LPM2$a;->a:LPM2;

    invoke-static {v0}, LPM2;->b(LPM2;)Ljava/util/BitSet;

    move-result-object v0

    add-int/lit8 v1, p3, 0x4

    invoke-virtual {p1}, Lvy5;->e()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    iget-object v0, p0, LPM2$a;->a:LPM2;

    invoke-static {v0}, LPM2;->d(LPM2;)[Lvy5$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lvy5;->f(Landroid/graphics/Matrix;)Lvy5$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method

.method public b(Lvy5;Landroid/graphics/Matrix;I)V
    .locals 2

    iget-object v0, p0, LPM2$a;->a:LPM2;

    invoke-static {v0}, LPM2;->b(LPM2;)Ljava/util/BitSet;

    move-result-object v0

    invoke-virtual {p1}, Lvy5;->e()Z

    move-result v1

    invoke-virtual {v0, p3, v1}, Ljava/util/BitSet;->set(IZ)V

    iget-object v0, p0, LPM2$a;->a:LPM2;

    invoke-static {v0}, LPM2;->c(LPM2;)[Lvy5$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lvy5;->f(Landroid/graphics/Matrix;)Lvy5$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method
