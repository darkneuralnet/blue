.class public Landroidx/emoji2/text/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/emoji2/text/d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/emoji2/text/d$c<",
        "Lve6;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Lve6;

.field public final b:Landroidx/emoji2/text/c$j;


# direct methods
.method public constructor <init>(Lve6;Landroidx/emoji2/text/c$j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/d$b;->a:Lve6;

    iput-object p2, p0, Landroidx/emoji2/text/d$b;->b:Landroidx/emoji2/text/c$j;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/emoji2/text/d$b;->c()Lve6;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/CharSequence;IILxc6;)Z
    .locals 3

    invoke-virtual {p4}, Lxc6;->k()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/emoji2/text/d$b;->a:Lve6;

    if-nez v0, :cond_2

    new-instance v0, Lve6;

    instance-of v2, p1, Landroid/text/Spannable;

    if-eqz v2, :cond_1

    check-cast p1, Landroid/text/Spannable;

    goto :goto_0

    :cond_1
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object p1, v2

    :goto_0
    invoke-direct {v0, p1}, Lve6;-><init>(Landroid/text/Spannable;)V

    iput-object v0, p0, Landroidx/emoji2/text/d$b;->a:Lve6;

    :cond_2
    iget-object p1, p0, Landroidx/emoji2/text/d$b;->b:Landroidx/emoji2/text/c$j;

    invoke-interface {p1, p4}, Landroidx/emoji2/text/c$j;->a(Lxc6;)LGa1;

    move-result-object p1

    iget-object p4, p0, Landroidx/emoji2/text/d$b;->a:Lve6;

    const/16 v0, 0x21

    invoke-virtual {p4, p1, p2, p3, v0}, Lve6;->setSpan(Ljava/lang/Object;III)V

    return v1
.end method

.method public c()Lve6;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/d$b;->a:Lve6;

    return-object v0
.end method
