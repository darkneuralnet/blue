.class public final Lzendesk/belvedere/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/belvedere/d;->a(Lzendesk/belvedere/c$b;)Lzendesk/belvedere/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lzendesk/belvedere/c$b;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/c$b;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/d$a;->b:Lzendesk/belvedere/c$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lzendesk/belvedere/d$a;->b:Lzendesk/belvedere/c$b;

    invoke-interface {p1}, Lzendesk/belvedere/c$b;->b()V

    return-void
.end method
