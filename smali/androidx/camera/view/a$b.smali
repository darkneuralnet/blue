.class public Landroidx/camera/view/a$b;
.super Lpa0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/view/a;->m(LJb0;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LO80$a;

.field public final synthetic b:LJb0;

.field public final synthetic c:Landroidx/camera/view/a;


# direct methods
.method public constructor <init>(Landroidx/camera/view/a;LO80$a;LJb0;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/view/a$b;->c:Landroidx/camera/view/a;

    iput-object p2, p0, Landroidx/camera/view/a$b;->a:LO80$a;

    iput-object p3, p0, Landroidx/camera/view/a$b;->b:LJb0;

    invoke-direct {p0}, Lpa0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lxa0;)V
    .locals 1

    iget-object p1, p0, Landroidx/camera/view/a$b;->a:LO80$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/camera/view/a$b;->b:LJb0;

    check-cast p1, LKb0;

    invoke-interface {p1, p0}, LKb0;->d(Lpa0;)V

    return-void
.end method
