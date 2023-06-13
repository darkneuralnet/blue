.class public LVt6$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUe3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVt6;->c(Landroid/view/View;LVt6$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:LVt6$e;

.field public final synthetic c:LVt6$f;


# direct methods
.method public constructor <init>(LVt6$e;LVt6$f;)V
    .locals 0

    iput-object p1, p0, LVt6$c;->b:LVt6$e;

    iput-object p2, p0, LVt6$c;->c:LVt6$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;LDB6;)LDB6;
    .locals 3

    iget-object v0, p0, LVt6$c;->b:LVt6$e;

    new-instance v1, LVt6$f;

    iget-object v2, p0, LVt6$c;->c:LVt6$f;

    invoke-direct {v1, v2}, LVt6$f;-><init>(LVt6$f;)V

    invoke-interface {v0, p1, p2, v1}, LVt6$e;->a(Landroid/view/View;LDB6;LVt6$f;)LDB6;

    move-result-object p1

    return-object p1
.end method
