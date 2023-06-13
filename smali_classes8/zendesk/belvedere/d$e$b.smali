.class public Lzendesk/belvedere/d$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/belvedere/SelectableView$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/belvedere/d$e;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lzendesk/belvedere/d$e;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/d$e;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/d$e$b;->a:Lzendesk/belvedere/d$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)Z
    .locals 1

    iget-object p1, p0, Lzendesk/belvedere/d$e$b;->a:Lzendesk/belvedere/d$e;

    invoke-static {p1}, Lzendesk/belvedere/d$e;->h(Lzendesk/belvedere/d$e;)Lzendesk/belvedere/c$b;

    move-result-object p1

    iget-object v0, p0, Lzendesk/belvedere/d$e$b;->a:Lzendesk/belvedere/d$e;

    invoke-interface {p1, v0}, Lzendesk/belvedere/c$b;->a(Lzendesk/belvedere/d$b;)Z

    move-result p1

    return p1
.end method
