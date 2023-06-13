.class public Landroidx/fragment/app/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/o;->a(Landroidx/fragment/app/o$e$c;Landroidx/fragment/app/o$e$b;Landroidx/fragment/app/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroidx/fragment/app/o$d;

.field public final synthetic c:Landroidx/fragment/app/o;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/o;Landroidx/fragment/app/o$d;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/o$b;->c:Landroidx/fragment/app/o;

    iput-object p2, p0, Landroidx/fragment/app/o$b;->b:Landroidx/fragment/app/o$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/o$b;->c:Landroidx/fragment/app/o;

    iget-object v0, v0, Landroidx/fragment/app/o;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/o$b;->b:Landroidx/fragment/app/o$d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/fragment/app/o$b;->c:Landroidx/fragment/app/o;

    iget-object v0, v0, Landroidx/fragment/app/o;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/o$b;->b:Landroidx/fragment/app/o$d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
