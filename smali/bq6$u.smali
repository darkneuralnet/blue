.class public final Lbq6$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/OnReceiveContentListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbq6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "u"
.end annotation


# instance fields
.field public final a:Leh3;


# direct methods
.method public constructor <init>(Leh3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbq6$u;->a:Leh3;

    return-void
.end method


# virtual methods
.method public onReceiveContent(Landroid/view/View;Landroid/view/ContentInfo;)Landroid/view/ContentInfo;
    .locals 2

    invoke-static {p2}, LmA0;->g(Landroid/view/ContentInfo;)LmA0;

    move-result-object v0

    iget-object v1, p0, Lbq6$u;->a:Leh3;

    invoke-interface {v1, p1, v0}, Leh3;->a(Landroid/view/View;LmA0;)LmA0;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-ne p1, v0, :cond_1

    return-object p2

    :cond_1
    invoke-virtual {p1}, LmA0;->f()Landroid/view/ContentInfo;

    move-result-object p1

    return-object p1
.end method
